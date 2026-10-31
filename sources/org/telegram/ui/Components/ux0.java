package org.telegram.ui.Components;

import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ux0 {
    public final org.telegram.ui.ActionBar.p6 a;
    public StaticLayout b;
    public final ArrayList c = new ArrayList(2);
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public ux0(org.telegram.ui.ActionBar.p6 p6Var) {
        this.a = p6Var;
    }

    public static void c(StringBuilder sb2, int i10, boolean z10) {
        if (sb2.length() > 0) {
            if (z10) {
                sb2.append(' ');
                sb2.append(org.telegram.messenger.cd.L0(2131744371, null));
                sb2.append(' ');
            } else {
                sb2.append(", ");
            }
        }
        sb2.append(org.telegram.messenger.cd.L0(i10, null));
    }

    public final int a() {
        return this.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x01b2, code lost:
    
        if (r3 != null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01b4, code lost:
    
        r3 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01bb, code lost:
    
        if (r6.document != null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01bd, code lost:
    
        r6 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01c2, code lost:
    
        if (r3 == r6) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01c0, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01b7, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x019c, code lost:
    
        if ((r7 == null ? r18 : 0) != (r6.photo == null ? r18 : 0)) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01d3, code lost:
    
        if ((r3 != null ? r18 : 0) == (r6 != null ? r18 : 0)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0130, code lost:
    
        if (r3.b == r15.b) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0187, code lost:
    
        if (r7.id != r11.id) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0189, code lost:
    
        r2 = r2 | 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x019f, code lost:
    
        r3 = r3.document;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a1, code lost:
    
        if (r3 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a3, code lost:
    
        r7 = r6.document;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a5, code lost:
    
        if (r7 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ad, code lost:
    
        if (r3.id == r7.id) goto L112;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(org.telegram.messenger.jj jjVar) {
        float f7;
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.SuggestedPost suggestedPost;
        TLRPC.SuggestedPost suggestedPost2;
        int i14;
        TLRPC.MessageMedia messageMedia;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Message message;
        TLRPC.SuggestedPost suggestedPost3 = (jjVar == null || (message = jjVar.k) == null) ? null : message.suggested_post;
        if (suggestedPost3 == null) {
            return;
        }
        sf.a aVar = org.telegram.messenger.oj.b(suggestedPost3).a;
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        Paint d = p6Var != null ? p6Var.d("paintChatActionText3") : null;
        if (d == null) {
            d = org.telegram.ui.ActionBar.t6.V0("paintChatActionText3");
        }
        TextPaint textPaint = (TextPaint) d;
        this.g = org.telegram.messenger.i0.L(14.0f) * 2;
        ArrayList arrayList = this.c;
        arrayList.clear();
        if (aVar != null && !aVar.k()) {
            arrayList.add(new tx0(new qz0(org.telegram.messenger.cd.L0(2131744374, null), textPaint), new qz0(org.telegram.messenger.cd.g(aVar.f()), textPaint)));
        }
        if (suggestedPost3.schedule_date > 0) {
            arrayList.add(new tx0(new qz0(org.telegram.messenger.cd.L0(2131744373, null), textPaint), new qz0(org.telegram.messenger.cd.g(org.telegram.messenger.cd.x(suggestedPost3.schedule_date, true)), textPaint)));
        }
        int size = arrayList.size();
        float f10 = 0.0f;
        float f11 = 0.0f;
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayList.get(i15);
            i15++;
            tx0 tx0Var = (tx0) obj;
            f10 = Math.max(f10, tx0Var.a.k());
            f11 = Math.max(f11, tx0Var.b.k());
            int i16 = ((int) tx0Var.a.i()) + this.g;
            this.g = i16;
            this.g = org.telegram.messenger.i0.L(7.0f) + i16;
        }
        int L = (int) (f11 + f10 + org.telegram.messenger.i0.L(11.0f));
        int max = Math.max(L, org.telegram.messenger.i0.L(160.0f));
        String l4 = org.telegram.messenger.o5.l(org.telegram.messenger.d20.s0, jjVar.Z0());
        org.telegram.messenger.jj jjVar2 = jjVar.C;
        TLRPC.Message message2 = jjVar2 != null ? jjVar2.k : null;
        TLRPC.Message message3 = jjVar.k;
        if (message2 == null || (suggestedPost = message2.suggested_post) == null || message3 == null || (suggestedPost2 = message3.suggested_post) == null) {
            f7 = 11.0f;
            i10 = 1;
            i11 = 0;
            i12 = 0;
        } else {
            f7 = 11.0f;
            TL_stars.StarsAmount starsAmount = suggestedPost.price;
            i11 = 0;
            TL_stars.StarsAmount starsAmount2 = suggestedPost2.price;
            sf.a l10 = sf.a.l(starsAmount);
            sf.a l11 = sf.a.l(starsAmount2);
            if (l10 == l11) {
                i10 = 1;
            } else {
                if (l10 == null || l11 == null) {
                    i10 = 1;
                } else {
                    i10 = 1;
                    if (l10.a == l11.a) {
                    }
                }
                i14 = 0;
                i12 = i14 ^ 1;
                if (suggestedPost.schedule_date != suggestedPost2.schedule_date) {
                    i12 |= 2;
                }
                if (!TextUtils.equals(jjVar.v, jjVar.C.v)) {
                    i12 |= 4;
                }
                if (!TextUtils.equals(jjVar.z, jjVar.C.z)) {
                    i12 |= 4;
                }
                messageMedia = message2.media;
                messageMedia2 = message3.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaEmpty) {
                    messageMedia = null;
                }
                if (messageMedia2 instanceof TLRPC.TL_messageMediaEmpty) {
                    messageMedia2 = null;
                }
                if (messageMedia == null && messageMedia2 != null) {
                    if (messageMedia.getClass() == messageMedia2.getClass()) {
                        TLRPC.Photo photo = messageMedia.photo;
                        if (photo == null || (r11 = messageMedia2.photo) == null) {
                        }
                    }
                    i12 |= 8;
                }
            }
            i14 = i10;
            i12 = i14 ^ 1;
            if (suggestedPost.schedule_date != suggestedPost2.schedule_date) {
            }
            if (!TextUtils.equals(jjVar.v, jjVar.C.v)) {
            }
            if (!TextUtils.equals(jjVar.z, jjVar.C.z)) {
            }
            messageMedia = message2.media;
            messageMedia2 = message3.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaEmpty) {
            }
            if (messageMedia2 instanceof TLRPC.TL_messageMediaEmpty) {
            }
            if (messageMedia == null) {
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i12 != 0) {
            org.telegram.messenger.jj jjVar3 = jjVar.C;
            if (jjVar3 != null) {
                org.telegram.messenger.o5.l(org.telegram.messenger.d20.s0, jjVar3.Z0());
            }
            StringBuilder sb2 = new StringBuilder();
            int i17 = i12 & 4;
            int i18 = i12 & 2;
            int i19 = i12 & 8;
            int i20 = i12 & 1;
            int i21 = (i17 != 0 ? 1 : i11) + (i18 != 0 ? 1 : i11) + (i19 != 0 ? 1 : i11) + (i20 != 0 ? 1 : i11);
            if (i20 != 0) {
                c(sb2, 2131744367, i21 == 1 ? 1 : i11);
                i13 = 1;
            } else {
                i13 = i11;
            }
            if (i18 != 0) {
                i13++;
                c(sb2, 2131744365, i21 == i13 ? 1 : i11);
            }
            if (i17 != 0) {
                i13++;
                c(sb2, 2131744366, i21 == i13 ? 1 : i11);
            }
            if (i19 != 0) {
                c(sb2, 2131744368, i21 == i13 + 1 ? 1 : i11);
            }
            if (jjVar.P3()) {
                Object[] objArr = new Object[1];
                objArr[i11] = sb2;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.a0(null, null, 2131744369, objArr));
            } else {
                Object[] objArr2 = new Object[2];
                objArr2[i11] = l4;
                objArr2[1] = sb2;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.a0(null, null, 2131744370, objArr2));
            }
        } else if (jjVar.P3()) {
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131744364, null));
        } else {
            Object[] objArr3 = new Object[i10];
            objArr3[i11] = l4;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.a0(null, null, 2131744372, objArr3));
        }
        this.b = new StaticLayout(org.telegram.messenger.i0.U2(spannableStringBuilder), textPaint, max, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        int i22 = i11;
        for (int i23 = i22; i23 < this.b.getLineCount(); i23++) {
            i22 = (int) Math.max(i22, this.b.getLineWidth(i23));
        }
        int height = this.b.getHeight() + this.g;
        this.g = height;
        this.g = org.telegram.messenger.i0.L(5.0f) + height;
        int D = org.telegram.messenger.m5.D(24.0f, 2, Math.max(L, i22));
        this.h = D;
        this.d = (D - max) / 2;
        this.e = (D - L) / 2;
        this.f = (int) (org.telegram.messenger.i0.L(f7) + r1 + f10);
    }
}
