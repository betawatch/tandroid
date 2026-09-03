package l4;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import j8.t;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class i extends b {
    public static final Parcelable.Creator<i> CREATOR = new t(29);
    public final List a;

    public i(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new h(parcel));
        }
        this.a = DesugarCollections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = (h) list.get(i11);
            parcel.writeLong(hVar.a);
            parcel.writeByte(hVar.b ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.d ? (byte) 1 : (byte) 0);
            List list2 = hVar.f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i12 = 0; i12 < size2; i12++) {
                g gVar = (g) list2.get(i12);
                parcel.writeInt(gVar.a);
                parcel.writeLong(gVar.b);
            }
            parcel.writeLong(hVar.e);
            parcel.writeByte(hVar.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(hVar.h);
            parcel.writeInt(hVar.i);
            parcel.writeInt(hVar.j);
            parcel.writeInt(hVar.k);
        }
    }

    public i(ArrayList arrayList) {
        this.a = DesugarCollections.unmodifiableList(arrayList);
    }
}
