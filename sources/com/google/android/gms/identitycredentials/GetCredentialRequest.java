package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import c8.bc;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j7.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;
import r6.a;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class GetCredentialRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GetCredentialRequest> CREATOR = new b(10);
    public final List a;
    public final Bundle b;
    public final String c;
    public final ResultReceiver d;

    public GetCredentialRequest(ArrayList credentialOptions, Bundle data, String str, ResultReceiver resultReceiver) {
        j.e(credentialOptions, "credentialOptions");
        j.e(data, "data");
        j.e(resultReceiver, "resultReceiver");
        this.a = credentialOptions;
        this.b = data;
        this.c = str;
        this.d = resultReceiver;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        j.e(dest, "dest");
        int r10 = bc.r(dest, 20293);
        bc.p(dest, 1, this.a);
        bc.b(dest, 2, this.b);
        bc.l(dest, 3, this.c);
        bc.k(dest, 4, this.d, i7);
        bc.s(dest, r10);
    }
}
