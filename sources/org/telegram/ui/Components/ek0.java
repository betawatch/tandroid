package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ek0 extends s4.m0 implements ug.a {
    public final org.telegram.messenger.r20 a;
    public final tk0 b;
    public final int c;
    public final boolean d;

    public ek0(tk0 tk0Var, org.telegram.messenger.r20 r20Var, int i10, boolean z10) {
        this.b = tk0Var;
        this.a = r20Var;
        this.c = i10;
        this.d = z10;
    }

    @Override // s4.m0
    public final void c(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int b10;
        if (((Boolean) this.a.a(view)).booleanValue()) {
            int i10 = this.c;
            rect.right = i10;
            rect.left = i10;
            s4.c1 T = recyclerView.T(view);
            s4.g0 adapter = recyclerView.getAdapter();
            if (T == null || adapter == null || (b10 = T.b()) == -1) {
                return;
            }
            boolean z10 = b10 == 0;
            boolean z11 = b10 == adapter.b() - 1;
            if (z10) {
                rect.top = this.d ? i10 : org.telegram.messenger.i0.L(4.0f);
            }
            if (z11) {
                rect.bottom = i10;
            }
        }
    }

    @Override // ug.a
    public final void d(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.b.P0(canvas);
        canvas.restore();
    }

    @Override // s4.m0
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView instanceof tk0) {
            ((tk0) recyclerView).P0(canvas);
        }
    }

    @Override // ug.a
    public final void g(g.y yVar, RectF rectF) {
        yVar.b = true;
    }
}
