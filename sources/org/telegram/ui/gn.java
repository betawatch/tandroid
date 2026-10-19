package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.RichQuote;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class gn {
    public MessageObject a;
    public int b;
    public int c;
    public byte[] e;
    public boolean f;
    public boolean h;
    public String i;
    public ArrayList j;
    public TLRPC.TodoItem k;
    public TLRPC.PollAnswer l;
    public boolean m;
    public ArrayList n;
    public int o;
    public boolean g = false;
    public int d = -1;

    public gn(MessageObject messageObject, int i10, int i11) {
        TLRPC.Message message;
        this.a = messageObject;
        this.b = i10;
        this.c = i11;
        boolean z10 = false;
        if (messageObject != null && (message = messageObject.messageOwner) != null && message.rich_message != null) {
            z10 = true;
        }
        this.m = z10;
        f();
    }

    public static gn b(MessageObject messageObject) {
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null) {
            return null;
        }
        if (message.message == null && (message == null || message.rich_message == null)) {
            return null;
        }
        return c(messageObject, 0, Math.min(MessagesController.getInstance(messageObject.currentAccount).quoteLengthMax, d(messageObject)));
    }

    public static gn c(MessageObject messageObject, int i10, int i11) {
        if (messageObject == null) {
            return null;
        }
        messageObject.getDialogId();
        return new gn(messageObject, i10, i11);
    }

    public static int d(MessageObject messageObject) {
        CharSequence charSequence;
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null) {
            return 0;
        }
        if (message == null || message.rich_message == null) {
            String str = message.message;
            if (str == null) {
                return 0;
            }
            return str.length();
        }
        RichMessageLayout richMessageLayout = messageObject.richLayout;
        if (richMessageLayout == null || (charSequence = richMessageLayout.joinedText) == null) {
            return 0;
        }
        return charSequence.length();
    }

    public final void a(MessageObject messageObject) {
        String str;
        int i10;
        int i11;
        TL_iv.RichMessage richMessage;
        if (this.m) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null || (richMessage = message.rich_message) == null) {
                FileLog.e("ReplyQuote.checkEdit: rich message is null");
                this.f = false;
                return;
            }
            this.a = messageObject;
            String str2 = this.i;
            if (str2 == null || !RichQuote.containsQuote(richMessage, str2)) {
                this.b = 0;
                this.c = Math.min(MessagesController.getInstance(messageObject.currentAccount).quoteLengthMax, d(messageObject));
                this.f = true;
                return;
            }
            int[] findQuote = RichQuote.canQuote(messageObject) ? RichQuote.findQuote(messageObject, this.i, this.o) : null;
            RichQuote fromSelection = findQuote != null ? RichQuote.fromSelection(messageObject, findQuote[0], findQuote[1]) : null;
            if (fromSelection != null) {
                this.b = findQuote[0];
                this.c = findQuote[1];
                e(fromSelection.offset, fromSelection.fragments);
            } else {
                this.b = -1;
                this.c = -1;
            }
            this.f = false;
            return;
        }
        TLRPC.Message message2 = messageObject.messageOwner;
        if (message2 == null || (str = message2.message) == null) {
            FileLog.e("ReplyQuote.checkEdit: message is null");
            this.f = false;
            return;
        }
        int i12 = this.c;
        if (i12 < this.b || i12 > str.length() || this.b > messageObject.messageOwner.message.length() || (i10 = this.b) < 0 || (i11 = this.c) < 0) {
            FileLog.e("ReplyQuote.checkEdit: start/end are invalid (" + this.b + ", " + this.c + ", len=" + messageObject.messageOwner.message.length() + ")");
            this.f = false;
            return;
        }
        if (TextUtils.equals(this.i, messageObject.messageOwner.message.substring(i10, i11))) {
            this.a = messageObject;
            f();
            this.f = false;
            return;
        }
        int indexOf = messageObject.messageOwner.message.indexOf(this.i);
        if (indexOf >= 0) {
            this.a = messageObject;
            this.c = (this.c - this.b) + indexOf;
            this.b = indexOf;
            f();
            this.f = false;
            return;
        }
        this.a = messageObject;
        this.b = 0;
        this.c = messageObject.messageOwner.message.length();
        f();
        this.f = true;
    }

    public final void e(int i10, ArrayList arrayList) {
        this.n = arrayList;
        this.o = i10;
        if (arrayList == null || arrayList.isEmpty()) {
            this.n = null;
            this.i = null;
            this.j = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            this.j = arrayList2;
            String flatText = RichQuote.flatText(arrayList, arrayList2);
            this.i = flatText;
            flatText.getClass();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12, types: [org.telegram.tgnet.TLRPC$TL_messageEntitySpoiler] */
    /* JADX WARN: Type inference failed for: r6v13, types: [org.telegram.tgnet.TLRPC$TL_messageEntityStrike] */
    /* JADX WARN: Type inference failed for: r6v14, types: [org.telegram.tgnet.TLRPC$TL_messageEntityUnderline] */
    /* JADX WARN: Type inference failed for: r6v15, types: [org.telegram.tgnet.TLRPC$TL_messageEntityItalic] */
    /* JADX WARN: Type inference failed for: r6v17, types: [org.telegram.tgnet.TLRPC$TL_messageEntityBold] */
    public final boolean f() {
        TLRPC.Message message;
        String str;
        int i10;
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji;
        int i11;
        if (this.m) {
            int i12 = this.b;
            if (i12 >= 0 && (i11 = this.c) >= 0) {
                RichQuote fromSelection = RichQuote.fromSelection(this.a, i12, i11);
                if (fromSelection != null) {
                    e(fromSelection.offset, fromSelection.fragments);
                    return true;
                }
                FileLog.e("ReplyQuote: failed to build a rich quote (" + this.b + ", " + this.c + ")");
                e(0, null);
                return false;
            }
            if (this.n == null) {
                return false;
            }
        } else {
            MessageObject messageObject = this.a;
            if (messageObject == null || (message = messageObject.messageOwner) == null || (str = message.message) == null) {
                FileLog.e("ReplyQuote: message is null");
                return false;
            }
            if (this.g) {
                TLRPC.TodoItem findTodoItem = MessageObject.findTodoItem(messageObject, this.d);
                if (findTodoItem == null) {
                    FileLog.e("ReplyQuote: todo task is not found");
                    return false;
                }
                this.k = findTodoItem;
                return true;
            }
            if (this.h) {
                TLRPC.PollAnswer findPollItem = MessageObject.findPollItem(messageObject, this.e);
                if (findPollItem == null) {
                    FileLog.e("ReplyQuote: poll item is not found");
                    return false;
                }
                this.l = findPollItem;
                return true;
            }
            int i13 = this.c;
            if (i13 < this.b || i13 > str.length() || this.b > this.a.messageOwner.message.length() || (i10 = this.b) < 0 || this.c < 0) {
                FileLog.e("ReplyQuote: start/end are invalid (" + this.b + ", " + this.c + ", len=" + this.a.messageOwner.message.length() + ")");
                return false;
            }
            String str2 = this.a.messageOwner.message;
            int max = Math.max(0, i10);
            while (max < this.c && Character.isWhitespace(str2.charAt(max))) {
                max++;
            }
            int min = Math.min(this.c, str2.length());
            while (min > max && Character.isWhitespace(str2.charAt(min - 1))) {
                min--;
            }
            if (max == min) {
                FileLog.e("ReplyQuote: message is full of whitespace");
                return false;
            }
            this.i = this.a.messageOwner.message.substring(max, min);
            ArrayList arrayList = this.j;
            if (arrayList != null) {
                arrayList.clear();
            }
            ArrayList<TLRPC.MessageEntity> arrayList2 = this.a.messageOwner.entities;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                for (int i14 = 0; i14 < this.a.messageOwner.entities.size(); i14++) {
                    TLRPC.MessageEntity messageEntity = this.a.messageOwner.entities.get(i14);
                    int i15 = messageEntity.offset;
                    if (AndroidUtilities.intersect1dInclusive(max, min, i15, messageEntity.length + i15)) {
                        if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                            tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityBold();
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                            tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityItalic();
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                            tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityUnderline();
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                            tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityStrike();
                        } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                            tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntitySpoiler();
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji2 = new TLRPC.TL_messageEntityCustomEmoji();
                            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji3 = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                            tL_messageEntityCustomEmoji2.document_id = tL_messageEntityCustomEmoji3.document_id;
                            tL_messageEntityCustomEmoji2.document = tL_messageEntityCustomEmoji3.document;
                            tL_messageEntityCustomEmoji = tL_messageEntityCustomEmoji2;
                        }
                        int i16 = messageEntity.offset;
                        int i17 = i16 - max;
                        int i18 = (i16 + messageEntity.length) - max;
                        if ((i17 >= 0 || i18 >= 0) && (i17 <= min || i18 <= min)) {
                            tL_messageEntityCustomEmoji.offset = Math.max(0, i17);
                            tL_messageEntityCustomEmoji.length = Math.min(i18, min - max) - tL_messageEntityCustomEmoji.offset;
                            if (this.j == null) {
                                this.j = new ArrayList();
                            }
                            this.j.add(tL_messageEntityCustomEmoji);
                        }
                    }
                }
            }
        }
        return true;
    }
}
