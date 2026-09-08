package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new w.a(10);
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
    public final CharSequence v;
    public final ArrayList w;
    public final ArrayList x;
    public final boolean y;

    public b(a aVar) {
        int size = aVar.a.size();
        this.a = new int[size * 6];
        if (!aVar.g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.b = new ArrayList(size);
        this.c = new int[size];
        this.d = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            p0 p0Var = (p0) aVar.a.get(i11);
            int i12 = i10 + 1;
            this.a[i10] = p0Var.a;
            ArrayList arrayList = this.b;
            r rVar = p0Var.b;
            arrayList.add(rVar != null ? rVar.e : null);
            int[] iArr = this.a;
            iArr[i12] = p0Var.c ? 1 : 0;
            iArr[i10 + 2] = p0Var.d;
            iArr[i10 + 3] = p0Var.e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = p0Var.f;
            i10 += 6;
            iArr[i13] = p0Var.g;
            this.c[i11] = p0Var.h.ordinal();
            this.d[i11] = p0Var.i.ordinal();
        }
        this.e = aVar.f;
        this.f = aVar.h;
        this.h = aVar.s;
        this.n = aVar.i;
        this.r = aVar.j;
        this.s = aVar.k;
        this.v = aVar.l;
        this.w = aVar.m;
        this.x = aVar.n;
        this.y = aVar.o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
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
        TextUtils.writeToParcel(this.v, parcel, 0);
        parcel.writeStringList(this.w);
        parcel.writeStringList(this.x);
        parcel.writeInt(this.y ? 1 : 0);
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
        this.v = (CharSequence) creator.createFromParcel(parcel);
        this.w = parcel.createStringArrayList();
        this.x = parcel.createStringArrayList();
        this.y = parcel.readInt() != 0;
    }
}
