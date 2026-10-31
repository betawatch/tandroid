package lg;

import ag.g3;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import androidx.mediarouter.app.g0;
import bi.d5;
import java.util.Collections;
import k2.m0;
import kg.v1;
import mg.o0;
import mg.s0;
import mg.x0;
import mg.y0;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLParseException;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.m1;
import org.telegram.ui.ActionBar.m4;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.ActionBar.q3;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.s5;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.vg;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x04f4 A[Catch: all -> 0x0504, TRY_LEAVE, TryCatch #3 {all -> 0x0504, blocks: (B:163:0x04ed, B:165:0x04f4), top: B:162:0x04ed }] */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0519  */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v7, types: [boolean, int] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        boolean z11;
        u uVar;
        float f7;
        boolean z12;
        long cameraFlipElapsedMs;
        float f10 = 1.0f;
        boolean z13 = false;
        u uVar2 = null;
        int i10 = 0;
        boolean z14 = true;
        ?? r62 = 1;
        switch (this.a) {
            case 0:
                t tVar = (t) this.b;
                v[] vVarArr = tVar.g;
                try {
                } catch (RuntimeException e) {
                    e = e;
                    z10 = true;
                    z11 = false;
                } catch (Throwable th2) {
                    th = th2;
                    z14 = false;
                }
                if (vVarArr.length != 0) {
                    if (tVar.n == null) {
                        try {
                            tVar.a();
                        } catch (RuntimeException e7) {
                            e = e7;
                            z11 = false;
                            z10 = true;
                            try {
                                f8.g(e, z10);
                                while (r2 < r0) {
                                }
                                tVar.h.set(false);
                                if (!z11) {
                                }
                                Trace.endSection();
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                z14 = z11;
                                tVar.h.set(false);
                                if (z14) {
                                    Trace.endSection();
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            z14 = false;
                            tVar.h.set(false);
                            if (z14) {
                            }
                            throw th;
                        }
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    int length = vVarArr.length;
                    int i11 = 0;
                    boolean z15 = false;
                    boolean z16 = false;
                    while (i11 < length) {
                        v vVar = vVarArr[i11];
                        u uVar3 = vVar.e;
                        float f11 = f10;
                        if (vVar.c && uVar3 != null) {
                            boolean z17 = uVar3.c;
                            z16 |= z17;
                            if (!z17) {
                                uVar2 = uVar3;
                            }
                        }
                        i11++;
                        f10 = f11;
                        z15 |= (!vVar.c || vVar.d || uVar3 == null) ? false : true;
                    }
                    float f12 = f10;
                    if (!z15) {
                        if (uptimeMillis - tVar.q < (z16 ? 16 : 33)) {
                        }
                    }
                    Trace.beginSection(z16 ? "WalletTextures.dragBatch" : "WalletTextures.idleBatch");
                    try {
                        float min = tVar.q == 0 ? 0.0f : Math.min(0.1f, (uptimeMillis - r11) / 1000.0f);
                        tVar.q = uptimeMillis;
                        EGLDisplay eGLDisplay = tVar.j;
                        EGLSurface eGLSurface = tVar.l;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, tVar.k);
                        if (uVar2 != null) {
                            try {
                                long j10 = tVar.r;
                                if (j10 == 0 || uptimeMillis - j10 >= 33) {
                                    a aVar = tVar.n;
                                    int i12 = tVar.c;
                                    aVar.c(i12, i12, uVar2.a, uVar2.b, 0.0f, j10 == 0 ? 0.0f : (uptimeMillis - j10) / 1000.0f, 1.0f, 0.0f, true);
                                    tVar.r = uptimeMillis;
                                    tVar.s++;
                                }
                            } catch (RuntimeException e10) {
                                e = e10;
                                z10 = true;
                                z11 = true;
                                f8.g(e, z10);
                                for (v vVar2 : vVarArr) {
                                    vVar2.a.post(new s(vVar2, 1));
                                }
                                tVar.h.set(false);
                                if (!z11) {
                                    return;
                                }
                                Trace.endSection();
                                return;
                            } catch (Throwable th5) {
                                th = th5;
                                tVar.h.set(false);
                                if (z14) {
                                }
                                throw th;
                            }
                        }
                        int length2 = vVarArr.length;
                        int i13 = 0;
                        boolean z18 = false;
                        boolean z19 = false;
                        while (i13 < length2) {
                            v vVar3 = vVarArr[i13];
                            if (vVar3.c && !((uVar = vVar3.e) == null && vVar3.i)) {
                                if (vVar3.h == EGL14.EGL_NO_SURFACE) {
                                    EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(tVar.j, tVar.m, vVar3.b, new int[]{12344}, i10);
                                    vVar3.h = eglCreateWindowSurface;
                                    if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                                        if (vVar3.c) {
                                            throw new IllegalStateException("Wallet EGL window failed");
                                        }
                                        f7 = f12;
                                        z12 = false;
                                    }
                                }
                                EGLDisplay eGLDisplay2 = tVar.j;
                                EGLSurface eGLSurface2 = vVar3.h;
                                if (EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, tVar.k)) {
                                    EGL14.eglSwapInterval(tVar.j, i10);
                                    if (EGL14.eglQuerySurface(tVar.j, vVar3.h, 12375, tVar.i, i10) && EGL14.eglQuerySurface(tVar.j, vVar3.h, 12374, tVar.i, r62)) {
                                        int i14 = vVar3.f;
                                        int[] iArr = tVar.i;
                                        int i15 = iArr[i10];
                                        int i16 = (i14 == i15 && vVar3.g == iArr[r62]) ? i10 : r62;
                                        vVar3.f = i15;
                                        vVar3.g = iArr[r62];
                                        if (uVar == null) {
                                            if (!vVar3.i) {
                                                GLES20.glBindFramebuffer(36160, i10);
                                                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                                                GLES20.glClear(TLObject.FLAG_14);
                                                if (!EGL14.eglSwapBuffers(tVar.j, vVar3.h) && vVar3.c) {
                                                    throw new IllegalStateException("Wallet EGL swap failed");
                                                }
                                                vVar3.i = r62;
                                            }
                                            f7 = f12;
                                            z12 = false;
                                        } else if (i16 != 0 || uVar.c || vVar3.j || vVar3.i || vVar3.k != tVar.s || vVar3.l != f12) {
                                            a aVar2 = tVar.n;
                                            if (uVar.c) {
                                                if (uVar.d) {
                                                    a aVar3 = tVar.o;
                                                    int i17 = tVar.d;
                                                    aVar3.c(i17, i17, uVar.a, uVar.b, 0.0f, z18 ? 0.0f : min, 1.0f, 0.0f, true);
                                                    aVar2 = aVar3;
                                                    z18 = true;
                                                } else {
                                                    if (tVar.p == null) {
                                                        a aVar4 = new a(tVar.a, 2);
                                                        aVar4.C = tVar.e;
                                                        tVar.p = aVar4;
                                                    }
                                                    a aVar5 = tVar.p;
                                                    int i18 = tVar.c;
                                                    aVar5.c(i18, i18, uVar.a, uVar.b, 0.0f, z19 ? 0.0f : min, 1.0f, 0.0f, true);
                                                    aVar2 = aVar5;
                                                    z19 = true;
                                                }
                                            }
                                            z12 = false;
                                            aVar2.d(f12, 0.0f, vVar3.f, vVar3.g);
                                            if (!EGL14.eglSwapBuffers(tVar.j, vVar3.h) && vVar3.c) {
                                                throw new IllegalStateException("Wallet EGL swap failed");
                                            }
                                            vVar3.i = false;
                                            vVar3.k = tVar.s;
                                            f7 = 1.0f;
                                            vVar3.l = 1.0f;
                                            vVar3.j = uVar.c;
                                            vVar3.d = true;
                                        }
                                    } else {
                                        f7 = f12;
                                        z12 = false;
                                        if (vVar3.c) {
                                            throw new IllegalStateException("Wallet EGL surface size failed");
                                        }
                                    }
                                } else if (vVar3.c) {
                                    throw new IllegalStateException("Wallet EGL makeCurrent failed");
                                }
                                f7 = f12;
                                z12 = false;
                            } else {
                                z12 = z13;
                                f7 = f12;
                            }
                            i13++;
                            z13 = z12;
                            f12 = f7;
                            i10 = 0;
                            r62 = 1;
                        }
                        tVar.h.set(false);
                    } catch (RuntimeException e11) {
                        e = e11;
                        z10 = true;
                        z11 = true;
                    } catch (Throwable th6) {
                        th = th6;
                        z14 = true;
                    }
                    Trace.endSection();
                    return;
                }
                tVar.h.set(false);
                return;
            case 1:
                v vVar4 = (v) this.b;
                w wVar = vVar4.a;
                if (wVar.e == vVar4) {
                    wVar.n = false;
                    wVar.a();
                    return;
                }
                return;
            case 2:
                ((lh.g) this.b).V1.O(true);
                return;
            case 3:
                d50 d50Var = (d50) ((m0) this.b).a;
                d50Var.p0 = true;
                StringBuilder sb2 = new StringBuilder("RoundVideo camera flip first frame: elapsedMs=");
                cameraFlipElapsedMs = d50Var.getCameraFlipElapsedMs();
                sb2.append(cameraFlipElapsedMs);
                f8.b(sb2.toString());
                d50Var.v(true);
                d50.m(d50Var);
                return;
            case 4:
                ((lf.b) ((com.google.android.gms.internal.cast.o) this.b).c).a(false);
                return;
            case 5:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.b;
                cc X = cc.X();
                if (X != null) {
                    X.Q(R.raw.forward, 30, spannableStringBuilder).j();
                    return;
                }
                return;
            case 6:
                ((s0) this.b).a(null);
                return;
            case 7:
                ((vg) this.b).a(Collections.EMPTY_LIST);
                return;
            case 8:
                ((o0) this.b).a(null);
                return;
            case 9:
                x0 x0Var = (x0) this.b;
                x0Var.getClass();
                y0 y0Var = x0Var.r;
                v1 v1Var = new v1(y0Var.o1, y0Var.a, null, null, null, y0Var.I0);
                v1Var.B2 = true;
                v1Var.U1 = true;
                y0Var.o1.showDialog(v1Var);
                return;
            case 10:
                n2.d dVar = (n2.d) this.b;
                if (dVar.c) {
                    return;
                }
                n2.g gVar = dVar.b;
                if (gVar != null) {
                    gVar.a(dVar.a);
                }
                dVar.d.y.remove(dVar);
                dVar.c = true;
                return;
            case 11:
                ((n2.b) this.b).a(null);
                return;
            case 12:
                ((m0) this.b).n0();
                return;
            case 13:
                oh.p pVar = (oh.p) this.b;
                pVar.f();
                pVar.e(true);
                return;
            case 14:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.b);
                return;
            case 15:
                g3 g3Var = (g3) this.b;
                Drawable drawable = ActionBarLayout.v1;
                i0.g3(g3Var);
                return;
            case 16:
                ((org.telegram.ui.ActionBar.s0) this.b).setSelectedForDelete(false);
                return;
            case 17:
                org.telegram.ui.ActionBar.y0 y0Var2 = (org.telegram.ui.ActionBar.y0) this.b;
                y0Var2.W = true;
                i0.l2(new ag.l(y0Var2, 24), 8.0f);
                return;
            case 18:
                ((m1) this.b).c();
                return;
            case 19:
                t1 t1Var = (t1) this.b;
                x1 x1Var = t1Var.d;
                int i19 = i0.q.x;
                x1Var.L = i19;
                int min2 = Math.min(i0.Q1() ? i0.P1() ? i0.L(446.0f) : i0.L(496.0f) : i0.L(356.0f), i19 - i0.L(56.0f));
                Rect rect = x1Var.C0;
                int i20 = min2 + rect.left + rect.right;
                if (x1Var.Z0) {
                    ViewGroup.LayoutParams layoutParams = t1Var.getLayoutParams();
                    if (layoutParams == null || layoutParams.width == i20) {
                        return;
                    }
                    layoutParams.width = i20;
                    t1Var.requestLayout();
                    return;
                }
                Window window = x1Var.getWindow();
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
                layoutParams2.copyFrom(window.getAttributes());
                layoutParams2.width = i20;
                try {
                    window.setAttributes(layoutParams2);
                    return;
                } catch (Throwable th7) {
                    f8.g(th7, true);
                    return;
                }
            case 20:
                b2 b2Var = (b2) this.b;
                b2Var.o1.setVisibility(0);
                b2Var.q1.setAlpha(0.0f);
                b2Var.p1.startAnimation(AnimationUtils.loadAnimation(b2Var.getContext(), b2Var.m1));
                b2Var.q1.animate().setDuration(300L).alpha(1.0f).setListener(new z1(b2Var, 0)).start();
                return;
            case 21:
                z2 z2Var = (z2) ((d5) this.b).c;
                DialogInterface.OnDismissListener onDismissListener = z2Var.H0;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(z2Var);
                }
                try {
                    z2Var.L();
                    return;
                } catch (Exception e12) {
                    f8.g(e12, true);
                    return;
                }
            case 22:
                try {
                    ((r2) this.b).b.L();
                    return;
                } catch (Exception e13) {
                    f8.g(e13, true);
                    return;
                }
            case 23:
                n3 n3Var = (n3) this.b;
                if (n3Var.d() != null) {
                    n3Var.d().setDrawingFromOverlay(true);
                    return;
                }
                return;
            case 24:
                ((q3) this.b).f();
                return;
            case 25:
                q4 q4Var = (q4) ((g0) this.b).b;
                q4Var.k();
                q4Var.j();
                return;
            case 26:
                q4 q4Var2 = ((m4) this.b).b;
                q4Var2.c.dismiss();
                q4Var2.f.removeAllViews();
                return;
            case 27:
                ((m4) this.b).b.c.dismiss();
                return;
            case 28:
                s5 s5Var = (s5) this.b;
                if (s5Var.y || !s5Var.M) {
                    return;
                }
                s5Var.c();
                return;
            default:
                Drawable drawable2 = (Drawable) this.b;
                t6.d = null;
                t6.P();
                if (!t6.b) {
                    t6.j(drawable2);
                    t6.h(drawable2);
                }
                zs.e().k(zs.z4, new Object[0]);
                return;
        }
    }
}
