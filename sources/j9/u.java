package j9;

import android.app.Application;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import be.z0;
import c5.h0;
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
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.qc;
import org.telegram.ui.dr;
import org.telegram.ui.fr;
import org.telegram.ui.im;
import org.telegram.ui.jr;
import org.telegram.ui.qy;
import org.telegram.ui.sn;
import s4.b1;
import s4.l0;
import v7.q8;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
        j6.j jVar = (j6.j) this.b;
        int i10 = ((j6.k) this.c).a;
        synchronized (jVar) {
            j6.k kVar = (j6.k) jVar.e.get(i10);
            if (kVar != null) {
                Log.w("MessengerIpcClient", "Timing out request: " + i10);
                jVar.e.remove(i10);
                kVar.b(new com.google.firebase.messaging.q("Timed out waiting for response", null));
                jVar.c();
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
                if (yVar instanceof k9.a) {
                    o oVar = (o) ((k9.a) yVar);
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
                    tVar.onSuccess(q8.a(yVar));
                    return;
                } catch (ExecutionException e) {
                    tVar.i(e.getCause());
                    return;
                } catch (Throwable th3) {
                    tVar.i(th3);
                    return;
                }
            case 1:
                androidx.biometric.y yVar2 = ((androidx.biometric.q) this.c).l0;
                if (yVar2.e == null) {
                    yVar2.e = new androidx.biometric.v();
                }
                yVar2.e.c((androidx.biometric.t) this.b);
                return;
            case 2:
                ((be.m) this.c).D((z0) this.b);
                return;
            case 3:
                c5.c cVar = (c5.c) this.b;
                c5.i iVar = (c5.i) this.c;
                if (((c5.r) cVar.f.c) != null) {
                    ((c5.r) cVar.f.c).onPurchasesUpdated(iVar, null);
                    return;
                } else {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 4:
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
            case 5:
                c5.c cVar2 = (c5.c) this.b;
                org.telegram.messenger.d0 d0Var = (org.telegram.messenger.d0) this.c;
                c5.i iVar2 = h0.i;
                cVar2.y(24, 7, iVar2);
                com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
                com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.e;
                d0Var.c(iVar2, new c5.t(vVar, vVar));
                return;
            case 6:
                c5.c cVar3 = (c5.c) this.b;
                c5.q qVar = (c5.q) this.c;
                c5.i iVar3 = h0.i;
                cVar3.y(24, 9, iVar3);
                com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.b;
                qVar.a(iVar3, com.google.android.gms.internal.play_billing.v.e);
                return;
            case 7:
                c6.e0 e0Var = ((c6.d0) this.b).b;
                g6.d dVar = (g6.d) this.c;
                g6.b bVar = c6.e0.G;
                c6.d dVar2 = dVar.d;
                c6.x xVar = dVar.f;
                c6.d dVar3 = e0Var.t;
                d6.d0 d0Var2 = e0Var.D;
                if (!g6.a.d(dVar2, dVar3)) {
                    e0Var.t = dVar2;
                    d0Var2.c();
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
                g6.b bVar2 = c6.e0.G;
                bVar2.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(e0Var.m));
                if (d0Var2 != null && (z10 || e0Var.m)) {
                    d0Var2.f();
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
                if (d0Var2 != null && (z11 || e0Var.m)) {
                    d0Var2.a();
                }
                int i13 = dVar.e;
                if (i13 != e0Var.y) {
                    e0Var.y = i13;
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar2.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(e0Var.m));
                if (d0Var2 != null && (z12 || e0Var.m)) {
                    d0Var2.e();
                }
                if (!g6.a.d(e0Var.z, xVar)) {
                    e0Var.z = xVar;
                }
                e0Var.m = false;
                return;
            case 8:
                c6.e0 e0Var2 = ((c6.d0) this.b).b;
                g6.c cVar4 = (g6.c) this.c;
                g6.b bVar3 = c6.e0.G;
                String str = cVar4.a;
                if (g6.a.d(str, e0Var2.u)) {
                    z13 = false;
                } else {
                    e0Var2.u = str;
                    z13 = true;
                }
                c6.e0.G.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(e0Var2.n));
                d6.d0 d0Var3 = e0Var2.D;
                if (d0Var3 != null && (z13 || e0Var2.n)) {
                    d0Var3.d();
                }
                e0Var2.n = false;
                return;
            case 9:
                ((be.m) this.b).D((ce.e) this.c);
                return;
            case 10:
                ((com.google.android.gms.internal.cast.r) this.b).M0((p4.r) this.c);
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
                } catch (RuntimeException e7) {
                    if (e7.getClass() == RuntimeException.class && e7.getMessage() != null && e7.getMessage().startsWith("Unable to stop")) {
                        throw e7;
                    }
                    return;
                } catch (Throwable th4) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th4);
                    return;
                }
            case 14:
                g6.v vVar2 = (g6.v) this.b;
                g6.d dVar4 = (g6.d) this.c;
                g6.b bVar4 = g6.v.n0;
                c6.d dVar5 = dVar4.d;
                c6.x xVar2 = dVar4.f;
                c6.d dVar6 = vVar2.U;
                d6.d0 d0Var4 = vVar2.W;
                if (!g6.a.d(dVar5, dVar6)) {
                    vVar2.U = dVar5;
                    d0Var4.c();
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
                g6.b bVar5 = g6.v.n0;
                bVar5.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z14), Boolean.valueOf(vVar2.e0));
                if (d0Var4 != null && (z14 || vVar2.e0)) {
                    d0Var4.f();
                }
                int i14 = dVar4.c;
                if (i14 != vVar2.h0) {
                    vVar2.h0 = i14;
                    z15 = true;
                } else {
                    z15 = false;
                }
                bVar5.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z15), Boolean.valueOf(vVar2.e0));
                if (d0Var4 != null && (z15 || vVar2.e0)) {
                    d0Var4.a();
                }
                int i15 = dVar4.e;
                if (i15 != vVar2.i0) {
                    vVar2.i0 = i15;
                    z16 = true;
                } else {
                    z16 = false;
                }
                bVar5.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z16), Boolean.valueOf(vVar2.e0));
                if (d0Var4 != null && (z16 || vVar2.e0)) {
                    d0Var4.e();
                }
                if (!g6.a.d(vVar2.g0, xVar2)) {
                    vVar2.g0 = xVar2;
                }
                vVar2.e0 = false;
                return;
            case 15:
                g6.v vVar3 = (g6.v) this.b;
                g6.c cVar5 = (g6.c) this.c;
                g6.b bVar6 = g6.v.n0;
                String str2 = cVar5.a;
                if (g6.a.d(str2, vVar3.b0)) {
                    z17 = false;
                } else {
                    vVar3.b0 = str2;
                    z17 = true;
                }
                g6.v.n0.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z17), Boolean.valueOf(vVar3.d0));
                d6.d0 d0Var5 = vVar3.W;
                if (d0Var5 != null && (z17 || vVar3.d0)) {
                    d0Var5.d();
                }
                vVar3.d0 = false;
                return;
            case 16:
                ge.i iVar4 = (ge.i) this.c;
                be.a0 a0Var = iVar4.c;
                while (true) {
                    try {
                        ((Runnable) this.b).run();
                    } catch (Throwable th5) {
                        be.f0.m(th5, kd.i.a);
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
                j6.j jVar = (j6.j) this.b;
                IBinder iBinder = (IBinder) this.c;
                synchronized (jVar) {
                    if (iBinder == null) {
                        jVar.a("Null service connection");
                    } else {
                        try {
                            jVar.c = new n4.s(iBinder);
                            jVar.a = 2;
                            ((ScheduledExecutorService) jVar.f.c).execute(new j6.h(jVar, i10));
                        } catch (RemoteException e10) {
                            jVar.a(e10.getMessage());
                        }
                    }
                }
                return;
            case 18:
                a();
                return;
            case 19:
                li.m mVar = (li.m) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj4 = arrayList.get(i11);
                    i11++;
                    mVar.B((s4.i) obj4);
                }
                arrayList.clear();
                mVar.v.remove(arrayList);
                return;
            case 20:
                a6.i iVar5 = (a6.i) this.b;
                Typeface typeface = (Typeface) this.c;
                j0 j0Var = (j0) iVar5.b;
                if (j0Var != null) {
                    j0Var.e(typeface);
                    return;
                }
                return;
            case 21:
                ((c5.a0) this.b).accept(this.c);
                return;
            case 22:
                sn snVar = ((im) this.c).c;
                if (this == snVar.V5) {
                    snVar.cb((CharSequence) this.b, false);
                    snVar.V5 = null;
                    return;
                }
                return;
            case 23:
                v8 v8Var = (v8) this.b;
                boolean z20 = v8Var.d.h;
                v8Var.setChecked(!z20);
                jr jrVar = ((fr) this.c).d;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = jrVar.E;
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
                AndroidUtilities.updateVisibleRows(jrVar.c);
                dr w02 = jrVar.w0();
                jrVar.B0();
                jrVar.A0(w02);
                return;
            case 24:
                ((qc) this.b).j();
                ((qy) this.c).E = null;
                return;
            case 25:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.b;
                while (!((Set) this.c).isEmpty()) {
                    try {
                        rb.l lVar = (rb.l) referenceQueue.remove();
                        if (lVar.a.remove(lVar)) {
                            lVar.clear();
                            lVar.b.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case 26:
                Callable callable = (Callable) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource.setResult(callable.call());
                    return;
                } catch (nb.a e11) {
                    taskCompletionSource.setException(e11);
                    return;
                } catch (Exception e12) {
                    taskCompletionSource.setException(new nb.a("Internal error has occurred when executing ML Kit tasks", e12));
                    return;
                }
            case 27:
                rb.i iVar6 = (rb.i) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                int decrementAndGet = iVar6.b.decrementAndGet();
                n6.l.k(decrementAndGet >= 0);
                if (decrementAndGet == 0) {
                    iVar6.c();
                    iVar6.c.set(false);
                }
                t7.n.a.clear();
                t7.t.a.clear();
                taskCompletionSource2.setResult(null);
                return;
            case 28:
                c2.b bVar7 = (c2.b) this.b;
                n6.l.k(((Thread) ((AtomicReference) bVar7.d).getAndSet(Thread.currentThread())) == null);
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
            default:
                s4.u uVar = (s4.u) this.b;
                b1 b1Var = uVar.e;
                s4.y yVar3 = (s4.y) this.c;
                RecyclerView recyclerView = yVar3.H;
                if (recyclerView == null || !recyclerView.G || uVar.v || b1Var.b() == -1) {
                    return;
                }
                l0 itemAnimator = yVar3.H.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.k()) {
                    ArrayList arrayList2 = yVar3.F;
                    int size2 = arrayList2.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        if (((s4.u) arrayList2.get(i16)).w) {
                        }
                    }
                    yVar3.x.q(b1Var);
                    return;
                }
                yVar3.H.post(this);
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                androidx.biometric.e eVar = new androidx.biometric.e(u.class.getSimpleName(), 11);
                t tVar = (t) this.c;
                qf.b bVar = new qf.b(12);
                ((qf.b) eVar.d).c = bVar;
                eVar.d = bVar;
                bVar.b = tVar;
                return eVar.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ u(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public u(s4.y yVar, s4.u uVar, int i10) {
        this.a = 29;
        this.c = yVar;
        this.b = uVar;
    }
}
