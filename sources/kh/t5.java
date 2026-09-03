package kh;

import lh.aa;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class t5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d6 b;

    public /* synthetic */ t5(d6 d6Var, int i10) {
        this.a = i10;
        this.b = d6Var;
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
                d6.U(this.b);
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
