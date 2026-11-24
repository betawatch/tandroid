// default package

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class jg6 {
    public final HashMap a = new HashMap();
    public File b;
    public long c;
    public long d;

    public final FilterInputStream a() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new ig6(this.c, this.d, this.b));
        HashMap hashMap = this.a;
        kg6 kg6Var = (kg6) hashMap.get("content-transfer-encoding");
        if ("base64".equals(kg6Var == null ? null : kg6Var.a)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        kg6 kg6Var2 = (kg6) hashMap.get("content-transfer-encoding");
        return "quoted-printable".equalsIgnoreCase(kg6Var2 != null ? kg6Var2.a : null) ? new lg6(bufferedInputStream, (byte) 0) : bufferedInputStream;
    }
}
