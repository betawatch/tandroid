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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j30 extends FrameLayout {
    public final Rect a;
    public final RectF b;
    public final Path c;
    public final /* synthetic */ o50 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j30(o50 o50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = o50Var;
        this.a = new Rect();
        this.b = new RectF();
        this.c = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View childAt;
        org.telegram.ui.Components.voip.t tVar;
        o50 o50Var = this.d;
        i30 i30Var = o50Var.b;
        if (o50Var.Z1 != 1.0f) {
            if (o50Var.T2 != null && o50Var.X2) {
                canvas.save();
                float measuredHeight = (o50Var.T2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / o50Var.T2.getAvatarImageView().getMeasuredHeight());
                float f10 = (1.0f - o50Var.Z1) * measuredHeight;
                float dp = AndroidUtilities.dp(13.0f);
                float f11 = o50Var.Z1;
                int i9 = (int) ((dp * f11) + f10);
                int i10 = (int) ((1.0f - f11) * measuredHeight);
                o50Var.T2.getAvatarWavesDrawable().a(canvas, o50Var.T2.getAvatarImageView().getMeasuredHeight() / 2, o50Var.T2.getAvatarImageView().getMeasuredHeight() / 2, this);
                o50Var.T2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                o50Var.T2.getAvatarImageView().r(i9, i9, i10, i10);
                o50Var.T2.getAvatarImageView().getImageReceiver().draw(canvas);
                o50Var.T2.getAvatarImageView().setRoundRadius(o50Var.T2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (o50Var.W2 != null && o50Var.V2 == null && o50Var.K2) {
                canvas.save();
                float measuredHeight2 = (o50Var.W2.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / o50Var.W2.getAvatarImageView().getMeasuredHeight());
                float f12 = (1.0f - o50Var.Z1) * measuredHeight2;
                float dp2 = AndroidUtilities.dp(13.0f);
                float f13 = o50Var.Z1;
                int i11 = (int) ((dp2 * f13) + f12);
                int i12 = (int) ((1.0f - f13) * measuredHeight2);
                o50Var.W2.getAvatarImageView().getImageReceiver().setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                o50Var.W2.getAvatarImageView().r(i11, i11, i12, i12);
                o50Var.W2.getAvatarImageView().getImageReceiver().draw(canvas);
                o50Var.W2.getAvatarImageView().setRoundRadius(o50Var.W2.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        i30Var.setAlpha(o50Var.Z1);
        Path path = this.c;
        path.reset();
        float measuredHeight3 = getMeasuredHeight();
        float measuredWidth = getMeasuredWidth();
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, measuredHeight3, measuredWidth);
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (i30Var.e1) {
            for (int i13 = 0; i13 < i30Var.getChildCount(); i13++) {
                childAt = i30Var.getChildAt(i13);
                if (childAt instanceof org.telegram.ui.Components.xg0) {
                    break;
                }
            }
        }
        childAt = null;
        if (childAt != null && (tVar = o50Var.V2) != null && tVar.v && !o50Var.B2) {
            canvas.save();
            Rect rect = this.a;
            rect.setEmpty();
            i30Var.getChildVisibleRect(childAt, rect, null);
            int i14 = rect.left;
            if (i14 < (-i30Var.getMeasuredWidth())) {
                i14 += i30Var.getMeasuredWidth() * 2;
            } else if (i14 > i30Var.getMeasuredWidth()) {
                i14 -= i30Var.getMeasuredWidth() * 2;
            }
            canvas.translate(i14, 0.0f);
            o50Var.V2.draw(canvas);
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
    public final void onMeasure(int i9, int i10) {
        int min = Math.min(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, TLObject.FLAG_30));
    }
}
