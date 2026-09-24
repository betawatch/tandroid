package n8;

import a8.d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.e;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
