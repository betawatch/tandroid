// default package

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class i55 extends FrameLayout {
    public final Rect a;
    public final RectF b;
    public final Path c;
    public final /* synthetic */ h75 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i55(h75 h75Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.d = h75Var;
        this.a = new Rect();
        this.b = new RectF();
        this.c = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View view;
        h85 h85Var;
        h75 h75Var = this.d;
        g55 g55Var = h75Var.l1;
        if (h75Var.W3 != 1.0f) {
            if (h75Var.M4 != null && h75Var.Q4) {
                canvas.save();
                float measuredHeight = (h75Var.M4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / h75Var.M4.getAvatarImageView().getMeasuredHeight());
                float f = (1.0f - h75Var.W3) * measuredHeight;
                float L = gl.L(13.0f);
                float f2 = h75Var.W3;
                int i = (int) ((L * f2) + f);
                int i2 = (int) ((1.0f - f2) * measuredHeight);
                h75Var.M4.getAvatarWavesDrawable().a(canvas, h75Var.M4.getAvatarImageView().getMeasuredHeight() / 2, h75Var.M4.getAvatarImageView().getMeasuredHeight() / 2, this);
                h75Var.M4.getAvatarImageView().getImageReceiver().i0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                h75Var.M4.getAvatarImageView().s(i, i, i2, i2);
                h75Var.M4.getAvatarImageView().getImageReceiver().h(canvas, null);
                h75Var.M4.getAvatarImageView().setRoundRadius(h75Var.M4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            } else if (h75Var.P4 != null && h75Var.O4 == null && h75Var.E4) {
                canvas.save();
                float measuredHeight2 = (h75Var.P4.getAvatarImageView().getMeasuredHeight() / 2.0f) * (getMeasuredHeight() / h75Var.P4.getAvatarImageView().getMeasuredHeight());
                float f3 = (1.0f - h75Var.W3) * measuredHeight2;
                float L2 = gl.L(13.0f);
                float f4 = h75Var.W3;
                int i3 = (int) ((L2 * f4) + f3);
                int i4 = (int) ((1.0f - f4) * measuredHeight2);
                h75Var.P4.getAvatarImageView().getImageReceiver().i0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                h75Var.P4.getAvatarImageView().s(i3, i3, i4, i4);
                h75Var.P4.getAvatarImageView().getImageReceiver().h(canvas, null);
                h75Var.P4.getAvatarImageView().setRoundRadius(h75Var.P4.getAvatarImageView().getMeasuredHeight() / 2);
                canvas.restore();
            }
        }
        g55Var.setAlpha(h75Var.W3);
        Path path = this.c;
        path.reset();
        float measuredHeight3 = getMeasuredHeight();
        float measuredWidth = getMeasuredWidth();
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, measuredHeight3, measuredWidth);
        path.addRoundRect(rectF, new float[]{gl.L(13.0f), gl.L(13.0f), gl.L(13.0f), gl.L(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
        canvas.save();
        canvas.clipPath(path);
        if (g55Var.j1) {
            for (int i5 = 0; i5 < g55Var.getChildCount(); i5++) {
                view = g55Var.getChildAt(i5);
                if (view instanceof qp8) {
                    break;
                }
            }
        }
        view = null;
        if (view != null && (h85Var = h75Var.O4) != null && h85Var.w && !h75Var.v4) {
            canvas.save();
            Rect rect = this.a;
            rect.setEmpty();
            g55Var.getChildVisibleRect(view, rect, null);
            int i6 = rect.left;
            if (i6 < (-g55Var.getMeasuredWidth())) {
                i6 += g55Var.getMeasuredWidth() << 1;
            } else if (i6 > g55Var.getMeasuredWidth()) {
                i6 -= g55Var.getMeasuredWidth() << 1;
            }
            canvas.translate(i6, 0.0f);
            h75Var.O4.draw(canvas);
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
