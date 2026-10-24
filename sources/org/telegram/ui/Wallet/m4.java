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
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.pa;
import org.telegram.ui.jt0;
import z7.de;
import z7.ed;
import z7.fb;
import z7.hb;
import z7.ma;
import z7.mg;
import z7.wf;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class m4 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ m4(Object obj, int i10) {
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
        qg.c1 c1Var = (qg.c1) this.b;
        if (!c1Var.f || c1Var.y.y) {
            return;
        }
        qg.c1.b(c1Var);
        GLES20.glBindFramebuffer(36160, 0);
        qg.c1 c1Var2 = (qg.c1) this.b;
        GLES20.glViewport(0, 0, c1Var2.n, c1Var2.r);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        qg.s0 s0Var = ((qg.c1) this.b).y.c;
        if (s0Var.r != null) {
            if (s0Var.D != null && s0Var.F != null && s0Var.E) {
                GLES20.glBindFramebuffer(36160, 0);
                qg.f1 f1Var = (qg.f1) s0Var.r.get("videoBlur");
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
                    pa paVar = s0Var.F.m;
                    GLES20.glBindTexture(3553, paVar != null ? paVar.s[2] : -1);
                    if (s0Var.b == null || !(s0Var.i instanceof qg.d)) {
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
                int j10 = s0Var.j();
                f7 = 0.0f;
                qg.f1 f1Var2 = (qg.f1) s0Var.r.get(s0Var.G ? "maskingBlit" : "blit");
                if (j10 != 0 && f1Var2 != null) {
                    GLES20.glUseProgram(f1Var2.a);
                    f10 = 0.5f;
                    GLES20.glUniformMatrix4fv(f1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(s0Var.y));
                    GLES20.glUniform1f(f1Var2.d("alpha"), 1.0f);
                    if (s0Var.G) {
                        GLES20.glUniform1i(f1Var2.d("texture"), 1);
                        GLES20.glUniform1i(f1Var2.d("mask"), 0);
                        GLES20.glUniform1f(f1Var2.d("preview"), 0.4f);
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, j10);
                        GLES20.glActiveTexture(33985);
                        GLES20.glBindTexture(3553, s0Var.l.c());
                    } else {
                        GLES20.glUniform1i(f1Var2.d("texture"), 0);
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, j10);
                    }
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) s0Var.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) s0Var.n);
                    GLES20.glEnableVertexAttribArray(1);
                    GLES20.glDrawArrays(5, 0, 4);
                    w7.q6.a();
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
        qg.c1 c1Var3 = (qg.c1) this.b;
        c1Var3.b.eglSwapBuffers(c1Var3.c, c1Var3.e);
        qg.e1 e1Var = ((qg.c1) this.b).y;
        if (!e1Var.s) {
            e1Var.s = true;
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a2(this, 6));
        }
        if (((qg.c1) this.b).h) {
            return;
        }
        ((qg.c1) this.b).h = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x04a8, code lost:
    
        if (r11 < 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x04cb, code lost:
    
        if (r11 > 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0485, code lost:
    
        if (r10 > 0) goto L155;
     */
    /* JADX WARN: Removed duplicated region for block: B:169:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05ec  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        float f7;
        int i10;
        int i11;
        s4.b1 b1Var;
        int R;
        i2.h0 h0Var;
        e9.m mVar = null;
        switch (this.a) {
            case 0:
                o5 o5Var = (o5) this.b;
                if (o5Var.a == null || o5Var.d == null) {
                    return;
                }
                o5Var.R0();
                if (o5Var.r) {
                    o5Var.a.postOnAnimation(this);
                    return;
                }
                return;
            case 1:
                s5 s5Var = (s5) this.b;
                z5 z5Var = s5Var.G;
                if (s5Var.a0) {
                    long nanoTime = System.nanoTime();
                    if (z5Var.a) {
                        if (z5Var.j != 0) {
                            float f10 = (nanoTime - r7) * 1.0E-9f;
                            f7 = 0.0f;
                            float min = Math.min(0.1f, Math.max(0.0f, f10));
                            z5Var.j = nanoTime;
                            if (z5Var.i - z5Var.h >= 1000000000) {
                                float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
                                float f11 = z5Var.d;
                                z5Var.d = com.google.android.gms.internal.play_billing.k3.y(z5Var.b, f11, exp, f11);
                                float f12 = z5Var.e;
                                z5Var.e = com.google.android.gms.internal.play_billing.k3.y(z5Var.c, f12, exp, f12);
                            }
                            s5Var.K = !z5Var.a ? Math.max(-15.0f, Math.min(15.0f, z5Var.b - z5Var.d)) : f7;
                            float c10 = s5.c((!z5Var.a ? Math.max(-15.0f, Math.min(15.0f, z5Var.c - z5Var.e)) : f7) * 1.5f, -15.0f, 15.0f);
                            float f13 = s5Var.K;
                            float f14 = s5Var.L;
                            float y3 = com.google.android.gms.internal.play_billing.k3.y(f13, f14, 1.0f, f14);
                            s5Var.L = y3;
                            float f15 = s5Var.M;
                            float y10 = com.google.android.gms.internal.play_billing.k3.y(c10, f15, 1.0f, f15);
                            s5Var.M = y10;
                            float f16 = s5Var.e0;
                            s5Var.b((y3 * f16) + s5Var.N + s5Var.d0, (y10 * f16) + s5Var.O);
                            s5Var.postOnAnimation(this);
                            return;
                        }
                        z5Var.j = nanoTime;
                    }
                    f7 = 0.0f;
                    s5Var.K = !z5Var.a ? Math.max(-15.0f, Math.min(15.0f, z5Var.b - z5Var.d)) : f7;
                    float c102 = s5.c((!z5Var.a ? Math.max(-15.0f, Math.min(15.0f, z5Var.c - z5Var.e)) : f7) * 1.5f, -15.0f, 15.0f);
                    float f132 = s5Var.K;
                    float f142 = s5Var.L;
                    float y32 = com.google.android.gms.internal.play_billing.k3.y(f132, f142, 1.0f, f142);
                    s5Var.L = y32;
                    float f152 = s5Var.M;
                    float y102 = com.google.android.gms.internal.play_billing.k3.y(c102, f152, 1.0f, f152);
                    s5Var.M = y102;
                    float f162 = s5Var.e0;
                    s5Var.b((y32 * f162) + s5Var.N + s5Var.d0, (y102 * f162) + s5Var.O);
                    s5Var.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                ((p4.s0) this.b).c();
                return;
            case 3:
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
            case 4:
                a();
                return;
            case 5:
                rg.j jVar = ((jt0) this.b).S0;
                if (jVar instanceof rg.w2) {
                    ((rg.w2) jVar).getEditText();
                    return;
                }
                return;
            case 6:
                s4.y yVar = (s4.y) this.b;
                s4.v vVar = yVar.x;
                if (yVar.c != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = yVar.R;
                    long j11 = j10 != Long.MIN_VALUE ? currentTimeMillis - j10 : 0L;
                    s4.n0 layoutManager = yVar.H.getLayoutManager();
                    if (yVar.Q == null) {
                        yVar.Q = new Rect();
                    }
                    layoutManager.c(yVar.c.a, yVar.Q);
                    if (layoutManager.d()) {
                        int i12 = (int) (yVar.s + yVar.n);
                        int paddingLeft = (i12 - yVar.Q.left) - yVar.H.getPaddingLeft();
                        float f17 = yVar.n;
                        if (f17 >= 0.0f || paddingLeft >= 0) {
                            if (f17 > 0.0f) {
                                i10 = ((yVar.c.a.getWidth() + i12) + yVar.Q.right) - (yVar.H.getWidth() - yVar.H.getPaddingRight());
                                break;
                            }
                        } else {
                            i10 = paddingLeft;
                        }
                        if (layoutManager.e()) {
                            int i13 = (int) (yVar.v + yVar.r);
                            i11 = (i13 - yVar.Q.top) - yVar.H.getPaddingTop();
                            float f18 = yVar.r;
                            if (f18 < 0.0f) {
                            }
                            if (f18 > 0.0f) {
                                i11 = ((yVar.c.a.getHeight() + i13) + yVar.Q.bottom) - (yVar.H.getHeight() - yVar.H.getPaddingBottom());
                                break;
                            }
                        }
                        i11 = 0;
                        if (i10 != 0) {
                            int width = yVar.c.a.getWidth();
                            yVar.H.getWidth();
                            i10 = vVar.i(width, i10, j11);
                        }
                        if (i11 != 0) {
                            int height = yVar.c.a.getHeight();
                            yVar.H.getHeight();
                            i11 = vVar.i(height, i11, j11);
                        }
                        if (i10 != 0 && i11 == 0) {
                            yVar.R = Long.MIN_VALUE;
                            return;
                        }
                        if (yVar.R == Long.MIN_VALUE) {
                            yVar.R = currentTimeMillis;
                        }
                        yVar.H.scrollBy(i10, i11);
                        b1Var = yVar.c;
                        if (b1Var != null) {
                            yVar.n(b1Var);
                        }
                        yVar.H.removeCallbacks(yVar.I);
                        RecyclerView recyclerView = yVar.H;
                        WeakHashMap weakHashMap = r0.i0.a;
                        recyclerView.postOnAnimation(this);
                        return;
                    }
                    i10 = 0;
                    if (layoutManager.e()) {
                    }
                    i11 = 0;
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (yVar.R == Long.MIN_VALUE) {
                    }
                    yVar.H.scrollBy(i10, i11);
                    b1Var = yVar.c;
                    if (b1Var != null) {
                    }
                    yVar.H.removeCallbacks(yVar.I);
                    RecyclerView recyclerView2 = yVar.H;
                    WeakHashMap weakHashMap2 = r0.i0.a;
                    recyclerView2.postOnAnimation(this);
                    return;
                }
                return;
            case 7:
                sg.s0 s0Var = (sg.s0) this.b;
                ArrayList arrayList = s0Var.h3;
                if (s0Var.o3) {
                    if (!arrayList.isEmpty() && (R = RecyclerView.R((sg.p1) i2.o1.i(1, arrayList))) >= 0) {
                        View m10 = s0Var.Z2.m(R + 1);
                        if (m10 != null) {
                            s0Var.e3 = false;
                            s0Var.C1(m10, true);
                            s0Var.v0(0, m10.getTop() - ((s0Var.getMeasuredHeight() - m10.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                        }
                    }
                    s0Var.D1();
                    return;
                }
                return;
            case 8:
                sg.x1 x1Var = (sg.x1) this.b;
                try {
                    sg.w1 w1Var = x1Var.a;
                    if (w1Var != null) {
                        w1Var.g();
                        x1Var.invalidate();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 9:
                si.u0 u0Var = (si.u0) this.b;
                if (u0Var.W == 5 && (h0Var = u0Var.S) != null && u0Var.x) {
                    long M0 = h0Var.M0();
                    long j12 = u0Var.G;
                    if (M0 < j12 || M0 >= u0Var.H) {
                        u0Var.S.Z0(5, j12);
                    }
                    u0Var.d.getClass();
                    u0Var.i.postDelayed(this, 33L);
                    return;
                }
                return;
            case 10:
                u0.d dVar = (u0.d) this.b;
                m.s1 s1Var = dVar.c;
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
                        s1Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar2.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar2.a(currentAnimationTimeMillis2);
                    long j13 = currentAnimationTimeMillis2 - aVar2.f;
                    aVar2.f = currentAnimationTimeMillis2;
                    dVar.G.scrollListBy((int) (j13 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar2.d));
                    WeakHashMap weakHashMap3 = r0.i0.a;
                    s1Var.postOnAnimation(this);
                    return;
                }
                return;
            case 11:
                ug.x0 x0Var = (ug.x0) this.b;
                String str = x0Var.n0;
                if (str != null) {
                    x0Var.T(x0Var.r0, str, false);
                    return;
                }
                return;
            case 12:
                ug.l1 l1Var = (ug.l1) this.b;
                String str2 = l1Var.o0;
                if (str2 != null) {
                    ug.l1.U(l1Var, str2);
                    return;
                }
                return;
            case 13:
                x7.fa faVar = (x7.fa) this.b;
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
                        ArrayList arrayList2 = new ArrayList(list instanceof RandomAccess ? new x7.b(fVar, next, list, null) : new e9.m(fVar, next, list, (e9.m) null));
                        Collections.sort(arrayList2);
                        x7.z6 z6Var = new x7.z6();
                        int size = arrayList2.size();
                        long j14 = 0;
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj2 = arrayList2.get(i14);
                            i14++;
                            j14 = ((Long) obj2).longValue() + j14;
                        }
                        z6Var.c = Long.valueOf((j14 / arrayList2.size()) & Long.MAX_VALUE);
                        z6Var.a = Long.valueOf(x7.fa.a(arrayList2, 100.0d) & Long.MAX_VALUE);
                        z6Var.f = Long.valueOf(x7.fa.a(arrayList2, 75.0d) & Long.MAX_VALUE);
                        z6Var.e = Long.valueOf(x7.fa.a(arrayList2, 50.0d) & Long.MAX_VALUE);
                        z6Var.d = Long.valueOf(x7.fa.a(arrayList2, 25.0d) & Long.MAX_VALUE);
                        z6Var.b = Long.valueOf(x7.fa.a(arrayList2, 0.0d) & Long.MAX_VALUE);
                        x7.a7 a7Var = new x7.a7(z6Var);
                        int size2 = arrayList2.size();
                        com.google.firebase.messaging.l lVar = new com.google.firebase.messaging.l();
                        lVar.c = x7.m7.b;
                        u2.c cVar = new u2.c(10, false);
                        cVar.c = Integer.valueOf(size2 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        cVar.b = (x7.r0) next;
                        cVar.d = a7Var;
                        lVar.f = new x7.s0(cVar);
                        rb.m.a.execute(new com.google.android.gms.internal.cast.p(faVar, new a5.a(lVar, 0), o7Var, faVar.b(), 7));
                    }
                    hashMap.remove(o7Var);
                    return;
                }
                return;
            case 14:
                ((ThreadLocal) ((com.google.firebase.messaging.r) this.b).e).set(Boolean.TRUE);
                return;
            case 15:
                ((y2.j) this.b).b();
                return;
            case 16:
                z4.h hVar = (z4.h) this.b;
                hVar.setScrollState(0);
                hVar.s();
                return;
            case 17:
                wf wfVar = (wf) this.b;
                hb hbVar = hb.N1;
                HashMap hashMap2 = wfVar.j;
                mg mgVar = (mg) hashMap2.get(hbVar);
                if (mgVar != null) {
                    mg mgVar2 = mgVar;
                    ed edVar = mgVar2.a;
                    if (edVar == null) {
                        mg mgVar3 = mgVar2;
                        ed edVar2 = new ed(mgVar3, mgVar3.c);
                        mgVar2.a = edVar2;
                        edVar = edVar2;
                    }
                    Iterator it2 = edVar.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        Object obj3 = (Collection) mgVar.c.get(next2);
                        if (obj3 == null) {
                            obj3 = new ArrayList(3);
                        }
                        List list2 = (List) obj3;
                        ArrayList arrayList3 = new ArrayList(list2 instanceof RandomAccess ? new de(mgVar, next2, list2, mVar) : new e9.m(mgVar, next2, list2, mVar));
                        Collections.sort(arrayList3);
                        x7.z6 z6Var2 = new x7.z6();
                        int size3 = arrayList3.size();
                        long j15 = 0;
                        int i15 = 0;
                        while (i15 < size3) {
                            Object obj4 = arrayList3.get(i15);
                            i15++;
                            j15 = ((Long) obj4).longValue() + j15;
                        }
                        z6Var2.c = Long.valueOf((j15 / arrayList3.size()) & Long.MAX_VALUE);
                        z6Var2.a = Long.valueOf(wf.a(arrayList3, 100.0d) & Long.MAX_VALUE);
                        z6Var2.f = Long.valueOf(wf.a(arrayList3, 75.0d) & Long.MAX_VALUE);
                        z6Var2.e = Long.valueOf(wf.a(arrayList3, 50.0d) & Long.MAX_VALUE);
                        z6Var2.d = Long.valueOf(wf.a(arrayList3, 25.0d) & Long.MAX_VALUE);
                        z6Var2.b = Long.valueOf(wf.a(arrayList3, 0.0d) & Long.MAX_VALUE);
                        ma maVar = new ma(z6Var2);
                        int size4 = arrayList3.size();
                        m.s3 s3Var = new m.s3();
                        s3Var.c = fb.b;
                        u2.c cVar2 = new u2.c(16, false);
                        cVar2.c = Integer.valueOf(size4 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        cVar2.b = (z7.i1) next2;
                        cVar2.d = maVar;
                        s3Var.h = new z7.j1(cVar2);
                        wf wfVar2 = wfVar;
                        hb hbVar2 = hbVar;
                        rb.m.a.execute(new com.google.android.gms.internal.cast.p(wfVar2, new a5.a(s3Var, 0), hbVar2, wfVar.c(), 8));
                        hbVar = hbVar2;
                        wfVar = wfVar2;
                        mVar = null;
                    }
                    hashMap2.remove(hbVar);
                    return;
                }
                return;
            case 18:
                for (Thread thread : zf.e.w.keySet()) {
                    if (!thread.isAlive()) {
                        zf.e.w.remove(thread);
                    }
                }
                if (zf.e.w.isEmpty()) {
                    zf.e.x = false;
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(((zf.e) this.b).p, 5000L);
                    return;
                }
            default:
                zf.x xVar = (zf.x) this.b;
                if (xVar.F.get()) {
                    xVar.invalidate();
                    xVar.H.postDelayed(this, 300L);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ m4(wf wfVar) {
        this.a = 17;
        hb hbVar = hb.b;
        this.b = wfVar;
    }
}
