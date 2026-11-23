package aa;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                p pVar = ((t) this.b).f;
                pVar.getClass();
                ba.e.a();
                wf.b bVar = pVar.c;
                ga.d dVar = (ga.d) bVar.c;
                String str = (String) bVar.b;
                dVar.getClass();
                boolean z10 = true;
                if (new File((File) dVar.c, str).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ga.d dVar2 = (ga.d) bVar.c;
                    dVar2.getClass();
                    new File((File) dVar2.c, str).delete();
                } else {
                    String g10 = pVar.g();
                    if (g10 == null || !pVar.j.c(g10)) {
                        z10 = false;
                    }
                }
                return Boolean.valueOf(z10);
            case 1:
                return new e5.f((JsReplyProxyBoundaryInterface) this.b);
            default:
                ia.c cVar = (ia.c) ((q4.q) this.b).c;
                ee.t tVar = (ee.t) cVar.f;
                ia.e eVar = (ia.e) cVar.b;
                String str2 = tVar.b;
                ba.e.b();
                try {
                    HashMap b10 = ee.t.b(eVar);
                    android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(str2, b10);
                    a0Var.m("User-Agent", "Crashlytics Android SDK/20.1.1");
                    a0Var.m("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    ee.t.a(a0Var, eVar);
                    String str3 = "Requesting settings from " + str2;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str3, null);
                    }
                    String str4 = "Settings query params were: " + b10;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str4, null);
                    }
                    return tVar.c(a0Var.h());
                } catch (IOException e10) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e10);
                    return null;
                }
        }
    }
}
