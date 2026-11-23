package k7;

import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.j;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.Task;
import j6.r;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class g extends j {
    public static final com.google.android.gms.common.api.e l = new com.google.android.gms.common.api.e("IdentityCredentials.API", new a9.e(7), new com.google.android.gms.common.api.d());

    public final Task f(GetCredentialRequest getCredentialRequest) {
        t b10 = u.b();
        b10.d = new n6.c[]{t7.b.a};
        b10.c = new r(getCredentialRequest, 2);
        b10.a = 32701;
        Task e10 = e(0, b10.a());
        kotlin.jvm.internal.j.d(e10, "doRead(...)");
        return e10;
    }
}
