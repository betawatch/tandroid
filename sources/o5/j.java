package o5;

import a8.r7;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.ff;
import org.telegram.ui.ld0;
import sg.h0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class j {
    public Context a;

    public j(Context context) {
        kotlin.jvm.internal.j.e(context, "context");
        this.a = context;
    }

    public static v0.i b(j jVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return jVar.c();
        }
        if (obj instanceof v0.m) {
            Iterator it = ((v0.m) obj).a.iterator();
            while (it.hasNext()) {
                if (((v0.h) it.next()) instanceof v0.o) {
                    return jVar.c();
                }
            }
        }
        Context ctx = jVar.a;
        kotlin.jvm.internal.j.e(ctx, "ctx");
        if (ctx.getPackageManager().hasSystemFeature("android.software.leanback") || ctx.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return jVar.c();
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            v0.k kVar = new v0.k(ctx);
            v0.k kVar2 = kVar.isAvailableOnDevice() ? kVar : null;
            return kVar2 == null ? jVar.c() : kVar2;
        }
        if (i7 <= 33) {
            return jVar.c();
        }
        return null;
    }

    public k a() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        k kVar = new k();
        kVar.a = q5.a.a(n.a);
        d9.o oVar = new d9.o(context, 3);
        kVar.b = oVar;
        kVar.c = q5.a.a(new ji.j(21, oVar, new ff(oVar, 9)));
        d9.o oVar2 = kVar.b;
        kVar.d = new ff(oVar2, 25);
        fd.a a10 = q5.a.a(new h0(6, kVar.d, q5.a.a(new u7.i(oVar2))));
        kVar.e = a10;
        pb.b bVar = new pb.b(25);
        d9.o oVar3 = kVar.b;
        ld0 ld0Var = new ld0(oVar3, a10, bVar, 17);
        fd.a aVar = kVar.a;
        fd.a aVar2 = kVar.c;
        kVar.f = q5.a.a(new h6.m(new r7(aVar, aVar2, ld0Var, a10, a10, 21), new ga.d(oVar3, aVar2, a10, ld0Var, aVar, a10, a10, 5), new xi.e(aVar, a10, ld0Var, a10), false, 17));
        return kVar;
    }

    public v0.i c() {
        String string;
        Context context = this.a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), ns.Q1);
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
        List l10 = hd.f.l(arrayList);
        if (l10.isEmpty()) {
            return null;
        }
        Iterator it = l10.iterator();
        v0.i iVar = null;
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                kotlin.jvm.internal.j.c(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                v0.i iVar2 = (v0.i) newInstance;
                if (!iVar2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (iVar != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    iVar = iVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return iVar;
    }
}
