package ai;

import java.util.concurrent.ConcurrentLinkedQueue;
import org.telegram.messenger.mp;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.j20;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class p2 {
    public final j20 a;
    public boolean c;
    public volatile boolean d;
    public Thread e;
    public final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    public long f = 1;

    public p2(j20 j20Var) {
        this.a = j20Var;
    }

    public static boolean a() {
        return DictationAsr.B() && mp.g1().getBoolean("asr_live_captions", false);
    }
}
