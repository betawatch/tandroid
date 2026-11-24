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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mb implements a83 {
    public final a83 a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream d;

    public mb(a83 a83Var, byte[] bArr, byte[] bArr2) {
        this.a = a83Var;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // a83
    public final void addTransferListener(w0c w0cVar) {
        w0cVar.getClass();
        this.a.addTransferListener(w0cVar);
    }

    @Override // a83
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.a.close();
        }
    }

    @Override // a83
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // a83
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // a83
    public final long open(g83 g83Var) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                e83 e83Var = new e83(this.a, g83Var);
                this.d = new CipherInputStream(e83Var, cipher);
                if (e83Var.d) {
                    return -1L;
                }
                e83Var.a.open(e83Var.b);
                e83Var.d = true;
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                rjb.m(e);
                return 0L;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            rjb.m(e2);
            return 0L;
        }
    }

    @Override // s73
    public final int read(byte[] bArr, int i, int i2) {
        this.d.getClass();
        int read = this.d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
