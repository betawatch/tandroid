package bi;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class j extends rv0 {
    public final /* synthetic */ u o3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(u uVar, Context context) {
        super(context);
        this.o3 = uVar;
    }

    @Override // org.telegram.ui.Components.rv0
    public final boolean A1() {
        return this.o3.b;
    }

    @Override // org.telegram.ui.Components.rv0
    public final boolean B1() {
        return true;
    }

    @Override // org.telegram.ui.Components.rv0, org.telegram.ui.Components.la, org.telegram.ui.Components.qm0, android.view.ViewGroup, android.view.View
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
        u uVar = this.o3;
        r rVar = uVar.J;
        if (uVar.b) {
            tu0 tu0Var = uVar.r;
            int i12 = 0;
            for (int i13 = 0; i13 < tu0Var.getChildCount(); i13++) {
                int bottom2 = tu0Var.getChildAt(i13).getBottom() - tu0Var.getPaddingTop();
                if (bottom2 > i12) {
                    i12 = bottom2;
                }
            }
            f7 = AndroidUtilities.lerp(f7, i12, uVar.c);
        }
        rVar.setVisibility(uVar.v.h() <= 0 ? 8 : 0);
        rVar.setTranslationY(f7);
    }

    @Override // org.telegram.ui.Components.rv0
    public final int getAnimateToColumnsCount() {
        return this.o3.e;
    }

    @Override // org.telegram.ui.Components.rv0
    public final float getChangeColumnsProgress() {
        return this.o3.c;
    }

    @Override // org.telegram.ui.Components.rv0
    public final int getColumnsCount() {
        return this.o3.d;
    }

    @Override // org.telegram.ui.Components.rv0
    public final yl0 getMovingAdapter() {
        u uVar = this.o3;
        if (uVar.G.y != 0 || uVar.W.G.C1) {
            return null;
        }
        return uVar.v;
    }

    @Override // org.telegram.ui.Components.rv0
    public final yl0 getSupportingAdapter() {
        return this.o3.w;
    }

    @Override // org.telegram.ui.Components.rv0
    public final tu0 getSupportingListView() {
        return this.o3.r;
    }
}
