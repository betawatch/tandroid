package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ej0 extends v4.n0 implements eh.a {
    public final org.telegram.messenger.a20 a;
    public final uj0 b;
    public final int c;
    public final boolean d;

    public ej0(uj0 uj0Var, org.telegram.messenger.a20 a20Var, int i7, boolean z10) {
        this.b = uj0Var;
        this.a = a20Var;
        this.c = i7;
        this.d = z10;
    }

    @Override // eh.a
    public final void c(dh.a aVar, RectF rectF) {
        aVar.a = true;
    }

    @Override // eh.a
    public final void d(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.b.P0(canvas);
        canvas.restore();
    }

    @Override // v4.n0
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.b1 b1Var) {
        int b10;
        if (((Boolean) this.a.a(view)).booleanValue()) {
            int i7 = this.c;
            rect.right = i7;
            rect.left = i7;
            v4.e1 T = recyclerView.T(view);
            v4.h0 adapter = recyclerView.getAdapter();
            if (T == null || adapter == null || (b10 = T.b()) == -1) {
                return;
            }
            boolean z10 = b10 == 0;
            boolean z11 = b10 == adapter.b() - 1;
            if (z10) {
                rect.top = this.d ? i7 : org.telegram.messenger.g0.L(4.0f);
            }
            if (z11) {
                rect.bottom = i7;
            }
        }
    }

    @Override // v4.n0
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView instanceof uj0) {
            ((uj0) recyclerView).P0(canvas);
        }
    }
}
