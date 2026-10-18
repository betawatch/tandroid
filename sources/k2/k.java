package k2;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class k {
    public int a = 0;
    public boolean b;
    public boolean c;
    public boolean d;

    public l a() {
        if (this.b || !(this.c || this.d)) {
            return new l(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }
}
