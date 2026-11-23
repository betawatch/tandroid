package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.ty;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class t1 extends du0 {
    public boolean g0;
    public final Paint h0;
    public final RectF i0;
    public final /* synthetic */ b2 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(b2 b2Var, Context context) {
        super(context, null);
        this.j0 = b2Var;
        this.h0 = new Paint(1);
        new Path();
        this.i0 = new RectF();
    }

    @Override // org.telegram.ui.Components.du0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        b2 b2Var = this.j0;
        Rect rect = b2Var.x;
        int r12 = m6.r1(b2Var.J, b2Var.getThemedColor(m6.d6));
        Paint paint = this.h0;
        paint.setColor(r12);
        if (!b2Var.F || b2Var.y == null) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            super.dispatchDraw(canvas);
            return;
        }
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.i0;
        rectF.set(0.0f, 0.0f, width, height);
        rectF.inset(-org.telegram.messenger.g0.L(7.0f), -org.telegram.messenger.g0.L(7.0f));
        float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(22.0f), 0.0f, b2Var.J);
        org.telegram.messenger.g0.Z1(b2Var.E, rectF, b2Var.J, rectF);
        rect.set(b2Var.y.getBounds());
        b2Var.y.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        b2Var.y.r(T1);
        b2Var.y.setAlpha((int) ((1.0f - b2Var.J) * 255.0f));
        b2Var.y.draw(canvas);
        b2Var.y.setBounds(rect);
        rectF.inset(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        canvas.drawRoundRect(rectF, T1, T1, paint);
        if (b2Var.w != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.W1(b2Var.J, b2Var.H[0], b2Var.I[0]), org.telegram.messenger.g0.W1(b2Var.J, b2Var.H[1], b2Var.I[1]));
            canvas.saveLayerAlpha(0.0f, 0.0f, b2Var.w.getWidth(), b2Var.w.getHeight(), (int) ((1.0f - b2Var.J) * 255.0f), 31);
            b2Var.w.draw(canvas);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.T1(rectF.right, (b2Var.z0.getX() + (b2Var.b0.getX() + (b2Var.a0.getX() + b2Var.Z.getX()))) + b2Var.z0.getWidth(), b2Var.J) - b2Var.w.q2.getWidth(), org.telegram.messenger.g0.T1(rectF.bottom, (b2Var.z0.getY() + (b2Var.b0.getY() + (b2Var.a0.getY() + b2Var.Z.getY()))) + b2Var.z0.getHeight(), b2Var.J) - b2Var.w.q2.getHeight());
            canvas.saveLayerAlpha(-org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(6.0f), b2Var.w.q2.getWidth(), b2Var.w.q2.getHeight(), (int) ((1.0f - b2Var.J) * 255.0f), 31);
            b2Var.w.q2.draw(canvas);
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
        b2 b2Var = this.j0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (b2Var.v0()) {
                org.telegram.messenger.f3.n(null, 2131745807, new lc(b2Var.Y, b2Var.getResourceProvider()), R.raw.contact_check, 36);
                return true;
            }
        } else if (!b2Var.Q.k3(keyEvent)) {
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
        ty tyVar;
        b2 b2Var = this.j0;
        if (!b2Var.Q.v3.x() || !b2Var.Q.w3.onTouchEvent(motionEvent)) {
            int height = (!b2Var.D0 || (tyVar = b2Var.B0) == null) ? (getHeight() - org.telegram.messenger.g0.L(60.0f)) - Math.max(Math.max(b2Var.E0, b2Var.U0), b2Var.V0) : (int) tyVar.getY();
            if (motionEvent.getAction() == 0 && b2Var.C0 && motionEvent.getY() < height) {
                b2Var.p0(true);
            }
            if (motionEvent.getAction() == 0) {
                if (motionEvent.getY() > org.telegram.messenger.g0.L(60.0f) + getPaddingTop()) {
                }
                if (motionEvent.getAction() == 0) {
                    this.g0 = b2Var.b0.getVisibility() == 0 && motionEvent.getY() >= ((float) ((getHeight() - org.telegram.messenger.g0.L(60.0f)) - Math.max(Math.max(b2Var.E0, b2Var.U0), b2Var.V0)));
                }
                if (!this.g0 || !b2Var.Q.l3(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
            if (b2Var.Q.w3.b(motionEvent)) {
                motionEvent.setAction(3);
            }
            if (motionEvent.getAction() == 0) {
            }
            if (!this.g0) {
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }
}
