// default package

import android.text.TextUtils;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fda {
    public bw8 a;
    public long b;
    public boolean c;
    public boolean d;
    public long e;

    public fda(bw8 bw8Var) {
        this.a = bw8Var;
    }

    public static fda a(int i, SerializedData serializedData) {
        long j;
        long j2;
        i66 a = bw8.a();
        String readString = serializedData.readString(false);
        if (readString == null) {
            readString = "";
        }
        a.c = readString;
        a.b = serializedData.readInt32(false);
        String readString2 = serializedData.readString(false);
        if (readString2 == null) {
            readString2 = "";
        }
        a.d = readString2;
        String readString3 = serializedData.readString(false);
        if (readString3 == null) {
            readString3 = "";
        }
        a.e = readString3;
        String readString4 = serializedData.readString(false);
        a.f = readString4 != null ? readString4 : "";
        if (i >= 2) {
            j = serializedData.readInt64(false);
            j2 = serializedData.readInt64(false);
        } else {
            j = 0;
            j2 = 0;
        }
        if (i >= 3) {
            a.o(bw8.f(serializedData.readInt32(false)));
        } else {
            a.o(TextUtils.isEmpty(readString4) ? 1 : 2);
        }
        fda fdaVar = new fda(a.c());
        fdaVar.e = j2;
        fdaVar.b = j;
        fdaVar.d = j > 0;
        return fdaVar;
    }
}
