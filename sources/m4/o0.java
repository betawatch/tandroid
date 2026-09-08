package m4;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ o0(float f7, int i10) {
        this.a = i10;
        this.b = f7;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((j1) obj).a(this.b);
                break;
            default:
                ((j1) obj).U(this.b);
                break;
        }
    }
}
