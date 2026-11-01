package org.telegram.ui;

import android.graphics.Typeface;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class kn {
    public org.telegram.messenger.kj a;
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

    public kn(int i10, int i11, org.telegram.messenger.kj kjVar) {
        TLRPC.Message message;
        this.a = kjVar;
        this.b = i10;
        this.c = i11;
        boolean z10 = false;
        if (kjVar != null && (message = kjVar.k) != null && message.rich_message != null) {
            z10 = true;
        }
        this.m = z10;
        f();
    }

    public static kn b(int i10, int i11, org.telegram.messenger.kj kjVar) {
        if (kjVar == null) {
            return null;
        }
        org.telegram.messenger.kj.B0(kjVar.k);
        return new kn(i10, i11, kjVar);
    }

    public static kn c(org.telegram.messenger.kj kjVar) {
        TLRPC.Message message = kjVar.k;
        if (message == null) {
            return null;
        }
        if (message.message == null && (message == null || message.rich_message == null)) {
            return null;
        }
        return b(0, Math.min(org.telegram.messenger.wp.r1(kjVar.I1).p4, d(kjVar)), kjVar);
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.CharSequence, java.lang.Object] */
    public static int d(org.telegram.messenger.kj kjVar) {
        ?? r22;
        TLRPC.Message message = kjVar.k;
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
        org.telegram.messenger.wv wvVar = kjVar.w2;
        if (wvVar == null || (r22 = wvVar.q) == 0) {
            return 0;
        }
        return r22.length();
    }

    public final void a(org.telegram.messenger.kj kjVar) {
        String str;
        int i10;
        int i11;
        TL_iv.RichMessage richMessage;
        if (this.m) {
            TLRPC.Message message = kjVar.k;
            if (message == null || (richMessage = message.rich_message) == null) {
                org.telegram.messenger.f8.d("ReplyQuote.checkEdit: rich message is null");
                this.f = false;
                return;
            }
            this.a = kjVar;
            String str2 = this.i;
            if (str2 != null && !TextUtils.isEmpty(str2)) {
                ArrayList e = org.telegram.messenger.aw.e(richMessage);
                StringBuilder sb2 = new StringBuilder();
                int i12 = 0;
                while (true) {
                    if (i12 >= e.size()) {
                        break;
                    }
                    if (i12 > 0) {
                        sb2.append('\n');
                    }
                    org.telegram.messenger.aw.b((TL_iv.RichText) e.get(i12), sb2, null);
                    i12++;
                }
                if (sb2.indexOf(str2) >= 0) {
                    int[] f7 = org.telegram.messenger.aw.c(kjVar) ? org.telegram.messenger.aw.f(kjVar, this.i, this.o) : null;
                    org.telegram.messenger.aw k10 = f7 != null ? org.telegram.messenger.aw.k(f7[0], f7[1], kjVar) : null;
                    if (k10 != null) {
                        this.b = f7[0];
                        this.c = f7[1];
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
            this.c = Math.min(org.telegram.messenger.wp.r1(kjVar.I1).p4, d(kjVar));
            this.f = true;
            return;
        }
        TLRPC.Message message2 = kjVar.k;
        if (message2 == null || (str = message2.message) == null) {
            org.telegram.messenger.f8.d("ReplyQuote.checkEdit: message is null");
            this.f = false;
            return;
        }
        int i13 = this.c;
        if (i13 < this.b || i13 > str.length() || this.b > kjVar.k.message.length() || (i10 = this.b) < 0 || (i11 = this.c) < 0) {
            org.telegram.messenger.f8.d("ReplyQuote.checkEdit: start/end are invalid (" + this.b + ", " + this.c + ", len=" + kjVar.k.message.length() + ")");
            this.f = false;
            return;
        }
        if (TextUtils.equals(this.i, kjVar.k.message.substring(i10, i11))) {
            this.a = kjVar;
            f();
            this.f = false;
            return;
        }
        int indexOf = kjVar.k.message.indexOf(this.i);
        if (indexOf >= 0) {
            this.a = kjVar;
            this.c = (this.c - this.b) + indexOf;
            this.b = indexOf;
            f();
            this.f = false;
            return;
        }
        this.a = kjVar;
        this.b = 0;
        this.c = kjVar.k.message.length();
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
            String h = org.telegram.messenger.aw.h(arrayList, arrayList2);
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
        int i10;
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji;
        int i11;
        if (this.m) {
            int i12 = this.b;
            if (i12 >= 0 && (i11 = this.c) >= 0) {
                org.telegram.messenger.aw k10 = org.telegram.messenger.aw.k(i12, i11, this.a);
                if (k10 != null) {
                    e(k10.b, k10.a);
                    return true;
                }
                org.telegram.messenger.f8.d("ReplyQuote: failed to build a rich quote (" + this.b + ", " + this.c + ")");
                e(0, null);
                return false;
            }
            if (this.n == null) {
                return false;
            }
        } else {
            org.telegram.messenger.kj kjVar = this.a;
            if (kjVar == null || (message = kjVar.k) == null || (str = message.message) == null) {
                org.telegram.messenger.f8.d("ReplyQuote: message is null");
                return false;
            }
            if (this.g) {
                TLRPC.TodoItem Z = org.telegram.messenger.kj.Z(this.d, kjVar);
                if (Z == null) {
                    org.telegram.messenger.f8.d("ReplyQuote: todo task is not found");
                    return false;
                }
                this.k = Z;
                return true;
            }
            if (this.h) {
                TLRPC.PollAnswer X = org.telegram.messenger.kj.X(kjVar, this.e);
                if (X == null) {
                    org.telegram.messenger.f8.d("ReplyQuote: poll item is not found");
                    return false;
                }
                this.l = X;
                return true;
            }
            int i13 = this.c;
            if (i13 < this.b || i13 > str.length() || this.b > this.a.k.message.length() || (i10 = this.b) < 0 || this.c < 0) {
                org.telegram.messenger.f8.d("ReplyQuote: start/end are invalid (" + this.b + ", " + this.c + ", len=" + this.a.k.message.length() + ")");
                return false;
            }
            String str2 = this.a.k.message;
            int max = Math.max(0, i10);
            while (max < this.c && Character.isWhitespace(str2.charAt(max))) {
                max++;
            }
            int min = Math.min(this.c, str2.length());
            while (min > max && Character.isWhitespace(str2.charAt(min - 1))) {
                min--;
            }
            if (max == min) {
                org.telegram.messenger.f8.d("ReplyQuote: message is full of whitespace");
                return false;
            }
            this.i = this.a.k.message.substring(max, min);
            ArrayList arrayList = this.j;
            if (arrayList != null) {
                arrayList.clear();
            }
            ArrayList<TLRPC.MessageEntity> arrayList2 = this.a.k.entities;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                for (int i14 = 0; i14 < this.a.k.entities.size(); i14++) {
                    TLRPC.MessageEntity messageEntity = this.a.k.entities.get(i14);
                    int i15 = messageEntity.offset;
                    int i16 = messageEntity.length + i15;
                    Typeface typeface = org.telegram.messenger.i0.a;
                    if (Math.max(max, min) >= Math.min(i15, i16) && Math.max(i15, i16) >= Math.min(max, min)) {
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
                        int i17 = messageEntity.offset;
                        int i18 = i17 - max;
                        int i19 = (i17 + messageEntity.length) - max;
                        if ((i18 >= 0 || i19 >= 0) && (i18 <= min || i19 <= min)) {
                            tL_messageEntityCustomEmoji.offset = Math.max(0, i18);
                            tL_messageEntityCustomEmoji.length = Math.min(i19, min - max) - tL_messageEntityCustomEmoji.offset;
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
