package bi;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ou0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.tk0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class j extends ou0 {
    public final /* synthetic */ u q3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(u uVar, Context context) {
        super(context);
        this.q3 = uVar;
    }

    @Override // org.telegram.ui.Components.ou0
    public final boolean A1() {
        return true;
    }

    @Override // org.telegram.ui.Components.ou0, org.telegram.ui.Components.ga, org.telegram.ui.Components.ll0, android.view.ViewGroup, android.view.View
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
        u uVar = this.q3;
        r rVar = uVar.J;
        if (uVar.b) {
            qt0 qt0Var = uVar.r;
            int i12 = 0;
            for (int i13 = 0; i13 < qt0Var.getChildCount(); i13++) {
                int bottom2 = qt0Var.getChildAt(i13).getBottom() - qt0Var.getPaddingTop();
                if (bottom2 > i12) {
                    i12 = bottom2;
                }
            }
            f7 = AndroidUtilities.lerp(f7, i12, uVar.c);
        }
        rVar.setVisibility(uVar.v.h() <= 0 ? 8 : 0);
        rVar.setTranslationY(f7);
    }

    @Override // org.telegram.ui.Components.ou0
    public final int getAnimateToColumnsCount() {
        return this.q3.e;
    }

    @Override // org.telegram.ui.Components.ou0
    public final float getChangeColumnsProgress() {
        return this.q3.c;
    }

    @Override // org.telegram.ui.Components.ou0
    public final int getColumnsCount() {
        return this.q3.d;
    }

    @Override // org.telegram.ui.Components.ou0
    public final tk0 getMovingAdapter() {
        u uVar = this.q3;
        if (uVar.G.y != 0 || uVar.W.G.C1) {
            return null;
        }
        return uVar.v;
    }

    @Override // org.telegram.ui.Components.ou0
    public final tk0 getSupportingAdapter() {
        return this.q3.w;
    }

    @Override // org.telegram.ui.Components.ou0
    public final qt0 getSupportingListView() {
        return this.q3.r;
    }

    @Override // org.telegram.ui.Components.ou0
    public final boolean z1() {
        return this.q3.b;
    }
}
