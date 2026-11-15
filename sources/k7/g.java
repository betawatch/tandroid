package k7;

import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.j;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.Task;
import hi.l0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class g extends j {
    public static final com.google.android.gms.common.api.e l = new com.google.android.gms.common.api.e("IdentityCredentials.API", new a9.e(7), new com.google.android.gms.common.api.d());

    public final Task f(GetCredentialRequest getCredentialRequest) {
        t b10 = u.b();
        b10.d = new n6.c[]{t7.b.a};
        b10.c = new l0(getCredentialRequest, 5);
        b10.a = 32701;
        Task e10 = e(0, b10.a());
        kotlin.jvm.internal.j.d(e10, "doRead(...)");
        return e10;
    }
}
