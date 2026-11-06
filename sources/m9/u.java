package m9;

import android.app.Application;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import b9.k0;
import c8.s9;
import com.google.android.gms.common.data.DataHolder;
import h2.j0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.messenger.WearAuthListenerService;
import org.telegram.messenger.a8;
import org.telegram.messenger.hi;
import org.telegram.messenger.p1;
import org.telegram.messenger.q1;
import org.telegram.messenger.r1;
import org.telegram.messenger.uz;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.uo;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.iq;
import org.telegram.ui.kq;
import org.telegram.ui.ll;
import org.telegram.ui.oq;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class u implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public /* synthetic */ u(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        m6.m mVar = (m6.m) this.c;
        m6.l lVar = (m6.l) this.b;
        int i7 = mVar.a;
        synchronized (lVar) {
            SparseArray sparseArray = lVar.e;
            m6.m mVar2 = (m6.m) sparseArray.get(i7);
            if (mVar2 != null) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 20);
                sb2.append("Timing out request: ");
                sb2.append(i7);
                Log.w("MessengerIpcClient", sb2.toString());
                sparseArray.remove(i7);
                mVar2.c(new ab.a0("Timed out waiting for response", null));
                lVar.d();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Throwable th2 = null;
        int i7 = 2;
        int i10 = 0;
        int i11 = 1;
        switch (this.a) {
            case 0:
                t tVar = (t) this.c;
                y yVar = (y) this.b;
                if (yVar instanceof n9.a) {
                    o oVar = (o) ((n9.a) yVar);
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
                    tVar.onSuccess(s9.a(yVar));
                    return;
                } catch (ExecutionException e10) {
                    tVar.h(e10.getCause());
                    return;
                } catch (Throwable th3) {
                    tVar.h(th3);
                    return;
                }
            case 1:
                a2.a aVar = (a2.a) this.c;
                Object obj2 = this.b;
                if (aVar.c.get()) {
                    d6.d dVar = aVar.e;
                    if (dVar.h == aVar) {
                        SystemClock.uptimeMillis();
                        dVar.h = null;
                        dVar.b();
                    }
                } else {
                    d6.d dVar2 = aVar.e;
                    if (dVar2.g != aVar) {
                        if (dVar2.h == aVar) {
                            SystemClock.uptimeMillis();
                            dVar2.h = null;
                            dVar2.b();
                        }
                    } else if (!dVar2.c) {
                        SystemClock.uptimeMillis();
                        dVar2.g = null;
                        z1.a aVar2 = dVar2.a;
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
            case 2:
                DataHolder dataHolder = (DataHolder) this.b;
                int i12 = dataHolder.e;
                try {
                    ((a9.d) this.c).c.getClass();
                    if (dataHolder != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (dataHolder != null) {
                        dataHolder.close();
                    }
                }
            case 3:
                WearAuthListenerService wearAuthListenerService = ((a9.d) this.c).c;
                k0 k0Var = (k0) this.b;
                String str = k0Var.b;
                String str2 = k0Var.d;
                byte[] bArr = k0Var.c;
                if ("/tg-wear-auth/offer".equals(str)) {
                    try {
                        Intent intent = new Intent(wearAuthListenerService, (Class<?>) LaunchActivity.class);
                        intent.addFlags(268566528);
                        wearAuthListenerService.startActivity(intent);
                    } catch (Exception e11) {
                        a8.e("wear-auth: failed to pop LaunchActivity", e11);
                    }
                }
                org.telegram.messenger.g0.h3(new uz(bArr, str, str2));
                return;
            case 4:
                ((a9.d) this.c).c.getClass();
                return;
            case 5:
                b9.e eVar = (b9.e) this.b;
                a9.d dVar3 = (a9.d) this.c;
                eVar.b(dVar3.c);
                eVar.b(dVar3.c.n);
                return;
            case 6:
                ((zd.m) this.b).D((ae.e) this.c);
                return;
            case 7:
                androidx.biometric.z zVar = ((androidx.biometric.q) this.c).l0;
                if (zVar.e == null) {
                    zVar.e = new androidx.biometric.w();
                }
                zVar.e.c((androidx.biometric.u) this.b);
                return;
            case 8:
                ((com.google.android.gms.internal.cast.p) this.b).O0((s4.r) this.c);
                return;
            case 9:
                ((e0.c) this.b).a = this.c;
                return;
            case 10:
                ((Application) this.b).unregisterActivityLifecycleCallbacks((e0.c) this.c);
                return;
            case 11:
                Object obj3 = this.c;
                Object obj4 = this.b;
                try {
                    Method method = e0.d.d;
                    if (method != null) {
                        method.invoke(obj4, obj3, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        e0.d.e.invoke(obj4, obj3, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e12) {
                    if (e12.getClass() == RuntimeException.class && e12.getMessage() != null && e12.getMessage().startsWith("Unable to stop")) {
                        throw e12;
                    }
                    return;
                } catch (Throwable th4) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th4);
                    return;
                }
            case 12:
                ee.g gVar = (ee.g) this.c;
                zd.x xVar = gVar.d;
                while (true) {
                    try {
                        ((Runnable) this.b).run();
                    } catch (Throwable th5) {
                        zd.b0.m(id.i.a, th5);
                    }
                    Runnable g10 = gVar.g();
                    if (g10 == null) {
                        return;
                    }
                    this.b = g10;
                    i10++;
                    if (i10 >= 16 && xVar.d(gVar)) {
                        xVar.c(gVar, this);
                        return;
                    }
                }
                break;
            case 13:
                f5.b bVar = (f5.b) this.b;
                f5.f fVar = (f5.f) this.c;
                if (((f5.n) bVar.f.c) != null) {
                    ((r1) ((f5.n) bVar.f.c)).n(fVar, null, null);
                    return;
                } else {
                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 14:
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
            case 15:
                f5.b bVar2 = (f5.b) this.b;
                f5.g gVar2 = (f5.g) this.c;
                f5.f fVar2 = f5.z.i;
                bVar2.y(24, 4, fVar2);
                gVar2.a(fVar2);
                return;
            case 16:
                f5.b bVar3 = (f5.b) this.b;
                p1 p1Var = (p1) this.c;
                f5.f fVar3 = f5.z.i;
                bVar3.y(24, 7, fVar3);
                com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.b;
                ((q1) p1Var.b).a(fVar3, com.google.android.gms.internal.play_billing.v.e);
                return;
            case 17:
                f5.b bVar4 = (f5.b) this.b;
                f5.m mVar = (f5.m) this.c;
                f5.f fVar4 = f5.z.i;
                bVar4.y(24, 9, fVar4);
                com.google.android.gms.internal.play_billing.p pVar2 = com.google.android.gms.internal.play_billing.r.b;
                mVar.b(fVar4, com.google.android.gms.internal.play_billing.v.e);
                return;
            case 18:
                f6.e0 e0Var = ((f6.d0) this.b).b;
                j6.d dVar4 = (j6.d) this.c;
                j6.b bVar5 = f6.e0.H;
                f6.d dVar5 = dVar4.d;
                f6.x xVar2 = dVar4.f;
                f6.d dVar6 = e0Var.u;
                g6.e0 e0Var2 = e0Var.E;
                if (!j6.a.d(dVar5, dVar6)) {
                    e0Var.u = dVar5;
                    e0Var2.c();
                }
                double d = dVar4.a;
                if (Double.isNaN(d) || Math.abs(d - e0Var.w) <= 1.0E-7d) {
                    z9 = false;
                } else {
                    e0Var.w = d;
                    z9 = true;
                }
                boolean z17 = dVar4.b;
                if (z17 != e0Var.x) {
                    e0Var.x = z17;
                    z9 = true;
                }
                j6.b bVar6 = f6.e0.H;
                bVar6.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z9), Boolean.valueOf(e0Var.n));
                if (e0Var2 != null && (z9 || e0Var.n)) {
                    e0Var2.f();
                }
                Double.isNaN(dVar4.h);
                int i13 = dVar4.c;
                if (i13 != e0Var.y) {
                    e0Var.y = i13;
                    z10 = true;
                } else {
                    z10 = false;
                }
                bVar6.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(e0Var.n));
                if (e0Var2 != null && (z10 || e0Var.n)) {
                    e0Var2.a();
                }
                int i14 = dVar4.e;
                if (i14 != e0Var.z) {
                    e0Var.z = i14;
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar6.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(e0Var.n));
                if (e0Var2 != null && (z11 || e0Var.n)) {
                    e0Var2.e();
                }
                if (!j6.a.d(e0Var.A, xVar2)) {
                    e0Var.A = xVar2;
                }
                e0Var.n = false;
                return;
            case 19:
                f6.e0 e0Var3 = ((f6.d0) this.b).b;
                j6.c cVar = (j6.c) this.c;
                j6.b bVar7 = f6.e0.H;
                String str3 = cVar.a;
                if (j6.a.d(str3, e0Var3.v)) {
                    z12 = false;
                } else {
                    e0Var3.v = str3;
                    z12 = true;
                }
                f6.e0.H.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(e0Var3.o));
                g6.e0 e0Var4 = e0Var3.E;
                if (e0Var4 != null && (z12 || e0Var3.o)) {
                    e0Var4.d();
                }
                e0Var3.o = false;
                return;
            case 20:
                j6.v vVar = (j6.v) this.b;
                j6.d dVar7 = (j6.d) this.c;
                j6.b bVar8 = j6.v.Y;
                f6.d dVar8 = dVar7.d;
                f6.x xVar3 = dVar7.f;
                f6.d dVar9 = vVar.F;
                g6.e0 e0Var5 = vVar.H;
                if (!j6.a.d(dVar8, dVar9)) {
                    vVar.F = dVar8;
                    e0Var5.c();
                }
                double d2 = dVar7.a;
                if (Double.isNaN(d2) || Math.abs(d2 - vVar.Q) <= 1.0E-7d) {
                    z13 = false;
                } else {
                    vVar.Q = d2;
                    z13 = true;
                }
                boolean z18 = dVar7.b;
                if (z18 != vVar.N) {
                    vVar.N = z18;
                    z13 = true;
                }
                Double.isNaN(dVar7.h);
                j6.b bVar9 = j6.v.Y;
                bVar9.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(vVar.P));
                if (e0Var5 != null && (z13 || vVar.P)) {
                    e0Var5.f();
                }
                int i15 = dVar7.c;
                if (i15 != vVar.S) {
                    vVar.S = i15;
                    z14 = true;
                } else {
                    z14 = false;
                }
                bVar9.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z14), Boolean.valueOf(vVar.P));
                if (e0Var5 != null && (z14 || vVar.P)) {
                    e0Var5.a();
                }
                int i16 = dVar7.e;
                if (i16 != vVar.T) {
                    vVar.T = i16;
                    z15 = true;
                } else {
                    z15 = false;
                }
                bVar9.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z15), Boolean.valueOf(vVar.P));
                if (e0Var5 != null && (z15 || vVar.P)) {
                    e0Var5.e();
                }
                if (!j6.a.d(vVar.R, xVar3)) {
                    vVar.R = xVar3;
                }
                vVar.P = false;
                return;
            case 21:
                j6.v vVar2 = (j6.v) this.b;
                j6.c cVar2 = (j6.c) this.c;
                j6.b bVar10 = j6.v.Y;
                String str4 = cVar2.a;
                if (j6.a.d(str4, vVar2.M)) {
                    z16 = false;
                } else {
                    vVar2.M = str4;
                    z16 = true;
                }
                j6.v.Y.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z16), Boolean.valueOf(vVar2.O));
                g6.e0 e0Var6 = vVar2.H;
                if (e0Var6 != null && (z16 || vVar2.O)) {
                    e0Var6.d();
                }
                vVar2.O = false;
                return;
            case 22:
                IBinder iBinder = (IBinder) this.c;
                m6.l lVar = (m6.l) this.b;
                synchronized (lVar) {
                    if (iBinder == null) {
                        lVar.b("Null service connection");
                    } else {
                        try {
                            lVar.c = new j2.n(iBinder);
                            lVar.a = 2;
                            ((ScheduledExecutorService) lVar.f.c).execute(new m6.j(lVar, i11));
                        } catch (RemoteException e13) {
                            lVar.b(e13.getMessage());
                        }
                    }
                }
                return;
            case 23:
                a();
                return;
            case 24:
                mi.l lVar2 = (mi.l) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj5 = arrayList.get(i10);
                    i10++;
                    lVar2.B((v4.i) obj5);
                }
                arrayList.clear();
                lVar2.v.remove(arrayList);
                return;
            case 25:
                gf.g gVar3 = (gf.g) this.b;
                Typeface typeface = (Typeface) this.c;
                j0 j0Var = (j0) gVar3.b;
                if (j0Var != null) {
                    j0Var.h(typeface);
                    return;
                }
                return;
            case 26:
                ((f5.t) this.b).accept(this.c);
                return;
            case 27:
                ArrayList arrayList2 = (ArrayList) this.b;
                for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                    if (arrayList2.get(i17) != null && ((uo) arrayList2.get(i17)).a != null) {
                        ((uo) arrayList2.get(i17)).a.m(0);
                    }
                }
                org.telegram.messenger.g0.h3(new hi(i7, this, arrayList2));
                return;
            case 28:
                an anVar = ((ll) this.c).b;
                if (this == anVar.Z5) {
                    anVar.yb((CharSequence) this.b, false);
                    anVar.Z5 = null;
                    return;
                }
                return;
            default:
                q8 q8Var = (q8) this.b;
                boolean z19 = q8Var.d.h;
                q8Var.setChecked(!z19);
                oq oqVar = ((kq) this.c).d;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = oqVar.D;
                tL_chatBannedRights.send_media = z19;
                tL_chatBannedRights.send_gifs = z19;
                tL_chatBannedRights.send_inline = z19;
                tL_chatBannedRights.send_games = z19;
                tL_chatBannedRights.send_photos = z19;
                tL_chatBannedRights.send_videos = z19;
                tL_chatBannedRights.send_stickers = z19;
                tL_chatBannedRights.send_audios = z19;
                tL_chatBannedRights.send_docs = z19;
                tL_chatBannedRights.send_voices = z19;
                tL_chatBannedRights.send_roundvideos = z19;
                tL_chatBannedRights.embed_links = z19;
                tL_chatBannedRights.send_polls = z19;
                tL_chatBannedRights.send_reactions = z19;
                org.telegram.messenger.g0.b4(oqVar.c);
                iq B0 = oqVar.B0();
                oqVar.G0();
                oqVar.F0(B0);
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(u.class.getSimpleName(), 28);
                t tVar = (t) this.c;
                wf.b bVar = new wf.b(19, false);
                ((wf.b) a0Var.d).c = bVar;
                a0Var.d = bVar;
                bVar.b = tVar;
                return a0Var.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ u(f5.b bVar, f5.g gVar, aa.c0 c0Var) {
        this.a = 15;
        this.b = bVar;
        this.c = gVar;
    }

    public /* synthetic */ u(Object obj, Object obj2, boolean z9, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }
}
