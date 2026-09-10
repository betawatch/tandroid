package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class s21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k31 b;

    public /* synthetic */ s21(k31 k31Var, int i10) {
        this.a = i10;
        this.b = k31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k31 k31Var = this.b;
                a31 a31Var = k31Var.G;
                a31Var.v1(true);
                y21 y21Var = k31Var.s;
                y21Var.v1(true);
                k31Var.J.a(true, true);
                AndroidUtilities.updateVisibleRows(y21Var);
                AndroidUtilities.updateVisibleRows(a31Var);
                break;
            default:
                k31 k31Var2 = this.b;
                if (k31Var2.k()) {
                    k31Var2.l();
                    break;
                }
                break;
        }
    }
}
