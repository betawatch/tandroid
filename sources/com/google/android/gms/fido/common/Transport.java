package com.google.android.gms.fido.common;

import a4.w;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i4.g;
import m6.a;
import z6.h1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public enum Transport implements ReflectedParcelable {
    /* JADX INFO: Fake field, exist only in values array */
    EF7("bt"),
    /* JADX INFO: Fake field, exist only in values array */
    EF17("ble"),
    /* JADX INFO: Fake field, exist only in values array */
    EF27("nfc"),
    /* JADX INFO: Fake field, exist only in values array */
    EF38("usb"),
    /* JADX INFO: Fake field, exist only in values array */
    EF48("internal"),
    /* JADX INFO: Fake field, exist only in values array */
    EF58("cable"),
    /* JADX INFO: Fake field, exist only in values array */
    EF68("hybrid");

    public static final Parcelable.Creator<Transport> CREATOR = new g(25);
    public final String a;

    Transport(String str) {
        this.a = str;
    }

    public static Transport a(String str) {
        if (str.equals("hybrid")) {
            h1.a.a();
            throw null;
        }
        for (Transport transport : values()) {
            if (str.equals(transport.a)) {
                return transport;
            }
        }
        throw new a(w.n("Transport ", str, " not supported"));
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
