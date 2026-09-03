package l3;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import c2.z0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class i extends AudioDeviceCallback {
    public final /* synthetic */ z0 a;

    public i(z0 z0Var) {
        this.a = z0Var;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        z0 z0Var = this.a;
        z0.a(z0Var, g.a((Context) z0Var.b));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        z0 z0Var = this.a;
        z0.a(z0Var, g.a((Context) z0Var.b));
    }
}
