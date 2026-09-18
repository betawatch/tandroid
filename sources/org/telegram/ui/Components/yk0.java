package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class yk0 extends s4.n0 implements bh.a {
    public final Utilities.CallbackReturn a;
    public final ml0 b;
    public final int c;
    public final boolean d;

    public yk0(ml0 ml0Var, Utilities.CallbackReturn callbackReturn, int i10, boolean z10) {
        this.b = ml0Var;
        this.a = callbackReturn;
        this.c = i10;
        this.d = z10;
    }

    @Override // s4.n0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int b10;
        if (((Boolean) this.a.run(view)).booleanValue()) {
            int i10 = this.c;
            rect.right = i10;
            rect.left = i10;
            s4.c1 U = recyclerView.U(view);
            s4.h0 adapter = recyclerView.getAdapter();
            if (U == null || adapter == null || (b10 = U.b()) == -1) {
                return;
            }
            boolean z10 = b10 == 0;
            boolean z11 = b10 == adapter.h() - 1;
            if (z10) {
                rect.top = this.d ? i10 : AndroidUtilities.dp(4.0f);
            }
            if (z11) {
                rect.bottom = i10;
            }
        }
    }

    @Override // bh.a
    public final void b(ah.a aVar, RectF rectF) {
        aVar.a = true;
    }

    @Override // s4.n0
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView instanceof ml0) {
            ((ml0) recyclerView).R0(canvas);
        }
    }

    @Override // bh.a
    public final void f(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.b.R0(canvas);
        canvas.restore();
    }
}
