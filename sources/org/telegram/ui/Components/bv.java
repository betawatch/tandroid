package org.telegram.ui.Components;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cv b;

    public /* synthetic */ bv(cv cvVar, int i7) {
        this.a = i7;
        this.b = cvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        cv cvVar = this.b;
        switch (i7) {
            case 0:
                cvVar.f.dismiss();
                break;
            default:
                ev evVar = cvVar.f;
                evVar.dismiss();
                org.telegram.ui.ActionBar.g2 g2Var = evVar.n1;
                if (g2Var != null && g2Var.getParentActivity() != null) {
                    org.telegram.messenger.f3.o(null, 2131754432, lc.b0(g2Var), null);
                    break;
                }
                break;
        }
    }
}
