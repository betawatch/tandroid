package l2;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements h2.o, h2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ s(float f10, int i7) {
        this.a = i7;
        this.b = f10;
    }

    @Override // h2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                ((p4.i1) obj).d(this.b);
                break;
            default:
                ((p4.i1) obj).T(this.b);
                break;
        }
    }

    @Override // h2.o
    public void invoke(Object obj) {
        ((e2.a1) obj).l(this.b);
    }
}
