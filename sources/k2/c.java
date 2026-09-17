package k2;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import di.g7;
import ji.u4;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final class c extends AudioDeviceCallback {
    public final /* synthetic */ g7 a;

    public c(g7 g7Var) {
        this.a = g7Var;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        g7 g7Var = this.a;
        g7Var.a(b.c((Context) g7Var.b, (b2.e) g7Var.j, (u4) g7Var.i));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (e2.d0.k(audioDeviceInfoArr, (u4) this.a.i)) {
            this.a.i = null;
        }
        g7 g7Var = this.a;
        g7Var.a(b.c((Context) g7Var.b, (b2.e) g7Var.j, (u4) g7Var.i));
    }
}
