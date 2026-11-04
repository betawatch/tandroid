package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class dj0 extends u4.n0 implements fh.a {
    public final org.telegram.messenger.v10 a;
    public final tj0 b;
    public final int c;
    public final boolean d;

    public dj0(tj0 tj0Var, org.telegram.messenger.v10 v10Var, int i3, boolean z10) {
        this.b = tj0Var;
        this.a = v10Var;
        this.c = i3;
        this.d = z10;
    }

    @Override // fh.a
    public final void b(eh.a aVar, RectF rectF) {
        aVar.a = true;
    }

    @Override // fh.a
    public final void d(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.b.P0(canvas);
        canvas.restore();
    }

    @Override // u4.n0
    public final void e(Rect rect, View view, RecyclerView recyclerView, u4.a1 a1Var) {
        int b10;
        if (((Boolean) this.a.a(view)).booleanValue()) {
            int i3 = this.c;
            rect.right = i3;
            rect.left = i3;
            u4.d1 T = recyclerView.T(view);
            u4.h0 adapter = recyclerView.getAdapter();
            if (T == null || adapter == null || (b10 = T.b()) == -1) {
                return;
            }
            boolean z10 = b10 == 0;
            boolean z11 = b10 == adapter.b() - 1;
            if (z10) {
                rect.top = this.d ? i3 : org.telegram.messenger.g0.L(4.0f);
            }
            if (z11) {
                rect.bottom = i3;
            }
        }
    }

    @Override // u4.n0
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView instanceof tj0) {
            ((tj0) recyclerView).P0(canvas);
        }
    }
}
