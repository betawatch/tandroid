package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r60 b;

    public /* synthetic */ g60(r60 r60Var, int i10) {
        this.a = i10;
        this.b = r60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                r60 r60Var = this.b;
                r60Var.X = null;
                r60Var.Z.b();
                r60Var.h.b();
                r60Var.l0();
                r60Var.s0();
                r60Var.t0();
                break;
            case 1:
                r60 r60Var2 = this.b;
                r60Var2.f.r.clearFocus();
                r60Var2.f.r.requestFocus();
                AndroidUtilities.showKeyboard(r60Var2.f.r);
                break;
            case 2:
                this.b.p0();
                break;
            case 3:
                r60 r60Var3 = this.b;
                r60Var3.o0(r60Var3.m0());
                break;
            default:
                r60 r60Var4 = this.b;
                r60Var4.o0(r60Var4.m0());
                break;
        }
    }
}
