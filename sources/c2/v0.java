package c2;

import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class v0 {
    public final /* synthetic */ w0 a;

    public v0(w0 w0Var) {
        this.a = w0Var;
    }

    public static void a(String str, Bundle bundle) {
        Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
    }

    public final void b(Bundle bundle) {
        String string = bundle.getString("groupableTitle");
        w0 w0Var = this.a;
        w0Var.g = string;
        w0Var.h = bundle.getString("transferableTitle");
    }
}
