// default package

import android.os.Build;
import android.util.Log;
import java.util.Map;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class n69 implements k8a {
    public static final int g;
    public static final h59 h;
    public final snb a;
    public final rg4 b;
    public final sr c;
    public final p69 d;
    public final h8a e;
    public final nh7 f;

    static {
        int i = jr3.d;
        g = (int) jr3.d(vee.c(24, nr3.f), nr3.d);
        h = new h59("com/google/firebase/sessions//");
    }

    public n69(snb snbVar, rg4 rg4Var, sr srVar, p69 p69Var, h8a h8aVar) {
        snbVar.getClass();
        rg4Var.getClass();
        srVar.getClass();
        p69Var.getClass();
        h8aVar.getClass();
        this.a = snbVar;
        this.b = rg4Var;
        this.c = srVar;
        this.d = p69Var;
        this.e = h8aVar;
        this.f = new nh7();
    }

    public static String e(String str) {
        h59 h59Var = h;
        h59Var.getClass();
        String replaceAll = h59Var.a.matcher(str).replaceAll("");
        replaceAll.getClass();
        return replaceAll;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|(1:(3:(1:(5:11|12|13|14|15)(2:21|22))(5:23|24|25|26|(3:28|29|30)(4:31|(1:33)|(3:36|14|15)|35))|19|20)(1:39))(2:51|(1:56)(1:55))|40|41|(3:43|44|45)(3:46|(3:48|26|(0)(0))|35)))|58|6|(0)(0)|40|41|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0144, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0145, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006d, code lost:
    
        if (r1.d(r2) != r11) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d A[Catch: all -> 0x0142, TRY_LEAVE, TryCatch #0 {all -> 0x0142, blocks: (B:25:0x0048, B:26:0x0091, B:28:0x009d, B:31:0x00a6), top: B:24:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6 A[Catch: all -> 0x0142, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0142, blocks: (B:25:0x0048, B:26:0x0091, B:28:0x009d, B:31:0x00a6), top: B:24:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075 A[Catch: all -> 0x0144, TRY_LEAVE, TryCatch #1 {all -> 0x0144, blocks: (B:41:0x006f, B:43:0x0075, B:46:0x007e), top: B:40:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e A[Catch: all -> 0x0144, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0144, blocks: (B:41:0x006f, B:43:0x0075, B:46:0x007e), top: B:40:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    @Override // k8a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(fw2 fw2Var) {
        m69 m69Var;
        int i;
        h8a h8aVar;
        nh7 nh7Var;
        nh7 nh7Var2;
        nh7 nh7Var3;
        String str;
        if (fw2Var instanceof m69) {
            m69Var = (m69) fw2Var;
            int i2 = m69Var.d;
            if ((i2 & TLObject.FLAG_31) != 0) {
                m69Var.d = i2 - TLObject.FLAG_31;
                Object obj = m69Var.b;
                i = m69Var.d;
                h8aVar = this.e;
                g5c g5cVar = g5c.a;
                fw2 fw2Var2 = null;
                bx2 bx2Var = bx2.a;
                if (i != 0) {
                    qse.b(obj);
                    nh7Var = this.f;
                    if (!nh7Var.c() && !h8aVar.b()) {
                        return g5cVar;
                    }
                    m69Var.a = nh7Var;
                    m69Var.d = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            nh7Var3 = m69Var.a;
                            try {
                                qse.b(obj);
                                str = ((ko5) obj).a;
                                if (!str.equals("")) {
                                    Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                                    nh7Var3.f(null);
                                    return g5cVar;
                                }
                                ku7 ku7Var = new ku7("X-Crashlytics-Installation-ID", str);
                                ku7 ku7Var2 = new ku7("X-Crashlytics-Device-Model", e(Build.MANUFACTURER + Build.MODEL));
                                String str2 = Build.VERSION.INCREMENTAL;
                                str2.getClass();
                                ku7 ku7Var3 = new ku7("X-Crashlytics-OS-Build-Version", e(str2));
                                String str3 = Build.VERSION.RELEASE;
                                str3.getClass();
                                ku7 ku7Var4 = new ku7("X-Crashlytics-OS-Display-Version", e(str3));
                                this.c.getClass();
                                Map c = qi6.c(ku7Var, ku7Var2, ku7Var3, ku7Var4, new ku7("X-Crashlytics-API-Client-Version", "3.0.8"));
                                Log.d("FirebaseSessions", "Fetching settings from server.");
                                p69 p69Var = this.d;
                                ai1 ai1Var = new ai1(this, fw2Var2, (byte) 7);
                                c73 c73Var = new c73(2, null, (byte) 1);
                                m69Var.a = nh7Var3;
                                m69Var.d = 3;
                                Object c2 = ppd.c(p69Var.b, new o69(p69Var, c, ai1Var, c73Var, null), m69Var);
                                if (c2 != bx2Var) {
                                    c2 = g5cVar;
                                }
                                if (c2 != bx2Var) {
                                    nh7Var2 = nh7Var3;
                                    nh7Var2.f(null);
                                    return g5cVar;
                                }
                                return bx2Var;
                            } catch (Throwable th) {
                                th = th;
                                nh7Var2 = nh7Var3;
                            }
                        } else {
                            if (i != 3) {
                                sc8.j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            nh7Var2 = m69Var.a;
                            try {
                                qse.b(obj);
                                nh7Var2.f(null);
                                return g5cVar;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        nh7Var2.f(null);
                        throw th;
                    }
                    nh7 nh7Var4 = m69Var.a;
                    qse.b(obj);
                    nh7Var = nh7Var4;
                }
                if (h8aVar.b()) {
                    Log.d("FirebaseSessions", "Remote settings cache not expired. Using cached values.");
                    nh7Var.f(null);
                    return g5cVar;
                }
                cff cffVar = ko5.c;
                rg4 rg4Var = this.b;
                m69Var.a = nh7Var;
                m69Var.d = 2;
                Object A = cffVar.A(rg4Var, m69Var);
                if (A != bx2Var) {
                    nh7Var3 = nh7Var;
                    obj = A;
                    str = ((ko5) obj).a;
                    if (!str.equals("")) {
                    }
                }
                return bx2Var;
            }
        }
        m69Var = new m69(this, (gw2) fw2Var);
        Object obj2 = m69Var.b;
        i = m69Var.d;
        h8aVar = this.e;
        g5c g5cVar2 = g5c.a;
        fw2 fw2Var22 = null;
        bx2 bx2Var2 = bx2.a;
        if (i != 0) {
        }
        if (h8aVar.b()) {
        }
    }

    @Override // k8a
    public final Boolean b() {
        return this.e.a().a;
    }

    @Override // k8a
    public final jr3 c() {
        Integer num = this.e.a().c;
        if (num == null) {
            return null;
        }
        int i = jr3.d;
        return new jr3(vee.c(num.intValue(), nr3.d));
    }

    @Override // k8a
    public final Double d() {
        return this.e.a().b;
    }
}
