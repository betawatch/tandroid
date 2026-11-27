// default package

import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class c99 {
    public final /* synthetic */ d99 a;

    public c99(d99 d99Var) {
        this.a = d99Var;
    }

    public static void a(String str, Bundle bundle) {
        Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
    }

    public final void b(Bundle bundle) {
        String string = bundle.getString("groupableTitle");
        d99 d99Var = this.a;
        d99Var.g = string;
        d99Var.h = bundle.getString("transferableTitle");
    }
}
