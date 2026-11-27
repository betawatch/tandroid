// default package

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class g40 {
    public final AudioTrack a;
    public final ri6 b;
    public final Handler c;
    public e40 d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.media.AudioRouting$OnRoutingChangedListener, e40] */
    public g40(AudioTrack audioTrack, ri6 ri6Var) {
        this.a = audioTrack;
        this.b = ri6Var;
        Handler q = gcc.q(null);
        this.c = q;
        ?? r0 = new AudioRouting.OnRoutingChangedListener() { // from class: e40
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(final AudioRouting audioRouting) {
                final g40 g40Var = g40.this;
                if (g40Var.d == null) {
                    return;
                }
                rd0.a().execute(new Runnable() { // from class: f40
                    @Override // java.lang.Runnable
                    public final void run() {
                        g40.this.a(audioRouting);
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
            this.c.post(new a30(this, routedDevice, (byte) 3));
        }
    }

    public final void b() {
        e40 e40Var = this.d;
        e40Var.getClass();
        this.a.removeOnRoutingChangedListener(e40Var);
        this.d = null;
    }
}
