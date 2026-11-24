// default package

import android.webkit.PermissionRequest;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class bw0 implements gu2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jw0 b;
    public final /* synthetic */ PermissionRequest c;
    public final /* synthetic */ String d;

    public /* synthetic */ bw0(jw0 jw0Var, PermissionRequest permissionRequest, String str, byte b) {
        this.a = b;
        this.b = jw0Var;
        this.c = permissionRequest;
        this.d = str;
    }

    @Override // gu2
    public final void accept(Object obj) {
        byte b = this.a;
        String str = this.d;
        PermissionRequest permissionRequest = this.c;
        jw0 jw0Var = this.b;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                if (jw0Var.a != null) {
                    jw0Var.a = null;
                    if (!bool.booleanValue()) {
                        permissionRequest.deny();
                        break;
                    } else {
                        bw0 bw0Var = new bw0(jw0Var, permissionRequest, str, (byte) 2);
                        boolean z = qw0.R0;
                        jw0Var.e.R.R(new String[]{"android.permission.RECORD_AUDIO"}, bw0Var);
                        break;
                    }
                }
                break;
            case 1:
                if (jw0Var.a != null) {
                    jw0Var.a = null;
                    if (!bool.booleanValue()) {
                        permissionRequest.deny();
                        break;
                    } else {
                        bw0 bw0Var2 = new bw0(jw0Var, permissionRequest, str, (byte) 3);
                        boolean z2 = qw0.R0;
                        jw0Var.e.R.R(new String[]{"android.permission.CAMERA"}, bw0Var2);
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
                    jw0Var.e.R.U = true;
                    break;
                }
            default:
                if (!bool.booleanValue()) {
                    permissionRequest.deny();
                    break;
                } else {
                    permissionRequest.grant(new String[]{str});
                    jw0Var.e.R.U = true;
                    break;
                }
        }
    }
}
