package i4;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j extends b {
    public static final Parcelable.Creator<j> CREATOR = new g(0);
    public final List a;

    public j(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new i(parcel));
        }
        this.a = DesugarCollections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = (i) list.get(i11);
            parcel.writeLong(iVar.a);
            parcel.writeByte(iVar.b ? (byte) 1 : (byte) 0);
            parcel.writeByte(iVar.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(iVar.d ? (byte) 1 : (byte) 0);
            List list2 = iVar.f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i12 = 0; i12 < size2; i12++) {
                h hVar = (h) list2.get(i12);
                parcel.writeInt(hVar.a);
                parcel.writeLong(hVar.b);
            }
            parcel.writeLong(iVar.e);
            parcel.writeByte(iVar.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(iVar.h);
            parcel.writeInt(iVar.i);
            parcel.writeInt(iVar.j);
            parcel.writeInt(iVar.k);
        }
    }

    public j(ArrayList arrayList) {
        this.a = DesugarCollections.unmodifiableList(arrayList);
    }
}
