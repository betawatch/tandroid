package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public boolean g = false;
    public int d = -1;

    public gn(int i9, int i10, MessageObject messageObject) {
        this.a = messageObject;
        this.b = i9;
        this.c = i10;
        e();
    }

    public static gn b(int i9, int i10, MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        messageObject.getDialogId();
        return new gn(i9, i10, messageObject);
    }

    public static gn c(MessageObject messageObject) {
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null || message.message == null) {
            return null;
        }
        return b(0, Math.min(MessagesController.getInstance(messageObject.currentAccount).quoteLengthMax, messageObject.messageOwner.message.length()), messageObject);
    }

    public final void a(MessageObject messageObject) {
        String str;
        int i9;
        int i10;
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null || (str = message.message) == null) {
            FileLog.e("ReplyQuote.checkEdit: message is null");
            this.f = false;
            return;
        }
        int i11 = this.c;
        if (i11 < this.b || i11 > str.length() || this.b > messageObject.messageOwner.message.length() || (i9 = this.b) < 0 || (i10 = this.c) < 0) {
            FileLog.e("ReplyQuote.checkEdit: start/end are invalid (" + this.b + ", " + this.c + ", len=" + messageObject.messageOwner.message.length() + ")");
            this.f = false;
            return;
        }
        if (TextUtils.equals(this.i, messageObject.messageOwner.message.substring(i9, i10))) {
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
        int i9;
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
        int i10 = this.c;
        if (i10 < this.b || i10 > str.length() || this.b > this.a.messageOwner.message.length() || (i9 = this.b) < 0 || this.c < 0) {
            FileLog.e("ReplyQuote: start/end are invalid (" + this.b + ", " + this.c + ", len=" + this.a.messageOwner.message.length() + ")");
            return false;
        }
        String str2 = this.a.messageOwner.message;
        int max = Math.max(0, i9);
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
            for (int i11 = 0; i11 < this.a.messageOwner.entities.size(); i11++) {
                TLRPC.MessageEntity messageEntity = this.a.messageOwner.entities.get(i11);
                int i12 = messageEntity.offset;
                if (AndroidUtilities.intersect1dInclusive(max, min, i12, messageEntity.length + i12)) {
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
                    int i13 = messageEntity.offset;
                    int i14 = i13 - max;
                    int i15 = (i13 + messageEntity.length) - max;
                    if ((i14 >= 0 || i15 >= 0) && (i14 <= min || i15 <= min)) {
                        tL_messageEntityCustomEmoji.offset = Math.max(0, i14);
                        tL_messageEntityCustomEmoji.length = Math.min(i15, min - max) - tL_messageEntityCustomEmoji.offset;
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
