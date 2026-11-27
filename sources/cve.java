// default package

import android.graphics.Bitmap;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public abstract class cve {
    public static String a(BufferedInputStream bufferedInputStream, ArrayList arrayList) {
        String b;
        do {
            b = b(bufferedInputStream, arrayList);
            if (b == null) {
                su3.e("Unexpected EOF in header");
                return null;
            }
        } while (b.startsWith("#"));
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0082, code lost:
    
        return r0.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b(BufferedInputStream bufferedInputStream, ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            bufferedInputStream.mark(1);
            int read = bufferedInputStream.read();
            if (read == -1) {
                if (sb.length() == 0) {
                    return null;
                }
                return sb.toString();
            }
            if (Character.isWhitespace(read)) {
                if (sb.length() > 0) {
                    return sb.toString();
                }
            } else if (read == 35) {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    int read2 = bufferedInputStream.read();
                    if (read2 == -1 || read2 == 10) {
                        break;
                    }
                    if (read2 != 13) {
                        sb2.append((char) read2);
                    }
                }
                arrayList.add(sb2.toString());
                if (sb.length() > 0) {
                    return sb.toString();
                }
            } else {
                sb.append((char) read);
                while (true) {
                    bufferedInputStream.mark(1);
                    int read3 = bufferedInputStream.read();
                    if (read3 == -1 || Character.isWhitespace(read3)) {
                        break;
                    }
                    if (read3 == 35) {
                        bufferedInputStream.reset();
                        return sb.toString();
                    }
                    sb.append((char) read3);
                }
            }
        }
    }

    public static int c(String str, String str2) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt > 0) {
                return parseInt;
            }
            throw new IOException("Invalid " + str2 + ": " + parseInt);
        } catch (NumberFormatException e) {
            throw new IOException(qd4.q("Invalid ", str2, ": ", str), e);
        }
    }

    public static Bitmap d(GZIPInputStream gZIPInputStream, ArrayList arrayList) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(gZIPInputStream);
        String b = b(bufferedInputStream, arrayList);
        if (!"P5".equals(b)) {
            su3.e(c00.i("Not a binary PGM (P5), got: ", b));
            return null;
        }
        int c = c(a(bufferedInputStream, arrayList), "width");
        int c2 = c(a(bufferedInputStream, arrayList), "height");
        int c3 = c(a(bufferedInputStream, arrayList), "maxval");
        if (c3 != 255) {
            su3.e(uh9.k(c3, "Only 8-bit PGM supported (maxval=255), got: "));
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(c, c2, Bitmap.Config.ALPHA_8);
        int rowBytes = createBitmap.getRowBytes();
        byte[] bArr = new byte[rowBytes * c2];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        byte[] bArr2 = new byte[c];
        int i = 0;
        for (int i2 = 0; i2 < c2; i2++) {
            int i3 = 0;
            while (i3 < c) {
                int read = bufferedInputStream.read(bArr2, i3, c - i3);
                if (read < 0) {
                    su3.e("Unexpected EOF");
                    return null;
                }
                i3 += read;
            }
            System.arraycopy(bArr2, 0, bArr, i, c);
            i += rowBytes;
        }
        createBitmap.copyPixelsFromBuffer(wrap);
        return createBitmap;
    }

    public static void e(Bitmap bitmap, GZIPOutputStream gZIPOutputStream, List list) {
        if (bitmap.getConfig() != Bitmap.Config.ALPHA_8) {
            lq5.j("Only Bitmap.Config.ALPHA_8 is supported");
            return;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        gZIPOutputStream.write("P5\n".getBytes(StandardCharsets.US_ASCII));
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                gZIPOutputStream.write(qd4.y("#", str == null ? "" : str.replace('\r', ' ').replace('\n', ' '), "\n").getBytes(StandardCharsets.US_ASCII));
            }
        }
        Charset charset = StandardCharsets.US_ASCII;
        gZIPOutputStream.write((width + " " + height + "\n").getBytes(charset));
        gZIPOutputStream.write("255\n".getBytes(charset));
        int rowBytes = bitmap.getRowBytes();
        byte[] bArr = new byte[rowBytes * height];
        bitmap.copyPixelsToBuffer(ByteBuffer.wrap(bArr));
        int i = 0;
        int i2 = 0;
        while (i < height) {
            gZIPOutputStream.write(bArr, i2, width);
            i++;
            i2 += rowBytes;
        }
    }
}
