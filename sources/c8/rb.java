package c8;

import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class rb {
    public static q2.v a(j2.h hVar, String str, byte[] bArr, Map map) {
        Map map2;
        List list;
        j2.c0 c0Var = new j2.c0(hVar);
        Map map3 = Collections.EMPTY_MAP;
        Uri parse = Uri.parse(str);
        a8.ia.k(parse, "The uri must be set.");
        j2.m mVar = new j2.m(parse, 2, bArr, map, 0L, -1L, null, 1);
        int i7 = 0;
        j2.m mVar2 = mVar;
        while (true) {
            try {
                j2.k kVar = new j2.k(c0Var, mVar2);
                try {
                    byte[] b10 = i9.f.b(kVar);
                    x2.u uVar = new x2.u(mVar, c0Var.c, c0Var.d, SystemClock.elapsedRealtime(), 0L, b10.length);
                    j2.n nVar = new j2.n(b10);
                    nVar.c = uVar;
                    q2.v vVar = new q2.v(nVar);
                    try {
                        kVar.close();
                    } catch (IOException unused) {
                    }
                    return vVar;
                } catch (j2.y e10) {
                    try {
                        int i10 = e10.c;
                        String str2 = null;
                        if ((i10 == 307 || i10 == 308) && i7 < 5 && (map2 = e10.d) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str2 = (String) list.get(0);
                        }
                        if (str2 == null) {
                            throw e10;
                        }
                        i7++;
                        j2.l a10 = mVar2.a();
                        a10.e = Uri.parse(str2);
                        mVar2 = a10.d();
                        try {
                            kVar.close();
                        } catch (IOException unused2) {
                        }
                    } finally {
                        String str3 = h2.m0.a;
                        try {
                            kVar.close();
                        } catch (IOException unused3) {
                        }
                    }
                }
            } catch (Exception e11) {
                throw new q2.w(mVar, c0Var.c, c0Var.a.getResponseHeaders(), c0Var.b, e11);
            }
        }
    }

    public static boolean b(Throwable th2) {
        return Build.VERSION.SDK_INT == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean c(Throwable th2) {
        return Build.VERSION.SDK_INT == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
