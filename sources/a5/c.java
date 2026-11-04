package a5;

import a0.f;
import a1.g;
import android.os.Parcel;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    @Override // a5.b
    public final c a() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i3 = this.j;
        if (i3 == this.f) {
            i3 = this.g;
        }
        return new c(parcel, dataPosition, i3, g.s(new StringBuilder(), this.h, "  "), this.a, this.b, this.c);
    }

    @Override // a5.b
    public final boolean e(int i3) {
        while (this.j < this.g) {
            int i10 = this.k;
            if (i10 == i3) {
                return true;
            }
            if (String.valueOf(i10).compareTo(String.valueOf(i3)) > 0) {
                return false;
            }
            int i11 = this.j;
            Parcel parcel = this.e;
            parcel.setDataPosition(i11);
            int readInt = parcel.readInt();
            this.k = parcel.readInt();
            this.j += readInt;
        }
        return this.k == i3;
    }

    @Override // a5.b
    public final void i(int i3) {
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
        this.i = i3;
        sparseIntArray.put(i3, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i3);
    }

    public c(Parcel parcel, int i3, int i10, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i3;
        this.g = i10;
        this.j = i3;
        this.h = str;
    }
}
