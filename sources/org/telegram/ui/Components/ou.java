package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ou implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pu b;

    public /* synthetic */ ou(pu puVar, int i7) {
        this.a = i7;
        this.b = puVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        pu puVar = this.b;
        switch (i7) {
            case 0:
                puVar.f.dismiss();
                break;
            default:
                ru ruVar = puVar.f;
                ruVar.dismiss();
                org.telegram.ui.ActionBar.f2 f2Var = ruVar.j1;
                if (f2Var != null && f2Var.getParentActivity() != null) {
                    org.telegram.messenger.k5.p(null, 2131754435, hc.a0(f2Var), null);
                    break;
                }
                break;
        }
    }
}
