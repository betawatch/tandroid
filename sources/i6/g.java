package i6;

import android.os.Parcel;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class g extends com.google.android.gms.internal.cast.o implements h {
    public g() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener", 0);
    }

    @Override // com.google.android.gms.internal.cast.o
    public final boolean K0(int i3, Parcel parcel, Parcel parcel2) {
        switch (i3) {
            case 1:
                int readInt = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                N(readInt);
                return true;
            case 2:
                e6.d dVar = (e6.d) com.google.android.gms.internal.cast.u.a(parcel, e6.d.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                boolean z10 = parcel.readInt() != 0;
                com.google.android.gms.internal.cast.u.b(parcel);
                b0(dVar, readString, readString2, z10);
                return true;
            case 3:
                int readInt2 = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                U(readInt2);
                return true;
            case 4:
                parcel.readString();
                parcel.readDouble();
                int i10 = com.google.android.gms.internal.cast.u.a;
                parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                zzn();
                return true;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                com.google.android.gms.internal.cast.u.b(parcel);
                Q(readString3, readString4);
                return true;
            case 6:
                String readString5 = parcel.readString();
                byte[] createByteArray = parcel.createByteArray();
                com.google.android.gms.internal.cast.u.b(parcel);
                C0(readString5, createByteArray);
                return true;
            case 7:
                int readInt3 = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                d(readInt3);
                return true;
            case 8:
                int readInt4 = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                zzg(readInt4);
                return true;
            case 9:
                int readInt5 = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                zzd(readInt5);
                return true;
            case 10:
                parcel.readString();
                long readLong = parcel.readLong();
                int readInt6 = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                zzm(readInt6, readLong);
                return true;
            case 11:
                parcel.readString();
                long readLong2 = parcel.readLong();
                com.google.android.gms.internal.cast.u.b(parcel);
                V(readLong2);
                return true;
            case 12:
                c cVar = (c) com.google.android.gms.internal.cast.u.a(parcel, c.CREATOR);
                com.google.android.gms.internal.cast.u.b(parcel);
                T(cVar);
                return true;
            case 13:
                d dVar2 = (d) com.google.android.gms.internal.cast.u.a(parcel, d.CREATOR);
                com.google.android.gms.internal.cast.u.b(parcel);
                D0(dVar2);
                return true;
            case 14:
                int readInt7 = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                g(readInt7);
                return true;
            case 15:
                int readInt8 = parcel.readInt();
                com.google.android.gms.internal.cast.u.b(parcel);
                x0(readInt8);
                return true;
            default:
                return false;
        }
    }
}
