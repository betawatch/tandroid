package androidx.biometric;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class u implements androidx.emoji2.text.k {
    public final Context a;

    public u(Context context, int i10) {
        switch (i10) {
            case 1:
                this.a = context.getApplicationContext();
                break;
            case 2:
                kotlin.jvm.internal.j.e(context, "context");
                this.a = context;
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }

    public static v0.j b(u uVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return uVar.c();
        }
        if (obj instanceof v0.n) {
            for (v0.p pVar : ((v0.n) obj).a) {
            }
        }
        Context ctx = uVar.a;
        kotlin.jvm.internal.j.e(ctx, "ctx");
        if (ctx.getPackageManager().hasSystemFeature("android.software.leanback") || ctx.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return uVar.c();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            v0.l lVar = new v0.l(ctx);
            v0.l lVar2 = lVar.isAvailableOnDevice() ? lVar : null;
            return lVar2 == null ? uVar.c() : lVar2;
        }
        if (i10 <= 33) {
            return uVar.c();
        }
        return null;
    }

    @Override // androidx.emoji2.text.k
    public void a(j7.t tVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new androidx.car.app.utils.b(this, tVar, threadPoolExecutor, 2));
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
        List m9 = tc.g.m(arrayList);
        if (m9.isEmpty()) {
            return null;
        }
        Iterator it = m9.iterator();
        v0.j jVar = null;
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                kotlin.jvm.internal.j.c(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
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
