// default package

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.webrtc.TextureBufferImpl;
import org.webrtc.VideoFrame;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class mk implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mk(Object obj, byte b) {
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
                    return (Boolean) ((qk) obj).run();
                } catch (Exception e) {
                    fa4.g(e, true);
                    return Boolean.FALSE;
                }
            case 1:
                dy2 dy2Var = (dy2) ((rc1) obj).f;
                dy2Var.getClass();
                mv6.s();
                tg2 tg2Var = dy2Var.c;
                jb4 jb4Var = (jb4) tg2Var.c;
                String str = (String) tg2Var.b;
                if (new File((File) jb4Var.c, str).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    new File((File) ((jb4) tg2Var.c).c, str).delete();
                } else if (dy2Var.e() == null || !dy2Var.j.c()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                return new zs5((JsReplyProxyBoundaryInterface) obj);
            case 3:
                dv8 dv8Var = (dv8) ((wk4) obj).c;
                zb3 zb3Var = (zb3) dv8Var.f;
                l8a l8aVar = (l8a) dv8Var.c;
                String str2 = zb3Var.a;
                mv6.t();
                try {
                    HashMap c = zb3.c(l8aVar);
                    xl3 xl3Var = new xl3(str2, c);
                    xl3Var.B("User-Agent", "Crashlytics Android SDK/20.1.1");
                    xl3Var.B("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    zb3.b(xl3Var, l8aVar);
                    String concat = "Requesting settings from ".concat(str2);
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", concat, null);
                    }
                    String str3 = "Settings query params were: " + c;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str3, null);
                    }
                    return zb3Var.d(xl3Var.t());
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
