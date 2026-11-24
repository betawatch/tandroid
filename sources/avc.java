// default package

import android.text.Layout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class avc {
    public CharSequence c;
    public long a = 0;
    public long b = 0;
    public byte d = 2;
    public float e = -3.4028235E38f;
    public boolean f = true;
    public int g = 0;
    public float h = -3.4028235E38f;
    public int i = TLObject.FLAG_31;
    public float j = 1.0f;
    public int k = TLObject.FLAG_31;

    /* JADX WARN: Code restructure failed: missing block: B:52:0x006e, code lost:
    
        if (r7 == false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t33 a() {
        Layout.Alignment alignment;
        float f;
        CharSequence charSequence;
        float f2 = this.h;
        float f3 = -3.4028235E38f;
        if (f2 == -3.4028235E38f) {
            byte b = this.d;
            f2 = b != 4 ? b != 5 ? 0.5f : 1.0f : 0.0f;
        }
        int i = this.i;
        if (i == Integer.MIN_VALUE) {
            byte b2 = this.d;
            if (b2 != 1) {
                if (b2 != 3) {
                    if (b2 != 4) {
                        if (b2 != 5) {
                            i = 1;
                        }
                    }
                }
                i = 2;
            }
            i = 0;
        }
        t33 t33Var = new t33();
        byte b3 = this.d;
        if (b3 != 1) {
            if (b3 != 2) {
                if (b3 != 3) {
                    if (b3 != 4) {
                        if (b3 != 5) {
                            b00.o(b3, "Unknown textAlignment: ", "WebvttCueParser");
                            alignment = null;
                        }
                    }
                }
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            t33Var.c = alignment;
            f = this.e;
            boolean z = this.f;
            if (f != -3.4028235E38f || z || (f >= 0.0f && f <= 1.0f)) {
                if (f == -3.4028235E38f) {
                    f3 = f;
                }
                t33Var.e = f3;
                t33Var.f = z ? 1 : 0;
                t33Var.g = this.g;
                t33Var.h = f2;
                t33Var.i = i;
                float f4 = this.j;
                if (i == 0) {
                    f2 = 1.0f - f2;
                } else if (i == 1) {
                    f2 = f2 <= 0.5f ? f2 * 2.0f : (1.0f - f2) * 2.0f;
                } else if (i != 2) {
                    sc8.j(String.valueOf(i));
                    return null;
                }
                t33Var.l = Math.min(f4, f2);
                t33Var.p = this.k;
                charSequence = this.c;
                if (charSequence != null) {
                    t33Var.a = charSequence;
                    t33Var.b = null;
                }
                return t33Var;
            }
            f3 = 1.0f;
            t33Var.e = f3;
            t33Var.f = z ? 1 : 0;
            t33Var.g = this.g;
            t33Var.h = f2;
            t33Var.i = i;
            float f42 = this.j;
            if (i == 0) {
            }
            t33Var.l = Math.min(f42, f2);
            t33Var.p = this.k;
            charSequence = this.c;
            if (charSequence != null) {
            }
            return t33Var;
        }
        alignment = Layout.Alignment.ALIGN_NORMAL;
        t33Var.c = alignment;
        f = this.e;
        boolean z2 = this.f;
        if (f != -3.4028235E38f) {
        }
        if (f == -3.4028235E38f) {
        }
        t33Var.e = f3;
        t33Var.f = z2 ? 1 : 0;
        t33Var.g = this.g;
        t33Var.h = f2;
        t33Var.i = i;
        float f422 = this.j;
        if (i == 0) {
        }
        t33Var.l = Math.min(f422, f2);
        t33Var.p = this.k;
        charSequence = this.c;
        if (charSequence != null) {
        }
        return t33Var;
    }
}
