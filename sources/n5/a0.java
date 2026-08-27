package n5;

import android.os.Parcel;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a0 extends b7.a {
    public final i b;
    public final Class c;

    public a0(i iVar) {
        super("com.google.android.gms.cast.framework.ISessionManagerListener", 2);
        this.b = iVar;
        this.c = c.class;
    }

    @Override // b7.a
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        Class cls = this.c;
        i iVar = this.b;
        switch (i10) {
            case 1:
                i6.b bVar = new i6.b(iVar);
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.t.d(parcel2, bVar);
                return true;
            case 2:
                i6.a J0 = i6.b.J0(parcel.readStrongBinder());
                com.google.android.gms.internal.cast.t.b(parcel);
                g gVar = (g) i6.b.K0(J0);
                if (cls.isInstance(gVar) && iVar != null) {
                    iVar.d((g) cls.cast(gVar));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                i6.a J02 = i6.b.J0(parcel.readStrongBinder());
                String readString = parcel.readString();
                com.google.android.gms.internal.cast.t.b(parcel);
                g gVar2 = (g) i6.b.K0(J02);
                if (cls.isInstance(gVar2) && iVar != null) {
                    iVar.i((g) cls.cast(gVar2), readString);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                i6.a J03 = i6.b.J0(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                g gVar3 = (g) i6.b.K0(J03);
                if (cls.isInstance(gVar3) && iVar != null) {
                    iVar.h((g) cls.cast(gVar3), readInt);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                i6.a J04 = i6.b.J0(parcel.readStrongBinder());
                com.google.android.gms.internal.cast.t.b(parcel);
                g gVar4 = (g) i6.b.K0(J04);
                if (cls.isInstance(gVar4) && iVar != null) {
                    iVar.a((g) cls.cast(gVar4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                i6.a J05 = i6.b.J0(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                g gVar5 = (g) i6.b.K0(J05);
                if (cls.isInstance(gVar5) && iVar != null) {
                    iVar.c((g) cls.cast(gVar5), readInt2);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                i6.a J06 = i6.b.J0(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                com.google.android.gms.internal.cast.t.b(parcel);
                g gVar6 = (g) i6.b.K0(J06);
                if (cls.isInstance(gVar6) && iVar != null) {
                    iVar.j((g) cls.cast(gVar6), readString2);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                i6.a J07 = i6.b.J0(parcel.readStrongBinder());
                int i11 = com.google.android.gms.internal.cast.t.a;
                boolean z10 = parcel.readInt() != 0;
                com.google.android.gms.internal.cast.t.b(parcel);
                g gVar7 = (g) i6.b.K0(J07);
                if (cls.isInstance(gVar7) && iVar != null) {
                    iVar.e((g) cls.cast(gVar7), z10);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                i6.a J08 = i6.b.J0(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                g gVar8 = (g) i6.b.K0(J08);
                if (cls.isInstance(gVar8) && iVar != null) {
                    iVar.b((g) cls.cast(gVar8), readInt3);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                i6.a J09 = i6.b.J0(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                com.google.android.gms.internal.cast.t.b(parcel);
                g gVar9 = (g) i6.b.K0(J09);
                if (cls.isInstance(gVar9) && iVar != null) {
                    iVar.f((g) cls.cast(gVar9), readInt4);
                }
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            default:
                return false;
        }
    }
}
