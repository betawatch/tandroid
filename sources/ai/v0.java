package ai;

import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ File b;

    public /* synthetic */ v0(File file, int i7) {
        this.a = i7;
        this.b = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch e10;
        switch (this.a) {
            case 0:
                File file = this.b;
                ExecutorService executorService = DictationLid.a;
                SharedPreferences e12 = np.e1();
                long[] jArr = {0};
                try {
                    if (j1.d() && (e10 = j1.e()) != null) {
                        try {
                            e10.await(20000L, TimeUnit.MILLISECONDS);
                        } catch (InterruptedException unused) {
                        }
                    }
                    TLRPC.TL_transcriptionModel f10 = j1.f(j1.a(), "tinylid");
                    if (f10 == null && !file.exists()) {
                        Log.d("Dictation", "tinylid: not on the server");
                    }
                    int c10 = j1.c(f10, file, new a1.c(jArr, 8));
                    if (c10 >= 0) {
                        e12.edit().putLong("tinylid_checked", System.currentTimeMillis()).apply();
                    }
                    if (c10 > 0) {
                        DictationLid.e = true;
                        DictationLid.g = true;
                        DictationLid.a.execute(new v0(file, 2));
                    }
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            case 1:
                DictationLid.g(this.b);
                return;
            default:
                DictationLid.g(this.b);
                return;
        }
    }
}
