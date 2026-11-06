package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class hz {
    public ui.a a;
    public long b;
    public boolean c;
    public boolean d;
    public long e;

    public hz(ui.a aVar) {
        this.a = aVar;
    }

    public static hz a(int i7, SerializedData serializedData) {
        long j3;
        long j10;
        n2.n0 a10 = ui.a.a();
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
            a10.p(ui.a.f(serializedData.readInt32(false)));
        } else {
            a10.p(TextUtils.isEmpty(readString4) ? 1 : 2);
        }
        hz hzVar = new hz(a10.d());
        hzVar.e = j10;
        hzVar.b = j3;
        hzVar.d = j3 > 0;
        return hzVar;
    }
}
