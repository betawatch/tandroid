package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                org.telegram.ui.ActionBar.h2 h2Var = bvVar.n1;
                if (h2Var != null && h2Var.getParentActivity() != null) {
                    org.telegram.messenger.f3.o(null, 2131754433, lc.b0(h2Var), null);
                    break;
                }
                break;
        }
    }
}
