package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a extends a7.a implements c {
    public final int U0(int i10, String str, String str2, Bundle bundle) {
        Parcel S0 = S0();
        S0.writeInt(i10);
        S0.writeString(str);
        S0.writeString(str2);
        int i11 = d.a;
        S0.writeInt(1);
        bundle.writeToParcel(S0, 0);
        Parcel T0 = T0(S0, 10);
        int readInt = T0.readInt();
        T0.recycle();
        return readInt;
    }

    public final Bundle V0(String str, String str2, Bundle bundle) {
        Parcel S0 = S0();
        S0.writeInt(9);
        S0.writeString(str);
        S0.writeString(str2);
        int i10 = d.a;
        S0.writeInt(1);
        bundle.writeToParcel(S0, 0);
        Parcel T0 = T0(S0, 12);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) d.a(T0);
        T0.recycle();
        return bundle2;
    }

    public final Bundle W0(String str, String str2, String str3) {
        Parcel S0 = S0();
        S0.writeInt(3);
        S0.writeString(str);
        S0.writeString(str2);
        S0.writeString(str3);
        S0.writeString(null);
        Parcel T0 = T0(S0, 3);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) d.a(T0);
        T0.recycle();
        return bundle;
    }

    public final Bundle X0(int i10, String str, String str2, String str3, Bundle bundle) {
        Parcel S0 = S0();
        S0.writeInt(i10);
        S0.writeString(str);
        S0.writeString(str2);
        S0.writeString(str3);
        S0.writeString(null);
        int i11 = d.a;
        S0.writeInt(1);
        bundle.writeToParcel(S0, 0);
        Parcel T0 = T0(S0, 8);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) d.a(T0);
        T0.recycle();
        return bundle2;
    }

    public final Bundle Y0(String str, String str2, String str3) {
        Parcel S0 = S0();
        S0.writeInt(3);
        S0.writeString(str);
        S0.writeString(str2);
        S0.writeString(str3);
        Parcel T0 = T0(S0, 4);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) d.a(T0);
        T0.recycle();
        return bundle;
    }

    public final Bundle Z0(int i10, String str, String str2, String str3, Bundle bundle) {
        Parcel S0 = S0();
        S0.writeInt(i10);
        S0.writeString(str);
        S0.writeString(str2);
        S0.writeString(str3);
        int i11 = d.a;
        S0.writeInt(1);
        bundle.writeToParcel(S0, 0);
        Parcel T0 = T0(S0, 11);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) d.a(T0);
        T0.recycle();
        return bundle2;
    }

    public final Bundle a1(int i10, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel S0 = S0();
        S0.writeInt(i10);
        S0.writeString(str);
        S0.writeString(str2);
        int i11 = d.a;
        S0.writeInt(1);
        bundle.writeToParcel(S0, 0);
        S0.writeInt(1);
        bundle2.writeToParcel(S0, 0);
        Parcel T0 = T0(S0, 901);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) d.a(T0);
        T0.recycle();
        return bundle3;
    }
}
