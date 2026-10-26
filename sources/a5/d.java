package a5;

import a8.dh;
import a8.fg;
import a8.gh;
import a8.h0;
import a8.kg;
import a8.le;
import a8.nd;
import a8.ng;
import a8.ob;
import a8.r1;
import a8.rb;
import a8.s1;
import a8.ua;
import a8.va;
import ag.g0;
import android.app.NotificationManager;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.biometric.e0;
import androidx.fragment.app.i0;
import androidx.fragment.app.r;
import androidx.lifecycle.z;
import androidx.mediarouter.app.s;
import androidx.mediarouter.app.u;
import com.google.android.gms.common.api.internal.c1;
import com.google.android.gms.common.api.internal.f0;
import com.google.android.gms.common.api.internal.l1;
import com.google.android.gms.common.api.internal.o0;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.TaskCompletionSource;
import di.g8;
import di.o9;
import di.p9;
import di.q4;
import di.y9;
import fi.ta;
import h6.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import li.g1;
import m.r3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.y6;
import sg.x2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class d implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ d(kg kgVar) {
        this.a = 1;
        rb rbVar = rb.b;
        this.b = kgVar;
    }

    private final void a() {
        o oVar = (o) this.b;
        synchronized (o.i) {
            try {
                if (oVar.d()) {
                    oVar.f(15);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        dh dhVar = null;
        int i10 = 0;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                m mVar = (m) this.b;
                mVar.setScrollState(0);
                mVar.s();
                return;
            case 1:
                kg kgVar = (kg) this.b;
                rb rbVar = rb.N1;
                HashMap hashMap = kgVar.j;
                gh ghVar = (gh) hashMap.get(rbVar);
                if (ghVar != null) {
                    gh ghVar2 = ghVar;
                    nd ndVar = ghVar2.a;
                    if (ndVar == null) {
                        gh ghVar3 = ghVar2;
                        nd ndVar2 = new nd(ghVar3, ghVar3.c);
                        ghVar2.a = ndVar2;
                        ndVar = ndVar2;
                    }
                    Iterator it = ndVar.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Collection collection = (Collection) ghVar.c.get(next);
                        Collection collection2 = collection;
                        if (collection == null) {
                            collection2 = new ArrayList(3);
                        }
                        List list = (List) collection2;
                        ArrayList arrayList = new ArrayList(list instanceof RandomAccess ? new le(ghVar, next, list, dhVar) : new dh(ghVar, next, list, dhVar));
                        Collections.sort(arrayList);
                        ua uaVar = new ua();
                        int size = arrayList.size();
                        long j10 = 0;
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj2 = arrayList.get(i11);
                            i11++;
                            j10 = ((Long) obj2).longValue() + j10;
                        }
                        uaVar.c = Long.valueOf((j10 / arrayList.size()) & Long.MAX_VALUE);
                        uaVar.a = Long.valueOf(kg.a(arrayList, 100.0d) & Long.MAX_VALUE);
                        uaVar.f = Long.valueOf(kg.a(arrayList, 75.0d) & Long.MAX_VALUE);
                        uaVar.e = Long.valueOf(kg.a(arrayList, 50.0d) & Long.MAX_VALUE);
                        uaVar.d = Long.valueOf(kg.a(arrayList, 25.0d) & Long.MAX_VALUE);
                        uaVar.b = Long.valueOf(Long.MAX_VALUE & kg.a(arrayList, 0.0d));
                        va vaVar = new va(uaVar);
                        int size2 = arrayList.size();
                        r3 r3Var = new r3();
                        r3Var.c = ob.b;
                        h0 h0Var = new h0(1, z10 ? 1 : 0);
                        h0Var.c = Integer.valueOf(size2 & ConnectionsManager.DEFAULT_DATACENTER_ID);
                        h0Var.b = (r1) next;
                        h0Var.d = vaVar;
                        r3Var.h = new s1(h0Var);
                        sb.m.a.execute(new fg(kgVar, new ng(r3Var, 0), rbVar, kgVar.c(), 0));
                        dhVar = null;
                    }
                    hashMap.remove(rbVar);
                    return;
                }
                return;
            case 2:
                for (Thread thread : ag.k.w.keySet()) {
                    if (!thread.isAlive()) {
                        ag.k.w.remove(thread);
                    }
                }
                if (ag.k.w.isEmpty()) {
                    ag.k.x = false;
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(((ag.k) this.b).p, 5000L);
                    return;
                }
            case 3:
                g0 g0Var = (g0) this.b;
                if (g0Var.F.get()) {
                    g0Var.invalidate();
                    g0Var.H.postDelayed(this, 300L);
                    return;
                }
                return;
            case 4:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e10) {
                    if (!TextUtils.equals(e10.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e10;
                    }
                    return;
                }
            case 5:
                e0 e0Var = (e0) this.b;
                Context n10 = e0Var.n();
                if (n10 == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                } else {
                    e0Var.C0.f(1);
                    e0Var.C0.e(n10.getString(R.string.fingerprint_dialog_touch_sensor));
                    return;
                }
            case 6:
                androidx.fragment.app.o oVar = (androidx.fragment.app.o) this.b;
                oVar.n0.onDismiss(oVar.v0);
                return;
            case 7:
                r rVar = (r) this.b;
                if (rVar.Y != null) {
                    rVar.j().getClass();
                    return;
                }
                return;
            case 8:
                ((i0) this.b).A(true);
                return;
            case 9:
                synchronized (((z) this.b).a) {
                    obj = ((z) this.b).f;
                    ((z) this.b).f = z.k;
                }
                ((z) this.b).j(obj);
                return;
            case 10:
                u uVar = (u) this.b;
                uVar.i(true);
                uVar.U.requestLayout();
                uVar.U.getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.j(uVar, i10));
                return;
            case 11:
                u uVar2 = ((s) this.b).b;
                if (uVar2.c0 != null) {
                    uVar2.c0 = null;
                    if (uVar2.s0) {
                        uVar2.q(uVar2.t0);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                f0 f0Var = (f0) this.b;
                l6.e eVar = f0Var.d;
                Context context = f0Var.c;
                eVar.getClass();
                if (l6.g.a.getAndSet(true)) {
                    return;
                }
                try {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                    if (notificationManager != null) {
                        notificationManager.cancel(10436);
                        return;
                    }
                    return;
                } catch (SecurityException e11) {
                    Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e11);
                    return;
                }
            case 13:
                ((o0) this.b).f();
                return;
            case 14:
                com.google.android.gms.common.api.c cVar = ((o0) ((rb.c) this.b).b).b;
                cVar.c(cVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 15:
                ((c1) this.b).j.b(new l6.a(4));
                return;
            case 16:
                return;
            case 17:
                w wVar = (w) this.b;
                wVar.o.lock();
                try {
                    w.l(wVar);
                    return;
                } finally {
                    wVar.o.unlock();
                }
            case 18:
                d5.w wVar2 = (d5.w) this.b;
                d5.c cVar2 = wVar2.d;
                cVar2.k(0);
                d5.i iVar = d5.e0.i;
                cVar2.j(24, iVar);
                wVar2.c(iVar);
                return;
            case 19:
                q4 q4Var = (q4) this.b;
                if (q4Var.z1 && q4Var.Q0) {
                    y9 y9Var = ((p9) q4Var.F1).d;
                    y9Var.l1 = false;
                    y9Var.P();
                    return;
                }
                return;
            case 20:
                ((o9) this.b).L0 = false;
                return;
            case 21:
                g8 g8Var = (g8) this.b;
                g8Var.b = false;
                g8Var.invalidate();
                return;
            case 22:
                sg.j jVar = ((ta) this.b).y0;
                if (jVar instanceof x2) {
                    ((x2) jVar).getEditText();
                    return;
                }
                return;
            case 23:
                ((g6.h) this.b).g(false);
                return;
            case 24:
                a();
                return;
            case 25:
                i.e eVar2 = (i.e) this.b;
                eVar2.a(true);
                eVar2.invalidateSelf();
                return;
            case 26:
                if (((TaskCompletionSource) this.b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 27:
                ((li.f0) this.b).h();
                return;
            case 28:
                g1 g1Var = (g1) this.b;
                if (y6.g1()) {
                    g1Var.postDelayed(this, 100L);
                    return;
                } else {
                    g1Var.m();
                    return;
                }
            default:
                m.r1 r1Var = (m.r1) this.b;
                r1Var.w = null;
                r1Var.drawableStateChanged();
                return;
        }
    }

    public d(l1 l1Var, d5.z zVar) {
        this.a = 16;
        this.b = zVar;
    }

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
