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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class f40 extends FrameLayout {
    public final Rect a;
    public final RectF b;
    public final Path c;
    public final /* synthetic */ k60 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f40(k60 k60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = k60Var;
        this.a = new Rect();
        this.b = new RectF();
        this.c = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.u uVar;
        k60 k60Var = this.d;
        e40 e40Var = k60Var.b;
        if (k60Var.d2 != 1.0f) {
            if (k60Var.X2 != null && k60Var.b3) {
                canvas.save();
                float measuredHeight = (k60Var.X2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / k60Var.X2.getAvatarImageView().getMeasuredHeight());
                float f7 = (1.0f - k60Var.d2) * measuredHeight;
                float dp = AndroidUtilities.dp(13.0f);
                float f10 = k60Var.d2;
                int i10 = (int) ((dp * f10) + f7);
                int i11 = (int) ((1.0f - f10) * measuredHeight);
                k60Var.X2.getAvatarWavesDrawable().a(canvas, k60Var.X2.getAvatarImageView().getMeasuredHeight() / 2, k60Var.X2.getAvatarImageView().getMeasuredHeight() / 2, this);
                k60Var.X2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                k60Var.X2.getAvatarImageView().r(i10, i10, i11, i11);
                k60Var.X2.getAvatarImageView().getImageReceiver().draw(canvas);
                k60Var.X2.getAvatarImageView().setRoundRadius(k60Var.X2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (k60Var.a3 != null && k60Var.Z2 == null && k60Var.O2) {
                canvas.save();
                float measuredHeight2 = (k60Var.a3.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / k60Var.a3.getAvatarImageView().getMeasuredHeight());
                float f11 = (1.0f - k60Var.d2) * measuredHeight2;
                float dp2 = AndroidUtilities.dp(13.0f);
                float f12 = k60Var.d2;
                int i12 = (int) ((dp2 * f12) + f11);
                int i13 = (int) ((1.0f - f12) * measuredHeight2);
                k60Var.a3.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                k60Var.a3.getAvatarImageView().r(i12, i12, i13, i13);
                k60Var.a3.getAvatarImageView().getImageReceiver().draw(canvas);
                k60Var.a3.getAvatarImageView().setRoundRadius(k60Var.a3.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        e40Var.setAlpha(k60Var.d2);
        Path path = this.c;
        path.reset();
        float measuredHeight3 = getMeasuredHeight();
        float measuredWidth = getMeasuredWidth();
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, measuredHeight3, measuredWidth);
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (e40Var.i1) {
            for (int i14 = 0; i14 < e40Var.getChildCount(); i14++) {
                childAt = e40Var.getChildAt(i14);
                if (childAt instanceof org.telegram.ui.Components.mh0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (uVar = k60Var.Z2) != null && uVar.v && !k60Var.F2) {
            canvas.save();
            Rect rect = this.a;
            rect.setEmpty();
            e40Var.getChildVisibleRect(childAt, rect, null);
            int i15 = rect.left;
            if (i15 < (-e40Var.getMeasuredWidth())) {
                i15 += e40Var.getMeasuredWidth() * 2;
            } else if (i15 > e40Var.getMeasuredWidth()) {
                i15 -= e40Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i15, 0.0f);
            k60Var.Z2.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.d).containerView;
        viewGroup.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, TLObject.FLAG_30));
    }
}
