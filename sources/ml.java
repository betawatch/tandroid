// default package

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.webrtc.TextureBufferImpl;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ml implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ml(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        VideoFrame.I420Buffer lambda$toI420$1;
        byte b = this.a;
        boolean z = true;
        Object obj = this.b;
        switch (b) {
            case 0:
                try {
                    return (Boolean) ((ql) obj).run();
                } catch (Exception e) {
                    fc4.g(e, true);
                    return Boolean.FALSE;
                }
            case 1:
                nz2 nz2Var = (nz2) ((zd1) obj).f;
                nz2Var.getClass();
                mx6.w();
                lx6 lx6Var = nz2Var.c;
                jd4 jd4Var = (jd4) lx6Var.c;
                String str = (String) lx6Var.b;
                if (new File((File) jd4Var.c, str).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    new File((File) ((jd4) lx6Var.c).c, str).delete();
                } else if (nz2Var.e() == null || !nz2Var.j.c()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                return new yu5((JsReplyProxyBoundaryInterface) obj);
            case 3:
                ex8 ex8Var = (ex8) ((wm4) obj).c;
                ld3 ld3Var = (ld3) ex8Var.f;
                laa laaVar = (laa) ex8Var.c;
                String str2 = ld3Var.b;
                mx6.x();
                try {
                    HashMap d = ld3.d(laaVar);
                    in3 in3Var = new in3(str2, d);
                    in3Var.A("User-Agent", "Crashlytics Android SDK/20.1.1");
                    in3Var.A("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    ld3.c(in3Var, laaVar);
                    String concat = "Requesting settings from ".concat(str2);
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", concat, null);
                    }
                    String str3 = "Settings query params were: " + d;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str3, null);
                    }
                    return ld3Var.e(in3Var.s());
                } catch (IOException e2) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e2);
                    return null;
                }
            default:
                lambda$toI420$1 = ((TextureBufferImpl) obj).lambda$toI420$1();
                return lambda$toI420$1;
        }
    }
}
