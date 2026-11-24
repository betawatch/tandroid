// default package

import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jkc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nkc b;

    public /* synthetic */ jkc(nkc nkcVar, byte b) {
        this.a = b;
        this.b = nkcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        nkc nkcVar = this.b;
        switch (b) {
            case 0:
                uk1 uk1Var = nkcVar.a;
                if (uk1Var.getParent() instanceof View) {
                    ((View) uk1Var.getParent()).invalidate();
                    break;
                }
                break;
            default:
                nkcVar.p();
                break;
        }
    }
}
