package k2;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class d extends AudioDeviceCallback {
    public final /* synthetic */ f a;

    public d(f fVar) {
        this.a = fVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.a.c();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        f fVar = this.a;
        if (e2.n0.l(audioDeviceInfoArr, fVar.i)) {
            fVar.i = null;
        }
        fVar.c();
    }
}
