package j9;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
