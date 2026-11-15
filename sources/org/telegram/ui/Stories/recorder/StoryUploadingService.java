package org.telegram.ui.Stories.recorder;

import android.R;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import e0.i0;
import e0.q;
import org.telegram.messenger.a8;
import org.telegram.messenger.at;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class StoryUploadingService extends Service implements is {
    public q a;
    public String b;
    public float c;
    public int d = -1;

    public StoryUploadingService() {
        ns.e().b(this, ns.B5);
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        if (i7 != ns.A5) {
            if (i7 == ns.B5 && (str = this.b) != null && str.equals((String) objArr[0])) {
                stopSelf();
                return;
            }
            return;
        }
        String str2 = this.b;
        if (str2 == null || !str2.equals((String) objArr[0])) {
            return;
        }
        float floatValue = ((Float) objArr[1]).floatValue();
        this.c = floatValue;
        q qVar = this.a;
        int round = Math.round(floatValue * 100.0f);
        boolean z10 = this.c <= 0.0f;
        qVar.n = 100;
        qVar.o = round;
        qVar.p = z10;
        try {
            new i0(t0.b).e(null, 33, this.a.b());
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        try {
            stopForeground(true);
        } catch (Exception unused) {
        }
        new i0(t0.b).b(33, null);
        ns.e().n(this, ns.B5);
        ns.f(this.d).n(this, ns.A5);
        if (r2.a) {
            a8.b("upload story destroy");
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i10) {
        int i11 = ns.A5;
        this.b = intent.getStringExtra("path");
        int i12 = this.d;
        int intExtra = intent.getIntExtra("currentAccount", m10.t0);
        this.d = intExtra;
        if (!m10.r(intExtra)) {
            stopSelf();
            return 2;
        }
        if (i12 != this.d) {
            if (i12 != -1) {
                ns.f(i12).n(this, i11);
            }
            int i13 = this.d;
            if (i13 != -1) {
                ns.f(i13).b(this, i11);
            }
        }
        if (this.b == null) {
            stopSelf();
            return 2;
        }
        if (r2.a) {
            a8.b("start upload story");
        }
        if (this.a == null) {
            at.i();
            q qVar = new q(t0.b, null);
            this.a = qVar;
            qVar.F.icon = R.drawable.stat_sys_upload;
            qVar.F.when = System.currentTimeMillis();
            q qVar2 = this.a;
            qVar2.y = at.k0;
            qVar2.g(hd.M0(org.telegram.messenger.beta.R.string.AppName, null));
            this.a.p(hd.M0(2131744451, null));
            this.a.f(hd.M0(2131744451, null));
        }
        this.c = 0.0f;
        q qVar3 = this.a;
        int round = Math.round(0.0f);
        qVar3.n = 100;
        qVar3.o = round;
        qVar3.p = false;
        try {
            startForeground(33, this.a.b());
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        try {
            new i0(t0.b).e(null, 33, this.a.b());
        } catch (Throwable th3) {
            a8.g(th3, true);
        }
        return 2;
    }

    public final void onTimeout(int i7, int i10) {
        a8.b("StoryUploadingService timeout, type = " + i10);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
