package c8;

import android.os.Build;
import org.telegram.messenger.mp;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class b1 {
    public static boolean a() {
        if (mp.g1().getBoolean("design_voice_live_transcript", true) && DictationAsr.B()) {
            return !DictationAsr.x() || (Build.VERSION.SDK_INT >= 33 && ai.d.h());
        }
        return false;
    }
}
