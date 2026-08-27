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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class m30 extends FrameLayout {
    public final Rect a;
    public final RectF b;
    public final Path c;
    public final /* synthetic */ s50 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m30(s50 s50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = s50Var;
        this.a = new Rect();
        this.b = new RectF();
        this.c = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.t tVar;
        s50 s50Var = this.d;
        l30 l30Var = s50Var.b;
        if (s50Var.Z1 != 1.0f) {
            if (s50Var.T2 != null && s50Var.X2) {
                canvas.save();
                float measuredHeight = (s50Var.T2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / s50Var.T2.getAvatarImageView().getMeasuredHeight());
                float f10 = (1.0f - s50Var.Z1) * measuredHeight;
                float dp = AndroidUtilities.dp(13.0f);
                float f11 = s50Var.Z1;
                int i10 = (int) ((dp * f11) + f10);
                int i11 = (int) ((1.0f - f11) * measuredHeight);
                s50Var.T2.getAvatarWavesDrawable().a(canvas, s50Var.T2.getAvatarImageView().getMeasuredHeight() / 2, s50Var.T2.getAvatarImageView().getMeasuredHeight() / 2, this);
                s50Var.T2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                s50Var.T2.getAvatarImageView().r(i10, i10, i11, i11);
                s50Var.T2.getAvatarImageView().getImageReceiver().draw(canvas);
                s50Var.T2.getAvatarImageView().setRoundRadius(s50Var.T2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (s50Var.W2 != null && s50Var.V2 == null && s50Var.K2) {
                canvas.save();
                float measuredHeight2 = (s50Var.W2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / s50Var.W2.getAvatarImageView().getMeasuredHeight());
                float f12 = (1.0f - s50Var.Z1) * measuredHeight2;
                float dp2 = AndroidUtilities.dp(13.0f);
                float f13 = s50Var.Z1;
                int i12 = (int) ((dp2 * f13) + f12);
                int i13 = (int) ((1.0f - f13) * measuredHeight2);
                s50Var.W2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                s50Var.W2.getAvatarImageView().r(i12, i12, i13, i13);
                s50Var.W2.getAvatarImageView().getImageReceiver().draw(canvas);
                s50Var.W2.getAvatarImageView().setRoundRadius(s50Var.W2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        l30Var.setAlpha(s50Var.Z1);
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
                if (childAt instanceof org.telegram.ui.Components.zg0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (tVar = s50Var.V2) != null && tVar.v && !s50Var.B2) {
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
            s50Var.V2.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.d).containerView;
        viewGroup.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, TLObject.FLAG_30));
    }
}
