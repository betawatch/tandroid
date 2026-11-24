// default package

import android.text.TextUtils;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class fba {
    public au8 a;
    public long b;
    public boolean c;
    public boolean d;
    public long e;

    public fba(au8 au8Var) {
        this.a = au8Var;
    }

    public static fba a(int i, SerializedData serializedData) {
        long j;
        long j2;
        i46 a = au8.a();
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
            a.o(au8.f(serializedData.readInt32(false)));
        } else {
            a.o(TextUtils.isEmpty(readString4) ? 1 : 2);
        }
        fba fbaVar = new fba(a.c());
        fbaVar.e = j2;
        fbaVar.b = j;
        fbaVar.d = j > 0;
        return fbaVar;
    }
}
