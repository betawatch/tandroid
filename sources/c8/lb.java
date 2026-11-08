package c8;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public abstract class lb {
    public static void a(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream) {
        kotlin.jvm.internal.j.e(inputStream, "<this>");
        byte[] bArr = new byte[TLObject.FLAG_13];
        int read = inputStream.read(bArr);
        while (read >= 0) {
            byteArrayOutputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
    }

    public static final byte[] b(InputStream inputStream) {
        kotlin.jvm.internal.j.e(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(TLObject.FLAG_13, inputStream.available()));
        a(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        kotlin.jvm.internal.j.d(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
