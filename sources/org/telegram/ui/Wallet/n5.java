package org.telegram.ui.Wallet;

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.sa;
import org.telegram.ui.bu0;
import x7.fa;
import z7.de;
import z7.ed;
import z7.fb;
import z7.hb;
import z7.lg;
import z7.ma;
import z7.wf;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class n5 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ n5(Object obj, int i10) {
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
        pg.c1 c1Var = (pg.c1) this.b;
        if (!c1Var.f || c1Var.y.y) {
            return;
        }
        pg.c1.b(c1Var);
        GLES20.glBindFramebuffer(36160, 0);
        pg.c1 c1Var2 = (pg.c1) this.b;
        GLES20.glViewport(0, 0, c1Var2.n, c1Var2.r);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        pg.s0 s0Var = ((pg.c1) this.b).y.c;
        if (s0Var.r != null) {
            if (s0Var.D != null && s0Var.F != null && s0Var.E) {
                GLES20.glBindFramebuffer(36160, 0);
                pg.f1 f1Var = (pg.f1) s0Var.r.get("videoBlur");
                if (f1Var != null) {
                    GLES20.glUseProgram(f1Var.a);
                    GLES20.glUniformMatrix4fv(f1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(s0Var.y));
                    GLES20.glUniform1f(f1Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(f1Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, s0Var.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(f1Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    sa saVar = s0Var.F.m;
                    GLES20.glBindTexture(3553, saVar != null ? saVar.s[2] : -1);
                    if (s0Var.b == null || !(s0Var.i instanceof pg.d)) {
                        GLES20.glUniform1f(f1Var.d("eraser"), 0.0f);
                    } else {
                        GLES20.glUniform1f(f1Var.d("eraser"), 1.0f);
                        GLES20.glUniform1i(f1Var.d("mask"), 2);
                        GLES20.glActiveTexture(33986);
                        GLES20.glBindTexture(3553, s0Var.g());
                    }
                    GLES20.glBlendFunc(1, 0);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) s0Var.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) s0Var.n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (s0Var.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
            }
            if (s0Var.b != null) {
                s0Var.n(s0Var.g(), s0Var.b, (1.0f - (s0Var.I * 0.5f)) - (s0Var.J * 0.5f));
            } else if (s0Var.c != null) {
                s0Var.o(s0Var.j(), s0Var.g(), s0Var.c, 1.0f);
            } else {
                int j3 = s0Var.j();
                f7 = 0.0f;
                pg.f1 f1Var2 = (pg.f1) s0Var.r.get(s0Var.G ? "maskingBlit" : "blit");
                if (j3 != 0 && f1Var2 != null) {
                    GLES20.glUseProgram(f1Var2.a);
                    f10 = 0.5f;
                    GLES20.glUniformMatrix4fv(f1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(s0Var.y));
                    GLES20.glUniform1f(f1Var2.d("alpha"), 1.0f);
                    if (s0Var.G) {
                        GLES20.glUniform1i(f1Var2.d("texture"), 1);
                        GLES20.glUniform1i(f1Var2.d("mask"), 0);
                        GLES20.glUniform1f(f1Var2.d("preview"), 0.4f);
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, j3);
                        GLES20.glActiveTexture(33985);
                        GLES20.glBindTexture(3553, s0Var.l.c());
                    } else {
                        GLES20.glUniform1i(f1Var2.d("texture"), 0);
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, j3);
                    }
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) s0Var.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) s0Var.n);
                    GLES20.glEnableVertexAttribArray(1);
                    GLES20.glDrawArrays(5, 0, 4);
                    w7.m6.a();
                    i10 = s0Var.q;
                    if (i10 != 0 && s0Var.d != null && s0Var.I > f7) {
                        s0Var.o(i10, s0Var.g(), s0Var.d, (s0Var.J * f10) + (s0Var.I * f10));
                    }
                }
                f10 = 0.5f;
                i10 = s0Var.q;
                if (i10 != 0) {
                    s0Var.o(i10, s0Var.g(), s0Var.d, (s0Var.J * f10) + (s0Var.I * f10));
                }
            }
            f7 = 0.0f;
            f10 = 0.5f;
            i10 = s0Var.q;
            if (i10 != 0) {
            }
        }
        GLES20.glBlendFunc(1, 771);
        pg.c1 c1Var3 = (pg.c1) this.b;
        c1Var3.b.eglSwapBuffers(c1Var3.c, c1Var3.e);
        pg.e1 e1Var = ((pg.c1) this.b).y;
        if (!e1Var.s) {
            e1Var.s = true;
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.q0(this, 12));
        }
        if (((pg.c1) this.b).h) {
            return;
        }
        ((pg.c1) this.b).h = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x03d4, code lost:
    
        if (r14 < 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x041b, code lost:
    
        if (r10 < 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x043e, code lost:
    
        if (r10 > 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03f8, code lost:
    
        if (r14 > 0) goto L121;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int R;
        int i10;
        int i11;
        e9.l lVar = null;
        switch (this.a) {
            case 0:
                q5 q5Var = (q5) this.b;
                m5 m5Var = q5Var.K;
                if (q5Var.s) {
                    m5Var.b(System.nanoTime());
                    q5Var.R = m5Var.a ? Math.max(-15.0f, Math.min(15.0f, m5Var.b - m5Var.d)) : 0.0f;
                    float b10 = q5.b((m5Var.a ? Math.max(-15.0f, Math.min(15.0f, m5Var.c - m5Var.e)) : 0.0f) * 1.5f, -15.0f, 15.0f);
                    float f7 = q5Var.R;
                    float f10 = q5Var.S;
                    float y3 = com.google.android.gms.internal.vision.e2.y(f7, f10, 1.0f, f10);
                    q5Var.S = y3;
                    float f11 = q5Var.T;
                    float y10 = com.google.android.gms.internal.vision.e2.y(b10, f11, 1.0f, f11);
                    q5Var.T = y10;
                    float f12 = q5Var.P;
                    k5 k5Var = q5Var.a.f0;
                    float f13 = (y3 * f12) + k5Var.i + q5Var.O;
                    q5Var.N = f13;
                    float f14 = (y10 * f12) + k5Var.d;
                    q5Var.Q = f14;
                    q5Var.a(f13, f14);
                    q5Var.postOnAnimation(this);
                    return;
                }
                return;
            case 1:
                ((p4.s0) this.b).c();
                return;
            case 2:
                p8.a aVar = (p8.a) this.b;
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
            case 3:
                a();
                return;
            case 4:
                qg.j jVar = ((bu0) this.b).S0;
                if (jVar instanceof qg.w2) {
                    ((qg.w2) jVar).getEditText();
                    return;
                }
                return;
            case 5:
                rg.s0 s0Var = (rg.s0) this.b;
                ArrayList arrayList = s0Var.e3;
                if (s0Var.l3) {
                    if (!arrayList.isEmpty() && (R = RecyclerView.R((rg.o1) hg.c.g(1, arrayList))) >= 0) {
                        View m10 = s0Var.W2.m(R + 1);
                        if (m10 != null) {
                            s0Var.b3 = false;
                            s0Var.x1(m10, true);
                            s0Var.v0(0, m10.getTop() - ((s0Var.getMeasuredHeight() - m10.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                        }
                    }
                    s0Var.y1();
                    return;
                }
                return;
            case 6:
                s4.z zVar = (s4.z) this.b;
                s4.w wVar = zVar.x;
                if (zVar.c != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = zVar.R;
                    long j10 = j3 != Long.MIN_VALUE ? currentTimeMillis - j3 : 0L;
                    s4.p0 layoutManager = zVar.H.getLayoutManager();
                    if (zVar.Q == null) {
                        zVar.Q = new Rect();
                    }
                    layoutManager.c(zVar.c.a, zVar.Q);
                    if (layoutManager.d()) {
                        int i12 = (int) (zVar.s + zVar.n);
                        i10 = (i12 - zVar.Q.left) - zVar.H.getPaddingLeft();
                        float f15 = zVar.n;
                        if (f15 < 0.0f) {
                        }
                        if (f15 > 0.0f) {
                            i10 = ((zVar.c.a.getWidth() + i12) + zVar.Q.right) - (zVar.H.getWidth() - zVar.H.getPaddingRight());
                            break;
                        }
                    }
                    i10 = 0;
                    if (layoutManager.e()) {
                        int i13 = (int) (zVar.v + zVar.r);
                        i11 = (i13 - zVar.Q.top) - zVar.H.getPaddingTop();
                        float f16 = zVar.r;
                        if (f16 < 0.0f) {
                        }
                        if (f16 > 0.0f) {
                            i11 = ((zVar.c.a.getHeight() + i13) + zVar.Q.bottom) - (zVar.H.getHeight() - zVar.H.getPaddingBottom());
                            break;
                        }
                    }
                    i11 = 0;
                    if (i10 != 0) {
                        int width = zVar.c.a.getWidth();
                        zVar.H.getWidth();
                        i10 = wVar.i(width, i10, j10);
                    }
                    if (i11 != 0) {
                        int height = zVar.c.a.getHeight();
                        zVar.H.getHeight();
                        i11 = wVar.i(height, i11, j10);
                    }
                    if (i10 == 0 && i11 == 0) {
                        zVar.R = Long.MIN_VALUE;
                        return;
                    }
                    if (zVar.R == Long.MIN_VALUE) {
                        zVar.R = currentTimeMillis;
                    }
                    zVar.H.scrollBy(i10, i11);
                    s4.d1 d1Var = zVar.c;
                    if (d1Var != null) {
                        zVar.n(d1Var);
                    }
                    zVar.H.removeCallbacks(zVar.I);
                    RecyclerView recyclerView = zVar.H;
                    WeakHashMap weakHashMap = r0.i0.a;
                    recyclerView.postOnAnimation(this);
                    return;
                }
                return;
            case 7:
                tg.z0 z0Var = (tg.z0) this.b;
                String str = z0Var.n0;
                if (str != null) {
                    z0Var.U(z0Var.r0, str, false);
                    return;
                }
                return;
            case 8:
                tg.m1 m1Var = (tg.m1) this.b;
                String str2 = m1Var.o0;
                if (str2 != null) {
                    tg.m1.V(m1Var, str2);
                    return;
                }
                return;
            case 9:
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
                    long j11 = currentAnimationTimeMillis2 - aVar2.f;
                    aVar2.f = currentAnimationTimeMillis2;
                    dVar.G.scrollListBy((int) (j11 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar2.d));
                    WeakHashMap weakHashMap2 = r0.i0.a;
                    r1Var.postOnAnimation(this);
                    return;
                }
                return;
            case 10:
                ((ThreadLocal) ((com.google.firebase.messaging.s) this.b).e).set(Boolean.TRUE);
                return;
            case 11:
                fa faVar = (fa) this.b;
                x7.o7 o7Var = x7.o7.f;
                HashMap hashMap = faVar.j;
                x7.f fVar = (x7.f) hashMap.get(o7Var);
                if (fVar != null) {
                    x7.f fVar2 = fVar;
                    x7.a aVar3 = fVar2.a;
                    if (aVar3 == null) {
                        x7.f fVar3 = fVar2;
                        x7.a aVar4 = new x7.a(fVar3, fVar3.c);
                        fVar2.a = aVar4;
                        aVar3 = aVar4;
                    }
                    Iterator it = aVar3.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Object obj = (Collection) fVar.c.get(next);
                        if (obj == null) {
                            obj = new ArrayList(3);
                        }
                        List list = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list instanceof RandomAccess ? new x7.b(fVar, next, list, null) : new e9.l(fVar, next, list, (e9.l) null));
                        Collections.sort(arrayList2);
                        x7.z6 z6Var = new x7.z6();
                        int size = arrayList2.size();
                        long j12 = 0;
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj2 = arrayList2.get(i14);
                            i14++;
                            j12 = ((Long) obj2).longValue() + j12;
                        }
                        z6Var.c = Long.valueOf((j12 / arrayList2.size()) & Long.MAX_VALUE);
                        z6Var.a = Long.valueOf(fa.a(arrayList2, 100.0d) & Long.MAX_VALUE);
                        z6Var.f = Long.valueOf(fa.a(arrayList2, 75.0d) & Long.MAX_VALUE);
                        z6Var.e = Long.valueOf(fa.a(arrayList2, 50.0d) & Long.MAX_VALUE);
                        z6Var.d = Long.valueOf(fa.a(arrayList2, 25.0d) & Long.MAX_VALUE);
                        z6Var.b = Long.valueOf(fa.a(arrayList2, 0.0d) & Long.MAX_VALUE);
                        x7.a7 a7Var = new x7.a7(z6Var);
                        int size2 = arrayList2.size();
                        com.google.firebase.messaging.n nVar = new com.google.firebase.messaging.n();
                        nVar.c = x7.m7.b;
                        v7.k kVar = new v7.k(9, false);
                        kVar.c = Integer.valueOf(size2 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        kVar.b = (x7.r0) next;
                        kVar.d = a7Var;
                        nVar.f = new x7.s0(kVar);
                        qb.m.a.execute(new com.google.android.gms.internal.cast.p(faVar, new a5.a(nVar, 0), o7Var, faVar.b(), 7));
                    }
                    hashMap.remove(o7Var);
                    return;
                }
                return;
            case 12:
                ((y2.j) this.b).b();
                return;
            case 13:
                for (Thread thread : yf.e.w.keySet()) {
                    if (!thread.isAlive()) {
                        yf.e.w.remove(thread);
                    }
                }
                if (yf.e.w.isEmpty()) {
                    yf.e.x = false;
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(((yf.e) this.b).p, 5000L);
                    return;
                }
            case 14:
                yf.x xVar = (yf.x) this.b;
                if (xVar.F.get()) {
                    xVar.invalidate();
                    xVar.H.postDelayed(this, 300L);
                    return;
                }
                return;
            case 15:
                z4.g gVar = (z4.g) this.b;
                gVar.setScrollState(0);
                gVar.s();
                return;
            default:
                wf wfVar = (wf) this.b;
                hb hbVar = hb.N1;
                HashMap hashMap2 = wfVar.j;
                lg lgVar = (lg) hashMap2.get(hbVar);
                if (lgVar != null) {
                    lg lgVar2 = lgVar;
                    ed edVar = lgVar2.a;
                    if (edVar == null) {
                        lg lgVar3 = lgVar2;
                        ed edVar2 = new ed(lgVar3, lgVar3.c);
                        lgVar2.a = edVar2;
                        edVar = edVar2;
                    }
                    Iterator it2 = edVar.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        Object obj3 = (Collection) lgVar.c.get(next2);
                        if (obj3 == null) {
                            obj3 = new ArrayList(3);
                        }
                        List list2 = (List) obj3;
                        ArrayList arrayList3 = new ArrayList(list2 instanceof RandomAccess ? new de(lgVar, next2, list2, lVar) : new e9.l(lgVar, next2, list2, lVar));
                        Collections.sort(arrayList3);
                        x7.z6 z6Var2 = new x7.z6();
                        int size3 = arrayList3.size();
                        long j13 = 0;
                        int i15 = 0;
                        while (i15 < size3) {
                            Object obj4 = arrayList3.get(i15);
                            i15++;
                            j13 = ((Long) obj4).longValue() + j13;
                        }
                        z6Var2.c = Long.valueOf((j13 / arrayList3.size()) & Long.MAX_VALUE);
                        z6Var2.a = Long.valueOf(wf.a(arrayList3, 100.0d) & Long.MAX_VALUE);
                        z6Var2.f = Long.valueOf(wf.a(arrayList3, 75.0d) & Long.MAX_VALUE);
                        z6Var2.e = Long.valueOf(wf.a(arrayList3, 50.0d) & Long.MAX_VALUE);
                        z6Var2.d = Long.valueOf(wf.a(arrayList3, 25.0d) & Long.MAX_VALUE);
                        z6Var2.b = Long.valueOf(wf.a(arrayList3, 0.0d) & Long.MAX_VALUE);
                        ma maVar = new ma(z6Var2);
                        int size4 = arrayList3.size();
                        m.q3 q3Var = new m.q3();
                        q3Var.c = fb.b;
                        v7.k kVar2 = new v7.k(15, false);
                        kVar2.c = Integer.valueOf(size4 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        kVar2.b = (z7.i1) next2;
                        kVar2.d = maVar;
                        q3Var.h = new z7.j1(kVar2);
                        wf wfVar2 = wfVar;
                        hb hbVar2 = hbVar;
                        qb.m.a.execute(new com.google.android.gms.internal.cast.p(wfVar2, new a5.a(q3Var, 0), hbVar2, wfVar.c(), 8));
                        hbVar = hbVar2;
                        wfVar = wfVar2;
                        lVar = null;
                    }
                    hashMap2.remove(hbVar);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ n5(wf wfVar) {
        this.a = 16;
        hb hbVar = hb.b;
        this.b = wfVar;
    }
}
