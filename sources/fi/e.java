package fi;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.qr0;
import org.telegram.ui.Components.zi0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e extends ms0 {
    public final /* synthetic */ m v3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m mVar, Context context) {
        super(context);
        this.v3 = mVar;
    }

    @Override // org.telegram.ui.Components.ms0
    public final boolean A1() {
        return this.v3.b;
    }

    @Override // org.telegram.ui.Components.ms0
    public final boolean B1() {
        return true;
    }

    @Override // org.telegram.ui.Components.ms0, org.telegram.ui.Components.tj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i3 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int bottom = getChildAt(i10).getBottom() - getPaddingTop();
            if (bottom > i3) {
                i3 = bottom;
            }
        }
        float f10 = i3;
        m mVar = this.v3;
        bh.a aVar = mVar.K;
        if (mVar.b) {
            qr0 qr0Var = mVar.r;
            int i11 = 0;
            for (int i12 = 0; i12 < qr0Var.getChildCount(); i12++) {
                int bottom2 = qr0Var.getChildAt(i12).getBottom() - qr0Var.getPaddingTop();
                if (bottom2 > i11) {
                    i11 = bottom2;
                }
            }
            f10 = g0.T1(f10, i11, mVar.c);
        }
        aVar.setVisibility(mVar.w.b() <= 0 ? 8 : 0);
        aVar.setTranslationY(f10);
    }

    @Override // org.telegram.ui.Components.ms0
    public final int getAnimateToColumnsCount() {
        return this.v3.e;
    }

    @Override // org.telegram.ui.Components.ms0
    public final float getChangeColumnsProgress() {
        return this.v3.c;
    }

    @Override // org.telegram.ui.Components.ms0
    public final int getColumnsCount() {
        return this.v3.d;
    }

    @Override // org.telegram.ui.Components.ms0
    public final zi0 getMovingAdapter() {
        m mVar = this.v3;
        if (mVar.H.E != 0 || mVar.a0.H.F1) {
            return null;
        }
        return mVar.w;
    }

    @Override // org.telegram.ui.Components.ms0
    public final zi0 getSupportingAdapter() {
        return this.v3.x;
    }

    @Override // org.telegram.ui.Components.ms0
    public final qr0 getSupportingListView() {
        return this.v3.r;
    }
}
