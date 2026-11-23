package ai;

import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ File b;

    public /* synthetic */ t0(File file, int i7) {
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
                SharedPreferences g12 = mp.g1();
                boolean z10 = true;
                long[] jArr = {0};
                try {
                    CountDownLatch e10 = h1.e();
                    if (e10 != null) {
                        try {
                            e10.await(20000L, TimeUnit.MILLISECONDS);
                        } catch (InterruptedException unused) {
                        }
                    }
                    TLRPC.TL_transcriptionModel f10 = h1.f(h1.a(), "tinylid");
                    if (f10 == null && !file.exists()) {
                        Log.d("Dictation", "tinylid: not on the server");
                    }
                    if (h1.i(f10, file)) {
                        Log.d("Dictation", "tinylid: a newer model on the server, updating");
                    }
                    c10 = h1.c(f10, file, true, new a1.c(jArr, 8));
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
                        DictationLid.a.execute(new t0(file, 2));
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
                            DictationLid.f();
                            DictationAsr.J("tinylid.bin");
                            throw th4;
                        }
                    }
                    DictationLid.f = false;
                    DictationLid.f();
                    DictationAsr.J("tinylid.bin");
                    return;
                }
                DictationLid.h = false;
                DictationLid.f = false;
                DictationLid.f();
                DictationAsr.J("tinylid.bin");
                return;
            case 1:
                DictationLid.e(this.b);
                return;
            default:
                DictationLid.e(this.b);
                DictationLid.h = false;
                DictationLid.f();
                return;
        }
    }
}
