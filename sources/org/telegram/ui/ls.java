package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ls extends org.telegram.ui.Cells.p8 {
    public final /* synthetic */ int W = 0;
    public final /* synthetic */ Object a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls(ns nsVar, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.a0 = nsVar;
    }

    @Override // org.telegram.ui.Cells.p8
    public int e(int i10) {
        switch (this.W) {
            case 2:
                ProfileActivity profileActivity = ((wx0) this.a0).e;
                RectF rectF = ProfileActivity.S6;
                profileActivity.getClass();
                break;
        }
        return i10;
    }

    @Override // org.telegram.ui.Cells.p8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.W) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int L = org.telegram.messenger.i0.L(21.0f);
                int measuredHeight = getMeasuredHeight();
                ns nsVar = (ns) this.a0;
                int measuredHeight2 = (measuredHeight - nsVar.U.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.g9 g9Var = nsVar.U;
                g9Var.layout(L, measuredHeight2, g9Var.getMeasuredWidth() + L, nsVar.U.getMeasuredHeight() + measuredHeight2);
                break;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int L2 = org.telegram.messenger.i0.L(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                ru0 ru0Var = (ru0) this.a0;
                int measuredHeight4 = (measuredHeight3 - ru0Var.d.u0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.g9 g9Var2 = ru0Var.d.u0;
                g9Var2.layout(L2, measuredHeight4, g9Var2.getMeasuredWidth() + L2, ru0Var.d.u0.getMeasuredHeight() + measuredHeight4);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.p8, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.W) {
            case 0:
                super.onMeasure(i10, i11);
                ns nsVar = (ns) this.a0;
                nsVar.U.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(30.0f), TLObject.FLAG_30));
                nsVar.U.setRoundRadius(org.telegram.messenger.i0.L(30.0f));
                break;
            case 1:
                super.onMeasure(i10, i11);
                ru0 ru0Var = (ru0) this.a0;
                ru0Var.d.u0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(30.0f), TLObject.FLAG_30));
                ru0Var.d.u0.setRoundRadius(org.telegram.messenger.i0.L(30.0f));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls(ru0 ru0Var, Activity activity) {
        super(activity);
        this.a0 = ru0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls(wx0 wx0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(18, context, p6Var, false, false);
        this.a0 = wx0Var;
    }
}
