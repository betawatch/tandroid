package l3;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class e {
    private static final s8.z a() {
        s8.y yVar = new s8.y();
        Integer[] numArr = {8, 7};
        s8.l.b(2, numArr);
        yVar.h(yVar.a + 2);
        System.arraycopy(numArr, 0, yVar.c, yVar.a, 2);
        yVar.a += 2;
        int i10 = h5.d0.a;
        if (i10 >= 31) {
            Integer[] numArr2 = {26, 27};
            s8.l.b(2, numArr2);
            yVar.h(yVar.a + 2);
            System.arraycopy(numArr2, 0, yVar.c, yVar.a, 2);
            yVar.a += 2;
        }
        if (i10 >= 33) {
            yVar.b(30);
        }
        return yVar.i();
    }

    public static final boolean b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        audioManager.getClass();
        AudioDeviceInfo[] devices = audioManager.getDevices(2);
        s8.z a2 = a();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (a2.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }
}
