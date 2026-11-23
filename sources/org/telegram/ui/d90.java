package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class d90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k90 b;

    public /* synthetic */ d90(k90 k90Var, int i7) {
        this.a = i7;
        this.b = k90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        k90 k90Var = this.b;
        switch (i7) {
            case 0:
                vf.c.t(k90Var.getParentActivity(), org.telegram.messenger.hd.N0(2131745960, null));
                break;
            case 1:
                k90Var.r.d.requestFocus();
                org.telegram.messenger.g0.I3(k90Var.r.d);
                break;
            default:
                k90Var.r.d.clearFocus();
                org.telegram.messenger.g0.v1(k90Var.r.d);
                break;
        }
    }
}
