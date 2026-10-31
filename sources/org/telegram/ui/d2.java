package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d2 extends HorizontalScrollView {
    public final /* synthetic */ m60 a;
    public final /* synthetic */ f2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(f2 f2Var, Context context, m60 m60Var) {
        super(context);
        this.b = f2Var;
        this.a = m60Var;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        f2 f2Var;
        TL_iv.pageBlockPreformatted pageblockpreformatted;
        super.onScrollChanged(i10, i11, i12, i13);
        m60 m60Var = this.a;
        if (m60Var.d != null) {
            m60Var.d = null;
            m60Var.f = null;
        }
        f2 f2Var2 = this.b;
        TL_iv.pageBlockPreformatted pageblockpreformatted2 = f2Var2.f;
        if (pageblockpreformatted2 == null || !pageblockpreformatted2.diff || f2Var2.n) {
            return;
        }
        f4 f4Var = f2Var2.b;
        if (f4Var != null) {
            f4Var.H = i10;
        }
        if (f2Var2.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) f2Var2.getParent();
            for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                View childAt = viewGroup.getChildAt(i14);
                if (childAt != f2Var2 && (childAt instanceof f2) && (pageblockpreformatted = (f2Var = (f2) childAt).f) != null && pageblockpreformatted.diff) {
                    f2Var.n = true;
                    f2Var.d.scrollTo(i10, 0);
                    f2Var.n = false;
                }
            }
        }
    }
}
