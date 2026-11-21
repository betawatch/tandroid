package jb;

import android.content.Context;
import android.os.Bundle;
import c8.he;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class a implements q {
    public final Bundle a;

    public a(Context appContext) {
        kotlin.jvm.internal.j.e(appContext, "appContext");
        Bundle bundle = appContext.getPackageManager().getApplicationInfo(appContext.getPackageName(), 128).metaData;
        this.a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // jb.q
    public final Boolean a() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // jb.q
    public final Object b(id.c cVar) {
        return gd.k.a;
    }

    @Override // jb.q
    public final yd.a c() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new yd.a(he.c(bundle.getInt("firebase_sessions_sessions_restart_timeout"), yd.c.d));
        }
        return null;
    }

    @Override // jb.q
    public final Double d() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }
}
