package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.ReflectedParcelable;
import e6.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import o6.a;
import w7.h0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
    public final void writeToParcel(Parcel dest, int i10) {
        i.e(dest, "dest");
        int q6 = h0.q(dest, 20293);
        h0.p(dest, 1, this.a);
        h0.b(dest, 2, this.b);
        h0.l(dest, 3, this.c);
        h0.k(dest, 4, this.d, i10);
        h0.r(dest, q6);
    }
}
