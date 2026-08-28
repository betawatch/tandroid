package g4;

import android.os.Parcel;
import android.os.Parcelable;
import f8.r;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i extends b {
    public static final Parcelable.Creator<i> CREATOR = new r(18);
    public final List a;

    public i(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i9 = 0; i9 < readInt; i9++) {
            arrayList.add(new h(parcel));
        }
        this.a = DesugarCollections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        List list = this.a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = (h) list.get(i10);
            parcel.writeLong(hVar.a);
            parcel.writeByte(hVar.b ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.d ? (byte) 1 : (byte) 0);
            List list2 = hVar.f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i11 = 0; i11 < size2; i11++) {
                g gVar = (g) list2.get(i11);
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
