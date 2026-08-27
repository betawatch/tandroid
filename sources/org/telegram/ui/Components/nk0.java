package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class nk0 extends f2.w0 implements kg.a {
    public final Utilities.CallbackReturn a;
    public final zk0 b;
    public final int c;
    public final boolean d;

    public nk0(zk0 zk0Var, Utilities.CallbackReturn callbackReturn, int i10, boolean z10) {
        this.b = zk0Var;
        this.a = callbackReturn;
        this.c = i10;
        this.d = z10;
    }

    @Override // f2.w0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.l1 l1Var) {
        int b10;
        if (((Boolean) this.a.run(view)).booleanValue()) {
            int i10 = this.c;
            rect.right = i10;
            rect.left = i10;
            f2.o1 T = recyclerView.T(view);
            f2.q0 adapter = recyclerView.getAdapter();
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

    @Override // f2.w0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView instanceof zk0) {
            ((zk0) recyclerView).Q0(canvas);
        }
    }

    @Override // kg.a
    public final void e(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.b.Q0(canvas);
        canvas.restore();
    }

    @Override // kg.a
    public final void g(g.y yVar, RectF rectF) {
        yVar.b = true;
    }
}
