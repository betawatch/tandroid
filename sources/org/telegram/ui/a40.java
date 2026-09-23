package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class a40 extends FrameLayout {
    public final Rect a;
    public final RectF b;
    public final Path c;
    public final /* synthetic */ f60 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a40(f60 f60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = f60Var;
        this.a = new Rect();
        this.b = new RectF();
        this.c = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.u uVar;
        f60 f60Var = this.d;
        z30 z30Var = f60Var.b;
        if (f60Var.d2 != 1.0f) {
            if (f60Var.X2 != null && f60Var.b3) {
                canvas.save();
                float measuredHeight = (f60Var.X2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / f60Var.X2.getAvatarImageView().getMeasuredHeight());
                float f7 = (1.0f - f60Var.d2) * measuredHeight;
                float dp = AndroidUtilities.dp(13.0f);
                float f10 = f60Var.d2;
                int i10 = (int) ((dp * f10) + f7);
                int i11 = (int) ((1.0f - f10) * measuredHeight);
                f60Var.X2.getAvatarWavesDrawable().a(canvas, f60Var.X2.getAvatarImageView().getMeasuredHeight() / 2, f60Var.X2.getAvatarImageView().getMeasuredHeight() / 2, this);
                f60Var.X2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                f60Var.X2.getAvatarImageView().r(i10, i10, i11, i11);
                f60Var.X2.getAvatarImageView().getImageReceiver().draw(canvas);
                f60Var.X2.getAvatarImageView().setRoundRadius(f60Var.X2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (f60Var.a3 != null && f60Var.Z2 == null && f60Var.O2) {
                canvas.save();
                float measuredHeight2 = (f60Var.a3.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / f60Var.a3.getAvatarImageView().getMeasuredHeight());
                float f11 = (1.0f - f60Var.d2) * measuredHeight2;
                float dp2 = AndroidUtilities.dp(13.0f);
                float f12 = f60Var.d2;
                int i12 = (int) ((dp2 * f12) + f11);
                int i13 = (int) ((1.0f - f12) * measuredHeight2);
                f60Var.a3.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                f60Var.a3.getAvatarImageView().r(i12, i12, i13, i13);
                f60Var.a3.getAvatarImageView().getImageReceiver().draw(canvas);
                f60Var.a3.getAvatarImageView().setRoundRadius(f60Var.a3.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        z30Var.setAlpha(f60Var.d2);
        Path path = this.c;
        path.reset();
        float measuredHeight3 = getMeasuredHeight();
        float measuredWidth = getMeasuredWidth();
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, measuredHeight3, measuredWidth);
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (z30Var.i1) {
            for (int i14 = 0; i14 < z30Var.getChildCount(); i14++) {
                childAt = z30Var.getChildAt(i14);
                if (childAt instanceof org.telegram.ui.Components.mh0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (uVar = f60Var.Z2) != null && uVar.v && !f60Var.F2) {
            canvas.save();
            Rect rect = this.a;
            rect.setEmpty();
            z30Var.getChildVisibleRect(childAt, rect, null);
            int i15 = rect.left;
            if (i15 < (-z30Var.getMeasuredWidth())) {
                i15 += z30Var.getMeasuredWidth() * 2;
            } else if (i15 > z30Var.getMeasuredWidth()) {
                i15 -= z30Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i15, 0.0f);
            f60Var.Z2.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.d).containerView;
        viewGroup.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, TLObject.FLAG_30));
    }
}
