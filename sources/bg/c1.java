package bg;

import android.content.DialogInterface;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h1 b;

    public /* synthetic */ c1(h1 h1Var, int i9) {
        this.a = i9;
        this.b = h1Var;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                dg.u uVar = this.b.c0.r;
                if (uVar != null) {
                    uVar.setPaused(true);
                    break;
                }
                break;
            default:
                dg.u uVar2 = this.b.c0.r;
                if (uVar2 != null) {
                    uVar2.setPaused(true);
                    break;
                }
                break;
        }
    }
}
