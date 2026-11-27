// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b67 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q67 b;

    public /* synthetic */ b67(q67 q67Var, byte b) {
        this.a = b;
        this.b = q67Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 0;
        q67 q67Var = this.b;
        switch (b) {
            case 0:
                q67Var.l();
                break;
            case 1:
                q67Var.getClass();
                mpa.f(false);
                mpa mpaVar = q67Var.i0;
                if (mpaVar != null) {
                    mpaVar.b(q67Var.F);
                }
                hl.c3(new b67(q67Var, b2));
                break;
            case 2:
                mpa.f(false);
                mpa mpaVar2 = q67Var.i0;
                if (mpaVar2 != null) {
                    mpaVar2.b(q67Var.F);
                }
                hl.c3(new b67(q67Var, (byte) 3));
                break;
            default:
                q67Var.k();
                break;
        }
    }
}
