package c7;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import h7.q8;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ n(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Status status = null;
        switch (this.a) {
            case 0:
                int z10 = q8.z(parcel);
                IBinder iBinder = null;
                IBinder iBinder2 = null;
                PendingIntent pendingIntent = null;
                String str = null;
                String str2 = null;
                int i10 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            i10 = q8.u(parcel, readInt);
                            break;
                        case 2:
                            iBinder = q8.t(parcel, readInt);
                            break;
                        case 3:
                            iBinder2 = q8.t(parcel, readInt);
                            break;
                        case 4:
                            pendingIntent = (PendingIntent) q8.g(parcel, readInt, PendingIntent.CREATOR);
                            break;
                        case 5:
                            str = q8.h(parcel, readInt);
                            break;
                        case 6:
                            str2 = q8.h(parcel, readInt);
                            break;
                        default:
                            q8.y(parcel, readInt);
                            break;
                    }
                }
                q8.m(parcel, z10);
                return new m(i10, iBinder, iBinder2, pendingIntent, str, str2);
            case 1:
                int z11 = q8.z(parcel);
                LocationRequest locationRequest = null;
                ArrayList arrayList = null;
                String str3 = null;
                String str4 = null;
                long j10 = Long.MAX_VALUE;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 1) {
                        locationRequest = (LocationRequest) q8.g(parcel, readInt2, LocationRequest.CREATOR);
                    } else if (c10 != 5) {
                        switch (c10) {
                            case '\b':
                                z12 = q8.n(parcel, readInt2);
                                break;
                            case '\t':
                                z13 = q8.n(parcel, readInt2);
                                break;
                            case '\n':
                                str3 = q8.h(parcel, readInt2);
                                break;
                            case 11:
                                z14 = q8.n(parcel, readInt2);
                                break;
                            case '\f':
                                z15 = q8.n(parcel, readInt2);
                                break;
                            case '\r':
                                str4 = q8.h(parcel, readInt2);
                                break;
                            case 14:
                                j10 = q8.w(parcel, readInt2);
                                break;
                            default:
                                q8.y(parcel, readInt2);
                                break;
                        }
                    } else {
                        arrayList = q8.l(parcel, readInt2, y5.d.CREATOR);
                    }
                }
                q8.m(parcel, z11);
                return new o(locationRequest, arrayList, z12, z13, str3, z14, z15, str4, j10);
            case 2:
                int z16 = q8.z(parcel);
                o oVar = null;
                IBinder iBinder3 = null;
                IBinder iBinder4 = null;
                PendingIntent pendingIntent2 = null;
                IBinder iBinder5 = null;
                String str5 = null;
                int i11 = 1;
                while (parcel.dataPosition() < z16) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            i11 = q8.u(parcel, readInt3);
                            break;
                        case 2:
                            oVar = (o) q8.g(parcel, readInt3, o.CREATOR);
                            break;
                        case 3:
                            iBinder3 = q8.t(parcel, readInt3);
                            break;
                        case 4:
                            pendingIntent2 = (PendingIntent) q8.g(parcel, readInt3, PendingIntent.CREATOR);
                            break;
                        case 5:
                            iBinder4 = q8.t(parcel, readInt3);
                            break;
                        case 6:
                            iBinder5 = q8.t(parcel, readInt3);
                            break;
                        case 7:
                        default:
                            q8.y(parcel, readInt3);
                            break;
                        case '\b':
                            str5 = q8.h(parcel, readInt3);
                            break;
                    }
                }
                q8.m(parcel, z16);
                return new p(i11, oVar, iBinder3, iBinder4, pendingIntent2, iBinder5, str5);
            case 3:
                int z17 = q8.z(parcel);
                s sVar = u.b;
                List list = v.e;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                k kVar = null;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (parcel.dataPosition() < z17) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 1:
                            i12 = q8.u(parcel, readInt4);
                            break;
                        case 2:
                            i13 = q8.u(parcel, readInt4);
                            break;
                        case 3:
                            str6 = q8.h(parcel, readInt4);
                            break;
                        case 4:
                            str7 = q8.h(parcel, readInt4);
                            break;
                        case 5:
                            i14 = q8.u(parcel, readInt4);
                            break;
                        case 6:
                            str8 = q8.h(parcel, readInt4);
                            break;
                        case 7:
                            kVar = (k) q8.g(parcel, readInt4, k.CREATOR);
                            break;
                        case '\b':
                            list = q8.l(parcel, readInt4, v5.c.CREATOR);
                            break;
                        default:
                            q8.y(parcel, readInt4);
                            break;
                    }
                }
                q8.m(parcel, z17);
                return new k(i12, i13, str6, str7, str8, i14, list, kVar);
            default:
                int z18 = q8.z(parcel);
                while (parcel.dataPosition() < z18) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        q8.y(parcel, readInt5);
                    } else {
                        status = (Status) q8.g(parcel, readInt5, Status.CREATOR);
                    }
                }
                q8.m(parcel, z18);
                return new x(status);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new m[i10];
            case 1:
                return new o[i10];
            case 2:
                return new p[i10];
            case 3:
                return new k[i10];
            default:
                return new x[i10];
        }
    }
}
