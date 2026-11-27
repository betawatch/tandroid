// default package

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.a;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.utils.twidget.x;
import org.webrtc.SurfaceTextureHelper;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class olc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ olc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a() {
        d3d d3dVar = (d3d) this.b;
        Log.w("FirebaseMessaging", "Service took too long to process intent: " + d3dVar.a.getAction() + " finishing.");
        d3dVar.b.trySetResult(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:202:0x02d7, code lost:
    
        if ((r11 - r9.p) < (r15 ? 16 : 33)) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (r2.l != false) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04f4 A[Catch: all -> 0x050d, TRY_LEAVE, TryCatch #7 {all -> 0x050d, blocks: (B:208:0x04ed, B:210:0x04f4), top: B:207:0x04ed }] */
    /* JADX WARN: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r4v31, types: [org.telegram.tgnet.tl.TL_bots$getProfileWidgetPublicData] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v6 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        View d;
        ?? r16;
        boolean z;
        qrc qrcVar;
        ul3 ul3Var;
        boolean z2;
        boolean z3;
        h0d h0dVar;
        TLRPC.TL_messages_getWidgetPublicData tL_messages_getWidgetPublicData;
        qrc qrcVar2 = null;
        byte b = 1;
        ?? r8 = 1;
        switch (this.a) {
            case 0:
                sr9 sr9Var = (sr9) this.b;
                sr9Var.a.clear();
                SurfaceTextureHelper surfaceTextureHelper = sr9Var.b;
                if (surfaceTextureHelper != null) {
                    surfaceTextureHelper.stopListening();
                    sr9Var.b.dispose();
                    sr9Var.b = null;
                }
                Surface surface = sr9Var.c;
                if (surface != null) {
                    surface.release();
                    sr9Var.c = null;
                    return;
                }
                return;
            case 1:
                VoIPService.lambda$updateBluetoothHeadsetState$110((VoipAudioManager) this.b);
                return;
            case 2:
                TextView[] textViewArr = ((emc) this.b).a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 3:
                TextView[] textViewArr2 = ((emc) ((wa2) this.b).e).a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 4:
                imc imcVar = (imc) this.b;
                if (imcVar.getVisibility() == 0) {
                    imcVar.a();
                    return;
                }
                return;
            case 5:
                rmc rmcVar = (rmc) this.b;
                rmcVar.e = Bitmap.createBitmap(rmcVar.getMeasuredWidth(), rmcVar.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(rmcVar.e).drawText(rmcVar.d, rmcVar.getMeasuredWidth() / 2, (int) ((rmcVar.getMeasuredHeight() / 2) - ((rmcVar.a.ascent() + rmcVar.a.descent()) / 2.0f)), rmcVar.a);
                rmcVar.postInvalidate();
                return;
            case 6:
                vnc vncVar = (vnc) this.b;
                if (vncVar.q0) {
                    return;
                }
                vncVar.setVisibility(8);
                vncVar.s();
                vnc vncVar2 = vncVar.a.h;
                if (vncVar2 != null) {
                    hl.B2(vncVar2);
                    Log.d("VoiceLive", "overlay removed");
                    return;
                }
                return;
            case 7:
                qqc qqcVar = (qqc) this.b;
                wa waVar = qqcVar.c;
                if (waVar == null || waVar.getScrollState() != 0) {
                    return;
                }
                q9c q0 = qqcVar.j.q0();
                if ((q0 == null || q0.getScrollState() == 0) && (d = qqcVar.d(qqcVar.c.f3)) != null) {
                    x46 x46Var = qqcVar.c.f3;
                    x46Var.getClass();
                    int i = new int[]{0, q79.y(d) - x46Var.E()}[1];
                    if (i != 0) {
                        qqcVar.c.y0(0, i, null);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                vl4 vl4Var = (vl4) this.b;
                sy8 sy8Var = (sy8) vl4Var.b;
                ry8 ry8Var = (ry8) vl4Var.c;
                if (ry8Var != null) {
                    sy8Var.a(ry8Var);
                    sy8Var.D = 0.0f;
                    vl4Var.c = null;
                    vl4Var.invalidate();
                    return;
                }
                return;
            case 9:
                prc prcVar = (prc) this.b;
                rrc[] rrcVarArr = prcVar.f;
                try {
                    try {
                    } catch (Throwable th) {
                        th = th;
                        b = 0;
                    }
                } catch (RuntimeException e) {
                    e = e;
                    r16 = false;
                    z = true;
                }
                if (rrcVarArr.length != 0) {
                    if (prcVar.m == null) {
                        try {
                            prcVar.a();
                        } catch (RuntimeException e2) {
                            e = e2;
                            r16 = false;
                            z = true;
                            try {
                                cc4.g(e, z);
                                for (rrc rrcVar : rrcVarArr) {
                                    rrcVar.a.post(new olc(rrcVar, (byte) 10));
                                }
                                prcVar.g.set(false);
                                if (r16 == false) {
                                    return;
                                }
                                Trace.endSection();
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                b = r16;
                                prcVar.g.set(false);
                                if (b != 0) {
                                    Trace.endSection();
                                }
                                throw th;
                            }
                        }
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    int length = rrcVarArr.length;
                    int i2 = 0;
                    boolean z4 = false;
                    boolean z5 = false;
                    while (i2 < length) {
                        long j = r4;
                        rrc rrcVar2 = rrcVarArr[i2];
                        qrc qrcVar3 = rrcVar2.e;
                        if (rrcVar2.c && qrcVar3 != null) {
                            boolean z6 = qrcVar3.c;
                            z5 |= z6;
                            if (!z6) {
                                qrcVar2 = qrcVar3;
                            }
                        }
                        boolean z7 = (!rrcVar2.c || rrcVar2.d || qrcVar3 == null) ? false : true;
                        i2++;
                        r4 = j;
                        z4 |= z7;
                    }
                    long j2 = r4;
                    if (!z4) {
                        break;
                    }
                    Trace.beginSection(z5 ? "WalletTextures.dragBatch" : "WalletTextures.idleBatch");
                    try {
                        float min = prcVar.p == j2 ? 0.0f : Math.min(0.1f, (uptimeMillis - r4) / 1000.0f);
                        prcVar.p = uptimeMillis;
                        EGLDisplay eGLDisplay = prcVar.i;
                        EGLSurface eGLSurface = prcVar.k;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, prcVar.j);
                        if (qrcVar2 != null) {
                            try {
                                long j3 = prcVar.q;
                                if (j3 == j2 || uptimeMillis - j3 >= 33) {
                                    ul3 ul3Var2 = prcVar.m;
                                    int i3 = prcVar.c;
                                    ul3Var2.c(i3, i3, qrcVar2.a, qrcVar2.b, 0.0f, j3 == j2 ? 0.0f : (uptimeMillis - j3) / 1000.0f, 1.0f, 0.0f, true);
                                    prcVar.q = uptimeMillis;
                                    prcVar.r++;
                                }
                            } catch (RuntimeException e3) {
                                e = e3;
                                z = true;
                                r16 = true;
                                cc4.g(e, z);
                                while (r1 < r0) {
                                }
                                prcVar.g.set(false);
                                if (r16 == false) {
                                }
                                Trace.endSection();
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                prcVar.g.set(false);
                                if (b != 0) {
                                }
                                throw th;
                            }
                        }
                        int length2 = rrcVarArr.length;
                        int i4 = 0;
                        boolean z8 = false;
                        boolean z9 = false;
                        while (i4 < length2) {
                            rrc rrcVar3 = rrcVarArr[i4];
                            if (rrcVar3.c && ((qrcVar = rrcVar3.e) != null || !rrcVar3.i)) {
                                EGLSurface eGLSurface2 = rrcVar3.h;
                                if (eGLSurface2 == EGL14.EGL_NO_SURFACE) {
                                    eGLSurface2 = EGL14.eglCreateWindowSurface(prcVar.i, prcVar.l, rrcVar3.b, new int[]{12344}, 0);
                                    rrcVar3.h = eGLSurface2;
                                    if (eGLSurface2 == EGL14.EGL_NO_SURFACE) {
                                        if (rrcVar3.c) {
                                            throw new IllegalStateException("Wallet EGL window failed");
                                        }
                                    }
                                }
                                if (EGL14.eglMakeCurrent(prcVar.i, eGLSurface2, eGLSurface2, prcVar.j)) {
                                    EGL14.eglSwapInterval(prcVar.i, 0);
                                    if (EGL14.eglQuerySurface(prcVar.i, rrcVar3.h, 12375, prcVar.h, 0) && EGL14.eglQuerySurface(prcVar.i, rrcVar3.h, 12374, prcVar.h, r8)) {
                                        int i5 = rrcVar3.f;
                                        int[] iArr = prcVar.h;
                                        int i6 = iArr[0];
                                        boolean z10 = (i5 == i6 && rrcVar3.g == iArr[r8]) ? false : r8;
                                        rrcVar3.f = i6;
                                        rrcVar3.g = iArr[r8];
                                        if (qrcVar == null) {
                                            if (rrcVar3.i) {
                                                continue;
                                            } else {
                                                GLES20.glBindFramebuffer(36160, 0);
                                                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                                                GLES20.glClear(TLObject.FLAG_14);
                                                if (!EGL14.eglSwapBuffers(prcVar.i, rrcVar3.h) && rrcVar3.c) {
                                                    throw new IllegalStateException("Wallet EGL swap failed");
                                                }
                                                rrcVar3.i = r8;
                                            }
                                        } else if (z10 || qrcVar.c || rrcVar3.j || rrcVar3.i || rrcVar3.k != prcVar.r || rrcVar3.l != 1.0f) {
                                            ul3 ul3Var3 = prcVar.m;
                                            z8 = z8;
                                            z9 = z9;
                                            if (qrcVar.c) {
                                                if (qrcVar.d) {
                                                    ul3Var = prcVar.n;
                                                    ul3Var.c(378, 378, qrcVar.a, qrcVar.b, 0.0f, z8 ? 0.0f : min, 1.0f, 0.0f, true);
                                                    z3 = r8;
                                                    z2 = z9;
                                                } else {
                                                    ul3 ul3Var4 = prcVar.o;
                                                    if (ul3Var4 == null) {
                                                        ul3Var4 = new ul3(prcVar.a, 2);
                                                        ul3Var4.C = prcVar.d;
                                                        prcVar.o = ul3Var4;
                                                    }
                                                    ul3Var = ul3Var4;
                                                    int i7 = prcVar.c;
                                                    ul3Var.c(i7, i7, qrcVar.a, qrcVar.b, 0.0f, z9 ? 0.0f : min, 1.0f, 0.0f, true);
                                                    z2 = r8;
                                                    z3 = z8;
                                                }
                                                ul3Var3 = ul3Var;
                                                z8 = z3;
                                                z9 = z2;
                                            }
                                            ul3Var3.d(1.0f, 0.0f, rrcVar3.f, rrcVar3.g);
                                            if (!EGL14.eglSwapBuffers(prcVar.i, rrcVar3.h) && rrcVar3.c) {
                                                throw new IllegalStateException("Wallet EGL swap failed");
                                            }
                                            rrcVar3.i = false;
                                            rrcVar3.k = prcVar.r;
                                            rrcVar3.l = 1.0f;
                                            rrcVar3.j = qrcVar.c;
                                            rrcVar3.d = true;
                                        }
                                    } else if (rrcVar3.c) {
                                        throw new IllegalStateException("Wallet EGL surface size failed");
                                    }
                                } else if (rrcVar3.c) {
                                    throw new IllegalStateException("Wallet EGL makeCurrent failed");
                                }
                            }
                            i4++;
                            r8 = 1;
                            z8 = z8;
                            z9 = z9;
                        }
                        prcVar.g.set(false);
                    } catch (RuntimeException e4) {
                        e = e4;
                        z = true;
                        r16 = true;
                    } catch (Throwable th4) {
                        th = th4;
                        b = 1;
                    }
                    Trace.endSection();
                    return;
                }
                prcVar.g.set(false);
                return;
            case 10:
                rrc rrcVar4 = (rrc) this.b;
                src srcVar = rrcVar4.a;
                if (srcVar.e == rrcVar4) {
                    srcVar.n = false;
                    srcVar.a();
                    return;
                }
                return;
            case 11:
                ((WalletEngine2) this.b).lambda$close$56();
                return;
            case 12:
                itc itcVar = (itc) this.b;
                boolean z11 = itcVar.h != -1;
                if (!z11 && !itcVar.s) {
                    itcVar.c = itcVar.c();
                    itcVar.d = 0.0f;
                }
                boolean z12 = z11 || itcVar.s || itcVar.e > 1.001f;
                yoc yocVar = itcVar.b;
                float f = itcVar.c;
                float f2 = itcVar.d;
                yocVar.r = f;
                yocVar.s = f2;
                yocVar.w = z12;
                yocVar.x = z12;
                return;
            case 13:
                ntc ntcVar = (ntc) this.b;
                ntcVar.removeSelfFromStack();
                Runnable runnable = ntcVar.f;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 14:
                ((si) this.b).requestLayout();
                return;
            case 15:
                ((tuc) this.b).Y();
                return;
            case 16:
                SharedPreferences sharedPreferences = (SharedPreferences) this.b;
                try {
                    File h = a.h();
                    String[] list = h.list();
                    if (list != null) {
                        for (String str : list) {
                            if (gvc.a.matcher(str).matches()) {
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
                    cc4.g(th5, true);
                    return;
                }
            case 17:
                ((WallpapersListActivity) this.b).E0(false);
                return;
            case 18:
                ((tqc) this.b).invalidateSelf();
                return;
            case 19:
                ixc ixcVar = (ixc) this.b;
                File databasePath = a.b.getDatabasePath("webview.db");
                long length3 = (databasePath == null || !databasePath.exists()) ? 0L : databasePath.length();
                File databasePath2 = a.b.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    length3 += databasePath2.length();
                }
                File file3 = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                if (file3.exists()) {
                    length3 += ixc.d0(file3, Boolean.FALSE);
                }
                File file4 = new File(a.b.getApplicationInfo().dataDir, "cache/WebView");
                if (file4.exists()) {
                    length3 += ixc.d0(file4, null);
                }
                long j4 = length3;
                File file5 = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                hl.c3(new x20(ixcVar, j4, file5.exists() ? ixc.d0(file5, Boolean.TRUE) : 0L, (byte) 5));
                return;
            case 20:
                ((hyc) ((wr5) ((gb) this.b).b).b).w.c();
                return;
            case 21:
                ((dyc) this.b).d(false, true);
                return;
            case 22:
                jyc jycVar = (jyc) this.b;
                hl.d3(new iyc(jycVar.a, jycVar.b, b), 500L);
                return;
            case 23:
                k0d.s((h0d) this.b);
                return;
            case 24:
                j0d j0dVar = (j0d) this.b;
                int i8 = j0dVar.a;
                long j5 = j0dVar.c;
                for (h0d h0dVar2 : k0d.a.values()) {
                    if (h0dVar2.b == i8 && !h0dVar2.k && h0dVar2.z != 0) {
                        if (j5 != 0) {
                            h0dVar = (h0dVar2.o && h0dVar2.n == j5) ? h0dVar2 : null;
                        } else if (h0dVar2.l == j0dVar.b && h0dVar2.d > 0) {
                        }
                        if (h0dVar != null) {
                            k0d.F();
                            return;
                        }
                        int i9 = h0dVar.b;
                        if (j5 != 0) {
                            ?? getprofilewidgetpublicdata = new TL_bots.getProfileWidgetPublicData();
                            getprofilewidgetpublicdata.bot = uc7.s1(i9).o1(j5);
                            getprofilewidgetpublicdata.hash = j0dVar.d;
                            tL_messages_getWidgetPublicData = getprofilewidgetpublicdata;
                        } else {
                            TLRPC.TL_messages_getWidgetPublicData tL_messages_getWidgetPublicData2 = new TLRPC.TL_messages_getWidgetPublicData();
                            tL_messages_getWidgetPublicData2.peer = uc7.s1(i9).j1(h0dVar.c);
                            tL_messages_getWidgetPublicData2.msg_id = h0dVar.d;
                            tL_messages_getWidgetPublicData2.hash = j0dVar.d;
                            tL_messages_getWidgetPublicData = tL_messages_getWidgetPublicData2;
                        }
                        j0dVar.f = ConnectionsManager.getInstance(i8).sendRequest(tL_messages_getWidgetPublicData, new yp9(j0dVar, (byte) 28));
                        return;
                    }
                }
                if (h0dVar != null) {
                }
                break;
            case 25:
                n0d n0dVar = (n0d) this.b;
                synchronized (n0dVar.E.a) {
                    if (!n0dVar.n && n0dVar.e <= 0) {
                        if (n0dVar.E.r() <= 1) {
                            x xVar = n0dVar.E;
                            if (xVar.k) {
                                break;
                            }
                        }
                        n0dVar.E.o(n0dVar);
                        n0dVar.E.u();
                        return;
                    }
                    return;
                }
            case 26:
                a();
                return;
            default:
                u8a u8aVar = (u8a) this.b;
                ((ds9) u8aVar.d).f(new ftb(u8aVar, (byte) 27));
                return;
        }
    }
}
