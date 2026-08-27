package o0;

import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.s;
import e7.n;
import e7.u;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import m5.y;
import n2.t;
import n5.e0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Components.ec;
import org.telegram.ui.er;
import org.telegram.ui.hm;
import org.telegram.ui.hr;
import org.telegram.ui.i6;
import org.telegram.ui.lr;
import org.telegram.ui.rn;
import org.telegram.ui.sy;
import r5.w;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        u5.i iVar = (u5.i) this.b;
        int i10 = ((u5.j) this.c).a;
        synchronized (iVar) {
            u5.j jVar = (u5.j) iVar.e.get(i10);
            if (jVar != null) {
                Log.w("MessengerIpcClient", "Timing out request: " + i10);
                iVar.e.remove(i10);
                jVar.b(new s("Timed out waiting for response", null));
                iVar.c();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10 = 0;
        switch (this.a) {
            case 0:
                ((t) this.b).accept(this.c);
                return;
            case 1:
                rn rnVar = ((hm) this.c).c;
                if (this == rnVar.F5) {
                    rnVar.Ya((CharSequence) this.b, false);
                    rnVar.F5 = null;
                    return;
                }
                return;
            case 2:
                o8 o8Var = (o8) this.b;
                boolean z14 = o8Var.d.h;
                o8Var.setChecked(!z14);
                lr lrVar = ((hr) this.c).d;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = lrVar.A;
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
                AndroidUtilities.updateVisibleRows(lrVar.c);
                er w02 = lrVar.w0();
                lrVar.B0();
                lrVar.A0(w02);
                return;
            case 3:
                ((ec) this.b).j();
                ((sy) this.c).A = null;
                return;
            case 4:
                w wVar = (w) this.b;
                r5.d dVar = (r5.d) this.c;
                r5.b bVar = w.j0;
                m5.d dVar2 = dVar.d;
                y yVar = dVar.f;
                m5.d dVar3 = wVar.Q;
                e0 e0Var = wVar.S;
                if (!r5.a.d(dVar2, dVar3)) {
                    wVar.Q = dVar2;
                    e0Var.c();
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
                r5.b bVar2 = w.j0;
                bVar2.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(wVar.a0));
                if (e0Var != null && (z10 || wVar.a0)) {
                    e0Var.f();
                }
                int i11 = dVar.c;
                if (i11 != wVar.d0) {
                    wVar.d0 = i11;
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar2.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(wVar.a0));
                if (e0Var != null && (z11 || wVar.a0)) {
                    e0Var.a();
                }
                int i12 = dVar.e;
                if (i12 != wVar.e0) {
                    wVar.e0 = i12;
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar2.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(wVar.a0));
                if (e0Var != null && (z12 || wVar.a0)) {
                    e0Var.e();
                }
                if (!r5.a.d(wVar.c0, yVar)) {
                    wVar.c0 = yVar;
                }
                wVar.a0 = false;
                return;
            case 5:
                w wVar2 = (w) this.b;
                r5.c cVar = (r5.c) this.c;
                r5.b bVar3 = w.j0;
                String str = cVar.a;
                if (r5.a.d(str, wVar2.X)) {
                    z13 = false;
                } else {
                    wVar2.X = str;
                    z13 = true;
                }
                w.j0.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(wVar2.Z));
                e0 e0Var2 = wVar2.S;
                if (e0Var2 != null && (z13 || wVar2.Z)) {
                    e0Var2.d();
                }
                wVar2.Z = false;
                return;
            case 6:
                sh.m mVar = (sh.m) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    mVar.B((f2.j) obj);
                }
                arrayList.clear();
                mVar.v.remove(arrayList);
                return;
            case 7:
                u5.i iVar = (u5.i) this.b;
                IBinder iBinder = (IBinder) this.c;
                synchronized (iVar) {
                    if (iBinder == null) {
                        iVar.a("Null service connection");
                    } else {
                        try {
                            iVar.c = new i6(iBinder);
                            iVar.a = 2;
                            ((ScheduledExecutorService) iVar.f.c).execute(new u5.g(iVar, i10));
                        } catch (RemoteException e9) {
                            iVar.a(e9.getMessage());
                        }
                    }
                }
                return;
            case 8:
                a();
                return;
            case 9:
                x1.a aVar = (x1.a) this.b;
                Object obj2 = this.c;
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
            case 10:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.b;
                while (!((Set) this.c).isEmpty()) {
                    try {
                        za.l lVar = (za.l) referenceQueue.remove();
                        if (lVar.a.remove(lVar)) {
                            lVar.clear();
                            lVar.b.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case 11:
                Callable callable = (Callable) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource.setResult(callable.call());
                    return;
                } catch (va.a e10) {
                    taskCompletionSource.setException(e10);
                    return;
                } catch (Exception e11) {
                    taskCompletionSource.setException(new va.a("Internal error has occurred when executing ML Kit tasks", e11));
                    return;
                }
            case 12:
                za.i iVar2 = (za.i) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                int decrementAndGet = iVar2.b.decrementAndGet();
                y5.l.k(decrementAndGet >= 0);
                if (decrementAndGet == 0) {
                    iVar2.c();
                    iVar2.c.set(false);
                }
                n.a.clear();
                u.a.clear();
                taskCompletionSource2.setResult(null);
                return;
            default:
                com.google.firebase.messaging.l lVar2 = (com.google.firebase.messaging.l) this.b;
                y5.l.k(((Thread) ((AtomicReference) lVar2.d).getAndSet(Thread.currentThread())) == null);
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
        }
    }

    public /* synthetic */ m(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }
}
