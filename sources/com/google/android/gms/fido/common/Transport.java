package com.google.android.gms.fido.common;

import aa.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h5.h;
import k6.a;
import x6.h1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public enum Transport implements ReflectedParcelable {
    /* JADX INFO: Fake field, exist only in values array */
    EF7("bt"),
    /* JADX INFO: Fake field, exist only in values array */
    EF17("ble"),
    /* JADX INFO: Fake field, exist only in values array */
    EF28("nfc"),
    /* JADX INFO: Fake field, exist only in values array */
    EF39("usb"),
    /* JADX INFO: Fake field, exist only in values array */
    EF49("internal"),
    /* JADX INFO: Fake field, exist only in values array */
    EF59("cable"),
    /* JADX INFO: Fake field, exist only in values array */
    EF69("hybrid");

    public static final Parcelable.Creator<Transport> CREATOR = new h(11);
    public final String a;

    Transport(String str) {
        this.a = str;
    }

    public static Transport a(String str) {
        if (str.equals("hybrid")) {
            h1.a.R();
            throw null;
        }
        for (Transport transport : values()) {
            if (str.equals(transport.a)) {
                return transport;
            }
        }
        throw new a(d.o("Transport ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.a);
    }
}
