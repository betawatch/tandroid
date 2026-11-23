package b9;

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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class y0 extends q6.h {
    public final ExecutorService F;
    public final d6.i G;
    public final d6.i H;
    public final d6.i I;
    public final d6.i J;
    public final d6.i K;
    public final d6.i L;
    public final d6.i M;
    public final d6.i N;
    public final d6.i O;
    public final d6.i P;
    public final z0 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(Context context, Looper looper, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, ga.d dVar) {
        super(context, looper, 14, dVar, kVar, lVar, 0);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        z0 a10 = z0.a(context);
        this.G = new d6.i(5);
        this.H = new d6.i(5);
        this.I = new d6.i(5);
        this.J = new d6.i(5);
        this.K = new d6.i(5);
        this.L = new d6.i(5);
        this.M = new d6.i(5);
        this.N = new d6.i(5);
        this.O = new d6.i(5);
        this.P = new d6.i(5);
        q6.m.h(unconfigurableExecutorService);
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

    @Override // q6.d, com.google.android.gms.common.api.c
    public final boolean c() {
        return !this.Q.b();
    }

    @Override // q6.d, com.google.android.gms.common.api.c
    public final int d() {
        return 8600000;
    }

    @Override // q6.d, com.google.android.gms.common.api.c
    public final void h(q6.b bVar) {
        q6.c0 c0Var = this.k;
        AtomicInteger atomicInteger = this.C;
        Context context = this.h;
        if (!c()) {
            try {
                Bundle bundle = context.getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                int i7 = bundle != null ? bundle.getInt("com.google.android.wearable.api.version", 0) : 0;
                if (i7 < 8600000) {
                    Log.w("WearableClient", "The Wear OS app is out of date. Requires API version 8600000 but found " + i7);
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (context.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    PendingIntent activity = PendingIntent.getActivity(context, 0, intent, i8.b.a);
                    q6.m.i(bVar, "Connection progress callbacks cannot be null.");
                    this.o = bVar;
                    c0Var.sendMessage(c0Var.obtainMessage(3, atomicInteger.get(), 6, activity));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                q6.m.i(bVar, "Connection progress callbacks cannot be null.");
                this.o = bVar;
                c0Var.sendMessage(c0Var.obtainMessage(3, atomicInteger.get(), 16, null));
                return;
            }
        }
        super.h(bVar);
    }

    @Override // q6.d
    public final IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        return queryLocalInterface instanceof f0 ? (f0) queryLocalInterface : new f0(iBinder, "com.google.android.gms.wearable.internal.IWearableService", 6);
    }

    @Override // q6.d
    public final n6.c[] k() {
        return a9.c.b;
    }

    @Override // q6.d
    public final String o() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    @Override // q6.d
    public final String p() {
        return "com.google.android.gms.wearable.BIND";
    }

    @Override // q6.d
    public final String q() {
        return this.Q.b() ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }

    @Override // q6.d
    public final void w(int i7, IBinder iBinder, Bundle bundle, int i10) {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.v("WearableClient", "onPostInitHandler: statusCode " + i7);
        }
        if (i7 == 0) {
            this.G.M(iBinder);
            this.H.M(iBinder);
            this.I.M(iBinder);
            this.K.M(iBinder);
            this.L.M(iBinder);
            this.M.M(iBinder);
            this.N.M(iBinder);
            this.O.M(iBinder);
            this.P.M(iBinder);
            this.J.M(iBinder);
            i7 = 0;
        }
        super.w(i7, iBinder, bundle, i10);
    }

    @Override // q6.d
    public final boolean x() {
        return true;
    }
}
