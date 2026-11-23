package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class e20 extends FrameLayout {
    public final Rect a;
    public final RectF b;
    public final Path c;
    public final /* synthetic */ f40 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e20(f40 f40Var, LaunchActivity launchActivity) {
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
        d20 d20Var = f40Var.m1;
        if (f40Var.c4 != 1.0f) {
            if (f40Var.W4 != null && f40Var.a5) {
                canvas.save();
                float measuredHeight = (f40Var.W4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / f40Var.W4.getAvatarImageView().getMeasuredHeight());
                float f10 = (1.0f - f40Var.c4) * measuredHeight;
                float L = org.telegram.messenger.g0.L(13.0f);
                float f11 = f40Var.c4;
                int i7 = (int) ((L * f11) + f10);
                int i10 = (int) ((1.0f - f11) * measuredHeight);
                f40Var.W4.getAvatarWavesDrawable().a(canvas, f40Var.W4.getAvatarImageView().getMeasuredHeight() / 2, f40Var.W4.getAvatarImageView().getMeasuredHeight() / 2, this);
                f40Var.W4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                f40Var.W4.getAvatarImageView().t(i7, i7, i10, i10);
                f40Var.W4.getAvatarImageView().getImageReceiver().h(canvas, null);
                f40Var.W4.getAvatarImageView().setRoundRadius(f40Var.W4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (f40Var.Z4 != null && f40Var.Y4 == null && f40Var.N4) {
                canvas.save();
                float measuredHeight2 = (f40Var.Z4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / f40Var.Z4.getAvatarImageView().getMeasuredHeight());
                float f12 = (1.0f - f40Var.c4) * measuredHeight2;
                float L2 = org.telegram.messenger.g0.L(13.0f);
                float f13 = f40Var.c4;
                int i11 = (int) ((L2 * f13) + f12);
                int i12 = (int) ((1.0f - f13) * measuredHeight2);
                f40Var.Z4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                f40Var.Z4.getAvatarImageView().t(i11, i11, i12, i12);
                f40Var.Z4.getAvatarImageView().getImageReceiver().h(canvas, null);
                f40Var.Z4.getAvatarImageView().setRoundRadius(f40Var.Z4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        d20Var.setAlpha(f40Var.c4);
        Path path = this.c;
        path.reset();
        float measuredHeight3 = getMeasuredHeight();
        float measuredWidth = getMeasuredWidth();
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, measuredHeight3, measuredWidth);
        path.addRoundRect(rectF, new float[]{org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (d20Var.j1) {
            for (int i13 = 0; i13 < d20Var.getChildCount(); i13++) {
                childAt = d20Var.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Components.fg0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (yVar = f40Var.Y4) != null && yVar.w && !f40Var.E4) {
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
            f40Var.Y4.draw(canvas);
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
