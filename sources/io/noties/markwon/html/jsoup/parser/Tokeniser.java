package io.noties.markwon.html.jsoup.parser;

import io.noties.markwon.html.jsoup.helper.Validate;
import io.noties.markwon.html.jsoup.nodes.CommonMarkEntities;
import io.noties.markwon.html.jsoup.parser.Token;
import java.util.Arrays;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes3.dex */
public final class Tokeniser {
    private static final char[] notCharRefCharsSorted;
    static final int[] win1252Extensions = {8364, NotificationCenter.messageTranslating, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, NotificationCenter.botForumDraftDelete, NotificationCenter.fileLoadProgressChanged, 381, NotificationCenter.fileLoadFailed, NotificationCenter.filePreparingStarted, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, NotificationCenter.tlSchemeParseException, NotificationCenter.recordStopped, 382, 376};
    private Token emitPending;
    private final ParseErrorList errors;
    private String lastStartTag;
    private final CharacterReader reader;
    Token.Tag tagPending;
    private TokeniserState state = TokeniserState.Data;
    private boolean isEmitPending = false;
    private String charsString = null;
    private StringBuilder charsBuilder = new StringBuilder(1024);
    StringBuilder dataBuffer = new StringBuilder(1024);
    Token.StartTag startPending = new Token.StartTag();
    Token.EndTag endPending = new Token.EndTag();
    Token.Character charPending = new Token.Character();
    Token.Doctype doctypePending = new Token.Doctype();
    Token.Comment commentPending = new Token.Comment();
    private final int[] codepointHolder = new int[1];
    private final int[] multipointHolder = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        notCharRefCharsSorted = cArr;
        Arrays.sort(cArr);
    }

    public Tokeniser(CharacterReader characterReader, ParseErrorList parseErrorList) {
        this.reader = characterReader;
        this.errors = parseErrorList;
    }

    public Token read() {
        while (!this.isEmitPending) {
            this.state.read(this, this.reader);
        }
        if (this.charsBuilder.length() > 0) {
            String sb = this.charsBuilder.toString();
            StringBuilder sb2 = this.charsBuilder;
            sb2.delete(0, sb2.length());
            this.charsString = null;
            return this.charPending.data(sb);
        }
        String str = this.charsString;
        if (str != null) {
            Token.Character data = this.charPending.data(str);
            this.charsString = null;
            return data;
        }
        this.isEmitPending = false;
        return this.emitPending;
    }

    void emit(Token token) {
        Validate.isFalse(this.isEmitPending, "There is an unread token pending!");
        this.emitPending = token;
        this.isEmitPending = true;
        Token.TokenType tokenType = token.type;
        if (tokenType == Token.TokenType.StartTag) {
            this.lastStartTag = ((Token.StartTag) token).tagName;
        } else {
            if (tokenType != Token.TokenType.EndTag || ((Token.EndTag) token).attributes == null) {
                return;
            }
            error("Attributes incorrectly present on end tag");
        }
    }

    void emit(String str) {
        if (this.charsString == null) {
            this.charsString = str;
            return;
        }
        if (this.charsBuilder.length() == 0) {
            this.charsBuilder.append(this.charsString);
        }
        this.charsBuilder.append(str);
    }

    void emit(int[] iArr) {
        emit(new String(iArr, 0, iArr.length));
    }

    void emit(char c) {
        emit(String.valueOf(c));
    }

    void transition(TokeniserState tokeniserState) {
        this.state = tokeniserState;
    }

    void advanceTransition(TokeniserState tokeniserState) {
        this.reader.advance();
        this.state = tokeniserState;
    }

    int[] consumeCharacterReference(Character ch, boolean z) {
        int i;
        if (this.reader.isEmpty()) {
            return null;
        }
        if ((ch != null && ch.charValue() == this.reader.current()) || this.reader.matchesAnySorted(notCharRefCharsSorted)) {
            return null;
        }
        int[] iArr = this.codepointHolder;
        this.reader.mark();
        if (this.reader.matchConsume("#")) {
            boolean matchConsumeIgnoreCase = this.reader.matchConsumeIgnoreCase("X");
            CharacterReader characterReader = this.reader;
            String consumeHexSequence = matchConsumeIgnoreCase ? characterReader.consumeHexSequence() : characterReader.consumeDigitSequence();
            if (consumeHexSequence.length() == 0) {
                characterReferenceError("numeric reference with no numerals");
                this.reader.rewindToMark();
                return null;
            }
            if (!this.reader.matchConsume(";")) {
                characterReferenceError("missing semicolon");
            }
            try {
                i = Integer.valueOf(consumeHexSequence, matchConsumeIgnoreCase ? 16 : 10).intValue();
            } catch (NumberFormatException unused) {
                i = -1;
            }
            if (i == -1 || ((i >= 55296 && i <= 57343) || i > 1114111)) {
                characterReferenceError("character outside of valid range");
                iArr[0] = 65533;
                return iArr;
            }
            if (i >= 128) {
                int[] iArr2 = win1252Extensions;
                if (i < iArr2.length + 128) {
                    characterReferenceError("character is not a valid unicode code point");
                    i = iArr2[i - 128];
                }
            }
            iArr[0] = i;
            return iArr;
        }
        String consumeLetterThenDigitSequence = this.reader.consumeLetterThenDigitSequence();
        boolean matches = this.reader.matches(';');
        if (!CommonMarkEntities.isNamedEntity(consumeLetterThenDigitSequence) || !matches) {
            this.reader.rewindToMark();
            if (matches) {
                characterReferenceError(String.format("invalid named referenece '%s'", consumeLetterThenDigitSequence));
            }
            return null;
        }
        if (z && (this.reader.matchesLetter() || this.reader.matchesDigit() || this.reader.matchesAny('=', '-', '_'))) {
            this.reader.rewindToMark();
            return null;
        }
        if (!this.reader.matchConsume(";")) {
            characterReferenceError("missing semicolon");
        }
        int codepointsForName = CommonMarkEntities.codepointsForName(consumeLetterThenDigitSequence, this.multipointHolder);
        if (codepointsForName == 1) {
            iArr[0] = this.multipointHolder[0];
            return iArr;
        }
        if (codepointsForName == 2) {
            return this.multipointHolder;
        }
        Validate.fail("Unexpected characters returned for " + consumeLetterThenDigitSequence);
        return this.multipointHolder;
    }

    Token.Tag createTagPending(boolean z) {
        Token.Tag reset = z ? this.startPending.reset() : this.endPending.reset();
        this.tagPending = reset;
        return reset;
    }

    void emitTagPending() {
        this.tagPending.finaliseTag();
        emit(this.tagPending);
    }

    void createCommentPending() {
        this.commentPending.reset();
    }

    void emitCommentPending() {
        emit(this.commentPending);
    }

    void createDoctypePending() {
        this.doctypePending.reset();
    }

    void emitDoctypePending() {
        emit(this.doctypePending);
    }

    void createTempBuffer() {
        Token.reset(this.dataBuffer);
    }

    boolean isAppropriateEndTagToken() {
        return this.lastStartTag != null && this.tagPending.name().equalsIgnoreCase(this.lastStartTag);
    }

    String appropriateEndTagName() {
        return this.lastStartTag;
    }

    void error(TokeniserState tokeniserState) {
        if (this.errors.canAddError()) {
            this.errors.add(new ParseError(this.reader.pos(), "Unexpected character '%s' in input state [%s]", Character.valueOf(this.reader.current()), tokeniserState));
        }
    }

    void eofError(TokeniserState tokeniserState) {
        if (this.errors.canAddError()) {
            this.errors.add(new ParseError(this.reader.pos(), "Unexpectedly reached end of file (EOF) in input state [%s]", tokeniserState));
        }
    }

    private void characterReferenceError(String str) {
        if (this.errors.canAddError()) {
            this.errors.add(new ParseError(this.reader.pos(), "Invalid character reference: %s", str));
        }
    }

    void error(String str) {
        if (this.errors.canAddError()) {
            this.errors.add(new ParseError(this.reader.pos(), str));
        }
    }
}
