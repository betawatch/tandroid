package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class c20 extends FrameLayout {
    public final Rect a;
    public final RectF b;
    public final Path c;
    public final /* synthetic */ c40 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c20(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = c40Var;
        this.a = new Rect();
        this.b = new RectF();
        this.c = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.y yVar;
        c40 c40Var = this.d;
        b20 b20Var = c40Var.i1;
        if (c40Var.U3 != 1.0f) {
            if (c40Var.O4 != null && c40Var.S4) {
                canvas.save();
                float measuredHeight = (c40Var.O4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / c40Var.O4.getAvatarImageView().getMeasuredHeight());
                float f10 = (1.0f - c40Var.U3) * measuredHeight;
                float L = org.telegram.messenger.g0.L(13.0f);
                float f11 = c40Var.U3;
                int i7 = (int) ((L * f11) + f10);
                int i10 = (int) ((1.0f - f11) * measuredHeight);
                c40Var.O4.getAvatarWavesDrawable().a(canvas, c40Var.O4.getAvatarImageView().getMeasuredHeight() / 2, c40Var.O4.getAvatarImageView().getMeasuredHeight() / 2, this);
                c40Var.O4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                c40Var.O4.getAvatarImageView().t(i7, i7, i10, i10);
                c40Var.O4.getAvatarImageView().getImageReceiver().h(canvas, null);
                c40Var.O4.getAvatarImageView().setRoundRadius(c40Var.O4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (c40Var.R4 != null && c40Var.Q4 == null && c40Var.F4) {
                canvas.save();
                float measuredHeight2 = (c40Var.R4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / c40Var.R4.getAvatarImageView().getMeasuredHeight());
                float f12 = (1.0f - c40Var.U3) * measuredHeight2;
                float L2 = org.telegram.messenger.g0.L(13.0f);
                float f13 = c40Var.U3;
                int i11 = (int) ((L2 * f13) + f12);
                int i12 = (int) ((1.0f - f13) * measuredHeight2);
                c40Var.R4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                c40Var.R4.getAvatarImageView().t(i11, i11, i12, i12);
                c40Var.R4.getAvatarImageView().getImageReceiver().h(canvas, null);
                c40Var.R4.getAvatarImageView().setRoundRadius(c40Var.R4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        b20Var.setAlpha(c40Var.U3);
        Path path = this.c;
        path.reset();
        float measuredHeight3 = getMeasuredHeight();
        float measuredWidth = getMeasuredWidth();
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, measuredHeight3, measuredWidth);
        path.addRoundRect(rectF, new float[]{org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (b20Var.i1) {
            for (int i13 = 0; i13 < b20Var.getChildCount(); i13++) {
                childAt = b20Var.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Components.qf0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (yVar = c40Var.Q4) != null && yVar.w && !c40Var.w4) {
            canvas.save();
            Rect rect = this.a;
            rect.setEmpty();
            b20Var.getChildVisibleRect(childAt, rect, null);
            int i14 = rect.left;
            if (i14 < (-b20Var.getMeasuredWidth())) {
                i14 += b20Var.getMeasuredWidth() * 2;
            } else if (i14 > b20Var.getMeasuredWidth()) {
                i14 -= b20Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i14, 0.0f);
            c40Var.Q4.draw(canvas);
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
