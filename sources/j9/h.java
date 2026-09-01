package j9;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        StringBuilder sb = new StringBuilder();
        sb.append(h.class.getSimpleName());
        sb.append("[position = ");
        sb.append(this.a);
        sb.append(", length = ");
        return android.support.v4.media.a.m(this.b, "]", sb);
    }
}
