package i4;

import android.text.Layout;
import com.google.android.gms.internal.vision.e2;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class g {
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

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0075, code lost:
    
        if (r5 == 0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d2.a a() {
        Layout.Alignment alignment;
        float f7;
        CharSequence charSequence;
        float f10 = this.h;
        float f11 = -3.4028235E38f;
        if (f10 == -3.4028235E38f) {
            int i10 = this.d;
            f10 = i10 != 4 ? i10 != 5 ? 0.5f : 1.0f : 0.0f;
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
        d2.a aVar = new d2.a();
        int i13 = this.d;
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 != 4) {
                        if (i13 != 5) {
                            e2.n(i13, "Unknown textAlignment: ", "WebvttCueParser");
                            alignment = null;
                        }
                    }
                }
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            aVar.c = alignment;
            f7 = this.e;
            int i14 = this.f;
            if (f7 != -3.4028235E38f || i14 != 0 || (f7 >= 0.0f && f7 <= 1.0f)) {
                if (f7 == -3.4028235E38f) {
                    f11 = f7;
                }
                aVar.e = f11;
                aVar.f = i14;
                aVar.g = this.g;
                aVar.h = f10;
                aVar.i = i11;
                float f12 = this.j;
                if (i11 == 0) {
                    f10 = 1.0f - f10;
                } else if (i11 == 1) {
                    f10 = f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
                } else if (i11 != 2) {
                    throw new IllegalStateException(String.valueOf(i11));
                }
                aVar.l = Math.min(f12, f10);
                aVar.p = this.k;
                charSequence = this.c;
                if (charSequence != null) {
                    aVar.a = charSequence;
                    aVar.b = null;
                }
                return aVar;
            }
            f11 = 1.0f;
            aVar.e = f11;
            aVar.f = i14;
            aVar.g = this.g;
            aVar.h = f10;
            aVar.i = i11;
            float f122 = this.j;
            if (i11 == 0) {
            }
            aVar.l = Math.min(f122, f10);
            aVar.p = this.k;
            charSequence = this.c;
            if (charSequence != null) {
            }
            return aVar;
        }
        alignment = Layout.Alignment.ALIGN_NORMAL;
        aVar.c = alignment;
        f7 = this.e;
        int i142 = this.f;
        if (f7 != -3.4028235E38f) {
        }
        if (f7 == -3.4028235E38f) {
        }
        aVar.e = f11;
        aVar.f = i142;
        aVar.g = this.g;
        aVar.h = f10;
        aVar.i = i11;
        float f1222 = this.j;
        if (i11 == 0) {
        }
        aVar.l = Math.min(f1222, f10);
        aVar.p = this.k;
        charSequence = this.c;
        if (charSequence != null) {
        }
        return aVar;
    }
}
