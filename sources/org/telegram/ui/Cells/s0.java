package org.telegram.ui.Cells;

import java.util.ArrayList;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;

    public /* synthetic */ s0(w0 w0Var, int i10) {
        this.a = i10;
        this.b = w0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.K();
                break;
            case 1:
                w0 w0Var = this.b;
                t0 t0Var = w0Var.X0;
                if (t0Var != null) {
                    t0Var.y1(w0Var);
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
                w0Var3.G = false;
                w0Var3.getMessageObject().isSpoilersRevealed = true;
                ArrayList arrayList = w0Var3.k1.c;
                if (arrayList != null) {
                    arrayList.clear();
                }
                w0Var3.invalidate();
                break;
        }
    }
}
