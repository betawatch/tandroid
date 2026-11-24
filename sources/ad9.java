// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class ad9 extends cja {
    public boolean m0;
    public final Paint n0;
    public final RectF o0;
    public final /* synthetic */ hd9 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad9(hd9 hd9Var, Context context) {
        super(context, null);
        this.p0 = hd9Var;
        this.n0 = new Paint(1);
        this.o0 = new RectF();
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        hd9 hd9Var = this.p0;
        Rect rect = hd9Var.x;
        int p1 = bkb.p1(hd9Var.J, hd9Var.getThemedColor(bkb.c6));
        Paint paint = this.n0;
        paint.setColor(p1);
        if (!hd9Var.F || hd9Var.y == null) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            super.dispatchDraw(canvas);
            return;
        }
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.o0;
        rectF.set(0.0f, 0.0f, width, height);
        rectF.inset(-gl.L(7.0f), -gl.L(7.0f));
        float R1 = gl.R1(gl.N(22.0f), 0.0f, hd9Var.J);
        gl.X1(hd9Var.E, rectF, hd9Var.J, rectF);
        rect.set(hd9Var.y.getBounds());
        hd9Var.y.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        hd9Var.y.r(R1);
        hd9Var.y.setAlpha((int) ((1.0f - hd9Var.J) * 255.0f));
        hd9Var.y.draw(canvas);
        hd9Var.y.setBounds(rect);
        rectF.inset(gl.L(7.0f), gl.L(7.0f));
        canvas.drawRoundRect(rectF, R1, R1, paint);
        if (hd9Var.w != null) {
            canvas.save();
            canvas.translate(gl.U1(hd9Var.J, hd9Var.H[0], hd9Var.I[0]), gl.U1(hd9Var.J, hd9Var.H[1], hd9Var.I[1]));
            canvas.saveLayerAlpha(0.0f, 0.0f, hd9Var.w.getWidth(), hd9Var.w.getHeight(), (int) ((1.0f - hd9Var.J) * 255.0f), 31);
            hd9Var.w.draw(canvas);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(gl.R1(rectF.right, (hd9Var.z0.getX() + (hd9Var.b0.getX() + (hd9Var.a0.getX() + hd9Var.Z.getX()))) + hd9Var.z0.getWidth(), hd9Var.J) - hd9Var.w.q2.getWidth(), gl.R1(rectF.bottom, (hd9Var.z0.getY() + (hd9Var.b0.getY() + (hd9Var.a0.getY() + hd9Var.Z.getY()))) + hd9Var.z0.getHeight(), hd9Var.J) - hd9Var.w.q2.getHeight());
            canvas.saveLayerAlpha(-gl.L(6.0f), -gl.L(6.0f), hd9Var.w.q2.getWidth(), hd9Var.w.q2.getHeight(), (int) ((1.0f - hd9Var.J) * 255.0f), 31);
            hd9Var.w.q2.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
        canvas.save();
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        hd9 hd9Var = this.p0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (hd9Var.r0()) {
                ir2.v(null, 2131745810, new u21(hd9Var.Y, hd9Var.getResourceProvider()), R.raw.contact_check, 36);
                return true;
            }
        } else if (!hd9Var.Q.d3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        if (r8.getY() < r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        t14 t14Var;
        hd9 hd9Var = this.p0;
        if (!hd9Var.Q.v3.w() || !hd9Var.Q.w3.onTouchEvent(motionEvent)) {
            int height = (!hd9Var.D0 || (t14Var = hd9Var.B0) == null) ? (getHeight() - gl.L(60.0f)) - Math.max(Math.max(hd9Var.E0, hd9Var.U0), hd9Var.V0) : (int) t14Var.getY();
            if (motionEvent.getAction() == 0 && hd9Var.C0 && motionEvent.getY() < height) {
                hd9Var.g0(true);
            }
            if (motionEvent.getAction() == 0) {
                if (motionEvent.getY() > gl.L(60.0f) + getPaddingTop()) {
                }
                if (motionEvent.getAction() == 0) {
                    this.m0 = hd9Var.b0.getVisibility() == 0 && motionEvent.getY() >= ((float) ((getHeight() - gl.L(60.0f)) - Math.max(Math.max(hd9Var.E0, hd9Var.U0), hd9Var.V0)));
                }
                if (!this.m0 || !hd9Var.Q.e3(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
            if (hd9Var.Q.w3.b(motionEvent)) {
                motionEvent.setAction(3);
            }
            if (motionEvent.getAction() == 0) {
            }
            if (!this.m0) {
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }
}
