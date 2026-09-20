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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class v1 extends aw0 {
    public boolean w0;
    public final Paint x0;
    public final RectF y0;
    public final /* synthetic */ d2 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(d2 d2Var, Context context) {
        super(context, null);
        this.z0 = d2Var;
        this.x0 = new Paint(1);
        new Path();
        this.y0 = new RectF();
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        d2 d2Var = this.z0;
        Rect rect = d2Var.w;
        int l1 = j6.l1(d2Var.I, d2Var.getThemedColor(j6.d6));
        Paint paint = this.x0;
        paint.setColor(l1);
        if (!d2Var.E || d2Var.x == null) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            super.dispatchDraw(canvas);
            return;
        }
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.y0;
        rectF.set(0.0f, 0.0f, width, height);
        rectF.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(22.0f), 0.0f, d2Var.I);
        AndroidUtilities.lerp(d2Var.y, rectF, d2Var.I, rectF);
        rect.set(d2Var.x.getBounds());
        d2Var.x.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        d2Var.x.q(lerp);
        d2Var.x.setAlpha((int) ((1.0f - d2Var.I) * 255.0f));
        d2Var.x.draw(canvas);
        d2Var.x.setBounds(rect);
        rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
        if (d2Var.v != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.lerp(d2Var.G[0], d2Var.H[0], d2Var.I), AndroidUtilities.lerp(d2Var.G[1], d2Var.H[1], d2Var.I));
            canvas.saveLayerAlpha(0.0f, 0.0f, d2Var.v.getWidth(), d2Var.v.getHeight(), (int) ((1.0f - d2Var.I) * 255.0f), 31);
            d2Var.v.draw(canvas);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(AndroidUtilities.lerp(rectF.right, (d2Var.y0.getX() + (d2Var.a0.getX() + (d2Var.Z.getX() + d2Var.Y.getX()))) + d2Var.y0.getWidth(), d2Var.I) - d2Var.v.z1.getWidth(), AndroidUtilities.lerp(rectF.bottom, (d2Var.y0.getY() + (d2Var.a0.getY() + (d2Var.Z.getY() + d2Var.Y.getY()))) + d2Var.y0.getHeight(), d2Var.I) - d2Var.v.z1.getHeight());
            canvas.saveLayerAlpha(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f), d2Var.v.z1.getWidth(), d2Var.v.z1.getHeight(), (int) ((1.0f - d2Var.I) * 255.0f), 31);
            d2Var.v.z1.draw(canvas);
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
        d2 d2Var = this.z0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (d2Var.q0()) {
                org.telegram.messenger.l0.o(R.string.RichEditorDraftSaved, new xc(d2Var.X, d2Var.getResourceProvider()), R.raw.contact_check, 36);
                return true;
            }
        } else if (!d2Var.P.i3(keyEvent)) {
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
        d2 d2Var = this.z0;
        if (!d2Var.P.n3.y() || !d2Var.P.o3.onTouchEvent(motionEvent)) {
            int height = (!d2Var.C0 || (kzVar = d2Var.A0) == null) ? (getHeight() - AndroidUtilities.dp(60.0f)) - Math.max(Math.max(d2Var.D0, d2Var.T0), d2Var.U0) : (int) kzVar.getY();
            if (motionEvent.getAction() == 0 && d2Var.B0 && motionEvent.getY() < height) {
                d2Var.k0(true);
            }
            if (motionEvent.getAction() == 0) {
                if (motionEvent.getY() > AndroidUtilities.dp(60.0f) + getPaddingTop()) {
                }
                if (motionEvent.getAction() == 0) {
                    this.w0 = d2Var.a0.getVisibility() == 0 && motionEvent.getY() >= ((float) ((getHeight() - AndroidUtilities.dp(60.0f)) - Math.max(Math.max(d2Var.D0, d2Var.T0), d2Var.U0)));
                }
                if (!this.w0 || !d2Var.P.j3(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
            if (d2Var.P.o3.b(motionEvent)) {
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
