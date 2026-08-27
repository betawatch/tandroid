package kh;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.xt0;
import org.telegram.ui.Components.ys0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class j extends xt0 {
    public final /* synthetic */ r m3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r rVar, Context context) {
        super(context);
        this.m3 = rVar;
    }

    @Override // org.telegram.ui.Components.xt0
    public final boolean A1() {
        return true;
    }

    @Override // org.telegram.ui.Components.xt0, org.telegram.ui.Components.y9, org.telegram.ui.Components.zk0, android.view.ViewGroup, android.view.View
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
        r rVar = this.m3;
        o oVar = rVar.F;
        if (rVar.b) {
            ys0 ys0Var = rVar.r;
            int i12 = 0;
            for (int i13 = 0; i13 < ys0Var.getChildCount(); i13++) {
                int bottom2 = ys0Var.getChildAt(i13).getBottom() - ys0Var.getPaddingTop();
                if (bottom2 > i12) {
                    i12 = bottom2;
                }
            }
            f10 = AndroidUtilities.lerp(f10, i12, rVar.c);
        }
        oVar.setVisibility(rVar.v.h() <= 0 ? 8 : 0);
        oVar.setTranslationY(f10);
    }

    @Override // org.telegram.ui.Components.xt0
    public final int getAnimateToColumnsCount() {
        return this.m3.e;
    }

    @Override // org.telegram.ui.Components.xt0
    public final float getChangeColumnsProgress() {
        return this.m3.c;
    }

    @Override // org.telegram.ui.Components.xt0
    public final int getColumnsCount() {
        return this.m3.d;
    }

    @Override // org.telegram.ui.Components.xt0
    public final jk0 getMovingAdapter() {
        r rVar = this.m3;
        if (rVar.C.y != 0 || rVar.S.C.y1) {
            return null;
        }
        return rVar.v;
    }

    @Override // org.telegram.ui.Components.xt0
    public final jk0 getSupportingAdapter() {
        return this.m3.w;
    }

    @Override // org.telegram.ui.Components.xt0
    public final ys0 getSupportingListView() {
        return this.m3.r;
    }

    @Override // org.telegram.ui.Components.xt0
    public final boolean z1() {
        return this.m3.b;
    }
}
