// default package

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class f15 implements ie9 {
    public final Status a;
    public final GoogleSignInAccount b;

    public f15(GoogleSignInAccount googleSignInAccount, Status status) {
        this.b = googleSignInAccount;
        this.a = status;
    }

    @Override // ie9
    public final Status a() {
        return this.a;
    }
}
