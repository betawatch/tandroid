// default package

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class e40 {
    public final AudioTrack a;
    public final l69 b;
    public final Handler c;
    public c40 d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.media.AudioRouting$OnRoutingChangedListener, c40] */
    public e40(AudioTrack audioTrack, l69 l69Var) {
        this.a = audioTrack;
        this.b = l69Var;
        Handler q = g8c.q(null);
        this.c = q;
        ?? r0 = new AudioRouting.OnRoutingChangedListener() { // from class: c40
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(final AudioRouting audioRouting) {
                final e40 e40Var = e40.this;
                if (e40Var.d == null) {
                    return;
                }
                pd0.a().execute(new Runnable() { // from class: d40
                    @Override // java.lang.Runnable
                    public final void run() {
                        e40.this.a(audioRouting);
                    }
                });
            }
        };
        this.d = r0;
        audioTrack.addOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) r0, q);
    }

    public final /* synthetic */ void a(AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            this.c.post(new z20(this, routedDevice, (byte) 3));
        }
    }

    public final void b() {
        c40 c40Var = this.d;
        c40Var.getClass();
        this.a.removeOnRoutingChangedListener(c40Var);
        this.d = null;
    }
}
