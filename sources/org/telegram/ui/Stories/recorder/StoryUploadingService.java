package org.telegram.ui.Stories.recorder;

import android.R;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import e0.k0;
import e0.r;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.ot;
import org.telegram.messenger.us;
import org.telegram.messenger.v2;
import org.telegram.messenger.w0;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class StoryUploadingService extends Service implements us {
    public r a;
    public String b;
    public float c;
    public int d = -1;

    public StoryUploadingService() {
        zs.e().b(this, zs.B5);
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (i10 != zs.A5) {
            if (i10 == zs.B5 && (str = this.b) != null && str.equals((String) objArr[0])) {
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
        r rVar = this.a;
        int round = Math.round(floatValue * 100.0f);
        boolean z10 = this.c <= 0.0f;
        rVar.n = 100;
        rVar.o = round;
        rVar.p = z10;
        try {
            new k0(w0.b).e(null, 33, this.a.b());
        } catch (Throwable th2) {
            f8.g(th2, true);
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
        new k0(w0.b).b(33, null);
        zs.e().n(this, zs.B5);
        zs.f(this.d).n(this, zs.A5);
        if (v2.a) {
            f8.b("upload story destroy");
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        int i12 = zs.A5;
        this.b = intent.getStringExtra("path");
        int i13 = this.d;
        int intExtra = intent.getIntExtra("currentAccount", d20.s0);
        this.d = intExtra;
        if (!d20.r(intExtra)) {
            stopSelf();
            return 2;
        }
        if (i13 != this.d) {
            if (i13 != -1) {
                zs.f(i13).n(this, i12);
            }
            int i14 = this.d;
            if (i14 != -1) {
                zs.f(i14).b(this, i12);
            }
        }
        if (this.b == null) {
            stopSelf();
            return 2;
        }
        if (v2.a) {
            f8.b("start upload story");
        }
        if (this.a == null) {
            ot.i();
            r rVar = new r(w0.b, null);
            this.a = rVar;
            rVar.F.icon = R.drawable.stat_sys_upload;
            rVar.F.when = System.currentTimeMillis();
            r rVar2 = this.a;
            rVar2.y = ot.j0;
            rVar2.g(cd.L0(org.telegram.messenger.beta.R.string.AppName, null));
            this.a.p(cd.L0(2131744477, null));
            this.a.f(cd.L0(2131744477, null));
        }
        this.c = 0.0f;
        r rVar3 = this.a;
        int round = Math.round(0.0f);
        rVar3.n = 100;
        rVar3.o = round;
        rVar3.p = false;
        try {
            startForeground(33, this.a.b());
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
        try {
            new k0(w0.b).e(null, 33, this.a.b());
        } catch (Throwable th3) {
            f8.g(th3, true);
        }
        return 2;
    }

    public final void onTimeout(int i10, int i11) {
        f8.b("StoryUploadingService timeout, type = " + i11);
        try {
            stopForeground(true);
        } catch (Throwable unused) {
        }
        stopSelf();
    }
}
