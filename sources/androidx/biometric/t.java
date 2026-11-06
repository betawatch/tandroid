package androidx.biometric;

import a8.r7;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import e2.s0;
import h2.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.uy;
import org.telegram.ui.hy0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class t {
    public Context a;

    public t(Context context, int i7) {
        switch (i7) {
            case 2:
                context.getClass();
                this.a = context;
                break;
            case 3:
                kotlin.jvm.internal.j.e(context, "context");
                this.a = context;
                break;
            case 4:
                this.a = context;
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }

    public static v0.i b(t tVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return tVar.e();
        }
        if (obj instanceof v0.n) {
            Iterator it = ((v0.n) obj).a.iterator();
            while (it.hasNext()) {
                if (((v0.h) it.next()) instanceof v0.p) {
                    return tVar.e();
                }
            }
        }
        Context ctx = tVar.a;
        kotlin.jvm.internal.j.e(ctx, "ctx");
        if (ctx.getPackageManager().hasSystemFeature("android.software.leanback") || ctx.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return tVar.e();
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            v0.l lVar = new v0.l(ctx);
            v0.l lVar2 = lVar.isAvailableOnDevice() ? lVar : null;
            return lVar2 == null ? tVar.e() : lVar2;
        }
        if (i7 <= 33) {
            return tVar.e();
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 34) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(e2.u uVar) {
        String str = uVar.s;
        if (str == null || !s0.k(str)) {
            return jg.g.b(0, 0, 0, 0);
        }
        String str2 = uVar.s;
        String str3 = m0.a;
        str2.getClass();
        switch (str2) {
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return jg.g.b(4, 0, 0, 0);
        }
        return jg.g.b(1, 0, 0, 0);
    }

    public o5.j a() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        o5.j jVar = new o5.j();
        jVar.a = q5.a.a(o5.m.a);
        e.a aVar = new e.a(context);
        jVar.b = aVar;
        jVar.c = q5.a.a(new j2.n(aVar, new qt(aVar, 7), false, 23));
        e.a aVar2 = jVar.b;
        jVar.d = new uy(aVar2, 27);
        fd.a a10 = q5.a.a(new sg.i0(6, jVar.d, q5.a.a(new org.telegram.ui.Components.n(aVar2))));
        jVar.e = a10;
        sa.d dVar = new sa.d(24);
        e.a aVar3 = jVar.b;
        hy0 hy0Var = new hy0(aVar3, a10, dVar, 16);
        fd.a aVar4 = jVar.a;
        fd.a aVar5 = jVar.c;
        jVar.f = q5.a.a(new h6.m(new r7(aVar4, aVar5, hy0Var, a10, a10, 20), new ga.d(aVar3, aVar5, a10, hy0Var, aVar4, a10, a10, 5), new ab.b0(aVar4, a10, hy0Var, a10, 14), 17));
        return jVar;
    }

    public PackageInfo c(int i7, String str) {
        return this.a.getPackageManager().getPackageInfo(str, i7);
    }

    public v0.i e() {
        String string;
        Context context = this.a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), qs.Q1);
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
