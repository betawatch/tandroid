package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class sk extends f2.z0 {
    public final /* synthetic */ al a;

    public sk(al alVar) {
        this.a = alVar;
    }

    @Override // f2.z0
    public final void a(RecyclerView recyclerView, int i10) {
        dl0 dl0Var;
        al alVar = this.a;
        lh.e1 e1Var = alVar.M;
        li liVar = alVar.b;
        boolean z4 = i10 != 0;
        alVar.I = z4;
        if (!z4 && alVar.G != null) {
            alVar.G = null;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(13.0f);
            int backgroundPaddingTop = liVar.getBackgroundPaddingTop();
            if (((liVar.Y1[0] - backgroundPaddingTop) - dp) + backgroundPaddingTop >= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() || (dl0Var = (dl0) e1Var.K(0)) == null) {
                return;
            }
            View view = dl0Var.a;
            if (view.getTop() > alVar.x0 - alVar.w0) {
                e1Var.v0(0, view.getTop() - (alVar.x0 - alVar.w0), null);
            }
        }
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        al alVar = this.a;
        alVar.e0();
        if (alVar.G != null) {
            alVar.H += i11;
        }
        alVar.b.X1(alVar, i11);
    }
}
