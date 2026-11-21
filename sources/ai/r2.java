package ai;

import java.util.concurrent.ConcurrentLinkedQueue;
import org.telegram.messenger.mp;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.j20;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class r2 {
    public final j20 a;
    public boolean c;
    public volatile boolean d;
    public Thread e;
    public final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    public long f = 1;

    public r2(j20 j20Var) {
        this.a = j20Var;
    }

    public static boolean a() {
        return DictationAsr.D() && mp.g1().getBoolean("asr_live_captions", false);
    }
}
