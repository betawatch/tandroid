package a5;

import android.text.Layout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i {
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
    public final r4.a a() {
        Layout.Alignment alignment;
        float f10;
        CharSequence charSequence;
        float f11 = this.h;
        float f12 = -3.4028235E38f;
        if (f11 == -3.4028235E38f) {
            int i9 = this.d;
            f11 = i9 != 4 ? i9 != 5 ? 0.5f : 1.0f : 0.0f;
        }
        int i10 = this.i;
        if (i10 == Integer.MIN_VALUE) {
            int i11 = this.d;
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            i10 = 1;
                        }
                    }
                }
                i10 = 2;
            }
            i10 = 0;
        }
        r4.a aVar = new r4.a();
        int i12 = this.d;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            e2.c.t(i12, "Unknown textAlignment: ", "WebvttCueParser");
                            alignment = null;
                        }
                    }
                }
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            aVar.c = alignment;
            f10 = this.e;
            int i13 = this.f;
            if (f10 != -3.4028235E38f || i13 != 0 || (f10 >= 0.0f && f10 <= 1.0f)) {
                if (f10 == -3.4028235E38f) {
                    f12 = f10;
                }
                aVar.e = f12;
                aVar.f = i13;
                aVar.g = this.g;
                aVar.h = f11;
                aVar.i = i10;
                float f13 = this.j;
                if (i10 == 0) {
                    f11 = 1.0f - f11;
                } else if (i10 == 1) {
                    f11 = f11 <= 0.5f ? f11 * 2.0f : (1.0f - f11) * 2.0f;
                } else if (i10 != 2) {
                    throw new IllegalStateException(String.valueOf(i10));
                }
                aVar.l = Math.min(f13, f11);
                aVar.p = this.k;
                charSequence = this.c;
                if (charSequence != null) {
                    aVar.a = charSequence;
                }
                return aVar;
            }
            f12 = 1.0f;
            aVar.e = f12;
            aVar.f = i13;
            aVar.g = this.g;
            aVar.h = f11;
            aVar.i = i10;
            float f132 = this.j;
            if (i10 == 0) {
            }
            aVar.l = Math.min(f132, f11);
            aVar.p = this.k;
            charSequence = this.c;
            if (charSequence != null) {
            }
            return aVar;
        }
        alignment = Layout.Alignment.ALIGN_NORMAL;
        aVar.c = alignment;
        f10 = this.e;
        int i132 = this.f;
        if (f10 != -3.4028235E38f) {
        }
        if (f10 == -3.4028235E38f) {
        }
        aVar.e = f12;
        aVar.f = i132;
        aVar.g = this.g;
        aVar.h = f11;
        aVar.i = i10;
        float f1322 = this.j;
        if (i10 == 0) {
        }
        aVar.l = Math.min(f1322, f11);
        aVar.p = this.k;
        charSequence = this.c;
        if (charSequence != null) {
        }
        return aVar;
    }
}
