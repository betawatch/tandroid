package c8;

import android.os.Build;
import org.telegram.messenger.mp;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public abstract class b1 {
    public static boolean a() {
        if (mp.g1().getBoolean("design_voice_live_transcript", true) && DictationAsr.D()) {
            return !DictationAsr.z() || (Build.VERSION.SDK_INT >= 33 && ai.d.i());
        }
        return false;
    }
}
