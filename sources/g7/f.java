package g7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new e6.p(16);
    public final String a;
    public final Bundle b;
    public final Bundle c;
    public final String d;
    public final String e;
    public final ResultReceiver f;

    public f(String type, Bundle credentialData, Bundle candidateQueryData, String str, String str2, ResultReceiver resultReceiver) {
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(credentialData, "credentialData");
        kotlin.jvm.internal.i.e(candidateQueryData, "candidateQueryData");
        this.a = type;
        this.b = credentialData;
        this.c = candidateQueryData;
        this.d = str;
        this.e = str2;
        this.f = resultReceiver;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = h0.q(dest, 20293);
        h0.l(dest, 1, this.a);
        h0.b(dest, 2, this.b);
        h0.b(dest, 3, this.c);
        h0.l(dest, 4, this.d);
        h0.l(dest, 5, this.e);
        h0.k(dest, 6, this.f, i10);
        h0.r(dest, q6);
    }
}
