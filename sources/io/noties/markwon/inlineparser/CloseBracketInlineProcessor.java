package io.noties.markwon.inlineparser;

import java.util.regex.Pattern;
import org.commonmark.internal.Bracket;
import org.commonmark.internal.util.Escaping;
import org.commonmark.node.Image;
import org.commonmark.node.Link;
import org.commonmark.node.LinkReferenceDefinition;
import org.commonmark.node.Node;

/* loaded from: classes3.dex */
public class CloseBracketInlineProcessor extends InlineProcessor {
    private static final Pattern WHITESPACE = MarkwonInlineParser.WHITESPACE;

    @Override // io.noties.markwon.inlineparser.InlineProcessor
    public char specialCharacter() {
        return ']';
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    @Override // io.noties.markwon.inlineparser.InlineProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Node parse() {
        String str;
        String str2;
        boolean z;
        boolean z2 = true;
        int i = this.index + 1;
        this.index = i;
        Bracket lastBracket = lastBracket();
        if (lastBracket == null) {
            return text("]");
        }
        if (!lastBracket.allowed) {
            removeLastBracket();
            return text("]");
        }
        String str3 = null;
        if (peek() == '(') {
            this.index++;
            spnl();
            str = parseLinkDestination();
            if (str != null) {
                spnl();
                Pattern pattern = WHITESPACE;
                String str4 = this.input;
                int i2 = this.index;
                if (pattern.matcher(str4.substring(i2 - 1, i2)).matches()) {
                    str2 = parseLinkTitle();
                    spnl();
                } else {
                    str2 = null;
                }
                if (peek() == ')') {
                    this.index++;
                    z = true;
                    if (!z) {
                        int i3 = this.index;
                        parseLinkLabel();
                        int i4 = this.index - i3;
                        if (i4 > 2) {
                            str3 = this.input.substring(i3, i4 + i3);
                        } else if (!lastBracket.bracketAfter) {
                            str3 = this.input.substring(lastBracket.index, i);
                        }
                        if (str3 != null) {
                            LinkReferenceDefinition linkReferenceDefinition = this.context.getLinkReferenceDefinition(Escaping.normalizeReference(str3));
                            if (linkReferenceDefinition != null) {
                                str = linkReferenceDefinition.getDestination();
                                str2 = linkReferenceDefinition.getTitle();
                                if (z2) {
                                    Node image = lastBracket.image ? new Image(str, str2) : new Link(str, str2);
                                    Node next = lastBracket.node.getNext();
                                    while (next != null) {
                                        Node next2 = next.getNext();
                                        image.appendChild(next);
                                        next = next2;
                                    }
                                    processDelimiters(lastBracket.previousDelimiter);
                                    InlineParserUtils.mergeChildTextNodes(image);
                                    lastBracket.node.unlink();
                                    removeLastBracket();
                                    if (!lastBracket.image) {
                                        for (Bracket lastBracket2 = lastBracket(); lastBracket2 != null; lastBracket2 = lastBracket2.previous) {
                                            if (!lastBracket2.image) {
                                                lastBracket2.allowed = false;
                                            }
                                        }
                                    }
                                    return image;
                                }
                                this.index = i;
                                removeLastBracket();
                                return text("]");
                            }
                        }
                    }
                    z2 = z;
                    if (z2) {
                    }
                } else {
                    this.index = i;
                }
            } else {
                str2 = null;
            }
        } else {
            str = null;
            str2 = null;
        }
        z = false;
        if (!z) {
        }
        z2 = z;
        if (z2) {
        }
    }
}
