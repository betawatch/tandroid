package a9;

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
import m.o3;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class y0 extends p6.h {
    public final ExecutorService F;
    public final c6.i G;
    public final c6.i H;
    public final c6.i I;
    public final c6.i J;
    public final c6.i K;
    public final c6.i L;
    public final c6.i M;
    public final c6.i N;
    public final c6.i O;
    public final c6.i P;
    public final z0 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(Context context, Looper looper, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, o3 o3Var) {
        super(context, looper, 14, o3Var, kVar, lVar, 0);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        z0 a10 = z0.a(context);
        this.G = new c6.i(1);
        this.H = new c6.i(1);
        this.I = new c6.i(1);
        this.J = new c6.i(1);
        this.K = new c6.i(1);
        this.L = new c6.i(1);
        this.M = new c6.i(1);
        this.N = new c6.i(1);
        this.O = new c6.i(1);
        this.P = new c6.i(1);
        p6.m.g(unconfigurableExecutorService);
        this.F = unconfigurableExecutorService;
        this.Q = a10;
        File file = new File(new File(context.getFilesDir(), "wearos_assets"), "streamtmp");
        file.mkdirs();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                file2.delete();
            }
        }
    }

    @Override // p6.d, com.google.android.gms.common.api.c
    public final boolean b() {
        return !this.Q.b();
    }

    @Override // p6.d, com.google.android.gms.common.api.c
    public final void c(p6.b bVar) {
        p6.c0 c0Var = this.k;
        AtomicInteger atomicInteger = this.C;
        Context context = this.h;
        if (!b()) {
            try {
                Bundle bundle = context.getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                int i3 = bundle != null ? bundle.getInt("com.google.android.wearable.api.version", 0) : 0;
                if (i3 < 8600000) {
                    Log.w("WearableClient", "The Wear OS app is out of date. Requires API version 8600000 but found " + i3);
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (context.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    PendingIntent activity = PendingIntent.getActivity(context, 0, intent, h8.b.a);
                    p6.m.h(bVar, "Connection progress callbacks cannot be null.");
                    this.o = bVar;
                    c0Var.sendMessage(c0Var.obtainMessage(3, atomicInteger.get(), 6, activity));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                p6.m.h(bVar, "Connection progress callbacks cannot be null.");
                this.o = bVar;
                c0Var.sendMessage(c0Var.obtainMessage(3, atomicInteger.get(), 16, null));
                return;
            }
        }
        super.c(bVar);
    }

    @Override // p6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 8600000;
    }

    @Override // p6.d
    public final IInterface g(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        return queryLocalInterface instanceof f0 ? (f0) queryLocalInterface : new f0(iBinder, "com.google.android.gms.wearable.internal.IWearableService", 5);
    }

    @Override // p6.d
    public final m6.c[] i() {
        return z8.c.b;
    }

    @Override // p6.d
    public final String n() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    @Override // p6.d
    public final String o() {
        return "com.google.android.gms.wearable.BIND";
    }

    @Override // p6.d
    public final String p() {
        return this.Q.b() ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }

    @Override // p6.d
    public final void v(int i3, IBinder iBinder, Bundle bundle, int i10) {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.v("WearableClient", "onPostInitHandler: statusCode " + i3);
        }
        if (i3 == 0) {
            this.G.I(iBinder);
            this.H.I(iBinder);
            this.I.I(iBinder);
            this.K.I(iBinder);
            this.L.I(iBinder);
            this.M.I(iBinder);
            this.N.I(iBinder);
            this.O.I(iBinder);
            this.P.I(iBinder);
            this.J.I(iBinder);
            i3 = 0;
        }
        super.v(i3, iBinder, bundle, i10);
    }

    @Override // p6.d
    public final boolean w() {
        return true;
    }
}
