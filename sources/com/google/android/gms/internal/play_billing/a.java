package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class a extends a8.a implements c {
    public final Bundle A1(int i7, String str, String str2, String str3, Bundle bundle) {
        Parcel v12 = v1();
        v12.writeInt(i7);
        v12.writeString(str);
        v12.writeString(str2);
        v12.writeString(str3);
        v12.writeString(null);
        int i10 = d.a;
        v12.writeInt(1);
        bundle.writeToParcel(v12, 0);
        Parcel w12 = w1(v12, 8);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) d.a(w12);
        w12.recycle();
        return bundle2;
    }

    public final Bundle B1(String str, String str2, String str3) {
        Parcel v12 = v1();
        v12.writeInt(3);
        v12.writeString(str);
        v12.writeString(str2);
        v12.writeString(str3);
        Parcel w12 = w1(v12, 4);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) d.a(w12);
        w12.recycle();
        return bundle;
    }

    public final Bundle C1(int i7, String str, String str2, String str3, Bundle bundle) {
        Parcel v12 = v1();
        v12.writeInt(i7);
        v12.writeString(str);
        v12.writeString(str2);
        v12.writeString(str3);
        int i10 = d.a;
        v12.writeInt(1);
        bundle.writeToParcel(v12, 0);
        Parcel w12 = w1(v12, 11);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) d.a(w12);
        w12.recycle();
        return bundle2;
    }

    public final Bundle D1(int i7, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel v12 = v1();
        v12.writeInt(i7);
        v12.writeString(str);
        v12.writeString(str2);
        int i10 = d.a;
        v12.writeInt(1);
        bundle.writeToParcel(v12, 0);
        v12.writeInt(1);
        bundle2.writeToParcel(v12, 0);
        Parcel w12 = w1(v12, 901);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) d.a(w12);
        w12.recycle();
        return bundle3;
    }

    public final int x1(int i7, String str, String str2, Bundle bundle) {
        Parcel v12 = v1();
        v12.writeInt(i7);
        v12.writeString(str);
        v12.writeString(str2);
        int i10 = d.a;
        v12.writeInt(1);
        bundle.writeToParcel(v12, 0);
        Parcel w12 = w1(v12, 10);
        int readInt = w12.readInt();
        w12.recycle();
        return readInt;
    }

    public final Bundle y1(String str, String str2, Bundle bundle) {
        Parcel v12 = v1();
        v12.writeInt(9);
        v12.writeString(str);
        v12.writeString(str2);
        int i7 = d.a;
        v12.writeInt(1);
        bundle.writeToParcel(v12, 0);
        Parcel w12 = w1(v12, 12);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) d.a(w12);
        w12.recycle();
        return bundle2;
    }

    public final Bundle z1(String str, String str2, String str3) {
        Parcel v12 = v1();
        v12.writeInt(3);
        v12.writeString(str);
        v12.writeString(str2);
        v12.writeString(str3);
        v12.writeString(null);
        Parcel w12 = w1(v12, 3);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) d.a(w12);
        w12.recycle();
        return bundle;
    }
}
