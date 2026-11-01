package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class fk0 extends s4.m0 implements ug.a {
    public final org.telegram.messenger.s20 a;
    public final uk0 b;
    public final int c;
    public final boolean d;

    public fk0(uk0 uk0Var, org.telegram.messenger.s20 s20Var, int i10, boolean z10) {
        this.b = uk0Var;
        this.a = s20Var;
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
        if (recyclerView instanceof uk0) {
            ((uk0) recyclerView).P0(canvas);
        }
    }

    @Override // ug.a
    public final void g(g.y yVar, RectF rectF) {
        yVar.b = true;
    }
}
