package la;

import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import i7.c7;
import i7.w7;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import jd.e0;
import l3.g0;
import org.telegram.tgnet.TLObject;
import rc.r;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d {
    public final aa.d a;
    public final g0 b;
    public final k c;
    public final sd.d d = sd.e.a();

    public d(sc.h hVar, aa.d dVar, ja.b bVar, g0 g0Var, k1.f fVar) {
        this.a = dVar;
        this.b = g0Var;
        this.c = new k(fVar);
    }

    public static String b(String str) {
        Pattern compile = Pattern.compile("/");
        kotlin.jvm.internal.j.d(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll("");
        kotlin.jvm.internal.j.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final Boolean a() {
        e eVar = this.c.b;
        if (eVar != null) {
            return eVar.a;
        }
        kotlin.jvm.internal.j.h("sessionConfigs");
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
    public final Object c(sc.c cVar) {
        a aVar;
        ?? r42;
        sd.a aVar2;
        sd.a aVar3;
        d dVar;
        String str;
        try {
            if (cVar instanceof a) {
                aVar = (a) cVar;
                int i10 = aVar.e;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    aVar.e = i10 - TLObject.FLAG_31;
                    Object obj = aVar.c;
                    tc.a aVar4 = tc.a.a;
                    r42 = aVar.e;
                    qc.i iVar = qc.i.a;
                    if (r42 != 0) {
                        c7.b(obj);
                        sd.d dVar2 = this.d;
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
                            aVar2 = (sd.a) aVar.a;
                            try {
                                c7.b(obj);
                                ((sd.d) aVar2).e(null);
                                return iVar;
                            } catch (Throwable th2) {
                                th = th2;
                                ((sd.d) aVar2).e(null);
                                throw th;
                            }
                        }
                        aVar3 = aVar.b;
                        dVar = (d) aVar.a;
                        c7.b(obj);
                        str = (String) obj;
                        if (str != null) {
                            Log.w("SessionConfigFetcher", "Error getting Firebase Installation ID. Skipping this Session Event.");
                            ((sd.d) aVar3).e(null);
                            return iVar;
                        }
                        qc.d dVar3 = new qc.d("X-Crashlytics-Installation-ID", str);
                        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                        dVar.getClass();
                        qc.d dVar4 = new qc.d("X-Crashlytics-Device-Model", b(format));
                        String INCREMENTAL = Build.VERSION.INCREMENTAL;
                        kotlin.jvm.internal.j.d(INCREMENTAL, "INCREMENTAL");
                        qc.d dVar5 = new qc.d("X-Crashlytics-OS-Build-Version", b(INCREMENTAL));
                        String RELEASE = Build.VERSION.RELEASE;
                        kotlin.jvm.internal.j.d(RELEASE, "RELEASE");
                        Map b10 = r.b(dVar3, dVar4, dVar5, new qc.d("X-Crashlytics-OS-Display-Version", b(RELEASE)), new qc.d("X-Crashlytics-API-Client-Version", "1.2.0"));
                        Log.d("SessionConfigFetcher", "Fetching settings from server.");
                        g0 g0Var = dVar.b;
                        b bVar = new b(dVar, null);
                        c cVar2 = new c(2, null);
                        aVar.a = aVar3;
                        aVar.b = null;
                        aVar.e = 3;
                        Object w10 = e0.w((sc.h) g0Var.c, new b(g0Var, b10, bVar, cVar2, null), aVar);
                        if (w10 != aVar4) {
                            w10 = iVar;
                        }
                        if (w10 != aVar4) {
                            aVar2 = aVar3;
                            ((sd.d) aVar2).e(null);
                            return iVar;
                        }
                        return aVar4;
                    }
                    aVar3 = aVar.b;
                    dVar = (d) aVar.a;
                    c7.b(obj);
                    if (dVar.c.b()) {
                        Log.d("SessionConfigFetcher", "Remote settings cache not expired. Using cached values.");
                        ((sd.d) aVar3).e(null);
                        return iVar;
                    }
                    Task d = ((aa.c) dVar.a).d();
                    kotlin.jvm.internal.j.d(d, "firebaseInstallationsApi.id");
                    aVar.a = dVar;
                    aVar.b = aVar3;
                    aVar.e = 2;
                    obj = w7.a(d, aVar);
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
        aVar = new a(this, (uc.c) cVar);
        Object obj2 = aVar.c;
        tc.a aVar42 = tc.a.a;
        r42 = aVar.e;
        qc.i iVar2 = qc.i.a;
    }
}
