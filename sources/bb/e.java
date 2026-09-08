package bb;

import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import hd.r;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import v7.t7;
import v7.u8;
import zd.e0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class e {
    public final qa.d a;
    public final aa.a b;
    public final m c;
    public final ie.d d = ie.e.a();

    public e(id.h hVar, qa.d dVar, za.b bVar, aa.a aVar, k1.f fVar) {
        this.a = dVar;
        this.b = aVar;
        this.c = new m(fVar);
    }

    public static String b(String str) {
        Pattern compile = Pattern.compile("/");
        kotlin.jvm.internal.i.d(compile, "compile(...)");
        String replaceAll = compile.matcher(str).replaceAll("");
        kotlin.jvm.internal.i.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final Boolean a() {
        f fVar = this.c.b;
        if (fVar != null) {
            return fVar.a;
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
    public final Object c(id.c cVar) {
        b bVar;
        ?? r42;
        ie.a aVar;
        ie.a aVar2;
        e eVar;
        String str;
        try {
            if (cVar instanceof b) {
                bVar = (b) cVar;
                int i10 = bVar.e;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    bVar.e = i10 - TLObject.FLAG_31;
                    Object obj = bVar.c;
                    jd.a aVar3 = jd.a.a;
                    r42 = bVar.e;
                    gd.i iVar = gd.i.a;
                    if (r42 != 0) {
                        t7.b(obj);
                        ie.d dVar = this.d;
                        if (!dVar.c() && !this.c.b()) {
                            return iVar;
                        }
                        bVar.a = this;
                        bVar.b = dVar;
                        bVar.e = 1;
                        if (dVar.d(bVar) != aVar3) {
                            aVar2 = dVar;
                            eVar = this;
                        }
                        return aVar3;
                    }
                    if (r42 != 1) {
                        if (r42 != 2) {
                            if (r42 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = (ie.a) bVar.a;
                            try {
                                t7.b(obj);
                                ((ie.d) aVar).e(null);
                                return iVar;
                            } catch (Throwable th2) {
                                th = th2;
                                ((ie.d) aVar).e(null);
                                throw th;
                            }
                        }
                        aVar2 = bVar.b;
                        eVar = (e) bVar.a;
                        t7.b(obj);
                        str = (String) obj;
                        if (str != null) {
                            Log.w("SessionConfigFetcher", "Error getting Firebase Installation ID. Skipping this Session Event.");
                            ((ie.d) aVar2).e(null);
                            return iVar;
                        }
                        gd.d dVar2 = new gd.d("X-Crashlytics-Installation-ID", str);
                        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                        eVar.getClass();
                        gd.d dVar3 = new gd.d("X-Crashlytics-Device-Model", b(format));
                        String INCREMENTAL = Build.VERSION.INCREMENTAL;
                        kotlin.jvm.internal.i.d(INCREMENTAL, "INCREMENTAL");
                        gd.d dVar4 = new gd.d("X-Crashlytics-OS-Build-Version", b(INCREMENTAL));
                        String RELEASE = Build.VERSION.RELEASE;
                        kotlin.jvm.internal.i.d(RELEASE, "RELEASE");
                        Map b10 = r.b(dVar2, dVar3, dVar4, new gd.d("X-Crashlytics-OS-Display-Version", b(RELEASE)), new gd.d("X-Crashlytics-API-Client-Version", "1.2.0"));
                        Log.d("SessionConfigFetcher", "Fetching settings from server.");
                        aa.a aVar4 = eVar.b;
                        c cVar2 = new c(eVar, null);
                        d dVar5 = new d(2, null);
                        bVar.a = aVar2;
                        bVar.b = null;
                        bVar.e = 3;
                        Object w10 = e0.w((id.h) aVar4.d, new c(aVar4, b10, cVar2, dVar5, null), bVar);
                        if (w10 != aVar3) {
                            w10 = iVar;
                        }
                        if (w10 != aVar3) {
                            aVar = aVar2;
                            ((ie.d) aVar).e(null);
                            return iVar;
                        }
                        return aVar3;
                    }
                    aVar2 = bVar.b;
                    eVar = (e) bVar.a;
                    t7.b(obj);
                    if (eVar.c.b()) {
                        Log.d("SessionConfigFetcher", "Remote settings cache not expired. Using cached values.");
                        ((ie.d) aVar2).e(null);
                        return iVar;
                    }
                    Task d = ((qa.c) eVar.a).d();
                    kotlin.jvm.internal.i.d(d, "firebaseInstallationsApi.id");
                    bVar.a = eVar;
                    bVar.b = aVar2;
                    bVar.e = 2;
                    obj = u8.a(d, bVar);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    str = (String) obj;
                    if (str != null) {
                    }
                }
            }
            if (r42 != 0) {
            }
            if (eVar.c.b()) {
            }
        } catch (Throwable th3) {
            th = th3;
            aVar = r42;
        }
        bVar = new b(this, (kd.c) cVar);
        Object obj2 = bVar.c;
        jd.a aVar32 = jd.a.a;
        r42 = bVar.e;
        gd.i iVar2 = gd.i.a;
    }
}
