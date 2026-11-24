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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bic extends ekc {
    public final Path s;
    public final RectF w;
    public up x;
    public final /* synthetic */ iic y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bic(Activity activity, boolean z, iic iicVar) {
        super(activity);
        this.y = iicVar;
        this.c = new po(null);
        this.a = activity;
        setSystemUiVisibility(1792);
        gm.e2(activity);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z) {
            this.e = true;
        }
        this.s = new Path();
        this.w = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        iic iicVar = this.y;
        if (!iicVar.E0 || getAlpha() == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        float scaleX = iicVar.d0.getScaleX() * iicVar.d0.getWidth();
        float scaleY = iicVar.d0.getScaleY() * iicVar.d0.getHeight();
        float x = iicVar.d0.getX() + ((iicVar.d0.getWidth() - scaleX) / 2.0f);
        float y = iicVar.d0.getY() + ((iicVar.d0.getHeight() - scaleY) / 2.0f);
        canvas.save();
        Path path = this.s;
        path.rewind();
        RectF rectF = this.w;
        rectF.set(x, y, scaleX + x, scaleY + y);
        float L = gm.L(4.0f);
        path.addRoundRect(rectF, L, L, Path.Direction.CW);
        path.close();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        VoIPServiceState sharedState;
        iic iicVar = this.y;
        if (iicVar.G0 || iicVar.E0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 4 && keyEvent.getAction() == 1) {
            iicVar.g();
            return true;
        }
        if ((keyCode != 25 && keyCode != 24) || iicVar.p0 != 15 || (sharedState = VoIPService.getSharedState()) == null) {
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
        this.x = s4.j(this, new thc(this.y, (byte) 14));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        up upVar;
        if (Build.VERSION.SDK_INT >= 33 && (upVar = this.x) != null) {
            s4.l(this, upVar);
            this.x = null;
        }
        super.onDetachedFromWindow();
    }
}
