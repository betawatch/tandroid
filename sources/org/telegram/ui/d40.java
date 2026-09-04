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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class d40 extends FrameLayout {
    public final Rect a;
    public final RectF b;
    public final Path c;
    public final /* synthetic */ j60 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d40(j60 j60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = j60Var;
        this.a = new Rect();
        this.b = new RectF();
        this.c = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.t tVar;
        j60 j60Var = this.d;
        c40 c40Var = j60Var.b;
        if (j60Var.d2 != 1.0f) {
            if (j60Var.X2 != null && j60Var.b3) {
                canvas.save();
                float measuredHeight = (j60Var.X2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / j60Var.X2.getAvatarImageView().getMeasuredHeight());
                float f7 = (1.0f - j60Var.d2) * measuredHeight;
                float dp = AndroidUtilities.dp(13.0f);
                float f10 = j60Var.d2;
                int i10 = (int) ((dp * f10) + f7);
                int i11 = (int) ((1.0f - f10) * measuredHeight);
                j60Var.X2.getAvatarWavesDrawable().a(canvas, j60Var.X2.getAvatarImageView().getMeasuredHeight() / 2, j60Var.X2.getAvatarImageView().getMeasuredHeight() / 2, this);
                j60Var.X2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                j60Var.X2.getAvatarImageView().r(i10, i10, i11, i11);
                j60Var.X2.getAvatarImageView().getImageReceiver().draw(canvas);
                j60Var.X2.getAvatarImageView().setRoundRadius(j60Var.X2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (j60Var.a3 != null && j60Var.Z2 == null && j60Var.O2) {
                canvas.save();
                float measuredHeight2 = (j60Var.a3.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / j60Var.a3.getAvatarImageView().getMeasuredHeight());
                float f11 = (1.0f - j60Var.d2) * measuredHeight2;
                float dp2 = AndroidUtilities.dp(13.0f);
                float f12 = j60Var.d2;
                int i12 = (int) ((dp2 * f12) + f11);
                int i13 = (int) ((1.0f - f12) * measuredHeight2);
                j60Var.a3.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                j60Var.a3.getAvatarImageView().r(i12, i12, i13, i13);
                j60Var.a3.getAvatarImageView().getImageReceiver().draw(canvas);
                j60Var.a3.getAvatarImageView().setRoundRadius(j60Var.a3.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        c40Var.setAlpha(j60Var.d2);
        Path path = this.c;
        path.reset();
        float measuredHeight3 = getMeasuredHeight();
        float measuredWidth = getMeasuredWidth();
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, measuredHeight3, measuredWidth);
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (c40Var.i1) {
            for (int i14 = 0; i14 < c40Var.getChildCount(); i14++) {
                childAt = c40Var.getChildAt(i14);
                if (childAt instanceof org.telegram.ui.Components.lh0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (tVar = j60Var.Z2) != null && tVar.v && !j60Var.F2) {
            canvas.save();
            Rect rect = this.a;
            rect.setEmpty();
            c40Var.getChildVisibleRect(childAt, rect, null);
            int i15 = rect.left;
            if (i15 < (-c40Var.getMeasuredWidth())) {
                i15 += c40Var.getMeasuredWidth() * 2;
            } else if (i15 > c40Var.getMeasuredWidth()) {
                i15 -= c40Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i15, 0.0f);
            j60Var.Z2.draw(canvas);
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
