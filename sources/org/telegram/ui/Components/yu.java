package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
