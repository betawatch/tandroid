package com.google.android.gms.identitycredentials;

import a6.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.cast.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;
import s6.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class GetCredentialRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GetCredentialRequest> CREATOR = new i(3);
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
    public final void writeToParcel(Parcel dest, int i10) {
        j.e(dest, "dest");
        int q6 = o.q(dest, 20293);
        o.p(dest, 1, this.a);
        o.b(dest, 2, this.b);
        o.l(dest, 3, this.c);
        o.k(dest, 4, this.d, i10);
        o.r(dest, q6);
    }
}
