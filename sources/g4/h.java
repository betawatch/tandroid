package g4;

import android.os.Parcel;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public h(long j10, boolean z10, boolean z11, boolean z12, ArrayList arrayList, long j11, boolean z13, long j12, int i9, int i10, int i11) {
        this.a = j10;
        this.b = z10;
        this.c = z11;
        this.d = z12;
        this.f = DesugarCollections.unmodifiableList(arrayList);
        this.e = j11;
        this.g = z13;
        this.h = j12;
        this.i = i9;
        this.j = i10;
        this.k = i11;
    }

    public h(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readByte() == 1;
        this.c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i9 = 0; i9 < readInt; i9++) {
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
