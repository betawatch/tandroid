package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class az {
    public xi.a a;
    public long b;
    public boolean c;
    public boolean d;
    public long e;

    public az(xi.a aVar) {
        this.a = aVar;
    }

    public static az a(int i7, SerializedData serializedData) {
        long j3;
        long j10;
        n2.o0 a10 = xi.a.a();
        String readString = serializedData.readString(false);
        if (readString == null) {
            readString = "";
        }
        a10.c = readString;
        a10.b = serializedData.readInt32(false);
        String readString2 = serializedData.readString(false);
        if (readString2 == null) {
            readString2 = "";
        }
        a10.d = readString2;
        String readString3 = serializedData.readString(false);
        if (readString3 == null) {
            readString3 = "";
        }
        a10.e = readString3;
        String readString4 = serializedData.readString(false);
        a10.f = readString4 != null ? readString4 : "";
        if (i7 >= 2) {
            j3 = serializedData.readInt64(false);
            j10 = serializedData.readInt64(false);
        } else {
            j3 = 0;
            j10 = 0;
        }
        if (i7 >= 3) {
            a10.p(xi.a.f(serializedData.readInt32(false)));
        } else {
            a10.p(TextUtils.isEmpty(readString4) ? 1 : 2);
        }
        az azVar = new az(a10.d());
        azVar.e = j10;
        azVar.b = j3;
        azVar.d = j3 > 0;
        return azVar;
    }
}
