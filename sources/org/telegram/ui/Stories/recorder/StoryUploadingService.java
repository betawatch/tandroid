package org.telegram.ui.Stories.recorder;

import android.R;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import e0.j0;
import e0.q;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.messenger.us;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class StoryUploadingService extends Service implements cs {
    public q a;
    public String b;
    public float c;
    public int d = -1;

    public StoryUploadingService() {
        hs.e().b(this, hs.B5);
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        String str;
        if (i3 != hs.A5) {
            if (i3 == hs.B5 && (str = this.b) != null && str.equals((String) objArr[0])) {
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
            new j0(t0.b).e(null, 33, this.a.b());
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
        new j0(t0.b).b(33, null);
        hs.e().n(this, hs.B5);
        hs.f(this.d).n(this, hs.A5);
        if (r2.a) {
            a8.b("upload story destroy");
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i3, int i10) {
        int i11 = hs.A5;
        this.b = intent.getStringExtra("path");
        int i12 = this.d;
        int intExtra = intent.getIntExtra("currentAccount", h10.t0);
        this.d = intExtra;
        if (!h10.r(intExtra)) {
            stopSelf();
            return 2;
        }
        if (i12 != this.d) {
            if (i12 != -1) {
                hs.f(i12).n(this, i11);
            }
            int i13 = this.d;
            if (i13 != -1) {
                hs.f(i13).b(this, i11);
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
            us.i();
            q qVar = new q(t0.b, null);
            this.a = qVar;
            qVar.F.icon = R.drawable.stat_sys_upload;
            qVar.F.when = System.currentTimeMillis();
            q qVar2 = this.a;
            qVar2.y = us.k0;
            qVar2.g(bd.M0(org.telegram.messenger.beta.R.string.AppName, null));
            this.a.p(bd.M0(2131744461, null));
            this.a.f(bd.M0(2131744461, null));
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
            new j0(t0.b).e(null, 33, this.a.b());
        } catch (Throwable th3) {
            a8.g(th3, true);
        }
        return 2;
    }

    public final void onTimeout(int i3, int i10) {
        a8.b("StoryUploadingService timeout, type = " + i10);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
