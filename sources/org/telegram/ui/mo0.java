package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mo0 extends org.telegram.ui.Components.wk0 {
    public final /* synthetic */ int T2;
    public final /* synthetic */ uo0 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo0(uo0 uo0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, b6Var);
        this.U2 = uo0Var;
        this.T2 = i9;
    }

    @Override // org.telegram.ui.Components.wk0
    public final Integer W0(int i9) {
        uo0 uo0Var = this.U2;
        if ((i9 < uo0Var.P || i9 >= uo0Var.Q) && (i9 < uo0Var.R || i9 >= uo0Var.S)) {
            return super.W0(i9);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        O0(canvas, this.U2.P, Math.max(r0.S, r0.Q) - 1, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, this.l2), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        uo0 uo0Var = this.U2;
        zo0 zo0Var = uo0Var.f0;
        uo0.a(uo0Var);
        if (uo0Var.B != null) {
            if (uo0Var.A == null || !uo0Var.c()) {
                return;
            }
            uo0Var.A.g(false);
            return;
        }
        gh.n7 n7Var = this.T2 == 1 ? zo0Var.c : zo0Var.b;
        if (n7Var == null || !uo0Var.c()) {
            return;
        }
        n7Var.a();
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        uo0.a(this.U2);
    }
}
