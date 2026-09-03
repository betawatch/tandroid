package oh;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.ou0;
import org.telegram.ui.Components.pt0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class i extends ou0 {
    public final /* synthetic */ r n3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar, Context context) {
        super(context);
        this.n3 = rVar;
    }

    @Override // org.telegram.ui.Components.ou0, org.telegram.ui.Components.aa, org.telegram.ui.Components.rl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            int bottom = getChildAt(i11).getBottom() - getPaddingTop();
            if (bottom > i10) {
                i10 = bottom;
            }
        }
        float f10 = i10;
        r rVar = this.n3;
        o oVar = rVar.G;
        if (rVar.b) {
            pt0 pt0Var = rVar.r;
            int i12 = 0;
            for (int i13 = 0; i13 < pt0Var.getChildCount(); i13++) {
                int bottom2 = pt0Var.getChildAt(i13).getBottom() - pt0Var.getPaddingTop();
                if (bottom2 > i12) {
                    i12 = bottom2;
                }
            }
            f10 = AndroidUtilities.lerp(f10, i12, rVar.c);
        }
        oVar.setVisibility(rVar.v.h() <= 0 ? 8 : 0);
        oVar.setTranslationY(f10);
    }

    @Override // org.telegram.ui.Components.ou0
    public final int getAnimateToColumnsCount() {
        return this.n3.e;
    }

    @Override // org.telegram.ui.Components.ou0
    public final float getChangeColumnsProgress() {
        return this.n3.c;
    }

    @Override // org.telegram.ui.Components.ou0
    public final int getColumnsCount() {
        return this.n3.d;
    }

    @Override // org.telegram.ui.Components.ou0
    public final bl0 getMovingAdapter() {
        r rVar = this.n3;
        if (rVar.D.y != 0 || rVar.T.D.z1) {
            return null;
        }
        return rVar.v;
    }

    @Override // org.telegram.ui.Components.ou0
    public final bl0 getSupportingAdapter() {
        return this.n3.w;
    }

    @Override // org.telegram.ui.Components.ou0
    public final pt0 getSupportingListView() {
        return this.n3.r;
    }

    @Override // org.telegram.ui.Components.ou0
    public final boolean y1() {
        return this.n3.b;
    }

    @Override // org.telegram.ui.Components.ou0
    public final boolean z1() {
        return true;
    }
}
