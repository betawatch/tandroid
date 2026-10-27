package ei;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.ul0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class i extends rv0 {
    public final /* synthetic */ r v3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar, Context context) {
        super(context);
        this.v3 = rVar;
    }

    @Override // org.telegram.ui.Components.rv0
    public final boolean D1() {
        return this.v3.b;
    }

    @Override // org.telegram.ui.Components.rv0
    public final boolean E1() {
        return true;
    }

    @Override // org.telegram.ui.Components.rv0, org.telegram.ui.Components.nm0, android.view.ViewGroup, android.view.View
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
        r rVar = this.v3;
        o oVar = rVar.J;
        if (rVar.b) {
            tu0 tu0Var = rVar.r;
            int i12 = 0;
            for (int i13 = 0; i13 < tu0Var.getChildCount(); i13++) {
                int bottom2 = tu0Var.getChildAt(i13).getBottom() - tu0Var.getPaddingTop();
                if (bottom2 > i12) {
                    i12 = bottom2;
                }
            }
            f7 = AndroidUtilities.lerp(f7, i12, rVar.c);
        }
        oVar.setVisibility(rVar.v.h() <= 0 ? 8 : 0);
        oVar.setTranslationY(f7);
    }

    @Override // org.telegram.ui.Components.rv0
    public final int getAnimateToColumnsCount() {
        return this.v3.e;
    }

    @Override // org.telegram.ui.Components.rv0
    public final float getChangeColumnsProgress() {
        return this.v3.c;
    }

    @Override // org.telegram.ui.Components.rv0
    public final int getColumnsCount() {
        return this.v3.d;
    }

    @Override // org.telegram.ui.Components.rv0
    public final ul0 getMovingAdapter() {
        r rVar = this.v3;
        if (rVar.G.y != 0 || rVar.W.G.E1) {
            return null;
        }
        return rVar.v;
    }

    @Override // org.telegram.ui.Components.rv0
    public final ul0 getSupportingAdapter() {
        return this.v3.w;
    }

    @Override // org.telegram.ui.Components.rv0
    public final tu0 getSupportingListView() {
        return this.v3.r;
    }
}
