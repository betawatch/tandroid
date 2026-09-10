package ai;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.Components.zt0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class o extends yu0 {
    public final /* synthetic */ a0 q3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(a0 a0Var, Context context) {
        super(context);
        this.q3 = a0Var;
    }

    @Override // org.telegram.ui.Components.yu0, org.telegram.ui.Components.ha, org.telegram.ui.Components.vl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            int bottom = getChildAt(i11).getBottom() - getPaddingTop();
            if (bottom > i10) {
                i10 = bottom;
            }
        }
        float f7 = i10;
        a0 a0Var = this.q3;
        x xVar = a0Var.J;
        if (a0Var.b) {
            zt0 zt0Var = a0Var.r;
            int i12 = 0;
            for (int i13 = 0; i13 < zt0Var.getChildCount(); i13++) {
                int bottom2 = zt0Var.getChildAt(i13).getBottom() - zt0Var.getPaddingTop();
                if (bottom2 > i12) {
                    i12 = bottom2;
                }
            }
            f7 = AndroidUtilities.lerp(f7, i12, a0Var.c);
        }
        xVar.setVisibility(a0Var.v.h() <= 0 ? 8 : 0);
        xVar.setTranslationY(f7);
    }

    @Override // org.telegram.ui.Components.yu0
    public final int getAnimateToColumnsCount() {
        return this.q3.e;
    }

    @Override // org.telegram.ui.Components.yu0
    public final float getChangeColumnsProgress() {
        return this.q3.c;
    }

    @Override // org.telegram.ui.Components.yu0
    public final int getColumnsCount() {
        return this.q3.d;
    }

    @Override // org.telegram.ui.Components.yu0
    public final dl0 getMovingAdapter() {
        a0 a0Var = this.q3;
        if (a0Var.G.y != 0 || a0Var.W.G.C1) {
            return null;
        }
        return a0Var.v;
    }

    @Override // org.telegram.ui.Components.yu0
    public final dl0 getSupportingAdapter() {
        return this.q3.w;
    }

    @Override // org.telegram.ui.Components.yu0
    public final zt0 getSupportingListView() {
        return this.q3.r;
    }

    @Override // org.telegram.ui.Components.yu0
    public final boolean y1() {
        return this.q3.b;
    }

    @Override // org.telegram.ui.Components.yu0
    public final boolean z1() {
        return true;
    }
}
