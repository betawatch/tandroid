package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class a extends a9.a implements c {
    public final int V0(int i10, String str, String str2, Bundle bundle) {
        Parcel T0 = T0();
        T0.writeInt(i10);
        T0.writeString(str);
        T0.writeString(str2);
        int i11 = d.a;
        T0.writeInt(1);
        bundle.writeToParcel(T0, 0);
        Parcel U0 = U0(T0, 10);
        int readInt = U0.readInt();
        U0.recycle();
        return readInt;
    }

    public final Bundle W0(String str, String str2, Bundle bundle) {
        Parcel T0 = T0();
        T0.writeInt(9);
        T0.writeString(str);
        T0.writeString(str2);
        int i10 = d.a;
        T0.writeInt(1);
        bundle.writeToParcel(T0, 0);
        Parcel U0 = U0(T0, 12);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) d.a(U0);
        U0.recycle();
        return bundle2;
    }

    public final Bundle X0(String str, String str2, String str3) {
        Parcel T0 = T0();
        T0.writeInt(3);
        T0.writeString(str);
        T0.writeString(str2);
        T0.writeString(str3);
        T0.writeString(null);
        Parcel U0 = U0(T0, 3);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) d.a(U0);
        U0.recycle();
        return bundle;
    }

    public final Bundle Y0(int i10, String str, String str2, String str3, Bundle bundle) {
        Parcel T0 = T0();
        T0.writeInt(i10);
        T0.writeString(str);
        T0.writeString(str2);
        T0.writeString(str3);
        T0.writeString(null);
        int i11 = d.a;
        T0.writeInt(1);
        bundle.writeToParcel(T0, 0);
        Parcel U0 = U0(T0, 8);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) d.a(U0);
        U0.recycle();
        return bundle2;
    }

    public final Bundle Z0(String str, String str2, String str3) {
        Parcel T0 = T0();
        T0.writeInt(3);
        T0.writeString(str);
        T0.writeString(str2);
        T0.writeString(str3);
        Parcel U0 = U0(T0, 4);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) d.a(U0);
        U0.recycle();
        return bundle;
    }

    public final Bundle a1(int i10, String str, String str2, String str3, Bundle bundle) {
        Parcel T0 = T0();
        T0.writeInt(i10);
        T0.writeString(str);
        T0.writeString(str2);
        T0.writeString(str3);
        int i11 = d.a;
        T0.writeInt(1);
        bundle.writeToParcel(T0, 0);
        Parcel U0 = U0(T0, 11);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) d.a(U0);
        U0.recycle();
        return bundle2;
    }

    public final Bundle b1(int i10, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel T0 = T0();
        T0.writeInt(i10);
        T0.writeString(str);
        T0.writeString(str2);
        int i11 = d.a;
        T0.writeInt(1);
        bundle.writeToParcel(T0, 0);
        T0.writeInt(1);
        bundle2.writeToParcel(T0, 0);
        Parcel U0 = U0(T0, 901);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) d.a(U0);
        U0.recycle();
        return bundle3;
    }
}
