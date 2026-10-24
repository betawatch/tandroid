package di;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nv0;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.ul0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class i extends nv0 {
    public final /* synthetic */ r r3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar, Context context) {
        super(context);
        this.r3 = rVar;
    }

    @Override // org.telegram.ui.Components.nv0
    public final boolean F1() {
        return this.r3.b;
    }

    @Override // org.telegram.ui.Components.nv0
    public final boolean G1() {
        return true;
    }

    @Override // org.telegram.ui.Components.nv0, org.telegram.ui.Components.ia, org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
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
        r rVar = this.r3;
        o oVar = rVar.J;
        if (rVar.b) {
            pu0 pu0Var = rVar.r;
            int i12 = 0;
            for (int i13 = 0; i13 < pu0Var.getChildCount(); i13++) {
                int bottom2 = pu0Var.getChildAt(i13).getBottom() - pu0Var.getPaddingTop();
                if (bottom2 > i12) {
                    i12 = bottom2;
                }
            }
            f7 = AndroidUtilities.lerp(f7, i12, rVar.c);
        }
        oVar.setVisibility(rVar.v.h() <= 0 ? 8 : 0);
        oVar.setTranslationY(f7);
    }

    @Override // org.telegram.ui.Components.nv0
    public final int getAnimateToColumnsCount() {
        return this.r3.e;
    }

    @Override // org.telegram.ui.Components.nv0
    public final float getChangeColumnsProgress() {
        return this.r3.c;
    }

    @Override // org.telegram.ui.Components.nv0
    public final int getColumnsCount() {
        return this.r3.d;
    }

    @Override // org.telegram.ui.Components.nv0
    public final ul0 getMovingAdapter() {
        r rVar = this.r3;
        if (rVar.G.y != 0 || rVar.W.G.C1) {
            return null;
        }
        return rVar.v;
    }

    @Override // org.telegram.ui.Components.nv0
    public final ul0 getSupportingAdapter() {
        return this.r3.w;
    }

    @Override // org.telegram.ui.Components.nv0
    public final pu0 getSupportingListView() {
        return this.r3.r;
    }
}
