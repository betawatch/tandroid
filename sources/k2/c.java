package k2;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import bi.h8;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class c extends AudioDeviceCallback {
    public final /* synthetic */ h8 a;

    public c(h8 h8Var) {
        this.a = h8Var;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        h8 h8Var = this.a;
        h8Var.a(b.c((Context) h8Var.b, (b2.e) h8Var.j, (a6.i) h8Var.i));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (e2.d0.k(audioDeviceInfoArr, (a6.i) this.a.i)) {
            this.a.i = null;
        }
        h8 h8Var = this.a;
        h8Var.a(b.c((Context) h8Var.b, (b2.e) h8Var.j, (a6.i) h8Var.i));
    }
}
