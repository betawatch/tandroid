package k7;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends j {
    public static final com.google.android.gms.common.api.e m = new com.google.android.gms.common.api.e("Auth.Api.Identity.SignIn.API", new a6.b(7), new com.google.android.gms.common.api.d());
    public final String l;

    public b(Context context, z5.h hVar) {
        super(context, m, hVar, com.google.android.gms.common.api.i.c);
        this.l = e.a();
    }

    public final z5.g f(Intent intent) {
        Status status = Status.h;
        if (intent == null) {
            throw new com.google.android.gms.common.api.f(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : k8.c.a(byteArrayExtra, creator));
        if (status2 == null) {
            throw new com.google.android.gms.common.api.f(Status.r);
        }
        if (!status2.b()) {
            throw new com.google.android.gms.common.api.f(status2);
        }
        Parcelable.Creator<z5.g> creator2 = z5.g.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        z5.g gVar = (z5.g) (byteArrayExtra2 != null ? k8.c.a(byteArrayExtra2, creator2) : null);
        if (gVar != null) {
            return gVar;
        }
        throw new com.google.android.gms.common.api.f(status);
    }
}
