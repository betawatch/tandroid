package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class sz {
    public ji.b a;
    public long b;
    public boolean c;
    public boolean d;
    public long e;

    public sz(ji.b bVar) {
        this.a = bVar;
    }

    public static sz a(int i10, SerializedData serializedData) {
        long j10;
        long j11;
        ji.a a2 = ji.b.a();
        String readString = serializedData.readString(false);
        if (readString == null) {
            readString = "";
        }
        a2.c = readString;
        a2.b = serializedData.readInt32(false);
        String readString2 = serializedData.readString(false);
        if (readString2 == null) {
            readString2 = "";
        }
        a2.d = readString2;
        String readString3 = serializedData.readString(false);
        if (readString3 == null) {
            readString3 = "";
        }
        a2.e = readString3;
        String readString4 = serializedData.readString(false);
        a2.f = readString4 != null ? readString4 : "";
        if (i10 >= 2) {
            j10 = serializedData.readInt64(false);
            j11 = serializedData.readInt64(false);
        } else {
            j10 = 0;
            j11 = 0;
        }
        if (i10 >= 3) {
            int e = ji.b.e(serializedData.readInt32(false));
            if (e == 0) {
                e = 1;
            }
            a2.a = e;
        } else {
            a2.a = TextUtils.isEmpty(readString4) ? 1 : 2;
        }
        sz szVar = new sz(a2.d());
        szVar.e = j11;
        szVar.b = j10;
        szVar.d = j10 > 0;
        return szVar;
    }
}
