// default package

import android.util.Base64InputStream;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.util.HashMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ni6 {
    public final HashMap a = new HashMap();
    public File b;
    public long c;
    public long d;

    public final FilterInputStream a() {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new mi6(this.c, this.d, this.b));
        HashMap hashMap = this.a;
        oi6 oi6Var = (oi6) hashMap.get("content-transfer-encoding");
        if ("base64".equals(oi6Var == null ? null : oi6Var.a)) {
            return new Base64InputStream(bufferedInputStream, 0);
        }
        oi6 oi6Var2 = (oi6) hashMap.get("content-transfer-encoding");
        return "quoted-printable".equalsIgnoreCase(oi6Var2 != null ? oi6Var2.a : null) ? new pi6(bufferedInputStream, (byte) 0) : bufferedInputStream;
    }
}
