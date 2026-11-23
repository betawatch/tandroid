package c8;

import android.os.Build;
import org.telegram.messenger.np;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public abstract class b1 {
    public static boolean a(long j3) {
        if (np.g1().getBoolean("asr_live_text", true) && DictationAsr.D()) {
            return !DictationAsr.z(j3) || (Build.VERSION.SDK_INT >= 33 && ai.d.i());
        }
        return false;
    }
}
