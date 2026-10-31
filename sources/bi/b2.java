package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.vy;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class b2 extends uu0 {
    public boolean f0;
    public final Paint g0;
    public final RectF h0;
    public final /* synthetic */ k2 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(k2 k2Var, Context context) {
        super(context, null);
        this.i0 = k2Var;
        this.g0 = new Paint(1);
        new Path();
        this.h0 = new RectF();
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        k2 k2Var = this.i0;
        Rect rect = k2Var.x;
        int r12 = org.telegram.ui.ActionBar.t6.r1(k2Var.I, k2Var.getThemedColor(org.telegram.ui.ActionBar.t6.d6));
        Paint paint = this.g0;
        paint.setColor(r12);
        if (!k2Var.E || k2Var.y == null) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            super.dispatchDraw(canvas);
            return;
        }
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.h0;
        rectF.set(0.0f, 0.0f, width, height);
        rectF.inset(-org.telegram.messenger.i0.L(7.0f), -org.telegram.messenger.i0.L(7.0f));
        float T1 = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.N(22.0f), 0.0f, k2Var.I);
        org.telegram.messenger.i0.Z1(k2Var.D, rectF, k2Var.I, rectF);
        rect.set(k2Var.y.getBounds());
        k2Var.y.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        k2Var.y.q(T1);
        k2Var.y.setAlpha((int) ((1.0f - k2Var.I) * 255.0f));
        k2Var.y.draw(canvas);
        k2Var.y.setBounds(rect);
        rectF.inset(org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f));
        canvas.drawRoundRect(rectF, T1, T1, paint);
        if (k2Var.w != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.i0.W1(k2Var.I, k2Var.G[0], k2Var.H[0]), org.telegram.messenger.i0.W1(k2Var.I, k2Var.G[1], k2Var.H[1]));
            canvas.saveLayerAlpha(0.0f, 0.0f, k2Var.w.getWidth(), k2Var.w.getHeight(), (int) ((1.0f - k2Var.I) * 255.0f), 31);
            k2Var.w.draw(canvas);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(org.telegram.messenger.i0.T1(rectF.right, (k2Var.y0.getX() + (k2Var.a0.getX() + (k2Var.Z.getX() + k2Var.Y.getX()))) + k2Var.y0.getWidth(), k2Var.I) - k2Var.w.A1.getWidth(), org.telegram.messenger.i0.T1(rectF.bottom, (k2Var.y0.getY() + (k2Var.a0.getY() + (k2Var.Z.getY() + k2Var.Y.getY()))) + k2Var.y0.getHeight(), k2Var.I) - k2Var.w.A1.getHeight());
            canvas.saveLayerAlpha(-org.telegram.messenger.i0.L(6.0f), -org.telegram.messenger.i0.L(6.0f), k2Var.w.A1.getWidth(), k2Var.w.A1.getHeight(), (int) ((1.0f - k2Var.I) * 255.0f), 31);
            k2Var.w.A1.draw(canvas);
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
        k2 k2Var = this.i0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (k2Var.u0()) {
                org.telegram.messenger.m5.n(null, 2131746020, new cc(k2Var.X, k2Var.getResourceProvider()), R.raw.contact_check, 36);
                return true;
            }
        } else if (!k2Var.P.k3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r8.getY() < r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        vy vyVar;
        k2 k2Var = this.i0;
        if (!k2Var.P.u3.x() || !k2Var.P.v3.onTouchEvent(motionEvent)) {
            int height = (!k2Var.C0 || (vyVar = k2Var.A0) == null) ? (getHeight() - org.telegram.messenger.i0.L(60.0f)) - Math.max(Math.max(k2Var.D0, k2Var.T0), k2Var.U0) : (int) vyVar.getY();
            if (motionEvent.getAction() == 0 && k2Var.B0 && motionEvent.getY() < height) {
                k2Var.o0(true);
            }
            if (motionEvent.getAction() == 0) {
                if (motionEvent.getY() > org.telegram.messenger.i0.L(60.0f) + getPaddingTop()) {
                }
                if (motionEvent.getAction() == 0) {
                    this.f0 = k2Var.a0.getVisibility() == 0 && motionEvent.getY() >= ((float) ((getHeight() - org.telegram.messenger.i0.L(60.0f)) - Math.max(Math.max(k2Var.D0, k2Var.T0), k2Var.U0)));
                }
                if (!this.f0 || !k2Var.P.l3(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
            if (k2Var.P.v3.b(motionEvent)) {
                motionEvent.setAction(3);
            }
            if (motionEvent.getAction() == 0) {
            }
            if (!this.f0) {
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }
}
