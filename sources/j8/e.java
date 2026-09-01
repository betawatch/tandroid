package j8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new t(6);
    public ArrayList a;
    public String b;
    public String c;
    public ArrayList d;
    public boolean e;
    public String f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.h(parcel, 2, this.a);
        g5.l(parcel, 4, this.b);
        g5.l(parcel, 5, this.c);
        g5.h(parcel, 6, this.d);
        boolean z4 = this.e;
        g5.s(parcel, 7, 4);
        parcel.writeInt(z4 ? 1 : 0);
        g5.l(parcel, 8, this.f);
        g5.r(parcel, q10);
    }
}
