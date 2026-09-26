package n8;

import a8.d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.e;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public abstract class b {
    public static final d a;
    public static final e b;

    static {
        com.google.android.gms.common.api.d dVar = new com.google.android.gms.common.api.d();
        d dVar2 = new d(9);
        a = dVar2;
        new Scope(1, "profile");
        new Scope(1, "email");
        b = new e("SignIn.API", dVar2, dVar);
    }
}
