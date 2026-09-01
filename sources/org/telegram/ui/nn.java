package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class nn {
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
    public boolean g = false;
    public int d = -1;

    public nn(int i10, int i11, MessageObject messageObject) {
        this.a = messageObject;
        this.b = i10;
        this.c = i11;
        e();
    }

    public static nn b(int i10, int i11, MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        messageObject.getDialogId();
        return new nn(i10, i11, messageObject);
    }

    public static nn c(MessageObject messageObject) {
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null || message.message == null) {
            return null;
        }
        return b(0, Math.min(MessagesController.getInstance(messageObject.currentAccount).quoteLengthMax, messageObject.messageOwner.message.length()), messageObject);
    }

    public final void a(MessageObject messageObject) {
        String str;
        int i10;
        int i11;
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null || (str = message.message) == null) {
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
            e();
            this.f = false;
            return;
        }
        int indexOf = messageObject.messageOwner.message.indexOf(this.i);
        if (indexOf >= 0) {
            this.a = messageObject;
            this.c = (this.c - this.b) + indexOf;
            this.b = indexOf;
            e();
            this.f = false;
            return;
        }
        this.a = messageObject;
        this.b = 0;
        this.c = messageObject.messageOwner.message.length();
        e();
        this.f = true;
    }

    public final boolean d() {
        if (this.g) {
            if (this.k == null) {
                return false;
            }
        } else {
            if (!this.h) {
                return !TextUtils.isEmpty(this.i);
            }
            if (this.l == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [org.telegram.tgnet.TLRPC$TL_messageEntityStrike] */
    /* JADX WARN: Type inference failed for: r6v11, types: [org.telegram.tgnet.TLRPC$TL_messageEntityUnderline] */
    /* JADX WARN: Type inference failed for: r6v12, types: [org.telegram.tgnet.TLRPC$TL_messageEntityItalic] */
    /* JADX WARN: Type inference failed for: r6v14, types: [org.telegram.tgnet.TLRPC$TL_messageEntityBold] */
    /* JADX WARN: Type inference failed for: r6v9, types: [org.telegram.tgnet.TLRPC$TL_messageEntitySpoiler] */
    public final boolean e() {
        TLRPC.Message message;
        String str;
        int i10;
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji;
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
        int i11 = this.c;
        if (i11 < this.b || i11 > str.length() || this.b > this.a.messageOwner.message.length() || (i10 = this.b) < 0 || this.c < 0) {
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
            for (int i12 = 0; i12 < this.a.messageOwner.entities.size(); i12++) {
                TLRPC.MessageEntity messageEntity = this.a.messageOwner.entities.get(i12);
                int i13 = messageEntity.offset;
                if (AndroidUtilities.intersect1dInclusive(max, min, i13, messageEntity.length + i13)) {
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
                    int i14 = messageEntity.offset;
                    int i15 = i14 - max;
                    int i16 = (i14 + messageEntity.length) - max;
                    if ((i15 >= 0 || i16 >= 0) && (i15 <= min || i16 <= min)) {
                        tL_messageEntityCustomEmoji.offset = Math.max(0, i15);
                        tL_messageEntityCustomEmoji.length = Math.min(i16, min - max) - tL_messageEntityCustomEmoji.offset;
                        if (this.j == null) {
                            this.j = new ArrayList();
                        }
                        this.j.add(tL_messageEntityCustomEmoji);
                    }
                }
            }
        }
        return true;
    }
}
