// default package

import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
