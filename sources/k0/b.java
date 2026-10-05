package k0;

import a6.m;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import b2.p;
import b2.r0;
import b2.s;
import e2.d0;
import hg.c;
import kotlin.jvm.internal.i;
import v0.e;
import v0.h;
import v0.j;
import v0.k;
import w7.g;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class b implements h {
    public final Context a;

    public /* synthetic */ b(Context context, boolean z10) {
        this.a = context;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 34) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(s sVar) {
        String str = sVar.r;
        if (str == null || !r0.k(str)) {
            return c.b(0, 0, 0, 0);
        }
        String str2 = sVar.r;
        String str3 = d0.a;
        str2.getClass();
        switch (str2) {
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return c.b(4, 0, 0, 0);
        }
        return c.b(1, 0, 0, 0);
    }

    public void a(aa.a aVar, p pVar, m mVar) {
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
        e0.b.a(g10, e0.b.M(aVar), cancellationSignal, new a(mVar));
    }

    public Object b(Context context, e eVar, id.c cVar) {
        zd.m mVar = new zd.m(1, g.b(cVar));
        mVar.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        mVar.u(new v0.g(cancellationSignal));
        je.b bVar = new je.b(mVar);
        a3.b bVar2 = new a3.b(2);
        i.e(context, "context");
        j a2 = k.a(new k(this.a, 0), eVar);
        if (a2 == null) {
            bVar.onError(new w0.c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            bVar.onError(new w0.c("createCredential is not supported on this device", 3));
        } else {
            a2.onCreateCredential(context, eVar, cancellationSignal, bVar2, bVar);
        }
        Object r10 = mVar.r();
        jd.a aVar = jd.a.a;
        return r10;
    }

    public b(Context context) {
        i.e(context, "context");
        this.a = context;
    }
}
