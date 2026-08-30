package k6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;
import tc.g;
import v0.l;
import v0.n;
import v0.p;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class b {
    public final Context a;

    public b(Context context, int i10) {
        switch (i10) {
            case 1:
                j.e(context, "context");
                this.a = context;
                break;
            default:
                this.a = context;
                break;
        }
    }

    public static v0.j a(b bVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return bVar.c();
        }
        if (obj instanceof n) {
            for (p pVar : ((n) obj).a) {
            }
        }
        Context ctx = bVar.a;
        j.e(ctx, "ctx");
        if (ctx.getPackageManager().hasSystemFeature("android.software.leanback") || ctx.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return bVar.c();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            l lVar = new l(ctx);
            l lVar2 = lVar.isAvailableOnDevice() ? lVar : null;
            return lVar2 == null ? bVar.c() : lVar2;
        }
        if (i10 <= 33) {
            return bVar.c();
        }
        return null;
    }

    public PackageInfo b(int i10, String str) {
        return this.a.getPackageManager().getPackageInfo(str, i10);
    }

    public v0.j c() {
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
        List m9 = g.m(arrayList);
        if (m9.isEmpty()) {
            return null;
        }
        Iterator it = m9.iterator();
        v0.j jVar = null;
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                j.c(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                v0.j jVar2 = (v0.j) newInstance;
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
}
