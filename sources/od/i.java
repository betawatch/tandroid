package od;

import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import jd.a0;
import jd.e0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.mc;
import org.telegram.ui.dr;
import org.telegram.ui.fr;
import org.telegram.ui.im;
import org.telegram.ui.jr;
import org.telegram.ui.ry;
import org.telegram.ui.tn;
import p5.d0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    private final void a() {
        v5.j jVar = (v5.j) this.b;
        int i10 = ((v5.k) this.c).a;
        synchronized (jVar) {
            v5.k kVar = (v5.k) jVar.e.get(i10);
            if (kVar != null) {
                Log.w("MessengerIpcClient", "Timing out request: " + i10);
                jVar.e.remove(i10);
                kVar.b(new com.google.firebase.messaging.r("Timed out waiting for response", null));
                jVar.c();
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
                j jVar = (j) this.c;
                a0 a0Var = jVar.c;
                while (true) {
                    try {
                        ((Runnable) this.b).run();
                    } catch (Throwable th2) {
                        e0.m(th2, sc.i.a);
                    }
                    Runnable f9 = jVar.f();
                    if (f9 == null) {
                        return;
                    }
                    this.b = f9;
                    i10++;
                    if (i10 >= 16 && a0Var.e()) {
                        a0Var.c(jVar, this);
                        return;
                    }
                }
                break;
            case 1:
                tn tnVar = ((im) this.c).c;
                if (this == tnVar.F5) {
                    tnVar.Ya((CharSequence) this.b, false);
                    tnVar.F5 = null;
                    return;
                }
                return;
            case 2:
                p8 p8Var = (p8) this.b;
                boolean z14 = p8Var.d.h;
                p8Var.setChecked(!z14);
                jr jrVar = ((fr) this.c).d;
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
                dr w02 = jrVar.w0();
                jrVar.B0();
                jrVar.A0(w02);
                return;
            case 3:
                ((mc) this.b).j();
                ((ry) this.c).A = null;
                return;
            case 4:
                p2.b bVar = (p2.b) this.b;
                p2.g gVar = (p2.g) this.c;
                if (((p2.n) bVar.f.c) != null) {
                    ((p2.n) bVar.f.c).onPurchasesUpdated(gVar, null);
                    return;
                } else {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 5:
                Future future = (Future) this.c;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                Runnable runnable = (Runnable) this.b;
                future.cancel(true);
                com.google.android.gms.internal.play_billing.u.h("BillingClient", "Async task is taking too long, cancel it!");
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 6:
                p2.b bVar2 = (p2.b) this.b;
                org.telegram.messenger.d dVar = (org.telegram.messenger.d) this.c;
                p2.g gVar2 = p2.z.i;
                bVar2.y(24, 7, gVar2);
                com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
                com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.e;
                dVar.a(gVar2, new p2.p(vVar, vVar));
                return;
            case 7:
                p2.b bVar3 = (p2.b) this.b;
                p2.m mVar = (p2.m) this.c;
                p2.g gVar3 = p2.z.i;
                bVar3.y(24, 9, gVar3);
                com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.b;
                mVar.b(gVar3, com.google.android.gms.internal.play_billing.v.e);
                return;
            case 8:
                s5.w wVar = (s5.w) this.b;
                s5.d dVar2 = (s5.d) this.c;
                s5.b bVar4 = s5.w.j0;
                o5.d dVar3 = dVar2.d;
                o5.x xVar = dVar2.f;
                o5.d dVar4 = wVar.Q;
                d0 d0Var = wVar.S;
                if (!s5.a.d(dVar3, dVar4)) {
                    wVar.Q = dVar3;
                    d0Var.c();
                }
                double d = dVar2.a;
                if (Double.isNaN(d) || Math.abs(d - wVar.b0) <= 1.0E-7d) {
                    z10 = false;
                } else {
                    wVar.b0 = d;
                    z10 = true;
                }
                boolean z15 = dVar2.b;
                if (z15 != wVar.Y) {
                    wVar.Y = z15;
                    z10 = true;
                }
                Double.isNaN(dVar2.h);
                s5.b bVar5 = s5.w.j0;
                bVar5.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(wVar.a0));
                if (d0Var != null && (z10 || wVar.a0)) {
                    d0Var.f();
                }
                int i11 = dVar2.c;
                if (i11 != wVar.d0) {
                    wVar.d0 = i11;
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar5.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(wVar.a0));
                if (d0Var != null && (z11 || wVar.a0)) {
                    d0Var.a();
                }
                int i12 = dVar2.e;
                if (i12 != wVar.e0) {
                    wVar.e0 = i12;
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar5.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(wVar.a0));
                if (d0Var != null && (z12 || wVar.a0)) {
                    d0Var.e();
                }
                if (!s5.a.d(wVar.c0, xVar)) {
                    wVar.c0 = xVar;
                }
                wVar.a0 = false;
                return;
            case 9:
                s5.w wVar2 = (s5.w) this.b;
                s5.c cVar = (s5.c) this.c;
                s5.b bVar6 = s5.w.j0;
                String str = cVar.a;
                if (s5.a.d(str, wVar2.X)) {
                    z13 = false;
                } else {
                    wVar2.X = str;
                    z13 = true;
                }
                s5.w.j0.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(wVar2.Z));
                d0 d0Var2 = wVar2.S;
                if (d0Var2 != null && (z13 || wVar2.Z)) {
                    d0Var2.d();
                }
                wVar2.Z = false;
                return;
            case 10:
                uh.m mVar2 = (uh.m) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    mVar2.B((f2.j) obj);
                }
                arrayList.clear();
                mVar2.v.remove(arrayList);
                return;
            case 11:
                v5.j jVar2 = (v5.j) this.b;
                IBinder iBinder = (IBinder) this.c;
                synchronized (jVar2) {
                    if (iBinder == null) {
                        jVar2.a("Null service connection");
                    } else {
                        try {
                            jVar2.c = new oc.i(iBinder);
                            jVar2.a = 2;
                            ((ScheduledExecutorService) jVar2.f.c).execute(new v5.h(jVar2, i10));
                        } catch (RemoteException e10) {
                            jVar2.a(e10.getMessage());
                        }
                    }
                }
                return;
            case 12:
                a();
                return;
            default:
                x1.a aVar = (x1.a) this.c;
                Object obj2 = this.b;
                if (aVar.c.get()) {
                    m5.d dVar5 = aVar.e;
                    if (dVar5.h == aVar) {
                        SystemClock.uptimeMillis();
                        dVar5.h = null;
                        dVar5.b();
                    }
                } else {
                    m5.d dVar6 = aVar.e;
                    if (dVar6.g != aVar) {
                        if (dVar6.h == aVar) {
                            SystemClock.uptimeMillis();
                            dVar6.h = null;
                            dVar6.b();
                        }
                    } else if (!dVar6.c) {
                        SystemClock.uptimeMillis();
                        dVar6.g = null;
                        w1.a aVar2 = dVar6.a;
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
        }
    }

    public /* synthetic */ i(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }
}
