package c2;

import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class x0 {
    public final /* synthetic */ y0 a;

    public x0(y0 y0Var) {
        this.a = y0Var;
    }

    public static void a(String str, Bundle bundle) {
        Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
    }

    public final void b(Bundle bundle) {
        String string = bundle.getString("groupableTitle");
        y0 y0Var = this.a;
        y0Var.g = string;
        y0Var.h = bundle.getString("transferableTitle");
    }
}
