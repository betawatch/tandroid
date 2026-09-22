package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class xk0 extends s4.n0 implements bh.a {
    public final Utilities.CallbackReturn a;
    public final ll0 b;
    public final int c;
    public final boolean d;

    public xk0(ll0 ll0Var, Utilities.CallbackReturn callbackReturn, int i10, boolean z10) {
        this.b = ll0Var;
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
            s4.c1 T = recyclerView.T(view);
            s4.h0 adapter = recyclerView.getAdapter();
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

    @Override // bh.a
    public final void b(ah.a aVar, RectF rectF) {
        aVar.a = true;
    }

    @Override // s4.n0
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView instanceof ll0) {
            ((ll0) recyclerView).Q0(canvas);
        }
    }

    @Override // bh.a
    public final void f(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.b.Q0(canvas);
        canvas.restore();
    }
}
