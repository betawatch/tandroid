package k0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Log;
import hd.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import v0.j;
import v0.l;
import v0.n;
import v0.p;
import xa.c;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class b {
    public final Context a;

    public /* synthetic */ b(Context context, boolean z10) {
        this.a = context;
    }

    public static j b(b bVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return bVar.d();
        }
        if (obj instanceof n) {
            for (p pVar : ((n) obj).a) {
            }
        }
        Context ctx = bVar.a;
        i.e(ctx, "ctx");
        if (ctx.getPackageManager().hasSystemFeature("android.software.leanback") || ctx.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return bVar.d();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            l lVar = new l(ctx);
            l lVar2 = lVar.isAvailableOnDevice() ? lVar : null;
            return lVar2 == null ? bVar.d() : lVar2;
        }
        if (i10 <= 33) {
            return bVar.d();
        }
        return null;
    }

    public void a(aa.a aVar, b2.p pVar, c cVar) {
        CancellationSignal cancellationSignal;
        FingerprintManager g10;
        if (pVar != null) {
            synchronized (pVar) {
                try {
                    if (((CancellationSignal) pVar.c) == null) {
                        CancellationSignal cancellationSignal2 = new CancellationSignal();
                        pVar.c = cancellationSignal2;
                        if (pVar.b) {
                            cancellationSignal2.cancel();
                        }
                    }
                    cancellationSignal = (CancellationSignal) pVar.c;
                } finally {
                }
            }
        } else {
            cancellationSignal = null;
        }
        if (Build.VERSION.SDK_INT < 23 || (g10 = e0.b.g(this.a)) == null) {
            return;
        }
        e0.b.a(g10, e0.b.M(aVar), cancellationSignal, new a(cVar));
    }

    public PackageInfo c(int i10, String str) {
        return this.a.getPackageManager().getPackageInfo(str, i10);
    }

    public j d() {
        String string;
        Context context = this.a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List m10 = g.m(arrayList);
        if (m10.isEmpty()) {
            return null;
        }
        Iterator it = m10.iterator();
        j jVar = null;
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                i.c(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                j jVar2 = (j) newInstance;
                if (!jVar2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (jVar != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    jVar = jVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return jVar;
    }

    public b(Context context) {
        i.e(context, "context");
        this.a = context;
    }
}
