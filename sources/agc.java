// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.KeyEvent;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;
import org.webrtc.OrientationHelper;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class agc extends eic {
    public final Path s;
    public final RectF w;
    public uo x;
    public final /* synthetic */ hgc y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agc(Activity activity, boolean z, hgc hgcVar) {
        super(activity);
        this.y = hgcVar;
        this.c = new on(null);
        this.a = activity;
        setSystemUiVisibility(1792);
        gl.e2(activity);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z) {
            this.e = true;
        }
        this.s = new Path();
        this.w = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        hgc hgcVar = this.y;
        if (!hgcVar.E0 || getAlpha() == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        float scaleX = hgcVar.d0.getScaleX() * hgcVar.d0.getWidth();
        float scaleY = hgcVar.d0.getScaleY() * hgcVar.d0.getHeight();
        float x = hgcVar.d0.getX() + ((hgcVar.d0.getWidth() - scaleX) / 2.0f);
        float y = hgcVar.d0.getY() + ((hgcVar.d0.getHeight() - scaleY) / 2.0f);
        canvas.save();
        Path path = this.s;
        path.rewind();
        RectF rectF = this.w;
        rectF.set(x, y, scaleX + x, scaleY + y);
        float L = gl.L(4.0f);
        path.addRoundRect(rectF, L, L, Path.Direction.CW);
        path.close();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        VoIPServiceState sharedState;
        hgc hgcVar = this.y;
        if (hgcVar.G0 || hgcVar.E0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 4 && keyEvent.getAction() == 1) {
            hgcVar.g();
            return true;
        }
        if ((keyCode != 25 && keyCode != 24) || hgcVar.p0 != 15 || (sharedState = VoIPService.getSharedState()) == null) {
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
        this.x = s4.j(this, new sfc(this.y, (byte) 14));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        uo uoVar;
        if (Build.VERSION.SDK_INT >= 33 && (uoVar = this.x) != null) {
            s4.l(this, uoVar);
            this.x = null;
        }
        super.onDetachedFromWindow();
    }
}
