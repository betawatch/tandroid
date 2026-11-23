package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class or extends org.telegram.ui.Cells.m8 {
    public final /* synthetic */ int a0 = 1;
    public final /* synthetic */ Object b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or(qr qrVar, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.b0 = qrVar;
    }

    @Override // org.telegram.ui.Cells.m8
    public int e(int i7) {
        switch (this.a0) {
            case 2:
                ProfileActivity profileActivity = ((jw0) this.b0).e;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getClass();
                break;
        }
        return i7;
    }

    @Override // org.telegram.ui.Cells.m8, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.a0) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                int L = org.telegram.messenger.g0.L(21.0f);
                int measuredHeight = getMeasuredHeight();
                qr qrVar = (qr) this.b0;
                int measuredHeight2 = (measuredHeight - qrVar.V.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.p9 p9Var = qrVar.V;
                p9Var.layout(L, measuredHeight2, p9Var.getMeasuredWidth() + L, qrVar.V.getMeasuredHeight() + measuredHeight2);
                break;
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                int L2 = org.telegram.messenger.g0.L(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                jt0 jt0Var = (jt0) this.b0;
                int measuredHeight4 = (measuredHeight3 - jt0Var.d.x0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.p9 p9Var2 = jt0Var.d.x0;
                p9Var2.layout(L2, measuredHeight4, p9Var2.getMeasuredWidth() + L2, jt0Var.d.x0.getMeasuredHeight() + measuredHeight4);
                break;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.m8, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a0) {
            case 0:
                super.onMeasure(i7, i10);
                qr qrVar = (qr) this.b0;
                qrVar.V.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30));
                qrVar.V.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                break;
            case 1:
                super.onMeasure(i7, i10);
                jt0 jt0Var = (jt0) this.b0;
                jt0Var.d.x0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(30.0f), TLObject.FLAG_30));
                jt0Var.d.x0.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or(jt0 jt0Var, Activity activity) {
        super(activity);
        this.b0 = jt0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or(jw0 jw0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(18, context, i6Var, false, false);
        this.b0 = jw0Var;
    }
}
