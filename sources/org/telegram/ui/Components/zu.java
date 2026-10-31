package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class zu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ av b;

    public /* synthetic */ zu(av avVar, int i10) {
        this.a = i10;
        this.b = avVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        av avVar = this.b;
        switch (i10) {
            case 0:
                avVar.f.dismiss();
                break;
            default:
                cv cvVar = avVar.f;
                cvVar.dismiss();
                org.telegram.ui.ActionBar.k2 k2Var = cvVar.j1;
                if (k2Var != null && k2Var.getParentActivity() != null) {
                    org.telegram.messenger.m5.o(null, 2131754435, cc.a0(k2Var), null);
                    break;
                }
                break;
        }
    }
}
