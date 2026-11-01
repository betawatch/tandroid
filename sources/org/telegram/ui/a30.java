package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class a30 extends FrameLayout {
    public final Rect a;
    public final RectF b;
    public final Path c;
    public final /* synthetic */ a50 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a30(a50 a50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = a50Var;
        this.a = new Rect();
        this.b = new RectF();
        this.c = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.r rVar;
        a50 a50Var = this.d;
        z20 z20Var = a50Var.i1;
        if (a50Var.U3 != 1.0f) {
            if (a50Var.O4 != null && a50Var.S4) {
                canvas.save();
                float measuredHeight = (a50Var.O4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / a50Var.O4.getAvatarImageView().getMeasuredHeight());
                float f7 = (1.0f - a50Var.U3) * measuredHeight;
                float L = org.telegram.messenger.i0.L(13.0f);
                float f10 = a50Var.U3;
                int i10 = (int) ((L * f10) + f7);
                int i11 = (int) ((1.0f - f10) * measuredHeight);
                a50Var.O4.getAvatarWavesDrawable().a(canvas, a50Var.O4.getAvatarImageView().getMeasuredHeight() / 2, a50Var.O4.getAvatarImageView().getMeasuredHeight() / 2, this);
                a50Var.O4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                a50Var.O4.getAvatarImageView().t(i10, i10, i11, i11);
                a50Var.O4.getAvatarImageView().getImageReceiver().h(canvas, null);
                a50Var.O4.getAvatarImageView().setRoundRadius(a50Var.O4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (a50Var.R4 != null && a50Var.Q4 == null && a50Var.F4) {
                canvas.save();
                float measuredHeight2 = (a50Var.R4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / a50Var.R4.getAvatarImageView().getMeasuredHeight());
                float f11 = (1.0f - a50Var.U3) * measuredHeight2;
                float L2 = org.telegram.messenger.i0.L(13.0f);
                float f12 = a50Var.U3;
                int i12 = (int) ((L2 * f12) + f11);
                int i13 = (int) ((1.0f - f12) * measuredHeight2);
                a50Var.R4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                a50Var.R4.getAvatarImageView().t(i12, i12, i13, i13);
                a50Var.R4.getAvatarImageView().getImageReceiver().h(canvas, null);
                a50Var.R4.getAvatarImageView().setRoundRadius(a50Var.R4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        z20Var.setAlpha(a50Var.U3);
        Path path = this.c;
        path.reset();
        float measuredHeight3 = getMeasuredHeight();
        float measuredWidth = getMeasuredWidth();
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, measuredHeight3, measuredWidth);
        path.addRoundRect(rectF, new float[]{org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (z20Var.i1) {
            for (int i14 = 0; i14 < z20Var.getChildCount(); i14++) {
                childAt = z20Var.getChildAt(i14);
                if (childAt instanceof org.telegram.ui.Components.tg0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (rVar = a50Var.Q4) != null && rVar.w && !a50Var.w4) {
            canvas.save();
            Rect rect = this.a;
            rect.setEmpty();
            z20Var.getChildVisibleRect(childAt, rect, null);
            int i15 = rect.left;
            if (i15 < (-z20Var.getMeasuredWidth())) {
                i15 += z20Var.getMeasuredWidth() * 2;
            } else if (i15 > z20Var.getMeasuredWidth()) {
                i15 -= z20Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i15, 0.0f);
            a50Var.Q4.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.d.b.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, TLObject.FLAG_30));
    }
}
