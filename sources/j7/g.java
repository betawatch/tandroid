package j7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import c8.yb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new b(5);
    public final String a;
    public final Bundle b;
    public final Bundle c;
    public final String d;
    public final String e;
    public final ResultReceiver f;

    public g(String type, Bundle credentialData, Bundle candidateQueryData, String str, String str2, ResultReceiver resultReceiver) {
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(credentialData, "credentialData");
        kotlin.jvm.internal.j.e(candidateQueryData, "candidateQueryData");
        this.a = type;
        this.b = credentialData;
        this.c = candidateQueryData;
        this.d = str;
        this.e = str2;
        this.f = resultReceiver;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = yb.r(dest, 20293);
        yb.l(dest, 1, this.a);
        yb.b(dest, 2, this.b);
        yb.b(dest, 3, this.c);
        yb.l(dest, 4, this.d);
        yb.l(dest, 5, this.e);
        yb.k(dest, 6, this.f, i7);
        yb.s(dest, r10);
    }
}
