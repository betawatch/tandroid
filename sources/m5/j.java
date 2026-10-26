package m5;

import a8.me;
import aa.m0;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import b2.w0;
import b2.x;
import e2.n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jg.s0;
import li.e3;
import li.h5;
import m.r3;
import m4.w1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class j implements r2.k {
    public Context a;

    public j(Context context, int i10) {
        switch (i10) {
            case 2:
                kotlin.jvm.internal.i.e(context, "context");
                this.a = context;
                break;
            default:
                this.a = context;
                break;
        }
    }

    public static v0.j b(j jVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return jVar.c();
        }
        if (obj instanceof v0.n) {
            for (v0.p pVar : ((v0.n) obj).a) {
            }
        }
        Context ctx = jVar.a;
        kotlin.jvm.internal.i.e(ctx, "ctx");
        if (ctx.getPackageManager().hasSystemFeature("android.software.leanback") || ctx.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return jVar.c();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            v0.l lVar = new v0.l(ctx);
            v0.l lVar2 = lVar.isAvailableOnDevice() ? lVar : null;
            return lVar2 == null ? jVar.c() : lVar2;
        }
        if (i10 <= 33) {
            return jVar.c();
        }
        return null;
    }

    @Override // r2.k
    public r2.l G(m0 m0Var) {
        Context context;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31 && ((context = this.a) == null || i10 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new u7.s(20).G(m0Var);
        }
        int h = w0.h(((x) m0Var.c).s);
        e2.a.g("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + n0.I(h));
        r2.b bVar = new r2.b(h, 0);
        r2.b bVar2 = new r2.b(h, 1);
        androidx.activity.n nVar = new androidx.activity.n();
        nVar.b = bVar;
        nVar.c = bVar2;
        nVar.a = true;
        nVar.a = true;
        return nVar.G(m0Var);
    }

    public k a() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        k kVar = new k();
        kVar.a = o5.a.a(n.a);
        b9.p pVar = new b9.p(context);
        kVar.b = pVar;
        kVar.c = o5.a.a(new w1(3, pVar, new s0(pVar, 11)));
        b9.p pVar2 = kVar.b;
        kVar.d = new h5(pVar2);
        id.a a2 = o5.a.a(new w1(22, kVar.d, o5.a.a(new e3(pVar2, 19))));
        kVar.e = a2;
        u7.s sVar = new u7.s(21);
        b9.p pVar3 = kVar.b;
        k6.c cVar = new k6.c(pVar3, a2, sVar, 27);
        id.a aVar = kVar.a;
        id.a aVar2 = kVar.c;
        me meVar = new me(aVar, aVar2, cVar, a2, a2);
        r3 r3Var = new r3();
        r3Var.a = pVar3;
        r3Var.b = aVar2;
        r3Var.c = a2;
        r3Var.d = cVar;
        r3Var.e = aVar;
        r3Var.f = a2;
        r3Var.h = a2;
        kVar.f = o5.a.a(new k6.c(meVar, r3Var, new ti.e(aVar, a2, cVar, a2), 7));
        return kVar;
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
        List m10 = kd.g.m(arrayList);
        if (m10.isEmpty()) {
            return null;
        }
        Iterator it = m10.iterator();
        v0.j jVar = null;
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                kotlin.jvm.internal.i.c(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
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
