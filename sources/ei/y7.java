package ei;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.AudioManager;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y7 extends View {
    public Paint a;
    public boolean b;
    public a3.o c;
    public org.telegram.ui.Components.u5 d;
    public org.telegram.ui.Components.u5 e;
    public float f;

    public final void a(boolean z10) {
        a3.o oVar = this.c;
        AudioManager audioManager = (AudioManager) getContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        float f10 = streamMaxVolume;
        int max = (int) Math.max(1.0f, f10 / 15.0f);
        if (z10) {
            int i3 = streamVolume + max;
            if (i3 <= streamMaxVolume) {
                streamMaxVolume = i3;
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
        org.telegram.messenger.g0.r(oVar);
        org.telegram.messenger.g0.i3(oVar, 2000L);
    }

    public final void b() {
        a3.o oVar = this.c;
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
        org.telegram.messenger.g0.r(oVar);
        org.telegram.messenger.g0.i3(oVar, 2000L);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.a;
        super.onDraw(canvas);
        org.telegram.ui.Components.u5 u5Var = this.e;
        u5Var.e(false, this.f);
        org.telegram.ui.Components.u5 u5Var2 = this.d;
        u5Var2.e(false, this.b ? 1.0f : 0.0f);
        if (u5Var2.c != 0.0f) {
            float measuredHeight = getMeasuredHeight() / 2.0f;
            paint.setAlpha((int) (u5Var2.c * 255.0f));
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getMeasuredWidth() * u5Var.c, getMeasuredHeight());
            canvas.drawRoundRect(rectF, measuredHeight, measuredHeight, paint);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && i3 == 24) {
            a(true);
            return true;
        }
        if (keyEvent.getAction() != 0 || i3 != 25) {
            return super.onKeyDown(i3, keyEvent);
        }
        a(false);
        return true;
    }
}
