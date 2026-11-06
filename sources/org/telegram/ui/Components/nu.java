package org.telegram.ui.Components;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ou b;

    public /* synthetic */ nu(ou ouVar, int i7) {
        this.a = i7;
        this.b = ouVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        ou ouVar = this.b;
        switch (i7) {
            case 0:
                ouVar.f.dismiss();
                break;
            default:
                qu quVar = ouVar.f;
                quVar.dismiss();
                org.telegram.ui.ActionBar.f2 f2Var = quVar.j1;
                if (f2Var != null && f2Var.getParentActivity() != null) {
                    org.telegram.messenger.k5.p(null, 2131754435, hc.a0(f2Var), null);
                    break;
                }
                break;
        }
    }
}
