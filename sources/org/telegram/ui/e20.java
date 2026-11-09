package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class e20 extends FrameLayout {
    public final Rect a;
    public final RectF b;
    public final Path c;
    public final /* synthetic */ e40 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e20(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = e40Var;
        this.a = new Rect();
        this.b = new RectF();
        this.c = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.y yVar;
        e40 e40Var = this.d;
        d20 d20Var = e40Var.i1;
        if (e40Var.U3 != 1.0f) {
            if (e40Var.O4 != null && e40Var.S4) {
                canvas.save();
                float measuredHeight = (e40Var.O4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / e40Var.O4.getAvatarImageView().getMeasuredHeight());
                float f10 = (1.0f - e40Var.U3) * measuredHeight;
                float L = org.telegram.messenger.g0.L(13.0f);
                float f11 = e40Var.U3;
                int i7 = (int) ((L * f11) + f10);
                int i10 = (int) ((1.0f - f11) * measuredHeight);
                e40Var.O4.getAvatarWavesDrawable().a(canvas, e40Var.O4.getAvatarImageView().getMeasuredHeight() / 2, e40Var.O4.getAvatarImageView().getMeasuredHeight() / 2, this);
                e40Var.O4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                e40Var.O4.getAvatarImageView().t(i7, i7, i10, i10);
                e40Var.O4.getAvatarImageView().getImageReceiver().h(canvas, null);
                e40Var.O4.getAvatarImageView().setRoundRadius(e40Var.O4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (e40Var.R4 != null && e40Var.Q4 == null && e40Var.F4) {
                canvas.save();
                float measuredHeight2 = (e40Var.R4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / e40Var.R4.getAvatarImageView().getMeasuredHeight());
                float f12 = (1.0f - e40Var.U3) * measuredHeight2;
                float L2 = org.telegram.messenger.g0.L(13.0f);
                float f13 = e40Var.U3;
                int i11 = (int) ((L2 * f13) + f12);
                int i12 = (int) ((1.0f - f13) * measuredHeight2);
                e40Var.R4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                e40Var.R4.getAvatarImageView().t(i11, i11, i12, i12);
                e40Var.R4.getAvatarImageView().getImageReceiver().h(canvas, null);
                e40Var.R4.getAvatarImageView().setRoundRadius(e40Var.R4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        d20Var.setAlpha(e40Var.U3);
        Path path = this.c;
        path.reset();
        float measuredHeight3 = getMeasuredHeight();
        float measuredWidth = getMeasuredWidth();
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, measuredHeight3, measuredWidth);
        path.addRoundRect(rectF, new float[]{org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (d20Var.i1) {
            for (int i13 = 0; i13 < d20Var.getChildCount(); i13++) {
                childAt = d20Var.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Components.rf0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (yVar = e40Var.Q4) != null && yVar.w && !e40Var.w4) {
            canvas.save();
            Rect rect = this.a;
            rect.setEmpty();
            d20Var.getChildVisibleRect(childAt, rect, null);
            int i14 = rect.left;
            if (i14 < (-d20Var.getMeasuredWidth())) {
                i14 += d20Var.getMeasuredWidth() * 2;
            } else if (i14 > d20Var.getMeasuredWidth()) {
                i14 -= d20Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i14, 0.0f);
            e40Var.Q4.draw(canvas);
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
    public final void onMeasure(int i7, int i10) {
        int min = Math.min(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, TLObject.FLAG_30));
    }
}
