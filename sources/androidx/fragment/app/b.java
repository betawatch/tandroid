package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new w.a(10);
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
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            q0 q0Var = (q0) aVar.a.get(i11);
            int i12 = i10 + 1;
            this.a[i10] = q0Var.a;
            ArrayList arrayList = this.b;
            s sVar = q0Var.b;
            arrayList.add(sVar != null ? sVar.e : null);
            int[] iArr = this.a;
            iArr[i12] = q0Var.c ? 1 : 0;
            iArr[i10 + 2] = q0Var.d;
            iArr[i10 + 3] = q0Var.e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = q0Var.f;
            i10 += 6;
            iArr[i13] = q0Var.g;
            this.c[i11] = q0Var.h.ordinal();
            this.d[i11] = q0Var.i.ordinal();
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
