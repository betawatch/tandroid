package db;

import android.os.Build;
import android.support.v4.media.session.a0;
import android.util.Log;
import bd.t;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import td.e0;
import v7.x6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d {
    public final ra.d a;
    public final a0 b;
    public final k c;
    public final ce.d d = ce.e.a();

    public d(cd.h hVar, ra.d dVar, bb.b bVar, a0 a0Var, k1.f fVar) {
        this.a = dVar;
        this.b = a0Var;
        this.c = new k(fVar);
    }

    public static String b(String str) {
        Pattern compile = Pattern.compile("/");
        kotlin.jvm.internal.i.d(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll("");
        kotlin.jvm.internal.i.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final Boolean a() {
        e eVar = this.c.b;
        if (eVar != null) {
            return eVar.a;
        }
        kotlin.jvm.internal.i.h("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:25:0x004e, B:26:0x00b2, B:28:0x00b6, B:31:0x00c1, B:38:0x0084, B:40:0x008c, B:43:0x0097), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1 A[Catch: all -> 0x0052, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:25:0x004e, B:26:0x00b2, B:28:0x00b6, B:31:0x00c1, B:38:0x0084, B:40:0x008c, B:43:0x0097), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:25:0x004e, B:26:0x00b2, B:28:0x00b6, B:31:0x00c1, B:38:0x0084, B:40:0x008c, B:43:0x0097), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097 A[Catch: all -> 0x0052, TRY_ENTER, TryCatch #0 {all -> 0x0052, blocks: (B:25:0x004e, B:26:0x00b2, B:28:0x00b6, B:31:0x00c1, B:38:0x0084, B:40:0x008c, B:43:0x0097), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cd.c cVar) {
        a aVar;
        ?? r42;
        ce.a aVar2;
        ce.a aVar3;
        d dVar;
        String str;
        try {
            if (cVar instanceof a) {
                aVar = (a) cVar;
                int i10 = aVar.e;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    aVar.e = i10 - TLObject.FLAG_31;
                    Object obj = aVar.c;
                    dd.a aVar4 = dd.a.a;
                    r42 = aVar.e;
                    ad.j jVar = ad.j.a;
                    if (r42 != 0) {
                        l9.b.b(obj);
                        ce.d dVar2 = this.d;
                        if (!dVar2.c() && !this.c.b()) {
                            return jVar;
                        }
                        aVar.a = this;
                        aVar.b = dVar2;
                        aVar.e = 1;
                        if (dVar2.d(aVar) != aVar4) {
                            aVar3 = dVar2;
                            dVar = this;
                        }
                        return aVar4;
                    }
                    if (r42 != 1) {
                        if (r42 != 2) {
                            if (r42 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = (ce.a) aVar.a;
                            try {
                                l9.b.b(obj);
                                ((ce.d) aVar2).e(null);
                                return jVar;
                            } catch (Throwable th2) {
                                th = th2;
                                ((ce.d) aVar2).e(null);
                                throw th;
                            }
                        }
                        aVar3 = aVar.b;
                        dVar = (d) aVar.a;
                        l9.b.b(obj);
                        str = (String) obj;
                        if (str != null) {
                            Log.w("SessionConfigFetcher", "Error getting Firebase Installation ID. Skipping this Session Event.");
                            ((ce.d) aVar3).e(null);
                            return jVar;
                        }
                        ad.e eVar = new ad.e("X-Crashlytics-Installation-ID", str);
                        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                        dVar.getClass();
                        ad.e eVar2 = new ad.e("X-Crashlytics-Device-Model", b(format));
                        String INCREMENTAL = Build.VERSION.INCREMENTAL;
                        kotlin.jvm.internal.i.d(INCREMENTAL, "INCREMENTAL");
                        ad.e eVar3 = new ad.e("X-Crashlytics-OS-Build-Version", b(INCREMENTAL));
                        String RELEASE = Build.VERSION.RELEASE;
                        kotlin.jvm.internal.i.d(RELEASE, "RELEASE");
                        Map b10 = t.b(eVar, eVar2, eVar3, new ad.e("X-Crashlytics-OS-Display-Version", b(RELEASE)), new ad.e("X-Crashlytics-API-Client-Version", "1.2.0"));
                        Log.d("SessionConfigFetcher", "Fetching settings from server.");
                        a0 a0Var = dVar.b;
                        b bVar = new b(dVar, null);
                        c cVar2 = new c(2, null);
                        aVar.a = aVar3;
                        aVar.b = null;
                        aVar.e = 3;
                        Object w9 = e0.w((cd.h) a0Var.c, new b(a0Var, b10, bVar, cVar2, null), aVar);
                        if (w9 != aVar4) {
                            w9 = jVar;
                        }
                        if (w9 != aVar4) {
                            aVar2 = aVar3;
                            ((ce.d) aVar2).e(null);
                            return jVar;
                        }
                        return aVar4;
                    }
                    aVar3 = aVar.b;
                    dVar = (d) aVar.a;
                    l9.b.b(obj);
                    if (dVar.c.b()) {
                        Log.d("SessionConfigFetcher", "Remote settings cache not expired. Using cached values.");
                        ((ce.d) aVar3).e(null);
                        return jVar;
                    }
                    Task d = ((ra.c) dVar.a).d();
                    kotlin.jvm.internal.i.d(d, "firebaseInstallationsApi.id");
                    aVar.a = dVar;
                    aVar.b = aVar3;
                    aVar.e = 2;
                    obj = x6.a(d, aVar);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                    str = (String) obj;
                    if (str != null) {
                    }
                }
            }
            if (r42 != 0) {
            }
            if (dVar.c.b()) {
            }
        } catch (Throwable th3) {
            th = th3;
            aVar2 = r42;
        }
        aVar = new a(this, (ed.c) cVar);
        Object obj2 = aVar.c;
        dd.a aVar42 = dd.a.a;
        r42 = aVar.e;
        ad.j jVar2 = ad.j.a;
    }
}
