package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import b7.m1;
import com.google.android.gms.common.internal.ReflectedParcelable;
import l4.j;
import o6.a;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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

    public static final Parcelable.Creator<Transport> CREATOR = new j(18);
    public final String a;

    Transport(String str) {
        this.a = str;
    }

    public static Transport a(String str) {
        if (str.equals("hybrid")) {
            m1.a.b();
            throw null;
        }
        for (Transport transport : values()) {
            if (str.equals(transport.a)) {
                return transport;
            }
        }
        throw new a(android.support.v4.media.a.o("Transport ", str, " not supported"));
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
