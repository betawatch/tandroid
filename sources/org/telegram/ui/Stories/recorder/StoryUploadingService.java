package org.telegram.ui.Stories.recorder;

import android.R;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import e0.i0;
import e0.q;
import org.telegram.messenger.a8;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.s2;
import org.telegram.messenger.t0;
import org.telegram.messenger.xs;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public class StoryUploadingService extends Service implements fs {
    public q a;
    public String b;
    public float c;
    public int d = -1;

    public StoryUploadingService() {
        ks.e().b(this, ks.E5);
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        String str;
        if (i7 != ks.D5) {
            if (i7 == ks.E5 && (str = this.b) != null && str.equals((String) objArr[0])) {
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
        ks.e().n(this, ks.E5);
        ks.f(this.d).n(this, ks.D5);
        if (s2.a) {
            a8.b("upload story destroy");
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i10) {
        int i11 = ks.D5;
        this.b = intent.getStringExtra("path");
        int i12 = this.d;
        int intExtra = intent.getIntExtra("currentAccount", j10.t0);
        this.d = intExtra;
        if (!j10.r(intExtra)) {
            stopSelf();
            return 2;
        }
        if (i12 != this.d) {
            if (i12 != -1) {
                ks.f(i12).n(this, i11);
            }
            int i13 = this.d;
            if (i13 != -1) {
                ks.f(i13).b(this, i11);
            }
        }
        if (this.b == null) {
            stopSelf();
            return 2;
        }
        if (s2.a) {
            a8.b("start upload story");
        }
        if (this.a == null) {
            xs.i();
            q qVar = new q(t0.b, null);
            this.a = qVar;
            qVar.F.icon = R.drawable.stat_sys_upload;
            qVar.F.when = System.currentTimeMillis();
            q qVar2 = this.a;
            qVar2.y = xs.k0;
            qVar2.g(gd.M0(org.telegram.messenger.beta.R.string.AppName, null));
            this.a.p(gd.M0(2131744216, null));
            this.a.f(gd.M0(2131744216, null));
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
