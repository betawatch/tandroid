package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class nr extends org.telegram.ui.Cells.m8 {
    public final /* synthetic */ int W = 1;
    public final /* synthetic */ Object a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr(pr prVar, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.a0 = prVar;
    }

    @Override // org.telegram.ui.Cells.m8
    public int e(int i7) {
        switch (this.W) {
            case 2:
                ProfileActivity profileActivity = ((lw0) this.a0).e;
                RectF rectF = ProfileActivity.V6;
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
                pr prVar = (pr) this.a0;
                int measuredHeight2 = (measuredHeight - prVar.U.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.l9 l9Var = prVar.U;
                l9Var.layout(L, measuredHeight2, l9Var.getMeasuredWidth() + L, prVar.U.getMeasuredHeight() + measuredHeight2);
                break;
            case 1:
                super.onLayout(z9, i7, i10, i11, i12);
                int L2 = org.telegram.messenger.g0.L(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                lt0 lt0Var = (lt0) this.a0;
                int measuredHeight4 = (measuredHeight3 - lt0Var.d.w0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.l9 l9Var2 = lt0Var.d.w0;
                l9Var2.layout(L2, measuredHeight4, l9Var2.getMeasuredWidth() + L2, lt0Var.d.w0.getMeasuredHeight() + measuredHeight4);
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
                pr prVar = (pr) this.a0;
                prVar.U.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30));
                prVar.U.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                break;
            case 1:
                super.onMeasure(i7, i10);
                lt0 lt0Var = (lt0) this.a0;
                lt0Var.d.w0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30));
                lt0Var.d.w0.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr(lt0 lt0Var, Activity activity) {
        super(activity);
        this.a0 = lt0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr(lw0 lw0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(18, context, g6Var, false, false);
        this.a0 = lw0Var;
    }
}
