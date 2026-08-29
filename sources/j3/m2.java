package j3;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m2 {
    public final Context a;
    public final Handler b;
    public final h0 c;
    public final AudioManager d;
    public af.c e;
    public int f;
    public int g;
    public boolean h;

    public m2(Context context, Handler handler, h0 h0Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = handler;
        this.c = h0Var;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        f5.a.j(audioManager);
        this.d = audioManager;
        this.f = 3;
        this.g = b(audioManager, 3);
        int i10 = this.f;
        this.h = f5.d0.a >= 23 ? audioManager.isStreamMute(i10) : b(audioManager, i10) == 0;
        af.c cVar = new af.c(this, 7);
        try {
            f5.d0.M(applicationContext, cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.e = cVar;
        } catch (RuntimeException e10) {
            f5.a.L("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    public static int b(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            f5.a.L("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public final int a() {
        if (f5.d0.a >= 28) {
            return this.d.getStreamMinVolume(this.f);
        }
        return 0;
    }

    public final void c(int i10) {
        if (this.f == i10) {
            return;
        }
        this.f = i10;
        d();
        k0 k0Var = this.c.a;
        m2 m2Var = k0Var.B;
        m mVar = new m(0, m2Var.a(), m2Var.d.getStreamMaxVolume(m2Var.f));
        if (mVar.equals(k0Var.f0)) {
            return;
        }
        k0Var.f0 = mVar;
        k0Var.l.e(29, new eg.n(mVar, 15));
    }

    public final void d() {
        int i10 = this.f;
        AudioManager audioManager = this.d;
        final int b10 = b(audioManager, i10);
        int i11 = this.f;
        final boolean isStreamMute = f5.d0.a >= 23 ? audioManager.isStreamMute(i11) : b(audioManager, i11) == 0;
        if (this.g == b10 && this.h == isStreamMute) {
            return;
        }
        this.g = b10;
        this.h = isStreamMute;
        this.c.a.l.e(30, new f5.j() { // from class: j3.g0
            @Override // f5.j
            public final void invoke(Object obj) {
                ((a2) obj).onDeviceVolumeChanged(b10, isStreamMute);
            }
        });
    }
}
