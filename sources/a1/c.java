package a1;

import a5.n;
import a9.m;
import ag.l0;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import c2.y0;
import c2.z0;
import cg.g1;
import cg.i2;
import cg.t0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.c0;
import com.google.firebase.messaging.e0;
import com.google.firebase.messaging.t;
import com.google.firebase.messaging.z;
import d3.h;
import d5.k;
import dh.j;
import e5.r;
import gf.p;
import gh.a0;
import gh.k2;
import gh.x0;
import h3.h1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
import n2.l;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.LaunchActivity;
import r0.m1;
import r0.o;
import w2.i;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements OnSuccessListener, e3.b, y9.a, a2, qk0, Continuation, OnCompleteListener, dh.a, p, o, BillingController.ProductDetailsResponseListenerLegacy, k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(z0 z0Var, y0 y0Var) {
        this.a = 2;
        this.b = z0Var;
    }

    @Override // r0.o
    public m1 I0(View view, m1 m1Var) {
        ((x0) this.b).h.i(m1Var);
        return m1.b;
    }

    public void a(Display display) {
        r rVar = (r) this.b;
        rVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            rVar.k = refreshRate;
            rVar.l = (refreshRate * 80) / 100;
        } else {
            d5.a.K("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            rVar.k = -9223372036854775807L;
            rVar.l = -9223372036854775807L;
        }
    }

    @Override // y9.a
    public void b(y9.b bVar) {
        c9.a aVar = (c9.a) this.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.b.set((c9.a) bVar.get());
    }

    @Override // org.telegram.ui.Components.qk0
    public void c(float f10, float f11, int i10, View view) {
        i2.Q((i2) this.b, view);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
        switch (this.a) {
            case 8:
                ((cg.a2) this.b).run();
                break;
            case 9:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.b;
                n2 R = LaunchActivity.R();
                if (R != null) {
                    g1.T(R, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    break;
                }
                break;
            case 10:
                ((t0) this.b).run();
                break;
            case 11:
                ((cg.a2) this.b).run();
                break;
            default:
                ((a0) this.b).run();
                break;
        }
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // gf.p
    public void g(long j10) {
        ((gh.e) this.b).a(j10, true);
    }

    @Override // e3.b
    public Object i() {
        SQLiteDatabase a2;
        int i10 = this.a;
        int i11 = 25;
        boolean z10 = false;
        Object obj = this.b;
        switch (i10) {
            case 3:
                h hVar = (h) ((d3.c) obj);
                hVar.getClass();
                int i12 = z2.a.e;
                t tVar = new t(i11, z10);
                tVar.c = null;
                tVar.d = new ArrayList();
                tVar.e = null;
                tVar.b = "";
                HashMap hashMap = new HashMap();
                a2 = hVar.a();
                a2.beginTransaction();
                try {
                    z2.a aVar = (z2.a) h.h(a2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new l0(hVar, hashMap, tVar, 7));
                    a2.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 4:
                h hVar2 = (h) ((d3.d) obj);
                long E = hVar2.b.E() - hVar2.d.d;
                a2 = hVar2.a();
                a2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(E)};
                    Cursor rawQuery = a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            hVar2.e(rawQuery.getInt(0), z2.c.c, rawQuery.getString(1));
                        } catch (Throwable th) {
                            rawQuery.close();
                            throw th;
                        }
                    }
                    rawQuery.close();
                    int delete = a2.delete("events", "timestamp_ms < ?", strArr);
                    a2.setTransactionSuccessful();
                    a2.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case 5:
                h hVar3 = (h) ((d3.c) ((c3.g) obj).i);
                a2 = hVar3.a();
                a2.beginTransaction();
                try {
                    a2.compileStatement("DELETE FROM log_event_dropped").execute();
                    a2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar3.b.E()).execute();
                    a2.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                t tVar2 = (t) obj;
                Iterator it = ((Iterable) ((h) ((d3.d) tVar2.c)).c(new m(i11))).iterator();
                while (it.hasNext()) {
                    ((n) tVar2.d).y((i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // d5.k
    public void invoke(Object obj) {
        ((h3.a2) obj).onMediaMetadataChanged((h1) this.b);
    }

    @Override // dh.a
    public void l(Canvas canvas, int i10) {
        j jVar = (j) this.b;
        jVar.getClass();
        canvas.save();
        RectF rectF = jVar.r;
        canvas.translate(-rectF.left, (-rectF.top) + AndroidUtilities.dp(30.0f));
        jVar.e(canvas, true, i10);
        canvas.restore();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 15:
                c0.b((Intent) this.b);
                break;
            case 16:
                ((e0) this.b).b.trySetResult(null);
                break;
            default:
                ((ScheduledFuture) this.b).cancel(false);
                break;
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(n2.g gVar, List list) {
        int i10;
        k2 k2Var = (k2) this.b;
        ArrayList arrayList = k2Var.j0;
        Iterator it = list.iterator();
        long j10 = 0;
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            l lVar = (l) it.next();
            int size = arrayList.size();
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ag.p pVar = (ag.p) obj;
                    if (pVar.h() != null && pVar.h().equals(lVar.c)) {
                        pVar.h = lVar;
                        if (pVar.f() > j10) {
                            j10 = pVar.f();
                        }
                    }
                }
            }
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((ag.p) obj2).g = j10;
        }
        AndroidUtilities.runOnUIThread(new f2.r(k2Var, 7));
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        boolean z10;
        switch (this.a) {
            case 0:
                ((f) this.b).invoke(obj);
                return;
            case 1:
                ((b1.f) this.b).invoke(obj);
                return;
            case 13:
                z zVar = (z) obj;
                if (!((FirebaseMessaging) this.b).e.l() || zVar.h.a() == null) {
                    return;
                }
                synchronized (zVar) {
                    z10 = zVar.g;
                }
                if (z10) {
                    return;
                }
                zVar.h(0L);
                return;
            case 18:
                ((b1.f) this.b).invoke(obj);
                return;
            case 20:
                ((e1.b) this.b).invoke(obj);
                return;
            default:
                ((e1.b) this.b).invoke(obj);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.a) {
            case 14:
                ((com.google.firebase.messaging.m) this.b).getClass();
                Bundle bundle = (Bundle) task.getResult(IOException.class);
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            default:
                ((CountDownLatch) this.b).countDown();
                return null;
        }
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ void c0(View view, float f10, float f11) {
    }
}
