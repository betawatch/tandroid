package l2;

import a0.f;
import android.os.Parcel;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c extends b {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new f(0), new f(0), new f(0));
    }

    @Override // l2.b
    public final c a() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i9 = this.j;
        if (i9 == this.f) {
            i9 = this.g;
        }
        return new c(parcel, dataPosition, i9, aa.d.r(new StringBuilder(), this.h, "  "), this.a, this.b, this.c);
    }

    @Override // l2.b
    public final boolean e(int i9) {
        while (this.j < this.g) {
            int i10 = this.k;
            if (i10 == i9) {
                return true;
            }
            if (String.valueOf(i10).compareTo(String.valueOf(i9)) > 0) {
                return false;
            }
            int i11 = this.j;
            Parcel parcel = this.e;
            parcel.setDataPosition(i11);
            int readInt = parcel.readInt();
            this.k = parcel.readInt();
            this.j += readInt;
        }
        return this.k == i9;
    }

    @Override // l2.b
    public final void i(int i9) {
        int i10 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.e;
        if (i10 >= 0) {
            int i11 = sparseIntArray.get(i10);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(dataPosition - i11);
            parcel.setDataPosition(dataPosition);
        }
        this.i = i9;
        sparseIntArray.put(i9, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i9);
    }

    public c(Parcel parcel, int i9, int i10, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i9;
        this.g = i10;
        this.j = i9;
        this.h = str;
    }
}
