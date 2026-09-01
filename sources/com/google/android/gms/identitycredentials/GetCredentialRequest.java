package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import c6.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j7.g5;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;
import r5.c0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class GetCredentialRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GetCredentialRequest> CREATOR = new c0(25);
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
        int q10 = g5.q(dest, 20293);
        g5.p(dest, 1, this.a);
        g5.b(dest, 2, this.b);
        g5.l(dest, 3, this.c);
        g5.k(dest, 4, this.d, i10);
        g5.r(dest, q10);
    }
}
