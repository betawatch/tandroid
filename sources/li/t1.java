package li;

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
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.rt0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class t1 extends rt0 {
    public boolean f0;
    public final Paint g0;
    public final RectF h0;
    public final /* synthetic */ b2 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(b2 b2Var, Context context) {
        super(context, null);
        this.i0 = b2Var;
        this.g0 = new Paint(1);
        new Path();
        this.h0 = new RectF();
    }

    @Override // org.telegram.ui.Components.rt0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        b2 b2Var = this.i0;
        Rect rect = b2Var.x;
        int r12 = k6.r1(b2Var.I, b2Var.getThemedColor(k6.d6));
        Paint paint = this.g0;
        paint.setColor(r12);
        if (!b2Var.E || b2Var.y == null) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            super.dispatchDraw(canvas);
            return;
        }
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.h0;
        rectF.set(0.0f, 0.0f, width, height);
        rectF.inset(-org.telegram.messenger.g0.L(7.0f), -org.telegram.messenger.g0.L(7.0f));
        float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(22.0f), 0.0f, b2Var.I);
        org.telegram.messenger.g0.Z1(b2Var.D, rectF, b2Var.I, rectF);
        rect.set(b2Var.y.getBounds());
        b2Var.y.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        b2Var.y.r(T1);
        b2Var.y.setAlpha((int) ((1.0f - b2Var.I) * 255.0f));
        b2Var.y.draw(canvas);
        b2Var.y.setBounds(rect);
        rectF.inset(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        canvas.drawRoundRect(rectF, T1, T1, paint);
        if (b2Var.w != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.W1(b2Var.I, b2Var.G[0], b2Var.H[0]), org.telegram.messenger.g0.W1(b2Var.I, b2Var.G[1], b2Var.H[1]));
            canvas.saveLayerAlpha(0.0f, 0.0f, b2Var.w.getWidth(), b2Var.w.getHeight(), (int) ((1.0f - b2Var.I) * 255.0f), 31);
            b2Var.w.draw(canvas);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.T1(rectF.right, (b2Var.y0.getX() + (b2Var.a0.getX() + (b2Var.Z.getX() + b2Var.Y.getX()))) + b2Var.y0.getWidth(), b2Var.I) - b2Var.w.A1.getWidth(), org.telegram.messenger.g0.T1(rectF.bottom, (b2Var.y0.getY() + (b2Var.a0.getY() + (b2Var.Z.getY() + b2Var.Y.getY()))) + b2Var.y0.getHeight(), b2Var.I) - b2Var.w.A1.getHeight());
            canvas.saveLayerAlpha(-org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(6.0f), b2Var.w.A1.getWidth(), b2Var.w.A1.getHeight(), (int) ((1.0f - b2Var.I) * 255.0f), 31);
            b2Var.w.A1.draw(canvas);
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
        b2 b2Var = this.i0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (b2Var.v0()) {
                org.telegram.messenger.k5.o(null, 2131746004, new hc(b2Var.X, b2Var.getResourceProvider()), R.raw.contact_check, 36);
                return true;
            }
        } else if (!b2Var.P.k3(keyEvent)) {
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
        gy gyVar;
        b2 b2Var = this.i0;
        if (!b2Var.P.u3.x() || !b2Var.P.v3.onTouchEvent(motionEvent)) {
            int height = (!b2Var.C0 || (gyVar = b2Var.A0) == null) ? (getHeight() - org.telegram.messenger.g0.L(60.0f)) - Math.max(Math.max(b2Var.D0, b2Var.T0), b2Var.U0) : (int) gyVar.getY();
            if (motionEvent.getAction() == 0 && b2Var.B0 && motionEvent.getY() < height) {
                b2Var.p0(true);
            }
            if (motionEvent.getAction() == 0) {
                if (motionEvent.getY() > org.telegram.messenger.g0.L(60.0f) + getPaddingTop()) {
                }
                if (motionEvent.getAction() == 0) {
                    this.f0 = b2Var.a0.getVisibility() == 0 && motionEvent.getY() >= ((float) ((getHeight() - org.telegram.messenger.g0.L(60.0f)) - Math.max(Math.max(b2Var.D0, b2Var.T0), b2Var.U0)));
                }
                if (!this.f0 || !b2Var.P.l3(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
            if (b2Var.P.v3.b(motionEvent)) {
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
