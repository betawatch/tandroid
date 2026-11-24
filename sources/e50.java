// default package

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class e50 {
    public final AudioTrack a;
    public final ni6 b;
    public final Handler c;
    public c50 d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.media.AudioRouting$OnRoutingChangedListener, c50] */
    public e50(AudioTrack audioTrack, ni6 ni6Var) {
        this.a = audioTrack;
        this.b = ni6Var;
        Handler q = hac.q(null);
        this.c = q;
        ?? r0 = new AudioRouting.OnRoutingChangedListener() { // from class: c50
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(final AudioRouting audioRouting) {
                final e50 e50Var = e50.this;
                if (e50Var.d == null) {
                    return;
                }
                pe0.a().execute(new Runnable() { // from class: d50
                    @Override // java.lang.Runnable
                    public final void run() {
                        e50.this.a(audioRouting);
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
            this.c.post(new x30(this, routedDevice, (byte) 4));
        }
    }

    public final void b() {
        c50 c50Var = this.d;
        c50Var.getClass();
        this.a.removeOnRoutingChangedListener(c50Var);
        this.d = null;
    }
}
