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
import m.o3;
import org.telegram.messenger.ks;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Components.i61;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        i5 i5Var = new i5(context);
        kVar.b = i5Var;
        kVar.c = q5.a.a(new j6.k(i5Var, new aa(i5Var, 11), false, 22));
        i5 i5Var2 = kVar.b;
        kVar.d = new v4.b(i5Var2, 3);
        fd.a a10 = q5.a.a(new s2.e(7, kVar.d, q5.a.a(new aa(i5Var2, 27))));
        kVar.e = a10;
        pb.b bVar = new pb.b(25);
        i5 i5Var3 = kVar.b;
        i61 i61Var = new i61(i5Var3, a10, bVar, 19);
        fd.a aVar = kVar.a;
        fd.a aVar2 = kVar.c;
        kVar.f = q5.a.a(new h6.m(new r7(aVar, aVar2, i61Var, a10, a10, 21), new o3(i5Var3, aVar2, a10, i61Var, aVar, a10, a10), new xi.e(aVar, a10, i61Var, a10), false, 18));
        return kVar;
    }

    public v0.i c() {
        String string;
        Context context = this.a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), ks.Q1);
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
