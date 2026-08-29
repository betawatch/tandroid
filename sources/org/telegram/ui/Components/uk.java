package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class uk extends f2.a1 {
    public final /* synthetic */ bl a;

    public uk(bl blVar) {
        this.a = blVar;
    }

    @Override // f2.a1
    public final void a(RecyclerView recyclerView, int i10) {
        vk0 vk0Var;
        bl blVar = this.a;
        jh.e1 e1Var = blVar.L;
        ni niVar = blVar.b;
        boolean z10 = i10 != 0;
        blVar.H = z10;
        if (!z10 && blVar.F != null) {
            blVar.F = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = niVar.getBackgroundPaddingTop();
            if (((niVar.X1[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop >= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() || (vk0Var = (vk0) e1Var.K(0)) == null) {
                return;
            }
            View view = vk0Var.a;
            if (view.getTop() > blVar.w0 - blVar.v0) {
                e1Var.v0(0, view.getTop() - (blVar.w0 - blVar.v0), null);
            }
        }
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bl blVar = this.a;
        blVar.e0();
        if (blVar.F != null) {
            blVar.G += i11;
        }
        blVar.b.X1(blVar, i11);
    }
}
