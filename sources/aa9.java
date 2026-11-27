// default package

import android.os.Build;
import android.util.Log;
import java.util.Map;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class aa9 implements bca {
    public static final int g;
    public static final u89 h;
    public final srb a;
    public final ri4 b;
    public final tr c;
    public final ca9 d;
    public final yba e;
    public final xj7 f;

    static {
        int i = bs3.d;
        g = (int) bs3.d(mje.c(24, fs3.f), fs3.d);
        h = new u89("com/google/firebase/sessions//");
    }

    public aa9(srb srbVar, ri4 ri4Var, tr trVar, ca9 ca9Var, yba ybaVar) {
        srbVar.getClass();
        ri4Var.getClass();
        trVar.getClass();
        ca9Var.getClass();
        ybaVar.getClass();
        this.a = srbVar;
        this.b = ri4Var;
        this.c = trVar;
        this.d = ca9Var;
        this.e = ybaVar;
        this.f = new xj7();
    }

    public static String e(String str) {
        u89 u89Var = h;
        u89Var.getClass();
        String replaceAll = u89Var.a.matcher(str).replaceAll("");
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
    @Override // bca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zw2 zw2Var) {
        z99 z99Var;
        int i;
        yba ybaVar;
        xj7 xj7Var;
        xj7 xj7Var2;
        xj7 xj7Var3;
        String str;
        if (zw2Var instanceof z99) {
            z99Var = (z99) zw2Var;
            int i2 = z99Var.d;
            if ((i2 & TLObject.FLAG_31) != 0) {
                z99Var.d = i2 - TLObject.FLAG_31;
                Object obj = z99Var.b;
                i = z99Var.d;
                ybaVar = this.e;
                g9c g9cVar = g9c.a;
                zw2 zw2Var2 = null;
                vx2 vx2Var = vx2.a;
                if (i != 0) {
                    ixe.b(obj);
                    xj7Var = this.f;
                    if (!xj7Var.c() && !ybaVar.b()) {
                        return g9cVar;
                    }
                    z99Var.a = xj7Var;
                    z99Var.d = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            xj7Var3 = z99Var.a;
                            try {
                                ixe.b(obj);
                                str = ((oq5) obj).a;
                                if (!str.equals("")) {
                                    Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                                    xj7Var3.f(null);
                                    return g9cVar;
                                }
                                rx7 rx7Var = new rx7("X-Crashlytics-Installation-ID", str);
                                rx7 rx7Var2 = new rx7("X-Crashlytics-Device-Model", e(Build.MANUFACTURER + Build.MODEL));
                                String str2 = Build.VERSION.INCREMENTAL;
                                str2.getClass();
                                rx7 rx7Var3 = new rx7("X-Crashlytics-OS-Build-Version", e(str2));
                                String str3 = Build.VERSION.RELEASE;
                                str3.getClass();
                                rx7 rx7Var4 = new rx7("X-Crashlytics-OS-Display-Version", e(str3));
                                this.c.getClass();
                                Map c = uk6.c(rx7Var, rx7Var2, rx7Var3, rx7Var4, new rx7("X-Crashlytics-API-Client-Version", "3.0.8"));
                                Log.d("FirebaseSessions", "Fetching settings from server.");
                                ca9 ca9Var = this.d;
                                ii1 ii1Var = new ii1(this, zw2Var2, (byte) 7);
                                v73 v73Var = new v73(2, null, (byte) 1);
                                z99Var.a = xj7Var3;
                                z99Var.d = 3;
                                Object c2 = fud.c(ca9Var.b, new ba9(ca9Var, c, ii1Var, v73Var, null), z99Var);
                                if (c2 != vx2Var) {
                                    c2 = g9cVar;
                                }
                                if (c2 != vx2Var) {
                                    xj7Var2 = xj7Var3;
                                    xj7Var2.f(null);
                                    return g9cVar;
                                }
                                return vx2Var;
                            } catch (Throwable th) {
                                th = th;
                                xj7Var2 = xj7Var3;
                            }
                        } else {
                            if (i != 3) {
                                grb.i("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            xj7Var2 = z99Var.a;
                            try {
                                ixe.b(obj);
                                xj7Var2.f(null);
                                return g9cVar;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        xj7Var2.f(null);
                        throw th;
                    }
                    xj7 xj7Var4 = z99Var.a;
                    ixe.b(obj);
                    xj7Var = xj7Var4;
                }
                if (ybaVar.b()) {
                    Log.d("FirebaseSessions", "Remote settings cache not expired. Using cached values.");
                    xj7Var.f(null);
                    return g9cVar;
                }
                sjf sjfVar = oq5.c;
                ri4 ri4Var = this.b;
                z99Var.a = xj7Var;
                z99Var.d = 2;
                Object B = sjfVar.B(ri4Var, z99Var);
                if (B != vx2Var) {
                    xj7Var3 = xj7Var;
                    obj = B;
                    str = ((oq5) obj).a;
                    if (!str.equals("")) {
                    }
                }
                return vx2Var;
            }
        }
        z99Var = new z99(this, (ax2) zw2Var);
        Object obj2 = z99Var.b;
        i = z99Var.d;
        ybaVar = this.e;
        g9c g9cVar2 = g9c.a;
        zw2 zw2Var22 = null;
        vx2 vx2Var2 = vx2.a;
        if (i != 0) {
        }
        if (ybaVar.b()) {
        }
    }

    @Override // bca
    public final Boolean b() {
        return this.e.a().a;
    }

    @Override // bca
    public final bs3 c() {
        Integer num = this.e.a().c;
        if (num == null) {
            return null;
        }
        int i = bs3.d;
        return new bs3(mje.c(num.intValue(), fs3.d));
    }

    @Override // bca
    public final Double d() {
        return this.e.a().b;
    }
}
