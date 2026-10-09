package k2;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import ci.e7;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class c extends AudioDeviceCallback {
    public final /* synthetic */ e7 a;

    public c(e7 e7Var) {
        this.a = e7Var;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        e7 e7Var = this.a;
        e7Var.a(b.c((Context) e7Var.b, (b2.e) e7Var.j, (a4.l) e7Var.i));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        e7 e7Var = this.a;
        if (e2.d0.k(audioDeviceInfoArr, (a4.l) e7Var.i)) {
            e7Var.i = null;
        }
        e7Var.a(b.c((Context) e7Var.b, (b2.e) e7Var.j, (a4.l) e7Var.i));
    }
}
