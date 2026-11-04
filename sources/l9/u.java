package l9;

import android.app.Application;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import b8.yd;
import com.google.android.gms.tasks.TaskCompletionSource;
import g2.k0;
import gi.w5;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.p1;
import org.telegram.messenger.q1;
import org.telegram.messenger.r1;
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.uo;
import org.telegram.ui.fx;
import org.telegram.ui.gq;
import org.telegram.ui.hl;
import org.telegram.ui.iq;
import org.telegram.ui.nq;
import org.telegram.ui.wm;
import u4.d1;
import u4.m0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public /* synthetic */ u(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        l6.l lVar = (l6.l) this.c;
        l6.k kVar = (l6.k) this.b;
        int i3 = lVar.a;
        synchronized (kVar) {
            SparseArray sparseArray = kVar.e;
            l6.l lVar2 = (l6.l) sparseArray.get(i3);
            if (lVar2 != null) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 20);
                sb2.append("Timing out request: ");
                sb2.append(i3);
                Log.w("MessengerIpcClient", sb2.toString());
                sparseArray.remove(i3);
                lVar2.c(new l6.m("Timed out waiting for response", null));
                kVar.d();
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
        int i3 = 2;
        int i10 = 0;
        int i11 = 0;
        char c2 = 1;
        switch (this.a) {
            case 0:
                t tVar = (t) this.c;
                y yVar = (y) this.b;
                if (yVar instanceof m9.a) {
                    o oVar = (o) ((m9.a) yVar);
                    if (oVar instanceof g) {
                        Object obj = oVar.a;
                        if (obj instanceof b) {
                            th2 = ((b) obj).a;
                        }
                    }
                    if (th2 != null) {
                        tVar.h(th2);
                        return;
                    }
                }
                try {
                    tVar.onSuccess(yd.a(yVar));
                    return;
                } catch (ExecutionException e10) {
                    tVar.h(e10.getCause());
                    return;
                } catch (Throwable th3) {
                    tVar.h(th3);
                    return;
                }
            case 1:
                androidx.biometric.z zVar = ((androidx.biometric.q) this.c).m0;
                if (zVar.e == null) {
                    zVar.e = new androidx.biometric.w();
                }
                zVar.e.c((androidx.biometric.u) this.b);
                return;
            case 2:
                be.g gVar = (be.g) this.c;
                wd.x xVar = gVar.d;
                while (true) {
                    try {
                        ((Runnable) this.b).run();
                    } catch (Throwable th4) {
                        wd.b0.m(fd.i.a, th4);
                    }
                    Runnable g7 = gVar.g();
                    if (g7 == null) {
                        return;
                    }
                    this.b = g7;
                    i10++;
                    if (i10 >= 16 && xVar.e(gVar)) {
                        xVar.c(gVar, this);
                        return;
                    }
                }
                break;
            case 3:
                ((com.google.android.gms.internal.cast.q) this.b).O0((r4.r) this.c);
                return;
            case 4:
                ((e0.c) this.b).a = this.c;
                return;
            case 5:
                ((Application) this.b).unregisterActivityLifecycleCallbacks((e0.c) this.c);
                return;
            case 6:
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
                } catch (RuntimeException e11) {
                    if (e11.getClass() == RuntimeException.class && e11.getMessage() != null && e11.getMessage().startsWith("Unable to stop")) {
                        throw e11;
                    }
                    return;
                } catch (Throwable th5) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th5);
                    return;
                }
            case 7:
                e5.b bVar = (e5.b) this.b;
                e5.f fVar = (e5.f) this.c;
                if (((e5.n) bVar.f.c) != null) {
                    ((r1) ((e5.n) bVar.f.c)).n(fVar, null, null);
                    return;
                } else {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 8:
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
            case 9:
                e5.b bVar2 = (e5.b) this.b;
                e5.g gVar2 = (e5.g) this.c;
                e5.f fVar2 = e5.z.i;
                bVar2.y(24, 4, fVar2);
                gVar2.a(fVar2);
                return;
            case 10:
                e5.b bVar3 = (e5.b) this.b;
                p1 p1Var = (p1) this.c;
                e5.f fVar3 = e5.z.i;
                bVar3.y(24, 7, fVar3);
                com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
                ((q1) p1Var.b).k(fVar3, com.google.android.gms.internal.play_billing.v.e);
                return;
            case 11:
                e5.b bVar4 = (e5.b) this.b;
                e5.m mVar = (e5.m) this.c;
                e5.f fVar4 = e5.z.i;
                bVar4.y(24, 9, fVar4);
                com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.b;
                mVar.a(fVar4, com.google.android.gms.internal.play_billing.v.e);
                return;
            case 12:
                e6.e0 e0Var = ((e6.d0) this.b).b;
                i6.d dVar = (i6.d) this.c;
                i6.b bVar5 = e6.e0.H;
                e6.d dVar2 = dVar.d;
                e6.x xVar2 = dVar.f;
                e6.d dVar3 = e0Var.u;
                f6.e0 e0Var2 = e0Var.E;
                if (!i6.a.d(dVar2, dVar3)) {
                    e0Var.u = dVar2;
                    e0Var2.c();
                }
                double d = dVar.a;
                if (Double.isNaN(d) || Math.abs(d - e0Var.w) <= 1.0E-7d) {
                    z10 = false;
                } else {
                    e0Var.w = d;
                    z10 = true;
                }
                boolean z18 = dVar.b;
                if (z18 != e0Var.x) {
                    e0Var.x = z18;
                    z10 = true;
                }
                i6.b bVar6 = e6.e0.H;
                bVar6.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(e0Var.n));
                if (e0Var2 != null && (z10 || e0Var.n)) {
                    e0Var2.f();
                }
                Double.isNaN(dVar.h);
                int i12 = dVar.c;
                if (i12 != e0Var.y) {
                    e0Var.y = i12;
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar6.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(e0Var.n));
                if (e0Var2 != null && (z11 || e0Var.n)) {
                    e0Var2.a();
                }
                int i13 = dVar.e;
                if (i13 != e0Var.z) {
                    e0Var.z = i13;
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar6.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(e0Var.n));
                if (e0Var2 != null && (z12 || e0Var.n)) {
                    e0Var2.e();
                }
                if (!i6.a.d(e0Var.A, xVar2)) {
                    e0Var.A = xVar2;
                }
                e0Var.n = false;
                return;
            case 13:
                e6.e0 e0Var3 = ((e6.d0) this.b).b;
                i6.c cVar = (i6.c) this.c;
                i6.b bVar7 = e6.e0.H;
                String str = cVar.a;
                if (i6.a.d(str, e0Var3.v)) {
                    z13 = false;
                } else {
                    e0Var3.v = str;
                    z13 = true;
                }
                e6.e0.H.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(e0Var3.o));
                f6.e0 e0Var4 = e0Var3.E;
                if (e0Var4 != null && (z13 || e0Var3.o)) {
                    e0Var4.d();
                }
                e0Var3.o = false;
                return;
            case 14:
                i6.v vVar = (i6.v) this.b;
                i6.d dVar4 = (i6.d) this.c;
                i6.b bVar8 = i6.v.Y;
                e6.d dVar5 = dVar4.d;
                e6.x xVar3 = dVar4.f;
                e6.d dVar6 = vVar.F;
                f6.e0 e0Var5 = vVar.H;
                if (!i6.a.d(dVar5, dVar6)) {
                    vVar.F = dVar5;
                    e0Var5.c();
                }
                double d10 = dVar4.a;
                if (Double.isNaN(d10) || Math.abs(d10 - vVar.Q) <= 1.0E-7d) {
                    z14 = false;
                } else {
                    vVar.Q = d10;
                    z14 = true;
                }
                boolean z19 = dVar4.b;
                if (z19 != vVar.N) {
                    vVar.N = z19;
                    z14 = true;
                }
                Double.isNaN(dVar4.h);
                i6.b bVar9 = i6.v.Y;
                bVar9.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z14), Boolean.valueOf(vVar.P));
                if (e0Var5 != null && (z14 || vVar.P)) {
                    e0Var5.f();
                }
                int i14 = dVar4.c;
                if (i14 != vVar.S) {
                    vVar.S = i14;
                    z15 = true;
                } else {
                    z15 = false;
                }
                bVar9.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z15), Boolean.valueOf(vVar.P));
                if (e0Var5 != null && (z15 || vVar.P)) {
                    e0Var5.a();
                }
                int i15 = dVar4.e;
                if (i15 != vVar.T) {
                    vVar.T = i15;
                    z16 = true;
                } else {
                    z16 = false;
                }
                bVar9.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z16), Boolean.valueOf(vVar.P));
                if (e0Var5 != null && (z16 || vVar.P)) {
                    e0Var5.e();
                }
                if (!i6.a.d(vVar.R, xVar3)) {
                    vVar.R = xVar3;
                }
                vVar.P = false;
                return;
            case 15:
                i6.v vVar2 = (i6.v) this.b;
                i6.c cVar2 = (i6.c) this.c;
                i6.b bVar10 = i6.v.Y;
                String str2 = cVar2.a;
                if (i6.a.d(str2, vVar2.M)) {
                    z17 = false;
                } else {
                    vVar2.M = str2;
                    z17 = true;
                }
                i6.v.Y.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z17), Boolean.valueOf(vVar2.O));
                f6.e0 e0Var6 = vVar2.H;
                if (e0Var6 != null && (z17 || vVar2.O)) {
                    e0Var6.d();
                }
                vVar2.O = false;
                return;
            case 16:
                IBinder iBinder = (IBinder) this.c;
                l6.k kVar = (l6.k) this.b;
                synchronized (kVar) {
                    if (iBinder == null) {
                        kVar.b("Null service connection");
                    } else {
                        try {
                            kVar.c = new p4.q(iBinder);
                            kVar.a = 2;
                            ((ScheduledExecutorService) kVar.f.c).execute(new l6.i(kVar, c2 == true ? 1 : 0));
                        } catch (RemoteException e12) {
                            kVar.b(e12.getMessage());
                        }
                    }
                }
                return;
            case 17:
                a();
                return;
            case 18:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.b;
                while (!((Set) this.c).isEmpty()) {
                    try {
                        mb.l lVar = (mb.l) referenceQueue.remove();
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
                } catch (ib.a e13) {
                    taskCompletionSource.setException(e13);
                    return;
                } catch (Exception e14) {
                    taskCompletionSource.setException(new ib.a("Internal error has occurred when executing ML Kit tasks", e14));
                    return;
                }
            case 20:
                mb.i iVar = (mb.i) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                int decrementAndGet = iVar.b.decrementAndGet();
                p6.m.j(decrementAndGet >= 0);
                if (decrementAndGet == 0) {
                    iVar.c();
                    iVar.c.set(false);
                }
                v7.n.a.clear();
                v7.r.a.clear();
                taskCompletionSource2.setResult(null);
                return;
            case 21:
                b4.n nVar = (b4.n) this.b;
                p6.m.j(((Thread) ((AtomicReference) nVar.d).getAndSet(Thread.currentThread())) == null);
                try {
                    ((Runnable) this.c).run();
                    ((AtomicReference) nVar.d).set(null);
                    nVar.F();
                    return;
                } catch (Throwable th6) {
                    try {
                        ((AtomicReference) nVar.d).set(null);
                        nVar.F();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
            case 22:
                ni.l lVar2 = (ni.l) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj4 = arrayList.get(i11);
                    i11++;
                    lVar2.B((u4.i) obj4);
                }
                arrayList.clear();
                lVar2.v.remove(arrayList);
                return;
            case 23:
                w5 w5Var = (w5) this.b;
                Typeface typeface = (Typeface) this.c;
                k0 k0Var = (k0) w5Var.b;
                if (k0Var != null) {
                    k0Var.h(typeface);
                    return;
                }
                return;
            case 24:
                ((e5.t) this.b).accept(this.c);
                return;
            case 25:
                ArrayList arrayList2 = (ArrayList) this.b;
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    if (arrayList2.get(i16) != null && ((uo) arrayList2.get(i16)).a != null) {
                        ((uo) arrayList2.get(i16)).a.m(0);
                    }
                }
                org.telegram.messenger.g0.h3(new yh(i3, this, arrayList2));
                return;
            case 26:
                wm wmVar = ((hl) this.c).b;
                if (this == wmVar.a6) {
                    wmVar.yb((CharSequence) this.b, false);
                    wmVar.a6 = null;
                    return;
                }
                return;
            case 27:
                p8 p8Var = (p8) this.b;
                boolean z20 = p8Var.d.h;
                p8Var.setChecked(!z20);
                nq nqVar = ((iq) this.c).d;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = nqVar.E;
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
                org.telegram.messenger.g0.b4(nqVar.c);
                gq B0 = nqVar.B0();
                nqVar.G0();
                nqVar.F0(B0);
                return;
            case 28:
                ((ac) this.b).j();
                ((fx) this.c).F = null;
                return;
            default:
                u4.u uVar = (u4.u) this.b;
                d1 d1Var = uVar.e;
                u4.y yVar2 = (u4.y) this.c;
                RecyclerView recyclerView = yVar2.I;
                if (recyclerView == null || !recyclerView.H || uVar.w || d1Var.b() == -1) {
                    return;
                }
                m0 itemAnimator = yVar2.I.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.k()) {
                    ArrayList arrayList3 = yVar2.G;
                    int size2 = arrayList3.size();
                    for (int i17 = 0; i17 < size2; i17++) {
                        if (((u4.u) arrayList3.get(i17)).x) {
                        }
                    }
                    yVar2.y.q(d1Var);
                    return;
                }
                yVar2.I.post(this);
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(u.class.getSimpleName(), 19);
                t tVar = (t) this.c;
                p4.q qVar = new p4.q();
                ((p4.q) a0Var.d).b = qVar;
                a0Var.d = qVar;
                qVar.a = tVar;
                return a0Var.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ u(e5.b bVar, e5.g gVar, com.google.android.gms.internal.clearcut.e eVar) {
        this.a = 9;
        this.b = bVar;
        this.c = gVar;
    }

    public /* synthetic */ u(Object obj, Object obj2, boolean z10, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = obj2;
    }

    public u(u4.y yVar, u4.u uVar, int i3) {
        this.a = 29;
        this.c = yVar;
        this.b = uVar;
    }
}
