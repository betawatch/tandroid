// default package

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class h8d extends h05 {
    public static final zn m = new zn("Auth.Api.Identity.SignIn.API", new rr5(8), new xn());
    public final String l;

    public h8d(Context context, b9d b9dVar) {
        super(context, m, b9dVar, g05.c);
        this.l = j8d.a();
    }

    public static yka f(Intent intent) {
        Status status = Status.h;
        if (intent == null) {
            throw new ao(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : dye.a(byteArrayExtra, creator));
        if (status2 == null) {
            throw new ao(Status.r);
        }
        if (!status2.b()) {
            throw new ao(status2);
        }
        Parcelable.Creator<yka> creator2 = yka.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        yka ykaVar = (yka) (byteArrayExtra2 != null ? dye.a(byteArrayExtra2, creator2) : null);
        if (ykaVar != null) {
            return ykaVar;
        }
        throw new ao(status);
    }
}
