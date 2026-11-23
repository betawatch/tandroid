package ai;

import java.util.concurrent.ConcurrentLinkedQueue;
import org.telegram.messenger.np;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.j20;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class s2 {
    public final j20 a;
    public boolean c;
    public volatile boolean d;
    public Thread e;
    public final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    public long f = 1;

    public s2(j20 j20Var) {
        this.a = j20Var;
    }

    public static boolean a() {
        return DictationAsr.D() && np.g1().getBoolean("asr_live_captions", false);
    }
}
