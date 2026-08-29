package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;

    public /* synthetic */ c(g0 g0Var, int i10) {
        this.a = i10;
        this.b = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g0 g0Var = this.b;
                if (!g0Var.G0) {
                    g0Var.z0.setVisibility(8);
                    break;
                }
                break;
            case 1:
                g0 g0Var2 = this.b;
                if (g0Var2.G0) {
                    g0Var2.y0.setVisibility(8);
                    break;
                }
                break;
            case 2:
                AndroidUtilities.showKeyboard(this.b.w0.b);
                break;
            case 3:
                g0 g0Var3 = this.b;
                g0Var3.l0(0, 0, false);
                g0Var3.dismiss();
                break;
            default:
                g0.Q(this.b);
                break;
        }
    }
}
