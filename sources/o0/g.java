package o0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import f7.j8;
import f7.r8;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class g {
    public static final a0.j a = new a0.j(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final a0.k d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new k());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new a0.k(0);
    }

    public static String a(int i9, List list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(((d) list.get(i10)).e);
            sb2.append("-");
            sb2.append(i9);
            if (i10 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e A[Catch: all -> 0x00b5, TRY_LEAVE, TryCatch #1 {all -> 0x00b5, all -> 0x0074, all -> 0x00a6, NameNotFoundException -> 0x00ab, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x004e, B:19:0x0057, B:21:0x005d, B:23:0x0063, B:26:0x0070, B:28:0x0091, B:31:0x009d, B:36:0x0075, B:37:0x0078, B:38:0x0079, B:41:0x008c, B:44:0x00a7, B:45:0x00aa, B:47:0x002b, B:49:0x0033, B:52:0x0037, B:54:0x003b, B:56:0x0046, B:65:0x00ab, B:25:0x006a, B:40:0x0086), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[Catch: all -> 0x00b5, TRY_ENTER, TryCatch #1 {all -> 0x00b5, all -> 0x0074, all -> 0x00a6, NameNotFoundException -> 0x00ab, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x004e, B:19:0x0057, B:21:0x005d, B:23:0x0063, B:26:0x0070, B:28:0x0091, B:31:0x009d, B:36:0x0075, B:37:0x0078, B:38:0x0079, B:41:0x008c, B:44:0x00a7, B:45:0x00aa, B:47:0x002b, B:49:0x0033, B:52:0x0037, B:54:0x003b, B:56:0x0046, B:65:0x00ab, B:25:0x006a, B:40:0x0086), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091 A[Catch: all -> 0x00b5, TRY_LEAVE, TryCatch #1 {all -> 0x00b5, all -> 0x0074, all -> 0x00a6, NameNotFoundException -> 0x00ab, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x004e, B:19:0x0057, B:21:0x005d, B:23:0x0063, B:26:0x0070, B:28:0x0091, B:31:0x009d, B:36:0x0075, B:37:0x0078, B:38:0x0079, B:41:0x008c, B:44:0x00a7, B:45:0x00aa, B:47:0x002b, B:49:0x0033, B:52:0x0037, B:54:0x003b, B:56:0x0046, B:65:0x00ab, B:25:0x006a, B:40:0x0086), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d A[Catch: all -> 0x00b5, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00b5, all -> 0x0074, all -> 0x00a6, NameNotFoundException -> 0x00ab, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x004e, B:19:0x0057, B:21:0x005d, B:23:0x0063, B:26:0x0070, B:28:0x0091, B:31:0x009d, B:36:0x0075, B:37:0x0078, B:38:0x0079, B:41:0x008c, B:44:0x00a7, B:45:0x00aa, B:47:0x002b, B:49:0x0033, B:52:0x0037, B:54:0x003b, B:56:0x0046, B:65:0x00ab, B:25:0x006a, B:40:0x0086), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f b(String str, Context context, List list, int i9) {
        Typeface typeface;
        int i10;
        Typeface b10;
        a0.j jVar = a;
        r8.a("getFontSync");
        try {
            typeface = (Typeface) jVar.a(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return new f(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
        }
        if (typeface != null) {
            return new f(typeface);
        }
        h a2 = c.a(context, list);
        List list2 = a2.b;
        int i11 = a2.a;
        if (i11 != 0) {
            if (i11 == 1) {
                i10 = -2;
                if (i10 == 0) {
                    return new f(i10);
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    i[] iVarArr = (i[]) list2.get(0);
                    j8 j8Var = i0.e.a;
                    r8.a("TypefaceCompat.createFromFontInfo");
                    b10 = i0.e.a.b(context, iVarArr, i9);
                    Trace.endSection();
                    if (b10 != null) {
                        return new f(-3);
                    }
                    jVar.b(str, b10);
                    return new f(b10);
                }
                j8 j8Var2 = i0.e.a;
                r8.a("TypefaceCompat.createFromFontInfoWithFallback");
                b10 = i0.e.a.c(context, list2, i9);
                Trace.endSection();
                if (b10 != null) {
                }
            }
            i10 = -3;
            if (i10 == 0) {
            }
        } else {
            i[] iVarArr2 = (i[]) list2.get(0);
            if (iVarArr2 != null && iVarArr2.length != 0) {
                int length = iVarArr2.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        i10 = 0;
                        break;
                    }
                    int i13 = iVarArr2[i12].e;
                    if (i13 == 0) {
                        i12++;
                    } else if (i13 >= 0) {
                        i10 = i13;
                    }
                }
                if (i10 == 0) {
                }
            }
            i10 = 1;
            if (i10 == 0) {
            }
        }
    }
}
