package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import c8.xb;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j7.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;
import r6.a;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        int r10 = xb.r(dest, 20293);
        xb.p(dest, 1, this.a);
        xb.b(dest, 2, this.b);
        xb.l(dest, 3, this.c);
        xb.k(dest, 4, this.d, i7);
        xb.s(dest, r10);
    }
}
