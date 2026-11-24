// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
                        gl.d3(new jc((byte) 28), 500L);
                        break;
                    }
                }
                break;
            default:
                if (view instanceof uf3) {
                    oh3Var.P0.F0.i((uf3) view, false);
                    if (z) {
                        gl.d3(new jc((byte) 28), 500L);
                        break;
                    }
                }
                break;
        }
    }
}
