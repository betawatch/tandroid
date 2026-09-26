package k2;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import ci.e7;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class c extends AudioDeviceCallback {
    public final /* synthetic */ e7 a;

    public c(e7 e7Var) {
        this.a = e7Var;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        e7 e7Var = this.a;
        e7Var.a(b.c((Context) e7Var.b, (b2.e) e7Var.j, (a6.m) e7Var.i));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (e2.d0.k(audioDeviceInfoArr, (a6.m) this.a.i)) {
            this.a.i = null;
        }
        e7 e7Var = this.a;
        e7Var.a(b.c((Context) e7Var.b, (b2.e) e7Var.j, (a6.m) e7Var.i));
    }
}
