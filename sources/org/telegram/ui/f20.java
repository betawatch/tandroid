package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class f20 extends FrameLayout {
    public final Rect a;
    public final RectF b;
    public final Path c;
    public final /* synthetic */ f40 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f20(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = f40Var;
        this.a = new Rect();
        this.b = new RectF();
        this.c = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.y yVar;
        f40 f40Var = this.d;
        e20 e20Var = f40Var.l1;
        if (f40Var.X3 != 1.0f) {
            if (f40Var.R4 != null && f40Var.V4) {
                canvas.save();
                float measuredHeight = (f40Var.R4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / f40Var.R4.getAvatarImageView().getMeasuredHeight());
                float f10 = (1.0f - f40Var.X3) * measuredHeight;
                float L = org.telegram.messenger.g0.L(13.0f);
                float f11 = f40Var.X3;
                int i7 = (int) ((L * f11) + f10);
                int i10 = (int) ((1.0f - f11) * measuredHeight);
                f40Var.R4.getAvatarWavesDrawable().a(canvas, f40Var.R4.getAvatarImageView().getMeasuredHeight() / 2, f40Var.R4.getAvatarImageView().getMeasuredHeight() / 2, this);
                f40Var.R4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                f40Var.R4.getAvatarImageView().t(i7, i7, i10, i10);
                f40Var.R4.getAvatarImageView().getImageReceiver().h(canvas, null);
                f40Var.R4.getAvatarImageView().setRoundRadius(f40Var.R4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (f40Var.U4 != null && f40Var.T4 == null && f40Var.I4) {
                canvas.save();
                float measuredHeight2 = (f40Var.U4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / f40Var.U4.getAvatarImageView().getMeasuredHeight());
                float f12 = (1.0f - f40Var.X3) * measuredHeight2;
                float L2 = org.telegram.messenger.g0.L(13.0f);
                float f13 = f40Var.X3;
                int i11 = (int) ((L2 * f13) + f12);
                int i12 = (int) ((1.0f - f13) * measuredHeight2);
                f40Var.U4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                f40Var.U4.getAvatarImageView().t(i11, i11, i12, i12);
                f40Var.U4.getAvatarImageView().getImageReceiver().h(canvas, null);
                f40Var.U4.getAvatarImageView().setRoundRadius(f40Var.U4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        e20Var.setAlpha(f40Var.X3);
        Path path = this.c;
        path.reset();
        float measuredHeight3 = getMeasuredHeight();
        float measuredWidth = getMeasuredWidth();
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, measuredHeight3, measuredWidth);
        path.addRoundRect(rectF, new float[]{org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (e20Var.i1) {
            for (int i13 = 0; i13 < e20Var.getChildCount(); i13++) {
                childAt = e20Var.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Components.qf0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (yVar = f40Var.T4) != null && yVar.w && !f40Var.z4) {
            canvas.save();
            Rect rect = this.a;
            rect.setEmpty();
            e20Var.getChildVisibleRect(childAt, rect, null);
            int i14 = rect.left;
            if (i14 < (-e20Var.getMeasuredWidth())) {
                i14 += e20Var.getMeasuredWidth() * 2;
            } else if (i14 > e20Var.getMeasuredWidth()) {
                i14 -= e20Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i14, 0.0f);
            f40Var.T4.draw(canvas);
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
