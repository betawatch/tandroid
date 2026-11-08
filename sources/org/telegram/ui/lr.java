package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class lr extends org.telegram.ui.Cells.m8 {
    public final /* synthetic */ int W = 1;
    public final /* synthetic */ Object a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr(nr nrVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.a0 = nrVar;
    }

    @Override // org.telegram.ui.Cells.m8
    public int e(int i7) {
        switch (this.W) {
            case 2:
                ProfileActivity profileActivity = ((jw0) this.a0).e;
                RectF rectF = ProfileActivity.S6;
                profileActivity.getClass();
                break;
        }
        return i7;
    }

    @Override // org.telegram.ui.Cells.m8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.W) {
            case 0:
                super.onLayout(z9, i7, i10, i11, i12);
                int L = org.telegram.messenger.g0.L(21.0f);
                int measuredHeight = getMeasuredHeight();
                nr nrVar = (nr) this.a0;
                int measuredHeight2 = (measuredHeight - nrVar.U.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.l9 l9Var = nrVar.U;
                l9Var.layout(L, measuredHeight2, l9Var.getMeasuredWidth() + L, nrVar.U.getMeasuredHeight() + measuredHeight2);
                break;
            case 1:
                super.onLayout(z9, i7, i10, i11, i12);
                int L2 = org.telegram.messenger.g0.L(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                jt0 jt0Var = (jt0) this.a0;
                int measuredHeight4 = (measuredHeight3 - jt0Var.d.w0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.l9 l9Var2 = jt0Var.d.w0;
                l9Var2.layout(L2, measuredHeight4, l9Var2.getMeasuredWidth() + L2, jt0Var.d.w0.getMeasuredHeight() + measuredHeight4);
                break;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.m8, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.W) {
            case 0:
                super.onMeasure(i7, i10);
                nr nrVar = (nr) this.a0;
                nrVar.U.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30));
                nrVar.U.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                break;
            case 1:
                super.onMeasure(i7, i10);
                jt0 jt0Var = (jt0) this.a0;
                jt0Var.d.w0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30));
                jt0Var.d.w0.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr(jt0 jt0Var, Activity activity) {
        super(activity);
        this.a0 = jt0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr(jw0 jw0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(18, context, f6Var, false, false);
        this.a0 = jw0Var;
    }
}
