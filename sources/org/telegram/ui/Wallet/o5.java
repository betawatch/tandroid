package org.telegram.ui.Wallet;

import android.graphics.Rect;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import c8.kc;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.vp0;
import org.telegram.ui.zd;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class o5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o5(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        float f10;
        float f11;
        int i7;
        sg.r0 r0Var = (sg.r0) this.b;
        if (!r0Var.f || r0Var.E.E) {
            return;
        }
        sg.r0.a(r0Var);
        GLES20.glBindFramebuffer(36160, 0);
        sg.r0 r0Var2 = (sg.r0) this.b;
        GLES20.glViewport(0, 0, r0Var2.n, r0Var2.r);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(TLObject.FLAG_14);
        sg.h0 h0Var = ((sg.r0) this.b).E.c;
        if (h0Var.r != null) {
            if (h0Var.D != null && h0Var.F != null && h0Var.E) {
                GLES20.glBindFramebuffer(36160, 0);
                sg.u0 u0Var = (sg.u0) h0Var.r.get("videoBlur");
                if (u0Var != null) {
                    GLES20.glUseProgram(u0Var.a);
                    GLES20.glUniformMatrix4fv(u0Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(h0Var.y));
                    GLES20.glUniform1f(u0Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(u0Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, h0Var.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(u0Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    org.telegram.ui.Components.ga gaVar = h0Var.F.m;
                    GLES20.glBindTexture(3553, gaVar != null ? gaVar.s[2] : -1);
                    if (h0Var.b == null || !(h0Var.i instanceof sg.d)) {
                        GLES20.glUniform1f(u0Var.d("eraser"), 0.0f);
                    } else {
                        GLES20.glUniform1f(u0Var.d("eraser"), 1.0f);
                        GLES20.glUniform1i(u0Var.d("mask"), 2);
                        GLES20.glActiveTexture(33986);
                        GLES20.glBindTexture(3553, h0Var.g());
                    }
                    GLES20.glBlendFunc(1, 0);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) h0Var.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) h0Var.n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (h0Var.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
            }
            if (h0Var.b != null) {
                h0Var.n(h0Var.g(), h0Var.b, (1.0f - (h0Var.I * 0.5f)) - (h0Var.J * 0.5f));
            } else if (h0Var.c != null) {
                h0Var.o(h0Var.j(), h0Var.g(), h0Var.c, 1.0f);
            } else {
                int j3 = h0Var.j();
                f10 = 0.0f;
                sg.u0 u0Var2 = (sg.u0) h0Var.r.get(h0Var.G ? "maskingBlit" : "blit");
                if (j3 != 0 && u0Var2 != null) {
                    GLES20.glUseProgram(u0Var2.a);
                    f11 = 0.5f;
                    GLES20.glUniformMatrix4fv(u0Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(h0Var.y));
                    GLES20.glUniform1f(u0Var2.d("alpha"), 1.0f);
                    if (h0Var.G) {
                        GLES20.glUniform1i(u0Var2.d("texture"), 1);
                        GLES20.glUniform1i(u0Var2.d("mask"), 0);
                        GLES20.glUniform1f(u0Var2.d("preview"), 0.4f);
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, j3);
                        GLES20.glActiveTexture(33985);
                        GLES20.glBindTexture(3553, h0Var.l.c());
                    } else {
                        GLES20.glUniform1i(u0Var2.d("texture"), 0);
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, j3);
                    }
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) h0Var.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) h0Var.n);
                    GLES20.glEnableVertexAttribArray(1);
                    GLES20.glDrawArrays(5, 0, 4);
                    kc.a();
                    i7 = h0Var.q;
                    if (i7 != 0 && h0Var.d != null && h0Var.I > f10) {
                        h0Var.o(i7, h0Var.g(), h0Var.d, (h0Var.J * f11) + (h0Var.I * f11));
                    }
                }
                f11 = 0.5f;
                i7 = h0Var.q;
                if (i7 != 0) {
                    h0Var.o(i7, h0Var.g(), h0Var.d, (h0Var.J * f11) + (h0Var.I * f11));
                }
            }
            f10 = 0.0f;
            f11 = 0.5f;
            i7 = h0Var.q;
            if (i7 != 0) {
            }
        }
        GLES20.glBlendFunc(1, 771);
        sg.r0 r0Var3 = (sg.r0) this.b;
        r0Var3.b.eglSwapBuffers(r0Var3.c, r0Var3.e);
        sg.t0 t0Var = ((sg.r0) this.b).E;
        if (!t0Var.s) {
            t0Var.s = true;
            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(this, 13));
        }
        if (((sg.r0) this.b).h) {
            return;
        }
        ((sg.r0) this.b).h = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
    
        if (r12 < 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f6, code lost:
    
        if (r12 > 0) goto L50;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int R;
        int i7;
        int height;
        l2.g0 g0Var;
        int i10 = 0;
        switch (this.a) {
            case 0:
                o6 o6Var = (o6) this.b;
                if (o6Var.a == null || o6Var.e == null) {
                    return;
                }
                o6Var.b1();
                if (o6Var.s) {
                    o6Var.a.postOnAnimation(this);
                    return;
                }
                return;
            case 1:
                t6 t6Var = (t6) this.b;
                a7 a7Var = t6Var.H;
                if (t6Var.b0) {
                    long nanoTime = System.nanoTime();
                    if (a7Var.a) {
                        if (a7Var.j == 0) {
                            a7Var.j = nanoTime;
                        } else {
                            float min = Math.min(0.1f, Math.max(0.0f, (nanoTime - r9) * 1.0E-9f));
                            a7Var.j = nanoTime;
                            if (a7Var.i - a7Var.h >= 1000000000) {
                                float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
                                float f10 = a7Var.d;
                                a7Var.d = com.google.android.gms.internal.vision.e2.z(a7Var.b, f10, exp, f10);
                                float f11 = a7Var.e;
                                a7Var.e = com.google.android.gms.internal.vision.e2.z(a7Var.c, f11, exp, f11);
                            }
                        }
                    }
                    t6Var.L = a7Var.a ? Math.max(-15.0f, Math.min(15.0f, a7Var.b - a7Var.d)) : 0.0f;
                    float c10 = t6.c((a7Var.a ? Math.max(-15.0f, Math.min(15.0f, a7Var.c - a7Var.e)) : 0.0f) * 1.5f, -15.0f, 15.0f);
                    float f12 = t6Var.L;
                    float f13 = t6Var.M;
                    float z10 = com.google.android.gms.internal.vision.e2.z(f12, f13, 1.0f, f13);
                    t6Var.M = z10;
                    float f14 = t6Var.N;
                    float z11 = com.google.android.gms.internal.vision.e2.z(c10, f14, 1.0f, f14);
                    t6Var.N = z11;
                    float f15 = t6Var.f0;
                    t6Var.b((z10 * f15) + t6Var.O + t6Var.e0, (z11 * f15) + t6Var.P);
                    t6Var.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                if (org.telegram.utils.twidget.n0.h.remove(this)) {
                    org.telegram.messenger.g0.r(this);
                    ((zd) this.b).run();
                    return;
                }
                return;
            case 3:
                ((qe.h) this.b).o();
                return;
            case 4:
                s8.a aVar = (s8.a) this.b;
                synchronized (aVar.a) {
                    try {
                        if (aVar.b()) {
                            Log.e("WakeLock", String.valueOf(aVar.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            aVar.d();
                            if (aVar.b()) {
                                aVar.c = 1;
                                aVar.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 5:
                a();
                return;
            case 6:
                tg.d dVar = (tg.d) this.b;
                if (dVar.isAttachedToWindow()) {
                    dVar.z();
                    dVar.postOnAnimation(this);
                    return;
                }
                return;
            case 7:
                tg.n nVar = ((vp0) this.b).C0;
                if (nVar instanceof tg.q2) {
                    ((tg.q2) nVar).getEditText();
                    return;
                }
                return;
            case 8:
                u0.d dVar2 = (u0.d) this.b;
                m.r1 r1Var = dVar2.c;
                u0.a aVar2 = dVar2.a;
                if (dVar2.F) {
                    if (dVar2.y) {
                        dVar2.y = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar2.e = currentAnimationTimeMillis;
                        aVar2.g = -1L;
                        aVar2.f = currentAnimationTimeMillis;
                        aVar2.h = 0.5f;
                    }
                    if ((aVar2.g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.g + aVar2.i) || !dVar2.e()) {
                        dVar2.F = false;
                        return;
                    }
                    if (dVar2.E) {
                        dVar2.E = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        r1Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar2.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a10 = aVar2.a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - aVar2.f;
                    aVar2.f = currentAnimationTimeMillis2;
                    dVar2.H.scrollListBy((int) (j3 * ((a10 * 4.0f) + ((-4.0f) * a10 * a10)) * aVar2.d));
                    WeakHashMap weakHashMap = r0.i0.a;
                    r1Var.postOnAnimation(this);
                    return;
                }
                return;
            case 9:
                ug.u0 u0Var = (ug.u0) this.b;
                ArrayList arrayList = u0Var.o3;
                if (u0Var.v3) {
                    if (!arrayList.isEmpty() && (R = RecyclerView.R((ug.l1) i5.c.h(1, arrayList))) >= 0) {
                        View m10 = u0Var.g3.m(R + 1);
                        if (m10 != null) {
                            u0Var.l3 = false;
                            u0Var.z1(m10, true);
                            u0Var.w0(0, m10.getTop() - ((u0Var.getMeasuredHeight() - m10.getMeasuredHeight()) / 2), org.telegram.messenger.g0.H);
                        }
                    }
                    u0Var.A1();
                    return;
                }
                return;
            case 10:
                ug.t1 t1Var = (ug.t1) this.b;
                try {
                    ug.s1 s1Var = t1Var.a;
                    if (s1Var != null) {
                        s1Var.g();
                        t1Var.invalidate();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 11:
                v4.z zVar = (v4.z) this.b;
                v4.w wVar = zVar.y;
                if (zVar.c != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = zVar.S;
                    long j11 = j10 != Long.MIN_VALUE ? currentTimeMillis - j10 : 0L;
                    v4.p0 layoutManager = zVar.I.getLayoutManager();
                    if (zVar.R == null) {
                        zVar.R = new Rect();
                    }
                    layoutManager.c(zVar.c.a, zVar.R);
                    if (layoutManager.d()) {
                        int i11 = (int) (zVar.s + zVar.n);
                        i7 = (i11 - zVar.R.left) - zVar.I.getPaddingLeft();
                        float f16 = zVar.n;
                        if (f16 < 0.0f) {
                        }
                        if (f16 > 0.0f) {
                            i7 = ((zVar.c.a.getWidth() + i11) + zVar.R.right) - (zVar.I.getWidth() - zVar.I.getPaddingRight());
                            break;
                        }
                    }
                    i7 = 0;
                    if (layoutManager.e()) {
                        int i12 = (int) (zVar.w + zVar.r);
                        int paddingTop = (i12 - zVar.R.top) - zVar.I.getPaddingTop();
                        float f17 = zVar.r;
                        if (f17 < 0.0f && paddingTop < 0) {
                            i10 = paddingTop;
                        } else if (f17 > 0.0f && (height = ((zVar.c.a.getHeight() + i12) + zVar.R.bottom) - (zVar.I.getHeight() - zVar.I.getPaddingBottom())) > 0) {
                            i10 = height;
                        }
                    }
                    if (i7 != 0) {
                        int width = zVar.c.a.getWidth();
                        zVar.I.getWidth();
                        i7 = wVar.i(width, i7, j11);
                    }
                    if (i10 != 0) {
                        int height2 = zVar.c.a.getHeight();
                        zVar.I.getHeight();
                        i10 = wVar.i(height2, i10, j11);
                    }
                    if (i7 == 0 && i10 == 0) {
                        zVar.S = Long.MIN_VALUE;
                        return;
                    }
                    if (zVar.S == Long.MIN_VALUE) {
                        zVar.S = currentTimeMillis;
                    }
                    zVar.I.scrollBy(i7, i10);
                    v4.f1 f1Var = zVar.c;
                    if (f1Var != null) {
                        zVar.p(f1Var);
                    }
                    zVar.I.removeCallbacks(zVar.J);
                    RecyclerView recyclerView = zVar.I;
                    WeakHashMap weakHashMap2 = r0.i0.a;
                    recyclerView.postOnAnimation(this);
                    return;
                }
                return;
            case 12:
                wg.v0 v0Var = (wg.v0) this.b;
                String str = v0Var.j2;
                if (str != null) {
                    v0Var.g1(v0Var.n2, str, false);
                    return;
                }
                return;
            case 13:
                wg.d1 d1Var = (wg.d1) this.b;
                String str2 = d1Var.j2;
                if (str2 != null) {
                    if (d1Var.r2 >= 0) {
                        ConnectionsManager.getInstance(d1Var.a).cancelRequest(d1Var.r2, true);
                        d1Var.r2 = -1;
                    }
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.q = str2;
                    d1Var.r2 = ConnectionsManager.getInstance(d1Var.a).sendRequest(tL_contacts_search, new ai.b1(d1Var, 28));
                    return;
                }
                return;
            default:
                zi.u0 u0Var2 = (zi.u0) this.b;
                if (u0Var2.a0 == 5 && (g0Var = u0Var2.W) != null && u0Var2.z) {
                    long n10 = g0Var.n();
                    long j12 = u0Var2.K;
                    if (n10 < j12 || n10 >= u0Var2.L) {
                        u0Var2.W.Z0(5, j12);
                    }
                    u0Var2.d.getClass();
                    u0Var2.i.postDelayed(this, 33L);
                    return;
                }
                return;
        }
    }
}
