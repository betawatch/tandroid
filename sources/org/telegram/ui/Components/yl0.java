package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class yl0 extends s4.m0 implements ch.a {
    public final Utilities.CallbackReturn a;
    public final mm0 b;
    public final int c;
    public final boolean d;

    public yl0(mm0 mm0Var, Utilities.CallbackReturn callbackReturn, int i10, boolean z10) {
        this.b = mm0Var;
        this.a = callbackReturn;
        this.c = i10;
        this.d = z10;
    }

    @Override // s4.m0
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.y0 y0Var) {
        int b10;
        if (((Boolean) this.a.run(view)).booleanValue()) {
            int i10 = this.c;
            rect.right = i10;
            rect.left = i10;
            s4.b1 T = recyclerView.T(view);
            s4.g0 adapter = recyclerView.getAdapter();
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

    @Override // s4.m0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView instanceof mm0) {
            ((mm0) recyclerView).Q0(canvas);
        }
    }

    @Override // ch.a
    public final void e(bh.a aVar, RectF rectF) {
        aVar.a = true;
    }

    @Override // ch.a
    public final void f(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.b.Q0(canvas);
        canvas.restore();
    }
}
