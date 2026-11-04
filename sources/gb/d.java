package gb;

import android.os.Build;
import android.util.Log;
import b8.ib;
import db.i1;
import db.t;
import db.w;
import ed.s;
import java.util.Map;
import org.telegram.tgnet.TLObject;
import wd.b0;
import x7.m5;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d implements q {
    public static final int g;
    public static final ud.c h;
    public final i1 a;
    public final ua.e b;
    public final db.b c;
    public final f d;
    public final p e;
    public final fe.d f;

    static {
        int i3 = vd.a.d;
        g = (int) vd.a.d(m5.c(24, vd.c.f), vd.c.d);
        h = new ud.c("com/google/firebase/sessions//");
    }

    public d(i1 timeProvider, ua.e firebaseInstallationsApi, db.b appInfo, f configsFetcher, p settingsCache) {
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
        this.f = new fe.d();
    }

    public static String e(String input) {
        ud.c cVar = h;
        cVar.getClass();
        kotlin.jvm.internal.j.e(input, "input");
        String replaceAll = cVar.a.matcher(input).replaceAll("");
        kotlin.jvm.internal.j.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #1 {all -> 0x004e, blocks: (B:25:0x004a, B:26:0x0098, B:28:0x00a4, B:31:0x00af, B:38:0x0077, B:40:0x007d, B:43:0x0088), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af A[Catch: all -> 0x004e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x004e, blocks: (B:25:0x004a, B:26:0x0098, B:28:0x00a4, B:31:0x00af, B:38:0x0077, B:40:0x007d, B:43:0x0088), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #1 {all -> 0x004e, blocks: (B:25:0x004a, B:26:0x0098, B:28:0x00a4, B:31:0x00af, B:38:0x0077, B:40:0x007d, B:43:0x0088), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0088 A[Catch: all -> 0x004e, TRY_ENTER, TryCatch #1 {all -> 0x004e, blocks: (B:25:0x004a, B:26:0x0098, B:28:0x00a4, B:31:0x00af, B:38:0x0077, B:40:0x007d, B:43:0x0088), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    @Override // gb.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(fd.c cVar) {
        b bVar;
        ?? r42;
        p pVar;
        fe.a aVar;
        fe.a aVar2;
        String str;
        try {
            if (cVar instanceof b) {
                bVar = (b) cVar;
                int i3 = bVar.d;
                if ((i3 & TLObject.FLAG_31) != 0) {
                    bVar.d = i3 - TLObject.FLAG_31;
                    Object obj = bVar.b;
                    gd.a aVar3 = gd.a.a;
                    r42 = bVar.d;
                    pVar = this.e;
                    dd.k kVar = dd.k.a;
                    fd.c cVar2 = null;
                    if (r42 != 0) {
                        ib.b(obj);
                        fe.d dVar = this.f;
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
                                ib.b(obj);
                                ((fe.d) aVar).f(null);
                                return kVar;
                            } catch (Throwable th2) {
                                th = th2;
                                ((fe.d) aVar).f(null);
                                throw th;
                            }
                        }
                        aVar2 = bVar.a;
                        ib.b(obj);
                        str = ((w) obj).a;
                        if (!str.equals("")) {
                            Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                            ((fe.d) aVar2).f(null);
                            return kVar;
                        }
                        dd.e eVar = new dd.e("X-Crashlytics-Installation-ID", str);
                        dd.e eVar2 = new dd.e("X-Crashlytics-Device-Model", e(Build.MANUFACTURER + Build.MODEL));
                        String INCREMENTAL = Build.VERSION.INCREMENTAL;
                        kotlin.jvm.internal.j.d(INCREMENTAL, "INCREMENTAL");
                        dd.e eVar3 = new dd.e("X-Crashlytics-OS-Build-Version", e(INCREMENTAL));
                        String RELEASE = Build.VERSION.RELEASE;
                        kotlin.jvm.internal.j.d(RELEASE, "RELEASE");
                        dd.e eVar4 = new dd.e("X-Crashlytics-OS-Display-Version", e(RELEASE));
                        this.c.getClass();
                        Map d = s.d(eVar, eVar2, eVar3, eVar4, new dd.e("X-Crashlytics-API-Client-Version", "3.0.8"));
                        Log.d("FirebaseSessions", "Fetching settings from server.");
                        f fVar = this.d;
                        ae.d dVar2 = new ae.d(this, cVar2, 5);
                        c cVar3 = new c(2, null, 0);
                        bVar.a = aVar2;
                        bVar.d = 3;
                        Object y9 = b0.y(fVar.b, new e(fVar, d, dVar2, cVar3, null), bVar);
                        if (y9 != aVar3) {
                            y9 = kVar;
                        }
                        if (y9 != aVar3) {
                            aVar = aVar2;
                            ((fe.d) aVar).f(null);
                            return kVar;
                        }
                        return aVar3;
                    }
                    aVar2 = bVar.a;
                    ib.b(obj);
                    if (pVar.b()) {
                        Log.d("FirebaseSessions", "Remote settings cache not expired. Using cached values.");
                        ((fe.d) aVar2).f(null);
                        return kVar;
                    }
                    t tVar = w.c;
                    ua.e eVar5 = this.b;
                    bVar.a = aVar2;
                    bVar.d = 2;
                    obj = tVar.a(eVar5, bVar);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    str = ((w) obj).a;
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
        bVar = new b(this, (hd.c) cVar);
        Object obj2 = bVar.b;
        gd.a aVar32 = gd.a.a;
        r42 = bVar.d;
        pVar = this.e;
        dd.k kVar2 = dd.k.a;
        fd.c cVar22 = null;
    }

    @Override // gb.q
    public final Boolean b() {
        return this.e.a().a;
    }

    @Override // gb.q
    public final vd.a c() {
        Integer num = this.e.a().c;
        if (num == null) {
            return null;
        }
        int i3 = vd.a.d;
        return new vd.a(m5.c(num.intValue(), vd.c.d));
    }

    @Override // gb.q
    public final Double d() {
        return this.e.a().b;
    }
}
