package ci;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nu0;
import org.telegram.ui.Components.pt0;
import org.telegram.ui.Components.tk0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class i extends nu0 {
    public final /* synthetic */ t q3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(t tVar, Context context) {
        super(context);
        this.q3 = tVar;
    }

    @Override // org.telegram.ui.Components.nu0, org.telegram.ui.Components.ia, org.telegram.ui.Components.ll0, android.view.ViewGroup, android.view.View
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
        t tVar = this.q3;
        q qVar = tVar.J;
        if (tVar.b) {
            pt0 pt0Var = tVar.r;
            int i12 = 0;
            for (int i13 = 0; i13 < pt0Var.getChildCount(); i13++) {
                int bottom2 = pt0Var.getChildAt(i13).getBottom() - pt0Var.getPaddingTop();
                if (bottom2 > i12) {
                    i12 = bottom2;
                }
            }
            f7 = AndroidUtilities.lerp(f7, i12, tVar.c);
        }
        qVar.setVisibility(tVar.v.h() <= 0 ? 8 : 0);
        qVar.setTranslationY(f7);
    }

    @Override // org.telegram.ui.Components.nu0
    public final int getAnimateToColumnsCount() {
        return this.q3.e;
    }

    @Override // org.telegram.ui.Components.nu0
    public final float getChangeColumnsProgress() {
        return this.q3.c;
    }

    @Override // org.telegram.ui.Components.nu0
    public final int getColumnsCount() {
        return this.q3.d;
    }

    @Override // org.telegram.ui.Components.nu0
    public final tk0 getMovingAdapter() {
        t tVar = this.q3;
        if (tVar.G.y != 0 || tVar.W.G.C1) {
            return null;
        }
        return tVar.v;
    }

    @Override // org.telegram.ui.Components.nu0
    public final tk0 getSupportingAdapter() {
        return this.q3.w;
    }

    @Override // org.telegram.ui.Components.nu0
    public final pt0 getSupportingListView() {
        return this.q3.r;
    }

    @Override // org.telegram.ui.Components.nu0
    public final boolean y1() {
        return this.q3.b;
    }

    @Override // org.telegram.ui.Components.nu0
    public final boolean z1() {
        return true;
    }
}
