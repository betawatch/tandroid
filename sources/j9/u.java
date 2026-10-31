package j9;

import android.app.Application;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
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
import org.telegram.messenger.i0;
import org.telegram.messenger.oi;
import org.telegram.messenger.s1;
import org.telegram.messenger.t1;
import org.telegram.messenger.u1;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.wb;
import org.telegram.ui.hm;
import org.telegram.ui.jr;
import org.telegram.ui.lr;
import org.telegram.ui.ly;
import org.telegram.ui.pr;
import org.telegram.ui.un;
import s4.c1;
import s4.l0;
import v7.p8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        IBinder iBinder = (IBinder) this.c;
        synchronized (jVar) {
            if (iBinder == null) {
                jVar.a("Null service connection");
                return;
            }
            try {
                jVar.c = new n4.q(iBinder);
                jVar.a = 2;
                ((ScheduledExecutorService) jVar.f.c).execute(new j6.h(jVar, 0));
            } catch (RemoteException e) {
                jVar.a(e.getMessage());
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
                kVar.b(new j6.l("Timed out waiting for response", null));
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
    
        s9.j.f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.b), (java.lang.Throwable) r3);
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
                synchronized (((s9.j) this.c).b) {
                    if (!z10) {
                        s9.j jVar = (s9.j) this.c;
                        if (jVar.c != 4) {
                            jVar.d++;
                            jVar.c = 4;
                            z10 = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((s9.j) this.c).b.poll();
                    this.b = runnable;
                    if (runnable == null) {
                        ((s9.j) this.c).c = 1;
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
                    tVar.onSuccess(p8.a(yVar));
                    return;
                } catch (ExecutionException e) {
                    tVar.i(e.getCause());
                    return;
                } catch (Throwable th3) {
                    tVar.i(th3);
                    return;
                }
            case 1:
                androidx.biometric.y yVar2 = ((androidx.biometric.p) this.c).l0;
                if (yVar2.e == null) {
                    yVar2.e = new androidx.biometric.v();
                }
                yVar2.e.c((androidx.biometric.t) this.b);
                return;
            case 2:
                c5.b bVar = (c5.b) this.b;
                c5.g gVar = (c5.g) this.c;
                if (((c5.o) bVar.f.c) != null) {
                    ((u1) ((c5.o) bVar.f.c)).n(gVar, null, null);
                    return;
                } else {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 3:
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
            case 4:
                c5.b bVar2 = (c5.b) this.b;
                c5.h hVar = (c5.h) this.c;
                c5.g gVar2 = c5.c0.i;
                bVar2.y(24, 4, gVar2);
                hVar.a(gVar2);
                return;
            case 5:
                c5.b bVar3 = (c5.b) this.b;
                s1 s1Var = (s1) this.c;
                c5.g gVar3 = c5.c0.i;
                bVar3.y(24, 7, gVar3);
                com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
                ((t1) s1Var.b).a(gVar3, com.google.android.gms.internal.play_billing.v.e);
                return;
            case 6:
                c5.b bVar4 = (c5.b) this.b;
                c5.n nVar = (c5.n) this.c;
                c5.g gVar4 = c5.c0.i;
                bVar4.y(24, 9, gVar4);
                com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.b;
                nVar.b(gVar4, com.google.android.gms.internal.play_billing.v.e);
                return;
            case 7:
                c6.e0 e0Var = ((c6.d0) this.b).b;
                g6.d dVar = (g6.d) this.c;
                g6.b bVar5 = c6.e0.G;
                c6.d dVar2 = dVar.d;
                c6.x xVar = dVar.f;
                c6.d dVar3 = e0Var.t;
                d6.d0 d0Var = e0Var.D;
                if (!g6.a.d(dVar2, dVar3)) {
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
                g6.b bVar6 = c6.e0.G;
                bVar6.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(e0Var.m));
                if (d0Var != null && (z10 || e0Var.m)) {
                    d0Var.f();
                }
                Double.isNaN(dVar.h);
                int i11 = dVar.c;
                if (i11 != e0Var.x) {
                    e0Var.x = i11;
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar6.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(e0Var.m));
                if (d0Var != null && (z11 || e0Var.m)) {
                    d0Var.a();
                }
                int i12 = dVar.e;
                if (i12 != e0Var.y) {
                    e0Var.y = i12;
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar6.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(e0Var.m));
                if (d0Var != null && (z12 || e0Var.m)) {
                    d0Var.e();
                }
                if (!g6.a.d(e0Var.z, xVar)) {
                    e0Var.z = xVar;
                }
                e0Var.m = false;
                return;
            case 8:
                c6.e0 e0Var2 = ((c6.d0) this.b).b;
                g6.c cVar = (g6.c) this.c;
                g6.b bVar7 = c6.e0.G;
                String str = cVar.a;
                if (g6.a.d(str, e0Var2.u)) {
                    z13 = false;
                } else {
                    e0Var2.u = str;
                    z13 = true;
                }
                c6.e0.G.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(e0Var2.n));
                d6.d0 d0Var2 = e0Var2.D;
                if (d0Var2 != null && (z13 || e0Var2.n)) {
                    d0Var2.d();
                }
                e0Var2.n = false;
                return;
            case 9:
                ci.o oVar2 = (ci.o) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    oVar2.B((s4.h) obj2);
                }
                arrayList.clear();
                oVar2.v.remove(arrayList);
                return;
            case 10:
                ((com.google.android.gms.internal.cast.q) this.b).O0((p4.s) this.c);
                return;
            case 11:
                ((e0.d) this.b).a = this.c;
                return;
            case 12:
                ((Application) this.b).unregisterActivityLifecycleCallbacks((e0.d) this.c);
                return;
            case 13:
                Object obj3 = this.c;
                Object obj4 = this.b;
                try {
                    Method method = e0.e.d;
                    if (method != null) {
                        method.invoke(obj4, obj3, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        e0.e.e.invoke(obj4, obj3, Boolean.FALSE);
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
                g6.v vVar = (g6.v) this.b;
                g6.d dVar4 = (g6.d) this.c;
                g6.b bVar8 = g6.v.n0;
                c6.d dVar5 = dVar4.d;
                c6.x xVar2 = dVar4.f;
                c6.d dVar6 = vVar.U;
                d6.d0 d0Var3 = vVar.W;
                if (!g6.a.d(dVar5, dVar6)) {
                    vVar.U = dVar5;
                    d0Var3.c();
                }
                double d10 = dVar4.a;
                if (Double.isNaN(d10) || Math.abs(d10 - vVar.f0) <= 1.0E-7d) {
                    z14 = false;
                } else {
                    vVar.f0 = d10;
                    z14 = true;
                }
                boolean z19 = dVar4.b;
                if (z19 != vVar.c0) {
                    vVar.c0 = z19;
                    z14 = true;
                }
                Double.isNaN(dVar4.h);
                g6.b bVar9 = g6.v.n0;
                bVar9.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z14), Boolean.valueOf(vVar.e0));
                if (d0Var3 != null && (z14 || vVar.e0)) {
                    d0Var3.f();
                }
                int i13 = dVar4.c;
                if (i13 != vVar.h0) {
                    vVar.h0 = i13;
                    z15 = true;
                } else {
                    z15 = false;
                }
                bVar9.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z15), Boolean.valueOf(vVar.e0));
                if (d0Var3 != null && (z15 || vVar.e0)) {
                    d0Var3.a();
                }
                int i14 = dVar4.e;
                if (i14 != vVar.i0) {
                    vVar.i0 = i14;
                    z16 = true;
                } else {
                    z16 = false;
                }
                bVar9.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z16), Boolean.valueOf(vVar.e0));
                if (d0Var3 != null && (z16 || vVar.e0)) {
                    d0Var3.e();
                }
                if (!g6.a.d(vVar.g0, xVar2)) {
                    vVar.g0 = xVar2;
                }
                vVar.e0 = false;
                return;
            case 15:
                g6.v vVar2 = (g6.v) this.b;
                g6.c cVar2 = (g6.c) this.c;
                g6.b bVar10 = g6.v.n0;
                String str2 = cVar2.a;
                if (g6.a.d(str2, vVar2.b0)) {
                    z17 = false;
                } else {
                    vVar2.b0 = str2;
                    z17 = true;
                }
                g6.v.n0.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z17), Boolean.valueOf(vVar2.d0));
                d6.d0 d0Var4 = vVar2.W;
                if (d0Var4 != null && (z17 || vVar2.d0)) {
                    d0Var4.d();
                }
                vVar2.d0 = false;
                return;
            case 16:
                a();
                return;
            case 17:
                b();
                return;
            case 18:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.b;
                while (!((Set) this.c).isEmpty()) {
                    try {
                        jb.l lVar = (jb.l) referenceQueue.remove();
                        if (lVar.a.remove(lVar)) {
                            lVar.clear();
                            lVar.b.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case 19:
                Callable callable = (Callable) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource.setResult(callable.call());
                    return;
                } catch (fb.a e10) {
                    taskCompletionSource.setException(e10);
                    return;
                } catch (Exception e11) {
                    taskCompletionSource.setException(new fb.a("Internal error has occurred when executing ML Kit tasks", e11));
                    return;
                }
            case 20:
                jb.i iVar = (jb.i) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                int decrementAndGet = iVar.b.decrementAndGet();
                n6.l.j(decrementAndGet >= 0);
                if (decrementAndGet == 0) {
                    iVar.c();
                    iVar.c.set(false);
                }
                t7.n.a.clear();
                t7.t.a.clear();
                taskCompletionSource2.setResult(null);
                return;
            case 21:
                ac.a aVar = (ac.a) this.b;
                n6.l.j(((Thread) ((AtomicReference) aVar.d).getAndSet(Thread.currentThread())) == null);
                try {
                    ((Runnable) this.c).run();
                    ((AtomicReference) aVar.d).set(null);
                    aVar.E();
                    return;
                } catch (Throwable th5) {
                    try {
                        ((AtomicReference) aVar.d).set(null);
                        aVar.E();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            case 22:
                za.c cVar3 = (za.c) this.b;
                Typeface typeface = (Typeface) this.c;
                j0 j0Var = (j0) cVar3.b;
                if (j0Var != null) {
                    j0Var.h(typeface);
                    return;
                }
                return;
            case 23:
                ((c5.v) this.b).accept(this.c);
                return;
            case 24:
                ArrayList arrayList2 = (ArrayList) this.b;
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    if (arrayList2.get(i15) != null && ((cp) arrayList2.get(i15)).a != null) {
                        ((cp) arrayList2.get(i15)).a.m(0);
                    }
                }
                i0.g3(new oi(i10, this, arrayList2));
                return;
            case 25:
                un unVar = ((hm) this.c).b;
                if (this == unVar.Z5) {
                    unVar.ob((CharSequence) this.b, false);
                    unVar.Z5 = null;
                    return;
                }
                return;
            case 26:
                s8 s8Var = (s8) this.b;
                boolean z20 = s8Var.d.h;
                s8Var.setChecked(!z20);
                pr prVar = ((lr) this.c).d;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = prVar.D;
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
                i0.a4(prVar.c);
                jr A0 = prVar.A0();
                prVar.F0();
                prVar.E0(A0);
                return;
            case 27:
                ((wb) this.b).j();
                ((ly) this.c).E = null;
                return;
            case 28:
                s4.t tVar2 = (s4.t) this.b;
                c1 c1Var = tVar2.e;
                s4.x xVar3 = (s4.x) this.c;
                RecyclerView recyclerView = xVar3.H;
                if (recyclerView == null || !recyclerView.G || tVar2.w || c1Var.b() == -1) {
                    return;
                }
                l0 itemAnimator = xVar3.H.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.k()) {
                    ArrayList arrayList3 = xVar3.F;
                    int size2 = arrayList3.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        if (((s4.t) arrayList3.get(i16)).x) {
                        }
                    }
                    xVar3.y.q(c1Var);
                    return;
                }
                xVar3.H.post(this);
                return;
            default:
                try {
                    c();
                    return;
                } catch (Error e12) {
                    synchronized (((s9.j) this.c).b) {
                        ((s9.j) this.c).c = 1;
                        throw e12;
                    }
                }
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(u.class.getSimpleName(), 13);
                t tVar = (t) this.c;
                hf.b bVar = new hf.b(14, false);
                ((hf.b) a0Var.d).c = bVar;
                a0Var.d = bVar;
                bVar.b = tVar;
                return a0Var.toString();
            case 29:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i10 = ((s9.j) this.c).c;
                sb2.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ u(c5.b bVar, c5.h hVar, k6.h hVar2) {
        this.a = 4;
        this.b = bVar;
        this.c = hVar;
    }

    public /* synthetic */ u(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public u(s9.j jVar) {
        this.a = 29;
        this.c = jVar;
    }

    public u(s4.x xVar, s4.t tVar, int i10) {
        this.a = 28;
        this.c = xVar;
        this.b = tVar;
    }
}
