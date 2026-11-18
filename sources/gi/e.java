package gi;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.ws0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class e extends ws0 {
    public final /* synthetic */ m v3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m mVar, Context context) {
        super(context);
        this.v3 = mVar;
    }

    @Override // org.telegram.ui.Components.ws0
    public final boolean A1() {
        return this.v3.b;
    }

    @Override // org.telegram.ui.Components.ws0
    public final boolean B1() {
        return true;
    }

    @Override // org.telegram.ui.Components.ws0, org.telegram.ui.Components.ck0, android.view.ViewGroup, android.view.View
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
            as0 as0Var = mVar.r;
            int i11 = 0;
            for (int i12 = 0; i12 < as0Var.getChildCount(); i12++) {
                int bottom2 = as0Var.getChildAt(i12).getBottom() - as0Var.getPaddingTop();
                if (bottom2 > i11) {
                    i11 = bottom2;
                }
            }
            f10 = g0.T1(f10, i11, mVar.c);
        }
        aVar.setVisibility(mVar.w.b() <= 0 ? 8 : 0);
        aVar.setTranslationY(f10);
    }

    @Override // org.telegram.ui.Components.ws0
    public final int getAnimateToColumnsCount() {
        return this.v3.e;
    }

    @Override // org.telegram.ui.Components.ws0
    public final float getChangeColumnsProgress() {
        return this.v3.c;
    }

    @Override // org.telegram.ui.Components.ws0
    public final int getColumnsCount() {
        return this.v3.d;
    }

    @Override // org.telegram.ui.Components.ws0
    public final ij0 getMovingAdapter() {
        m mVar = this.v3;
        if (mVar.H.E != 0 || mVar.a0.H.F1) {
            return null;
        }
        return mVar.w;
    }

    @Override // org.telegram.ui.Components.ws0
    public final ij0 getSupportingAdapter() {
        return this.v3.x;
    }

    @Override // org.telegram.ui.Components.ws0
    public final as0 getSupportingListView() {
        return this.v3.r;
    }
}
