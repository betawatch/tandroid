package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class mk extends f2.b1 {
    public final /* synthetic */ tk a;

    public mk(tk tkVar) {
        this.a = tkVar;
    }

    @Override // f2.b1
    public final void a(RecyclerView recyclerView, int i10) {
        lk0 lk0Var;
        tk tkVar = this.a;
        hh.f1 f1Var = tkVar.L;
        gi giVar = tkVar.b;
        boolean z10 = i10 != 0;
        tkVar.H = z10;
        if (!z10 && tkVar.F != null) {
            tkVar.F = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = giVar.getBackgroundPaddingTop();
            if (((giVar.X1[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || (lk0Var = (lk0) f1Var.K(0)) == null) {
                return;
            }
            View view = lk0Var.a;
            if (view.getTop() > tkVar.w0 - tkVar.v0) {
                f1Var.v0(0, view.getTop() - (tkVar.w0 - tkVar.v0), null);
            }
        }
    }

    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        tk tkVar = this.a;
        tkVar.e0();
        if (tkVar.F != null) {
            tkVar.G += i11;
        }
        tkVar.b.X1(tkVar, i11);
    }
}
