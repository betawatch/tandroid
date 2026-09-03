package lh;

import mh.aa;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class u5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e6 b;

    public /* synthetic */ u5(e6 e6Var, int i10) {
        this.a = i10;
        this.b = e6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Y(false);
                break;
            case 1:
                this.b.Y(true);
                break;
            case 2:
                e6.U(this.b);
                break;
            case 3:
                f0.U(r0.getContext(), r0.Z, this.b.resourcesProvider);
                break;
            case 4:
                new aa(r0.getContext(), this.b.resourcesProvider).show();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
