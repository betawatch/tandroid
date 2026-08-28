package androidx.activity;

import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Log;
import androidx.biometric.f0;
import androidx.fragment.app.j0;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.RecyclerView;
import bg.g3;
import bg.q2;
import c2.a1;
import com.google.android.exoplayer2.upstream.o0;
import com.google.android.gms.common.api.internal.d1;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.m1;
import com.google.android.gms.common.api.internal.p0;
import f2.d0;
import f2.h0;
import f2.q1;
import f2.z0;
import ff.b0;
import h7.e7;
import h7.f7;
import h7.ka;
import h7.r7;
import h7.t7;
import h7.w0;
import h7.x0;
import ih.c9;
import ih.d9;
import ih.i4;
import ih.m9;
import ih.v7;
import j7.de;
import j7.ed;
import j7.fb;
import j7.hb;
import j7.i1;
import j7.j1;
import j7.lg;
import j7.ma;
import j7.wf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.WeakHashMap;
import kh.ya;
import m.s1;
import m.t3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import yf.v2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public i(m1 m1Var, n2.w wVar) {
        this.a = 16;
        this.b = wVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0384, code lost:
    
        if (r10 > 0) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x040f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        int i9;
        int i10;
        q1 q1Var;
        int height;
        double d = 75.0d;
        int i11 = 3;
        h7.e eVar = null;
        switch (this.a) {
            case 0:
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
            case 1:
                f0 f0Var = (f0) this.b;
                Context n10 = f0Var.n();
                if (n10 == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                } else {
                    f0Var.y0.f(1);
                    f0Var.y0.e(n10.getString(R.string.fingerprint_dialog_touch_sensor));
                    return;
                }
            case 2:
                androidx.fragment.app.p pVar = (androidx.fragment.app.p) this.b;
                pVar.j0.onDismiss(pVar.r0);
                return;
            case 3:
                androidx.fragment.app.s sVar = (androidx.fragment.app.s) this.b;
                if (sVar.U != null) {
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
                vVar.Q.requestLayout();
                vVar.Q.getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.k(vVar, 0));
                return;
            case 7:
                androidx.mediarouter.app.v vVar2 = ((androidx.mediarouter.app.t) this.b).b;
                if (vVar2.Y != null) {
                    vVar2.Y = null;
                    if (vVar2.o0) {
                        vVar2.q(vVar2.p0);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                q2 q2Var = (q2) this.b;
                String str = q2Var.j0;
                if (str != null) {
                    q2Var.S(q2Var.n0, str, false);
                    return;
                }
                return;
            case 9:
                g3 g3Var = (g3) this.b;
                String str2 = g3Var.k0;
                if (str2 != null) {
                    g3.T(g3Var, str2);
                    return;
                }
                return;
            case 10:
                ((a1) this.b).c();
                return;
            case 11:
                ((o0) this.b).c();
                return;
            case 12:
                g0 g0Var = (g0) this.b;
                u5.e eVar2 = g0Var.d;
                Context context = g0Var.c;
                eVar2.getClass();
                if (u5.g.a.getAndSet(true)) {
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
            case 13:
                ((p0) this.b).f();
                return;
            case 14:
                com.google.android.gms.common.api.c cVar = ((p0) ((xa.c) this.b).b).b;
                cVar.d(cVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 15:
                ((d1) this.b).j.b(new u5.a(4));
                return;
            case 16:
                return;
            case 17:
                com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.b;
                xVar.o.lock();
                try {
                    com.google.android.gms.common.api.internal.x.l(xVar);
                    return;
                } finally {
                    xVar.o.unlock();
                }
            case 18:
                ((ThreadLocal) ((com.google.firebase.messaging.t) this.b).e).set(Boolean.TRUE);
                return;
            case 19:
                h0 h0Var = (h0) this.b;
                d0 d0Var = h0Var.x;
                if (h0Var.c != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = h0Var.N;
                    long j11 = j10 != Long.MIN_VALUE ? currentTimeMillis - j10 : 0L;
                    z0 layoutManager = h0Var.D.getLayoutManager();
                    if (h0Var.M == null) {
                        h0Var.M = new Rect();
                    }
                    layoutManager.c(h0Var.c.a, h0Var.M);
                    if (layoutManager.d()) {
                        int i12 = (int) (h0Var.s + h0Var.n);
                        int paddingLeft = (i12 - h0Var.M.left) - h0Var.D.getPaddingLeft();
                        float f10 = h0Var.n;
                        if (f10 >= 0.0f || paddingLeft >= 0) {
                            if (f10 > 0.0f) {
                                i9 = ((h0Var.c.a.getWidth() + i12) + h0Var.M.right) - (h0Var.D.getWidth() - h0Var.D.getPaddingRight());
                                break;
                            }
                        } else {
                            i9 = paddingLeft;
                        }
                        if (layoutManager.e()) {
                            int i13 = (int) (h0Var.v + h0Var.r);
                            int paddingTop = (i13 - h0Var.M.top) - h0Var.D.getPaddingTop();
                            float f11 = h0Var.r;
                            if (f11 < 0.0f && paddingTop < 0) {
                                i10 = paddingTop;
                            } else if (f11 > 0.0f && (height = ((h0Var.c.a.getHeight() + i13) + h0Var.M.bottom) - (h0Var.D.getHeight() - h0Var.D.getPaddingBottom())) > 0) {
                                i10 = height;
                            }
                            if (i9 != 0) {
                                int width = h0Var.c.a.getWidth();
                                h0Var.D.getWidth();
                                i9 = d0Var.i(width, i9, j11);
                            }
                            if (i10 != 0) {
                                int height2 = h0Var.c.a.getHeight();
                                h0Var.D.getHeight();
                                i10 = d0Var.i(height2, i10, j11);
                            }
                            if (i9 != 0 && i10 == 0) {
                                h0Var.N = Long.MIN_VALUE;
                                return;
                            }
                            if (h0Var.N == Long.MIN_VALUE) {
                                h0Var.N = currentTimeMillis;
                            }
                            h0Var.D.scrollBy(i9, i10);
                            q1Var = h0Var.c;
                            if (q1Var != null) {
                                h0Var.n(q1Var);
                            }
                            h0Var.D.removeCallbacks(h0Var.E);
                            RecyclerView recyclerView = h0Var.D;
                            WeakHashMap weakHashMap = r0.j0.a;
                            recyclerView.postOnAnimation(this);
                            return;
                        }
                        i10 = 0;
                        if (i9 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (h0Var.N == Long.MIN_VALUE) {
                        }
                        h0Var.D.scrollBy(i9, i10);
                        q1Var = h0Var.c;
                        if (q1Var != null) {
                        }
                        h0Var.D.removeCallbacks(h0Var.E);
                        RecyclerView recyclerView2 = h0Var.D;
                        WeakHashMap weakHashMap2 = r0.j0.a;
                        recyclerView2.postOnAnimation(this);
                        return;
                    }
                    i9 = 0;
                    if (layoutManager.e()) {
                    }
                    i10 = 0;
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (h0Var.N == Long.MIN_VALUE) {
                    }
                    h0Var.D.scrollBy(i9, i10);
                    q1Var = h0Var.c;
                    if (q1Var != null) {
                    }
                    h0Var.D.removeCallbacks(h0Var.E);
                    RecyclerView recyclerView22 = h0Var.D;
                    WeakHashMap weakHashMap22 = r0.j0.a;
                    recyclerView22.postOnAnimation(this);
                    return;
                }
                return;
            case 20:
                for (Thread thread : ff.h.w.keySet()) {
                    if (!thread.isAlive()) {
                        ff.h.w.remove(thread);
                    }
                }
                if (ff.h.w.isEmpty()) {
                    ff.h.x = false;
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(((ff.h) this.b).p, 5000L);
                    return;
                }
            case 21:
                b0 b0Var = (b0) this.b;
                if (b0Var.B.get()) {
                    b0Var.invalidate();
                    b0Var.D.postDelayed(this, 300L);
                    return;
                }
                return;
            case 22:
                ka kaVar = (ka) this.b;
                t7 t7Var = t7.f;
                HashMap hashMap = kaVar.j;
                h7.h hVar = (h7.h) hashMap.get(t7Var);
                if (hVar != null) {
                    h7.h hVar2 = hVar;
                    h7.a aVar = hVar2.a;
                    if (aVar == null) {
                        h7.h hVar3 = hVar2;
                        h7.a aVar2 = new h7.a(hVar3, hVar3.c);
                        hVar2.a = aVar2;
                        aVar = aVar2;
                    }
                    Iterator it = aVar.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Object obj2 = (Collection) hVar.c.get(next);
                        if (obj2 == null) {
                            obj2 = new ArrayList(3);
                        }
                        List list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list instanceof RandomAccess ? new h7.b(hVar, next, list, null) : new h7.e(hVar, next, list, (h7.e) null));
                        Collections.sort(arrayList);
                        e7 e7Var = new e7();
                        int size = arrayList.size();
                        long j12 = 0;
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj3 = arrayList.get(i14);
                            i14++;
                            j12 = ((Long) obj3).longValue() + j12;
                        }
                        e7Var.c = Long.valueOf((j12 / arrayList.size()) & Long.MAX_VALUE);
                        e7Var.a = Long.valueOf(ka.a(arrayList, 100.0d) & Long.MAX_VALUE);
                        e7Var.f = Long.valueOf(ka.a(arrayList, d) & Long.MAX_VALUE);
                        e7Var.e = Long.valueOf(ka.a(arrayList, 50.0d) & Long.MAX_VALUE);
                        e7Var.d = Long.valueOf(ka.a(arrayList, 25.0d) & Long.MAX_VALUE);
                        e7Var.b = Long.valueOf(ka.a(arrayList, 0.0d) & Long.MAX_VALUE);
                        f7 f7Var = new f7(e7Var);
                        int size2 = arrayList.size();
                        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m();
                        mVar.c = r7.b;
                        a5.m mVar2 = new a5.m(22, false);
                        mVar2.c = Integer.valueOf(size2 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        mVar2.b = (w0) next;
                        mVar2.d = f7Var;
                        mVar.f = new x0(mVar2);
                        ya.m.a.execute(new af.f(kaVar, new a6.a(mVar, 0), t7Var, kaVar.b(), false, 5));
                        d = 75.0d;
                    }
                    hashMap.remove(t7Var);
                    return;
                }
                return;
            case 23:
                i.e eVar3 = (i.e) this.b;
                eVar3.a(true);
                eVar3.invalidateSelf();
                return;
            case 24:
                i4 i4Var = (i4) this.b;
                if (i4Var.G1 && i4Var.X0) {
                    m9 m9Var = ((d9) i4Var.M1).d;
                    m9Var.h1 = false;
                    m9Var.P();
                    return;
                }
                return;
            case 25:
                ((c9) this.b).H0 = false;
                return;
            case 26:
                v7 v7Var = (v7) this.b;
                v7Var.b = false;
                v7Var.invalidate();
                return;
            case 27:
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
                        Object obj4 = (Collection) lgVar.c.get(next2);
                        if (obj4 == null) {
                            obj4 = new ArrayList(i11);
                        }
                        List list2 = (List) obj4;
                        ArrayList arrayList2 = new ArrayList(list2 instanceof RandomAccess ? new de(lgVar, next2, list2, eVar) : new h7.e(lgVar, next2, list2, eVar));
                        Collections.sort(arrayList2);
                        e7 e7Var2 = new e7();
                        int size3 = arrayList2.size();
                        long j13 = 0;
                        int i15 = 0;
                        while (i15 < size3) {
                            Object obj5 = arrayList2.get(i15);
                            i15++;
                            j13 = ((Long) obj5).longValue() + j13;
                        }
                        hb hbVar2 = hbVar;
                        e7Var2.c = Long.valueOf((j13 / arrayList2.size()) & Long.MAX_VALUE);
                        e7Var2.a = Long.valueOf(wf.a(arrayList2, 100.0d) & Long.MAX_VALUE);
                        e7Var2.f = Long.valueOf(wf.a(arrayList2, 75.0d) & Long.MAX_VALUE);
                        e7Var2.e = Long.valueOf(wf.a(arrayList2, 50.0d) & Long.MAX_VALUE);
                        e7Var2.d = Long.valueOf(wf.a(arrayList2, 25.0d) & Long.MAX_VALUE);
                        e7Var2.b = Long.valueOf(wf.a(arrayList2, 0.0d) & Long.MAX_VALUE);
                        ma maVar = new ma(e7Var2);
                        int size4 = arrayList2.size();
                        t3 t3Var = new t3();
                        t3Var.c = fb.b;
                        j4.c cVar2 = new j4.c(2, false);
                        cVar2.c = Integer.valueOf(size4 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        cVar2.b = (i1) next2;
                        cVar2.d = maVar;
                        t3Var.h = new j1(cVar2);
                        wf wfVar2 = wfVar;
                        ya.m.a.execute(new af.f(wfVar2, new a6.a(t3Var, 0), hbVar2, wfVar.c(), false, 6));
                        hbVar = hbVar2;
                        wfVar = wfVar2;
                        eVar = null;
                        i11 = 3;
                    }
                    hashMap2.remove(hbVar);
                    return;
                }
                return;
            case 28:
                yf.j jVar = ((ya) this.b).F0;
                if (jVar instanceof v2) {
                    ((v2) jVar).getEditText();
                    return;
                }
                return;
            default:
                s1 s1Var = (s1) this.b;
                s1Var.w = null;
                s1Var.drawableStateChanged();
                return;
        }
    }

    public /* synthetic */ i(wf wfVar) {
        this.a = 27;
        hb hbVar = hb.b;
        this.b = wfVar;
    }

    public /* synthetic */ i(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }
}
