package org.telegram.ui.Cells;

import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ s0(v0 v0Var, int i10) {
        this.a = i10;
        this.b = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.J();
                break;
            case 1:
                v0 v0Var = this.b;
                t0 t0Var = v0Var.U0;
                if (t0Var != null) {
                    t0Var.D1(v0Var);
                    break;
                }
                break;
            case 2:
                v0 v0Var2 = this.b;
                v0Var2.post(new s0(v0Var2, 4));
                break;
            case 3:
                this.b.requestLayout();
                break;
            default:
                v0 v0Var3 = this.b;
                v0Var3.D = false;
                v0Var3.getMessageObject().isSpoilersRevealed = true;
                ArrayList arrayList = v0Var3.h1.e;
                if (arrayList != null) {
                    arrayList.clear();
                }
                v0Var3.invalidate();
                break;
        }
    }
}
