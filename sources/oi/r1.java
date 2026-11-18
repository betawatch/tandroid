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
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.ry;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class r1 extends au0 {
    public boolean g0;
    public final Paint h0;
    public final RectF i0;
    public final /* synthetic */ z1 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(z1 z1Var, Context context) {
        super(context, null);
        this.j0 = z1Var;
        this.h0 = new Paint(1);
        new Path();
        this.i0 = new RectF();
    }

    @Override // org.telegram.ui.Components.au0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        z1 z1Var = this.j0;
        Rect rect = z1Var.x;
        int r12 = n6.r1(z1Var.J, z1Var.getThemedColor(n6.d6));
        Paint paint = this.h0;
        paint.setColor(r12);
        if (!z1Var.F || z1Var.y == null) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            super.dispatchDraw(canvas);
            return;
        }
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.i0;
        rectF.set(0.0f, 0.0f, width, height);
        rectF.inset(-org.telegram.messenger.g0.L(7.0f), -org.telegram.messenger.g0.L(7.0f));
        float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(22.0f), 0.0f, z1Var.J);
        org.telegram.messenger.g0.Z1(z1Var.E, rectF, z1Var.J, rectF);
        rect.set(z1Var.y.getBounds());
        z1Var.y.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        z1Var.y.r(T1);
        z1Var.y.setAlpha((int) ((1.0f - z1Var.J) * 255.0f));
        z1Var.y.draw(canvas);
        z1Var.y.setBounds(rect);
        rectF.inset(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        canvas.drawRoundRect(rectF, T1, T1, paint);
        if (z1Var.w != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.W1(z1Var.J, z1Var.H[0], z1Var.I[0]), org.telegram.messenger.g0.W1(z1Var.J, z1Var.H[1], z1Var.I[1]));
            canvas.saveLayerAlpha(0.0f, 0.0f, z1Var.w.getWidth(), z1Var.w.getHeight(), (int) ((1.0f - z1Var.J) * 255.0f), 31);
            z1Var.w.draw(canvas);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.T1(rectF.right, (z1Var.z0.getX() + (z1Var.b0.getX() + (z1Var.a0.getX() + z1Var.Z.getX()))) + z1Var.z0.getWidth(), z1Var.J) - z1Var.w.o2.getWidth(), org.telegram.messenger.g0.T1(rectF.bottom, (z1Var.z0.getY() + (z1Var.b0.getY() + (z1Var.a0.getY() + z1Var.Z.getY()))) + z1Var.z0.getHeight(), z1Var.J) - z1Var.w.o2.getHeight());
            canvas.saveLayerAlpha(-org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(6.0f), z1Var.w.o2.getWidth(), z1Var.w.o2.getHeight(), (int) ((1.0f - z1Var.J) * 255.0f), 31);
            z1Var.w.o2.draw(canvas);
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
        z1 z1Var = this.j0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (z1Var.v0()) {
                org.telegram.messenger.f3.n(null, 2131745808, new lc(z1Var.Y, z1Var.getResourceProvider()), R.raw.contact_check, 36);
                return true;
            }
        } else if (!z1Var.Q.k3(keyEvent)) {
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
        ry ryVar;
        z1 z1Var = this.j0;
        if (!z1Var.Q.v3.x() || !z1Var.Q.w3.onTouchEvent(motionEvent)) {
            int height = (!z1Var.D0 || (ryVar = z1Var.B0) == null) ? (getHeight() - org.telegram.messenger.g0.L(60.0f)) - Math.max(Math.max(z1Var.E0, z1Var.U0), z1Var.V0) : (int) ryVar.getY();
            if (motionEvent.getAction() == 0 && z1Var.C0 && motionEvent.getY() < height) {
                z1Var.p0(true);
            }
            if (motionEvent.getAction() == 0) {
                if (motionEvent.getY() > org.telegram.messenger.g0.L(60.0f) + getPaddingTop()) {
                }
                if (motionEvent.getAction() == 0) {
                    this.g0 = z1Var.b0.getVisibility() == 0 && motionEvent.getY() >= ((float) ((getHeight() - org.telegram.messenger.g0.L(60.0f)) - Math.max(Math.max(z1Var.E0, z1Var.U0), z1Var.V0)));
                }
                if (!this.g0 || !z1Var.Q.l3(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
            if (z1Var.Q.w3.b(motionEvent)) {
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
