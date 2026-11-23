package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class bz {
    public xi.a a;
    public long b;
    public boolean c;
    public boolean d;
    public long e;

    public bz(xi.a aVar) {
        this.a = aVar;
    }

    public static bz a(int i7, SerializedData serializedData) {
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
        bz bzVar = new bz(a10.d());
        bzVar.e = j10;
        bzVar.b = j3;
        bzVar.d = j3 > 0;
        return bzVar;
    }
}
