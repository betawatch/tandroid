package ai;

import java.util.concurrent.ConcurrentLinkedQueue;
import org.telegram.messenger.np;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.g20;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class p2 {
    public final g20 a;
    public boolean c;
    public volatile boolean d;
    public Thread e;
    public final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    public long f = 1;

    public p2(g20 g20Var) {
        this.a = g20Var;
    }

    public static boolean a() {
        return DictationAsr.B() && np.e1().getBoolean("asr_live_captions", false);
    }
}
