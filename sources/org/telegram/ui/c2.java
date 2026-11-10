package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class c2 extends HorizontalScrollView {
    public final /* synthetic */ r50 a;
    public final /* synthetic */ e2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(e2 e2Var, Context context, r50 r50Var) {
        super(context);
        this.b = e2Var;
        this.a = r50Var;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        e2 e2Var;
        TL_iv.pageBlockPreformatted pageblockpreformatted;
        super.onScrollChanged(i7, i10, i11, i12);
        r50 r50Var = this.a;
        if (r50Var.d != null) {
            r50Var.d = null;
            r50Var.f = null;
        }
        e2 e2Var2 = this.b;
        TL_iv.pageBlockPreformatted pageblockpreformatted2 = e2Var2.f;
        if (pageblockpreformatted2 == null || !pageblockpreformatted2.diff || e2Var2.n) {
            return;
        }
        e4 e4Var = e2Var2.b;
        if (e4Var != null) {
            e4Var.H = i7;
        }
        if (e2Var2.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) e2Var2.getParent();
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt != e2Var2 && (childAt instanceof e2) && (pageblockpreformatted = (e2Var = (e2) childAt).f) != null && pageblockpreformatted.diff) {
                    e2Var.n = true;
                    e2Var.d.scrollTo(i7, 0);
                    e2Var.n = false;
                }
            }
        }
    }
}
