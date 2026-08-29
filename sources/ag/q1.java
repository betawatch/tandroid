package ag;

import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bg.f4;
import eg.w2;
import j7.f7;
import j7.g7;
import j7.la;
import j7.s7;
import j7.u7;
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
import l7.de;
import l7.ed;
import l7.fb;
import l7.hb;
import l7.lg;
import l7.wf;
import lh.d4;
import lh.i9;
import lh.z8;
import m.s3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ma;
import org.telegram.ui.ws0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class q1 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public q1(com.google.android.gms.common.api.internal.m1 m1Var, p2.u uVar) {
        this.a = 18;
        this.b = uVar;
    }

    private final void a() {
        Object obj;
        synchronized (((androidx.lifecycle.z) this.b).a) {
            obj = ((androidx.lifecycle.z) this.b).f;
            ((androidx.lifecycle.z) this.b).f = androidx.lifecycle.z.k;
        }
        ((androidx.lifecycle.z) this.b).j(obj);
    }

    private final void b() {
        b8.a aVar = (b8.a) this.b;
        synchronized (aVar.a) {
            try {
                if (aVar.b()) {
                    Log.e("WakeLock", String.valueOf(aVar.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    aVar.d();
                    if (aVar.b()) {
                        aVar.c = 1;
                        aVar.e();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x038d, code lost:
    
        if (r11 < 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x03b0, code lost:
    
        if (r11 > 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x036a, code lost:
    
        if (r10 > 0) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03f3  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int R;
        int i10;
        int i11;
        f2.n1 n1Var;
        double d = 75.0d;
        j7.e eVar = null;
        int i12 = 3;
        switch (this.a) {
            case 0:
                r1 r1Var = (r1) this.b;
                if (!r1Var.f || r1Var.y.y) {
                    return;
                }
                r1.b(r1Var);
                GLES20.glBindFramebuffer(36160, 0);
                r1 r1Var2 = (r1) this.b;
                GLES20.glViewport(0, 0, r1Var2.n, r1Var2.r);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
                f1 f1Var = ((r1) this.b).y.c;
                if (f1Var.r != null) {
                    if (f1Var.D != null && f1Var.F != null && f1Var.E) {
                        GLES20.glBindFramebuffer(36160, 0);
                        u1 u1Var = (u1) f1Var.r.get("videoBlur");
                        if (u1Var != null) {
                            GLES20.glUseProgram(u1Var.a);
                            GLES20.glUniformMatrix4fv(u1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(f1Var.y));
                            GLES20.glUniform1f(u1Var.d("flipy"), 0.0f);
                            GLES20.glUniform1i(u1Var.d("texture"), 0);
                            GLES20.glActiveTexture(33984);
                            GLES20.glBindTexture(3553, f1Var.D.c());
                            GLES20.glTexParameteri(3553, 10241, 9729);
                            GLES20.glUniform1i(u1Var.d("blured"), 1);
                            GLES20.glActiveTexture(33985);
                            ma maVar = f1Var.F.m;
                            GLES20.glBindTexture(3553, maVar != null ? maVar.s[2] : -1);
                            if (f1Var.b == null || !(f1Var.i instanceof d)) {
                                GLES20.glUniform1f(u1Var.d("eraser"), 0.0f);
                            } else {
                                GLES20.glUniform1f(u1Var.d("eraser"), 1.0f);
                                GLES20.glUniform1i(u1Var.d("mask"), 2);
                                GLES20.glActiveTexture(33986);
                                GLES20.glBindTexture(3553, f1Var.g());
                            }
                            GLES20.glBlendFunc(1, 0);
                            GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) f1Var.m);
                            GLES20.glEnableVertexAttribArray(0);
                            GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) f1Var.n);
                            GLES20.glEnableVertexAttribArray(1);
                            synchronized (f1Var.F.h) {
                                GLES20.glDrawArrays(5, 0, 4);
                            }
                        }
                    }
                    if (f1Var.b != null) {
                        f1Var.n(f1Var.g(), f1Var.b, (1.0f - (f1Var.I * 0.5f)) - (f1Var.J * 0.5f));
                    } else if (f1Var.c != null) {
                        f1Var.o(f1Var.j(), f1Var.g(), f1Var.c, 1.0f);
                    } else {
                        int j10 = f1Var.j();
                        u1 u1Var2 = (u1) f1Var.r.get(f1Var.G ? "maskingBlit" : "blit");
                        if (j10 != 0 && u1Var2 != null) {
                            GLES20.glUseProgram(u1Var2.a);
                            GLES20.glUniformMatrix4fv(u1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(f1Var.y));
                            GLES20.glUniform1f(u1Var2.d("alpha"), 1.0f);
                            if (f1Var.G) {
                                GLES20.glUniform1i(u1Var2.d("texture"), 1);
                                GLES20.glUniform1i(u1Var2.d("mask"), 0);
                                GLES20.glUniform1f(u1Var2.d("preview"), 0.4f);
                                GLES20.glActiveTexture(33984);
                                GLES20.glBindTexture(3553, j10);
                                GLES20.glActiveTexture(33985);
                                GLES20.glBindTexture(3553, f1Var.l.c());
                            } else {
                                GLES20.glUniform1i(u1Var2.d("texture"), 0);
                                GLES20.glActiveTexture(33984);
                                GLES20.glBindTexture(3553, j10);
                            }
                            GLES20.glBlendFunc(1, 771);
                            GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) f1Var.m);
                            GLES20.glEnableVertexAttribArray(0);
                            GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) f1Var.n);
                            GLES20.glEnableVertexAttribArray(1);
                            GLES20.glDrawArrays(5, 0, 4);
                            h7.t.a();
                        }
                    }
                    int i13 = f1Var.q;
                    if (i13 != 0 && f1Var.d != null && f1Var.I > 0.0f) {
                        f1Var.o(i13, f1Var.g(), f1Var.d, (f1Var.J * 0.5f) + (f1Var.I * 0.5f));
                    }
                }
                GLES20.glBlendFunc(1, 771);
                r1 r1Var3 = (r1) this.b;
                r1Var3.b.eglSwapBuffers(r1Var3.c, r1Var3.e);
                t1 t1Var = ((r1) this.b).y;
                if (!t1Var.s) {
                    t1Var.s = true;
                    AndroidUtilities.runOnUIThread(new a4.g(this, 3));
                }
                if (((r1) this.b).h) {
                    return;
                }
                ((r1) this.b).h = true;
                return;
            case 1:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e10) {
                    if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e10;
                    }
                    return;
                } catch (NullPointerException e11) {
                    if (!TextUtils.equals(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e11;
                    }
                    return;
                }
            case 2:
                androidx.biometric.g0 g0Var = (androidx.biometric.g0) this.b;
                Context n10 = g0Var.n();
                if (n10 == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                } else {
                    g0Var.y0.f(1);
                    g0Var.y0.e(n10.getString(R.string.fingerprint_dialog_touch_sensor));
                    return;
                }
            case 3:
                androidx.fragment.app.p pVar = (androidx.fragment.app.p) this.b;
                pVar.j0.onDismiss(pVar.r0);
                return;
            case 4:
                androidx.fragment.app.s sVar = (androidx.fragment.app.s) this.b;
                if (sVar.U != null) {
                    sVar.j().getClass();
                    return;
                }
                return;
            case 5:
                ((androidx.fragment.app.j0) this.b).A(true);
                return;
            case 6:
                a();
                return;
            case 7:
                androidx.mediarouter.app.s sVar2 = (androidx.mediarouter.app.s) this.b;
                sVar2.i(true);
                sVar2.Q.requestLayout();
                sVar2.Q.getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.h(sVar2, 0));
                return;
            case 8:
                androidx.mediarouter.app.s sVar3 = ((androidx.mediarouter.app.q) this.b).b;
                if (sVar3.Y != null) {
                    sVar3.Y = null;
                    if (sVar3.o0) {
                        sVar3.q(sVar3.p0);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                b();
                return;
            case 10:
                bg.k kVar = ((ws0) this.b).O0;
                if (kVar instanceof f4) {
                    ((f4) kVar).getEditText();
                    return;
                }
                return;
            case 11:
                ((c2.b1) this.b).c();
                return;
            case 12:
                cg.h1 h1Var = (cg.h1) this.b;
                ArrayList arrayList = h1Var.c3;
                if (h1Var.j3) {
                    if (!arrayList.isEmpty() && (R = RecyclerView.R((cg.j2) j7.l1.i(1, arrayList))) >= 0) {
                        View m10 = h1Var.U2.m(R + 1);
                        if (m10 != null) {
                            h1Var.Z2 = false;
                            h1Var.w1(m10, true);
                            h1Var.v0(0, m10.getTop() - ((h1Var.getMeasuredHeight() - m10.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                        }
                    }
                    h1Var.x1();
                    return;
                }
                return;
            case 13:
                ((com.google.android.exoplayer2.upstream.o0) this.b).c();
                return;
            case 14:
                com.google.android.gms.common.api.internal.g0 g0Var2 = (com.google.android.gms.common.api.internal.g0) this.b;
                w5.e eVar2 = g0Var2.d;
                Context context = g0Var2.c;
                eVar2.getClass();
                if (w5.g.a.getAndSet(true)) {
                    return;
                }
                try {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                    if (notificationManager != null) {
                        notificationManager.cancel(10436);
                        return;
                    }
                    return;
                } catch (SecurityException e12) {
                    Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e12);
                    return;
                }
            case 15:
                ((com.google.android.gms.common.api.internal.p0) this.b).f();
                return;
            case 16:
                com.google.android.gms.common.api.c cVar = ((com.google.android.gms.common.api.internal.p0) ((o1) this.b).b).b;
                cVar.c(cVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 17:
                ((com.google.android.gms.common.api.internal.d1) this.b).j.b(new w5.a(4));
                return;
            case 18:
                return;
            case 19:
                com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
                xVar.o.lock();
                try {
                    com.google.android.gms.common.api.internal.x.l(xVar);
                    return;
                } finally {
                    xVar.o.unlock();
                }
            case 20:
                eg.g2 g2Var = (eg.g2) this.b;
                String str = g2Var.j0;
                if (str != null) {
                    g2Var.T(g2Var.n0, str, false);
                    return;
                }
                return;
            case 21:
                w2 w2Var = (w2) this.b;
                String str2 = w2Var.k0;
                if (str2 != null) {
                    w2.U(w2Var, str2);
                    return;
                }
                return;
            case 22:
                f2.e0 e0Var = (f2.e0) this.b;
                f2.b0 b0Var = e0Var.x;
                if (e0Var.c != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j11 = e0Var.N;
                    long j12 = j11 != Long.MIN_VALUE ? currentTimeMillis - j11 : 0L;
                    f2.w0 layoutManager = e0Var.D.getLayoutManager();
                    if (e0Var.M == null) {
                        e0Var.M = new Rect();
                    }
                    layoutManager.c(e0Var.c.a, e0Var.M);
                    if (layoutManager.d()) {
                        int i14 = (int) (e0Var.s + e0Var.n);
                        int paddingLeft = (i14 - e0Var.M.left) - e0Var.D.getPaddingLeft();
                        float f9 = e0Var.n;
                        if (f9 >= 0.0f || paddingLeft >= 0) {
                            if (f9 > 0.0f) {
                                i10 = ((e0Var.c.a.getWidth() + i14) + e0Var.M.right) - (e0Var.D.getWidth() - e0Var.D.getPaddingRight());
                                break;
                            }
                        } else {
                            i10 = paddingLeft;
                        }
                        if (layoutManager.e()) {
                            int i15 = (int) (e0Var.v + e0Var.r);
                            i11 = (i15 - e0Var.M.top) - e0Var.D.getPaddingTop();
                            float f10 = e0Var.r;
                            if (f10 < 0.0f) {
                            }
                            if (f10 > 0.0f) {
                                i11 = ((e0Var.c.a.getHeight() + i15) + e0Var.M.bottom) - (e0Var.D.getHeight() - e0Var.D.getPaddingBottom());
                                break;
                            }
                        }
                        i11 = 0;
                        if (i10 != 0) {
                            int width = e0Var.c.a.getWidth();
                            e0Var.D.getWidth();
                            i10 = b0Var.i(width, i10, j12);
                        }
                        if (i11 != 0) {
                            int height = e0Var.c.a.getHeight();
                            e0Var.D.getHeight();
                            i11 = b0Var.i(height, i11, j12);
                        }
                        if (i10 != 0 && i11 == 0) {
                            e0Var.N = Long.MIN_VALUE;
                            return;
                        }
                        if (e0Var.N == Long.MIN_VALUE) {
                            e0Var.N = currentTimeMillis;
                        }
                        e0Var.D.scrollBy(i10, i11);
                        n1Var = e0Var.c;
                        if (n1Var != null) {
                            e0Var.n(n1Var);
                        }
                        e0Var.D.removeCallbacks(e0Var.E);
                        RecyclerView recyclerView = e0Var.D;
                        WeakHashMap weakHashMap = r0.j0.a;
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
                    if (e0Var.N == Long.MIN_VALUE) {
                    }
                    e0Var.D.scrollBy(i10, i11);
                    n1Var = e0Var.c;
                    if (n1Var != null) {
                    }
                    e0Var.D.removeCallbacks(e0Var.E);
                    RecyclerView recyclerView2 = e0Var.D;
                    WeakHashMap weakHashMap2 = r0.j0.a;
                    recyclerView2.postOnAnimation(this);
                    return;
                }
                return;
            case 23:
                ((ThreadLocal) ((com.google.firebase.messaging.s) this.b).e).set(Boolean.TRUE);
                return;
            case 24:
                i.e eVar3 = (i.e) this.b;
                eVar3.a(true);
                eVar3.invalidateSelf();
                return;
            case 25:
                la laVar = (la) this.b;
                u7 u7Var = u7.f;
                HashMap hashMap = laVar.j;
                j7.h hVar = (j7.h) hashMap.get(u7Var);
                if (hVar != null) {
                    j7.h hVar2 = hVar;
                    j7.a aVar = hVar2.a;
                    if (aVar == null) {
                        j7.h hVar3 = hVar2;
                        j7.a aVar2 = new j7.a(hVar3, hVar3.c);
                        hVar2.a = aVar2;
                        aVar = aVar2;
                    }
                    Iterator it = aVar.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Object obj = (Collection) hVar.c.get(next);
                        if (obj == null) {
                            obj = new ArrayList(3);
                        }
                        List list = (List) obj;
                        ArrayList arrayList2 = new ArrayList(list instanceof RandomAccess ? new j7.b(hVar, next, list, null) : new j7.e(hVar, next, list, (j7.e) null));
                        Collections.sort(arrayList2);
                        f7 f7Var = new f7();
                        int size = arrayList2.size();
                        long j13 = 0;
                        int i16 = 0;
                        while (i16 < size) {
                            Object obj2 = arrayList2.get(i16);
                            i16++;
                            j13 = ((Long) obj2).longValue() + j13;
                        }
                        f7Var.c = Long.valueOf((j13 / arrayList2.size()) & Long.MAX_VALUE);
                        f7Var.a = Long.valueOf(la.a(arrayList2, 100.0d) & Long.MAX_VALUE);
                        f7Var.f = Long.valueOf(la.a(arrayList2, d) & Long.MAX_VALUE);
                        f7Var.e = Long.valueOf(la.a(arrayList2, 50.0d) & Long.MAX_VALUE);
                        f7Var.d = Long.valueOf(la.a(arrayList2, 25.0d) & Long.MAX_VALUE);
                        f7Var.b = Long.valueOf(la.a(arrayList2, 0.0d) & Long.MAX_VALUE);
                        g7 g7Var = new g7(f7Var);
                        int size2 = arrayList2.size();
                        bg.c2 c2Var = new bg.c2();
                        c2Var.c = s7.b;
                        androidx.biometric.e eVar4 = new androidx.biometric.e(22, false);
                        eVar4.c = Integer.valueOf(size2 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        eVar4.b = (j7.w0) next;
                        eVar4.d = g7Var;
                        c2Var.f = new j7.x0(eVar4);
                        ab.q.a.execute(new c2.p(laVar, new j2(c2Var, 0), u7Var, laVar.b(), false, 5));
                        d = 75.0d;
                    }
                    hashMap.remove(u7Var);
                    return;
                }
                return;
            case 26:
                for (Thread thread : jf.g.w.keySet()) {
                    if (!thread.isAlive()) {
                        jf.g.w.remove(thread);
                    }
                }
                if (jf.g.w.isEmpty()) {
                    jf.g.x = false;
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(((jf.g) this.b).p, 5000L);
                    return;
                }
            case 27:
                jf.a0 a0Var = (jf.a0) this.b;
                if (a0Var.B.get()) {
                    a0Var.invalidate();
                    a0Var.D.postDelayed(this, 300L);
                    return;
                }
                return;
            case 28:
                wf wfVar = (wf) this.b;
                hb hbVar = hb.J1;
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
                            obj3 = new ArrayList(i12);
                        }
                        List list2 = (List) obj3;
                        ArrayList arrayList3 = new ArrayList(list2 instanceof RandomAccess ? new de(lgVar, next2, list2, eVar) : new j7.e(lgVar, next2, list2, eVar));
                        Collections.sort(arrayList3);
                        f7 f7Var2 = new f7();
                        int size3 = arrayList3.size();
                        long j14 = 0;
                        int i17 = 0;
                        while (i17 < size3) {
                            Object obj4 = arrayList3.get(i17);
                            i17++;
                            j14 = ((Long) obj4).longValue() + j14;
                        }
                        HashMap hashMap3 = hashMap2;
                        f7Var2.c = Long.valueOf((j14 / arrayList3.size()) & Long.MAX_VALUE);
                        f7Var2.a = Long.valueOf(wf.a(arrayList3, 100.0d) & Long.MAX_VALUE);
                        f7Var2.f = Long.valueOf(wf.a(arrayList3, 75.0d) & Long.MAX_VALUE);
                        f7Var2.e = Long.valueOf(wf.a(arrayList3, 50.0d) & Long.MAX_VALUE);
                        f7Var2.d = Long.valueOf(wf.a(arrayList3, 25.0d) & Long.MAX_VALUE);
                        f7Var2.b = Long.valueOf(wf.a(arrayList3, 0.0d) & Long.MAX_VALUE);
                        l7.ma maVar2 = new l7.ma(f7Var2);
                        int size4 = arrayList3.size();
                        s3 s3Var = new s3();
                        s3Var.c = fb.b;
                        l3.g0 g0Var3 = new l3.g0(3, false);
                        g0Var3.c = Integer.valueOf(size4 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        g0Var3.b = (l7.i1) next2;
                        g0Var3.d = maVar2;
                        s3Var.h = new l7.j1(g0Var3);
                        wf wfVar2 = wfVar;
                        hb hbVar2 = hbVar;
                        ab.q.a.execute(new c2.p(wfVar2, new j2(s3Var, 0), hbVar2, wfVar.c(), false, 7));
                        hbVar = hbVar2;
                        wfVar = wfVar2;
                        hashMap2 = hashMap3;
                        i12 = 3;
                        eVar = null;
                    }
                    hashMap2.remove(hbVar);
                    return;
                }
                return;
            default:
                d4 d4Var = (d4) this.b;
                if (d4Var.G1 && d4Var.X0) {
                    i9 i9Var = ((z8) d4Var.M1).d;
                    i9Var.h1 = false;
                    i9Var.P();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ q1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public /* synthetic */ q1(wf wfVar) {
        this.a = 28;
        hb hbVar = hb.b;
        this.b = wfVar;
    }
}
