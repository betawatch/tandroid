// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fg7 extends tl5 {
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public fg7(int i, int i2, int i3, int[] iArr, int[] iArr2) {
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
        if (obj == null || fg7.class != obj.getClass()) {
            return false;
        }
        fg7 fg7Var = (fg7) obj;
        return this.b == fg7Var.b && this.c == fg7Var.c && this.d == fg7Var.d && Arrays.equals(this.e, fg7Var.e) && Arrays.equals(this.f, fg7Var.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((((527 + this.b) * 31) + this.c) * 31) + this.d) * 31)) * 31);
    }
}
