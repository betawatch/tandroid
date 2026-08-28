package h3;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import gh.i3;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m2 {
    public final Context a;
    public final Handler b;
    public final h0 c;
    public final AudioManager d;
    public androidx.mediarouter.app.h e;
    public int f;
    public int g;
    public boolean h;

    public m2(Context context, Handler handler, h0 h0Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = handler;
        this.c = h0Var;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        d5.a.j(audioManager);
        this.d = audioManager;
        this.f = 3;
        this.g = b(audioManager, 3);
        int i9 = this.f;
        this.h = d5.f0.a >= 23 ? audioManager.isStreamMute(i9) : b(audioManager, i9) == 0;
        androidx.mediarouter.app.h hVar = new androidx.mediarouter.app.h(this, 6);
        try {
            d5.f0.M(applicationContext, hVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.e = hVar;
        } catch (RuntimeException e10) {
            d5.a.L("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    public static int b(AudioManager audioManager, int i9) {
        try {
            return audioManager.getStreamVolume(i9);
        } catch (RuntimeException e10) {
            d5.a.L("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i9, e10);
            return audioManager.getStreamMaxVolume(i9);
        }
    }

    public final int a() {
        if (d5.f0.a >= 28) {
            return this.d.getStreamMinVolume(this.f);
        }
        return 0;
    }

    public final void c(int i9) {
        if (this.f == i9) {
            return;
        }
        this.f = i9;
        d();
        k0 k0Var = this.c.a;
        m2 m2Var = k0Var.B;
        m mVar = new m(0, m2Var.a(), m2Var.d.getStreamMaxVolume(m2Var.f));
        if (mVar.equals(k0Var.f0)) {
            return;
        }
        k0Var.f0 = mVar;
        k0Var.l.e(29, new i3(mVar, 13));
    }

    public final void d() {
        int i9 = this.f;
        AudioManager audioManager = this.d;
        final int b10 = b(audioManager, i9);
        int i10 = this.f;
        final boolean isStreamMute = d5.f0.a >= 23 ? audioManager.isStreamMute(i10) : b(audioManager, i10) == 0;
        if (this.g == b10 && this.h == isStreamMute) {
            return;
        }
        this.g = b10;
        this.h = isStreamMute;
        this.c.a.l.e(30, new d5.k() { // from class: h3.f0
            @Override // d5.k
            public final void invoke(Object obj) {
                ((a2) obj).onDeviceVolumeChanged(b10, isStreamMute);
            }
        });
    }
}
