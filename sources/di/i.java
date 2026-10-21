package di;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.rl0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class i extends kv0 {
    public final /* synthetic */ r o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar, Context context) {
        super(context);
        this.o3 = rVar;
    }

    @Override // org.telegram.ui.Components.kv0
    public final boolean A1() {
        return this.o3.b;
    }

    @Override // org.telegram.ui.Components.kv0
    public final boolean B1() {
        return true;
    }

    @Override // org.telegram.ui.Components.kv0, org.telegram.ui.Components.ia, org.telegram.ui.Components.jm0, android.view.ViewGroup, android.view.View
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
        r rVar = this.o3;
        o oVar = rVar.J;
        if (rVar.b) {
            mu0 mu0Var = rVar.r;
            int i12 = 0;
            for (int i13 = 0; i13 < mu0Var.getChildCount(); i13++) {
                int bottom2 = mu0Var.getChildAt(i13).getBottom() - mu0Var.getPaddingTop();
                if (bottom2 > i12) {
                    i12 = bottom2;
                }
            }
            f7 = AndroidUtilities.lerp(f7, i12, rVar.c);
        }
        oVar.setVisibility(rVar.v.h() <= 0 ? 8 : 0);
        oVar.setTranslationY(f7);
    }

    @Override // org.telegram.ui.Components.kv0
    public final int getAnimateToColumnsCount() {
        return this.o3.e;
    }

    @Override // org.telegram.ui.Components.kv0
    public final float getChangeColumnsProgress() {
        return this.o3.c;
    }

    @Override // org.telegram.ui.Components.kv0
    public final int getColumnsCount() {
        return this.o3.d;
    }

    @Override // org.telegram.ui.Components.kv0
    public final rl0 getMovingAdapter() {
        r rVar = this.o3;
        if (rVar.G.y != 0 || rVar.W.G.C1) {
            return null;
        }
        return rVar.v;
    }

    @Override // org.telegram.ui.Components.kv0
    public final rl0 getSupportingAdapter() {
        return this.o3.w;
    }

    @Override // org.telegram.ui.Components.kv0
    public final mu0 getSupportingListView() {
        return this.o3.r;
    }
}
