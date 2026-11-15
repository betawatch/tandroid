package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class nr extends org.telegram.ui.Cells.l8 {
    public final /* synthetic */ int a0 = 1;
    public final /* synthetic */ Object b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr(pr prVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.b0 = prVar;
    }

    @Override // org.telegram.ui.Cells.l8
    public int e(int i7) {
        switch (this.a0) {
            case 2:
                ProfileActivity profileActivity = ((iw0) this.b0).e;
                RectF rectF = ProfileActivity.X6;
                profileActivity.getClass();
                break;
        }
        return i7;
    }

    @Override // org.telegram.ui.Cells.l8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.a0) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                int L = org.telegram.messenger.g0.L(21.0f);
                int measuredHeight = getMeasuredHeight();
                pr prVar = (pr) this.b0;
                int measuredHeight2 = (measuredHeight - prVar.V.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.i9 i9Var = prVar.V;
                i9Var.layout(L, measuredHeight2, i9Var.getMeasuredWidth() + L, prVar.V.getMeasuredHeight() + measuredHeight2);
                break;
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                int L2 = org.telegram.messenger.g0.L(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                ht0 ht0Var = (ht0) this.b0;
                int measuredHeight4 = (measuredHeight3 - ht0Var.d.x0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.i9 i9Var2 = ht0Var.d.x0;
                i9Var2.layout(L2, measuredHeight4, i9Var2.getMeasuredWidth() + L2, ht0Var.d.x0.getMeasuredHeight() + measuredHeight4);
                break;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.l8, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a0) {
            case 0:
                super.onMeasure(i7, i10);
                pr prVar = (pr) this.b0;
                prVar.V.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30));
                prVar.V.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                break;
            case 1:
                super.onMeasure(i7, i10);
                ht0 ht0Var = (ht0) this.b0;
                ht0Var.d.x0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30));
                ht0Var.d.x0.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr(ht0 ht0Var, Activity activity) {
        super(activity);
        this.b0 = ht0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr(iw0 iw0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(18, context, e6Var, false, false);
        this.b0 = iw0Var;
    }
}
