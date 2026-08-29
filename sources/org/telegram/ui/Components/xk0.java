package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class xk0 extends f2.v0 implements mg.a {
    public final Utilities.CallbackReturn a;
    public final jl0 b;
    public final int c;
    public final boolean d;

    public xk0(jl0 jl0Var, Utilities.CallbackReturn callbackReturn, int i10, boolean z10) {
        this.b = jl0Var;
        this.a = callbackReturn;
        this.c = i10;
        this.d = z10;
    }

    @Override // f2.v0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.k1 k1Var) {
        int b10;
        if (((Boolean) this.a.run(view)).booleanValue()) {
            int i10 = this.c;
            rect.right = i10;
            rect.left = i10;
            f2.n1 T = recyclerView.T(view);
            f2.p0 adapter = recyclerView.getAdapter();
            if (T == null || adapter == null || (b10 = T.b()) == -1) {
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

    @Override // f2.v0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView instanceof jl0) {
            ((jl0) recyclerView).Q0(canvas);
        }
    }

    @Override // mg.a
    public final void e(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.b.Q0(canvas);
        canvas.restore();
    }

    @Override // mg.a
    public final void g(g.x xVar, RectF rectF) {
        xVar.b = true;
    }
}
