package h9;

import a4.w;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h {
    public static final h c = new h(0, 0);
    public final int a;
    public final int b;

    public h(int i10, int i11) {
        this.a = i10;
        this.b = i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h.class.getSimpleName());
        sb2.append("[position = ");
        sb2.append(this.a);
        sb2.append(", length = ");
        return w.l(this.b, "]", sb2);
    }
}
