// default package

import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ibb {
    public final wjb a;
    public StaticLayout b;
    public final ArrayList c = new ArrayList(2);
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public ibb(wjb wjbVar) {
        this.a = wjbVar;
    }

    public static void b(StringBuilder sb, int i, boolean z) {
        if (sb.length() > 0) {
            if (z) {
                sb.append(' ');
                sb.append(k96.M0(2131744104, null));
                sb.append(' ');
            } else {
                sb.append(", ");
            }
        }
        sb.append(k96.M0(i, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x01a6, code lost:
    
        r3 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01ad, code lost:
    
        if (r8.document != null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01af, code lost:
    
        r8 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01b4, code lost:
    
        if (r3 == r8) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01b2, code lost:
    
        r8 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01a9, code lost:
    
        r3 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0193, code lost:
    
        r2 = r2 | 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0191, code lost:
    
        if (r11 != (r8.photo == null ? r18 : r17)) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01c3, code lost:
    
        if (r3 == (r8 != null ? r18 : r17)) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0125, code lost:
    
        if (r14.b == r3.b) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0180, code lost:
    
        if (r11.id != r12.id) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0195, code lost:
    
        r3 = r3.document;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0197, code lost:
    
        if (r3 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0199, code lost:
    
        r11 = r8.document;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x019b, code lost:
    
        if (r11 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01a3, code lost:
    
        if (r3.id == r11.id) goto L107;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(k27 k27Var) {
        float f;
        int i;
        int i2;
        int i3;
        int i4;
        TLRPC.SuggestedPost suggestedPost;
        TLRPC.SuggestedPost suggestedPost2;
        int i5;
        TLRPC.MessageMedia messageMedia;
        TLRPC.MessageMedia messageMedia2;
        int i6;
        int i7;
        TLRPC.Message message;
        TLRPC.SuggestedPost suggestedPost3 = (k27Var == null || (message = k27Var.k) == null) ? null : message.suggested_post;
        if (suggestedPost3 == null) {
            return;
        }
        nj njVar = u47.b(suggestedPost3).a;
        wjb wjbVar = this.a;
        Paint d = wjbVar != null ? wjbVar.d("paintChatActionText3") : null;
        if (d == null) {
            d = bkb.T0("paintChatActionText3");
        }
        TextPaint textPaint = (TextPaint) d;
        this.g = gl.L(14.0f) << 1;
        ArrayList arrayList = this.c;
        arrayList.clear();
        if (njVar != null && !njVar.l()) {
            arrayList.add(new hbb(new tgb(k96.M0(2131744107, null), textPaint), new tgb(k96.g(njVar.g()), textPaint)));
        }
        if (suggestedPost3.schedule_date > 0) {
            arrayList.add(new hbb(new tgb(k96.M0(2131744106, null), textPaint), new tgb(k96.g(k96.x(suggestedPost3.schedule_date, true)), textPaint)));
        }
        int size = arrayList.size();
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            hbb hbbVar = (hbb) obj;
            f2 = Math.max(f2, hbbVar.a.j());
            f3 = Math.max(f3, hbbVar.b.j());
            int h = ((int) hbbVar.a.h()) + this.g;
            this.g = h;
            this.g = gl.L(7.0f) + h;
        }
        int L = (int) (f3 + f2 + gl.L(11.0f));
        int max = Math.max(L, gl.L(160.0f));
        String k = cf3.k(y6c.t0, k27Var.Z0());
        k27 k27Var2 = k27Var.C;
        TLRPC.Message message2 = k27Var2 != null ? k27Var2.k : null;
        TLRPC.Message message3 = k27Var.k;
        if (message2 == null || (suggestedPost = message2.suggested_post) == null || message3 == null || (suggestedPost2 = message3.suggested_post) == null) {
            f = 11.0f;
            i = 1;
            i2 = 0;
            i3 = 0;
        } else {
            TL_stars.StarsAmount starsAmount = suggestedPost.price;
            f = 11.0f;
            TL_stars.StarsAmount starsAmount2 = suggestedPost2.price;
            nj m = nj.m(starsAmount);
            nj m2 = nj.m(starsAmount2);
            if (m == m2) {
                i = 1;
                i2 = 0;
            } else {
                if (m == null || m2 == null) {
                    i = 1;
                    i2 = 0;
                } else {
                    i2 = 0;
                    i = 1;
                    if (m.a == m2.a) {
                    }
                }
                i5 = i2;
                i3 = i5 ^ 1;
                if (suggestedPost.schedule_date != suggestedPost2.schedule_date) {
                    i3 |= 2;
                }
                if (!TextUtils.equals(k27Var.v, k27Var.C.v)) {
                    i3 |= 4;
                }
                if (!TextUtils.equals(k27Var.z, k27Var.C.z)) {
                    i3 |= 4;
                }
                messageMedia = message2.media;
                messageMedia2 = message3.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaEmpty) {
                    messageMedia = null;
                }
                if (messageMedia2 instanceof TLRPC.TL_messageMediaEmpty) {
                    messageMedia2 = null;
                }
                if (messageMedia != null) {
                    i6 = i;
                } else if (messageMedia2 != null) {
                    if (messageMedia.getClass() == messageMedia2.getClass()) {
                        TLRPC.Photo photo = messageMedia.photo;
                        if (photo != null) {
                            TLRPC.Photo photo2 = messageMedia2.photo;
                            if (photo2 == null) {
                                i7 = i2;
                            }
                        } else {
                            i7 = i;
                        }
                    }
                    i3 |= 8;
                } else {
                    i6 = i2;
                }
            }
            i5 = i;
            i3 = i5 ^ 1;
            if (suggestedPost.schedule_date != suggestedPost2.schedule_date) {
            }
            if (!TextUtils.equals(k27Var.v, k27Var.C.v)) {
            }
            if (!TextUtils.equals(k27Var.z, k27Var.C.z)) {
            }
            messageMedia = message2.media;
            messageMedia2 = message3.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaEmpty) {
            }
            if (messageMedia2 instanceof TLRPC.TL_messageMediaEmpty) {
            }
            if (messageMedia != null) {
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i3 != 0) {
            k27 k27Var3 = k27Var.C;
            if (k27Var3 != null) {
                cf3.k(y6c.t0, k27Var3.Z0());
            }
            StringBuilder sb = new StringBuilder();
            int i9 = i3 & 4;
            int i10 = i3 & 2;
            int i11 = i3 & 8;
            int i12 = i3 & 1;
            int i13 = (i9 != 0 ? 1 : i2) + (i10 != 0 ? 1 : i2) + (i11 != 0 ? 1 : i2) + (i12 != 0 ? 1 : i2);
            if (i12 != 0) {
                b(sb, 2131744100, i13 == 1 ? 1 : i2);
                i4 = 1;
            } else {
                i4 = i2;
            }
            if (i10 != 0) {
                i4++;
                b(sb, 2131744098, i13 == i4 ? 1 : i2);
            }
            if (i9 != 0) {
                i4++;
                b(sb, 2131744099, i13 == i4 ? 1 : i2);
            }
            if (i11 != 0) {
                b(sb, 2131744101, i13 == i4 + 1 ? 1 : i2);
            }
            if (k27Var.O3()) {
                Object[] objArr = new Object[1];
                objArr[i2] = sb;
                spannableStringBuilder.append((CharSequence) k96.a0(null, null, 2131744102, objArr));
            } else {
                Object[] objArr2 = new Object[2];
                objArr2[i2] = k;
                objArr2[1] = sb;
                spannableStringBuilder.append((CharSequence) k96.a0(null, null, 2131744103, objArr2));
            }
        } else if (k27Var.O3()) {
            spannableStringBuilder.append((CharSequence) k96.M0(2131744097, null));
        } else {
            Object[] objArr3 = new Object[i];
            objArr3[i2] = k;
            spannableStringBuilder.append((CharSequence) k96.a0(null, null, 2131744105, objArr3));
        }
        this.b = new StaticLayout(gl.Q2(spannableStringBuilder), textPaint, max, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        int i14 = i2;
        int i15 = i14;
        while (i14 < this.b.getLineCount()) {
            i15 = (int) Math.max(i15, this.b.getLineWidth(i14));
            i14++;
        }
        int height = this.b.getHeight() + this.g;
        this.g = height;
        this.g = gl.L(5.0f) + height;
        int max2 = Math.max(L, i15) + (gl.L(24.0f) << 1);
        this.h = max2;
        this.d = (max2 - max) / 2;
        this.e = (max2 - L) / 2;
        this.f = (int) (gl.L(f) + r1 + f2);
    }
}
