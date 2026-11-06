package l7;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        Status status2 = (Status) (byteArrayExtra == null ? null : xb.a(byteArrayExtra, creator));
        if (status2 == null) {
            throw new com.google.android.gms.common.api.f(Status.r);
        }
        if (!status2.b()) {
            throw new com.google.android.gms.common.api.f(status2);
        }
        Parcelable.Creator<a6.g> creator2 = a6.g.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        a6.g gVar = (a6.g) (byteArrayExtra2 != null ? xb.a(byteArrayExtra2, creator2) : null);
        if (gVar != null) {
            return gVar;
        }
        throw new com.google.android.gms.common.api.f(status);
    }
}
