package k9;

import a8.h0;
import a8.qd;
import android.app.Application;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import ce.z0;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.j0;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.qc;
import org.telegram.ui.gr;
import org.telegram.ui.ir;
import org.telegram.ui.lm;
import org.telegram.ui.mr;
import org.telegram.ui.qy;
import org.telegram.ui.wn;
import s4.e1;
import s4.m0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class u implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public /* synthetic */ u(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        k6.k kVar = (k6.k) this.b;
        int i10 = ((k6.l) this.c).a;
        synchronized (kVar) {
            k6.l lVar = (k6.l) kVar.e.get(i10);
            if (lVar != null) {
                Log.w("MessengerIpcClient", "Timing out request: " + i10);
                kVar.e.remove(i10);
                lVar.b(new com.google.firebase.messaging.p("Timed out waiting for response", null));
                kVar.c();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        Throwable th2 = null;
        int i10 = 0;
        int i11 = 0;
        switch (this.a) {
            case 0:
                t tVar = (t) this.c;
                y yVar = (y) this.b;
                if (yVar instanceof l9.a) {
                    o oVar = (o) ((l9.a) yVar);
                    if (oVar instanceof g) {
                        Object obj = oVar.a;
                        if (obj instanceof b) {
                            th2 = ((b) obj).a;
                        }
                    }
                    if (th2 != null) {
                        tVar.i(th2);
                        return;
                    }
                }
                try {
                    tVar.onSuccess(qd.a(yVar));
                    return;
                } catch (ExecutionException e) {
                    tVar.i(e.getCause());
                    return;
                } catch (Throwable th3) {
                    tVar.i(th3);
                    return;
                }
            case 1:
                androidx.biometric.x xVar = ((androidx.biometric.p) this.c).l0;
                if (xVar.e == null) {
                    xVar.e = new androidx.biometric.u();
                }
                xVar.e.c((androidx.biometric.s) this.b);
                return;
            case 2:
                ((ce.m) this.c).D((z0) this.b);
                return;
            case 3:
                ((com.google.android.gms.internal.cast.p) this.b).M0((p4.r) this.c);
                return;
            case 4:
                d5.c cVar = (d5.c) this.b;
                d5.i iVar = (d5.i) this.c;
                if (((d5.q) cVar.f.c) != null) {
                    ((d5.q) cVar.f.c).onPurchasesUpdated(iVar, null);
                    return;
                } else {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 5:
                Future future = (Future) this.b;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                Runnable runnable = (Runnable) this.c;
                future.cancel(true);
                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Async task is taking too long, cancel it!");
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                d5.c cVar2 = (d5.c) this.b;
                org.telegram.messenger.g0 g0Var = (org.telegram.messenger.g0) this.c;
                d5.i iVar2 = d5.e0.i;
                cVar2.y(24, 7, iVar2);
                com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
                com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.e;
                g0Var.a(iVar2, new d5.s(vVar, vVar));
                return;
            case 7:
                d5.c cVar3 = (d5.c) this.b;
                d5.p pVar2 = (d5.p) this.c;
                d5.i iVar3 = d5.e0.i;
                cVar3.y(24, 9, iVar3);
                com.google.android.gms.internal.play_billing.p pVar3 = com.google.android.gms.internal.play_billing.r.b;
                pVar2.a(iVar3, com.google.android.gms.internal.play_billing.v.e);
                return;
            case 8:
                d6.e0 e0Var = ((d6.d0) this.b).b;
                h6.d dVar = (h6.d) this.c;
                h6.b bVar = d6.e0.G;
                d6.d dVar2 = dVar.d;
                d6.x xVar2 = dVar.f;
                d6.d dVar3 = e0Var.t;
                e6.d0 d0Var = e0Var.D;
                if (!h6.a.d(dVar2, dVar3)) {
                    e0Var.t = dVar2;
                    d0Var.c();
                }
                double d = dVar.a;
                if (Double.isNaN(d) || Math.abs(d - e0Var.v) <= 1.0E-7d) {
                    z10 = false;
                } else {
                    e0Var.v = d;
                    z10 = true;
                }
                boolean z18 = dVar.b;
                if (z18 != e0Var.w) {
                    e0Var.w = z18;
                    z10 = true;
                }
                h6.b bVar2 = d6.e0.G;
                bVar2.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(e0Var.m));
                if (d0Var != null && (z10 || e0Var.m)) {
                    d0Var.f();
                }
                Double.isNaN(dVar.h);
                int i12 = dVar.c;
                if (i12 != e0Var.x) {
                    e0Var.x = i12;
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar2.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(e0Var.m));
                if (d0Var != null && (z11 || e0Var.m)) {
                    d0Var.a();
                }
                int i13 = dVar.e;
                if (i13 != e0Var.y) {
                    e0Var.y = i13;
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar2.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(e0Var.m));
                if (d0Var != null && (z12 || e0Var.m)) {
                    d0Var.e();
                }
                if (!h6.a.d(e0Var.z, xVar2)) {
                    e0Var.z = xVar2;
                }
                e0Var.m = false;
                return;
            case 9:
                d6.e0 e0Var2 = ((d6.d0) this.b).b;
                h6.c cVar4 = (h6.c) this.c;
                h6.b bVar3 = d6.e0.G;
                String str = cVar4.a;
                if (h6.a.d(str, e0Var2.u)) {
                    z13 = false;
                } else {
                    e0Var2.u = str;
                    z13 = true;
                }
                d6.e0.G.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(e0Var2.n));
                e6.d0 d0Var2 = e0Var2.D;
                if (d0Var2 != null && (z13 || e0Var2.n)) {
                    d0Var2.d();
                }
                e0Var2.n = false;
                return;
            case 10:
                ((ce.m) this.b).D((de.e) this.c);
                return;
            case 11:
                ((e0.c) this.b).a = this.c;
                return;
            case 12:
                ((Application) this.b).unregisterActivityLifecycleCallbacks((e0.c) this.c);
                return;
            case 13:
                Object obj2 = this.c;
                Object obj3 = this.b;
                try {
                    Method method = e0.d.d;
                    if (method != null) {
                        method.invoke(obj3, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        e0.d.e.invoke(obj3, obj2, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e10) {
                    if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                        throw e10;
                    }
                    return;
                } catch (Throwable th4) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th4);
                    return;
                }
            case 14:
                h6.v vVar2 = (h6.v) this.b;
                h6.d dVar4 = (h6.d) this.c;
                h6.b bVar4 = h6.v.n0;
                d6.d dVar5 = dVar4.d;
                d6.x xVar3 = dVar4.f;
                d6.d dVar6 = vVar2.U;
                e6.d0 d0Var3 = vVar2.W;
                if (!h6.a.d(dVar5, dVar6)) {
                    vVar2.U = dVar5;
                    d0Var3.c();
                }
                double d10 = dVar4.a;
                if (Double.isNaN(d10) || Math.abs(d10 - vVar2.f0) <= 1.0E-7d) {
                    z14 = false;
                } else {
                    vVar2.f0 = d10;
                    z14 = true;
                }
                boolean z19 = dVar4.b;
                if (z19 != vVar2.c0) {
                    vVar2.c0 = z19;
                    z14 = true;
                }
                Double.isNaN(dVar4.h);
                h6.b bVar5 = h6.v.n0;
                bVar5.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z14), Boolean.valueOf(vVar2.e0));
                if (d0Var3 != null && (z14 || vVar2.e0)) {
                    d0Var3.f();
                }
                int i14 = dVar4.c;
                if (i14 != vVar2.h0) {
                    vVar2.h0 = i14;
                    z15 = true;
                } else {
                    z15 = false;
                }
                bVar5.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z15), Boolean.valueOf(vVar2.e0));
                if (d0Var3 != null && (z15 || vVar2.e0)) {
                    d0Var3.a();
                }
                int i15 = dVar4.e;
                if (i15 != vVar2.i0) {
                    vVar2.i0 = i15;
                    z16 = true;
                } else {
                    z16 = false;
                }
                bVar5.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z16), Boolean.valueOf(vVar2.e0));
                if (d0Var3 != null && (z16 || vVar2.e0)) {
                    d0Var3.e();
                }
                if (!h6.a.d(vVar2.g0, xVar3)) {
                    vVar2.g0 = xVar3;
                }
                vVar2.e0 = false;
                return;
            case 15:
                h6.v vVar3 = (h6.v) this.b;
                h6.c cVar5 = (h6.c) this.c;
                h6.b bVar6 = h6.v.n0;
                String str2 = cVar5.a;
                if (h6.a.d(str2, vVar3.b0)) {
                    z17 = false;
                } else {
                    vVar3.b0 = str2;
                    z17 = true;
                }
                h6.v.n0.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z17), Boolean.valueOf(vVar3.d0));
                e6.d0 d0Var4 = vVar3.W;
                if (d0Var4 != null && (z17 || vVar3.d0)) {
                    d0Var4.d();
                }
                vVar3.d0 = false;
                return;
            case 16:
                he.i iVar4 = (he.i) this.c;
                ce.a0 a0Var = iVar4.c;
                while (true) {
                    try {
                        ((Runnable) this.b).run();
                    } catch (Throwable th5) {
                        ce.f0.m(th5, ld.i.a);
                    }
                    Runnable f7 = iVar4.f();
                    if (f7 == null) {
                        return;
                    }
                    this.b = f7;
                    i10++;
                    if (i10 >= 16 && a0Var.d()) {
                        a0Var.c(iVar4, this);
                        return;
                    }
                }
                break;
            case 17:
                k6.k kVar = (k6.k) this.b;
                IBinder iBinder = (IBinder) this.c;
                synchronized (kVar) {
                    if (iBinder == null) {
                        kVar.a("Null service connection");
                    } else {
                        try {
                            kVar.c = new n4.s(iBinder);
                            kVar.a = 2;
                            ((ScheduledExecutorService) kVar.f.c).execute(new k6.i(kVar, i10));
                        } catch (RemoteException e11) {
                            kVar.a(e11.getMessage());
                        }
                    }
                }
                return;
            case 18:
                a();
                return;
            case 19:
                mi.m mVar = (mi.m) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj4 = arrayList.get(i11);
                    i11++;
                    mVar.B((s4.j) obj4);
                }
                arrayList.clear();
                mVar.v.remove(arrayList);
                return;
            case 20:
                b6.i iVar5 = (b6.i) this.b;
                Typeface typeface = (Typeface) this.c;
                j0 j0Var = (j0) iVar5.b;
                if (j0Var != null) {
                    j0Var.e(typeface);
                    return;
                }
                return;
            case 21:
                ((d5.x) this.b).accept(this.c);
                return;
            case 22:
                wn wnVar = ((lm) this.c).c;
                if (this == wnVar.Z5) {
                    wnVar.lb((CharSequence) this.b, false);
                    wnVar.Z5 = null;
                    return;
                }
                return;
            case 23:
                z8 z8Var = (z8) this.b;
                boolean z20 = z8Var.d.h;
                z8Var.setChecked(!z20);
                mr mrVar = ((ir) this.c).d;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = mrVar.y;
                tL_chatBannedRights.send_media = z20;
                tL_chatBannedRights.send_gifs = z20;
                tL_chatBannedRights.send_inline = z20;
                tL_chatBannedRights.send_games = z20;
                tL_chatBannedRights.send_photos = z20;
                tL_chatBannedRights.send_videos = z20;
                tL_chatBannedRights.send_stickers = z20;
                tL_chatBannedRights.send_audios = z20;
                tL_chatBannedRights.send_docs = z20;
                tL_chatBannedRights.send_voices = z20;
                tL_chatBannedRights.send_roundvideos = z20;
                tL_chatBannedRights.embed_links = z20;
                tL_chatBannedRights.send_polls = z20;
                tL_chatBannedRights.send_reactions = z20;
                AndroidUtilities.updateVisibleRows(mrVar.c);
                gr x02 = mrVar.x0();
                mrVar.C0();
                mrVar.B0(x02);
                return;
            case 24:
                ((qc) this.b).j();
                ((qy) this.c).E = null;
                return;
            case 25:
                s4.v vVar4 = (s4.v) this.b;
                e1 e1Var = vVar4.e;
                s4.z zVar = (s4.z) this.c;
                RecyclerView recyclerView = zVar.H;
                if (recyclerView == null || !recyclerView.G || vVar4.v || e1Var.b() == -1) {
                    return;
                }
                m0 itemAnimator = zVar.H.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.k()) {
                    ArrayList arrayList2 = zVar.F;
                    int size2 = arrayList2.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        if (((s4.v) arrayList2.get(i16)).w) {
                        }
                    }
                    zVar.x.q(e1Var);
                    return;
                }
                zVar.H.post(this);
                return;
            case 26:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.b;
                while (!((Set) this.c).isEmpty()) {
                    try {
                        sb.l lVar = (sb.l) referenceQueue.remove();
                        if (lVar.a.remove(lVar)) {
                            lVar.clear();
                            lVar.b.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case 27:
                Callable callable = (Callable) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource.setResult(callable.call());
                    return;
                } catch (ob.a e12) {
                    taskCompletionSource.setException(e12);
                    return;
                } catch (Exception e13) {
                    taskCompletionSource.setException(new ob.a("Internal error has occurred when executing ML Kit tasks", e13));
                    return;
                }
            case 28:
                sb.i iVar6 = (sb.i) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                int decrementAndGet = iVar6.b.decrementAndGet();
                o6.l.k(decrementAndGet >= 0);
                if (decrementAndGet == 0) {
                    iVar6.c();
                    iVar6.c.set(false);
                }
                u7.n.a.clear();
                u7.r.a.clear();
                taskCompletionSource2.setResult(null);
                return;
            default:
                c2.b bVar7 = (c2.b) this.b;
                o6.l.k(((Thread) ((AtomicReference) bVar7.d).getAndSet(Thread.currentThread())) == null);
                try {
                    ((Runnable) this.c).run();
                    ((AtomicReference) bVar7.d).set(null);
                    bVar7.B();
                    return;
                } catch (Throwable th6) {
                    try {
                        ((AtomicReference) bVar7.d).set(null);
                        bVar7.B();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                h0 h0Var = new h0(u.class.getSimpleName(), 16);
                t tVar = (t) this.c;
                rf.b bVar = new rf.b(17, false);
                ((rf.b) h0Var.d).c = bVar;
                h0Var.d = bVar;
                bVar.b = tVar;
                return h0Var.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ u(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public u(s4.z zVar, s4.v vVar, int i10) {
        this.a = 25;
        this.c = zVar;
        this.b = vVar;
    }
}
