package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class GetCredentialRequest extends b4 implements ReflectedParcelable {
    public static final Parcelable.Creator<GetCredentialRequest> CREATOR = new x21((byte) 21);
    public final ArrayList a;
    public final Bundle b;
    public final String c;
    public final ResultReceiver d;

    public GetCredentialRequest(ArrayList arrayList, Bundle bundle, String str, ResultReceiver resultReceiver) {
        arrayList.getClass();
        bundle.getClass();
        resultReceiver.getClass();
        this.a = arrayList;
        this.b = bundle;
        this.c = str;
        this.d = resultReceiver;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = jte.r(parcel, 20293);
        jte.p(parcel, 1, this.a);
        jte.b(parcel, 2, this.b);
        jte.l(parcel, 3, this.c);
        jte.k(parcel, 4, this.d, i);
        jte.s(parcel, r);
    }
}
