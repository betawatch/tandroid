package i7;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;
import w7.f0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class b extends j {
    public static final com.google.android.gms.common.api.e l = new com.google.android.gms.common.api.e("Auth.Api.Identity.SignIn.API", new a8.d(6), new com.google.android.gms.common.api.d());
    public final String k;

    public b(Context context, x5.i iVar) {
        super(context, l, iVar, com.google.android.gms.common.api.i.c);
        this.k = e.a();
    }

    public final x5.g f(Intent intent) {
        Status status = Status.h;
        if (intent == null) {
            throw new com.google.android.gms.common.api.f(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : f0.a(byteArrayExtra, creator));
        if (status2 == null) {
            throw new com.google.android.gms.common.api.f(Status.r);
        }
        if (!status2.b()) {
            throw new com.google.android.gms.common.api.f(status2);
        }
        Parcelable.Creator<x5.g> creator2 = x5.g.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        x5.g gVar = (x5.g) (byteArrayExtra2 != null ? f0.a(byteArrayExtra2, creator2) : null);
        if (gVar != null) {
            return gVar;
        }
        throw new com.google.android.gms.common.api.f(status);
    }
}
