package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class b20 extends FrameLayout {
    public final Rect a;
    public final RectF b;
    public final Path c;
    public final /* synthetic */ c40 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b20(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = c40Var;
        this.a = new Rect();
        this.b = new RectF();
        this.c = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.z zVar;
        c40 c40Var = this.d;
        a20 a20Var = c40Var.m1;
        if (c40Var.c4 != 1.0f) {
            if (c40Var.W4 != null && c40Var.a5) {
                canvas.save();
                float measuredHeight = (c40Var.W4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / c40Var.W4.getAvatarImageView().getMeasuredHeight());
                float f10 = (1.0f - c40Var.c4) * measuredHeight;
                float L = org.telegram.messenger.g0.L(13.0f);
                float f11 = c40Var.c4;
                int i7 = (int) ((L * f11) + f10);
                int i10 = (int) ((1.0f - f11) * measuredHeight);
                c40Var.W4.getAvatarWavesDrawable().a(canvas, c40Var.W4.getAvatarImageView().getMeasuredHeight() / 2, c40Var.W4.getAvatarImageView().getMeasuredHeight() / 2, this);
                c40Var.W4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                c40Var.W4.getAvatarImageView().t(i7, i7, i10, i10);
                c40Var.W4.getAvatarImageView().getImageReceiver().h(canvas, null);
                c40Var.W4.getAvatarImageView().setRoundRadius(c40Var.W4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (c40Var.Z4 != null && c40Var.Y4 == null && c40Var.N4) {
                canvas.save();
                float measuredHeight2 = (c40Var.Z4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / c40Var.Z4.getAvatarImageView().getMeasuredHeight());
                float f12 = (1.0f - c40Var.c4) * measuredHeight2;
                float L2 = org.telegram.messenger.g0.L(13.0f);
                float f13 = c40Var.c4;
                int i11 = (int) ((L2 * f13) + f12);
                int i12 = (int) ((1.0f - f13) * measuredHeight2);
                c40Var.Z4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                c40Var.Z4.getAvatarImageView().t(i11, i11, i12, i12);
                c40Var.Z4.getAvatarImageView().getImageReceiver().h(canvas, null);
                c40Var.Z4.getAvatarImageView().setRoundRadius(c40Var.Z4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        a20Var.setAlpha(c40Var.c4);
        Path path = this.c;
        path.reset();
        float measuredHeight3 = getMeasuredHeight();
        float measuredWidth = getMeasuredWidth();
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, measuredHeight3, measuredWidth);
        path.addRoundRect(rectF, new float[]{org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (a20Var.j1) {
            for (int i13 = 0; i13 < a20Var.getChildCount(); i13++) {
                childAt = a20Var.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Components.tf0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (zVar = c40Var.Y4) != null && zVar.w && !c40Var.E4) {
            canvas.save();
            Rect rect = this.a;
            rect.setEmpty();
            a20Var.getChildVisibleRect(childAt, rect, null);
            int i14 = rect.left;
            if (i14 < (-a20Var.getMeasuredWidth())) {
                i14 += a20Var.getMeasuredWidth() * 2;
            } else if (i14 > a20Var.getMeasuredWidth()) {
                i14 -= a20Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i14, 0.0f);
            c40Var.Y4.draw(canvas);
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
