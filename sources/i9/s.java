package i9;

import ae.a1;
import android.app.Application;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import c5.g0;
import com.google.android.gms.tasks.TaskCompletionSource;
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
import org.telegram.ui.Components.tc;
import org.telegram.ui.fz;
import org.telegram.ui.mr;
import org.telegram.ui.pr;
import org.telegram.ui.qm;
import org.telegram.ui.tr;
import org.telegram.ui.zn;
import v7.j8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class s implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public /* synthetic */ s(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        j6.j jVar = (j6.j) this.b;
        IBinder iBinder = (IBinder) this.c;
        synchronized (jVar) {
            if (iBinder == null) {
                jVar.a("Null service connection");
                return;
            }
            try {
                jVar.c = new n4.x(iBinder);
                jVar.a = 2;
                ((ScheduledExecutorService) jVar.f.c).execute(new j6.h(jVar, 0));
            } catch (RemoteException e7) {
                jVar.a(e7.getMessage());
            }
        }
    }

    private final void b() {
        j6.j jVar = (j6.j) this.b;
        int i10 = ((j6.k) this.c).a;
        synchronized (jVar) {
            j6.k kVar = (j6.k) jVar.e.get(i10);
            if (kVar != null) {
                Log.w("MessengerIpcClient", "Timing out request: " + i10);
                jVar.e.remove(i10);
                kVar.b(new cc.k("Timed out waiting for response", null));
                jVar.c();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        ((java.lang.Runnable) r10.b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r10.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        r9.i.f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c() {
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            try {
                synchronized (((r9.i) this.c).b) {
                    if (!z10) {
                        r9.i iVar = (r9.i) this.c;
                        if (iVar.c != 4) {
                            iVar.d++;
                            iVar.c = 4;
                            z10 = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((r9.i) this.c).b.poll();
                    this.b = runnable;
                    if (runnable == null) {
                        ((r9.i) this.c).c = 1;
                    }
                }
                if (!z11) {
                    return;
                }
            } finally {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
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
                r rVar = (r) this.c;
                w wVar = (w) this.b;
                if (wVar instanceof j9.a) {
                    o oVar = (o) ((j9.a) wVar);
                    if (oVar instanceof g) {
                        Object obj = oVar.a;
                        if (obj instanceof b) {
                            th2 = ((b) obj).a;
                        }
                    }
                    if (th2 != null) {
                        rVar.h(th2);
                        return;
                    }
                }
                try {
                    rVar.onSuccess(j8.a(wVar));
                    return;
                } catch (ExecutionException e7) {
                    rVar.h(e7.getCause());
                    return;
                } catch (Throwable th3) {
                    rVar.h(th3);
                    return;
                }
            case 1:
                ((ae.m) this.c).D((a1) this.b);
                return;
            case 2:
                androidx.biometric.x xVar = ((androidx.biometric.p) this.c).l0;
                if (xVar.e == null) {
                    xVar.e = new androidx.biometric.u();
                }
                xVar.e.c((androidx.biometric.s) this.b);
                return;
            case 3:
                ((ae.m) this.b).D((be.e) this.c);
                return;
            case 4:
                c5.c cVar = (c5.c) this.b;
                c5.h hVar = (c5.h) this.c;
                if (((c5.q) cVar.f.c) != null) {
                    ((c5.q) cVar.f.c).onPurchasesUpdated(hVar, null);
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
                c5.c cVar2 = (c5.c) this.b;
                org.telegram.messenger.d0 d0Var = (org.telegram.messenger.d0) this.c;
                c5.h hVar2 = g0.i;
                cVar2.y(24, 7, hVar2);
                com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
                com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.e;
                d0Var.a(hVar2, new c5.s(vVar, vVar));
                return;
            case 7:
                c5.c cVar3 = (c5.c) this.b;
                c5.p pVar2 = (c5.p) this.c;
                c5.h hVar3 = g0.i;
                cVar3.y(24, 9, hVar3);
                com.google.android.gms.internal.play_billing.p pVar3 = com.google.android.gms.internal.play_billing.r.b;
                pVar2.a(hVar3, com.google.android.gms.internal.play_billing.v.e);
                return;
            case 8:
                c6.e0 e0Var = ((c6.d0) this.b).b;
                g6.d dVar = (g6.d) this.c;
                g6.b bVar = c6.e0.G;
                c6.d dVar2 = dVar.d;
                c6.x xVar2 = dVar.f;
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
                if (!g6.a.d(e0Var.z, xVar2)) {
                    e0Var.z = xVar2;
                }
                e0Var.m = false;
                return;
            case 9:
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
            case 10:
                ((com.google.android.gms.internal.cast.r) this.b).M0((p4.r) this.c);
                return;
            case 11:
                ((e0.d) this.b).a = this.c;
                return;
            case 12:
                ((Application) this.b).unregisterActivityLifecycleCallbacks((e0.d) this.c);
                return;
            case 13:
                Object obj2 = this.c;
                Object obj3 = this.b;
                try {
                    Method method = e0.e.d;
                    if (method != null) {
                        method.invoke(obj3, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        e0.e.e.invoke(obj3, obj2, Boolean.FALSE);
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
                fe.i iVar = (fe.i) this.c;
                ae.b0 b0Var = iVar.c;
                while (true) {
                    try {
                        ((Runnable) this.b).run();
                    } catch (Throwable th5) {
                        ae.g0.m(th5, jd.i.a);
                    }
                    Runnable f7 = iVar.f();
                    if (f7 == null) {
                        return;
                    }
                    this.b = f7;
                    i10++;
                    if (i10 >= 16 && b0Var.e()) {
                        b0Var.c(iVar, this);
                        return;
                    }
                }
                break;
            case 15:
                g6.v vVar2 = (g6.v) this.b;
                g6.d dVar4 = (g6.d) this.c;
                g6.b bVar4 = g6.v.n0;
                c6.d dVar5 = dVar4.d;
                c6.x xVar3 = dVar4.f;
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
                if (!g6.a.d(vVar2.g0, xVar3)) {
                    vVar2.g0 = xVar3;
                }
                vVar2.e0 = false;
                return;
            case 16:
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
            case 17:
                a();
                return;
            case 18:
                b();
                return;
            case 19:
                ji.n nVar = (ji.n) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj4 = arrayList.get(i11);
                    i11++;
                    nVar.B((s4.h) obj4);
                }
                arrayList.clear();
                nVar.v.remove(arrayList);
                return;
            case 20:
                xa.d dVar7 = (xa.d) this.b;
                Typeface typeface = (Typeface) this.c;
                e2.a0 a0Var = (e2.a0) dVar7.b;
                if (a0Var != null) {
                    a0Var.g(typeface);
                    return;
                }
                return;
            case 21:
                ((c5.z) this.b).accept(this.c);
                return;
            case 22:
                zn znVar = ((qm) this.c).c;
                if (this == znVar.J5) {
                    znVar.cb((CharSequence) this.b, false);
                    znVar.J5 = null;
                    return;
                }
                return;
            case 23:
                v8 v8Var = (v8) this.b;
                boolean z20 = v8Var.d.h;
                v8Var.setChecked(!z20);
                tr trVar = ((pr) this.c).d;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = trVar.E;
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
                AndroidUtilities.updateVisibleRows(trVar.c);
                mr w02 = trVar.w0();
                trVar.B0();
                trVar.A0(w02);
                return;
            case 24:
                ((tc) this.b).j();
                ((fz) this.c).E = null;
                return;
            case 25:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.b;
                while (!((Set) this.c).isEmpty()) {
                    try {
                        qb.l lVar = (qb.l) referenceQueue.remove();
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
                } catch (mb.a e11) {
                    taskCompletionSource.setException(e11);
                    return;
                } catch (Exception e12) {
                    taskCompletionSource.setException(new mb.a("Internal error has occurred when executing ML Kit tasks", e12));
                    return;
                }
            case 27:
                qb.i iVar2 = (qb.i) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                int decrementAndGet = iVar2.b.decrementAndGet();
                n6.l.k(decrementAndGet >= 0);
                if (decrementAndGet == 0) {
                    iVar2.c();
                    iVar2.c.set(false);
                }
                t7.n.a.clear();
                t7.s.a.clear();
                taskCompletionSource2.setResult(null);
                return;
            case 28:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.b;
                n6.l.k(((Thread) ((AtomicReference) mVar.d).getAndSet(Thread.currentThread())) == null);
                try {
                    ((Runnable) this.c).run();
                    ((AtomicReference) mVar.d).set(null);
                    mVar.B();
                    return;
                } catch (Throwable th6) {
                    try {
                        ((AtomicReference) mVar.d).set(null);
                        mVar.B();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
            default:
                try {
                    c();
                    return;
                } catch (Error e13) {
                    synchronized (((r9.i) this.c).b) {
                        ((r9.i) this.c).c = 1;
                        throw e13;
                    }
                }
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                aa.a aVar = new aa.a(s.class.getSimpleName(), 13);
                r rVar = (r) this.c;
                n4.x xVar = new n4.x(11, false);
                ((n4.x) aVar.d).c = xVar;
                aVar.d = xVar;
                xVar.b = rVar;
                return aVar.toString();
            case 29:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i10 = ((r9.i) this.c).c;
                sb2.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ s(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public s(r9.i iVar) {
        this.a = 29;
        this.c = iVar;
    }
}
