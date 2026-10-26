package li;

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
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class t1 extends vw0 {
    public boolean l0;
    public final Paint m0;
    public final RectF n0;
    public final /* synthetic */ b2 o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(b2 b2Var, Context context) {
        super(context, null);
        this.o0 = b2Var;
        this.m0 = new Paint(1);
        new Path();
        this.n0 = new RectF();
    }

    @Override // org.telegram.ui.Components.vw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        b2 b2Var = this.o0;
        Rect rect = b2Var.w;
        int o12 = y6.o1(b2Var.I, b2Var.getThemedColor(y6.d6));
        Paint paint = this.m0;
        paint.setColor(o12);
        if (!b2Var.E || b2Var.x == null) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            super.dispatchDraw(canvas);
            return;
        }
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.n0;
        rectF.set(0.0f, 0.0f, width, height);
        rectF.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(22.0f), 0.0f, b2Var.I);
        AndroidUtilities.lerp(b2Var.y, rectF, b2Var.I, rectF);
        rect.set(b2Var.x.getBounds());
        b2Var.x.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        b2Var.x.x(lerp);
        b2Var.x.setAlpha((int) ((1.0f - b2Var.I) * 255.0f));
        b2Var.x.draw(canvas);
        b2Var.x.setBounds(rect);
        rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
        if (b2Var.v != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.lerp(b2Var.G[0], b2Var.H[0], b2Var.I), AndroidUtilities.lerp(b2Var.G[1], b2Var.H[1], b2Var.I));
            canvas.saveLayerAlpha(0.0f, 0.0f, b2Var.v.getWidth(), b2Var.v.getHeight(), (int) ((1.0f - b2Var.I) * 255.0f), 31);
            b2Var.v.draw(canvas);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(AndroidUtilities.lerp(rectF.right, (b2Var.y0.getX() + (b2Var.a0.getX() + (b2Var.Z.getX() + b2Var.Y.getX()))) + b2Var.y0.getWidth(), b2Var.I) - b2Var.v.A1.getWidth(), AndroidUtilities.lerp(rectF.bottom, (b2Var.y0.getY() + (b2Var.a0.getY() + (b2Var.Z.getY() + b2Var.Y.getY()))) + b2Var.y0.getHeight(), b2Var.I) - b2Var.v.A1.getHeight());
            canvas.saveLayerAlpha(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f), b2Var.v.A1.getWidth(), b2Var.v.A1.getHeight(), (int) ((1.0f - b2Var.I) * 255.0f), 31);
            b2Var.v.A1.draw(canvas);
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
        b2 b2Var = this.o0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (b2Var.r0()) {
                org.telegram.messenger.t.q(R.string.RichEditorDraftSaved, new wc(b2Var.X, b2Var.getResourceProvider()), R.raw.contact_check, 36);
                return true;
            }
        } else if (!b2Var.P.n3(keyEvent)) {
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
        sz szVar;
        b2 b2Var = this.o0;
        if (!b2Var.P.v3.x() || !b2Var.P.w3.onTouchEvent(motionEvent)) {
            int height = (!b2Var.C0 || (szVar = b2Var.A0) == null) ? (getHeight() - AndroidUtilities.dp(60.0f)) - Math.max(Math.max(b2Var.D0, b2Var.T0), b2Var.U0) : (int) szVar.getY();
            if (motionEvent.getAction() == 0 && b2Var.B0 && motionEvent.getY() < height) {
                b2Var.l0(true);
            }
            if (motionEvent.getAction() == 0) {
                if (motionEvent.getY() > AndroidUtilities.dp(60.0f) + getPaddingTop()) {
                }
                if (motionEvent.getAction() == 0) {
                    this.l0 = b2Var.a0.getVisibility() == 0 && motionEvent.getY() >= ((float) ((getHeight() - AndroidUtilities.dp(60.0f)) - Math.max(Math.max(b2Var.D0, b2Var.T0), b2Var.U0)));
                }
                if (!this.l0 || !b2Var.P.o3(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
            if (b2Var.P.w3.b(motionEvent)) {
                motionEvent.setAction(3);
            }
            if (motionEvent.getAction() == 0) {
            }
            if (!this.l0) {
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }
}
