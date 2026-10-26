package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e41 b;

    public /* synthetic */ n31(e41 e41Var, int i10) {
        this.a = i10;
        this.b = e41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e41 e41Var = this.b;
                u31 u31Var = e41Var.G;
                u31Var.C1(true);
                s31 s31Var = e41Var.s;
                s31Var.C1(true);
                e41Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(s31Var);
                AndroidUtilities.updateVisibleRows(u31Var);
                break;
            default:
                e41 e41Var2 = this.b;
                if (e41Var2.l()) {
                    e41Var2.m();
                    break;
                }
                break;
        }
    }
}
