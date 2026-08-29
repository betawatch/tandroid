package mh;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gu0;
import org.telegram.ui.Components.ht0;
import org.telegram.ui.Components.tk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class i extends gu0 {
    public final /* synthetic */ r m3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar, Context context) {
        super(context);
        this.m3 = rVar;
    }

    @Override // org.telegram.ui.Components.gu0
    public final boolean A1() {
        return true;
    }

    @Override // org.telegram.ui.Components.gu0, org.telegram.ui.Components.fa, org.telegram.ui.Components.jl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            int bottom = getChildAt(i11).getBottom() - getPaddingTop();
            if (bottom > i10) {
                i10 = bottom;
            }
        }
        float f9 = i10;
        r rVar = this.m3;
        o oVar = rVar.F;
        if (rVar.b) {
            ht0 ht0Var = rVar.r;
            int i12 = 0;
            for (int i13 = 0; i13 < ht0Var.getChildCount(); i13++) {
                int bottom2 = ht0Var.getChildAt(i13).getBottom() - ht0Var.getPaddingTop();
                if (bottom2 > i12) {
                    i12 = bottom2;
                }
            }
            f9 = AndroidUtilities.lerp(f9, i12, rVar.c);
        }
        oVar.setVisibility(rVar.v.h() <= 0 ? 8 : 0);
        oVar.setTranslationY(f9);
    }

    @Override // org.telegram.ui.Components.gu0
    public final int getAnimateToColumnsCount() {
        return this.m3.e;
    }

    @Override // org.telegram.ui.Components.gu0
    public final float getChangeColumnsProgress() {
        return this.m3.c;
    }

    @Override // org.telegram.ui.Components.gu0
    public final int getColumnsCount() {
        return this.m3.d;
    }

    @Override // org.telegram.ui.Components.gu0
    public final tk0 getMovingAdapter() {
        r rVar = this.m3;
        if (rVar.C.y != 0 || rVar.S.C.y1) {
            return null;
        }
        return rVar.v;
    }

    @Override // org.telegram.ui.Components.gu0
    public final tk0 getSupportingAdapter() {
        return this.m3.w;
    }

    @Override // org.telegram.ui.Components.gu0
    public final ht0 getSupportingListView() {
        return this.m3.r;
    }

    @Override // org.telegram.ui.Components.gu0
    public final boolean z1() {
        return this.m3.b;
    }
}
