package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class no0 extends org.telegram.ui.Components.zk0 {
    public final /* synthetic */ int T2;
    public final /* synthetic */ vo0 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no0(vo0 vo0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.U2 = vo0Var;
        this.T2 = i10;
    }

    @Override // org.telegram.ui.Components.zk0
    public final Integer W0(int i10) {
        vo0 vo0Var = this.U2;
        if ((i10 < vo0Var.P || i10 >= vo0Var.Q) && (i10 < vo0Var.R || i10 >= vo0Var.S)) {
            return super.W0(i10);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        O0(canvas, this.U2.P, Math.max(r0.S, r0.Q) - 1, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, this.l2), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        vo0 vo0Var = this.U2;
        ap0 ap0Var = vo0Var.f0;
        vo0.a(vo0Var);
        if (vo0Var.B != null) {
            if (vo0Var.A == null || !vo0Var.c()) {
                return;
            }
            vo0Var.A.g(false);
            return;
        }
        hh.m7 m7Var = this.T2 == 1 ? ap0Var.c : ap0Var.b;
        if (m7Var == null || !vo0Var.c()) {
            return;
        }
        m7Var.a();
    }

    @Override // org.telegram.ui.Components.zk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        vo0.a(this.U2);
    }
}
