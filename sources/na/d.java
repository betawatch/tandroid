package na;

import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import k7.h8;
import k7.p7;
import l7.w0;
import ld.e0;
import org.telegram.tgnet.TLObject;
import tc.r;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class d {
    public final ca.d a;
    public final w0 b;
    public final k c;
    public final ud.d d = ud.e.a();

    public d(uc.h hVar, ca.d dVar, la.b bVar, w0 w0Var, k1.g gVar) {
        this.a = dVar;
        this.b = w0Var;
        this.c = new k(gVar);
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
    public final Object c(uc.c cVar) {
        a aVar;
        ?? r42;
        ud.a aVar2;
        ud.a aVar3;
        d dVar;
        String str;
        try {
            if (cVar instanceof a) {
                aVar = (a) cVar;
                int i10 = aVar.e;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    aVar.e = i10 - TLObject.FLAG_31;
                    Object obj = aVar.c;
                    vc.a aVar4 = vc.a.a;
                    r42 = aVar.e;
                    sc.i iVar = sc.i.a;
                    if (r42 != 0) {
                        p7.b(obj);
                        ud.d dVar2 = this.d;
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
                            aVar2 = (ud.a) aVar.a;
                            try {
                                p7.b(obj);
                                ((ud.d) aVar2).e(null);
                                return iVar;
                            } catch (Throwable th2) {
                                th = th2;
                                ((ud.d) aVar2).e(null);
                                throw th;
                            }
                        }
                        aVar3 = aVar.b;
                        dVar = (d) aVar.a;
                        p7.b(obj);
                        str = (String) obj;
                        if (str != null) {
                            Log.w("SessionConfigFetcher", "Error getting Firebase Installation ID. Skipping this Session Event.");
                            ((ud.d) aVar3).e(null);
                            return iVar;
                        }
                        sc.d dVar3 = new sc.d("X-Crashlytics-Installation-ID", str);
                        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                        dVar.getClass();
                        sc.d dVar4 = new sc.d("X-Crashlytics-Device-Model", b(format));
                        String INCREMENTAL = Build.VERSION.INCREMENTAL;
                        kotlin.jvm.internal.j.d(INCREMENTAL, "INCREMENTAL");
                        sc.d dVar5 = new sc.d("X-Crashlytics-OS-Build-Version", b(INCREMENTAL));
                        String RELEASE = Build.VERSION.RELEASE;
                        kotlin.jvm.internal.j.d(RELEASE, "RELEASE");
                        Map b10 = r.b(dVar3, dVar4, dVar5, new sc.d("X-Crashlytics-OS-Display-Version", b(RELEASE)), new sc.d("X-Crashlytics-API-Client-Version", "1.2.0"));
                        Log.d("SessionConfigFetcher", "Fetching settings from server.");
                        w0 w0Var = dVar.b;
                        b bVar = new b(dVar, null);
                        c cVar2 = new c(2, null);
                        aVar.a = aVar3;
                        aVar.b = null;
                        aVar.e = 3;
                        Object w10 = e0.w((uc.h) w0Var.c, new b(w0Var, b10, bVar, cVar2, null), aVar);
                        if (w10 != aVar4) {
                            w10 = iVar;
                        }
                        if (w10 != aVar4) {
                            aVar2 = aVar3;
                            ((ud.d) aVar2).e(null);
                            return iVar;
                        }
                        return aVar4;
                    }
                    aVar3 = aVar.b;
                    dVar = (d) aVar.a;
                    p7.b(obj);
                    if (dVar.c.b()) {
                        Log.d("SessionConfigFetcher", "Remote settings cache not expired. Using cached values.");
                        ((ud.d) aVar3).e(null);
                        return iVar;
                    }
                    Task d = ((ca.c) dVar.a).d();
                    kotlin.jvm.internal.j.d(d, "firebaseInstallationsApi.id");
                    aVar.a = dVar;
                    aVar.b = aVar3;
                    aVar.e = 2;
                    obj = h8.a(d, aVar);
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
        aVar = new a(this, (wc.c) cVar);
        Object obj2 = aVar.c;
        vc.a aVar42 = vc.a.a;
        r42 = aVar.e;
        sc.i iVar2 = sc.i.a;
    }
}
