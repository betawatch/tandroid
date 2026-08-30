package f4;

import android.os.Parcel;
import android.os.Parcelable;
import b9.e;
import j3.d1;
import j3.n0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a implements e4.b {
    public static final Parcelable.Creator<a> CREATOR = new e(16);
    public final int a;
    public final String b;

    public a(int i10, String str) {
        this.a = i10;
        this.b = str;
    }

    @Override // e4.b
    public final /* synthetic */ n0 b() {
        return null;
    }

    @Override // e4.b
    public final /* synthetic */ byte[] d() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.a);
        sb.append(",url=");
        return android.support.v4.media.a.r(sb, this.b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.b);
        parcel.writeInt(this.a);
    }

    @Override // e4.b
    public final /* synthetic */ void c(d1 d1Var) {
    }
}
