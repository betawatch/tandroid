package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ls0 extends fs0 {
    public final /* synthetic */ int r = 1;
    public final /* synthetic */ org.telegram.ui.Components.tj0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls0(di.i4 i4Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.s = i4Var;
    }

    @Override // org.telegram.ui.fs0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.e6 e6Var;
        boolean q10;
        org.telegram.ui.ActionBar.e6 e6Var2;
        switch (this.r) {
            case 0:
                float L = org.telegram.messenger.g0.L(10.0f);
                RectF rectF = org.telegram.messenger.g0.P;
                ImageView imageView = this.c;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((ms0) this.s).c;
                premiumPreviewFragment.T.reset();
                premiumPreviewFragment.T.postScale(1.0f, premiumPreviewFragment.O / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.T.postTranslate(0.0f, -this.f.e);
                premiumPreviewFragment.S.setLocalMatrix(premiumPreviewFragment.T);
                canvas.drawRoundRect(rectF, L, L, premiumPreviewFragment.U);
                e6Var = ((org.telegram.ui.ActionBar.e2) premiumPreviewFragment).resourceProvider;
                if (e6Var != null) {
                    e6Var2 = ((org.telegram.ui.ActionBar.e2) premiumPreviewFragment).resourceProvider;
                    q10 = e6Var2.a();
                } else {
                    q10 = org.telegram.ui.ActionBar.j6.I.q();
                }
                if (q10) {
                    float L2 = org.telegram.messenger.g0.L(1.0f);
                    premiumPreviewFragment.R.setStrokeWidth(L2);
                    canvas.save();
                    canvas.translate(rectF.left, rectF.top);
                    rectF.offset(-rectF.left, -rectF.top);
                    float f10 = L2 / 2.0f;
                    rectF.inset(f10, f10);
                    canvas.drawRoundRect(rectF, L, L, premiumPreviewFragment.R);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                break;
            default:
                RectF rectF2 = org.telegram.messenger.g0.P;
                ImageView imageView2 = this.c;
                rectF2.set(imageView2.getLeft(), imageView2.getTop(), imageView2.getRight(), imageView2.getBottom());
                di.i4 i4Var = (di.i4) this.s;
                ((ug.g1) i4Var.d).l2.d(0, 0.0f, 0, getMeasuredWidth(), -this.f.e, ((ug.g1) i4Var.d).a2);
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), ((ug.g1) i4Var.d).l2.f);
                super.dispatchDraw(canvas);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls0(ms0 ms0Var, Context context) {
        super(context, null);
        this.s = ms0Var;
    }
}
