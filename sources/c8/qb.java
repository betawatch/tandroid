package c8;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
