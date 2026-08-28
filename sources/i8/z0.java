package i8;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class z0 extends a {
    public j0 b;

    @Override // i8.a, i8.f0
    public final void n(v0 v0Var) {
        String str;
        int i9 = v0Var.a;
        switch (i9) {
            case 4000:
                str = "TARGET_NODE_NOT_CONNECTED";
                break;
            case 4001:
                str = "DUPLICATE_LISTENER";
                break;
            case 4002:
                str = "UNKNOWN_LISTENER";
                break;
            case 4003:
                str = "DATA_ITEM_TOO_LARGE";
                break;
            case 4004:
                str = "INVALID_TARGET_NODE";
                break;
            case 4005:
                str = "ASSET_UNAVAILABLE";
                break;
            case 4006:
                str = "DUPLICATE_CAPABILITY";
                break;
            case 4007:
                str = "UNKNOWN_CAPABILITY";
                break;
            case 4008:
                str = "WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED";
                break;
            case 4009:
                str = "UNSUPPORTED_BY_TARGET";
                break;
            case 4010:
                str = "ACCOUNT_KEY_CREATION_FAILED";
                break;
            default:
                str = h8.j.a(i9);
                break;
        }
        k0 k0Var = new k0(new Status(i9, str, null, null), v0Var.b);
        j0 j0Var = this.b;
        if (j0Var != null) {
            j0Var.a(k0Var);
            this.b = null;
        }
    }
}
