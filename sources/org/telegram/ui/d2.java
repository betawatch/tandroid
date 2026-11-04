package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d2 extends HorizontalScrollView {
    public final /* synthetic */ i50 a;
    public final /* synthetic */ f2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(f2 f2Var, Context context, i50 i50Var) {
        super(context);
        this.b = f2Var;
        this.a = i50Var;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i3, int i10, int i11, int i12) {
        f2 f2Var;
        TL_iv.pageBlockPreformatted pageblockpreformatted;
        super.onScrollChanged(i3, i10, i11, i12);
        i50 i50Var = this.a;
        if (i50Var.d != null) {
            i50Var.d = null;
            i50Var.f = null;
        }
        f2 f2Var2 = this.b;
        TL_iv.pageBlockPreformatted pageblockpreformatted2 = f2Var2.f;
        if (pageblockpreformatted2 == null || !pageblockpreformatted2.diff || f2Var2.n) {
            return;
        }
        g4 g4Var = f2Var2.b;
        if (g4Var != null) {
            g4Var.I = i3;
        }
        if (f2Var2.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) f2Var2.getParent();
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt != f2Var2 && (childAt instanceof f2) && (pageblockpreformatted = (f2Var = (f2) childAt).f) != null && pageblockpreformatted.diff) {
                    f2Var.n = true;
                    f2Var.d.scrollTo(i3, 0);
                    f2Var.n = false;
                }
            }
        }
    }
}
