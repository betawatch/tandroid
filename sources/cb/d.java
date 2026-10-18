package cb;

import android.os.Build;
import android.util.Log;
import be.f0;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import jd.r;
import org.telegram.tgnet.TLObject;
import v7.i8;
import w7.o;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class d {
    public final ra.d a;
    public final androidx.biometric.e b;
    public final k c;
    public final ke.d d = ke.e.a();

    public d(kd.h hVar, ra.d dVar, ab.b bVar, androidx.biometric.e eVar, k1.f fVar) {
        this.a = dVar;
        this.b = eVar;
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
    public final Object c(kd.c cVar) {
        a aVar;
        ?? r42;
        ke.a aVar2;
        ke.a aVar3;
        d dVar;
        String str;
        try {
            if (cVar instanceof a) {
                aVar = (a) cVar;
                int i10 = aVar.e;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    aVar.e = i10 - TLObject.FLAG_31;
                    Object obj = aVar.c;
                    ld.a aVar4 = ld.a.a;
                    r42 = aVar.e;
                    id.i iVar = id.i.a;
                    if (r42 != 0) {
                        i8.b(obj);
                        ke.d dVar2 = this.d;
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
                            aVar2 = (ke.a) aVar.a;
                            try {
                                i8.b(obj);
                                ((ke.d) aVar2).e(null);
                                return iVar;
                            } catch (Throwable th2) {
                                th = th2;
                                ((ke.d) aVar2).e(null);
                                throw th;
                            }
                        }
                        aVar3 = aVar.b;
                        dVar = (d) aVar.a;
                        i8.b(obj);
                        str = (String) obj;
                        if (str != null) {
                            Log.w("SessionConfigFetcher", "Error getting Firebase Installation ID. Skipping this Session Event.");
                            ((ke.d) aVar3).e(null);
                            return iVar;
                        }
                        id.d dVar3 = new id.d("X-Crashlytics-Installation-ID", str);
                        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                        dVar.getClass();
                        id.d dVar4 = new id.d("X-Crashlytics-Device-Model", b(format));
                        String INCREMENTAL = Build.VERSION.INCREMENTAL;
                        kotlin.jvm.internal.i.d(INCREMENTAL, "INCREMENTAL");
                        id.d dVar5 = new id.d("X-Crashlytics-OS-Build-Version", b(INCREMENTAL));
                        String RELEASE = Build.VERSION.RELEASE;
                        kotlin.jvm.internal.i.d(RELEASE, "RELEASE");
                        Map b10 = r.b(dVar3, dVar4, dVar5, new id.d("X-Crashlytics-OS-Display-Version", b(RELEASE)), new id.d("X-Crashlytics-API-Client-Version", "1.2.0"));
                        Log.d("SessionConfigFetcher", "Fetching settings from server.");
                        androidx.biometric.e eVar = dVar.b;
                        b bVar = new b(dVar, null);
                        c cVar2 = new c(2, null);
                        aVar.a = aVar3;
                        aVar.b = null;
                        aVar.e = 3;
                        Object w9 = f0.w((kd.h) eVar.c, new b(eVar, b10, bVar, cVar2, null), aVar);
                        if (w9 != aVar4) {
                            w9 = iVar;
                        }
                        if (w9 != aVar4) {
                            aVar2 = aVar3;
                            ((ke.d) aVar2).e(null);
                            return iVar;
                        }
                        return aVar4;
                    }
                    aVar3 = aVar.b;
                    dVar = (d) aVar.a;
                    i8.b(obj);
                    if (dVar.c.b()) {
                        Log.d("SessionConfigFetcher", "Remote settings cache not expired. Using cached values.");
                        ((ke.d) aVar3).e(null);
                        return iVar;
                    }
                    Task d = ((ra.c) dVar.a).d();
                    kotlin.jvm.internal.i.d(d, "firebaseInstallationsApi.id");
                    aVar.a = dVar;
                    aVar.b = aVar3;
                    aVar.e = 2;
                    obj = o.a(d, aVar);
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
        aVar = new a(this, (md.c) cVar);
        Object obj2 = aVar.c;
        ld.a aVar42 = ld.a.a;
        r42 = aVar.e;
        id.i iVar2 = id.i.a;
    }
}
