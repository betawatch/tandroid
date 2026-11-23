package c8;

import android.os.Build;
import org.telegram.messenger.np;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public abstract class b1 {
    public static boolean a(long j3) {
        if (np.g1().getBoolean("asr_live_text", true) && DictationAsr.D()) {
            return !DictationAsr.z(j3) || (Build.VERSION.SDK_INT >= 33 && ai.d.i());
        }
        return false;
    }
}
