package ca;

import a8.p0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class j {
    public static final j c = new j(0, 0);
    public final int a;
    public final int b;

    public j(int i7, int i10) {
        this.a = i7;
        this.b = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j.class.getSimpleName());
        sb2.append("[position = ");
        sb2.append(this.a);
        sb2.append(", length = ");
        return p0.n(this.b, "]", sb2);
    }
}
