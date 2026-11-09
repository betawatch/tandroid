package ei;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.ps0;
import org.telegram.ui.Components.tr0;
import org.telegram.ui.Components.wi0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class f extends ps0 {
    public final /* synthetic */ n u3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(n nVar, Context context) {
        super(context);
        this.u3 = nVar;
    }

    @Override // org.telegram.ui.Components.ps0
    public final boolean A1() {
        return this.u3.b;
    }

    @Override // org.telegram.ui.Components.ps0
    public final boolean B1() {
        return true;
    }

    @Override // org.telegram.ui.Components.ps0, org.telegram.ui.Components.qj0, android.view.ViewGroup, android.view.View
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
        n nVar = this.u3;
        ah.a aVar = nVar.J;
        if (nVar.b) {
            tr0 tr0Var = nVar.r;
            int i11 = 0;
            for (int i12 = 0; i12 < tr0Var.getChildCount(); i12++) {
                int bottom2 = tr0Var.getChildAt(i12).getBottom() - tr0Var.getPaddingTop();
                if (bottom2 > i11) {
                    i11 = bottom2;
                }
            }
            f10 = g0.T1(f10, i11, nVar.c);
        }
        aVar.setVisibility(nVar.w.b() <= 0 ? 8 : 0);
        aVar.setTranslationY(f10);
    }

    @Override // org.telegram.ui.Components.ps0
    public final int getAnimateToColumnsCount() {
        return this.u3.e;
    }

    @Override // org.telegram.ui.Components.ps0
    public final float getChangeColumnsProgress() {
        return this.u3.c;
    }

    @Override // org.telegram.ui.Components.ps0
    public final int getColumnsCount() {
        return this.u3.d;
    }

    @Override // org.telegram.ui.Components.ps0
    public final wi0 getMovingAdapter() {
        n nVar = this.u3;
        if (nVar.G.D != 0 || nVar.W.G.E1) {
            return null;
        }
        return nVar.w;
    }

    @Override // org.telegram.ui.Components.ps0
    public final wi0 getSupportingAdapter() {
        return this.u3.x;
    }

    @Override // org.telegram.ui.Components.ps0
    public final tr0 getSupportingListView() {
        return this.u3.r;
    }
}
