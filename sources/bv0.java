// default package

import android.webkit.PermissionRequest;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bv0 implements pt2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kv0 b;
    public final /* synthetic */ PermissionRequest c;
    public final /* synthetic */ String d;

    public /* synthetic */ bv0(kv0 kv0Var, PermissionRequest permissionRequest, String str, byte b) {
        this.a = b;
        this.b = kv0Var;
        this.c = permissionRequest;
        this.d = str;
    }

    @Override // pt2
    public final void accept(Object obj) {
        byte b = this.a;
        String str = this.d;
        PermissionRequest permissionRequest = this.c;
        kv0 kv0Var = this.b;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                if (kv0Var.a != null) {
                    kv0Var.a = null;
                    if (!bool.booleanValue()) {
                        permissionRequest.deny();
                        break;
                    } else {
                        bv0 bv0Var = new bv0(kv0Var, permissionRequest, str, (byte) 2);
                        boolean z = rv0.R0;
                        kv0Var.e.R.R(new String[]{"android.permission.RECORD_AUDIO"}, bv0Var);
                        break;
                    }
                }
                break;
            case 1:
                if (kv0Var.a != null) {
                    kv0Var.a = null;
                    if (!bool.booleanValue()) {
                        permissionRequest.deny();
                        break;
                    } else {
                        bv0 bv0Var2 = new bv0(kv0Var, permissionRequest, str, (byte) 3);
                        boolean z2 = rv0.R0;
                        kv0Var.e.R.R(new String[]{"android.permission.CAMERA"}, bv0Var2);
                        break;
                    }
                }
                break;
            case 2:
                if (!bool.booleanValue()) {
                    permissionRequest.deny();
                    break;
                } else {
                    permissionRequest.grant(new String[]{str});
                    kv0Var.e.R.U = true;
                    break;
                }
            default:
                if (!bool.booleanValue()) {
                    permissionRequest.deny();
                    break;
                } else {
                    permissionRequest.grant(new String[]{str});
                    kv0Var.e.R.U = true;
                    break;
                }
        }
    }
}
