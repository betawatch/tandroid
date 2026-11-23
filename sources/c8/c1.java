package c8;

import org.telegram.messenger.mp;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class c1 {
    public static boolean a() {
        return mp.g1().getBoolean("asr_live_text", true) && DictationAsr.G();
    }
}
