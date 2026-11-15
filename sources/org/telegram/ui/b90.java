package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i90 b;

    public /* synthetic */ b90(i90 i90Var, int i7) {
        this.a = i7;
        this.b = i90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        i90 i90Var = this.b;
        switch (i7) {
            case 0:
                vf.c.t(i90Var.getParentActivity(), org.telegram.messenger.hd.M0(2131746156, null));
                break;
            case 1:
                i90Var.r.d.requestFocus();
                org.telegram.messenger.g0.J3(i90Var.r.d);
                break;
            default:
                i90Var.r.d.clearFocus();
                org.telegram.messenger.g0.v1(i90Var.r.d);
                break;
        }
    }
}
