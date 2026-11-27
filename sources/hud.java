// default package

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.wearable.ConnectionConfiguration;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class hud implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ hud(byte b) {
        this.a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v67, types: [java.util.ArrayList] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int readInt;
        Uri uri = null;
        LatLng latLng = null;
        String str = null;
        qde qdeVar = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        String str2 = null;
        aud audVar = null;
        ArrayList arrayList = null;
        ConnectionConfiguration[] connectionConfigurationArr = null;
        ConnectionConfiguration connectionConfiguration = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ue0 ue0Var = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        String str6 = null;
        ParcelFileDescriptor parcelFileDescriptor3 = null;
        r5 = null;
        JSONObject jSONObject = null;
        idd iddVar = null;
        ArrayList arrayList2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z = false;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        switch (this.a) {
            case 0:
                int z2 = aye.z(parcel);
                Bundle bundle = null;
                byte[] bArr = null;
                while (parcel.dataPosition() < z2) {
                    int readInt2 = parcel.readInt();
                    char c = (char) readInt2;
                    if (c == 2) {
                        uri = (Uri) aye.g(parcel, readInt2, Uri.CREATOR);
                    } else if (c == 4) {
                        bundle = aye.a(parcel, readInt2);
                    } else if (c != 5) {
                        aye.y(parcel, readInt2);
                    } else {
                        bArr = aye.b(parcel, readInt2);
                    }
                }
                aye.m(parcel, z2);
                return new aud(uri, bundle, bArr);
            case 1:
                int z3 = aye.z(parcel);
                int i20 = 0;
                while (parcel.dataPosition() < z3) {
                    int readInt3 = parcel.readInt();
                    char c2 = (char) readInt3;
                    if (c2 == 2) {
                        i = aye.u(parcel, readInt3);
                    } else if (c2 != 3) {
                        aye.y(parcel, readInt3);
                    } else {
                        i20 = aye.u(parcel, readInt3);
                    }
                }
                aye.m(parcel, z3);
                return new tud(i, i20);
            case 2:
                int z4 = aye.z(parcel);
                while (parcel.dataPosition() < z4) {
                    int readInt4 = parcel.readInt();
                    char c3 = (char) readInt4;
                    if (c3 == 2) {
                        i19 = aye.u(parcel, readInt4);
                    } else if (c3 != 3) {
                        aye.y(parcel, readInt4);
                    } else {
                        arrayList2 = aye.l(parcel, readInt4, idd.CREATOR);
                    }
                }
                aye.m(parcel, z4);
                return new evd(i19, arrayList2);
            case 3:
                int z5 = aye.z(parcel);
                while (parcel.dataPosition() < z5) {
                    int readInt5 = parcel.readInt();
                    char c4 = (char) readInt5;
                    if (c4 == 2) {
                        i18 = aye.u(parcel, readInt5);
                    } else if (c4 != 3) {
                        aye.y(parcel, readInt5);
                    } else {
                        iddVar = (idd) aye.g(parcel, readInt5, idd.CREATOR);
                    }
                }
                aye.m(parcel, z5);
                return new pvd(i18, iddVar);
            case 4:
                int z6 = aye.z(parcel);
                kt6 kt6Var = null;
                String str7 = null;
                while (parcel.dataPosition() < z6) {
                    int readInt6 = parcel.readInt();
                    char c5 = (char) readInt6;
                    if (c5 == 2) {
                        kt6Var = (kt6) aye.g(parcel, readInt6, kt6.CREATOR);
                    } else if (c5 != 3) {
                        aye.y(parcel, readInt6);
                    } else {
                        str7 = aye.h(parcel, readInt6);
                    }
                }
                aye.m(parcel, z6);
                Pattern pattern = qd1.a;
                if (str7 != null) {
                    try {
                        jSONObject = new JSONObject(str7);
                    } catch (JSONException unused) {
                    }
                }
                return new haa(kt6Var, jSONObject);
            case 5:
                int z7 = aye.z(parcel);
                while (parcel.dataPosition() < z7) {
                    int readInt7 = parcel.readInt();
                    char c6 = (char) readInt7;
                    if (c6 == 2) {
                        i17 = aye.u(parcel, readInt7);
                    } else if (c6 != 3) {
                        aye.y(parcel, readInt7);
                    } else {
                        parcelFileDescriptor3 = (ParcelFileDescriptor) aye.g(parcel, readInt7, ParcelFileDescriptor.CREATOR);
                    }
                }
                aye.m(parcel, z7);
                return new bwd(i17, parcelFileDescriptor3);
            case 6:
                int z8 = aye.z(parcel);
                float f = 0.0f;
                String str8 = null;
                String str9 = null;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                while (parcel.dataPosition() < z8) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 2:
                            f = aye.r(parcel, readInt8);
                            break;
                        case 3:
                            i21 = aye.u(parcel, readInt8);
                            break;
                        case 4:
                            i22 = aye.u(parcel, readInt8);
                            break;
                        case 5:
                            i23 = aye.u(parcel, readInt8);
                            break;
                        case 6:
                            i24 = aye.u(parcel, readInt8);
                            break;
                        case 7:
                            i25 = aye.u(parcel, readInt8);
                            break;
                        case '\b':
                            i26 = aye.u(parcel, readInt8);
                            break;
                        case '\t':
                            i27 = aye.u(parcel, readInt8);
                            break;
                        case '\n':
                            str8 = aye.h(parcel, readInt8);
                            break;
                        case 11:
                            i28 = aye.u(parcel, readInt8);
                            break;
                        case '\f':
                            i29 = aye.u(parcel, readInt8);
                            break;
                        case '\r':
                            str9 = aye.h(parcel, readInt8);
                            break;
                        default:
                            aye.y(parcel, readInt8);
                            break;
                    }
                }
                aye.m(parcel, z8);
                return new tmb(f, i21, i22, i23, i24, i25, i26, i27, str8, i28, i29, str9);
            case 7:
                int z9 = aye.z(parcel);
                String str10 = null;
                while (parcel.dataPosition() < z9) {
                    int readInt9 = parcel.readInt();
                    char c7 = (char) readInt9;
                    if (c7 == 2) {
                        str6 = aye.h(parcel, readInt9);
                    } else if (c7 != 3) {
                        aye.y(parcel, readInt9);
                    } else {
                        str10 = aye.h(parcel, readInt9);
                    }
                }
                aye.m(parcel, z9);
                return new ddc(str6, str10);
            case 8:
                int z10 = aye.z(parcel);
                while (parcel.dataPosition() < z10) {
                    int readInt10 = parcel.readInt();
                    char c8 = (char) readInt10;
                    if (c8 == 2) {
                        i16 = aye.u(parcel, readInt10);
                    } else if (c8 != 3) {
                        aye.y(parcel, readInt10);
                    } else {
                        parcelFileDescriptor2 = (ParcelFileDescriptor) aye.g(parcel, readInt10, ParcelFileDescriptor.CREATOR);
                    }
                }
                aye.m(parcel, z10);
                return new mwd(i16, parcelFileDescriptor2);
            case 9:
                int z11 = aye.z(parcel);
                int i30 = 0;
                int i31 = 0;
                while (parcel.dataPosition() < z11) {
                    int readInt11 = parcel.readInt();
                    char c9 = (char) readInt11;
                    if (c9 == 2) {
                        i15 = aye.u(parcel, readInt11);
                    } else if (c9 == 3) {
                        i30 = aye.u(parcel, readInt11);
                    } else if (c9 != 4) {
                        aye.y(parcel, readInt11);
                    } else {
                        i31 = aye.u(parcel, readInt11);
                    }
                }
                aye.m(parcel, z11);
                return new bfc(i15, i30, i31);
            case 10:
                int z12 = aye.z(parcel);
                boolean z13 = false;
                while (parcel.dataPosition() < z12) {
                    int readInt12 = parcel.readInt();
                    char c10 = (char) readInt12;
                    if (c10 == 2) {
                        i14 = aye.u(parcel, readInt12);
                    } else if (c10 != 3) {
                        aye.y(parcel, readInt12);
                    } else {
                        z13 = aye.n(parcel, readInt12);
                    }
                }
                aye.m(parcel, z12);
                return new zwd(i14, z13);
            case 11:
                int z14 = aye.z(parcel);
                boolean z15 = false;
                boolean z16 = false;
                while (parcel.dataPosition() < z14) {
                    int readInt13 = parcel.readInt();
                    char c11 = (char) readInt13;
                    if (c11 == 2) {
                        i13 = aye.u(parcel, readInt13);
                    } else if (c11 == 3) {
                        z15 = aye.n(parcel, readInt13);
                    } else if (c11 != 4) {
                        aye.y(parcel, readInt13);
                    } else {
                        z16 = aye.n(parcel, readInt13);
                    }
                }
                aye.m(parcel, z14);
                return new kxd(i13, z15, z16);
            case 12:
                int z17 = aye.z(parcel);
                boolean z18 = false;
                while (parcel.dataPosition() < z17) {
                    int readInt14 = parcel.readInt();
                    char c12 = (char) readInt14;
                    if (c12 == 2) {
                        i12 = aye.u(parcel, readInt14);
                    } else if (c12 != 3) {
                        aye.y(parcel, readInt14);
                    } else {
                        z18 = aye.n(parcel, readInt14);
                    }
                }
                aye.m(parcel, z17);
                return new iyd(i12, z18);
            case 13:
                int z19 = aye.z(parcel);
                while (parcel.dataPosition() < z19) {
                    int readInt15 = parcel.readInt();
                    if (((char) readInt15) != 1) {
                        aye.y(parcel, readInt15);
                    } else {
                        z = aye.n(parcel, readInt15);
                    }
                }
                aye.m(parcel, z19);
                return new a50(z);
            case 14:
                int z20 = aye.z(parcel);
                vvd vvdVar = dwd.b;
                iwd iwdVar = iwd.e;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                srd srdVar = null;
                int i32 = 0;
                int i33 = 0;
                int i34 = 0;
                while (parcel.dataPosition() < z20) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 1:
                            i32 = aye.u(parcel, readInt16);
                            break;
                        case 2:
                            i33 = aye.u(parcel, readInt16);
                            break;
                        case 3:
                            str11 = aye.h(parcel, readInt16);
                            break;
                        case 4:
                            str12 = aye.h(parcel, readInt16);
                            break;
                        case 5:
                            i34 = aye.u(parcel, readInt16);
                            break;
                        case 6:
                            str13 = aye.h(parcel, readInt16);
                            break;
                        case 7:
                            srdVar = (srd) aye.g(parcel, readInt16, srd.CREATOR);
                            break;
                        case '\b':
                            iwdVar = aye.l(parcel, readInt16, a94.CREATOR);
                            break;
                        default:
                            aye.y(parcel, readInt16);
                            break;
                    }
                }
                aye.m(parcel, z20);
                return new srd(i32, i33, str11, str12, str13, i34, iwdVar, srdVar);
            case 15:
                int z21 = aye.z(parcel);
                long j = 0;
                oe5[] oe5VarArr = null;
                int i35 = 0;
                boolean z22 = false;
                while (true) {
                    long j2 = j;
                    while (parcel.dataPosition() < z21) {
                        readInt = parcel.readInt();
                        char c13 = (char) readInt;
                        if (c13 != 2) {
                            if (c13 == 3) {
                                oe5VarArr = (oe5[]) aye.k(parcel, readInt, oe5.CREATOR);
                            } else if (c13 == 4) {
                                i35 = aye.u(parcel, readInt);
                            } else if (c13 != 5) {
                                aye.y(parcel, readInt);
                            } else {
                                z22 = aye.n(parcel, readInt);
                            }
                        }
                    }
                    aye.m(parcel, z21);
                    return new wrd(j2, oe5VarArr, i35, z22);
                    j = aye.w(parcel, readInt);
                    break;
                }
                break;
            case 16:
                int z23 = aye.z(parcel);
                String str14 = null;
                String str15 = null;
                ve0[] ve0VarArr = null;
                se0[] se0VarArr = null;
                String[] strArr = null;
                ne0[] ne0VarArr = null;
                while (parcel.dataPosition() < z23) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 2:
                            ue0Var = (ue0) aye.g(parcel, readInt17, ue0.CREATOR);
                            break;
                        case 3:
                            str14 = aye.h(parcel, readInt17);
                            break;
                        case 4:
                            str15 = aye.h(parcel, readInt17);
                            break;
                        case 5:
                            ve0VarArr = (ve0[]) aye.k(parcel, readInt17, ve0.CREATOR);
                            break;
                        case 6:
                            se0VarArr = (se0[]) aye.k(parcel, readInt17, se0.CREATOR);
                            break;
                        case 7:
                            strArr = aye.i(parcel, readInt17);
                            break;
                        case '\b':
                            ne0VarArr = (ne0[]) aye.k(parcel, readInt17, ne0.CREATOR);
                            break;
                        default:
                            aye.y(parcel, readInt17);
                            break;
                    }
                }
                aye.m(parcel, z23);
                qe0 qe0Var = new qe0();
                qe0Var.a = ue0Var;
                qe0Var.b = str14;
                qe0Var.c = str15;
                qe0Var.d = ve0VarArr;
                qe0Var.e = se0VarArr;
                qe0Var.f = strArr;
                qe0Var.h = ne0VarArr;
                return qe0Var;
            case 17:
                int z24 = aye.z(parcel);
                float f2 = -1.0f;
                int i36 = 0;
                int i37 = 0;
                boolean z25 = false;
                boolean z26 = false;
                while (parcel.dataPosition() < z24) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 2:
                            i11 = aye.u(parcel, readInt18);
                            break;
                        case 3:
                            i36 = aye.u(parcel, readInt18);
                            break;
                        case 4:
                            i37 = aye.u(parcel, readInt18);
                            break;
                        case 5:
                            z25 = aye.n(parcel, readInt18);
                            break;
                        case 6:
                            z26 = aye.n(parcel, readInt18);
                            break;
                        case 7:
                            f2 = aye.r(parcel, readInt18);
                            break;
                        default:
                            aye.y(parcel, readInt18);
                            break;
                    }
                }
                aye.m(parcel, z24);
                i3e i3eVar = new i3e();
                i3eVar.a = i11;
                i3eVar.b = i36;
                i3eVar.c = i37;
                i3eVar.d = z25;
                i3eVar.e = z26;
                i3eVar.f = f2;
                return i3eVar;
            case 18:
                int z27 = aye.z(parcel);
                String str16 = null;
                UserAddress userAddress = null;
                int i38 = 0;
                String str17 = null;
                while (parcel.dataPosition() < z27) {
                    int readInt19 = parcel.readInt();
                    char c14 = (char) readInt19;
                    if (c14 == 1) {
                        str5 = aye.h(parcel, readInt19);
                    } else if (c14 == 2) {
                        str17 = aye.h(parcel, readInt19);
                    } else if (c14 == 3) {
                        str16 = aye.h(parcel, readInt19);
                    } else if (c14 == 4) {
                        i38 = aye.u(parcel, readInt19);
                    } else if (c14 != 5) {
                        aye.y(parcel, readInt19);
                    } else {
                        userAddress = (UserAddress) aye.g(parcel, readInt19, UserAddress.CREATOR);
                    }
                }
                aye.m(parcel, z27);
                bd1 bd1Var = new bd1();
                bd1Var.a = str5;
                bd1Var.b = str17;
                bd1Var.c = str16;
                bd1Var.d = i38;
                bd1Var.e = userAddress;
                return bd1Var;
            case 19:
                int z28 = aye.z(parcel);
                PendingIntent pendingIntent = null;
                int i39 = 0;
                ws2 ws2Var = null;
                while (parcel.dataPosition() < z28) {
                    int readInt20 = parcel.readInt();
                    char c15 = (char) readInt20;
                    if (c15 == 1) {
                        i39 = aye.u(parcel, readInt20);
                    } else if (c15 == 2) {
                        str4 = aye.h(parcel, readInt20);
                    } else if (c15 == 3) {
                        pendingIntent = (PendingIntent) aye.g(parcel, readInt20, PendingIntent.CREATOR);
                    } else if (c15 != 4) {
                        aye.y(parcel, readInt20);
                    } else {
                        ws2Var = (ws2) aye.g(parcel, readInt20, ws2.CREATOR);
                    }
                }
                aye.m(parcel, z28);
                return new Status(i39, str4, pendingIntent, ws2Var);
            case 20:
                int z29 = aye.z(parcel);
                while (parcel.dataPosition() < z29) {
                    int readInt21 = parcel.readInt();
                    char c16 = (char) readInt21;
                    if (c16 == 2) {
                        i10 = aye.u(parcel, readInt21);
                    } else if (c16 != 3) {
                        aye.y(parcel, readInt21);
                    } else {
                        str3 = aye.h(parcel, readInt21);
                    }
                }
                aye.m(parcel, z29);
                return new oyd(i10, str3);
            case 21:
                int z30 = aye.z(parcel);
                while (parcel.dataPosition() < z30) {
                    int readInt22 = parcel.readInt();
                    char c17 = (char) readInt22;
                    if (c17 == 2) {
                        i9 = aye.u(parcel, readInt22);
                    } else if (c17 != 3) {
                        aye.y(parcel, readInt22);
                    } else {
                        connectionConfiguration = (ConnectionConfiguration) aye.g(parcel, readInt22, ConnectionConfiguration.CREATOR);
                    }
                }
                aye.m(parcel, z30);
                return new bzd(i9, connectionConfiguration);
            case 22:
                int z31 = aye.z(parcel);
                while (parcel.dataPosition() < z31) {
                    int readInt23 = parcel.readInt();
                    char c18 = (char) readInt23;
                    if (c18 == 2) {
                        i8 = aye.u(parcel, readInt23);
                    } else if (c18 != 3) {
                        aye.y(parcel, readInt23);
                    } else {
                        connectionConfigurationArr = (ConnectionConfiguration[]) aye.k(parcel, readInt23, ConnectionConfiguration.CREATOR);
                    }
                }
                aye.m(parcel, z31);
                return new kzd(i8, connectionConfigurationArr);
            case 23:
                int z32 = aye.z(parcel);
                while (parcel.dataPosition() < z32) {
                    int readInt24 = parcel.readInt();
                    char c19 = (char) readInt24;
                    if (c19 == 2) {
                        i7 = aye.u(parcel, readInt24);
                    } else if (c19 != 3) {
                        aye.y(parcel, readInt24);
                    } else {
                        arrayList = aye.l(parcel, readInt24, qde.CREATOR);
                    }
                }
                aye.m(parcel, z32);
                return new vzd(i7, arrayList);
            case 24:
                int z33 = aye.z(parcel);
                while (parcel.dataPosition() < z33) {
                    int readInt25 = parcel.readInt();
                    char c20 = (char) readInt25;
                    if (c20 == 2) {
                        i6 = aye.u(parcel, readInt25);
                    } else if (c20 != 3) {
                        aye.y(parcel, readInt25);
                    } else {
                        audVar = (aud) aye.g(parcel, readInt25, aud.CREATOR);
                    }
                }
                aye.m(parcel, z33);
                return new e0e(i6, audVar);
            case 25:
                int z34 = aye.z(parcel);
                while (parcel.dataPosition() < z34) {
                    int readInt26 = parcel.readInt();
                    char c21 = (char) readInt26;
                    if (c21 == 2) {
                        i5 = aye.u(parcel, readInt26);
                    } else if (c21 != 3) {
                        aye.y(parcel, readInt26);
                    } else {
                        str2 = aye.h(parcel, readInt26);
                    }
                }
                aye.m(parcel, z34);
                return new n0e(i5, str2);
            case 26:
                int z35 = aye.z(parcel);
                while (parcel.dataPosition() < z35) {
                    int readInt27 = parcel.readInt();
                    char c22 = (char) readInt27;
                    if (c22 == 2) {
                        i4 = aye.u(parcel, readInt27);
                    } else if (c22 != 3) {
                        aye.y(parcel, readInt27);
                    } else {
                        parcelFileDescriptor = (ParcelFileDescriptor) aye.g(parcel, readInt27, ParcelFileDescriptor.CREATOR);
                    }
                }
                aye.m(parcel, z35);
                return new x0e(i4, parcelFileDescriptor);
            case 27:
                int z36 = aye.z(parcel);
                while (parcel.dataPosition() < z36) {
                    int readInt28 = parcel.readInt();
                    char c23 = (char) readInt28;
                    if (c23 == 2) {
                        i3 = aye.u(parcel, readInt28);
                    } else if (c23 != 3) {
                        aye.y(parcel, readInt28);
                    } else {
                        qdeVar = (qde) aye.g(parcel, readInt28, qde.CREATOR);
                    }
                }
                aye.m(parcel, z36);
                return new g1e(i3, qdeVar);
            case 28:
                int z37 = aye.z(parcel);
                while (parcel.dataPosition() < z37) {
                    int readInt29 = parcel.readInt();
                    char c24 = (char) readInt29;
                    if (c24 == 2) {
                        i2 = aye.u(parcel, readInt29);
                    } else if (c24 != 3) {
                        aye.y(parcel, readInt29);
                    } else {
                        str = aye.h(parcel, readInt29);
                    }
                }
                aye.m(parcel, z37);
                return new q1e(i2, str);
            default:
                int z38 = aye.z(parcel);
                LatLng latLng2 = null;
                while (parcel.dataPosition() < z38) {
                    int readInt30 = parcel.readInt();
                    char c25 = (char) readInt30;
                    if (c25 == 2) {
                        latLng = (LatLng) aye.g(parcel, readInt30, LatLng.CREATOR);
                    } else if (c25 != 3) {
                        aye.y(parcel, readInt30);
                    } else {
                        latLng2 = (LatLng) aye.g(parcel, readInt30, LatLng.CREATOR);
                    }
                }
                aye.m(parcel, z38);
                return new LatLngBounds(latLng, latLng2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new aud[i];
            case 1:
                return new tud[i];
            case 2:
                return new evd[i];
            case 3:
                return new pvd[i];
            case 4:
                return new haa[i];
            case 5:
                return new bwd[i];
            case 6:
                return new tmb[i];
            case 7:
                return new ddc[i];
            case 8:
                return new mwd[i];
            case 9:
                return new bfc[i];
            case 10:
                return new zwd[i];
            case 11:
                return new kxd[i];
            case 12:
                return new iyd[i];
            case 13:
                return new a50[i];
            case 14:
                return new srd[i];
            case 15:
                return new wrd[i];
            case 16:
                return new qe0[i];
            case 17:
                return new i3e[i];
            case 18:
                return new bd1[i];
            case 19:
                return new Status[i];
            case 20:
                return new oyd[i];
            case 21:
                return new bzd[i];
            case 22:
                return new kzd[i];
            case 23:
                return new vzd[i];
            case 24:
                return new e0e[i];
            case 25:
                return new n0e[i];
            case 26:
                return new x0e[i];
            case 27:
                return new g1e[i];
            case 28:
                return new q1e[i];
            default:
                return new LatLngBounds[i];
        }
    }
}
