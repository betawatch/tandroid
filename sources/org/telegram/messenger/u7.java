package org.telegram.messenger;

import android.os.SystemClock;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class u7 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ TLRPC.Document b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ w7 e;

    public u7(w7 w7Var, Object obj, TLRPC.Document document, String str, int i7) {
        this.e = w7Var;
        this.a = obj;
        this.b = document;
        this.c = str;
        this.d = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r6 > r8) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(i7 i7Var, long j3, long j10) {
        int i7;
        qb qbVar = this.e.E;
        if (qbVar != null) {
            gc gcVar = qbVar.b;
            String str = this.c;
            gcVar.u.put(str, new long[]{j3, j10});
            if (!gcVar.h.isEmpty() && (i7 = i7Var.J) > 0) {
                long j11 = i7;
                if (i7Var.a0 > j11) {
                    ArrayList arrayList = i7Var.M;
                    if (arrayList != null) {
                        long j12 = Long.MAX_VALUE;
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            try {
                                j12 = Math.min(j12, ((g7) arrayList.get(i10)).a);
                            } catch (Throwable th2) {
                                a8.g(th2, true);
                            }
                        }
                    }
                    gcVar.s.c(new ng(qbVar, str, i7Var, 25));
                }
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j13 = i7Var.L;
            if (j13 == 0 || j13 < elapsedRealtime - 500 || j3 == 0) {
                i7Var.L = elapsedRealtime;
                g0.h3(new lb(qbVar.a, j3, j10, str));
            }
        }
    }

    public final void b(i7 i7Var, int i7) {
        int i10;
        Object obj = this.a;
        w7 w7Var = this.e;
        ConcurrentHashMap concurrentHashMap = w7Var.x;
        String str = this.c;
        concurrentHashMap.remove(str);
        w7.J.d(new ng(w7Var, i7Var.e1, i7Var, 23), 0L);
        qb qbVar = w7Var.E;
        if (qbVar != null) {
            qbVar.b.u.remove(str);
            i10 = i7;
            g0.h3(new l2.a0(qbVar, str, i10, qbVar.a, 1));
        } else {
            i10 = i7;
        }
        if (this.b == null || !(obj instanceof ij) || i10 != 0) {
            if (i10 == -1) {
                LaunchActivity.D(2);
            }
        } else {
            z5 downloadController = w7Var.getDownloadController();
            ij ijVar = (ij) obj;
            downloadController.getClass();
            g0.h3(new k7(downloadController, ijVar, i10, 2));
            downloadController.getMessagesStorage().a.c(new v5(downloadController, ijVar, 2));
        }
    }

    public final void c(i7 i7Var, File file) {
        Object obj = this.a;
        w7 w7Var = this.e;
        if (!i7Var.y && i7Var.z) {
            w7.J.d(new ng(w7Var, i7Var.e1, i7Var, 23), 0L);
            return;
        }
        e8 E = w7.E(obj);
        if (E != null) {
            f8 f8Var = w7Var.getFileLoader().d;
            f8Var.getClass();
            if (file != null) {
                f8Var.h(new ng(f8Var, file, E, 24));
            }
        }
        if (obj instanceof ij) {
            ij ijVar = (ij) obj;
            if (this.b != null && ijVar.P) {
                z5 downloadController = w7Var.getDownloadController();
                downloadController.getClass();
                if (ijVar.F0() != null) {
                    g0.h3(new u5(downloadController, ijVar.F0(), ijVar, 0));
                }
            }
        }
        if (!i7Var.y) {
            w7Var.x.remove(this.c);
            qb qbVar = w7Var.E;
            if (qbVar != null) {
                String str = this.c;
                Object obj2 = this.a;
                int i7 = this.d;
                qbVar.b.u.remove(str);
                g0.h3(new li.g0(qbVar, file, str, qbVar.a, obj2, i7));
            }
        }
        w7.J.d(new ng(w7Var, i7Var.e1, i7Var, 23), 0L);
    }
}
