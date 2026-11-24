// default package

import android.webkit.GeolocationPermissions;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class dw0 implements gu2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jw0 b;
    public final /* synthetic */ GeolocationPermissions.Callback c;
    public final /* synthetic */ String d;

    public /* synthetic */ dw0(jw0 jw0Var, GeolocationPermissions.Callback callback, String str, byte b) {
        this.a = b;
        this.b = jw0Var;
        this.c = callback;
        this.d = str;
    }

    @Override // gu2
    public final void accept(Object obj) {
        byte b = this.a;
        byte b2 = 1;
        String str = this.d;
        GeolocationPermissions.Callback callback = this.c;
        jw0 jw0Var = this.b;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                if (jw0Var.a != null) {
                    jw0Var.a = null;
                    if (!bool.booleanValue()) {
                        callback.invoke(str, false, false);
                        break;
                    } else {
                        dw0 dw0Var = new dw0(jw0Var, callback, str, b2);
                        boolean z = qw0.R0;
                        jw0Var.e.R.R(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, dw0Var);
                        break;
                    }
                }
                break;
            default:
                callback.invoke(str, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    jw0Var.e.R.U = true;
                    break;
                }
                break;
        }
    }
}
