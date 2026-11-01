package org.telegram.messenger;

import android.os.SystemClock;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class z7 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ TLRPC.Document b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ b8 e;

    public z7(b8 b8Var, Object obj, TLRPC.Document document, String str, int i10) {
        this.e = b8Var;
        this.a = obj;
        this.b = document;
        this.c = str;
        this.d = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r6 > r8) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(m7 m7Var, long j10, long j11) {
        int i10;
        sb sbVar = this.e.E;
        if (sbVar != null) {
            ic icVar = sbVar.b;
            String str = this.c;
            icVar.u.put(str, new long[]{j10, j11});
            if (!icVar.h.isEmpty() && (i10 = m7Var.J) > 0) {
                long j12 = i10;
                if (m7Var.a0 > j12) {
                    ArrayList arrayList = m7Var.M;
                    if (arrayList != null) {
                        long j13 = Long.MAX_VALUE;
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            try {
                                j13 = Math.min(j13, ((k7) arrayList.get(i11)).a);
                            } catch (Throwable th2) {
                                f8.g(th2, true);
                            }
                        }
                    }
                    icVar.s.c(new ng(sbVar, str, m7Var, 25));
                }
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j14 = m7Var.L;
            if (j14 == 0 || j14 < elapsedRealtime - 500 || j10 == 0) {
                m7Var.L = elapsedRealtime;
                i0.g3(new mb(sbVar.a, j10, j11, str));
            }
        }
    }

    public final void b(m7 m7Var, int i10) {
        int i11;
        Object obj = this.a;
        b8 b8Var = this.e;
        ConcurrentHashMap concurrentHashMap = b8Var.x;
        String str = this.c;
        concurrentHashMap.remove(str);
        b8.J.d(new ng(b8Var, m7Var.e1, m7Var, 23), 0L);
        sb sbVar = b8Var.E;
        if (sbVar != null) {
            sbVar.b.u.remove(str);
            i11 = i10;
            i0.g3(new i2.a0(sbVar, str, i11, sbVar.a, 1));
        } else {
            i11 = i10;
        }
        if (this.b == null || !(obj instanceof kj) || i11 != 0) {
            if (i11 == -1) {
                LaunchActivity.D(2);
            }
        } else {
            b6 downloadController = b8Var.getDownloadController();
            kj kjVar = (kj) obj;
            downloadController.getClass();
            i0.g3(new o7(downloadController, kjVar, i11, 2));
            downloadController.getMessagesStorage().a.c(new x5(downloadController, kjVar, 2));
        }
    }

    public final void c(m7 m7Var, File file) {
        Object obj = this.a;
        b8 b8Var = this.e;
        if (!m7Var.y && m7Var.z) {
            b8.J.d(new ng(b8Var, m7Var.e1, m7Var, 23), 0L);
            return;
        }
        j8 E = b8.E(obj);
        if (E != null) {
            k8 k8Var = b8Var.getFileLoader().d;
            k8Var.getClass();
            if (file != null) {
                k8Var.h(new ng(k8Var, file, E, 24));
            }
        }
        if (obj instanceof kj) {
            kj kjVar = (kj) obj;
            if (this.b != null && kjVar.P) {
                b6 downloadController = b8Var.getDownloadController();
                downloadController.getClass();
                if (kjVar.F0() != null) {
                    i0.g3(new w5(downloadController, kjVar.F0(), kjVar, 0));
                }
            }
        }
        if (!m7Var.y) {
            b8Var.x.remove(this.c);
            sb sbVar = b8Var.E;
            if (sbVar != null) {
                String str = this.c;
                Object obj2 = this.a;
                int i10 = this.d;
                sbVar.b.u.remove(str);
                i0.g3(new bi.k0(sbVar, file, str, sbVar.a, obj2, i10));
            }
        }
        b8.J.d(new ng(b8Var, m7Var.e1, m7Var, 23), 0L);
    }
}
