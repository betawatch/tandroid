package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new w.a(16);
    public final boolean D;
    public final int[] a;
    public final ArrayList b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final String f;
    public final int h;
    public final int n;
    public final CharSequence r;
    public final int s;
    public final CharSequence w;
    public final ArrayList x;
    public final ArrayList y;

    public b(a aVar) {
        int size = aVar.a.size();
        this.a = new int[size * 6];
        if (!aVar.g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.b = new ArrayList(size);
        this.c = new int[size];
        this.d = new int[size];
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            p0 p0Var = (p0) aVar.a.get(i10);
            int i11 = i7 + 1;
            this.a[i7] = p0Var.a;
            ArrayList arrayList = this.b;
            r rVar = p0Var.b;
            arrayList.add(rVar != null ? rVar.e : null);
            int[] iArr = this.a;
            iArr[i11] = p0Var.c ? 1 : 0;
            iArr[i7 + 2] = p0Var.d;
            iArr[i7 + 3] = p0Var.e;
            int i12 = i7 + 5;
            iArr[i7 + 4] = p0Var.f;
            i7 += 6;
            iArr[i12] = p0Var.g;
            this.c[i10] = p0Var.h.ordinal();
            this.d[i10] = p0Var.i.ordinal();
        }
        this.e = aVar.f;
        this.f = aVar.h;
        this.h = aVar.s;
        this.n = aVar.i;
        this.r = aVar.j;
        this.s = aVar.k;
        this.w = aVar.l;
        this.x = aVar.m;
        this.y = aVar.n;
        this.D = aVar.o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.h);
        parcel.writeInt(this.n);
        TextUtils.writeToParcel(this.r, parcel, 0);
        parcel.writeInt(this.s);
        TextUtils.writeToParcel(this.w, parcel, 0);
        parcel.writeStringList(this.x);
        parcel.writeStringList(this.y);
        parcel.writeInt(this.D ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.h = parcel.readInt();
        this.n = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.r = (CharSequence) creator.createFromParcel(parcel);
        this.s = parcel.readInt();
        this.w = (CharSequence) creator.createFromParcel(parcel);
        this.x = parcel.createStringArrayList();
        this.y = parcel.createStringArrayList();
        this.D = parcel.readInt() != 0;
    }
}
