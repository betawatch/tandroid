package ee;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class v implements fb.n {
    public final /* synthetic */ int a;
    public String b;

    @Override // fb.n
    public Object p2() {
        throw new db.j(this.b);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "<" + this.b + '>';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ v(String str, int i10) {
        this.a = i10;
        this.b = str;
    }
}
