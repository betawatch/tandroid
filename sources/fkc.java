// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.KeyEvent;
import org.telegram.messenger.voip.OrientationHelper;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class fkc extends qmc {
    public final Path s;
    public final RectF w;
    public vo x;
    public final /* synthetic */ mkc y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkc(Activity activity, boolean z, mkc mkcVar) {
        super(activity);
        this.y = mkcVar;
        this.c = new pn(null);
        this.a = activity;
        setSystemUiVisibility(1792);
        hl.e2(activity);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z) {
            this.e = true;
        }
        this.s = new Path();
        this.w = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        mkc mkcVar = this.y;
        if (!mkcVar.E0 || getAlpha() == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        float scaleX = mkcVar.d0.getScaleX() * mkcVar.d0.getWidth();
        float scaleY = mkcVar.d0.getScaleY() * mkcVar.d0.getHeight();
        float x = mkcVar.d0.getX() + ((mkcVar.d0.getWidth() - scaleX) / 2.0f);
        float y = mkcVar.d0.getY() + ((mkcVar.d0.getHeight() - scaleY) / 2.0f);
        canvas.save();
        Path path = this.s;
        path.rewind();
        RectF rectF = this.w;
        rectF.set(x, y, scaleX + x, scaleY + y);
        float L = hl.L(4.0f);
        path.addRoundRect(rectF, L, L, Path.Direction.CW);
        path.close();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        VoIPServiceState sharedState;
        mkc mkcVar = this.y;
        if (mkcVar.G0 || mkcVar.E0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 4 && keyEvent.getAction() == 1) {
            mkcVar.g();
            return true;
        }
        if ((keyCode != 25 && keyCode != 24) || mkcVar.p0 != 15 || (sharedState = VoIPService.getSharedState()) == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        sharedState.stopRinging();
        return true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.y.l1) {
            return;
        }
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT < 33 || this.x != null) {
            return;
        }
        this.x = t4.j(this, new xjc(this.y, (byte) 14));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        vo voVar;
        if (Build.VERSION.SDK_INT >= 33 && (voVar = this.x) != null) {
            t4.l(this, voVar);
            this.x = null;
        }
        super.onDetachedFromWindow();
    }
}
