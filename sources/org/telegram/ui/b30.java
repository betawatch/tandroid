package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b30 extends FrameLayout {
    public final Rect a;
    public final RectF b;
    public final Path c;
    public final /* synthetic */ b50 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b30(b50 b50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = b50Var;
        this.a = new Rect();
        this.b = new RectF();
        this.c = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.r rVar;
        b50 b50Var = this.d;
        a30 a30Var = b50Var.i1;
        if (b50Var.U3 != 1.0f) {
            if (b50Var.O4 != null && b50Var.S4) {
                canvas.save();
                float measuredHeight = (b50Var.O4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / b50Var.O4.getAvatarImageView().getMeasuredHeight());
                float f7 = (1.0f - b50Var.U3) * measuredHeight;
                float L = org.telegram.messenger.i0.L(13.0f);
                float f10 = b50Var.U3;
                int i10 = (int) ((L * f10) + f7);
                int i11 = (int) ((1.0f - f10) * measuredHeight);
                b50Var.O4.getAvatarWavesDrawable().a(canvas, b50Var.O4.getAvatarImageView().getMeasuredHeight() / 2, b50Var.O4.getAvatarImageView().getMeasuredHeight() / 2, this);
                b50Var.O4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                b50Var.O4.getAvatarImageView().t(i10, i10, i11, i11);
                b50Var.O4.getAvatarImageView().getImageReceiver().h(canvas, null);
                b50Var.O4.getAvatarImageView().setRoundRadius(b50Var.O4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (b50Var.R4 != null && b50Var.Q4 == null && b50Var.F4) {
                canvas.save();
                float measuredHeight2 = (b50Var.R4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / b50Var.R4.getAvatarImageView().getMeasuredHeight());
                float f11 = (1.0f - b50Var.U3) * measuredHeight2;
                float L2 = org.telegram.messenger.i0.L(13.0f);
                float f12 = b50Var.U3;
                int i12 = (int) ((L2 * f12) + f11);
                int i13 = (int) ((1.0f - f12) * measuredHeight2);
                b50Var.R4.getAvatarImageView().getImageReceiver().y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                b50Var.R4.getAvatarImageView().t(i12, i12, i13, i13);
                b50Var.R4.getAvatarImageView().getImageReceiver().h(canvas, null);
                b50Var.R4.getAvatarImageView().setRoundRadius(b50Var.R4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        a30Var.setAlpha(b50Var.U3);
        Path path = this.c;
        path.reset();
        float measuredHeight3 = getMeasuredHeight();
        float measuredWidth = getMeasuredWidth();
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, measuredHeight3, measuredWidth);
        path.addRoundRect(rectF, new float[]{org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (a30Var.i1) {
            for (int i14 = 0; i14 < a30Var.getChildCount(); i14++) {
                childAt = a30Var.getChildAt(i14);
                if (childAt instanceof org.telegram.ui.Components.sg0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (rVar = b50Var.Q4) != null && rVar.w && !b50Var.w4) {
            canvas.save();
            Rect rect = this.a;
            rect.setEmpty();
            a30Var.getChildVisibleRect(childAt, rect, null);
            int i15 = rect.left;
            if (i15 < (-a30Var.getMeasuredWidth())) {
                i15 += a30Var.getMeasuredWidth() * 2;
            } else if (i15 > a30Var.getMeasuredWidth()) {
                i15 -= a30Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i15, 0.0f);
            b50Var.Q4.draw(canvas);
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
