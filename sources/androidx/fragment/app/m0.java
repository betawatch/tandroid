package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class m0 implements Parcelable {
    public static final Parcelable.Creator<m0> CREATOR = new w.a(13);
    public ArrayList a;
    public ArrayList b;
    public b[] c;
    public int d;
    public String e;
    public ArrayList f;
    public ArrayList h;
    public ArrayList n;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.a);
        parcel.writeStringList(this.b);
        parcel.writeTypedArray(this.c, i10);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeStringList(this.f);
        parcel.writeTypedList(this.h);
        parcel.writeTypedList(this.n);
    }
}
