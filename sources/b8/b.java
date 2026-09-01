package b8;

import a8.j;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.e;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
