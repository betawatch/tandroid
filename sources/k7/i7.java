package k7;

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
import org.telegram.ui.yh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class i7 {
    public static String a(BufferedInputStream bufferedInputStream, ArrayList arrayList) {
        String b10;
        do {
            b10 = b(bufferedInputStream, arrayList);
            if (b10 == null) {
                throw new IOException("Unexpected EOF in header");
            }
        } while (b10.startsWith("#"));
        return b10;
    }

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
            } else {
                if (read != 35) {
                    sb.append((char) read);
                    while (true) {
                        bufferedInputStream.mark(1);
                        int read2 = bufferedInputStream.read();
                        if (read2 == -1 || Character.isWhitespace(read2)) {
                            break;
                        }
                        if (read2 == 35) {
                            bufferedInputStream.reset();
                            return sb.toString();
                        }
                        sb.append((char) read2);
                    }
                    return sb.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    int read3 = bufferedInputStream.read();
                    if (read3 == -1 || read3 == 10) {
                        break;
                    }
                    if (read3 != 13) {
                        sb2.append((char) read3);
                    }
                }
                arrayList.add(sb2.toString());
                if (sb.length() > 0) {
                    return sb.toString();
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
        } catch (NumberFormatException e6) {
            throw new IOException(e2.c.k("Invalid ", str2, ": ", str), e6);
        }
    }

    public static Bitmap d(GZIPInputStream gZIPInputStream, ArrayList arrayList) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(gZIPInputStream);
        String b10 = b(bufferedInputStream, arrayList);
        if (!"P5".equals(b10)) {
            throw new IOException(yh.k("Not a binary PGM (P5), got: ", b10));
        }
        int c3 = c(a(bufferedInputStream, arrayList), "width");
        int c10 = c(a(bufferedInputStream, arrayList), "height");
        int c11 = c(a(bufferedInputStream, arrayList), "maxval");
        if (c11 != 255) {
            throw new IOException(l.d.j(c11, "Only 8-bit PGM supported (maxval=255), got: "));
        }
        Bitmap createBitmap = Bitmap.createBitmap(c3, c10, Bitmap.Config.ALPHA_8);
        int rowBytes = createBitmap.getRowBytes();
        byte[] bArr = new byte[rowBytes * c10];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        byte[] bArr2 = new byte[c3];
        int i10 = 0;
        for (int i11 = 0; i11 < c10; i11++) {
            int i12 = 0;
            while (i12 < c3) {
                int read = bufferedInputStream.read(bArr2, i12, c3 - i12);
                if (read < 0) {
                    throw new IOException("Unexpected EOF");
                }
                i12 += read;
            }
            System.arraycopy(bArr2, 0, bArr, i10, c3);
            i10 += rowBytes;
        }
        createBitmap.copyPixelsFromBuffer(wrap);
        return createBitmap;
    }

    public static void e(Bitmap bitmap, GZIPOutputStream gZIPOutputStream, List list) {
        if (bitmap.getConfig() != Bitmap.Config.ALPHA_8) {
            throw new IllegalArgumentException("Only Bitmap.Config.ALPHA_8 is supported");
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        gZIPOutputStream.write("P5\n".getBytes(StandardCharsets.US_ASCII));
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                gZIPOutputStream.write(android.support.v4.media.a.o("#", str == null ? "" : str.replace('\r', ' ').replace('\n', ' '), "\n").getBytes(StandardCharsets.US_ASCII));
            }
        }
        Charset charset = StandardCharsets.US_ASCII;
        gZIPOutputStream.write((width + " " + height + "\n").getBytes(charset));
        gZIPOutputStream.write("255\n".getBytes(charset));
        int rowBytes = bitmap.getRowBytes();
        byte[] bArr = new byte[rowBytes * height];
        bitmap.copyPixelsToBuffer(ByteBuffer.wrap(bArr));
        int i10 = 0;
        int i11 = 0;
        while (i10 < height) {
            gZIPOutputStream.write(bArr, i11, width);
            i10++;
            i11 += rowBytes;
        }
    }
}
