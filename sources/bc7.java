// default package

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bc7 {
    public final String a;
    public final String[] b;
    public final String c;
    public int d;

    public bc7(String str, String[] strArr, String str2) {
        this.a = str;
        this.b = strArr;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bc7) {
            return this.a.equals(((bc7) obj).a);
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
