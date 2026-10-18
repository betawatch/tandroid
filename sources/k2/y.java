package k2;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class y extends Exception {
    public final int a;
    public final boolean b;
    public final b2.w c;

    public y(int i10, b2.w wVar, boolean z10) {
        super(i2.d.j(i10, "AudioTrack write failed: "));
        this.b = z10;
        this.a = i10;
        this.c = wVar;
    }
}
