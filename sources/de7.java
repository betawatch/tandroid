// default package

import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class de7 extends uj5 {
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public de7(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = iArr;
        this.f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || de7.class != obj.getClass()) {
            return false;
        }
        de7 de7Var = (de7) obj;
        return this.b == de7Var.b && this.c == de7Var.c && this.d == de7Var.d && Arrays.equals(this.e, de7Var.e) && Arrays.equals(this.f, de7Var.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((((527 + this.b) * 31) + this.c) * 31) + this.d) * 31)) * 31);
    }
}
