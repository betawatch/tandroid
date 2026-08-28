package ja;

import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import g7.h7;
import g7.y5;
import hd.f0;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import pc.r;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d {
    public final y9.d a;
    public final j4.c b;
    public final k c;
    public final qd.d d = qd.e.a();

    public d(qc.h hVar, y9.d dVar, ha.b bVar, j4.c cVar, k1.f fVar) {
        this.a = dVar;
        this.b = cVar;
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
    public final Object c(qc.c cVar) {
        a aVar;
        ?? r42;
        qd.a aVar2;
        qd.a aVar3;
        d dVar;
        String str;
        try {
            if (cVar instanceof a) {
                aVar = (a) cVar;
                int i9 = aVar.e;
                if ((i9 & TLObject.FLAG_31) != 0) {
                    aVar.e = i9 - TLObject.FLAG_31;
                    Object obj = aVar.c;
                    rc.a aVar4 = rc.a.a;
                    r42 = aVar.e;
                    oc.i iVar = oc.i.a;
                    if (r42 != 0) {
                        y5.b(obj);
                        qd.d dVar2 = this.d;
                        if (!dVar2.c() && !this.c.b()) {
                            return iVar;
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
                            aVar2 = (qd.a) aVar.a;
                            try {
                                y5.b(obj);
                                ((qd.d) aVar2).e(null);
                                return iVar;
                            } catch (Throwable th) {
                                th = th;
                                ((qd.d) aVar2).e(null);
                                throw th;
                            }
                        }
                        aVar3 = aVar.b;
                        dVar = (d) aVar.a;
                        y5.b(obj);
                        str = (String) obj;
                        if (str != null) {
                            Log.w("SessionConfigFetcher", "Error getting Firebase Installation ID. Skipping this Session Event.");
                            ((qd.d) aVar3).e(null);
                            return iVar;
                        }
                        oc.d dVar3 = new oc.d("X-Crashlytics-Installation-ID", str);
                        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                        dVar.getClass();
                        oc.d dVar4 = new oc.d("X-Crashlytics-Device-Model", b(format));
                        String INCREMENTAL = Build.VERSION.INCREMENTAL;
                        kotlin.jvm.internal.i.d(INCREMENTAL, "INCREMENTAL");
                        oc.d dVar5 = new oc.d("X-Crashlytics-OS-Build-Version", b(INCREMENTAL));
                        String RELEASE = Build.VERSION.RELEASE;
                        kotlin.jvm.internal.i.d(RELEASE, "RELEASE");
                        Map b10 = r.b(dVar3, dVar4, dVar5, new oc.d("X-Crashlytics-OS-Display-Version", b(RELEASE)), new oc.d("X-Crashlytics-API-Client-Version", "1.2.0"));
                        Log.d("SessionConfigFetcher", "Fetching settings from server.");
                        j4.c cVar2 = dVar.b;
                        b bVar = new b(dVar, null);
                        c cVar3 = new c(2, null);
                        aVar.a = aVar3;
                        aVar.b = null;
                        aVar.e = 3;
                        Object w8 = f0.w((qc.h) cVar2.c, new b(cVar2, b10, bVar, cVar3, null), aVar);
                        if (w8 != aVar4) {
                            w8 = iVar;
                        }
                        if (w8 != aVar4) {
                            aVar2 = aVar3;
                            ((qd.d) aVar2).e(null);
                            return iVar;
                        }
                        return aVar4;
                    }
                    aVar3 = aVar.b;
                    dVar = (d) aVar.a;
                    y5.b(obj);
                    if (dVar.c.b()) {
                        Log.d("SessionConfigFetcher", "Remote settings cache not expired. Using cached values.");
                        ((qd.d) aVar3).e(null);
                        return iVar;
                    }
                    Task d = ((y9.c) dVar.a).d();
                    kotlin.jvm.internal.i.d(d, "firebaseInstallationsApi.id");
                    aVar.a = dVar;
                    aVar.b = aVar3;
                    aVar.e = 2;
                    obj = h7.a(d, aVar);
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
        } catch (Throwable th2) {
            th = th2;
            aVar2 = r42;
        }
        aVar = new a(this, (sc.c) cVar);
        Object obj2 = aVar.c;
        rc.a aVar42 = rc.a.a;
        r42 = aVar.e;
        oc.i iVar2 = oc.i.a;
    }
}
