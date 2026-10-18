package di;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.ku0;
import org.telegram.ui.Components.ql0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class i extends iv0 {
    public final /* synthetic */ r o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar, Context context) {
        super(context);
        this.o3 = rVar;
    }

    @Override // org.telegram.ui.Components.iv0
    public final boolean A1() {
        return this.o3.b;
    }

    @Override // org.telegram.ui.Components.iv0
    public final boolean B1() {
        return true;
    }

    @Override // org.telegram.ui.Components.iv0, org.telegram.ui.Components.ia, org.telegram.ui.Components.im0, android.view.ViewGroup, android.view.View
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
            ku0 ku0Var = rVar.r;
            int i12 = 0;
            for (int i13 = 0; i13 < ku0Var.getChildCount(); i13++) {
                int bottom2 = ku0Var.getChildAt(i13).getBottom() - ku0Var.getPaddingTop();
                if (bottom2 > i12) {
                    i12 = bottom2;
                }
            }
            f7 = AndroidUtilities.lerp(f7, i12, rVar.c);
        }
        oVar.setVisibility(rVar.v.h() <= 0 ? 8 : 0);
        oVar.setTranslationY(f7);
    }

    @Override // org.telegram.ui.Components.iv0
    public final int getAnimateToColumnsCount() {
        return this.o3.e;
    }

    @Override // org.telegram.ui.Components.iv0
    public final float getChangeColumnsProgress() {
        return this.o3.c;
    }

    @Override // org.telegram.ui.Components.iv0
    public final int getColumnsCount() {
        return this.o3.d;
    }

    @Override // org.telegram.ui.Components.iv0
    public final ql0 getMovingAdapter() {
        r rVar = this.o3;
        if (rVar.G.y != 0 || rVar.W.G.C1) {
            return null;
        }
        return rVar.v;
    }

    @Override // org.telegram.ui.Components.iv0
    public final ql0 getSupportingAdapter() {
        return this.o3.w;
    }

    @Override // org.telegram.ui.Components.iv0
    public final ku0 getSupportingListView() {
        return this.o3.r;
    }
}
