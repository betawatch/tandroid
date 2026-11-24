// default package

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class oeb {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public float[] f;
    public boolean g;

    public final int a(int i) {
        if (i <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i2 = 0;
        for (float f : this.f) {
            i2 = f <= i ? i2 + 1 : i2 + ((int) Math.ceil((r3 * 1.12f) / r4));
        }
        return Math.max(1, i2);
    }

    public final int b(int i) {
        int i2;
        int i3;
        if (!this.g && i > 1 && this.f != null) {
            int i4 = this.d;
            int i5 = this.e;
            if (i4 < i5) {
                if (a(i5) > i) {
                    i2 = this.c;
                    i3 = this.e;
                    return i2 + i3;
                }
                int i6 = this.d;
                int i7 = this.e;
                while (i6 < i7) {
                    int i8 = (i6 + i7) >>> 1;
                    if (a(i8) <= i) {
                        i7 = i8;
                    } else {
                        i6 = i8 + 1;
                    }
                }
                return this.c + i6;
            }
        }
        i2 = this.c;
        i3 = this.e;
        return i2 + i3;
    }
}
