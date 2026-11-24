// default package

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class mb implements o63 {
    public final o63 a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream d;

    public mb(o63 o63Var, byte[] bArr, byte[] bArr2) {
        this.a = o63Var;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // o63
    public final void addTransferListener(vyb vybVar) {
        vybVar.getClass();
        this.a.addTransferListener(vybVar);
    }

    @Override // o63
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.a.close();
        }
    }

    @Override // o63
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // o63
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // o63
    public final long open(u63 u63Var) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                s63 s63Var = new s63(this.a, u63Var);
                this.d = new CipherInputStream(s63Var, cipher);
                if (s63Var.d) {
                    return -1L;
                }
                s63Var.a.open(s63Var.b);
                s63Var.d = true;
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                sdb.b(e);
                return 0L;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            sdb.b(e2);
            return 0L;
        }
    }

    @Override // g63
    public final int read(byte[] bArr, int i, int i2) {
        this.d.getClass();
        int read = this.d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
