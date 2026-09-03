package l3;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import c2.a1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class i extends AudioDeviceCallback {
    public final /* synthetic */ a1 a;

    public i(a1 a1Var) {
        this.a = a1Var;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        a1 a1Var = this.a;
        a1.a(a1Var, g.a((Context) a1Var.b));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        a1 a1Var = this.a;
        a1.a(a1Var, g.a((Context) a1Var.b));
    }
}
