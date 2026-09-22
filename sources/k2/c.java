package k2;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import ci.g7;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class c extends AudioDeviceCallback {
    public final /* synthetic */ g7 a;

    public c(g7 g7Var) {
        this.a = g7Var;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        g7 g7Var = this.a;
        g7Var.a(b.c((Context) g7Var.b, (b2.e) g7Var.j, (a6.m) g7Var.i));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (e2.d0.k(audioDeviceInfoArr, (a6.m) this.a.i)) {
            this.a.i = null;
        }
        g7 g7Var = this.a;
        g7Var.a(b.c((Context) g7Var.b, (b2.e) g7Var.j, (a6.m) g7Var.i));
    }
}
