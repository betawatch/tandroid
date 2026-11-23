package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class yu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zu b;

    public /* synthetic */ yu(zu zuVar, int i7) {
        this.a = i7;
        this.b = zuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        zu zuVar = this.b;
        switch (i7) {
            case 0:
                zuVar.f.dismiss();
                break;
            default:
                bv bvVar = zuVar.f;
                bvVar.dismiss();
                org.telegram.ui.ActionBar.g2 g2Var = bvVar.n1;
                if (g2Var != null && g2Var.getParentActivity() != null) {
                    org.telegram.messenger.f3.o(null, 2131754432, kc.b0(g2Var), null);
                    break;
                }
                break;
        }
    }
}
