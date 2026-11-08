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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class qw0 {
    public final org.telegram.ui.ActionBar.f6 a;
    public StaticLayout b;
    public final ArrayList c = new ArrayList(2);
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public qw0(org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = f6Var;
    }

    public static void c(StringBuilder sb2, int i7, boolean z9) {
        if (sb2.length() > 0) {
            if (z9) {
                sb2.append(' ');
                sb2.append(org.telegram.messenger.id.M0(2131744348, null));
                sb2.append(' ');
            } else {
                sb2.append(", ");
            }
        }
        sb2.append(org.telegram.messenger.id.M0(i7, null));
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
    public final void b(org.telegram.messenger.ij ijVar) {
        float f10;
        int i7;
        int i10;
        int i11;
        int i12;
        TLRPC.SuggestedPost suggestedPost;
        TLRPC.SuggestedPost suggestedPost2;
        int i13;
        TLRPC.MessageMedia messageMedia;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Message message;
        TLRPC.SuggestedPost suggestedPost3 = (ijVar == null || (message = ijVar.k) == null) ? null : message.suggested_post;
        if (suggestedPost3 == null) {
            return;
        }
        cg.a aVar = org.telegram.messenger.nj.b(suggestedPost3).a;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        Paint d = f6Var != null ? f6Var.d("paintChatActionText3") : null;
        if (d == null) {
            d = org.telegram.ui.ActionBar.k6.V0("paintChatActionText3");
        }
        TextPaint textPaint = (TextPaint) d;
        this.g = org.telegram.messenger.g0.L(14.0f) * 2;
        ArrayList arrayList = this.c;
        arrayList.clear();
        if (aVar != null && !aVar.k()) {
            arrayList.add(new pw0(new my0(org.telegram.messenger.id.M0(2131744351, null), textPaint), new my0(org.telegram.messenger.id.g(aVar.f()), textPaint)));
        }
        if (suggestedPost3.schedule_date > 0) {
            arrayList.add(new pw0(new my0(org.telegram.messenger.id.M0(2131744350, null), textPaint), new my0(org.telegram.messenger.id.g(org.telegram.messenger.id.x(suggestedPost3.schedule_date, true)), textPaint)));
        }
        int size = arrayList.size();
        float f11 = 0.0f;
        float f12 = 0.0f;
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            pw0 pw0Var = (pw0) obj;
            f11 = Math.max(f11, pw0Var.a.k());
            f12 = Math.max(f12, pw0Var.b.k());
            int i15 = ((int) pw0Var.a.i()) + this.g;
            this.g = i15;
            this.g = org.telegram.messenger.g0.L(7.0f) + i15;
        }
        int L = (int) (f12 + f11 + org.telegram.messenger.g0.L(11.0f));
        int max = Math.max(L, org.telegram.messenger.g0.L(160.0f));
        String l10 = org.telegram.messenger.m5.l(org.telegram.messenger.p10.s0, ijVar.Z0());
        org.telegram.messenger.ij ijVar2 = ijVar.C;
        TLRPC.Message message2 = ijVar2 != null ? ijVar2.k : null;
        TLRPC.Message message3 = ijVar.k;
        if (message2 == null || (suggestedPost = message2.suggested_post) == null || message3 == null || (suggestedPost2 = message3.suggested_post) == null) {
            f10 = 11.0f;
            i7 = 1;
            i10 = 0;
            i11 = 0;
        } else {
            f10 = 11.0f;
            TL_stars.StarsAmount starsAmount = suggestedPost.price;
            i10 = 0;
            TL_stars.StarsAmount starsAmount2 = suggestedPost2.price;
            cg.a l11 = cg.a.l(starsAmount);
            cg.a l12 = cg.a.l(starsAmount2);
            if (l11 == l12) {
                i7 = 1;
            } else {
                if (l11 == null || l12 == null) {
                    i7 = 1;
                } else {
                    i7 = 1;
                    if (l11.a == l12.a) {
                    }
                }
                i13 = 0;
                i11 = i13 ^ 1;
                if (suggestedPost.schedule_date != suggestedPost2.schedule_date) {
                    i11 |= 2;
                }
                if (!TextUtils.equals(ijVar.v, ijVar.C.v)) {
                    i11 |= 4;
                }
                if (!TextUtils.equals(ijVar.z, ijVar.C.z)) {
                    i11 |= 4;
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
                    i11 |= 8;
                }
            }
            i13 = i7;
            i11 = i13 ^ 1;
            if (suggestedPost.schedule_date != suggestedPost2.schedule_date) {
            }
            if (!TextUtils.equals(ijVar.v, ijVar.C.v)) {
            }
            if (!TextUtils.equals(ijVar.z, ijVar.C.z)) {
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
        if (i11 != 0) {
            org.telegram.messenger.ij ijVar3 = ijVar.C;
            if (ijVar3 != null) {
                org.telegram.messenger.m5.l(org.telegram.messenger.p10.s0, ijVar3.Z0());
            }
            StringBuilder sb2 = new StringBuilder();
            int i16 = i11 & 4;
            int i17 = i11 & 2;
            int i18 = i11 & 8;
            int i19 = i11 & 1;
            int i20 = (i16 != 0 ? 1 : i10) + (i17 != 0 ? 1 : i10) + (i18 != 0 ? 1 : i10) + (i19 != 0 ? 1 : i10);
            if (i19 != 0) {
                c(sb2, 2131744344, i20 == 1 ? 1 : i10);
                i12 = 1;
            } else {
                i12 = i10;
            }
            if (i17 != 0) {
                i12++;
                c(sb2, 2131744342, i20 == i12 ? 1 : i10);
            }
            if (i16 != 0) {
                i12++;
                c(sb2, 2131744343, i20 == i12 ? 1 : i10);
            }
            if (i18 != 0) {
                c(sb2, 2131744345, i20 == i12 + 1 ? 1 : i10);
            }
            if (ijVar.Q3()) {
                Object[] objArr = new Object[1];
                objArr[i10] = sb2;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.a0(null, null, 2131744346, objArr));
            } else {
                Object[] objArr2 = new Object[2];
                objArr2[i10] = l10;
                objArr2[1] = sb2;
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.a0(null, null, 2131744347, objArr2));
            }
        } else if (ijVar.Q3()) {
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131744341, null));
        } else {
            Object[] objArr3 = new Object[i7];
            objArr3[i10] = l10;
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.a0(null, null, 2131744349, objArr3));
        }
        this.b = new StaticLayout(org.telegram.messenger.g0.V2(spannableStringBuilder), textPaint, max, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        int i21 = i10;
        for (int i22 = i21; i22 < this.b.getLineCount(); i22++) {
            i21 = (int) Math.max(i21, this.b.getLineWidth(i22));
        }
        int height = this.b.getHeight() + this.g;
        this.g = height;
        this.g = org.telegram.messenger.g0.L(5.0f) + height;
        int D = org.telegram.messenger.k5.D(24.0f, 2, Math.max(L, i21));
        this.h = D;
        this.d = (D - max) / 2;
        this.e = (D - L) / 2;
        this.f = (int) (org.telegram.messenger.g0.L(f10) + r1 + f11);
    }
}
