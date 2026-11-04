package androidx.emoji2.text;

import ai.k3;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import b8.ke;
import b8.w0;
import d2.u0;
import g2.n0;
import gi.v5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k2.p1;
import mi.h0;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.y00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n implements k, t2.k {
    public Context a;

    public /* synthetic */ n(Context context, char c2) {
        this.a = context;
    }

    public static v0.i c(n nVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return nVar.f();
        }
        if (obj instanceof v0.m) {
            for (v0.o oVar : ((v0.m) obj).a) {
            }
        }
        Context ctx = nVar.a;
        kotlin.jvm.internal.j.e(ctx, "ctx");
        if (ctx.getPackageManager().hasSystemFeature("android.software.leanback") || ctx.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return nVar.f();
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            v0.k kVar = new v0.k(ctx);
            v0.k kVar2 = kVar.isAvailableOnDevice() ? kVar : null;
            return kVar2 == null ? nVar.f() : kVar2;
        }
        if (i3 <= 33) {
            return nVar.f();
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
    public static int e(d2.v vVar) {
        String str = vVar.s;
        if (str == null || !u0.k(str)) {
            return p1.a(0, 0, 0, 0);
        }
        String str2 = vVar.s;
        String str3 = n0.a;
        str2.getClass();
        switch (str2) {
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return p1.a(4, 0, 0, 0);
        }
        return p1.a(1, 0, 0, 0);
    }

    @Override // t2.k
    public t2.l L(l2.e eVar) {
        Context context;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 31 && ((context = this.a) == null || i3 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new v7.s(23).L(eVar);
        }
        int h = u0.h(((d2.v) eVar.c).s);
        g2.a.g("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + n0.I(h));
        androidx.activity.n nVar = new androidx.activity.n(new t2.b(h, 0), new t2.b(h, 1));
        nVar.b = true;
        return nVar.L(eVar);
    }

    @Override // androidx.emoji2.text.k
    public void a(w0 w0Var) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new k3(this, w0Var, threadPoolExecutor, 6));
    }

    public n5.j b() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        n5.j jVar = new n5.j();
        jVar.a = p5.a.a(n5.m.a);
        c9.o oVar = new c9.o(context);
        jVar.b = oVar;
        boolean z10 = false;
        jVar.c = p5.a.a(new m2.t(oVar, new v5(oVar, 19), z10, 4));
        c9.o oVar2 = jVar.b;
        jVar.d = new nh(oVar2, 24);
        cd.a a10 = p5.a.a(new h0(jVar.d, p5.a.a(new y00(oVar2)), z10, 25));
        jVar.e = a10;
        mb.b bVar = new mb.b(23);
        c9.o oVar3 = jVar.b;
        p7.d dVar = new p7.d(oVar3, a10, bVar, 10);
        cd.a aVar = jVar.a;
        cd.a aVar2 = jVar.c;
        jVar.f = p5.a.a(new k4.j(new ke(aVar, aVar2, dVar, a10, a10, 17), new fa.f(oVar3, aVar2, a10, dVar, aVar, a10, a10, 5), new ui.f(aVar, a10, dVar, a10, false, 14)));
        return jVar;
    }

    public PackageInfo d(int i3, String str) {
        return this.a.getPackageManager().getPackageInfo(str, i3);
    }

    public v0.i f() {
        String string;
        Context context = this.a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), hs.Q1);
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
        List l10 = ed.g.l(arrayList);
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

    public n(Context context, int i3) {
        switch (i3) {
            case 2:
                context.getClass();
                this.a = context;
                break;
            case 3:
            default:
                this.a = context.getApplicationContext();
                break;
            case 4:
                kotlin.jvm.internal.j.e(context, "context");
                this.a = context;
                break;
        }
    }
}
