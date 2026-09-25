package ii;

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
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class w1 extends aw0 {
    public boolean w0;
    public final Paint x0;
    public final RectF y0;
    public final /* synthetic */ e2 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(e2 e2Var, Context context) {
        super(context, null);
        this.z0 = e2Var;
        this.x0 = new Paint(1);
        new Path();
        this.y0 = new RectF();
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        e2 e2Var = this.z0;
        Rect rect = e2Var.w;
        int l1 = org.telegram.ui.ActionBar.h6.l1(e2Var.I, e2Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
        Paint paint = this.x0;
        paint.setColor(l1);
        if (!e2Var.E || e2Var.x == null) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            super.dispatchDraw(canvas);
            return;
        }
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.y0;
        rectF.set(0.0f, 0.0f, width, height);
        rectF.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(22.0f), 0.0f, e2Var.I);
        AndroidUtilities.lerp(e2Var.y, rectF, e2Var.I, rectF);
        rect.set(e2Var.x.getBounds());
        e2Var.x.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        e2Var.x.q(lerp);
        e2Var.x.setAlpha((int) ((1.0f - e2Var.I) * 255.0f));
        e2Var.x.draw(canvas);
        e2Var.x.setBounds(rect);
        rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
        if (e2Var.v != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.lerp(e2Var.G[0], e2Var.H[0], e2Var.I), AndroidUtilities.lerp(e2Var.G[1], e2Var.H[1], e2Var.I));
            canvas.saveLayerAlpha(0.0f, 0.0f, e2Var.v.getWidth(), e2Var.v.getHeight(), (int) ((1.0f - e2Var.I) * 255.0f), 31);
            e2Var.v.draw(canvas);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(AndroidUtilities.lerp(rectF.right, (e2Var.y0.getX() + (e2Var.a0.getX() + (e2Var.Z.getX() + e2Var.Y.getX()))) + e2Var.y0.getWidth(), e2Var.I) - e2Var.v.A1.getWidth(), AndroidUtilities.lerp(rectF.bottom, (e2Var.y0.getY() + (e2Var.a0.getY() + (e2Var.Z.getY() + e2Var.Y.getY()))) + e2Var.y0.getHeight(), e2Var.I) - e2Var.v.A1.getHeight());
            canvas.saveLayerAlpha(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f), e2Var.v.A1.getWidth(), e2Var.v.A1.getHeight(), (int) ((1.0f - e2Var.I) * 255.0f), 31);
            e2Var.v.A1.draw(canvas);
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
        e2 e2Var = this.z0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (e2Var.q0()) {
                org.telegram.messenger.f0.p(R.string.RichEditorDraftSaved, new xc(e2Var.X, e2Var.getResourceProvider()), R.raw.contact_check, 36);
                return true;
            }
        } else if (!e2Var.P.h3(keyEvent)) {
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
        lz lzVar;
        e2 e2Var = this.z0;
        if (!e2Var.P.n3.y() || !e2Var.P.o3.onTouchEvent(motionEvent)) {
            int height = (!e2Var.C0 || (lzVar = e2Var.A0) == null) ? (getHeight() - AndroidUtilities.dp(60.0f)) - Math.max(Math.max(e2Var.D0, e2Var.T0), e2Var.U0) : (int) lzVar.getY();
            if (motionEvent.getAction() == 0 && e2Var.B0 && motionEvent.getY() < height) {
                e2Var.k0(true);
            }
            if (motionEvent.getAction() == 0) {
                if (motionEvent.getY() > AndroidUtilities.dp(60.0f) + getPaddingTop()) {
                }
                if (motionEvent.getAction() == 0) {
                    this.w0 = e2Var.a0.getVisibility() == 0 && motionEvent.getY() >= ((float) ((getHeight() - AndroidUtilities.dp(60.0f)) - Math.max(Math.max(e2Var.D0, e2Var.T0), e2Var.U0)));
                }
                if (!this.w0 || !e2Var.P.i3(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
            if (e2Var.P.o3.b(motionEvent)) {
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
