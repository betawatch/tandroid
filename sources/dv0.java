// default package

import android.webkit.GeolocationPermissions;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dv0 implements pt2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kv0 b;
    public final /* synthetic */ GeolocationPermissions.Callback c;
    public final /* synthetic */ String d;

    public /* synthetic */ dv0(kv0 kv0Var, GeolocationPermissions.Callback callback, String str, byte b) {
        this.a = b;
        this.b = kv0Var;
        this.c = callback;
        this.d = str;
    }

    @Override // pt2
    public final void accept(Object obj) {
        byte b = this.a;
        byte b2 = 1;
        String str = this.d;
        GeolocationPermissions.Callback callback = this.c;
        kv0 kv0Var = this.b;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                if (kv0Var.a != null) {
                    kv0Var.a = null;
                    if (!bool.booleanValue()) {
                        callback.invoke(str, false, false);
                        break;
                    } else {
                        dv0 dv0Var = new dv0(kv0Var, callback, str, b2);
                        boolean z = rv0.R0;
                        kv0Var.e.R.R(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, dv0Var);
                        break;
                    }
                }
                break;
            default:
                callback.invoke(str, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    kv0Var.e.R.U = true;
                    break;
                }
                break;
        }
    }
}
