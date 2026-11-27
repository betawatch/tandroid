// default package

import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
