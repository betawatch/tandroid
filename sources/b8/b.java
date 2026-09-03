package b8;

import a8.j;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.e;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
