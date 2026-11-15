package gi;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.os0;
import org.telegram.ui.Components.sr0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class e extends os0 {
    public final /* synthetic */ m v3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m mVar, Context context) {
        super(context);
        this.v3 = mVar;
    }

    @Override // org.telegram.ui.Components.os0
    public final boolean A1() {
        return this.v3.b;
    }

    @Override // org.telegram.ui.Components.os0
    public final boolean B1() {
        return true;
    }

    @Override // org.telegram.ui.Components.os0, org.telegram.ui.Components.uj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i7 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int bottom = getChildAt(i10).getBottom() - getPaddingTop();
            if (bottom > i7) {
                i7 = bottom;
            }
        }
        float f10 = i7;
        m mVar = this.v3;
        ah.a aVar = mVar.K;
        if (mVar.b) {
            sr0 sr0Var = mVar.r;
            int i11 = 0;
            for (int i12 = 0; i12 < sr0Var.getChildCount(); i12++) {
                int bottom2 = sr0Var.getChildAt(i12).getBottom() - sr0Var.getPaddingTop();
                if (bottom2 > i11) {
                    i11 = bottom2;
                }
            }
            f10 = g0.T1(f10, i11, mVar.c);
        }
        aVar.setVisibility(mVar.w.b() <= 0 ? 8 : 0);
        aVar.setTranslationY(f10);
    }

    @Override // org.telegram.ui.Components.os0
    public final int getAnimateToColumnsCount() {
        return this.v3.e;
    }

    @Override // org.telegram.ui.Components.os0
    public final float getChangeColumnsProgress() {
        return this.v3.c;
    }

    @Override // org.telegram.ui.Components.os0
    public final int getColumnsCount() {
        return this.v3.d;
    }

    @Override // org.telegram.ui.Components.os0
    public final aj0 getMovingAdapter() {
        m mVar = this.v3;
        if (mVar.H.E != 0 || mVar.a0.H.F1) {
            return null;
        }
        return mVar.w;
    }

    @Override // org.telegram.ui.Components.os0
    public final aj0 getSupportingAdapter() {
        return this.v3.x;
    }

    @Override // org.telegram.ui.Components.os0
    public final sr0 getSupportingListView() {
        return this.v3.r;
    }
}
