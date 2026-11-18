package org.telegram.messenger;

import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class yo {
    public final String a;
    public final String[] b;
    public final String c;
    public int d;

    public yo(String str, String[] strArr, String str2) {
        this.a = str;
        this.b = strArr;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yo) {
            return this.a.equals(((yo) obj).a);
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
