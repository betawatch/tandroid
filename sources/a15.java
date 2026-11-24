// default package

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class a15 implements uc9 {
    public final Status a;
    public final GoogleSignInAccount b;

    public a15(GoogleSignInAccount googleSignInAccount, Status status) {
        this.b = googleSignInAccount;
        this.a = status;
    }

    @Override // uc9
    public final Status a() {
        return this.a;
    }
}
