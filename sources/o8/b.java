package o8;

import b8.d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.e;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
