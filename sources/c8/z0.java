package c8;

import android.os.Build;
import org.telegram.messenger.np;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public abstract class z0 {
    public static boolean a() {
        if (!b() || !DictationAsr.B()) {
            return false;
        }
        if (DictationAsr.x()) {
            return Build.VERSION.SDK_INT >= 33 && ai.d.h();
        }
        return true;
    }

    public static boolean b() {
        return np.e1().getBoolean("design_voice_live_transcript", true);
    }

    public static boolean c() {
        return np.e1().getBoolean("design_voice_live_field", true);
    }
}
