package j8;

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
import m.t3;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class z0 extends y5.g {
    public final ExecutorService Q;
    public final ya.c R;
    public final ya.c S;
    public final ya.c T;
    public final ya.c U;
    public final ya.c V;
    public final ya.c W;
    public final ya.c X;
    public final ya.c Y;
    public final ya.c Z;
    public final ya.c a0;
    public final a1 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(Context context, Looper looper, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, t3 t3Var) {
        super(context, looper, 14, t3Var, kVar, lVar, 0);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        a1 a2 = a1.a(context);
        this.R = new ya.c();
        this.S = new ya.c();
        this.T = new ya.c();
        this.U = new ya.c();
        this.V = new ya.c();
        this.W = new ya.c();
        this.X = new ya.c();
        this.Y = new ya.c();
        this.Z = new ya.c();
        this.a0 = new ya.c();
        y5.l.h(unconfigurableExecutorService);
        this.Q = unconfigurableExecutorService;
        this.b0 = a2;
        File file = new File(new File(context.getFilesDir(), "wearos_assets"), "streamtmp");
        file.mkdirs();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                file2.delete();
            }
        }
    }

    @Override // y5.g
    public final void B(int i10, IBinder iBinder, Bundle bundle, int i11) {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.v("WearableClient", "onPostInitHandler: statusCode " + i10);
        }
        if (i10 == 0) {
            this.R.a(iBinder);
            this.S.a(iBinder);
            this.T.a(iBinder);
            this.V.a(iBinder);
            this.W.a(iBinder);
            this.X.a(iBinder);
            this.Y.a(iBinder);
            this.Z.a(iBinder);
            this.a0.a(iBinder);
            this.U.a(iBinder);
            i10 = 0;
        }
        super.B(i10, iBinder, bundle, i11);
    }

    @Override // y5.g
    public final boolean C() {
        return true;
    }

    @Override // y5.g, com.google.android.gms.common.api.c
    public final boolean j() {
        return !this.b0.b();
    }

    @Override // y5.g, com.google.android.gms.common.api.c
    public final int k() {
        return 8600000;
    }

    @Override // y5.g, com.google.android.gms.common.api.c
    public final void p(y5.b bVar) {
        y5.a0 a0Var = this.v;
        AtomicInteger atomicInteger = this.N;
        Context context = this.n;
        if (!j()) {
            try {
                Bundle bundle = context.getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                int i10 = bundle != null ? bundle.getInt("com.google.android.wearable.api.version", 0) : 0;
                if (i10 < 8600000) {
                    Log.w("WearableClient", "The Wear OS app is out of date. Requires API version 8600000 but found " + i10);
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (context.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    PendingIntent activity = PendingIntent.getActivity(context, 0, intent, q7.b.a);
                    y5.l.i(bVar, "Connection progress callbacks cannot be null.");
                    this.A = bVar;
                    a0Var.sendMessage(a0Var.obtainMessage(3, atomicInteger.get(), 6, activity));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                y5.l.i(bVar, "Connection progress callbacks cannot be null.");
                this.A = bVar;
                a0Var.sendMessage(a0Var.obtainMessage(3, atomicInteger.get(), 16, null));
                return;
            }
        }
        super.p(bVar);
    }

    @Override // y5.g
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        return queryLocalInterface instanceof h0 ? (h0) queryLocalInterface : new h0(iBinder, "com.google.android.gms.wearable.internal.IWearableService", 8);
    }

    @Override // y5.g
    public final v5.c[] r() {
        return i8.j.b;
    }

    @Override // y5.g
    public final String v() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    @Override // y5.g
    public final String w() {
        return "com.google.android.gms.wearable.BIND";
    }

    @Override // y5.g
    public final String x() {
        return this.b0.b() ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }
}
