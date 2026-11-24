// default package

import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nh3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oh3 b;
    public final /* synthetic */ View c;

    public /* synthetic */ nh3(oh3 oh3Var, View view, byte b) {
        this.a = b;
        this.b = oh3Var;
        this.c = view;
    }

    public final void a(boolean z) {
        byte b = this.a;
        View view = this.c;
        oh3 oh3Var = this.b;
        switch (b) {
            case 0:
                if (view instanceof uf3) {
                    oh3Var.P0.F0.i((uf3) view, false);
                    if (z) {
                        gl.e3(new jc((byte) 28), 500L);
                        break;
                    }
                }
                break;
            default:
                if (view instanceof uf3) {
                    oh3Var.P0.F0.i((uf3) view, false);
                    if (z) {
                        gl.e3(new jc((byte) 28), 500L);
                        break;
                    }
                }
                break;
        }
    }
}
