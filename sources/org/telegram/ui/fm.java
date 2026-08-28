package org.telegram.ui;

import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fm implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fm(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.c = obj;
        this.b = obj2;
    }

    private final void a() {
        t5.j jVar = (t5.j) this.b;
        IBinder iBinder = (IBinder) this.c;
        synchronized (jVar) {
            if (iBinder == null) {
                jVar.a("Null service connection");
                return;
            }
            try {
                jVar.c = new org.telegram.ui.Cells.e3(iBinder);
                jVar.a = 2;
                ((ScheduledExecutorService) jVar.f.c).execute(new t5.h(jVar, 0));
            } catch (RemoteException e10) {
                jVar.a(e10.getMessage());
            }
        }
    }

    private final void b() {
        t5.j jVar = (t5.j) this.b;
        int i9 = ((t5.k) this.c).a;
        synchronized (jVar) {
            t5.k kVar = (t5.k) jVar.e.get(i9);
            if (kVar != null) {
                Log.w("MessengerIpcClient", "Timing out request: " + i9);
                jVar.e.remove(i9);
                kVar.b(new com.google.firebase.messaging.s("Timed out waiting for response", null));
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
    
        z8.i.f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.b), (java.lang.Throwable) r3);
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
                synchronized (((z8.i) this.c).b) {
                    if (!z10) {
                        z8.i iVar = (z8.i) this.c;
                        if (iVar.c != 4) {
                            iVar.d++;
                            iVar.c = 4;
                            z10 = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((z8.i) this.c).b.poll();
                    this.b = runnable;
                    if (runnable == null) {
                        ((z8.i) this.c).c = 1;
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

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i9 = 0;
        switch (this.a) {
            case 0:
                qn qnVar = ((gm) this.c).c;
                if (this == qnVar.F5) {
                    qnVar.Ya((CharSequence) this.b, false);
                    qnVar.F5 = null;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) this.b;
                boolean z14 = s8Var.d.h;
                s8Var.setChecked(!z14);
                jr jrVar = ((er) this.c).d;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = jrVar.A;
                tL_chatBannedRights.send_media = z14;
                tL_chatBannedRights.send_gifs = z14;
                tL_chatBannedRights.send_inline = z14;
                tL_chatBannedRights.send_games = z14;
                tL_chatBannedRights.send_photos = z14;
                tL_chatBannedRights.send_videos = z14;
                tL_chatBannedRights.send_stickers = z14;
                tL_chatBannedRights.send_audios = z14;
                tL_chatBannedRights.send_docs = z14;
                tL_chatBannedRights.send_voices = z14;
                tL_chatBannedRights.send_roundvideos = z14;
                tL_chatBannedRights.embed_links = z14;
                tL_chatBannedRights.send_polls = z14;
                tL_chatBannedRights.send_reactions = z14;
                AndroidUtilities.updateVisibleRows(jrVar.c);
                cr v02 = jrVar.v0();
                jrVar.A0();
                jrVar.z0(v02);
                return;
            case 2:
                ((org.telegram.ui.Components.gc) this.b).j();
                ((py) this.c).A = null;
                return;
            case 3:
                q5.w wVar = (q5.w) this.b;
                q5.d dVar = (q5.d) this.c;
                q5.b bVar = q5.w.j0;
                m5.d dVar2 = dVar.d;
                m5.x xVar = dVar.f;
                m5.d dVar3 = wVar.Q;
                n5.f0 f0Var = wVar.S;
                if (!q5.a.d(dVar2, dVar3)) {
                    wVar.Q = dVar2;
                    f0Var.c();
                }
                double d = dVar.a;
                if (Double.isNaN(d) || Math.abs(d - wVar.b0) <= 1.0E-7d) {
                    z10 = false;
                } else {
                    wVar.b0 = d;
                    z10 = true;
                }
                boolean z15 = dVar.b;
                if (z15 != wVar.Y) {
                    wVar.Y = z15;
                    z10 = true;
                }
                Double.isNaN(dVar.h);
                q5.b bVar2 = q5.w.j0;
                bVar2.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(wVar.a0));
                if (f0Var != null && (z10 || wVar.a0)) {
                    f0Var.f();
                }
                int i10 = dVar.c;
                if (i10 != wVar.d0) {
                    wVar.d0 = i10;
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar2.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(wVar.a0));
                if (f0Var != null && (z11 || wVar.a0)) {
                    f0Var.a();
                }
                int i11 = dVar.e;
                if (i11 != wVar.e0) {
                    wVar.e0 = i11;
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar2.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(wVar.a0));
                if (f0Var != null && (z12 || wVar.a0)) {
                    f0Var.e();
                }
                if (!q5.a.d(wVar.c0, xVar)) {
                    wVar.c0 = xVar;
                }
                wVar.a0 = false;
                return;
            case 4:
                q5.w wVar2 = (q5.w) this.b;
                q5.c cVar = (q5.c) this.c;
                q5.b bVar3 = q5.w.j0;
                String str = cVar.a;
                if (q5.a.d(str, wVar2.X)) {
                    z13 = false;
                } else {
                    wVar2.X = str;
                    z13 = true;
                }
                q5.w.j0.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(wVar2.Z));
                n5.f0 f0Var2 = wVar2.S;
                if (f0Var2 != null && (z13 || wVar2.Z)) {
                    f0Var2.d();
                }
                wVar2.Z = false;
                return;
            case 5:
                rh.m mVar = (rh.m) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    mVar.B((f2.l) obj);
                }
                arrayList.clear();
                mVar.v.remove(arrayList);
                return;
            case 6:
                a();
                return;
            case 7:
                b();
                return;
            case 8:
                x1.a aVar = (x1.a) this.c;
                Object obj2 = this.b;
                if (aVar.c.get()) {
                    k5.d dVar4 = aVar.e;
                    if (dVar4.h == aVar) {
                        SystemClock.uptimeMillis();
                        dVar4.h = null;
                        dVar4.b();
                    }
                } else {
                    k5.d dVar5 = aVar.e;
                    if (dVar5.g != aVar) {
                        if (dVar5.h == aVar) {
                            SystemClock.uptimeMillis();
                            dVar5.h = null;
                            dVar5.b();
                        }
                    } else if (!dVar5.c) {
                        SystemClock.uptimeMillis();
                        dVar5.g = null;
                        w1.a aVar2 = dVar5.a;
                        if (aVar2 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                aVar2.j(obj2);
                            } else {
                                aVar2.h(obj2);
                            }
                        }
                    }
                }
                aVar.b = 3;
                return;
            case 9:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.b;
                while (!((Set) this.c).isEmpty()) {
                    try {
                        ya.l lVar = (ya.l) referenceQueue.remove();
                        if (lVar.a.remove(lVar)) {
                            lVar.clear();
                            lVar.b.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case 10:
                Callable callable = (Callable) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource.setResult(callable.call());
                    return;
                } catch (ua.a e10) {
                    taskCompletionSource.setException(e10);
                    return;
                } catch (Exception e11) {
                    taskCompletionSource.setException(new ua.a("Internal error has occurred when executing ML Kit tasks", e11));
                    return;
                }
            case 11:
                ya.i iVar = (ya.i) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                int decrementAndGet = iVar.b.decrementAndGet();
                x5.l.k(decrementAndGet >= 0);
                if (decrementAndGet == 0) {
                    iVar.c();
                    iVar.c.set(false);
                }
                d7.n.a.clear();
                d7.t.a.clear();
                taskCompletionSource2.setResult(null);
                return;
            case 12:
                com.google.firebase.messaging.l lVar2 = (com.google.firebase.messaging.l) this.b;
                x5.l.k(((Thread) ((AtomicReference) lVar2.d).getAndSet(Thread.currentThread())) == null);
                try {
                    ((Runnable) this.c).run();
                    ((AtomicReference) lVar2.d).set(null);
                    lVar2.v();
                    return;
                } catch (Throwable th) {
                    try {
                        ((AtomicReference) lVar2.d).set(null);
                        lVar2.v();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                try {
                    c();
                    return;
                } catch (Error e12) {
                    synchronized (((z8.i) this.c).b) {
                        ((z8.i) this.c).c = 1;
                        throw e12;
                    }
                }
        }
    }

    public String toString() {
        switch (this.a) {
            case 13:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i9 = ((z8.i) this.c).c;
                sb2.append(i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? BuildConfig.BETA_URL : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ fm(Object obj, Object obj2, boolean z10, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    public fm(z8.i iVar) {
        this.a = 13;
        this.c = iVar;
    }
}
