package fh;

import gh.fa;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class j6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u6 b;

    public /* synthetic */ j6(u6 u6Var, int i9) {
        this.a = i9;
        this.b = u6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.X(false);
                break;
            case 1:
                this.b.X(true);
                break;
            case 2:
                u6.T(this.b);
                break;
            case 3:
                k0.T(r0.getContext(), r0.Y, this.b.resourcesProvider);
                break;
            case 4:
                new fa(r0.getContext(), this.b.resourcesProvider).show();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
