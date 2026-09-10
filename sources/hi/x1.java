package hi;

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
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class x1 extends aw0 {
    public boolean w0;
    public final Paint x0;
    public final RectF y0;
    public final /* synthetic */ g2 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(g2 g2Var, Context context) {
        super(context, null);
        this.z0 = g2Var;
        this.x0 = new Paint(1);
        new Path();
        this.y0 = new RectF();
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        g2 g2Var = this.z0;
        Rect rect = g2Var.w;
        int l1 = org.telegram.ui.ActionBar.j6.l1(g2Var.I, g2Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        Paint paint = this.x0;
        paint.setColor(l1);
        if (!g2Var.E || g2Var.x == null) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            super.dispatchDraw(canvas);
            return;
        }
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.y0;
        rectF.set(0.0f, 0.0f, width, height);
        rectF.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(22.0f), 0.0f, g2Var.I);
        AndroidUtilities.lerp(g2Var.y, rectF, g2Var.I, rectF);
        rect.set(g2Var.x.getBounds());
        g2Var.x.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        g2Var.x.p(lerp);
        g2Var.x.setAlpha((int) ((1.0f - g2Var.I) * 255.0f));
        g2Var.x.draw(canvas);
        g2Var.x.setBounds(rect);
        rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
        if (g2Var.v != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.lerp(g2Var.G[0], g2Var.H[0], g2Var.I), AndroidUtilities.lerp(g2Var.G[1], g2Var.H[1], g2Var.I));
            canvas.saveLayerAlpha(0.0f, 0.0f, g2Var.v.getWidth(), g2Var.v.getHeight(), (int) ((1.0f - g2Var.I) * 255.0f), 31);
            g2Var.v.draw(canvas);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(AndroidUtilities.lerp(rectF.right, (g2Var.y0.getX() + (g2Var.a0.getX() + (g2Var.Z.getX() + g2Var.Y.getX()))) + g2Var.y0.getWidth(), g2Var.I) - g2Var.v.z1.getWidth(), AndroidUtilities.lerp(rectF.bottom, (g2Var.y0.getY() + (g2Var.a0.getY() + (g2Var.Z.getY() + g2Var.Y.getY()))) + g2Var.y0.getHeight(), g2Var.I) - g2Var.v.z1.getHeight());
            canvas.saveLayerAlpha(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f), g2Var.v.z1.getWidth(), g2Var.v.z1.getHeight(), (int) ((1.0f - g2Var.I) * 255.0f), 31);
            g2Var.v.z1.draw(canvas);
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
        g2 g2Var = this.z0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (g2Var.q0()) {
                org.telegram.messenger.a2.o(R.string.RichEditorDraftSaved, new wc(g2Var.X, g2Var.getResourceProvider()), R.raw.contact_check, 36);
                return true;
            }
        } else if (!g2Var.P.g3(keyEvent)) {
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
        rz rzVar;
        g2 g2Var = this.z0;
        if (!g2Var.P.n3.y() || !g2Var.P.o3.onTouchEvent(motionEvent)) {
            int height = (!g2Var.C0 || (rzVar = g2Var.A0) == null) ? (getHeight() - AndroidUtilities.dp(60.0f)) - Math.max(Math.max(g2Var.D0, g2Var.T0), g2Var.U0) : (int) rzVar.getY();
            if (motionEvent.getAction() == 0 && g2Var.B0 && motionEvent.getY() < height) {
                g2Var.k0(true);
            }
            if (motionEvent.getAction() == 0) {
                if (motionEvent.getY() > AndroidUtilities.dp(60.0f) + getPaddingTop()) {
                }
                if (motionEvent.getAction() == 0) {
                    this.w0 = g2Var.a0.getVisibility() == 0 && motionEvent.getY() >= ((float) ((getHeight() - AndroidUtilities.dp(60.0f)) - Math.max(Math.max(g2Var.D0, g2Var.T0), g2Var.U0)));
                }
                if (!this.w0 || !g2Var.P.h3(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
            if (g2Var.P.o3.b(motionEvent)) {
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
