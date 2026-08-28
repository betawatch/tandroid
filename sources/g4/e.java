package g4;

import android.os.Parcel;
import android.os.Parcelable;
import f8.r;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new r(16);
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long h;
    public final List n;
    public final boolean r;
    public final long s;
    public final int v;
    public final int w;
    public final int x;

    public e(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List list, boolean z14, long j13, int i9, int i10, int i11) {
        this.a = j10;
        this.b = z10;
        this.c = z11;
        this.d = z12;
        this.e = z13;
        this.f = j11;
        this.h = j12;
        this.n = DesugarCollections.unmodifiableList(list);
        this.r = z14;
        this.s = j13;
        this.v = i9;
        this.w = i10;
        this.x = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.a);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f);
        parcel.writeLong(this.h);
        List list = this.n;
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) list.get(i10);
            parcel.writeInt(dVar.a);
            parcel.writeLong(dVar.b);
            parcel.writeLong(dVar.c);
        }
        parcel.writeByte(this.r ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.s);
        parcel.writeInt(this.v);
        parcel.writeInt(this.w);
        parcel.writeInt(this.x);
    }

    public e(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readByte() == 1;
        this.c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        this.e = parcel.readByte() == 1;
        this.f = parcel.readLong();
        this.h = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i9 = 0; i9 < readInt; i9++) {
            arrayList.add(new d(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.n = DesugarCollections.unmodifiableList(arrayList);
        this.r = parcel.readByte() == 1;
        this.s = parcel.readLong();
        this.v = parcel.readInt();
        this.w = parcel.readInt();
        this.x = parcel.readInt();
    }
}
