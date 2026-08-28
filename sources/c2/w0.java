package c2;

import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class w0 {
    public final /* synthetic */ x0 a;

    public w0(x0 x0Var) {
        this.a = x0Var;
    }

    public static void a(String str, Bundle bundle) {
        Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
    }

    public final void b(Bundle bundle) {
        String string = bundle.getString("groupableTitle");
        x0 x0Var = this.a;
        x0Var.g = string;
        x0Var.h = bundle.getString("transferableTitle");
    }
}
