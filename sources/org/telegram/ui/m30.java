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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class m30 extends FrameLayout {
    public final Rect a;
    public final RectF b;
    public final Path c;
    public final /* synthetic */ r50 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m30(r50 r50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = r50Var;
        this.a = new Rect();
        this.b = new RectF();
        this.c = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.u uVar;
        r50 r50Var = this.d;
        l30 l30Var = r50Var.b;
        if (r50Var.Z1 != 1.0f) {
            if (r50Var.T2 != null && r50Var.X2) {
                canvas.save();
                float measuredHeight = (r50Var.T2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / r50Var.T2.getAvatarImageView().getMeasuredHeight());
                float f9 = (1.0f - r50Var.Z1) * measuredHeight;
                float dp = AndroidUtilities.dp(13.0f);
                float f10 = r50Var.Z1;
                int i10 = (int) ((dp * f10) + f9);
                int i11 = (int) ((1.0f - f10) * measuredHeight);
                r50Var.T2.getAvatarWavesDrawable().a(canvas, r50Var.T2.getAvatarImageView().getMeasuredHeight() / 2, r50Var.T2.getAvatarImageView().getMeasuredHeight() / 2, this);
                r50Var.T2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                r50Var.T2.getAvatarImageView().r(i10, i10, i11, i11);
                r50Var.T2.getAvatarImageView().getImageReceiver().draw(canvas);
                r50Var.T2.getAvatarImageView().setRoundRadius(r50Var.T2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (r50Var.W2 != null && r50Var.V2 == null && r50Var.K2) {
                canvas.save();
                float measuredHeight2 = (r50Var.W2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / r50Var.W2.getAvatarImageView().getMeasuredHeight());
                float f11 = (1.0f - r50Var.Z1) * measuredHeight2;
                float dp2 = AndroidUtilities.dp(13.0f);
                float f12 = r50Var.Z1;
                int i12 = (int) ((dp2 * f12) + f11);
                int i13 = (int) ((1.0f - f12) * measuredHeight2);
                r50Var.W2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                r50Var.W2.getAvatarImageView().r(i12, i12, i13, i13);
                r50Var.W2.getAvatarImageView().getImageReceiver().draw(canvas);
                r50Var.W2.getAvatarImageView().setRoundRadius(r50Var.W2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        l30Var.setAlpha(r50Var.Z1);
        Path path = this.c;
        path.reset();
        float measuredHeight3 = getMeasuredHeight();
        float measuredWidth = getMeasuredWidth();
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, measuredHeight3, measuredWidth);
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (l30Var.e1) {
            for (int i14 = 0; i14 < l30Var.getChildCount(); i14++) {
                childAt = l30Var.getChildAt(i14);
                if (childAt instanceof org.telegram.ui.Components.hh0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (uVar = r50Var.V2) != null && uVar.v && !r50Var.B2) {
            canvas.save();
            Rect rect = this.a;
            rect.setEmpty();
            l30Var.getChildVisibleRect(childAt, rect, null);
            int i15 = rect.left;
            if (i15 < (-l30Var.getMeasuredWidth())) {
                i15 += l30Var.getMeasuredWidth() * 2;
            } else if (i15 > l30Var.getMeasuredWidth()) {
                i15 -= l30Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i15, 0.0f);
            r50Var.V2.draw(canvas);
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
