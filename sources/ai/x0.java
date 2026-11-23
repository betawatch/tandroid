package ai;

import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ File b;

    public /* synthetic */ x0(File file, int i7) {
        this.a = i7;
        this.b = file;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        if (r6 != false) goto L32;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int c10;
        switch (this.a) {
            case 0:
                File file = this.b;
                ExecutorService executorService = DictationLid.a;
                SharedPreferences g12 = np.g1();
                boolean z10 = true;
                long[] jArr = {0};
                try {
                    CountDownLatch e10 = m1.e();
                    if (e10 != null) {
                        try {
                            e10.await(20000L, TimeUnit.MILLISECONDS);
                        } catch (InterruptedException unused) {
                        }
                    }
                    TLRPC.TL_transcriptionModel f10 = m1.f(m1.a(), "tinylid");
                    if (f10 == null && !file.exists()) {
                        Log.d("Dictation", "tinylid: not on the server");
                    }
                    if (m1.i(f10, file)) {
                        Log.d("Dictation", "tinylid: a newer model on the server, updating");
                    }
                    c10 = m1.c(f10, file, true, new a1.c(jArr, 8));
                    if (c10 >= 0) {
                        g12.edit().putLong("tinylid_checked", System.currentTimeMillis()).apply();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z10 = false;
                }
                if (c10 > 0) {
                    DictationLid.e = true;
                    DictationLid.g = true;
                    try {
                        DictationLid.a.execute(new x0(file, 2));
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            Log.d("Dictation", "tinylid: download failed: " + th);
                            break;
                        } catch (Throwable th4) {
                            if (!z10) {
                                DictationLid.h = false;
                            }
                            DictationLid.f = false;
                            DictationLid.h();
                            DictationAsr.G("tinylid.bin");
                            throw th4;
                        }
                    }
                    DictationLid.f = false;
                    DictationLid.h();
                    DictationAsr.G("tinylid.bin");
                    return;
                }
                DictationLid.h = false;
                DictationLid.f = false;
                DictationLid.h();
                DictationAsr.G("tinylid.bin");
                return;
            case 1:
                DictationLid.g(this.b);
                return;
            default:
                DictationLid.g(this.b);
                DictationLid.h = false;
                DictationLid.h();
                return;
        }
    }
}
