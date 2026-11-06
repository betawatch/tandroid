package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import c8.wb;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j7.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;
import r6.a;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        int r10 = wb.r(dest, 20293);
        wb.p(dest, 1, this.a);
        wb.b(dest, 2, this.b);
        wb.l(dest, 3, this.c);
        wb.k(dest, 4, this.d, i7);
        wb.s(dest, r10);
    }
}
