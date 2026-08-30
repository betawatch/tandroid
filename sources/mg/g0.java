package mg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class g0 {
    public static Runnable c;
    public static Boolean h;
    public static final HashSet a = new HashSet();
    public static volatile boolean b = false;
    public static boolean d = true;
    public static boolean e = false;
    public static boolean f = false;
    public static boolean g = false;

    public static void a() {
        re.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.b = null;
        }
        b = false;
        e = false;
        g = false;
        c = null;
        Iterator it = a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        a.clear();
    }

    public static boolean b(View view) {
        if (b) {
            a.add(view);
        }
        return b;
    }

    public static boolean c(View... viewArr) {
        if (h == null) {
            h = Boolean.valueOf(SharedConfig.getDevicePerformanceClass() != 2);
        }
        if (!h.booleanValue()) {
            return false;
        }
        if (b) {
            a.addAll(Arrays.asList(viewArr));
        }
        return b;
    }

    public static boolean d() {
        return b || e || g;
    }
}
