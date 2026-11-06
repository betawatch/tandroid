package k7;

import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.j;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.Task;
import g6.d0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class g extends j {
    public static final com.google.android.gms.common.api.e l = new com.google.android.gms.common.api.e("IdentityCredentials.API", new a9.e(7), new com.google.android.gms.common.api.d());

    public final Task f(GetCredentialRequest getCredentialRequest) {
        s b10 = t.b();
        b10.d = new n6.c[]{t7.b.a};
        b10.c = new d0(getCredentialRequest, 8);
        b10.a = 32701;
        Task e10 = e(0, b10.a());
        kotlin.jvm.internal.j.d(e10, "doRead(...)");
        return e10;
    }
}
