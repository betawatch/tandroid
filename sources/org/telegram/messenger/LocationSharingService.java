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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class LocationSharingService extends Service implements us {
    public static final /* synthetic */ int d = 0;
    public e0.r a;
    public Handler b;
    public od c;

    public LocationSharingService() {
        zs.e().b(this, zs.D4);
    }

    public static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 4; i10++) {
            ArrayList arrayList2 = nd.f(i10).I;
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
        for (int i10 = 0; i10 < 4; i10++) {
            ArrayList arrayList = nd.f(i10).I;
            int i11 = 0;
            while (i11 < arrayList.size()) {
                int i12 = ((md) arrayList.get(i11)).c;
                if (i12 == Integer.MAX_VALUE) {
                    z12 = true;
                } else {
                    j10 = Math.max(j10, (i12 - ConnectionsManager.getInstance(r4.e).getCurrentTime()) * 1000);
                }
                i11++;
                z11 = true;
            }
        }
        if (z11) {
            if (z12 || j10 > 0) {
                try {
                    Context context = w0.b;
                    Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                    intent.setAction("org.tmessages.openlocations");
                    intent.addCategory("android.intent.category.LAUNCHER");
                    PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 167772160);
                    Intent intent2 = new Intent(context, (Class<?>) StopLiveLocationReceiver.class);
                    String L0 = cd.L0(2131748849, null);
                    ot.i();
                    e0.r rVar = new e0.r(context, ot.j0);
                    rVar.F.icon = R.drawable.live_loc;
                    rVar.g(cd.L0(2131748848, null));
                    rVar.f(L0);
                    e0.m mVar = new e0.m(z10);
                    mVar.f = e0.r.d(L0);
                    rVar.n(mVar);
                    rVar.g = activity;
                    rVar.h(16, true);
                    rVar.a(0, cd.L0(2131744856, null), PendingIntent.getBroadcast(context, 2, intent2, 167772160));
                    if (!z12) {
                        rVar.B = j10;
                    }
                    new e0.k0(context).e("live_location_paused", 6, rVar.b());
                } catch (Throwable th2) {
                    f8.g(th2, true);
                }
            }
        }
    }

    public final void c(boolean z10) {
        String G;
        String L0;
        if (this.a == null) {
            return;
        }
        ArrayList a2 = a();
        if (a2.size() == 1) {
            md mdVar = (md) a2.get(0);
            long B0 = jj.B0(mdVar.h.k);
            int i10 = mdVar.h.I1;
            if (o5.E(B0)) {
                G = h20.j(vp.r1(i10).Z1(Long.valueOf(B0)), true);
                L0 = cd.L0(2131753965, null);
            } else {
                TLRPC.Chat L02 = vp.r1(i10).L0(Long.valueOf(-B0));
                G = L02 != null ? L02.title : "";
                L0 = cd.L0(2131753964, null);
            }
        } else {
            G = cd.G(a2.size(), "Chats", new Object[0]);
            L0 = cd.L0(2131753963, null);
        }
        String format = String.format(L0, cd.L0(2131753966, null), G);
        this.a.p(format);
        this.a.f(format);
        if (z10) {
            new e0.k0(w0.b).e(null, 6, this.a.b());
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Handler handler;
        if (i10 != zs.D4 || (handler = this.b) == null) {
            return;
        }
        handler.post(new od(this, 1));
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
        od odVar = new od(this, 0);
        this.c = odVar;
        handler.postDelayed(odVar, 1000L);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        Handler handler = this.b;
        if (handler != null) {
            handler.removeCallbacks(this.c);
        }
        stopForeground(true);
        new e0.k0(w0.b).b(6, null);
        zs.e().n(this, zs.D4);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        if (a().isEmpty()) {
            stopSelf();
            return 2;
        }
        try {
            if (this.a == null) {
                Intent intent2 = new Intent(w0.b, (Class<?>) LaunchActivity.class);
                intent2.setAction("org.tmessages.openlocations");
                intent2.addCategory("android.intent.category.LAUNCHER");
                PendingIntent activity = PendingIntent.getActivity(w0.b, 0, intent2, 167772160);
                e0.r rVar = new e0.r(w0.b, null);
                this.a = rVar;
                rVar.F.when = System.currentTimeMillis();
                e0.r rVar2 = this.a;
                rVar2.F.icon = R.drawable.live_loc;
                rVar2.g = activity;
                ot.i();
                e0.r rVar3 = this.a;
                rVar3.y = ot.j0;
                rVar3.g(cd.L0(R.string.AppName, null));
                this.a.a(0, cd.L0(2131744856, null), PendingIntent.getBroadcast(w0.b, 2, new Intent(w0.b, (Class<?>) StopLiveLocationReceiver.class), 167772160));
            }
            c(false);
            Notification b10 = this.a.b();
            if (Build.VERSION.SDK_INT < 29) {
                startForeground(6, b10);
            } else {
                try {
                    startForeground(6, b10, 8);
                } catch (Throwable th2) {
                    f8.g(th2, true);
                    b();
                    stopSelf();
                    return 2;
                }
            }
            new e0.k0(w0.b).b(6, "live_location_paused");
            return 2;
        } catch (Throwable th3) {
            f8.g(th3, true);
            return 2;
        }
    }
}
