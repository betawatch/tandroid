package ca;

import a8.p0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
