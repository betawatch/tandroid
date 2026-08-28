package ih;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.AudioManager;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class v7 extends View {
    public Paint a;
    public boolean b;
    public androidx.activity.i c;
    public org.telegram.ui.Components.y5 d;
    public org.telegram.ui.Components.y5 e;
    public float f;

    public final void a(boolean z10) {
        androidx.activity.i iVar = this.c;
        AudioManager audioManager = (AudioManager) getContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        float f10 = streamMaxVolume;
        int max = (int) Math.max(1.0f, f10 / 15.0f);
        if (z10) {
            int i9 = streamVolume + max;
            if (i9 <= streamMaxVolume) {
                streamMaxVolume = i9;
            }
        } else {
            streamMaxVolume = streamVolume - max;
            if (streamMaxVolume < 0) {
                streamMaxVolume = 0;
            }
        }
        audioManager.setStreamVolume(3, streamMaxVolume, 0);
        float f11 = streamMaxVolume / f10;
        this.f = f11;
        if (!this.b) {
            this.e.d(f11, true);
        }
        invalidate();
        this.b = true;
        AndroidUtilities.cancelRunOnUIThread(iVar);
        AndroidUtilities.runOnUIThread(iVar, 2000L);
    }

    public final void b() {
        androidx.activity.i iVar = this.c;
        AudioManager audioManager = (AudioManager) getContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamMinVolume = Build.VERSION.SDK_INT >= 28 ? audioManager.getStreamMinVolume(3) : 0;
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamVolume <= streamMinVolume) {
            a(true);
            return;
        }
        if (this.b) {
            return;
        }
        float f10 = streamVolume / streamMaxVolume;
        this.f = f10;
        this.e.d(f10, true);
        this.b = true;
        invalidate();
        AndroidUtilities.cancelRunOnUIThread(iVar);
        AndroidUtilities.runOnUIThread(iVar, 2000L);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.a;
        super.onDraw(canvas);
        org.telegram.ui.Components.y5 y5Var = this.e;
        y5Var.d(this.f, false);
        org.telegram.ui.Components.y5 y5Var2 = this.d;
        y5Var2.d(this.b ? 1.0f : 0.0f, false);
        if (y5Var2.c != 0.0f) {
            float measuredHeight = getMeasuredHeight() / 2.0f;
            paint.setAlpha((int) (y5Var2.c * 255.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth() * y5Var.c, getMeasuredHeight());
            canvas.drawRoundRect(rectF, measuredHeight, measuredHeight, paint);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i9, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && i9 == 24) {
            a(true);
            return true;
        }
        if (keyEvent.getAction() != 0 || i9 != 25) {
            return super.onKeyDown(i9, keyEvent);
        }
        a(false);
        return true;
    }
}
