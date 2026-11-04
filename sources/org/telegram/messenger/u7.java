package org.telegram.messenger;

import android.os.SystemClock;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u7 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ TLRPC.Document b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ w7 e;

    public u7(w7 w7Var, Object obj, TLRPC.Document document, String str, int i3) {
        this.e = w7Var;
        this.a = obj;
        this.b = document;
        this.c = str;
        this.d = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r6 > r8) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(i7 i7Var, long j10, long j11) {
        int i3;
        jb jbVar = this.e.F;
        if (jbVar != null) {
            zb zbVar = jbVar.b;
            String str = this.c;
            zbVar.u.put(str, new long[]{j10, j11});
            if (!zbVar.h.isEmpty() && (i3 = i7Var.J) > 0) {
                long j12 = i3;
                if (i7Var.a0 > j12) {
                    ArrayList arrayList = i7Var.M;
                    if (arrayList != null) {
                        long j13 = Long.MAX_VALUE;
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            try {
                                j13 = Math.min(j13, ((g7) arrayList.get(i10)).a);
                            } catch (Throwable th2) {
                                a8.g(th2, true);
                            }
                        }
                    }
                    zbVar.s.c(new fg(jbVar, str, i7Var, 25));
                }
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j14 = i7Var.L;
            if (j14 == 0 || j14 < elapsedRealtime - 500 || j10 == 0) {
                i7Var.L = elapsedRealtime;
                g0.h3(new eb(jbVar.a, j10, j11, str));
            }
        }
    }

    public final void b(i7 i7Var, int i3) {
        int i10;
        Object obj = this.a;
        w7 w7Var = this.e;
        ConcurrentHashMap concurrentHashMap = w7Var.x;
        String str = this.c;
        concurrentHashMap.remove(str);
        w7.K.e(new fg(w7Var, i7Var.e1, i7Var, 23), 0L);
        jb jbVar = w7Var.F;
        if (jbVar != null) {
            jbVar.b.u.remove(str);
            i10 = i3;
            g0.h3(new k2.a0(jbVar, str, i10, jbVar.a, 1));
        } else {
            i10 = i3;
        }
        if (this.b == null || !(obj instanceof zi) || i10 != 0) {
            if (i10 == -1) {
                LaunchActivity.D(2);
            }
        } else {
            z5 downloadController = w7Var.getDownloadController();
            zi ziVar = (zi) obj;
            downloadController.getClass();
            g0.h3(new k7(downloadController, ziVar, i10, 2));
            downloadController.getMessagesStorage().a.c(new v5(downloadController, ziVar, 2));
        }
    }

    public final void c(i7 i7Var, File file) {
        Object obj = this.a;
        w7 w7Var = this.e;
        if (!i7Var.y && i7Var.z) {
            w7.K.e(new fg(w7Var, i7Var.e1, i7Var, 23), 0L);
            return;
        }
        e8 E = w7.E(obj);
        if (E != null) {
            f8 f8Var = w7Var.getFileLoader().d;
            f8Var.getClass();
            if (file != null) {
                f8Var.h(new fg(f8Var, file, E, 24));
            }
        }
        if (obj instanceof zi) {
            zi ziVar = (zi) obj;
            if (this.b != null && ziVar.P) {
                z5 downloadController = w7Var.getDownloadController();
                downloadController.getClass();
                if (ziVar.F0() != null) {
                    g0.h3(new u5(downloadController, ziVar.F0(), ziVar, 0));
                }
            }
        }
        if (!i7Var.y) {
            w7Var.x.remove(this.c);
            jb jbVar = w7Var.F;
            if (jbVar != null) {
                String str = this.c;
                Object obj2 = this.a;
                int i3 = this.d;
                jbVar.b.u.remove(str);
                g0.h3(new mi.g0(jbVar, file, str, jbVar.a, obj2, i3));
            }
        }
        w7.K.e(new fg(w7Var, i7Var.e1, i7Var, 23), 0L);
    }
}
