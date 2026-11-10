package com.google.android.gms.fido.common;

import a8.p0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import q7.h1;
import w.a;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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

    public static final Parcelable.Creator<Transport> CREATOR = new a(28);
    public final String a;

    Transport(String str) {
        this.a = str;
    }

    public static Transport a(String str) {
        if (str.equals("hybrid")) {
            h1.a.T();
            throw null;
        }
        for (Transport transport : values()) {
            if (str.equals(transport.a)) {
                return transport;
            }
        }
        throw new d7.a(p0.p("Transport ", str, " not supported"));
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
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.a);
    }
}
