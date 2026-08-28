package jh;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.ut0;
import org.telegram.ui.Components.ws0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class i extends ut0 {
    public final /* synthetic */ q m3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(q qVar, Context context) {
        super(context);
        this.m3 = qVar;
    }

    @Override // org.telegram.ui.Components.ut0
    public final boolean A1() {
        return true;
    }

    @Override // org.telegram.ui.Components.ut0, org.telegram.ui.Components.aa, org.telegram.ui.Components.wk0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i9 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int bottom = getChildAt(i10).getBottom() - getPaddingTop();
            if (bottom > i9) {
                i9 = bottom;
            }
        }
        float f10 = i9;
        q qVar = this.m3;
        n nVar = qVar.F;
        if (qVar.b) {
            ws0 ws0Var = qVar.r;
            int i11 = 0;
            for (int i12 = 0; i12 < ws0Var.getChildCount(); i12++) {
                int bottom2 = ws0Var.getChildAt(i12).getBottom() - ws0Var.getPaddingTop();
                if (bottom2 > i11) {
                    i11 = bottom2;
                }
            }
            f10 = AndroidUtilities.lerp(f10, i11, qVar.c);
        }
        nVar.setVisibility(qVar.v.h() <= 0 ? 8 : 0);
        nVar.setTranslationY(f10);
    }

    @Override // org.telegram.ui.Components.ut0
    public final int getAnimateToColumnsCount() {
        return this.m3.e;
    }

    @Override // org.telegram.ui.Components.ut0
    public final float getChangeColumnsProgress() {
        return this.m3.c;
    }

    @Override // org.telegram.ui.Components.ut0
    public final int getColumnsCount() {
        return this.m3.d;
    }

    @Override // org.telegram.ui.Components.ut0
    public final gk0 getMovingAdapter() {
        q qVar = this.m3;
        if (qVar.C.y != 0 || qVar.S.C.y1) {
            return null;
        }
        return qVar.v;
    }

    @Override // org.telegram.ui.Components.ut0
    public final gk0 getSupportingAdapter() {
        return this.m3.w;
    }

    @Override // org.telegram.ui.Components.ut0
    public final ws0 getSupportingListView() {
        return this.m3.r;
    }

    @Override // org.telegram.ui.Components.ut0
    public final boolean z1() {
        return this.m3.b;
    }
}
