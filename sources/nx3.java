// default package

import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nx3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ox3 b;

    public /* synthetic */ nx3(ox3 ox3Var, byte b) {
        this.a = b;
        this.b = ox3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ox3 ox3Var = this.b;
        switch (b) {
            case 0:
                ox3Var.f.dismiss();
                break;
            default:
                qx3 qx3Var = ox3Var.f;
                qx3Var.dismiss();
                d dVar = qx3Var.m1;
                if (dVar != null && dVar.getParentActivity() != null) {
                    yjb.x(null, 2131754432, u21.b0(dVar), null);
                    break;
                }
                break;
        }
    }
}
