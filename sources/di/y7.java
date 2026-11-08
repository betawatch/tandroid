package di;

import a8.ra;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.AudioManager;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class y7 extends View {
    public Paint a;
    public boolean b;
    public ra c;
    public org.telegram.ui.Components.w5 d;
    public org.telegram.ui.Components.w5 e;
    public float f;

    public final void a(boolean z9) {
        ra raVar = this.c;
        AudioManager audioManager = (AudioManager) getContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        float f10 = streamMaxVolume;
        int max = (int) Math.max(1.0f, f10 / 15.0f);
        if (z9) {
            int i7 = streamVolume + max;
            if (i7 <= streamMaxVolume) {
                streamMaxVolume = i7;
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
            this.e.e(true, f11);
        }
        invalidate();
        this.b = true;
        org.telegram.messenger.g0.r(raVar);
        org.telegram.messenger.g0.i3(raVar, 2000L);
    }

    public final void b() {
        ra raVar = this.c;
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
        this.e.e(true, f10);
        this.b = true;
        invalidate();
        org.telegram.messenger.g0.r(raVar);
        org.telegram.messenger.g0.i3(raVar, 2000L);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.a;
        super.onDraw(canvas);
        org.telegram.ui.Components.w5 w5Var = this.e;
        w5Var.e(false, this.f);
        org.telegram.ui.Components.w5 w5Var2 = this.d;
        w5Var2.e(false, this.b ? 1.0f : 0.0f);
        if (w5Var2.c != 0.0f) {
            float measuredHeight = getMeasuredHeight() / 2.0f;
            paint.setAlpha((int) (w5Var2.c * 255.0f));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getMeasuredWidth() * w5Var.c, getMeasuredHeight());
            canvas.drawRoundRect(rectF, measuredHeight, measuredHeight, paint);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && i7 == 24) {
            a(true);
            return true;
        }
        if (keyEvent.getAction() != 0 || i7 != 25) {
            return super.onKeyDown(i7, keyEvent);
        }
        a(false);
        return true;
    }
}
