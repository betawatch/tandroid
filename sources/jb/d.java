package jb;

import android.os.Build;
import android.util.Log;
import c8.zd;
import gb.j1;
import gb.u;
import gb.x;
import hd.r;
import java.util.Map;
import org.telegram.tgnet.TLObject;
import zd.b0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class d implements q {
    public static final int g;
    public static final xd.c h;
    public final j1 a;
    public final va.d b;
    public final gb.b c;
    public final f d;
    public final p e;
    public final ie.d f;

    static {
        int i7 = yd.a.d;
        g = (int) yd.a.d(zd.c(24, yd.c.f), yd.c.d);
        h = new xd.c("com/google/firebase/sessions//");
    }

    public d(j1 timeProvider, va.d firebaseInstallationsApi, gb.b appInfo, f configsFetcher, p settingsCache) {
        kotlin.jvm.internal.j.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.e(firebaseInstallationsApi, "firebaseInstallationsApi");
        kotlin.jvm.internal.j.e(appInfo, "appInfo");
        kotlin.jvm.internal.j.e(configsFetcher, "configsFetcher");
        kotlin.jvm.internal.j.e(settingsCache, "settingsCache");
        this.a = timeProvider;
        this.b = firebaseInstallationsApi;
        this.c = appInfo;
        this.d = configsFetcher;
        this.e = settingsCache;
        this.f = new ie.d();
    }

    public static String e(String input) {
        xd.c cVar = h;
        cVar.getClass();
        kotlin.jvm.internal.j.e(input, "input");
        String replaceAll = cVar.a.matcher(input).replaceAll("");
        kotlin.jvm.internal.j.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    @Override // jb.q
    public final Boolean a() {
        return this.e.a().a;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #1 {all -> 0x004e, blocks: (B:25:0x004a, B:26:0x0098, B:28:0x00a4, B:31:0x00af, B:38:0x0077, B:40:0x007d, B:43:0x0088), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af A[Catch: all -> 0x004e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x004e, blocks: (B:25:0x004a, B:26:0x0098, B:28:0x00a4, B:31:0x00af, B:38:0x0077, B:40:0x007d, B:43:0x0088), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #1 {all -> 0x004e, blocks: (B:25:0x004a, B:26:0x0098, B:28:0x00a4, B:31:0x00af, B:38:0x0077, B:40:0x007d, B:43:0x0088), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0088 A[Catch: all -> 0x004e, TRY_ENTER, TryCatch #1 {all -> 0x004e, blocks: (B:25:0x004a, B:26:0x0098, B:28:0x00a4, B:31:0x00af, B:38:0x0077, B:40:0x007d, B:43:0x0088), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    @Override // jb.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(id.c cVar) {
        b bVar;
        ?? r42;
        p pVar;
        ie.a aVar;
        ie.a aVar2;
        String str;
        try {
            if (cVar instanceof b) {
                bVar = (b) cVar;
                int i7 = bVar.d;
                if ((i7 & TLObject.FLAG_31) != 0) {
                    bVar.d = i7 - TLObject.FLAG_31;
                    Object obj = bVar.b;
                    jd.a aVar3 = jd.a.a;
                    r42 = bVar.d;
                    pVar = this.e;
                    gd.k kVar = gd.k.a;
                    id.c cVar2 = null;
                    if (r42 != 0) {
                        af.b.c(obj);
                        ie.d dVar = this.f;
                        if (!dVar.c() && !pVar.b()) {
                            return kVar;
                        }
                        bVar.a = dVar;
                        bVar.d = 1;
                        if (dVar.d(bVar) != aVar3) {
                            aVar2 = dVar;
                        }
                        return aVar3;
                    }
                    if (r42 != 1) {
                        if (r42 != 2) {
                            if (r42 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = bVar.a;
                            try {
                                af.b.c(obj);
                                ((ie.d) aVar).f(null);
                                return kVar;
                            } catch (Throwable th2) {
                                th = th2;
                                ((ie.d) aVar).f(null);
                                throw th;
                            }
                        }
                        aVar2 = bVar.a;
                        af.b.c(obj);
                        str = ((x) obj).a;
                        if (!str.equals("")) {
                            Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                            ((ie.d) aVar2).f(null);
                            return kVar;
                        }
                        gd.e eVar = new gd.e("X-Crashlytics-Installation-ID", str);
                        gd.e eVar2 = new gd.e("X-Crashlytics-Device-Model", e(Build.MANUFACTURER + Build.MODEL));
                        String INCREMENTAL = Build.VERSION.INCREMENTAL;
                        kotlin.jvm.internal.j.d(INCREMENTAL, "INCREMENTAL");
                        gd.e eVar3 = new gd.e("X-Crashlytics-OS-Build-Version", e(INCREMENTAL));
                        String RELEASE = Build.VERSION.RELEASE;
                        kotlin.jvm.internal.j.d(RELEASE, "RELEASE");
                        gd.e eVar4 = new gd.e("X-Crashlytics-OS-Display-Version", e(RELEASE));
                        this.c.getClass();
                        Map d = r.d(eVar, eVar2, eVar3, eVar4, new gd.e("X-Crashlytics-API-Client-Version", "3.0.8"));
                        Log.d("FirebaseSessions", "Fetching settings from server.");
                        f fVar = this.d;
                        be.l lVar = new be.l(this, cVar2, 6);
                        c cVar3 = new c(2, null, 0);
                        bVar.a = aVar2;
                        bVar.d = 3;
                        Object y10 = b0.y(fVar.b, new e(fVar, d, lVar, cVar3, null), bVar);
                        if (y10 != aVar3) {
                            y10 = kVar;
                        }
                        if (y10 != aVar3) {
                            aVar = aVar2;
                            ((ie.d) aVar).f(null);
                            return kVar;
                        }
                        return aVar3;
                    }
                    aVar2 = bVar.a;
                    af.b.c(obj);
                    if (pVar.b()) {
                        Log.d("FirebaseSessions", "Remote settings cache not expired. Using cached values.");
                        ((ie.d) aVar2).f(null);
                        return kVar;
                    }
                    u uVar = x.c;
                    va.d dVar2 = this.b;
                    bVar.a = aVar2;
                    bVar.d = 2;
                    obj = uVar.a(dVar2, bVar);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    str = ((x) obj).a;
                    if (!str.equals("")) {
                    }
                }
            }
            if (r42 != 0) {
            }
            if (pVar.b()) {
            }
        } catch (Throwable th3) {
            th = th3;
            aVar = r42;
        }
        bVar = new b(this, (kd.c) cVar);
        Object obj2 = bVar.b;
        jd.a aVar32 = jd.a.a;
        r42 = bVar.d;
        pVar = this.e;
        gd.k kVar2 = gd.k.a;
        id.c cVar22 = null;
    }

    @Override // jb.q
    public final yd.a c() {
        Integer num = this.e.a().c;
        if (num == null) {
            return null;
        }
        int i7 = yd.a.d;
        return new yd.a(zd.c(num.intValue(), yd.c.d));
    }

    @Override // jb.q
    public final Double d() {
        return this.e.a().b;
    }
}
