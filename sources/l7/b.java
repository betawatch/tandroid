package l7;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class b extends j {
    public static final com.google.android.gms.common.api.e m = new com.google.android.gms.common.api.e("Auth.Api.Identity.SignIn.API", new a9.e(9), new com.google.android.gms.common.api.d());
    public final String l;

    public b(Context context, a6.h hVar) {
        super(context, m, hVar, com.google.android.gms.common.api.i.c);
        this.l = e.a();
    }

    public final a6.g f(Intent intent) {
        Status status = Status.h;
        if (intent == null) {
            throw new com.google.android.gms.common.api.f(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : yb.a(byteArrayExtra, creator));
        if (status2 == null) {
            throw new com.google.android.gms.common.api.f(Status.r);
        }
        if (!status2.b()) {
            throw new com.google.android.gms.common.api.f(status2);
        }
        Parcelable.Creator<a6.g> creator2 = a6.g.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        a6.g gVar = (a6.g) (byteArrayExtra2 != null ? yb.a(byteArrayExtra2, creator2) : null);
        if (gVar != null) {
            return gVar;
        }
        throw new com.google.android.gms.common.api.f(status);
    }
}
