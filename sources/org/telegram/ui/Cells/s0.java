package org.telegram.ui.Cells;

import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;

    public /* synthetic */ s0(w0 w0Var, int i9) {
        this.a = i9;
        this.b = w0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.J();
                break;
            case 1:
                w0 w0Var = this.b;
                t0 t0Var = w0Var.T0;
                if (t0Var != null) {
                    t0Var.p1(w0Var);
                    break;
                }
                break;
            case 2:
                w0 w0Var2 = this.b;
                w0Var2.post(new s0(w0Var2, 4));
                break;
            case 3:
                this.b.requestLayout();
                break;
            default:
                w0 w0Var3 = this.b;
                w0Var3.C = false;
                w0Var3.getMessageObject().isSpoilersRevealed = true;
                ArrayList arrayList = w0Var3.g1.c;
                if (arrayList != null) {
                    arrayList.clear();
                }
                w0Var3.invalidate();
                break;
        }
    }
}
