package mi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.qt0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class u1 extends qt0 {
    public boolean g0;
    public final Paint h0;
    public final RectF i0;
    public final /* synthetic */ c2 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(c2 c2Var, Context context) {
        super(context, null);
        this.j0 = c2Var;
        this.h0 = new Paint(1);
        new Path();
        this.i0 = new RectF();
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        c2 c2Var = this.j0;
        Rect rect = c2Var.x;
        int r12 = k6.r1(c2Var.J, c2Var.getThemedColor(k6.d6));
        Paint paint = this.h0;
        paint.setColor(r12);
        if (!c2Var.F || c2Var.y == null) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            super.dispatchDraw(canvas);
            return;
        }
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.i0;
        rectF.set(0.0f, 0.0f, width, height);
        rectF.inset(-org.telegram.messenger.g0.L(7.0f), -org.telegram.messenger.g0.L(7.0f));
        float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(22.0f), 0.0f, c2Var.J);
        org.telegram.messenger.g0.Z1(c2Var.E, rectF, c2Var.J, rectF);
        rect.set(c2Var.y.getBounds());
        c2Var.y.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        c2Var.y.r(T1);
        c2Var.y.setAlpha((int) ((1.0f - c2Var.J) * 255.0f));
        c2Var.y.draw(canvas);
        c2Var.y.setBounds(rect);
        rectF.inset(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        canvas.drawRoundRect(rectF, T1, T1, paint);
        if (c2Var.w != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.W1(c2Var.J, c2Var.H[0], c2Var.I[0]), org.telegram.messenger.g0.W1(c2Var.J, c2Var.H[1], c2Var.I[1]));
            canvas.saveLayerAlpha(0.0f, 0.0f, c2Var.w.getWidth(), c2Var.w.getHeight(), (int) ((1.0f - c2Var.J) * 255.0f), 31);
            c2Var.w.draw(canvas);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.T1(rectF.right, (c2Var.z0.getX() + (c2Var.b0.getX() + (c2Var.a0.getX() + c2Var.Z.getX()))) + c2Var.z0.getWidth(), c2Var.J) - c2Var.w.B1.getWidth(), org.telegram.messenger.g0.T1(rectF.bottom, (c2Var.z0.getY() + (c2Var.b0.getY() + (c2Var.a0.getY() + c2Var.Z.getY()))) + c2Var.z0.getHeight(), c2Var.J) - c2Var.w.B1.getHeight());
            canvas.saveLayerAlpha(-org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(6.0f), c2Var.w.B1.getWidth(), c2Var.w.B1.getHeight(), (int) ((1.0f - c2Var.J) * 255.0f), 31);
            c2Var.w.B1.draw(canvas);
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
        c2 c2Var = this.j0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (c2Var.v0()) {
                org.telegram.messenger.k5.o(null, 2131746013, new fc(c2Var.Y, c2Var.getResourceProvider()), R.raw.contact_check, 36);
                return true;
            }
        } else if (!c2Var.Q.k3(keyEvent)) {
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
        ey eyVar;
        c2 c2Var = this.j0;
        if (!c2Var.Q.v3.x() || !c2Var.Q.w3.onTouchEvent(motionEvent)) {
            int height = (!c2Var.D0 || (eyVar = c2Var.B0) == null) ? (getHeight() - org.telegram.messenger.g0.L(60.0f)) - Math.max(Math.max(c2Var.E0, c2Var.U0), c2Var.V0) : (int) eyVar.getY();
            if (motionEvent.getAction() == 0 && c2Var.C0 && motionEvent.getY() < height) {
                c2Var.p0(true);
            }
            if (motionEvent.getAction() == 0) {
                if (motionEvent.getY() > org.telegram.messenger.g0.L(60.0f) + getPaddingTop()) {
                }
                if (motionEvent.getAction() == 0) {
                    this.g0 = c2Var.b0.getVisibility() == 0 && motionEvent.getY() >= ((float) ((getHeight() - org.telegram.messenger.g0.L(60.0f)) - Math.max(Math.max(c2Var.E0, c2Var.U0), c2Var.V0)));
                }
                if (!this.g0 || !c2Var.Q.l3(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
            if (c2Var.Q.w3.b(motionEvent)) {
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
