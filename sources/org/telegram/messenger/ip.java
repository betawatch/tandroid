package org.telegram.messenger;

import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class ip {
    public final String a;
    public final String[] b;
    public final String c;
    public int d;

    public ip(String str, String[] strArr, String str2) {
        this.a = str;
        this.b = strArr;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ip) {
            return this.a.equals(((ip) obj).a);
        }
        return false;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.d);
        serializedData.writeInt32(0);
        serializedData.writeString(this.a);
        String[] strArr = this.b;
        serializedData.writeInt32(strArr != null ? strArr.length : 0);
        if (strArr != null) {
            for (String str : strArr) {
                serializedData.writeString(str);
            }
        }
        serializedData.writeString(this.c);
        return Utilities.f(serializedData.toByteArray());
    }
}
