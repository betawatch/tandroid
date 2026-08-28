package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new w.a(8);
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
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            q0 q0Var = (q0) aVar.a.get(i10);
            int i11 = i9 + 1;
            this.a[i9] = q0Var.a;
            ArrayList arrayList = this.b;
            s sVar = q0Var.b;
            arrayList.add(sVar != null ? sVar.e : null);
            int[] iArr = this.a;
            iArr[i11] = q0Var.c ? 1 : 0;
            iArr[i9 + 2] = q0Var.d;
            iArr[i9 + 3] = q0Var.e;
            int i12 = i9 + 5;
            iArr[i9 + 4] = q0Var.f;
            i9 += 6;
            iArr[i12] = q0Var.g;
            this.c[i10] = q0Var.h.ordinal();
            this.d[i10] = q0Var.i.ordinal();
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
    public final void writeToParcel(Parcel parcel, int i9) {
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
