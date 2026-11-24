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
import android.transition.TransitionManager;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.a;
import org.telegram.messenger.voip.VoIPPendingCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.VoIPFeedbackActivity;
import org.telegram.ui.VoIPPermissionActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.webrtc.SurfaceTextureHelper;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class kbc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kbc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0120, code lost:
    
        if ((r8 - r1.p) < (r12 ? 16 : 33)) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x033f A[Catch: all -> 0x0358, TRY_LEAVE, TryCatch #3 {all -> 0x0358, blocks: (B:99:0x0338, B:101:0x033f), top: B:98:0x0338 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0362  */
    /* JADX WARN: Type inference failed for: r5v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v31 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        View d;
        boolean z;
        boolean z2;
        dnc dncVar;
        dnc dncVar2 = null;
        boolean z3 = true;
        r5 = true;
        r5 = true;
        boolean z4 = true;
        ?? r5 = 1;
        int i = 0;
        switch (this.a) {
            case 0:
                lbc lbcVar = (lbc) ((xi9) this.b).f;
                lbcVar.b0.removeCallbacksAndMessages(null);
                lbcVar.L.o(false, null);
                return;
            case 1:
                ((tbc) this.b).g = false;
                return;
            case 2:
                ((acc) this.b).a();
                return;
            case 3:
                ecc eccVar = (ecc) this.b;
                eccVar.h = 0.0f;
                km kmVar = eccVar.b;
                if (kmVar != null) {
                    kmVar.u();
                    eccVar.b = null;
                    return;
                }
                return;
            case 4:
                ((ifc) this.b).c();
                return;
            case 5:
                ((VoIPFeedbackActivity) this.b).finish();
                return;
            case 6:
                ((yfc) this.b).a.y();
                return;
            case 7:
                ((zfc) this.b).a.y();
                return;
            case 8:
                hgc hgcVar = ((xfc) this.b).b;
                hgcVar.L0.e();
                xgc.d().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                hgcVar.Z.setCornerRadius(-1.0f);
                hgcVar.d0.d.release();
                hgcVar.e0.d.release();
                hgcVar.c0.release();
                hgcVar.b();
                hgcVar.u0.d();
                xgc.T = false;
                hgcVar.E0 = false;
                hgc.m1 = null;
                ygc.b();
                return;
            case 9:
                fgc fgcVar = (fgc) this.b;
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (!fgcVar.a.n0 || VoIPService.getSharedInstance() == null) {
                        return;
                    }
                    VoIPService.getSharedInstance().requestVideoCall(false);
                    return;
                }
                return;
            case 10:
                tgc tgcVar = (tgc) this.b;
                tgcVar.e = false;
                HashMap hashMap = tgcVar.a;
                ArrayList arrayList = tgcVar.c;
                ArrayList arrayList2 = tgcVar.b;
                if (arrayList2.isEmpty() && arrayList.isEmpty()) {
                    return;
                }
                if (tgcVar.getParent() != null) {
                    TransitionManager.beginDelayedTransition(tgcVar, tgcVar.d);
                }
                int i2 = 0;
                while (i2 < arrayList2.size()) {
                    sgc sgcVar = (sgc) arrayList2.get(i2);
                    int i3 = 0;
                    while (true) {
                        if (i3 < arrayList.size()) {
                            if (sgcVar.a.equals(((sgc) arrayList.get(i3)).a)) {
                                arrayList2.remove(i2);
                                arrayList.remove(i3);
                                i2--;
                            } else {
                                i3++;
                            }
                        }
                    }
                    i2++;
                }
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    tgcVar.addView((View) arrayList2.get(i4), nme.t(-2, -2, 1, 4, 0, 0, 4));
                }
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    tgcVar.removeView((View) arrayList.get(i5));
                }
                hashMap.clear();
                while (i < tgcVar.getChildCount()) {
                    sgc sgcVar2 = (sgc) tgcVar.getChildAt(i);
                    hashMap.put(sgcVar2.a, sgcVar2);
                    i++;
                }
                arrayList2.clear();
                arrayList.clear();
                tgcVar.e = true;
                gl.d3(new kbc(tgcVar, (byte) 10), 700L);
                Runnable runnable = tgcVar.h;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 11:
                ((VoIPPendingCall) this.b).lambda$new$1();
                return;
            case 12:
                ((VoIPPermissionActivity) this.b).finish();
                return;
            case 13:
                bo9 bo9Var = (bo9) this.b;
                bo9Var.a.clear();
                SurfaceTextureHelper surfaceTextureHelper = bo9Var.b;
                if (surfaceTextureHelper != null) {
                    surfaceTextureHelper.stopListening();
                    bo9Var.b.dispose();
                    bo9Var.b = null;
                }
                Surface surface = bo9Var.c;
                if (surface != null) {
                    surface.release();
                    bo9Var.c = null;
                    return;
                }
                return;
            case 14:
                VoIPService.lambda$updateBluetoothHeadsetState$109((VoipAudioManager) this.b);
                return;
            case 15:
                TextView[] textViewArr = ((xhc) this.b).a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 16:
                TextView[] textViewArr2 = ((xhc) ((ga2) this.b).e).a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 17:
                bic bicVar = (bic) this.b;
                if (bicVar.getVisibility() == 0) {
                    bicVar.a();
                    return;
                }
                return;
            case 18:
                fic ficVar = (fic) this.b;
                ficVar.e = Bitmap.createBitmap(ficVar.getMeasuredWidth(), ficVar.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(ficVar.e).drawText(ficVar.d, ficVar.getMeasuredWidth() / 2, (int) ((ficVar.getMeasuredHeight() / 2) - ((ficVar.a.ascent() + ficVar.a.descent()) / 2.0f)), ficVar.a);
                ficVar.postInvalidate();
                return;
            case 19:
                jjc jjcVar = (jjc) this.b;
                if (jjcVar.p0) {
                    return;
                }
                jjcVar.setVisibility(8);
                jjcVar.s();
                jjc jjcVar2 = jjcVar.a.h;
                if (jjcVar2 != null) {
                    gl.B2(jjcVar2);
                    Log.d("VoiceLive", "overlay removed");
                    return;
                }
                return;
            case 20:
                dmc dmcVar = (dmc) this.b;
                va vaVar = dmcVar.c;
                if (vaVar == null || vaVar.getScrollState() != 0) {
                    return;
                }
                q5c q0 = dmcVar.j.q0();
                if ((q0 == null || q0.getScrollState() == 0) && (d = dmcVar.d(dmcVar.c.f3)) != null) {
                    t26 t26Var = dmcVar.c.f3;
                    t26Var.getClass();
                    int i6 = new int[]{0, d49.y(d) - t26Var.E()}[1];
                    if (i6 != 0) {
                        dmcVar.c.x0(0, i6, null);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                rj4 rj4Var = (rj4) this.b;
                hv8 hv8Var = (hv8) rj4Var.b;
                gv8 gv8Var = (gv8) rj4Var.c;
                if (gv8Var != null) {
                    hv8Var.a(gv8Var);
                    hv8Var.D = 0.0f;
                    rj4Var.c = null;
                    rj4Var.invalidate();
                    return;
                }
                return;
            case 22:
                cnc cncVar = (cnc) this.b;
                enc[] encVarArr = cncVar.f;
                try {
                    try {
                    } catch (Throwable th) {
                        th = th;
                        z3 = false;
                    }
                } catch (RuntimeException e) {
                    e = e;
                    z = false;
                    z2 = true;
                }
                if (encVarArr.length != 0) {
                    if (cncVar.m == null) {
                        try {
                            cncVar.a();
                        } catch (RuntimeException e2) {
                            e = e2;
                            z2 = true;
                            z = false;
                            try {
                                fa4.g(e, z2);
                                for (enc encVar : encVarArr) {
                                    encVar.a.post(new kbc(encVar, (byte) 23));
                                }
                                cncVar.g.set(false);
                                if (!z) {
                                    return;
                                }
                                Trace.endSection();
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                z3 = z;
                                cncVar.g.set(false);
                                if (z3) {
                                    Trace.endSection();
                                }
                                throw th;
                            }
                        }
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    int length = encVarArr.length;
                    int i7 = 0;
                    boolean z5 = false;
                    boolean z6 = false;
                    while (i7 < length) {
                        enc encVar2 = encVarArr[i7];
                        dnc dncVar3 = encVar2.e;
                        if (encVar2.c && dncVar3 != null) {
                            boolean z7 = dncVar3.c;
                            z6 |= z7;
                            if (!z7) {
                                dncVar2 = dncVar3;
                            }
                        }
                        i7++;
                        z5 |= (!encVar2.c || encVar2.d || dncVar3 == null) ? false : true;
                    }
                    if (!z5) {
                        break;
                    }
                    Trace.beginSection(z6 ? "WalletTextures.dragBatch" : "WalletTextures.idleBatch");
                    try {
                        float min = cncVar.p == 0 ? 0.0f : Math.min(0.1f, (uptimeMillis - r10) / 1000.0f);
                        cncVar.p = uptimeMillis;
                        EGLDisplay eGLDisplay = cncVar.i;
                        EGLSurface eGLSurface = cncVar.k;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, cncVar.j);
                        if (dncVar2 != null) {
                            try {
                                long j = cncVar.q;
                                if (j == 0 || uptimeMillis - j >= 33) {
                                    cl3 cl3Var = cncVar.m;
                                    int i8 = cncVar.c;
                                    cl3Var.c(i8, i8, dncVar2.a, dncVar2.b, 0.0f, j == 0 ? 0.0f : (uptimeMillis - j) / 1000.0f, 1.0f, 0.0f, true);
                                    cncVar.q = uptimeMillis;
                                    cncVar.r++;
                                }
                            } catch (RuntimeException e3) {
                                e = e3;
                                z2 = true;
                                z = true;
                                fa4.g(e, z2);
                                while (r2 < r0) {
                                }
                                cncVar.g.set(false);
                                if (!z) {
                                }
                                Trace.endSection();
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                cncVar.g.set(false);
                                if (z3) {
                                }
                                throw th;
                            }
                        }
                        int length2 = encVarArr.length;
                        int i9 = 0;
                        boolean z8 = false;
                        boolean z9 = false;
                        while (i9 < length2) {
                            enc encVar3 = encVarArr[i9];
                            if (encVar3.c && ((dncVar = encVar3.e) != null || !encVar3.i)) {
                                EGLSurface eGLSurface2 = encVar3.h;
                                if (eGLSurface2 == EGL14.EGL_NO_SURFACE) {
                                    eGLSurface2 = EGL14.eglCreateWindowSurface(cncVar.i, cncVar.l, encVar3.b, new int[]{12344}, 0);
                                    encVar3.h = eGLSurface2;
                                    if (eGLSurface2 == EGL14.EGL_NO_SURFACE) {
                                        if (encVar3.c) {
                                            throw new IllegalStateException("Wallet EGL window failed");
                                        }
                                    }
                                }
                                if (EGL14.eglMakeCurrent(cncVar.i, eGLSurface2, eGLSurface2, cncVar.j)) {
                                    EGL14.eglSwapInterval(cncVar.i, 0);
                                    if (EGL14.eglQuerySurface(cncVar.i, encVar3.h, 12375, cncVar.h, 0) && EGL14.eglQuerySurface(cncVar.i, encVar3.h, 12374, cncVar.h, r5)) {
                                        int i10 = encVar3.f;
                                        int[] iArr = cncVar.h;
                                        int i11 = iArr[0];
                                        boolean z10 = (i10 == i11 && encVar3.g == iArr[r5]) ? false : r5;
                                        encVar3.f = i11;
                                        encVar3.g = iArr[r5];
                                        if (dncVar == null) {
                                            if (encVar3.i) {
                                                continue;
                                            } else {
                                                GLES20.glBindFramebuffer(36160, 0);
                                                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                                                GLES20.glClear(TLObject.FLAG_14);
                                                if (!EGL14.eglSwapBuffers(cncVar.i, encVar3.h) && encVar3.c) {
                                                    throw new IllegalStateException("Wallet EGL swap failed");
                                                }
                                                encVar3.i = r5;
                                            }
                                        } else if (z10 || dncVar.c || encVar3.j || encVar3.i || encVar3.k != cncVar.r || encVar3.l != 1.0f) {
                                            cl3 cl3Var2 = cncVar.m;
                                            if (dncVar.c) {
                                                if (dncVar.d) {
                                                    cl3 cl3Var3 = cncVar.n;
                                                    cl3Var3.c(378, 378, dncVar.a, dncVar.b, 0.0f, z8 ? 0.0f : min, 1.0f, 0.0f, true);
                                                    cl3Var2 = cl3Var3;
                                                    z8 = true;
                                                } else {
                                                    cl3 cl3Var4 = cncVar.o;
                                                    if (cl3Var4 == null) {
                                                        cl3Var4 = new cl3(cncVar.a, 2);
                                                        cl3Var4.C = cncVar.d;
                                                        cncVar.o = cl3Var4;
                                                    }
                                                    cl3 cl3Var5 = cl3Var4;
                                                    int i12 = cncVar.c;
                                                    cl3Var5.c(i12, i12, dncVar.a, dncVar.b, 0.0f, z9 ? 0.0f : min, 1.0f, 0.0f, true);
                                                    cl3Var2 = cl3Var5;
                                                    z9 = true;
                                                }
                                            }
                                            cl3Var2.d(1.0f, 0.0f, encVar3.f, encVar3.g);
                                            if (!EGL14.eglSwapBuffers(cncVar.i, encVar3.h) && encVar3.c) {
                                                throw new IllegalStateException("Wallet EGL swap failed");
                                            }
                                            encVar3.i = false;
                                            encVar3.k = cncVar.r;
                                            encVar3.l = 1.0f;
                                            encVar3.j = dncVar.c;
                                            encVar3.d = true;
                                        }
                                    } else if (encVar3.c) {
                                        throw new IllegalStateException("Wallet EGL surface size failed");
                                    }
                                } else if (encVar3.c) {
                                    throw new IllegalStateException("Wallet EGL makeCurrent failed");
                                }
                            }
                            i9++;
                            r5 = 1;
                        }
                        cncVar.g.set(false);
                    } catch (RuntimeException e4) {
                        e = e4;
                        z2 = true;
                        z = true;
                    } catch (Throwable th4) {
                        th = th4;
                        z3 = true;
                    }
                    Trace.endSection();
                    return;
                }
                cncVar.g.set(false);
                return;
            case 23:
                enc encVar4 = (enc) this.b;
                fnc fncVar = encVar4.a;
                if (fncVar.e == encVar4) {
                    fncVar.n = false;
                    fncVar.a();
                    return;
                }
                return;
            case 24:
                ((WalletEngine2) this.b).lambda$close$56();
                return;
            case 25:
                voc vocVar = (voc) this.b;
                boolean z11 = vocVar.h != -1;
                if (!z11 && !vocVar.s) {
                    vocVar.c = vocVar.c();
                    vocVar.d = 0.0f;
                }
                if (!z11 && !vocVar.s && vocVar.e <= 1.001f) {
                    z4 = false;
                }
                mkc mkcVar = vocVar.b;
                float f = vocVar.c;
                float f2 = vocVar.d;
                mkcVar.r = f;
                mkcVar.s = f2;
                mkcVar.w = z4;
                mkcVar.x = z4;
                return;
            case 26:
                bpc bpcVar = (bpc) this.b;
                bpcVar.removeSelfFromStack();
                Runnable runnable2 = bpcVar.f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 27:
                ((ri) this.b).requestLayout();
                return;
            case 28:
                ((fqc) this.b).Y();
                return;
            default:
                SharedPreferences sharedPreferences = (SharedPreferences) this.b;
                try {
                    File h = a.h();
                    String[] list = h.list();
                    if (list != null) {
                        for (String str : list) {
                            if (sqc.a.matcher(str).matches()) {
                                new File(h, str).delete();
                            }
                        }
                    }
                    File file = new File(h, "rasterized/wallpaper");
                    File[] listFiles = file.listFiles();
                    if (listFiles != null) {
                        int length3 = listFiles.length;
                        while (i < length3) {
                            listFiles[i].delete();
                            i++;
                        }
                    }
                    file.delete();
                    sharedPreferences.edit().putInt("wallpaperFilesCleanup", 1).apply();
                    return;
                } catch (Throwable th5) {
                    fa4.g(th5, true);
                    return;
                }
        }
    }
}
