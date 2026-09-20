package bi;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.zu0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class j extends zu0 {
    public final /* synthetic */ u q3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(u uVar, Context context) {
        super(context);
        this.q3 = uVar;
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean A1() {
        return this.q3.b;
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean B1() {
        return true;
    }

    @Override // org.telegram.ui.Components.zu0, org.telegram.ui.Components.ha, org.telegram.ui.Components.vl0, android.view.ViewGroup, android.view.View
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
            bu0 bu0Var = uVar.r;
            int i12 = 0;
            for (int i13 = 0; i13 < bu0Var.getChildCount(); i13++) {
                int bottom2 = bu0Var.getChildAt(i13).getBottom() - bu0Var.getPaddingTop();
                if (bottom2 > i12) {
                    i12 = bottom2;
                }
            }
            f7 = AndroidUtilities.lerp(f7, i12, uVar.c);
        }
        rVar.setVisibility(uVar.v.h() <= 0 ? 8 : 0);
        rVar.setTranslationY(f7);
    }

    @Override // org.telegram.ui.Components.zu0
    public final int getAnimateToColumnsCount() {
        return this.q3.e;
    }

    @Override // org.telegram.ui.Components.zu0
    public final float getChangeColumnsProgress() {
        return this.q3.c;
    }

    @Override // org.telegram.ui.Components.zu0
    public final int getColumnsCount() {
        return this.q3.d;
    }

    @Override // org.telegram.ui.Components.zu0
    public final dl0 getMovingAdapter() {
        u uVar = this.q3;
        if (uVar.G.y != 0 || uVar.W.G.C1) {
            return null;
        }
        return uVar.v;
    }

    @Override // org.telegram.ui.Components.zu0
    public final dl0 getSupportingAdapter() {
        return this.q3.w;
    }

    @Override // org.telegram.ui.Components.zu0
    public final bu0 getSupportingListView() {
        return this.q3.r;
    }
}
