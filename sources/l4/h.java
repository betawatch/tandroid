package l4;

import android.os.Parcel;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class h {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final List f;
    public final boolean g;
    public final long h;
    public final int i;
    public final int j;
    public final int k;

    public h(long j10, boolean z4, boolean z10, boolean z11, ArrayList arrayList, long j11, boolean z12, long j12, int i10, int i11, int i12) {
        this.a = j10;
        this.b = z4;
        this.c = z10;
        this.d = z11;
        this.f = DesugarCollections.unmodifiableList(arrayList);
        this.e = j11;
        this.g = z12;
        this.h = j12;
        this.i = i10;
        this.j = i11;
        this.k = i12;
    }

    public h(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readByte() == 1;
        this.c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new g(parcel.readInt(), parcel.readLong()));
        }
        this.f = DesugarCollections.unmodifiableList(arrayList);
        this.e = parcel.readLong();
        this.g = parcel.readByte() == 1;
        this.h = parcel.readLong();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
    }
}
