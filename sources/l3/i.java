package l3;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import c2.z0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
