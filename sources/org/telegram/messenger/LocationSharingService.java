package org.telegram.messenger;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class LocationSharingService extends Service implements cs {
    public static final /* synthetic */ int d = 0;
    public e0.q a;
    public Handler b;
    public md c;

    public LocationSharingService() {
        hs.e().b(this, hs.D4);
    }

    public static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < 4; i3++) {
            ArrayList arrayList2 = ld.f(i3).J;
            if (!arrayList2.isEmpty()) {
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    public static void b() {
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        long j10 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            ArrayList arrayList = ld.f(i3).J;
            int i10 = 0;
            while (i10 < arrayList.size()) {
                int i11 = ((kd) arrayList.get(i10)).c;
                if (i11 == Integer.MAX_VALUE) {
                    z12 = true;
                } else {
                    j10 = Math.max(j10, (i11 - ConnectionsManager.getInstance(r4.e).getCurrentTime()) * 1000);
                }
                i10++;
                z11 = true;
            }
        }
        if (z11) {
            if (z12 || j10 > 0) {
                try {
                    Context context = t0.b;
                    Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                    intent.setAction("org.tmessages.openlocations");
                    intent.addCategory("android.intent.category.LAUNCHER");
                    PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 167772160);
                    Intent intent2 = new Intent(context, (Class<?>) StopLiveLocationReceiver.class);
                    String M0 = bd.M0(2131748847, null);
                    us.i();
                    e0.q qVar = new e0.q(context, us.k0);
                    qVar.F.icon = R.drawable.live_loc;
                    qVar.g(bd.M0(2131748846, null));
                    qVar.f(M0);
                    e0.l lVar = new e0.l(z10);
                    lVar.f = e0.q.d(M0);
                    qVar.n(lVar);
                    qVar.g = activity;
                    qVar.h(16, true);
                    qVar.a(0, PendingIntent.getBroadcast(context, 2, intent2, 167772160), bd.M0(2131744848, null));
                    if (!z12) {
                        qVar.B = j10;
                    }
                    new e0.j0(context).e("live_location_paused", 6, qVar.b());
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
        }
    }

    public final void c(boolean z10) {
        String G;
        String M0;
        if (this.a == null) {
            return;
        }
        ArrayList a10 = a();
        if (a10.size() == 1) {
            kd kdVar = (kd) a10.get(0);
            long B0 = zi.B0(kdVar.h.k);
            int i3 = kdVar.h.I1;
            if (m5.E(B0)) {
                G = l10.j(hp.s1(i3).a2(Long.valueOf(B0)), true);
                M0 = bd.M0(2131753965, null);
            } else {
                TLRPC.Chat M02 = hp.s1(i3).M0(Long.valueOf(-B0));
                G = M02 != null ? M02.title : "";
                M0 = bd.M0(2131753964, null);
            }
        } else {
            G = bd.G(a10.size(), "Chats", new Object[0]);
            M0 = bd.M0(2131753963, null);
        }
        String format = String.format(M0, bd.M0(2131753966, null), G);
        this.a.p(format);
        this.a.f(format);
        if (z10) {
            new e0.j0(t0.b).e(null, 6, this.a.b());
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        Handler handler;
        if (i3 != hs.D4 || (handler = this.b) == null) {
            return;
        }
        handler.post(new md(this, 1));
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Handler handler = new Handler();
        this.b = handler;
        md mdVar = new md(this, 0);
        this.c = mdVar;
        handler.postDelayed(mdVar, 1000L);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        Handler handler = this.b;
        if (handler != null) {
            handler.removeCallbacks(this.c);
        }
        stopForeground(true);
        new e0.j0(t0.b).b(6, null);
        hs.e().n(this, hs.D4);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i3, int i10) {
        if (a().isEmpty()) {
            stopSelf();
            return 2;
        }
        try {
            if (this.a == null) {
                Intent intent2 = new Intent(t0.b, (Class<?>) LaunchActivity.class);
                intent2.setAction("org.tmessages.openlocations");
                intent2.addCategory("android.intent.category.LAUNCHER");
                PendingIntent activity = PendingIntent.getActivity(t0.b, 0, intent2, 167772160);
                e0.q qVar = new e0.q(t0.b, null);
                this.a = qVar;
                qVar.F.when = System.currentTimeMillis();
                e0.q qVar2 = this.a;
                qVar2.F.icon = R.drawable.live_loc;
                qVar2.g = activity;
                us.i();
                e0.q qVar3 = this.a;
                qVar3.y = us.k0;
                qVar3.g(bd.M0(R.string.AppName, null));
                Intent intent3 = new Intent(t0.b, (Class<?>) StopLiveLocationReceiver.class);
                this.a.a(0, PendingIntent.getBroadcast(t0.b, 2, intent3, 167772160), bd.M0(2131744848, null));
            }
            c(false);
            Notification b10 = this.a.b();
            if (Build.VERSION.SDK_INT < 29) {
                startForeground(6, b10);
            } else {
                try {
                    startForeground(6, b10, 8);
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    b();
                    stopSelf();
                    return 2;
                }
            }
            new e0.j0(t0.b).b(6, "live_location_paused");
            return 2;
        } catch (Throwable th3) {
            a8.g(th3, true);
            return 2;
        }
    }
}
