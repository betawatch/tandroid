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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class k30 extends FrameLayout {
    public final Rect a;
    public final RectF b;
    public final Path c;
    public final /* synthetic */ q50 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k30(q50 q50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = q50Var;
        this.a = new Rect();
        this.b = new RectF();
        this.c = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.t tVar;
        q50 q50Var = this.d;
        j30 j30Var = q50Var.b;
        if (q50Var.d2 != 1.0f) {
            if (q50Var.X2 != null && q50Var.b3) {
                canvas.save();
                float measuredHeight = (q50Var.X2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / q50Var.X2.getAvatarImageView().getMeasuredHeight());
                float f7 = (1.0f - q50Var.d2) * measuredHeight;
                float dp = AndroidUtilities.dp(13.0f);
                float f10 = q50Var.d2;
                int i10 = (int) ((dp * f10) + f7);
                int i11 = (int) ((1.0f - f10) * measuredHeight);
                q50Var.X2.getAvatarWavesDrawable().a(canvas, q50Var.X2.getAvatarImageView().getMeasuredHeight() / 2, q50Var.X2.getAvatarImageView().getMeasuredHeight() / 2, this);
                q50Var.X2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                q50Var.X2.getAvatarImageView().r(i10, i10, i11, i11);
                q50Var.X2.getAvatarImageView().getImageReceiver().draw(canvas);
                q50Var.X2.getAvatarImageView().setRoundRadius(q50Var.X2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (q50Var.a3 != null && q50Var.Z2 == null && q50Var.O2) {
                canvas.save();
                float measuredHeight2 = (q50Var.a3.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / q50Var.a3.getAvatarImageView().getMeasuredHeight());
                float f11 = (1.0f - q50Var.d2) * measuredHeight2;
                float dp2 = AndroidUtilities.dp(13.0f);
                float f12 = q50Var.d2;
                int i12 = (int) ((dp2 * f12) + f11);
                int i13 = (int) ((1.0f - f12) * measuredHeight2);
                q50Var.a3.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                q50Var.a3.getAvatarImageView().r(i12, i12, i13, i13);
                q50Var.a3.getAvatarImageView().getImageReceiver().draw(canvas);
                q50Var.a3.getAvatarImageView().setRoundRadius(q50Var.a3.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        j30Var.setAlpha(q50Var.d2);
        Path path = this.c;
        path.reset();
        float measuredHeight3 = getMeasuredHeight();
        float measuredWidth = getMeasuredWidth();
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, measuredHeight3, measuredWidth);
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (j30Var.i1) {
            for (int i14 = 0; i14 < j30Var.getChildCount(); i14++) {
                childAt = j30Var.getChildAt(i14);
                if (childAt instanceof org.telegram.ui.Components.hi0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (tVar = q50Var.Z2) != null && tVar.v && !q50Var.F2) {
            canvas.save();
            Rect rect = this.a;
            rect.setEmpty();
            j30Var.getChildVisibleRect(childAt, rect, null);
            int i15 = rect.left;
            if (i15 < (-j30Var.getMeasuredWidth())) {
                i15 += j30Var.getMeasuredWidth() * 2;
            } else if (i15 > j30Var.getMeasuredWidth()) {
                i15 -= j30Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i15, 0.0f);
            q50Var.Z2.draw(canvas);
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
