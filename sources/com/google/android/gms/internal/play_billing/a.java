package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a extends a9.a implements c {
    public final int W0(int i10, String str, String str2, Bundle bundle) {
        Parcel U0 = U0();
        U0.writeInt(i10);
        U0.writeString(str);
        U0.writeString(str2);
        int i11 = d.a;
        U0.writeInt(1);
        bundle.writeToParcel(U0, 0);
        Parcel V0 = V0(U0, 10);
        int readInt = V0.readInt();
        V0.recycle();
        return readInt;
    }

    public final Bundle X0(String str, String str2, Bundle bundle) {
        Parcel U0 = U0();
        U0.writeInt(9);
        U0.writeString(str);
        U0.writeString(str2);
        int i10 = d.a;
        U0.writeInt(1);
        bundle.writeToParcel(U0, 0);
        Parcel V0 = V0(U0, 12);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) d.a(V0);
        V0.recycle();
        return bundle2;
    }

    public final Bundle Y0(String str, String str2, String str3) {
        Parcel U0 = U0();
        U0.writeInt(3);
        U0.writeString(str);
        U0.writeString(str2);
        U0.writeString(str3);
        U0.writeString(null);
        Parcel V0 = V0(U0, 3);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) d.a(V0);
        V0.recycle();
        return bundle;
    }

    public final Bundle Z0(int i10, String str, String str2, String str3, Bundle bundle) {
        Parcel U0 = U0();
        U0.writeInt(i10);
        U0.writeString(str);
        U0.writeString(str2);
        U0.writeString(str3);
        U0.writeString(null);
        int i11 = d.a;
        U0.writeInt(1);
        bundle.writeToParcel(U0, 0);
        Parcel V0 = V0(U0, 8);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) d.a(V0);
        V0.recycle();
        return bundle2;
    }

    public final Bundle a1(String str, String str2, String str3) {
        Parcel U0 = U0();
        U0.writeInt(3);
        U0.writeString(str);
        U0.writeString(str2);
        U0.writeString(str3);
        Parcel V0 = V0(U0, 4);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) d.a(V0);
        V0.recycle();
        return bundle;
    }

    public final Bundle b1(int i10, String str, String str2, String str3, Bundle bundle) {
        Parcel U0 = U0();
        U0.writeInt(i10);
        U0.writeString(str);
        U0.writeString(str2);
        U0.writeString(str3);
        int i11 = d.a;
        U0.writeInt(1);
        bundle.writeToParcel(U0, 0);
        Parcel V0 = V0(U0, 11);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) d.a(V0);
        V0.recycle();
        return bundle2;
    }

    public final Bundle c1(int i10, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel U0 = U0();
        U0.writeInt(i10);
        U0.writeString(str);
        U0.writeString(str2);
        int i11 = d.a;
        U0.writeInt(1);
        bundle.writeToParcel(U0, 0);
        U0.writeInt(1);
        bundle2.writeToParcel(U0, 0);
        Parcel V0 = V0(U0, 901);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) d.a(V0);
        V0.recycle();
        return bundle3;
    }
}
