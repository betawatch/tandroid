package k2;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import ci.g7;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
