package k7;

import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.j;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.Task;
import g6.d0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
