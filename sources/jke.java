// default package

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class jke extends xx4 {
    public final ExecutorService F;
    public final g29 G;
    public final g29 H;
    public final g29 I;
    public final g29 J;
    public final g29 K;
    public final g29 L;
    public final g29 M;
    public final g29 N;
    public final g29 O;
    public final g29 P;
    public final tle Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jke(ey4 ey4Var, fy4 fy4Var, ntb ntbVar, Context context, Looper looper) {
        super(14, ey4Var, fy4Var, ntbVar, context, looper);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        tle a = tle.a(context);
        this.G = new g29((byte) 29);
        this.H = new g29((byte) 29);
        this.I = new g29((byte) 29);
        this.J = new g29((byte) 29);
        this.K = new g29((byte) 29);
        this.L = new g29((byte) 29);
        this.M = new g29((byte) 29);
        this.N = new g29((byte) 29);
        this.O = new g29((byte) 29);
        this.P = new g29((byte) 29);
        fre.h(unconfigurableExecutorService);
        this.F = unconfigurableExecutorService;
        this.Q = a;
        File file = new File(new File(context.getFilesDir(), "wearos_assets"), "streamtmp");
        file.mkdirs();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                file2.delete();
            }
        }
    }

    @Override // gg0
    public final void a(eg0 eg0Var) {
        pbd pbdVar = this.k;
        AtomicInteger atomicInteger = this.C;
        Context context = this.h;
        if (!v()) {
            try {
                Bundle bundle = context.getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                int i = bundle != null ? bundle.getInt("com.google.android.wearable.api.version", 0) : 0;
                if (i < 8600000) {
                    Log.w("WearableClient", "The Wear OS app is out of date. Requires API version 8600000 but found " + i);
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (context.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    PendingIntent activity = PendingIntent.getActivity(context, 0, intent, end.a);
                    fre.i(eg0Var, "Connection progress callbacks cannot be null.");
                    this.o = eg0Var;
                    pbdVar.sendMessage(pbdVar.obtainMessage(3, atomicInteger.get(), 6, activity));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                fre.i(eg0Var, "Connection progress callbacks cannot be null.");
                this.o = eg0Var;
                pbdVar.sendMessage(pbdVar.obtainMessage(3, atomicInteger.get(), 16, null));
                return;
            }
        }
        super.a(eg0Var);
    }

    @Override // gg0
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        return queryLocalInterface instanceof lzd ? (lzd) queryLocalInterface : new lzd(iBinder, "com.google.android.gms.wearable.internal.IWearableService", (byte) 9);
    }

    @Override // gg0
    public final f84[] f() {
        return qed.a;
    }

    @Override // gg0
    public final int i() {
        return 8600000;
    }

    @Override // gg0
    public final String l() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    @Override // gg0
    public final String n() {
        return "com.google.android.gms.wearable.BIND";
    }

    @Override // gg0
    public final String o() {
        return this.Q.b() ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }

    @Override // gg0
    public final void u(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.v("WearableClient", "onPostInitHandler: statusCode " + i);
        }
        if (i == 0) {
            this.G.p(iBinder);
            this.H.p(iBinder);
            this.I.p(iBinder);
            this.K.p(iBinder);
            this.L.p(iBinder);
            this.M.p(iBinder);
            this.N.p(iBinder);
            this.O.p(iBinder);
            this.P.p(iBinder);
            this.J.p(iBinder);
            i = 0;
        }
        super.u(i, iBinder, bundle, i2);
    }

    @Override // gg0
    public final boolean v() {
        return !this.Q.b();
    }

    @Override // gg0
    public final boolean x() {
        return true;
    }
}
