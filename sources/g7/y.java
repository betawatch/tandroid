package g7;

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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class y {
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
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            bufferedInputStream.mark(1);
            int read = bufferedInputStream.read();
            if (read == -1) {
                if (sb2.length() == 0) {
                    return null;
                }
                return sb2.toString();
            }
            if (Character.isWhitespace(read)) {
                if (sb2.length() > 0) {
                    return sb2.toString();
                }
            } else {
                if (read != 35) {
                    sb2.append((char) read);
                    while (true) {
                        bufferedInputStream.mark(1);
                        int read2 = bufferedInputStream.read();
                        if (read2 == -1 || Character.isWhitespace(read2)) {
                            break;
                        }
                        if (read2 == 35) {
                            bufferedInputStream.reset();
                            return sb2.toString();
                        }
                        sb2.append((char) read2);
                    }
                    return sb2.toString();
                }
                StringBuilder sb3 = new StringBuilder();
                while (true) {
                    int read3 = bufferedInputStream.read();
                    if (read3 == -1 || read3 == 10) {
                        break;
                    }
                    if (read3 != 13) {
                        sb3.append((char) read3);
                    }
                }
                arrayList.add(sb3.toString());
                if (sb2.length() > 0) {
                    return sb2.toString();
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
        } catch (NumberFormatException e10) {
            throw new IOException(j3.r0.o("Invalid ", str2, ": ", str), e10);
        }
    }

    public static Bitmap d(GZIPInputStream gZIPInputStream, ArrayList arrayList) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(gZIPInputStream);
        String b10 = b(bufferedInputStream, arrayList);
        if (!"P5".equals(b10)) {
            throw new IOException(ta.b.d("Not a binary PGM (P5), got: ", b10));
        }
        int c10 = c(a(bufferedInputStream, arrayList), "width");
        int c11 = c(a(bufferedInputStream, arrayList), "height");
        int c12 = c(a(bufferedInputStream, arrayList), "maxval");
        if (c12 != 255) {
            throw new IOException(j3.r0.l(c12, "Only 8-bit PGM supported (maxval=255), got: "));
        }
        Bitmap createBitmap = Bitmap.createBitmap(c10, c11, Bitmap.Config.ALPHA_8);
        int rowBytes = createBitmap.getRowBytes();
        byte[] bArr = new byte[rowBytes * c11];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        byte[] bArr2 = new byte[c10];
        int i9 = 0;
        for (int i10 = 0; i10 < c11; i10++) {
            int i11 = 0;
            while (i11 < c10) {
                int read = bufferedInputStream.read(bArr2, i11, c10 - i11);
                if (read < 0) {
                    throw new IOException("Unexpected EOF");
                }
                i11 += read;
            }
            System.arraycopy(bArr2, 0, bArr, i9, c10);
            i9 += rowBytes;
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
                gZIPOutputStream.write(aa.d.o("#", str == null ? "" : str.replace('\r', ' ').replace('\n', ' '), "\n").getBytes(StandardCharsets.US_ASCII));
            }
        }
        Charset charset = StandardCharsets.US_ASCII;
        gZIPOutputStream.write((width + " " + height + "\n").getBytes(charset));
        gZIPOutputStream.write("255\n".getBytes(charset));
        int rowBytes = bitmap.getRowBytes();
        byte[] bArr = new byte[rowBytes * height];
        bitmap.copyPixelsToBuffer(ByteBuffer.wrap(bArr));
        int i9 = 0;
        int i10 = 0;
        while (i9 < height) {
            gZIPOutputStream.write(bArr, i10, width);
            i9++;
            i10 += rowBytes;
        }
    }
}
