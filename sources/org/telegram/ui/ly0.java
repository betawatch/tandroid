package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ly0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oy0 b;

    public /* synthetic */ ly0(oy0 oy0Var, int i7) {
        this.a = i7;
        this.b = oy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                oy0 oy0Var = this.b;
                py0 py0Var = oy0Var.w;
                if (oy0Var.a != 0) {
                    py0Var.onBackPressed();
                    break;
                } else {
                    py0Var.dismiss();
                    break;
                }
            default:
                org.telegram.messenger.g0.I3(this.b.n.d);
                break;
        }
    }
}
