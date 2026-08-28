package a1;

import a5.m;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import bg.h2;
import bg.l1;
import bg.q2;
import bg.x0;
import c2.a1;
import c2.z0;
import ch.j;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.e0;
import com.google.firebase.messaging.t;
import com.google.firebase.messaging.z;
import d3.h;
import e5.s;
import ff.p;
import fh.c0;
import fh.o1;
import fh.p2;
import gh.t0;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.x4;
import org.telegram.ui.LaunchActivity;
import r0.m1;
import r0.o;
import w2.i;
import zf.k;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements OnSuccessListener, x9.a, b2, nk0, e3.b, ch.a, Continuation, OnCompleteListener, p, o, BillingController.ProductDetailsResponseListenerLegacy, x4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(a1 a1Var, z0 z0Var) {
        this.a = 8;
        this.b = a1Var;
    }

    @Override // org.telegram.ui.Components.x4
    public void B(int i9, int i10, boolean z10) {
        t0 t0Var = (t0) this.b;
        if (z10) {
            long j10 = i9;
            if (t0Var.E != j10) {
                t0Var.E = j10;
                t0Var.r.setText(t0.o(j10));
            }
            t0Var.n(true);
        }
    }

    @Override // r0.o
    public m1 L0(View view, m1 m1Var) {
        ((fh.z0) this.b).h.i(m1Var);
        return m1.b;
    }

    public void a(Display display) {
        s sVar = (s) this.b;
        sVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            sVar.k = refreshRate;
            sVar.l = (refreshRate * 80) / 100;
        } else {
            d5.a.K("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            sVar.k = -9223372036854775807L;
            sVar.l = -9223372036854775807L;
        }
    }

    @Override // org.telegram.ui.Components.nk0
    public void c(float f10, float f11, int i9, View view) {
        q2.P((q2) this.b, view);
    }

    @Override // x9.a
    public void e(x9.b bVar) {
        b9.b bVar2 = (b9.b) this.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        bVar2.b.set((b9.b) bVar.get());
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(c2 c2Var, int i9) {
        switch (this.a) {
            case 2:
                ((h2) this.b).run();
                break;
            case 3:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.b;
                o2 R = LaunchActivity.R();
                if (R != null) {
                    l1.S(R, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    break;
                }
                break;
            case 4:
                ((x0) this.b).run();
                break;
            case 5:
                ((h2) this.b).run();
                break;
            default:
                ((c0) this.b).run();
                break;
        }
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // ff.p
    public void h(long j10) {
        ((fh.e) this.b).a(j10, true);
    }

    @Override // e3.b
    public Object j() {
        SQLiteDatabase a2;
        int i9 = this.a;
        boolean z10 = false;
        Object obj = this.b;
        switch (i9) {
            case 9:
                h hVar = (h) ((d3.c) obj);
                hVar.getClass();
                int i10 = z2.a.e;
                t tVar = new t(24, z10);
                tVar.c = null;
                tVar.d = new ArrayList();
                tVar.e = null;
                tVar.b = "";
                HashMap hashMap = new HashMap();
                a2 = hVar.a();
                a2.beginTransaction();
                try {
                    z2.a aVar = (z2.a) h.h(a2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new androidx.car.app.utils.a(hVar, hashMap, tVar, 6));
                    a2.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 10:
                h hVar2 = (h) ((d3.d) obj);
                long d = hVar2.b.d() - hVar2.d.d;
                a2 = hVar2.a();
                a2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(d)};
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
            case 11:
                h hVar3 = (h) ((d3.c) ((c3.h) obj).i);
                a2 = hVar3.a();
                a2.beginTransaction();
                try {
                    a2.compileStatement("DELETE FROM log_event_dropped").execute();
                    a2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar3.b.d()).execute();
                    a2.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                t tVar2 = (t) obj;
                Iterator it = ((Iterable) ((h) ((d3.d) tVar2.c)).c(new a9.b(19))).iterator();
                while (it.hasNext()) {
                    ((m) tVar2.d).A((i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // ch.a
    public void l(Canvas canvas, int i9) {
        j jVar = (j) this.b;
        jVar.getClass();
        canvas.save();
        RectF rectF = jVar.r;
        canvas.translate(-rectF.left, (-rectF.top) + AndroidUtilities.dp(30.0f));
        jVar.e(canvas, true, i9);
        canvas.restore();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 16:
                com.google.firebase.messaging.c0.b((Intent) this.b);
                break;
            case 17:
                ((e0) this.b).b.trySetResult(null);
                break;
            default:
                ((ScheduledFuture) this.b).cancel(false);
                break;
        }
    }

    @Override // org.telegram.messenger.BillingController.ProductDetailsResponseListenerLegacy
    public void onProductDetailsResponse(n2.g gVar, List list) {
        int i9;
        p2 p2Var = (p2) this.b;
        ArrayList arrayList = p2Var.j0;
        Iterator it = list.iterator();
        long j10 = 0;
        while (true) {
            i9 = 0;
            if (!it.hasNext()) {
                break;
            }
            l lVar = (l) it.next();
            int size = arrayList.size();
            while (true) {
                if (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    k kVar = (k) obj;
                    if (kVar.h() != null && kVar.h().equals(lVar.c)) {
                        kVar.h = lVar;
                        if (kVar.f() > j10) {
                            j10 = kVar.f();
                        }
                    }
                }
            }
        }
        int size2 = arrayList.size();
        while (i9 < size2) {
            Object obj2 = arrayList.get(i9);
            i9++;
            ((k) obj2).g = j10;
        }
        AndroidUtilities.runOnUIThread(new o1(p2Var, 0));
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        boolean z10;
        switch (this.a) {
            case 0:
                ((f) this.b).invoke(obj);
                return;
            case 7:
                ((b1.f) this.b).invoke(obj);
                return;
            case 14:
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
            case 19:
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
            case 15:
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

    public /* synthetic */ c(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.nk0
    public /* synthetic */ void g0(View view, float f10, float f11) {
    }
}
