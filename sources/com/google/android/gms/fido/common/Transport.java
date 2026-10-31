package com.google.android.gms.fido.common;

import a1.g;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import n7.h1;
import w.a;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public enum Transport implements ReflectedParcelable {
    /* JADX INFO: Fake field, exist only in values array */
    EF7("bt"),
    /* JADX INFO: Fake field, exist only in values array */
    EF17("ble"),
    /* JADX INFO: Fake field, exist only in values array */
    EF27("nfc"),
    /* JADX INFO: Fake field, exist only in values array */
    EF37("usb"),
    /* JADX INFO: Fake field, exist only in values array */
    EF47("internal"),
    /* JADX INFO: Fake field, exist only in values array */
    EF57("cable"),
    /* JADX INFO: Fake field, exist only in values array */
    EF67("hybrid");

    public static final Parcelable.Creator<Transport> CREATOR = new a(3);
    public final String a;

    Transport(String str) {
        this.a = str;
    }

    public static Transport a(String str) {
        if (str.equals("hybrid")) {
            h1.a.O();
            throw null;
        }
        for (Transport transport : values()) {
            if (str.equals(transport.a)) {
                return transport;
            }
        }
        throw new a7.a(g.n("Transport ", str, " not supported"));
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
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.a);
    }
}
