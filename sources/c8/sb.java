package c8;

import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class sb {
    public static q2.w a(j2.h hVar, String str, byte[] bArr, Map map) {
        Map map2;
        List list;
        j2.b0 b0Var = new j2.b0(hVar);
        Map map3 = Collections.EMPTY_MAP;
        Uri parse = Uri.parse(str);
        a8.ja.k(parse, "The uri must be set.");
        j2.m mVar = new j2.m(parse, 2, bArr, map, 0L, -1L, null, 1);
        int i7 = 0;
        j2.m mVar2 = mVar;
        while (true) {
            try {
                j2.k kVar = new j2.k(b0Var, mVar2);
                try {
                    byte[] b10 = i9.f.b(kVar);
                    x2.t tVar = new x2.t(mVar, b0Var.c, b0Var.d, SystemClock.elapsedRealtime(), 0L, b10.length);
                    ji.j jVar = new ji.j(b10, 22);
                    jVar.c = tVar;
                    q2.w wVar = new q2.w(jVar);
                    try {
                        kVar.close();
                    } catch (IOException unused) {
                    }
                    return wVar;
                } catch (j2.x e10) {
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
                    String str3 = h2.l0.a;
                    try {
                        kVar.close();
                    } catch (IOException unused3) {
                    }
                }
            } catch (Exception e11) {
                throw new q2.x(mVar, b0Var.c, b0Var.a.getResponseHeaders(), b0Var.b, e11);
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
