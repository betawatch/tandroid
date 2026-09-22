package k6;

import a3.k0;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.util.Log;
import b2.p;
import b2.r0;
import b2.s;
import e2.d0;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.Cells.f3;
import v7.w;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class h implements androidx.emoji2.text.k, r2.k {
    public static h b;
    public final Context a;

    public /* synthetic */ h(Context context, char c10) {
        this.a = context;
    }

    public static h d(Context context) {
        n6.l.h(context);
        synchronized (h.class) {
            try {
                if (b == null) {
                    o.a(context);
                    b = new h(context, 0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b;
    }

    public static final l e(PackageInfo packageInfo, l... lVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            m mVar = new m(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < lVarArr.length; i10++) {
                if (lVarArr[i10].equals(mVar)) {
                    return lVarArr[i10];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean f(PackageInfo packageInfo, boolean z10) {
        PackageInfo packageInfo2;
        if (z10) {
            if (packageInfo == null) {
                packageInfo2 = null;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if ((!z10 ? e(packageInfo2, n.a) : e(packageInfo2, n.a[0])) == null) {
                        return true;
                    }
                }
                return false;
            }
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
        }
        packageInfo2 = packageInfo;
        if (packageInfo != null) {
            if ((!z10 ? e(packageInfo2, n.a) : e(packageInfo2, n.a[0])) == null) {
            }
        }
        return false;
    }

    @Override // r2.k
    public r2.l a(com.google.firebase.messaging.n nVar) {
        Context context;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23 || (i10 < 31 && ((context = this.a) == null || i10 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            return new rb.a(20).a(nVar);
        }
        int h = r0.h(((s) nVar.c).r);
        e2.a.i("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + d0.G(h));
        return new f3(new r2.b(h, 0), new r2.b(h, 1), false, 11).a(nVar);
    }

    @Override // androidx.emoji2.text.k
    public void b(w wVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new k0(this, wVar, threadPoolExecutor, 11));
    }

    public void c(aa.a aVar, p pVar, pb.c cVar) {
        CancellationSignal cancellationSignal;
        FingerprintManager g10;
        if (pVar != null) {
            synchronized (pVar) {
                try {
                    if (((CancellationSignal) pVar.c) == null) {
                        CancellationSignal cancellationSignal2 = new CancellationSignal();
                        pVar.c = cancellationSignal2;
                        if (pVar.b) {
                            cancellationSignal2.cancel();
                        }
                    }
                    cancellationSignal = (CancellationSignal) pVar.c;
                } finally {
                }
            }
        } else {
            cancellationSignal = null;
        }
        if (Build.VERSION.SDK_INT < 23 || (g10 = e0.b.g(this.a)) == null) {
            return;
        }
        e0.b.a(g10, e0.b.M(aVar), cancellationSignal, new k0.a(cVar));
    }

    public h(Context context, int i10) {
        switch (i10) {
            case 1:
                this.a = context.getApplicationContext();
                break;
            case 2:
                this.a = context.getApplicationContext();
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }
}
