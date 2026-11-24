// default package

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class bz4 implements ua9 {
    public final Status a;
    public final GoogleSignInAccount b;

    public bz4(GoogleSignInAccount googleSignInAccount, Status status) {
        this.b = googleSignInAccount;
        this.a = status;
    }

    @Override // ua9
    public final Status a() {
        return this.a;
    }
}
