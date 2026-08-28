package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class kk0 extends f2.y0 implements jg.a {
    public final Utilities.CallbackReturn a;
    public final wk0 b;
    public final int c;
    public final boolean d;

    public kk0(wk0 wk0Var, Utilities.CallbackReturn callbackReturn, int i9, boolean z10) {
        this.b = wk0Var;
        this.a = callbackReturn;
        this.c = i9;
        this.d = z10;
    }

    @Override // f2.y0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.n1 n1Var) {
        int b10;
        if (((Boolean) this.a.run(view)).booleanValue()) {
            int i9 = this.c;
            rect.right = i9;
            rect.left = i9;
            f2.q1 T = recyclerView.T(view);
            f2.r0 adapter = recyclerView.getAdapter();
            if (T == null || adapter == null || (b10 = T.b()) == -1) {
                return;
            }
            boolean z10 = b10 == 0;
            boolean z11 = b10 == adapter.h() - 1;
            if (z10) {
                rect.top = this.d ? i9 : AndroidUtilities.dp(4.0f);
            }
            if (z11) {
                rect.bottom = i9;
            }
        }
    }

    @Override // f2.y0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView instanceof wk0) {
            ((wk0) recyclerView).Q0(canvas);
        }
    }

    @Override // jg.a
    public final void e(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.b.Q0(canvas);
        canvas.restore();
    }

    @Override // jg.a
    public final void g(g.x xVar, RectF rectF) {
        xVar.b = true;
    }
}
