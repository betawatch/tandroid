package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class u1 extends ov0 {
    public boolean w0;
    public final Paint x0;
    public final RectF y0;
    public final /* synthetic */ c2 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(c2 c2Var, Context context) {
        super(context, null);
        this.z0 = c2Var;
        this.x0 = new Paint(1);
        new Path();
        this.y0 = new RectF();
    }

    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        c2 c2Var = this.z0;
        Rect rect = c2Var.w;
        int l1 = org.telegram.ui.ActionBar.j6.l1(c2Var.I, c2Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        Paint paint = this.x0;
        paint.setColor(l1);
        if (!c2Var.E || c2Var.x == null) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            super.dispatchDraw(canvas);
            return;
        }
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.y0;
        rectF.set(0.0f, 0.0f, width, height);
        rectF.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(22.0f), 0.0f, c2Var.I);
        AndroidUtilities.lerp(c2Var.y, rectF, c2Var.I, rectF);
        rect.set(c2Var.x.getBounds());
        c2Var.x.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        c2Var.x.p(lerp);
        c2Var.x.setAlpha((int) ((1.0f - c2Var.I) * 255.0f));
        c2Var.x.draw(canvas);
        c2Var.x.setBounds(rect);
        rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
        if (c2Var.v != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.lerp(c2Var.G[0], c2Var.H[0], c2Var.I), AndroidUtilities.lerp(c2Var.G[1], c2Var.H[1], c2Var.I));
            canvas.saveLayerAlpha(0.0f, 0.0f, c2Var.v.getWidth(), c2Var.v.getHeight(), (int) ((1.0f - c2Var.I) * 255.0f), 31);
            c2Var.v.draw(canvas);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(AndroidUtilities.lerp(rectF.right, (c2Var.y0.getX() + (c2Var.a0.getX() + (c2Var.Z.getX() + c2Var.Y.getX()))) + c2Var.y0.getWidth(), c2Var.I) - c2Var.v.z1.getWidth(), AndroidUtilities.lerp(rectF.bottom, (c2Var.y0.getY() + (c2Var.a0.getY() + (c2Var.Z.getY() + c2Var.Y.getY()))) + c2Var.y0.getHeight(), c2Var.I) - c2Var.v.z1.getHeight());
            canvas.saveLayerAlpha(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f), c2Var.v.z1.getWidth(), c2Var.v.z1.getHeight(), (int) ((1.0f - c2Var.I) * 255.0f), 31);
            c2Var.v.z1.draw(canvas);
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
        c2 c2Var = this.z0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (c2Var.q0()) {
                org.telegram.messenger.w1.o(R.string.RichEditorDraftSaved, new yc(c2Var.X, c2Var.getResourceProvider()), R.raw.contact_check, 36);
                return true;
            }
        } else if (!c2Var.P.g3(keyEvent)) {
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
        kz kzVar;
        c2 c2Var = this.z0;
        if (!c2Var.P.n3.y() || !c2Var.P.o3.onTouchEvent(motionEvent)) {
            int height = (!c2Var.C0 || (kzVar = c2Var.A0) == null) ? (getHeight() - AndroidUtilities.dp(60.0f)) - Math.max(Math.max(c2Var.D0, c2Var.T0), c2Var.U0) : (int) kzVar.getY();
            if (motionEvent.getAction() == 0 && c2Var.B0 && motionEvent.getY() < height) {
                c2Var.k0(true);
            }
            if (motionEvent.getAction() == 0) {
                if (motionEvent.getY() > AndroidUtilities.dp(60.0f) + getPaddingTop()) {
                }
                if (motionEvent.getAction() == 0) {
                    this.w0 = c2Var.a0.getVisibility() == 0 && motionEvent.getY() >= ((float) ((getHeight() - AndroidUtilities.dp(60.0f)) - Math.max(Math.max(c2Var.D0, c2Var.T0), c2Var.U0)));
                }
                if (!this.w0 || !c2Var.P.h3(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
            if (c2Var.P.o3.b(motionEvent)) {
                motionEvent.setAction(3);
            }
            if (motionEvent.getAction() == 0) {
            }
            if (!this.w0) {
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }
}
