// default package

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class hg7 {
    public static final SecureRandom a = new SecureRandom();

    public static byte[] a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static String b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                if (byteArrayOutputStream.size() == 0) {
                    return null;
                }
            } else {
                if (read == 10) {
                    break;
                }
                if (read != 13) {
                    byteArrayOutputStream.write(read);
                } else {
                    int read2 = inputStream.read();
                    if (read2 == -1) {
                        byteArrayOutputStream.write(read);
                        break;
                    }
                    if (read2 == 10) {
                        break;
                    }
                    byteArrayOutputStream.write(read);
                    byteArrayOutputStream.write(read2);
                }
            }
        }
        return byteArrayOutputStream.toString("UTF-8");
    }
}
