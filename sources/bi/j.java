package bi;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fv0;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.hu0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class j extends fv0 {
    public final /* synthetic */ u x3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(u uVar, Context context) {
        super(context);
        this.x3 = uVar;
    }

    @Override // org.telegram.ui.Components.fv0
    public final boolean B1() {
        return this.x3.b;
    }

    @Override // org.telegram.ui.Components.fv0
    public final boolean C1() {
        return true;
    }

    @Override // org.telegram.ui.Components.fv0, org.telegram.ui.Components.ja, org.telegram.ui.Components.zl0, android.view.ViewGroup, android.view.View
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
        u uVar = this.x3;
        r rVar = uVar.J;
        if (uVar.b) {
            hu0 hu0Var = uVar.r;
            int i12 = 0;
            for (int i13 = 0; i13 < hu0Var.getChildCount(); i13++) {
                int bottom2 = hu0Var.getChildAt(i13).getBottom() - hu0Var.getPaddingTop();
                if (bottom2 > i12) {
                    i12 = bottom2;
                }
            }
            f7 = AndroidUtilities.lerp(f7, i12, uVar.c);
        }
        rVar.setVisibility(uVar.v.h() <= 0 ? 8 : 0);
        rVar.setTranslationY(f7);
    }

    @Override // org.telegram.ui.Components.fv0
    public final int getAnimateToColumnsCount() {
        return this.x3.e;
    }

    @Override // org.telegram.ui.Components.fv0
    public final float getChangeColumnsProgress() {
        return this.x3.c;
    }

    @Override // org.telegram.ui.Components.fv0
    public final int getColumnsCount() {
        return this.x3.d;
    }

    @Override // org.telegram.ui.Components.fv0
    public final gl0 getMovingAdapter() {
        u uVar = this.x3;
        if (uVar.G.y != 0 || uVar.W.G.C1) {
            return null;
        }
        return uVar.v;
    }

    @Override // org.telegram.ui.Components.fv0
    public final gl0 getSupportingAdapter() {
        return this.x3.w;
    }

    @Override // org.telegram.ui.Components.fv0
    public final hu0 getSupportingListView() {
        return this.x3.r;
    }
}
