package k2;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class h extends Exception {
    public final int a;
    public final boolean b;

    public h(int i10, boolean z10) {
        super(i2.d.j(i10, "AudioOutput write failed: "));
        this.b = z10;
        this.a = i10;
    }
}
