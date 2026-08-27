package a5;

import android.text.Layout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j {
    public CharSequence c;
    public long a = 0;
    public long b = 0;
    public int d = 2;
    public float e = -3.4028235E38f;
    public int f = 1;
    public int g = 0;
    public float h = -3.4028235E38f;
    public int i = TLObject.FLAG_31;
    public float j = 1.0f;
    public int k = TLObject.FLAG_31;

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0074, code lost:
    
        if (r5 == 0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r4.b a() {
        Layout.Alignment alignment;
        float f10;
        CharSequence charSequence;
        float f11 = this.h;
        float f12 = -3.4028235E38f;
        if (f11 == -3.4028235E38f) {
            int i10 = this.d;
            f11 = i10 != 4 ? i10 != 5 ? 0.5f : 1.0f : 0.0f;
        }
        int i11 = this.i;
        if (i11 == Integer.MIN_VALUE) {
            int i12 = this.d;
            if (i12 != 1) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            i11 = 1;
                        }
                    }
                }
                i11 = 2;
            }
            i11 = 0;
        }
        r4.b bVar = new r4.b();
        int i13 = this.d;
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 != 4) {
                        if (i13 != 5) {
                            com.google.android.recaptcha.internal.a.s(i13, "Unknown textAlignment: ", "WebvttCueParser");
                            alignment = null;
                        }
                    }
                }
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            bVar.c = alignment;
            f10 = this.e;
            int i14 = this.f;
            if (f10 != -3.4028235E38f || i14 != 0 || (f10 >= 0.0f && f10 <= 1.0f)) {
                if (f10 == -3.4028235E38f) {
                    f12 = f10;
                }
                bVar.e = f12;
                bVar.f = i14;
                bVar.g = this.g;
                bVar.h = f11;
                bVar.i = i11;
                float f13 = this.j;
                if (i11 == 0) {
                    f11 = 1.0f - f11;
                } else if (i11 == 1) {
                    f11 = f11 <= 0.5f ? f11 * 2.0f : (1.0f - f11) * 2.0f;
                } else if (i11 != 2) {
                    throw new IllegalStateException(String.valueOf(i11));
                }
                bVar.l = Math.min(f13, f11);
                bVar.p = this.k;
                charSequence = this.c;
                if (charSequence != null) {
                    bVar.a = charSequence;
                }
                return bVar;
            }
            f12 = 1.0f;
            bVar.e = f12;
            bVar.f = i14;
            bVar.g = this.g;
            bVar.h = f11;
            bVar.i = i11;
            float f132 = this.j;
            if (i11 == 0) {
            }
            bVar.l = Math.min(f132, f11);
            bVar.p = this.k;
            charSequence = this.c;
            if (charSequence != null) {
            }
            return bVar;
        }
        alignment = Layout.Alignment.ALIGN_NORMAL;
        bVar.c = alignment;
        f10 = this.e;
        int i142 = this.f;
        if (f10 != -3.4028235E38f) {
        }
        if (f10 == -3.4028235E38f) {
        }
        bVar.e = f12;
        bVar.f = i142;
        bVar.g = this.g;
        bVar.h = f11;
        bVar.i = i11;
        float f1322 = this.j;
        if (i11 == 0) {
        }
        bVar.l = Math.min(f1322, f11);
        bVar.p = this.k;
        charSequence = this.c;
        if (charSequence != null) {
        }
        return bVar;
    }
}
