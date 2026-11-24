// default package

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class g75 extends FrameLayout {
    public final Rect a;
    public final RectF b;
    public final Path c;
    public final /* synthetic */ g95 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g75(g95 g95Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = g95Var;
        this.a = new Rect();
        this.b = new RectF();
        this.c = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View view;
        ha5 ha5Var;
        g95 g95Var = this.d;
        e75 e75Var = g95Var.l1;
        if (g95Var.W3 != 1.0f) {
            if (g95Var.M4 != null && g95Var.Q4) {
                canvas.save();
                float measuredHeight = (g95Var.M4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / g95Var.M4.getAvatarImageView().getMeasuredHeight());
                float f = (1.0f - g95Var.W3) * measuredHeight;
                float L = gm.L(13.0f);
                float f2 = g95Var.W3;
                int i = (int) ((L * f2) + f);
                int i2 = (int) ((1.0f - f2) * measuredHeight);
                g95Var.M4.getAvatarWavesDrawable().a(canvas, g95Var.M4.getAvatarImageView().getMeasuredHeight() / 2, g95Var.M4.getAvatarImageView().getMeasuredHeight() / 2, this);
                g95Var.M4.getAvatarImageView().getImageReceiver().i0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                g95Var.M4.getAvatarImageView().s(i, i, i2, i2);
                g95Var.M4.getAvatarImageView().getImageReceiver().h(canvas, null);
                g95Var.M4.getAvatarImageView().setRoundRadius(g95Var.M4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (g95Var.P4 != null && g95Var.O4 == null && g95Var.E4) {
                canvas.save();
                float measuredHeight2 = (g95Var.P4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / g95Var.P4.getAvatarImageView().getMeasuredHeight());
                float f3 = (1.0f - g95Var.W3) * measuredHeight2;
                float L2 = gm.L(13.0f);
                float f4 = g95Var.W3;
                int i3 = (int) ((L2 * f4) + f3);
                int i4 = (int) ((1.0f - f4) * measuredHeight2);
                g95Var.P4.getAvatarImageView().getImageReceiver().i0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                g95Var.P4.getAvatarImageView().s(i3, i3, i4, i4);
                g95Var.P4.getAvatarImageView().getImageReceiver().h(canvas, null);
                g95Var.P4.getAvatarImageView().setRoundRadius(g95Var.P4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        e75Var.setAlpha(g95Var.W3);
        Path path = this.c;
        path.reset();
        float measuredHeight3 = getMeasuredHeight();
        float measuredWidth = getMeasuredWidth();
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, measuredHeight3, measuredWidth);
        path.addRoundRect(rectF, new float[]{gm.L(13.0f), gm.L(13.0f), gm.L(13.0f), gm.L(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (e75Var.j1) {
            for (int i5 = 0; i5 < e75Var.getChildCount(); i5++) {
                view = e75Var.getChildAt(i5);
                if (view instanceof rr8) {
                    break;
                }
            }
        }
        view = null;
        if (view != null && (ha5Var = g95Var.O4) != null && ha5Var.w && !g95Var.v4) {
            canvas.save();
            Rect rect = this.a;
            rect.setEmpty();
            e75Var.getChildVisibleRect(view, rect, null);
            int i6 = rect.left;
            if (i6 < (-e75Var.getMeasuredWidth())) {
                i6 += e75Var.getMeasuredWidth() << 1;
            } else if (i6 > e75Var.getMeasuredWidth()) {
                i6 -= e75Var.getMeasuredWidth() << 1;
            }
            canvas.translate(i6, 0.0f);
            g95Var.O4.draw(canvas);
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
    public final void onMeasure(int i, int i2) {
        int min = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, TLObject.FLAG_30));
    }
}
