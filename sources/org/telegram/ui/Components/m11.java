package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d21 b;

    public /* synthetic */ m11(d21 d21Var, int i10) {
        this.a = i10;
        this.b = d21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d21 d21Var = this.b;
                t11 t11Var = d21Var.C;
                t11Var.w1(true);
                r11 r11Var = d21Var.s;
                r11Var.w1(true);
                d21Var.F.a(true, true);
                AndroidUtilities.updateVisibleRows(r11Var);
                AndroidUtilities.updateVisibleRows(t11Var);
                break;
            default:
                d21 d21Var2 = this.b;
                if (d21Var2.k()) {
                    d21Var2.l();
                    break;
                }
                break;
        }
    }
}
