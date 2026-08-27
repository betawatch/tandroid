package cg;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class x2 extends f2.w0 {
    public final /* synthetic */ y2 a;

    public x2(y2 y2Var) {
        this.a = y2Var;
    }

    @Override // f2.w0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.l1 l1Var) {
        super.a(rect, view, recyclerView, l1Var);
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        y2 y2Var = this.a;
        if (R == y2Var.c0.size()) {
            rect.bottom = y2Var.m0;
        }
    }
}
