package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a extends a9.a implements c {
    public final int X0(int i10, String str, String str2, Bundle bundle) {
        Parcel V0 = V0();
        V0.writeInt(i10);
        V0.writeString(str);
        V0.writeString(str2);
        int i11 = d.a;
        V0.writeInt(1);
        bundle.writeToParcel(V0, 0);
        Parcel W0 = W0(V0, 10);
        int readInt = W0.readInt();
        W0.recycle();
        return readInt;
    }

    public final Bundle Y0(String str, String str2, Bundle bundle) {
        Parcel V0 = V0();
        V0.writeInt(9);
        V0.writeString(str);
        V0.writeString(str2);
        int i10 = d.a;
        V0.writeInt(1);
        bundle.writeToParcel(V0, 0);
        Parcel W0 = W0(V0, 12);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) d.a(W0);
        W0.recycle();
        return bundle2;
    }

    public final Bundle Z0(String str, String str2, String str3) {
        Parcel V0 = V0();
        V0.writeInt(3);
        V0.writeString(str);
        V0.writeString(str2);
        V0.writeString(str3);
        V0.writeString(null);
        Parcel W0 = W0(V0, 3);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) d.a(W0);
        W0.recycle();
        return bundle;
    }

    public final Bundle a1(int i10, String str, String str2, String str3, Bundle bundle) {
        Parcel V0 = V0();
        V0.writeInt(i10);
        V0.writeString(str);
        V0.writeString(str2);
        V0.writeString(str3);
        V0.writeString(null);
        int i11 = d.a;
        V0.writeInt(1);
        bundle.writeToParcel(V0, 0);
        Parcel W0 = W0(V0, 8);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) d.a(W0);
        W0.recycle();
        return bundle2;
    }

    public final Bundle b1(String str, String str2, String str3) {
        Parcel V0 = V0();
        V0.writeInt(3);
        V0.writeString(str);
        V0.writeString(str2);
        V0.writeString(str3);
        Parcel W0 = W0(V0, 4);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) d.a(W0);
        W0.recycle();
        return bundle;
    }

    public final Bundle c1(int i10, String str, String str2, String str3, Bundle bundle) {
        Parcel V0 = V0();
        V0.writeInt(i10);
        V0.writeString(str);
        V0.writeString(str2);
        V0.writeString(str3);
        int i11 = d.a;
        V0.writeInt(1);
        bundle.writeToParcel(V0, 0);
        Parcel W0 = W0(V0, 11);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) d.a(W0);
        W0.recycle();
        return bundle2;
    }

    public final Bundle d1(int i10, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel V0 = V0();
        V0.writeInt(i10);
        V0.writeString(str);
        V0.writeString(str2);
        int i11 = d.a;
        V0.writeInt(1);
        bundle.writeToParcel(V0, 0);
        V0.writeInt(1);
        bundle2.writeToParcel(V0, 0);
        Parcel W0 = W0(V0, 901);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) d.a(W0);
        W0.recycle();
        return bundle3;
    }
}
