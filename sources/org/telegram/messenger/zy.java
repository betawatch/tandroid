package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class zy {
    public ui.a a;
    public long b;
    public boolean c;
    public boolean d;
    public long e;

    public zy(ui.a aVar) {
        this.a = aVar;
    }

    public static zy a(int i3, SerializedData serializedData) {
        long j10;
        long j11;
        m2.p0 a10 = ui.a.a();
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
        if (i3 >= 2) {
            j10 = serializedData.readInt64(false);
            j11 = serializedData.readInt64(false);
        } else {
            j10 = 0;
            j11 = 0;
        }
        if (i3 >= 3) {
            a10.p(ui.a.f(serializedData.readInt32(false)));
        } else {
            a10.p(TextUtils.isEmpty(readString4) ? 1 : 2);
        }
        zy zyVar = new zy(a10.d());
        zyVar.e = j11;
        zyVar.b = j10;
        zyVar.d = j10 > 0;
        return zyVar;
    }
}
