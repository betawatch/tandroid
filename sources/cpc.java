// default package

import android.content.SharedPreferences;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import java.io.File;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.utils.twidget.x;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class cpc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cpc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:201:0x02fb, code lost:
    
        if ((r10 - r8.p) < (r14 ? 16 : 33)) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (r2.l != false) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0512 A[Catch: all -> 0x052a, TRY_LEAVE, TryCatch #7 {all -> 0x052a, blocks: (B:207:0x050b, B:209:0x0512), top: B:206:0x050b }] */
    /* JADX WARN: Removed duplicated region for block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c9  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v32, types: [org.telegram.tgnet.tl.TL_bots$getProfileWidgetPublicData] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ?? r2;
        boolean z;
        epc epcVar;
        nm3 nm3Var;
        boolean z2;
        boolean z3;
        txc txcVar;
        TLRPC.TL_messages_getWidgetPublicData tL_messages_getWidgetPublicData;
        epc epcVar2 = null;
        byte b = 1;
        ?? r7 = 1;
        switch (this.a) {
            case 0:
                dpc dpcVar = (dpc) this.b;
                fpc[] fpcVarArr = dpcVar.f;
                try {
                    try {
                    } catch (RuntimeException e) {
                        e = e;
                        r2 = false;
                        z = true;
                    }
                    if (fpcVarArr.length != 0) {
                        if (dpcVar.m == null) {
                            try {
                                dpcVar.a();
                            } catch (RuntimeException e2) {
                                e = e2;
                                r2 = false;
                                z = true;
                                try {
                                    fc4.g(e, z);
                                    for (fpc fpcVar : fpcVarArr) {
                                        fpcVar.a.post(new cpc(fpcVar, (byte) 1));
                                    }
                                    dpcVar.g.set(false);
                                    if (r2 == false) {
                                        return;
                                    }
                                    Trace.endSection();
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    b = r2;
                                    dpcVar.g.set(false);
                                    if (b != 0) {
                                        Trace.endSection();
                                    }
                                    throw th;
                                }
                            }
                        }
                        long uptimeMillis = SystemClock.uptimeMillis();
                        int length = fpcVarArr.length;
                        int i = 0;
                        boolean z4 = false;
                        boolean z5 = false;
                        while (i < length) {
                            fpc fpcVar2 = fpcVarArr[i];
                            long j = r3;
                            epc epcVar3 = fpcVar2.e;
                            if (fpcVar2.c && epcVar3 != null) {
                                boolean z6 = epcVar3.c;
                                z5 |= z6;
                                if (!z6) {
                                    epcVar2 = epcVar3;
                                }
                            }
                            boolean z7 = z4 | ((!fpcVar2.c || fpcVar2.d || epcVar3 == null) ? false : true);
                            i++;
                            r3 = j;
                            z4 = z7;
                        }
                        long j2 = r3;
                        if (!z4) {
                            break;
                        }
                        Trace.beginSection(z5 ? "WalletTextures.dragBatch" : "WalletTextures.idleBatch");
                        try {
                            float min = dpcVar.p == j2 ? 0.0f : Math.min(0.1f, (uptimeMillis - r3) / 1000.0f);
                            dpcVar.p = uptimeMillis;
                            EGLDisplay eGLDisplay = dpcVar.i;
                            EGLSurface eGLSurface = dpcVar.k;
                            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, dpcVar.j);
                            if (epcVar2 != null) {
                                try {
                                    long j3 = dpcVar.q;
                                    if (j3 == j2 || uptimeMillis - j3 >= 33) {
                                        nm3 nm3Var2 = dpcVar.m;
                                        int i2 = dpcVar.c;
                                        nm3Var2.c(i2, i2, epcVar2.a, epcVar2.b, 0.0f, j3 == j2 ? 0.0f : (uptimeMillis - j3) / 1000.0f, 1.0f, 0.0f, true);
                                        dpcVar.q = uptimeMillis;
                                        dpcVar.r++;
                                    }
                                } catch (RuntimeException e3) {
                                    e = e3;
                                    z = true;
                                    r2 = true;
                                    fc4.g(e, z);
                                    while (r1 < r0) {
                                    }
                                    dpcVar.g.set(false);
                                    if (r2 == false) {
                                    }
                                    Trace.endSection();
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    dpcVar.g.set(false);
                                    if (b != 0) {
                                    }
                                    throw th;
                                }
                            }
                            int length2 = fpcVarArr.length;
                            int i3 = 0;
                            boolean z8 = false;
                            boolean z9 = false;
                            while (i3 < length2) {
                                fpc fpcVar3 = fpcVarArr[i3];
                                if (fpcVar3.c && ((epcVar = fpcVar3.e) != null || !fpcVar3.i)) {
                                    EGLSurface eGLSurface2 = fpcVar3.h;
                                    if (eGLSurface2 == EGL14.EGL_NO_SURFACE) {
                                        eGLSurface2 = EGL14.eglCreateWindowSurface(dpcVar.i, dpcVar.l, fpcVar3.b, new int[]{12344}, 0);
                                        fpcVar3.h = eGLSurface2;
                                        if (eGLSurface2 == EGL14.EGL_NO_SURFACE) {
                                            if (fpcVar3.c) {
                                                throw new IllegalStateException("Wallet EGL window failed");
                                            }
                                        }
                                    }
                                    if (EGL14.eglMakeCurrent(dpcVar.i, eGLSurface2, eGLSurface2, dpcVar.j)) {
                                        EGL14.eglSwapInterval(dpcVar.i, 0);
                                        if (EGL14.eglQuerySurface(dpcVar.i, fpcVar3.h, 12375, dpcVar.h, 0) && EGL14.eglQuerySurface(dpcVar.i, fpcVar3.h, 12374, dpcVar.h, r7)) {
                                            int i4 = fpcVar3.f;
                                            int[] iArr = dpcVar.h;
                                            int i5 = iArr[0];
                                            boolean z10 = (i4 == i5 && fpcVar3.g == iArr[r7]) ? false : r7;
                                            fpcVar3.f = i5;
                                            fpcVar3.g = iArr[r7];
                                            if (epcVar == null) {
                                                if (fpcVar3.i) {
                                                    continue;
                                                } else {
                                                    GLES20.glBindFramebuffer(36160, 0);
                                                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                                                    GLES20.glClear(TLObject.FLAG_14);
                                                    if (!EGL14.eglSwapBuffers(dpcVar.i, fpcVar3.h) && fpcVar3.c) {
                                                        throw new IllegalStateException("Wallet EGL swap failed");
                                                    }
                                                    fpcVar3.i = r7;
                                                }
                                            } else if (z10 || epcVar.c || fpcVar3.j || fpcVar3.i || fpcVar3.k != dpcVar.r || fpcVar3.l != 1.0f) {
                                                nm3 nm3Var3 = dpcVar.m;
                                                z8 = z8;
                                                z9 = z9;
                                                if (epcVar.c) {
                                                    if (epcVar.d) {
                                                        nm3Var = dpcVar.n;
                                                        nm3Var.c(378, 378, epcVar.a, epcVar.b, 0.0f, z8 ? 0.0f : min, 1.0f, 0.0f, true);
                                                        z3 = r7;
                                                        z2 = z9;
                                                    } else {
                                                        nm3 nm3Var4 = dpcVar.o;
                                                        if (nm3Var4 == null) {
                                                            nm3Var4 = new nm3(dpcVar.a, 2);
                                                            nm3Var4.C = dpcVar.d;
                                                            dpcVar.o = nm3Var4;
                                                        }
                                                        nm3Var = nm3Var4;
                                                        int i6 = dpcVar.c;
                                                        nm3Var.c(i6, i6, epcVar.a, epcVar.b, 0.0f, z9 ? 0.0f : min, 1.0f, 0.0f, true);
                                                        z2 = r7;
                                                        z3 = z8;
                                                    }
                                                    nm3Var3 = nm3Var;
                                                    z8 = z3;
                                                    z9 = z2;
                                                }
                                                nm3Var3.d(1.0f, 0.0f, fpcVar3.f, fpcVar3.g);
                                                if (!EGL14.eglSwapBuffers(dpcVar.i, fpcVar3.h) && fpcVar3.c) {
                                                    throw new IllegalStateException("Wallet EGL swap failed");
                                                }
                                                fpcVar3.i = false;
                                                fpcVar3.k = dpcVar.r;
                                                fpcVar3.l = 1.0f;
                                                fpcVar3.j = epcVar.c;
                                                fpcVar3.d = true;
                                            }
                                        } else if (fpcVar3.c) {
                                            throw new IllegalStateException("Wallet EGL surface size failed");
                                        }
                                    } else if (fpcVar3.c) {
                                        throw new IllegalStateException("Wallet EGL makeCurrent failed");
                                    }
                                }
                                i3++;
                                r7 = 1;
                                z8 = z8;
                                z9 = z9;
                            }
                            dpcVar.g.set(false);
                        } catch (RuntimeException e4) {
                            e = e4;
                            z = true;
                            r2 = true;
                        } catch (Throwable th3) {
                            th = th3;
                            b = 1;
                        }
                        Trace.endSection();
                        return;
                    }
                    dpcVar.g.set(false);
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    b = 0;
                }
                break;
            case 1:
                fpc fpcVar4 = (fpc) this.b;
                gpc gpcVar = fpcVar4.a;
                if (gpcVar.e == fpcVar4) {
                    gpcVar.n = false;
                    gpcVar.a();
                    return;
                }
                return;
            case 2:
                ((WalletEngine2) this.b).lambda$close$56();
                return;
            case 3:
                xqc xqcVar = (xqc) this.b;
                boolean z11 = xqcVar.h != -1;
                if (!z11 && !xqcVar.s) {
                    xqcVar.c = xqcVar.c();
                    xqcVar.d = 0.0f;
                }
                boolean z12 = z11 || xqcVar.s || xqcVar.e > 1.001f;
                lmc lmcVar = xqcVar.b;
                float f = xqcVar.c;
                float f2 = xqcVar.d;
                lmcVar.r = f;
                lmcVar.s = f2;
                lmcVar.w = z12;
                lmcVar.x = z12;
                return;
            case 4:
                drc drcVar = (drc) this.b;
                drcVar.removeSelfFromStack();
                Runnable runnable = drcVar.f;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 5:
                ((rj) this.b).requestLayout();
                return;
            case 6:
                ((hsc) this.b).Z();
                return;
            case 7:
                SharedPreferences sharedPreferences = (SharedPreferences) this.b;
                try {
                    File h = a.h();
                    String[] list = h.list();
                    if (list != null) {
                        for (String str : list) {
                            if (usc.a.matcher(str).matches()) {
                                new File(h, str).delete();
                            }
                        }
                    }
                    File file = new File(h, "rasterized/wallpaper");
                    File[] listFiles = file.listFiles();
                    if (listFiles != null) {
                        for (File file2 : listFiles) {
                            file2.delete();
                        }
                    }
                    file.delete();
                    sharedPreferences.edit().putInt("wallpaperFilesCleanup", 1).apply();
                    return;
                } catch (Throwable th5) {
                    fc4.g(th5, true);
                    return;
                }
            case 8:
                ((WallpapersListActivity) this.b).E0(false);
                return;
            case 9:
                ((foc) this.b).invalidateSelf();
                return;
            case 10:
                uuc uucVar = (uuc) this.b;
                File databasePath = a.b.getDatabasePath("webview.db");
                long length3 = (databasePath == null || !databasePath.exists()) ? 0L : databasePath.length();
                File databasePath2 = a.b.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    length3 += databasePath2.length();
                }
                File file3 = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                if (file3.exists()) {
                    length3 += uuc.e0(file3, Boolean.FALSE);
                }
                File file4 = new File(a.b.getApplicationInfo().dataDir, "cache/WebView");
                if (file4.exists()) {
                    length3 += uuc.e0(file4, null);
                }
                long j4 = length3;
                File file5 = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                gm.c3(new w30(uucVar, j4, file5.exists() ? uuc.e0(file5, Boolean.TRUE) : 0L, (byte) 5));
                return;
            case 11:
                ((tvc) ((tr5) ((fb) this.b).b).b).w.c();
                return;
            case 12:
                ((pvc) this.b).d(false, true);
                return;
            case 13:
                vvc vvcVar = (vvc) this.b;
                gm.d3(new uvc(vvcVar.a, vvcVar.b, b), 500L);
                return;
            case 14:
                wxc.s((txc) this.b);
                return;
            case 15:
                vxc vxcVar = (vxc) this.b;
                int i7 = vxcVar.a;
                long j5 = vxcVar.c;
                for (txc txcVar2 : wxc.a.values()) {
                    if (txcVar2.b == i7 && !txcVar2.k && txcVar2.z != 0) {
                        if (j5 != 0) {
                            txcVar = (txcVar2.o && txcVar2.n == j5) ? txcVar2 : null;
                        } else if (txcVar2.l == vxcVar.b && txcVar2.d > 0) {
                        }
                        if (txcVar != null) {
                            wxc.F();
                            return;
                        }
                        int i8 = txcVar.b;
                        if (j5 != 0) {
                            ?? getprofilewidgetpublicdata = new TL_bots.getProfileWidgetPublicData();
                            getprofilewidgetpublicdata.bot = oc7.r1(i8).n1(j5);
                            getprofilewidgetpublicdata.hash = vxcVar.d;
                            tL_messages_getWidgetPublicData = getprofilewidgetpublicdata;
                        } else {
                            TLRPC.TL_messages_getWidgetPublicData tL_messages_getWidgetPublicData2 = new TLRPC.TL_messages_getWidgetPublicData();
                            tL_messages_getWidgetPublicData2.peer = oc7.r1(i8).i1(txcVar.c);
                            tL_messages_getWidgetPublicData2.msg_id = txcVar.d;
                            tL_messages_getWidgetPublicData2.hash = vxcVar.d;
                            tL_messages_getWidgetPublicData = tL_messages_getWidgetPublicData2;
                        }
                        vxcVar.f = ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getWidgetPublicData, new go9(vxcVar, (byte) 28));
                        return;
                    }
                }
                if (txcVar != null) {
                }
                break;
            case 16:
                zxc zxcVar = (zxc) this.b;
                synchronized (zxcVar.E.a) {
                    if (!zxcVar.n && zxcVar.e <= 0) {
                        if (zxcVar.E.r() <= 1) {
                            x xVar = zxcVar.E;
                            if (xVar.k) {
                                break;
                            }
                        }
                        zxcVar.E.o(zxcVar);
                        zxcVar.E.u();
                        return;
                    }
                    return;
                }
            case 17:
                o0d o0dVar = (o0d) this.b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + o0dVar.a.getAction() + " finishing.");
                o0dVar.b.trySetResult(null);
                return;
            default:
                e7a e7aVar = (e7a) this.b;
                ((mq9) e7aVar.d).f(new lcc(e7aVar, (byte) 17));
                return;
        }
    }
}
