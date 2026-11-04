package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class jr extends org.telegram.ui.Cells.l8 {
    public final /* synthetic */ int a0 = 1;
    public final /* synthetic */ Object b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr(lr lrVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.b0 = lrVar;
    }

    @Override // org.telegram.ui.Cells.l8
    public int e(int i3) {
        switch (this.a0) {
            case 2:
                ProfileActivity profileActivity = ((bw0) this.b0).e;
                RectF rectF = ProfileActivity.T6;
                profileActivity.getClass();
                break;
        }
        return i3;
    }

    @Override // org.telegram.ui.Cells.l8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.a0) {
            case 0:
                super.onLayout(z10, i3, i10, i11, i12);
                int L = org.telegram.messenger.g0.L(21.0f);
                int measuredHeight = getMeasuredHeight();
                lr lrVar = (lr) this.b0;
                int measuredHeight2 = (measuredHeight - lrVar.V.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.k9 k9Var = lrVar.V;
                k9Var.layout(L, measuredHeight2, k9Var.getMeasuredWidth() + L, lrVar.V.getMeasuredHeight() + measuredHeight2);
                break;
            case 1:
                super.onLayout(z10, i3, i10, i11, i12);
                int L2 = org.telegram.messenger.g0.L(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                at0 at0Var = (at0) this.b0;
                int measuredHeight4 = (measuredHeight3 - at0Var.d.x0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.k9 k9Var2 = at0Var.d.x0;
                k9Var2.layout(L2, measuredHeight4, k9Var2.getMeasuredWidth() + L2, at0Var.d.x0.getMeasuredHeight() + measuredHeight4);
                break;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l8, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i10) {
        switch (this.a0) {
            case 0:
                super.onMeasure(i3, i10);
                lr lrVar = (lr) this.b0;
                lrVar.V.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30));
                lrVar.V.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                break;
            case 1:
                super.onMeasure(i3, i10);
                at0 at0Var = (at0) this.b0;
                at0Var.d.x0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30));
                at0Var.d.x0.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr(at0 at0Var, Activity activity) {
        super(activity);
        this.b0 = at0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr(bw0 bw0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(18, context, e6Var, false, false);
        this.b0 = bw0Var;
    }
}
