package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g7.p8;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import o5.p;
import y5.a;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class GetCredentialRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GetCredentialRequest> CREATOR = new p(21);
    public final List a;
    public final Bundle b;
    public final String c;
    public final ResultReceiver d;

    public GetCredentialRequest(ArrayList credentialOptions, Bundle data, String str, ResultReceiver resultReceiver) {
        i.e(credentialOptions, "credentialOptions");
        i.e(data, "data");
        i.e(resultReceiver, "resultReceiver");
        this.a = credentialOptions;
        this.b = data;
        this.c = str;
        this.d = resultReceiver;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i9) {
        i.e(dest, "dest");
        int q10 = p8.q(dest, 20293);
        p8.p(dest, 1, this.a);
        p8.b(dest, 2, this.b);
        p8.l(dest, 3, this.c);
        p8.k(dest, 4, this.d, i9);
        p8.r(dest, q10);
    }
}
