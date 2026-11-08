package b5;

import a0.f;
import a8.p0;
import android.os.Parcel;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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

    @Override // b5.b
    public final c a() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i7 = this.j;
        if (i7 == this.f) {
            i7 = this.g;
        }
        return new c(parcel, dataPosition, i7, p0.s(new StringBuilder(), this.h, "  "), this.a, this.b, this.c);
    }

    @Override // b5.b
    public final boolean e(int i7) {
        while (this.j < this.g) {
            int i10 = this.k;
            if (i10 == i7) {
                return true;
            }
            if (String.valueOf(i10).compareTo(String.valueOf(i7)) > 0) {
                return false;
            }
            int i11 = this.j;
            Parcel parcel = this.e;
            parcel.setDataPosition(i11);
            int readInt = parcel.readInt();
            this.k = parcel.readInt();
            this.j += readInt;
        }
        return this.k == i7;
    }

    @Override // b5.b
    public final void i(int i7) {
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
        this.i = i7;
        sparseIntArray.put(i7, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i7);
    }

    public c(Parcel parcel, int i7, int i10, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i7;
        this.g = i10;
        this.j = i7;
        this.h = str;
    }
}
