package l4;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import j8.t;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new t(27);
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

    public e(long j10, boolean z4, boolean z10, boolean z11, boolean z12, long j11, long j12, List list, boolean z13, long j13, int i10, int i11, int i12) {
        this.a = j10;
        this.b = z4;
        this.c = z10;
        this.d = z11;
        this.e = z12;
        this.f = j11;
        this.h = j12;
        this.n = DesugarCollections.unmodifiableList(list);
        this.r = z13;
        this.s = j13;
        this.v = i10;
        this.w = i11;
        this.x = i12;
    }

    @Override // l4.b
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.f);
        sb.append(", programSplicePlaybackPositionUs= ");
        return android.support.v4.media.a.q(sb, this.h, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
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
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = (d) list.get(i11);
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
        for (int i10 = 0; i10 < readInt; i10++) {
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
