package c8;

import android.os.Build;
import org.telegram.messenger.mp;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class b1 {
    public static boolean a() {
        if (mp.g1().getBoolean("design_voice_live_transcript", true) && DictationAsr.B()) {
            return !DictationAsr.x() || (Build.VERSION.SDK_INT >= 33 && ai.d.h());
        }
        return false;
    }
}
