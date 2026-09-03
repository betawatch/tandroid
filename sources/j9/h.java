package j9;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
