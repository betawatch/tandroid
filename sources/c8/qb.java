package c8;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public abstract class qb {
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
