package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p60 b;

    public /* synthetic */ g60(p60 p60Var, int i10) {
        this.a = i10;
        this.b = p60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                p60 p60Var = this.b;
                p60Var.f.r.clearFocus();
                p60Var.f.r.requestFocus();
                AndroidUtilities.showKeyboard(p60Var.f.r);
                break;
            case 1:
                this.b.o0();
                break;
            case 2:
                p60 p60Var2 = this.b;
                p60Var2.n0(p60Var2.l0());
                break;
            case 3:
                p60 p60Var3 = this.b;
                p60Var3.n0(p60Var3.l0());
                break;
            default:
                p60 p60Var4 = this.b;
                p60Var4.X = null;
                p60Var4.Z.b();
                p60Var4.h.b();
                p60Var4.k0();
                p60Var4.r0();
                p60Var4.s0();
                break;
        }
    }
}
