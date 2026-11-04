package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class mm {
    public org.telegram.messenger.zi a;
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

    public mm(int i3, int i10, org.telegram.messenger.zi ziVar) {
        TLRPC.Message message;
        this.a = ziVar;
        this.b = i3;
        this.c = i10;
        boolean z10 = false;
        if (ziVar != null && (message = ziVar.k) != null && message.rich_message != null) {
            z10 = true;
        }
        this.m = z10;
        f();
    }

    public static mm b(int i3, int i10, org.telegram.messenger.zi ziVar) {
        if (ziVar == null) {
            return null;
        }
        org.telegram.messenger.zi.B0(ziVar.k);
        return new mm(i3, i10, ziVar);
    }

    public static mm c(org.telegram.messenger.zi ziVar) {
        TLRPC.Message message = ziVar.k;
        if (message == null) {
            return null;
        }
        if (message.message == null && (message == null || message.rich_message == null)) {
            return null;
        }
        return b(0, Math.min(org.telegram.messenger.hp.s1(ziVar.I1).o4, d(ziVar)), ziVar);
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.CharSequence, java.lang.Object] */
    public static int d(org.telegram.messenger.zi ziVar) {
        ?? r22;
        TLRPC.Message message = ziVar.k;
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
        org.telegram.messenger.cv cvVar = ziVar.w2;
        if (cvVar == null || (r22 = cvVar.q) == 0) {
            return 0;
        }
        return r22.length();
    }

    public final void a(org.telegram.messenger.zi ziVar) {
        String str;
        int i3;
        int i10;
        TL_iv.RichMessage richMessage;
        if (this.m) {
            TLRPC.Message message = ziVar.k;
            if (message == null || (richMessage = message.rich_message) == null) {
                org.telegram.messenger.a8.d("ReplyQuote.checkEdit: rich message is null");
                this.f = false;
                return;
            }
            this.a = ziVar;
            String str2 = this.i;
            if (str2 != null && !TextUtils.isEmpty(str2)) {
                ArrayList e10 = org.telegram.messenger.gv.e(richMessage);
                StringBuilder sb2 = new StringBuilder();
                int i11 = 0;
                while (true) {
                    if (i11 >= e10.size()) {
                        break;
                    }
                    if (i11 > 0) {
                        sb2.append('\n');
                    }
                    org.telegram.messenger.gv.b((TL_iv.RichText) e10.get(i11), sb2, null);
                    i11++;
                }
                if (sb2.indexOf(str2) >= 0) {
                    int[] f10 = org.telegram.messenger.gv.c(ziVar) ? org.telegram.messenger.gv.f(ziVar, this.i, this.o) : null;
                    org.telegram.messenger.gv k10 = f10 != null ? org.telegram.messenger.gv.k(f10[0], f10[1], ziVar) : null;
                    if (k10 != null) {
                        this.b = f10[0];
                        this.c = f10[1];
                        e(k10.b, k10.a);
                    } else {
                        this.b = -1;
                        this.c = -1;
                    }
                    this.f = false;
                    return;
                }
            }
            this.b = 0;
            this.c = Math.min(org.telegram.messenger.hp.s1(ziVar.I1).o4, d(ziVar));
            this.f = true;
            return;
        }
        TLRPC.Message message2 = ziVar.k;
        if (message2 == null || (str = message2.message) == null) {
            org.telegram.messenger.a8.d("ReplyQuote.checkEdit: message is null");
            this.f = false;
            return;
        }
        int i12 = this.c;
        if (i12 < this.b || i12 > str.length() || this.b > ziVar.k.message.length() || (i3 = this.b) < 0 || (i10 = this.c) < 0) {
            org.telegram.messenger.a8.d("ReplyQuote.checkEdit: start/end are invalid (" + this.b + ", " + this.c + ", len=" + ziVar.k.message.length() + ")");
            this.f = false;
            return;
        }
        if (TextUtils.equals(this.i, ziVar.k.message.substring(i3, i10))) {
            this.a = ziVar;
            f();
            this.f = false;
            return;
        }
        int indexOf = ziVar.k.message.indexOf(this.i);
        if (indexOf >= 0) {
            this.a = ziVar;
            this.c = (this.c - this.b) + indexOf;
            this.b = indexOf;
            f();
            this.f = false;
            return;
        }
        this.a = ziVar;
        this.b = 0;
        this.c = ziVar.k.message.length();
        f();
        this.f = true;
    }

    public final void e(int i3, ArrayList arrayList) {
        this.n = arrayList;
        this.o = i3;
        if (arrayList == null || arrayList.isEmpty()) {
            this.n = null;
            this.i = null;
            this.j = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            this.j = arrayList2;
            String h = org.telegram.messenger.gv.h(arrayList, arrayList2);
            this.i = h;
            h.getClass();
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
        int i3;
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji;
        int i10;
        if (this.m) {
            int i11 = this.b;
            if (i11 >= 0 && (i10 = this.c) >= 0) {
                org.telegram.messenger.gv k10 = org.telegram.messenger.gv.k(i11, i10, this.a);
                if (k10 != null) {
                    e(k10.b, k10.a);
                    return true;
                }
                org.telegram.messenger.a8.d("ReplyQuote: failed to build a rich quote (" + this.b + ", " + this.c + ")");
                e(0, null);
                return false;
            }
            if (this.n == null) {
                return false;
            }
        } else {
            org.telegram.messenger.zi ziVar = this.a;
            if (ziVar == null || (message = ziVar.k) == null || (str = message.message) == null) {
                org.telegram.messenger.a8.d("ReplyQuote: message is null");
                return false;
            }
            if (this.g) {
                TLRPC.TodoItem Z = org.telegram.messenger.zi.Z(this.d, ziVar);
                if (Z == null) {
                    org.telegram.messenger.a8.d("ReplyQuote: todo task is not found");
                    return false;
                }
                this.k = Z;
                return true;
            }
            if (this.h) {
                TLRPC.PollAnswer X = org.telegram.messenger.zi.X(ziVar, this.e);
                if (X == null) {
                    org.telegram.messenger.a8.d("ReplyQuote: poll item is not found");
                    return false;
                }
                this.l = X;
                return true;
            }
            int i12 = this.c;
            if (i12 < this.b || i12 > str.length() || this.b > this.a.k.message.length() || (i3 = this.b) < 0 || this.c < 0) {
                org.telegram.messenger.a8.d("ReplyQuote: start/end are invalid (" + this.b + ", " + this.c + ", len=" + this.a.k.message.length() + ")");
                return false;
            }
            String str2 = this.a.k.message;
            int max = Math.max(0, i3);
            while (max < this.c && Character.isWhitespace(str2.charAt(max))) {
                max++;
            }
            int min = Math.min(this.c, str2.length());
            while (min > max && Character.isWhitespace(str2.charAt(min - 1))) {
                min--;
            }
            if (max == min) {
                org.telegram.messenger.a8.d("ReplyQuote: message is full of whitespace");
                return false;
            }
            this.i = this.a.k.message.substring(max, min);
            ArrayList arrayList = this.j;
            if (arrayList != null) {
                arrayList.clear();
            }
            ArrayList<TLRPC.MessageEntity> arrayList2 = this.a.k.entities;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                for (int i13 = 0; i13 < this.a.k.entities.size(); i13++) {
                    TLRPC.MessageEntity messageEntity = this.a.k.entities.get(i13);
                    int i14 = messageEntity.offset;
                    int i15 = messageEntity.length + i14;
                    Typeface typeface = org.telegram.messenger.g0.a;
                    if (Math.max(max, min) >= Math.min(i14, i15) && Math.max(i14, i15) >= Math.min(max, min)) {
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
