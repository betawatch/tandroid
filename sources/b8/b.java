package b8;

import a8.j;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.e;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
