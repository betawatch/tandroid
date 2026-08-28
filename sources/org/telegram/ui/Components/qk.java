package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qk extends f2.d1 {
    public final /* synthetic */ xk a;

    public qk(xk xkVar) {
        this.a = xkVar;
    }

    @Override // f2.d1
    public final void a(RecyclerView recyclerView, int i9) {
        ik0 ik0Var;
        xk xkVar = this.a;
        gh.f1 f1Var = xkVar.L;
        ki kiVar = xkVar.b;
        boolean z10 = i9 != 0;
        xkVar.H = z10;
        if (!z10 && xkVar.F != null) {
            xkVar.F = null;
        }
        if (i9 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = kiVar.getBackgroundPaddingTop();
            if (((kiVar.X1[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || (ik0Var = (ik0) f1Var.K(0)) == null) {
                return;
            }
            View view = ik0Var.a;
            if (view.getTop() > xkVar.w0 - xkVar.v0) {
                f1Var.v0(0, view.getTop() - (xkVar.w0 - xkVar.v0), null);
            }
        }
    }

    @Override // f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        xk xkVar = this.a;
        xkVar.d0();
        if (xkVar.F != null) {
            xkVar.G += i10;
        }
        xkVar.b.X1(xkVar, i10);
    }
}
