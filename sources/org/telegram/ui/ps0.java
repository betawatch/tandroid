package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.ImageView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ps0 extends js0 {
    public final /* synthetic */ int r = 1;
    public final /* synthetic */ org.telegram.ui.Components.bk0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps0(di.l4 l4Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.s = l4Var;
    }

    @Override // org.telegram.ui.js0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.i6 i6Var;
        boolean q10;
        org.telegram.ui.ActionBar.i6 i6Var2;
        switch (this.r) {
            case 0:
                float L = org.telegram.messenger.g0.L(10.0f);
                RectF rectF = org.telegram.messenger.g0.P;
                ImageView imageView = this.c;
                rectF.set(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
                PremiumPreviewFragment premiumPreviewFragment = ((qs0) this.s).c;
                premiumPreviewFragment.T.reset();
                premiumPreviewFragment.T.postScale(1.0f, premiumPreviewFragment.O / 100.0f, 0.0f, 0.0f);
                premiumPreviewFragment.T.postTranslate(0.0f, -this.f.e);
                premiumPreviewFragment.S.setLocalMatrix(premiumPreviewFragment.T);
                canvas.drawRoundRect(rectF, L, L, premiumPreviewFragment.U);
                i6Var = ((org.telegram.ui.ActionBar.h2) premiumPreviewFragment).resourceProvider;
                if (i6Var != null) {
                    i6Var2 = ((org.telegram.ui.ActionBar.h2) premiumPreviewFragment).resourceProvider;
                    q10 = i6Var2.d();
                } else {
                    q10 = org.telegram.ui.ActionBar.n6.I.q();
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
                di.l4 l4Var = (di.l4) this.s;
                ((ug.i1) l4Var.d).l2.d(0, 0.0f, 0, getMeasuredWidth(), -this.f.e, ((ug.i1) l4Var.d).a2);
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), ((ug.i1) l4Var.d).l2.f);
                super.dispatchDraw(canvas);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps0(qs0 qs0Var, Context context) {
        super(context, null);
        this.s = qs0Var;
    }
}
