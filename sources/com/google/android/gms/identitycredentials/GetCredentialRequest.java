package com.google.android.gms.identitycredentials;

import a8.df;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f6.i;
import java.util.ArrayList;
import java.util.List;
import p6.a;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class GetCredentialRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GetCredentialRequest> CREATOR = new i(22);
    public final List a;
    public final Bundle b;
    public final String c;
    public final ResultReceiver d;

    public GetCredentialRequest(ArrayList credentialOptions, Bundle data, String str, ResultReceiver resultReceiver) {
        kotlin.jvm.internal.i.e(credentialOptions, "credentialOptions");
        kotlin.jvm.internal.i.e(data, "data");
        kotlin.jvm.internal.i.e(resultReceiver, "resultReceiver");
        this.a = credentialOptions;
        this.b = data;
        this.c = str;
        this.d = resultReceiver;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q5 = df.q(dest, 20293);
        df.p(dest, 1, this.a);
        df.b(dest, 2, this.b);
        df.l(dest, 3, this.c);
        df.k(dest, 4, this.d, i10);
        df.r(dest, q5);
    }
}
