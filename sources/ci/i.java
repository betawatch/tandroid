package ci;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nv0;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.ul0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class i extends nv0 {
    public final /* synthetic */ t o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(t tVar, Context context) {
        super(context);
        this.o3 = tVar;
    }

    @Override // org.telegram.ui.Components.nv0
    public final boolean A1() {
        return this.o3.b;
    }

    @Override // org.telegram.ui.Components.nv0
    public final boolean B1() {
        return true;
    }

    @Override // org.telegram.ui.Components.nv0, org.telegram.ui.Components.ka, org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
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
        t tVar = this.o3;
        q qVar = tVar.J;
        if (tVar.b) {
            pu0 pu0Var = tVar.r;
            int i12 = 0;
            for (int i13 = 0; i13 < pu0Var.getChildCount(); i13++) {
                int bottom2 = pu0Var.getChildAt(i13).getBottom() - pu0Var.getPaddingTop();
                if (bottom2 > i12) {
                    i12 = bottom2;
                }
            }
            f7 = AndroidUtilities.lerp(f7, i12, tVar.c);
        }
        qVar.setVisibility(tVar.v.h() <= 0 ? 8 : 0);
        qVar.setTranslationY(f7);
    }

    @Override // org.telegram.ui.Components.nv0
    public final int getAnimateToColumnsCount() {
        return this.o3.e;
    }

    @Override // org.telegram.ui.Components.nv0
    public final float getChangeColumnsProgress() {
        return this.o3.c;
    }

    @Override // org.telegram.ui.Components.nv0
    public final int getColumnsCount() {
        return this.o3.d;
    }

    @Override // org.telegram.ui.Components.nv0
    public final ul0 getMovingAdapter() {
        t tVar = this.o3;
        if (tVar.G.y != 0 || tVar.W.G.C1) {
            return null;
        }
        return tVar.v;
    }

    @Override // org.telegram.ui.Components.nv0
    public final ul0 getSupportingAdapter() {
        return this.o3.w;
    }

    @Override // org.telegram.ui.Components.nv0
    public final pu0 getSupportingListView() {
        return this.o3.r;
    }
}
