package j7;

import a8.hf;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class b extends j {
    public static final com.google.android.gms.common.api.e l = new com.google.android.gms.common.api.e("Auth.Api.Identity.SignIn.API", new b8.d(6), new com.google.android.gms.common.api.d());
    public final String k;

    public b(Context context, y5.h hVar) {
        super(context, l, hVar, com.google.android.gms.common.api.i.c);
        this.k = e.a();
    }

    public final y5.g f(Intent intent) {
        Status status = Status.h;
        if (intent == null) {
            throw new com.google.android.gms.common.api.f(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : hf.a(byteArrayExtra, creator));
        if (status2 == null) {
            throw new com.google.android.gms.common.api.f(Status.r);
        }
        if (!status2.b()) {
            throw new com.google.android.gms.common.api.f(status2);
        }
        Parcelable.Creator<y5.g> creator2 = y5.g.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        y5.g gVar = (y5.g) (byteArrayExtra2 != null ? hf.a(byteArrayExtra2, creator2) : null);
        if (gVar != null) {
            return gVar;
        }
        throw new com.google.android.gms.common.api.f(status);
    }
}
