package org.telegram.ui.Components;

import android.graphics.Rect;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class dy0 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ dy0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        float f7;
        float f10;
        int i10;
        rg.a1 a1Var = (rg.a1) this.b;
        if (!a1Var.f || a1Var.y.y) {
            return;
        }
        rg.a1.b(a1Var);
        GLES20.glBindFramebuffer(36160, 0);
        rg.a1 a1Var2 = (rg.a1) this.b;
        GLES20.glViewport(0, 0, a1Var2.n, a1Var2.r);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        rg.q0 q0Var = ((rg.a1) this.b).y.c;
        if (q0Var.r != null) {
            if (q0Var.D != null && q0Var.F != null && q0Var.E) {
                GLES20.glBindFramebuffer(36160, 0);
                rg.d1 d1Var = (rg.d1) q0Var.r.get("videoBlur");
                if (d1Var != null) {
                    GLES20.glUseProgram(d1Var.a);
                    GLES20.glUniformMatrix4fv(d1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(q0Var.y));
                    GLES20.glUniform1f(d1Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(d1Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, q0Var.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(d1Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    ra raVar = q0Var.F.m;
                    GLES20.glBindTexture(3553, raVar != null ? raVar.s[2] : -1);
                    if (q0Var.b == null || !(q0Var.i instanceof rg.d)) {
                        GLES20.glUniform1f(d1Var.d("eraser"), 0.0f);
                    } else {
                        GLES20.glUniform1f(d1Var.d("eraser"), 1.0f);
                        GLES20.glUniform1i(d1Var.d("mask"), 2);
                        GLES20.glActiveTexture(33986);
                        GLES20.glBindTexture(3553, q0Var.g());
                    }
                    GLES20.glBlendFunc(1, 0);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) q0Var.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) q0Var.n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (q0Var.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
            }
            if (q0Var.b != null) {
                q0Var.n(q0Var.g(), q0Var.b, (1.0f - (q0Var.I * 0.5f)) - (q0Var.J * 0.5f));
            } else if (q0Var.c != null) {
                q0Var.o(q0Var.j(), q0Var.g(), q0Var.c, 1.0f);
            } else {
                int j10 = q0Var.j();
                f7 = 0.0f;
                rg.d1 d1Var2 = (rg.d1) q0Var.r.get(q0Var.G ? "maskingBlit" : "blit");
                if (j10 != 0 && d1Var2 != null) {
                    GLES20.glUseProgram(d1Var2.a);
                    f10 = 0.5f;
                    GLES20.glUniformMatrix4fv(d1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(q0Var.y));
                    GLES20.glUniform1f(d1Var2.d("alpha"), 1.0f);
                    if (q0Var.G) {
                        GLES20.glUniform1i(d1Var2.d("texture"), 1);
                        GLES20.glUniform1i(d1Var2.d("mask"), 0);
                        GLES20.glUniform1f(d1Var2.d("preview"), 0.4f);
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, j10);
                        GLES20.glActiveTexture(33985);
                        GLES20.glBindTexture(3553, q0Var.l.c());
                    } else {
                        GLES20.glUniform1i(d1Var2.d("texture"), 0);
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, j10);
                    }
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) q0Var.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) q0Var.n);
                    GLES20.glEnableVertexAttribArray(1);
                    GLES20.glDrawArrays(5, 0, 4);
                    a8.yf.a();
                    i10 = q0Var.q;
                    if (i10 != 0 && q0Var.d != null && q0Var.I > f7) {
                        q0Var.o(i10, q0Var.g(), q0Var.d, (q0Var.J * f10) + (q0Var.I * f10));
                    }
                }
                f10 = 0.5f;
                i10 = q0Var.q;
                if (i10 != 0) {
                    q0Var.o(i10, q0Var.g(), q0Var.d, (q0Var.J * f10) + (q0Var.I * f10));
                }
            }
            f7 = 0.0f;
            f10 = 0.5f;
            i10 = q0Var.q;
            if (i10 != 0) {
            }
        }
        GLES20.glBlendFunc(1, 771);
        rg.a1 a1Var3 = (rg.a1) this.b;
        a1Var3.b.eglSwapBuffers(a1Var3.c, a1Var3.e);
        rg.c1 c1Var = ((rg.a1) this.b).y;
        if (!c1Var.s) {
            c1Var.s = true;
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(this, 11));
        }
        if (((rg.a1) this.b).h) {
            return;
        }
        ((rg.a1) this.b).h = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x02e3, code lost:
    
        if (r13 < 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0306, code lost:
    
        if (r13 > 0) goto L120;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int height;
        int R;
        i2.j0 j0Var;
        int i11 = 0;
        i11 = 0;
        i11 = 0;
        switch (this.a) {
            case 0:
                fy0 fy0Var = (fy0) this.b;
                View view = fy0Var.s;
                if (view == null) {
                    fy0Var.c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    return;
                }
                if (view.getVisibility() != 0) {
                    fy0Var.s.setVisibility(0);
                    fy0Var.s.setAlpha(0.0f);
                }
                fy0Var.s.animate().setListener(null).cancel();
                fy0Var.s.animate().alpha(1.0f).setDuration(150L).start();
                return;
            case 1:
                ((ThemeEditorView) this.b).a = false;
                try {
                    org.telegram.ui.ActionBar.y6.k();
                    org.telegram.ui.ActionBar.y6.n();
                    org.telegram.ui.ActionBar.y6.p();
                    org.telegram.ui.ActionBar.y6.j(false, false);
                    org.telegram.ui.ActionBar.f7.d0(null, true);
                    LaunchActivity launchActivity = LaunchActivity.I1;
                    if (launchActivity != null) {
                        launchActivity.d0();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 2:
                u91 u91Var = (u91) this.b;
                if (u91Var.J) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f7 = u91Var.f0 + (elapsedRealtime / 200.0f);
                    u91Var.f0 = f7;
                    u91Var.setAnimationIdicatorProgress(u91Var.a0.getInterpolation(f7));
                    if (u91Var.f0 > 1.0f) {
                        u91Var.f0 = 1.0f;
                    }
                    if (u91Var.f0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(u91Var.i0);
                        return;
                    }
                    u91Var.J = false;
                    u91Var.setEnabled(true);
                    t91 t91Var = u91Var.y;
                    if (t91Var != null) {
                        ((jg.i) t91Var).e0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                if (jb1.h.remove(this)) {
                    AndroidUtilities.cancelRunOnUIThread(this);
                    ((org.telegram.ui.le) this.b).run();
                    return;
                }
                return;
            case 4:
                org.telegram.ui.o30 o30Var = (org.telegram.ui.o30) this.b;
                if (!o30Var.b || o30Var.Q0.z0 != null) {
                    AndroidUtilities.runOnUIThread(o30Var.h0, 3000L);
                    return;
                } else {
                    o30Var.g0 = false;
                    o30Var.setUiVisible(false);
                    return;
                }
            case 5:
                org.telegram.ui.Wallet.z0 z0Var = (org.telegram.ui.Wallet.z0) this.b;
                if (z0Var.d && z0Var.e && z0Var.k != null) {
                    if (SystemClock.elapsedRealtime() - z0Var.l >= 30000) {
                        z0Var.f("heartbeat timed out");
                        return;
                    }
                    z0Var.d("sending ping; last pong " + (SystemClock.elapsedRealtime() - z0Var.l) + " ms ago");
                    z0Var.g("{\"operation\":\"ping\",\"id\":\"heartbeat\"}");
                    AndroidUtilities.runOnUIThread(this, 15000L);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) this.b;
                if (m5Var.a == null || m5Var.e == null) {
                    return;
                }
                m5Var.S0();
                if (m5Var.s) {
                    m5Var.a.postOnAnimation(this);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Wallet.r5 r5Var = (org.telegram.ui.Wallet.r5) this.b;
                org.telegram.ui.Wallet.y5 y5Var = r5Var.G;
                if (r5Var.a0) {
                    long nanoTime = System.nanoTime();
                    if (y5Var.a) {
                        if (y5Var.j == 0) {
                            y5Var.j = nanoTime;
                        } else {
                            float min = Math.min(0.1f, Math.max(0.0f, (nanoTime - r7) * 1.0E-9f));
                            y5Var.j = nanoTime;
                            if (y5Var.i - y5Var.h >= 1000000000) {
                                float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
                                float f10 = y5Var.d;
                                y5Var.d = c3.h0.z(y5Var.b, f10, exp, f10);
                                float f11 = y5Var.e;
                                y5Var.e = c3.h0.z(y5Var.c, f11, exp, f11);
                            }
                        }
                    }
                    r5Var.K = y5Var.a ? Math.max(-15.0f, Math.min(15.0f, y5Var.b - y5Var.d)) : 0.0f;
                    float c10 = org.telegram.ui.Wallet.r5.c((y5Var.a ? Math.max(-15.0f, Math.min(15.0f, y5Var.c - y5Var.e)) : 0.0f) * 1.5f, -15.0f, 15.0f);
                    float f12 = r5Var.K;
                    float f13 = r5Var.L;
                    float z10 = c3.h0.z(f12, f13, 1.0f, f13);
                    r5Var.L = z10;
                    float f14 = r5Var.M;
                    float z11 = c3.h0.z(c10, f14, 1.0f, f14);
                    r5Var.M = z11;
                    float f15 = r5Var.e0;
                    r5Var.b((z10 * f15) + r5Var.N + r5Var.d0, (z11 * f15) + r5Var.O);
                    r5Var.postOnAnimation(this);
                    return;
                }
                return;
            case 8:
                ((p4.s0) this.b).c();
                return;
            case 9:
                q8.a aVar = (q8.a) this.b;
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
            case 10:
                a();
                return;
            case 11:
                s4.z zVar = (s4.z) this.b;
                s4.w wVar = zVar.x;
                if (zVar.c != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = zVar.R;
                    long j11 = j10 == Long.MIN_VALUE ? 0L : currentTimeMillis - j10;
                    s4.p0 layoutManager = zVar.H.getLayoutManager();
                    if (zVar.Q == null) {
                        zVar.Q = new Rect();
                    }
                    layoutManager.c(zVar.c.a, zVar.Q);
                    if (layoutManager.d()) {
                        int i12 = (int) (zVar.s + zVar.n);
                        i10 = (i12 - zVar.Q.left) - zVar.H.getPaddingLeft();
                        float f16 = zVar.n;
                        if (f16 < 0.0f) {
                        }
                        if (f16 > 0.0f) {
                            i10 = ((zVar.c.a.getWidth() + i12) + zVar.Q.right) - (zVar.H.getWidth() - zVar.H.getPaddingRight());
                            break;
                        }
                    }
                    i10 = 0;
                    if (layoutManager.e()) {
                        int i13 = (int) (zVar.v + zVar.r);
                        int paddingTop = (i13 - zVar.Q.top) - zVar.H.getPaddingTop();
                        float f17 = zVar.r;
                        if (f17 < 0.0f && paddingTop < 0) {
                            i11 = paddingTop;
                        } else if (f17 > 0.0f && (height = ((zVar.c.a.getHeight() + i13) + zVar.Q.bottom) - (zVar.H.getHeight() - zVar.H.getPaddingBottom())) > 0) {
                            i11 = height;
                        }
                    }
                    if (i10 != 0) {
                        int width = zVar.c.a.getWidth();
                        zVar.H.getWidth();
                        i10 = wVar.i(width, i10, j11);
                    }
                    if (i11 != 0) {
                        int height2 = zVar.c.a.getHeight();
                        zVar.H.getHeight();
                        i11 = wVar.i(height2, i11, j11);
                    }
                    if (i10 == 0 && i11 == 0) {
                        zVar.R = Long.MIN_VALUE;
                        return;
                    }
                    if (zVar.R == Long.MIN_VALUE) {
                        zVar.R = currentTimeMillis;
                    }
                    zVar.H.scrollBy(i10, i11);
                    s4.e1 e1Var = zVar.c;
                    if (e1Var != null) {
                        zVar.p(e1Var);
                    }
                    zVar.H.removeCallbacks(zVar.I);
                    RecyclerView recyclerView = zVar.H;
                    WeakHashMap weakHashMap = r0.i0.a;
                    recyclerView.postOnAnimation(this);
                    return;
                }
                return;
            case 12:
                sg.j jVar = ((org.telegram.ui.pt0) this.b).H0;
                if (jVar instanceof sg.w2) {
                    ((sg.w2) jVar).getEditText();
                    return;
                }
                return;
            case 13:
                tg.s0 s0Var = (tg.s0) this.b;
                ArrayList arrayList = s0Var.o3;
                if (s0Var.v3) {
                    if (!arrayList.isEmpty() && (R = RecyclerView.R((tg.p1) ic.a.g(1, arrayList))) >= 0) {
                        View m10 = s0Var.g3.m(R + 1);
                        if (m10 != null) {
                            s0Var.l3 = false;
                            s0Var.C1(m10, true);
                            s0Var.w0(0, m10.getTop() - ((s0Var.getMeasuredHeight() - m10.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                        }
                    }
                    s0Var.D1();
                    return;
                }
                return;
            case 14:
                tg.x1 x1Var = (tg.x1) this.b;
                try {
                    tg.w1 w1Var = x1Var.a;
                    if (w1Var != null) {
                        w1Var.g();
                        x1Var.invalidate();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 15:
                u0.d dVar = (u0.d) this.b;
                m.r1 r1Var = dVar.c;
                u0.a aVar2 = dVar.a;
                if (dVar.E) {
                    if (dVar.x) {
                        dVar.x = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar2.e = currentAnimationTimeMillis;
                        aVar2.g = -1L;
                        aVar2.f = currentAnimationTimeMillis;
                        aVar2.h = 0.5f;
                    }
                    if ((aVar2.g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.g + aVar2.i) || !dVar.e()) {
                        dVar.E = false;
                        return;
                    }
                    if (dVar.y) {
                        dVar.y = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        r1Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar2.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar2.a(currentAnimationTimeMillis2);
                    long j12 = currentAnimationTimeMillis2 - aVar2.f;
                    aVar2.f = currentAnimationTimeMillis2;
                    dVar.G.scrollListBy((int) (j12 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar2.d));
                    WeakHashMap weakHashMap2 = r0.i0.a;
                    r1Var.postOnAnimation(this);
                    return;
                }
                return;
            case 16:
                vg.z0 z0Var2 = (vg.z0) this.b;
                String str = z0Var2.n0;
                if (str != null) {
                    z0Var2.T(z0Var2.r0, str, false);
                    return;
                }
                return;
            case 17:
                vg.n1 n1Var = (vg.n1) this.b;
                String str2 = n1Var.o0;
                if (str2 != null) {
                    vg.n1.U(n1Var, str2);
                    return;
                }
                return;
            case 18:
                vi.u0 u0Var = (vi.u0) this.b;
                if (u0Var.Z == 5 && (j0Var = u0Var.V) != null && u0Var.z) {
                    long M0 = j0Var.M0();
                    long j13 = u0Var.J;
                    if (M0 < j13 || M0 >= u0Var.K) {
                        u0Var.V.Z0(5, j13);
                    }
                    u0Var.d.getClass();
                    u0Var.i.postDelayed(this, 33L);
                    return;
                }
                return;
            case 19:
                ((y2.j) this.b).a();
                return;
            case 20:
                y7.ca caVar = (y7.ca) this.b;
                y7.m7 m7Var = y7.m7.f;
                HashMap hashMap = caVar.j;
                y7.e eVar = (y7.e) hashMap.get(m7Var);
                if (eVar != null) {
                    y7.e eVar2 = eVar;
                    y7.a aVar3 = eVar2.a;
                    if (aVar3 == null) {
                        y7.e eVar3 = eVar2;
                        y7.a aVar4 = new y7.a(eVar3, eVar3.c);
                        eVar2.a = aVar4;
                        aVar3 = aVar4;
                    }
                    Iterator it = aVar3.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Collection collection = (Collection) eVar.c.get(next);
                        Collection collection2 = collection;
                        if (collection == null) {
                            collection2 = new ArrayList(3);
                        }
                        List list = (List) collection2;
                        ArrayList arrayList2 = new ArrayList(list instanceof RandomAccess ? new y7.b(eVar, next, list, null) : new a8.dh(eVar, next, list, (a8.dh) null));
                        Collections.sort(arrayList2);
                        a8.ua uaVar = new a8.ua();
                        int size = arrayList2.size();
                        int i14 = 0;
                        long j14 = 0;
                        while (i14 < size) {
                            Object obj = arrayList2.get(i14);
                            i14++;
                            j14 = ((Long) obj).longValue() + j14;
                        }
                        uaVar.c = Long.valueOf((j14 / arrayList2.size()) & Long.MAX_VALUE);
                        uaVar.a = Long.valueOf(y7.ca.a(arrayList2, 100.0d) & Long.MAX_VALUE);
                        uaVar.f = Long.valueOf(y7.ca.a(arrayList2, 75.0d) & Long.MAX_VALUE);
                        uaVar.e = Long.valueOf(y7.ca.a(arrayList2, 50.0d) & Long.MAX_VALUE);
                        uaVar.d = Long.valueOf(y7.ca.a(arrayList2, 25.0d) & Long.MAX_VALUE);
                        uaVar.b = Long.valueOf(Long.MAX_VALUE & y7.ca.a(arrayList2, 0.0d));
                        y7.y6 y6Var = new y7.y6(uaVar);
                        int size2 = arrayList2.size();
                        aa.m0 m0Var = new aa.m0();
                        m0Var.c = y7.k7.b;
                        s4.d dVar2 = new s4.d(16, (boolean) i11);
                        dVar2.c = Integer.valueOf(size2 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        dVar2.b = (y7.q0) next;
                        dVar2.d = y6Var;
                        m0Var.f = new y7.r0(dVar2);
                        sb.m.a.execute(new a8.fg(caVar, new a8.ng(m0Var, 0), m7Var, caVar.b(), 8));
                    }
                    hashMap.remove(m7Var);
                    return;
                }
                return;
            default:
                ((ThreadLocal) ((com.google.firebase.messaging.q) this.b).d).set(Boolean.TRUE);
                return;
        }
    }
}
