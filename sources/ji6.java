// default package

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ji6 {
    public final HashMap a = new HashMap();
    public File b;
    public long c;
    public long d;

    public final FilterInputStream a() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new ii6(this.c, this.d, this.b));
        HashMap hashMap = this.a;
        ki6 ki6Var = (ki6) hashMap.get("content-transfer-encoding");
        if ("base64".equals(ki6Var == null ? null : ki6Var.a)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        ki6 ki6Var2 = (ki6) hashMap.get("content-transfer-encoding");
        return "quoted-printable".equalsIgnoreCase(ki6Var2 != null ? ki6Var2.a : null) ? new li6(bufferedInputStream, (byte) 0) : bufferedInputStream;
    }
}
