// default package

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class hc7 {
    public final String a;
    public final String[] b;
    public final String c;
    public int d;

    public hc7(String str, String[] strArr, String str2) {
        this.a = str;
        this.b = strArr;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hc7) {
            return this.a.equals(((hc7) obj).a);
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
