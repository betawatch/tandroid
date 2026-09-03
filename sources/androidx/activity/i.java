package androidx.activity;

import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.h0;
import androidx.fragment.app.j0;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.RecyclerView;
import c2.a1;
import cg.d1;
import cg.p1;
import cg.q1;
import com.google.android.gms.common.api.internal.e1;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.n1;
import com.google.android.gms.common.api.internal.p0;
import dg.b4;
import eg.g1;
import eg.i2;
import f2.b0;
import f2.e0;
import f2.l1;
import f2.v0;
import gg.f2;
import gg.v2;
import j7.p5;
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
import kf.a0;
import kf.k0;
import l7.f7;
import l7.g7;
import l7.la;
import l7.s7;
import l7.u7;
import l7.w0;
import l7.x0;
import l7.y0;
import m.s1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.ha;
import org.telegram.ui.mt0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class i implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public i(n1 n1Var, p2.w wVar) {
        this.a = 14;
        this.b = wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        float f10;
        float f11;
        int i10;
        cg.n1 n1Var = (cg.n1) this.b;
        if (!n1Var.f || n1Var.y.y) {
            return;
        }
        cg.n1.b(n1Var);
        GLES20.glBindFramebuffer(36160, 0);
        cg.n1 n1Var2 = (cg.n1) this.b;
        GLES20.glViewport(0, 0, n1Var2.n, n1Var2.r);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        d1 d1Var = ((cg.n1) this.b).y.c;
        if (d1Var.r != null) {
            if (d1Var.D != null && d1Var.F != null && d1Var.E) {
                GLES20.glBindFramebuffer(36160, 0);
                q1 q1Var = (q1) d1Var.r.get("videoBlur");
                if (q1Var != null) {
                    GLES20.glUseProgram(q1Var.a);
                    GLES20.glUniformMatrix4fv(q1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(d1Var.y));
                    GLES20.glUniform1f(q1Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(q1Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, d1Var.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(q1Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    ha haVar = d1Var.F.m;
                    GLES20.glBindTexture(3553, haVar != null ? haVar.s[2] : -1);
                    if (d1Var.b == null || !(d1Var.i instanceof cg.d)) {
                        GLES20.glUniform1f(q1Var.d("eraser"), 0.0f);
                    } else {
                        GLES20.glUniform1f(q1Var.d("eraser"), 1.0f);
                        GLES20.glUniform1i(q1Var.d("mask"), 2);
                        GLES20.glActiveTexture(33986);
                        GLES20.glBindTexture(3553, d1Var.g());
                    }
                    GLES20.glBlendFunc(1, 0);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) d1Var.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) d1Var.n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (d1Var.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
            }
            if (d1Var.b != null) {
                d1Var.n(d1Var.g(), d1Var.b, (1.0f - (d1Var.I * 0.5f)) - (d1Var.J * 0.5f));
            } else if (d1Var.c != null) {
                d1Var.o(d1Var.j(), d1Var.g(), d1Var.c, 1.0f);
            } else {
                int j10 = d1Var.j();
                f10 = 0.0f;
                q1 q1Var2 = (q1) d1Var.r.get(d1Var.G ? "maskingBlit" : "blit");
                if (j10 != 0 && q1Var2 != null) {
                    GLES20.glUseProgram(q1Var2.a);
                    f11 = 0.5f;
                    GLES20.glUniformMatrix4fv(q1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(d1Var.y));
                    GLES20.glUniform1f(q1Var2.d("alpha"), 1.0f);
                    if (d1Var.G) {
                        GLES20.glUniform1i(q1Var2.d("texture"), 1);
                        GLES20.glUniform1i(q1Var2.d("mask"), 0);
                        GLES20.glUniform1f(q1Var2.d("preview"), 0.4f);
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, j10);
                        GLES20.glActiveTexture(33985);
                        GLES20.glBindTexture(3553, d1Var.l.c());
                    } else {
                        GLES20.glUniform1i(q1Var2.d("texture"), 0);
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, j10);
                    }
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) d1Var.m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) d1Var.n);
                    GLES20.glEnableVertexAttribArray(1);
                    GLES20.glDrawArrays(5, 0, 4);
                    p5.a();
                    i10 = d1Var.q;
                    if (i10 != 0 && d1Var.d != null && d1Var.I > f10) {
                        d1Var.o(i10, d1Var.g(), d1Var.d, (d1Var.J * f11) + (d1Var.I * f11));
                    }
                }
                f11 = 0.5f;
                i10 = d1Var.q;
                if (i10 != 0) {
                    d1Var.o(i10, d1Var.g(), d1Var.d, (d1Var.J * f11) + (d1Var.I * f11));
                }
            }
            f10 = 0.0f;
            f11 = 0.5f;
            i10 = d1Var.q;
            if (i10 != 0) {
            }
        }
        GLES20.glBlendFunc(1, 771);
        cg.n1 n1Var3 = (cg.n1) this.b;
        n1Var3.b.eglSwapBuffers(n1Var3.c, n1Var3.e);
        p1 p1Var = ((cg.n1) this.b).y;
        if (!p1Var.s) {
            p1Var.s = true;
            AndroidUtilities.runOnUIThread(new ag.d(this, 14));
        }
        if (((cg.n1) this.b).h) {
            return;
        }
        ((cg.n1) this.b).h = true;
    }

    private final void b() {
        d8.a aVar = (d8.a) this.b;
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

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0241, code lost:
    
        if (r13 > 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x021e, code lost:
    
        if (r13 < 0) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        int R;
        int i10;
        m.h hVar;
        int i11 = 0;
        i11 = 0;
        i11 = 0;
        switch (this.a) {
            case 0:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e6) {
                    if (!TextUtils.equals(e6.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e6;
                    }
                    return;
                }
            case 1:
                h0 h0Var = (h0) this.b;
                Context n10 = h0Var.n();
                if (n10 == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                } else {
                    h0Var.z0.f(1);
                    h0Var.z0.e(n10.getString(R.string.fingerprint_dialog_touch_sensor));
                    return;
                }
            case 2:
                androidx.fragment.app.p pVar = (androidx.fragment.app.p) this.b;
                pVar.k0.onDismiss(pVar.s0);
                return;
            case 3:
                androidx.fragment.app.s sVar = (androidx.fragment.app.s) this.b;
                if (sVar.V != null) {
                    sVar.j().getClass();
                    return;
                }
                return;
            case 4:
                ((j0) this.b).A(true);
                return;
            case 5:
                synchronized (((z) this.b).a) {
                    obj = ((z) this.b).f;
                    ((z) this.b).f = z.k;
                }
                ((z) this.b).j(obj);
                return;
            case 6:
                androidx.mediarouter.app.v vVar = (androidx.mediarouter.app.v) this.b;
                vVar.i(true);
                vVar.R.requestLayout();
                vVar.R.getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.k(vVar, i11 == true ? 1 : 0));
                return;
            case 7:
                androidx.mediarouter.app.v vVar2 = ((androidx.mediarouter.app.t) this.b).b;
                if (vVar2.Z != null) {
                    vVar2.Z = null;
                    if (vVar2.p0) {
                        vVar2.q(vVar2.q0);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((a1) this.b).d();
                return;
            case 9:
                a();
                return;
            case 10:
                g0 g0Var = (g0) this.b;
                y5.e eVar = g0Var.d;
                Context context = g0Var.c;
                eVar.getClass();
                if (y5.g.a.getAndSet(true)) {
                    return;
                }
                try {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                    if (notificationManager != null) {
                        notificationManager.cancel(10436);
                        return;
                    }
                    return;
                } catch (SecurityException e10) {
                    Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e10);
                    return;
                }
            case 11:
                ((p0) this.b).f();
                return;
            case 12:
                com.google.android.gms.common.api.c cVar = ((p0) ((o5.i) this.b).b).b;
                cVar.c(cVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 13:
                ((e1) this.b).j.b(new y5.a(4));
                return;
            case 14:
                return;
            case 15:
                com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
                xVar.o.lock();
                try {
                    com.google.android.gms.common.api.internal.x.l(xVar);
                    return;
                } finally {
                    xVar.o.unlock();
                }
            case 16:
                b();
                return;
            case 17:
                dg.j jVar = ((mt0) this.b).P0;
                if (jVar instanceof b4) {
                    ((b4) jVar).getEditText();
                    return;
                }
                return;
            case 18:
                g1 g1Var = (g1) this.b;
                ArrayList arrayList = g1Var.d3;
                if (g1Var.k3) {
                    if (!arrayList.isEmpty() && (R = RecyclerView.R((i2) k0.i(1, arrayList))) >= 0) {
                        View m9 = g1Var.V2.m(R + 1);
                        if (m9 != null) {
                            g1Var.a3 = false;
                            g1Var.v1(m9, true);
                            g1Var.v0(0, m9.getTop() - ((g1Var.getMeasuredHeight() - m9.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                        }
                    }
                    g1Var.w1();
                    return;
                }
                return;
            case 19:
                e0 e0Var = (e0) this.b;
                b0 b0Var = e0Var.x;
                if (e0Var.c != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = e0Var.O;
                    long j11 = j10 == Long.MIN_VALUE ? 0L : currentTimeMillis - j10;
                    v0 layoutManager = e0Var.E.getLayoutManager();
                    if (e0Var.N == null) {
                        e0Var.N = new Rect();
                    }
                    layoutManager.c(e0Var.c.a, e0Var.N);
                    if (layoutManager.d()) {
                        int i12 = (int) (e0Var.s + e0Var.n);
                        i10 = (i12 - e0Var.N.left) - e0Var.E.getPaddingLeft();
                        float f10 = e0Var.n;
                        if (f10 < 0.0f) {
                        }
                        if (f10 > 0.0f) {
                            i10 = ((e0Var.c.a.getWidth() + i12) + e0Var.N.right) - (e0Var.E.getWidth() - e0Var.E.getPaddingRight());
                            break;
                        }
                    }
                    i10 = 0;
                    if (layoutManager.e()) {
                        int i13 = (int) (e0Var.v + e0Var.r);
                        int paddingTop = (i13 - e0Var.N.top) - e0Var.E.getPaddingTop();
                        float f11 = e0Var.r;
                        if ((f11 < 0.0f && paddingTop < 0) || (f11 > 0.0f && (paddingTop = ((e0Var.c.a.getHeight() + i13) + e0Var.N.bottom) - (e0Var.E.getHeight() - e0Var.E.getPaddingBottom())) > 0)) {
                            i11 = paddingTop;
                        }
                    }
                    if (i10 != 0) {
                        int width = e0Var.c.a.getWidth();
                        e0Var.E.getWidth();
                        i10 = b0Var.i(width, i10, j11);
                    }
                    if (i11 != 0) {
                        int height = e0Var.c.a.getHeight();
                        e0Var.E.getHeight();
                        i11 = b0Var.i(height, i11, j11);
                    }
                    if (i10 == 0 && i11 == 0) {
                        e0Var.O = Long.MIN_VALUE;
                        return;
                    }
                    if (e0Var.O == Long.MIN_VALUE) {
                        e0Var.O = currentTimeMillis;
                    }
                    e0Var.E.scrollBy(i10, i11);
                    l1 l1Var = e0Var.c;
                    if (l1Var != null) {
                        e0Var.n(l1Var);
                    }
                    e0Var.E.removeCallbacks(e0Var.F);
                    RecyclerView recyclerView = e0Var.E;
                    WeakHashMap weakHashMap = r0.j0.a;
                    recyclerView.postOnAnimation(this);
                    return;
                }
                return;
            case 20:
                ((g5.k0) this.b).c();
                return;
            case 21:
                f2 f2Var = (f2) this.b;
                String str = f2Var.k0;
                if (str != null) {
                    f2Var.T(f2Var.o0, str, false);
                    return;
                }
                return;
            case 22:
                v2 v2Var = (v2) this.b;
                String str2 = v2Var.l0;
                if (str2 != null) {
                    v2.U(v2Var, str2);
                    return;
                }
                return;
            case 23:
                i.e eVar2 = (i.e) this.b;
                eVar2.a(true);
                eVar2.invalidateSelf();
                return;
            case 24:
                ((ThreadLocal) ((rf.f) this.b).e).set(Boolean.TRUE);
                return;
            case 25:
                for (Thread thread : kf.g.w.keySet()) {
                    if (!thread.isAlive()) {
                        kf.g.w.remove(thread);
                    }
                }
                if (kf.g.w.isEmpty()) {
                    kf.g.x = false;
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(((kf.g) this.b).p, 5000L);
                    return;
                }
            case 26:
                a0 a0Var = (a0) this.b;
                if (a0Var.C.get()) {
                    a0Var.invalidate();
                    a0Var.E.postDelayed(this, 300L);
                    return;
                }
                return;
            case 27:
                la laVar = (la) this.b;
                u7 u7Var = u7.f;
                HashMap hashMap = laVar.j;
                l7.h hVar2 = (l7.h) hashMap.get(u7Var);
                if (hVar2 != null) {
                    l7.h hVar3 = hVar2;
                    l7.a aVar = hVar3.a;
                    if (aVar == null) {
                        l7.h hVar4 = hVar3;
                        l7.a aVar2 = new l7.a(hVar4, hVar4.c);
                        hVar3.a = aVar2;
                        aVar = aVar2;
                    }
                    Iterator it = aVar.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Collection collection = (Collection) hVar2.c.get(next);
                        Collection collection2 = collection;
                        if (collection == null) {
                            collection2 = new ArrayList(3);
                        }
                        List list = (List) collection2;
                        ArrayList arrayList2 = new ArrayList(list instanceof RandomAccess ? new l7.b(hVar2, next, list, null) : new l7.e(hVar2, next, list, (l7.e) null));
                        Collections.sort(arrayList2);
                        f7 f7Var = new f7();
                        int size = arrayList2.size();
                        int i14 = 0;
                        long j12 = 0;
                        while (i14 < size) {
                            Object obj2 = arrayList2.get(i14);
                            i14++;
                            j12 = ((Long) obj2).longValue() + j12;
                        }
                        f7Var.c = Long.valueOf((j12 / arrayList2.size()) & Long.MAX_VALUE);
                        f7Var.a = Long.valueOf(la.a(arrayList2, 100.0d) & Long.MAX_VALUE);
                        f7Var.f = Long.valueOf(la.a(arrayList2, 75.0d) & Long.MAX_VALUE);
                        f7Var.e = Long.valueOf(la.a(arrayList2, 50.0d) & Long.MAX_VALUE);
                        f7Var.d = Long.valueOf(la.a(arrayList2, 25.0d) & Long.MAX_VALUE);
                        f7Var.b = Long.valueOf(la.a(arrayList2, 0.0d) & Long.MAX_VALUE);
                        g7 g7Var = new g7(f7Var);
                        int size2 = arrayList2.size();
                        a9.a aVar3 = new a9.a();
                        aVar3.c = s7.b;
                        w0 w0Var = new w0(i11 == true ? 1 : 0, (boolean) i11);
                        w0Var.c = Integer.valueOf(size2 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        w0Var.b = (x0) next;
                        w0Var.d = g7Var;
                        aVar3.f = new y0(w0Var);
                        cb.o.a.execute(new c2.p(laVar, new b4.e0(aVar3, 0), u7Var, laVar.b(), false, 6));
                    }
                    hashMap.remove(u7Var);
                    return;
                }
                return;
            case 28:
                s1 s1Var = (s1) this.b;
                s1Var.w = null;
                s1Var.drawableStateChanged();
                return;
            default:
                ActionMenuView actionMenuView = ((Toolbar) this.b).a;
                if (actionMenuView == null || (hVar = actionMenuView.G) == null) {
                    return;
                }
                hVar.l();
                return;
        }
    }

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
