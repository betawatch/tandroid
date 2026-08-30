package b8;

import a8.j;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.e;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class b {
    public static final j a;
    public static final e b;

    static {
        d dVar = new d();
        j jVar = new j(2);
        a = jVar;
        new Scope(1, "profile");
        new Scope(1, "email");
        b = new e("SignIn.API", jVar, dVar);
    }
}
