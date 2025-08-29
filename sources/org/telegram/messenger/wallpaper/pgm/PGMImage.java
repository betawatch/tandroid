package org.telegram.messenger.wallpaper.pgm;

import android.graphics.Bitmap;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class PGMImage {
    public static void write(Bitmap bitmap, OutputStream outputStream, List list) {
        if (bitmap.getConfig() != Bitmap.Config.ALPHA_8) {
            throw new IllegalArgumentException("Only Bitmap.Config.ALPHA_8 is supported");
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        outputStream.write("P5\n".getBytes(StandardCharsets.US_ASCII));
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                outputStream.write(("#" + (str == null ? "" : str.replace('\r', ' ').replace('\n', ' ')) + "\n").getBytes(StandardCharsets.US_ASCII));
            }
        }
        Charset charset = StandardCharsets.US_ASCII;
        outputStream.write((width + " " + height + "\n").getBytes(charset));
        outputStream.write("255\n".getBytes(charset));
        int rowBytes = bitmap.getRowBytes();
        byte[] bArr = new byte[rowBytes * height];
        bitmap.copyPixelsToBuffer(ByteBuffer.wrap(bArr));
        int i = 0;
        int i2 = 0;
        while (i < height) {
            outputStream.write(bArr, i2, width);
            i++;
            i2 += rowBytes;
        }
    }

    public static Bitmap read(InputStream inputStream, List list) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        String nextToken = nextToken(bufferedInputStream, list);
        if (!"P5".equals(nextToken)) {
            throw new IOException("Not a binary PGM (P5), got: " + nextToken);
        }
        int parsePositiveInt = parsePositiveInt(nextNonCommentToken(bufferedInputStream, list), "width");
        int parsePositiveInt2 = parsePositiveInt(nextNonCommentToken(bufferedInputStream, list), "height");
        int parsePositiveInt3 = parsePositiveInt(nextNonCommentToken(bufferedInputStream, list), "maxval");
        if (parsePositiveInt3 != 255) {
            throw new IOException("Only 8-bit PGM supported (maxval=255), got: " + parsePositiveInt3);
        }
        Bitmap createBitmap = Bitmap.createBitmap(parsePositiveInt, parsePositiveInt2, Bitmap.Config.ALPHA_8);
        int rowBytes = createBitmap.getRowBytes();
        byte[] bArr = new byte[rowBytes * parsePositiveInt2];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        byte[] bArr2 = new byte[parsePositiveInt];
        int i = 0;
        for (int i2 = 0; i2 < parsePositiveInt2; i2++) {
            readFully(bufferedInputStream, bArr2, 0, parsePositiveInt);
            System.arraycopy(bArr2, 0, bArr, i, parsePositiveInt);
            i += rowBytes;
        }
        createBitmap.copyPixelsFromBuffer(wrap);
        return createBitmap;
    }

    private static int parsePositiveInt(String str, String str2) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt > 0) {
                return parseInt;
            }
            throw new IOException("Invalid " + str2 + ": " + parseInt);
        } catch (NumberFormatException e) {
            throw new IOException("Invalid " + str2 + ": " + str, e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        return r0.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String nextToken(BufferedInputStream bufferedInputStream, List list) {
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
                String readLineAscii = readLineAscii(bufferedInputStream);
                if (list != null) {
                    list.add(readLineAscii);
                }
                if (sb.length() > 0) {
                    return sb.toString();
                }
            } else {
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
            }
        }
    }

    private static String nextNonCommentToken(BufferedInputStream bufferedInputStream, List list) {
        String nextToken;
        do {
            nextToken = nextToken(bufferedInputStream, list);
            if (nextToken == null) {
                throw new IOException("Unexpected EOF in header");
            }
        } while (nextToken.startsWith("#"));
        return nextToken;
    }

    private static String readLineAscii(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = inputStream.read();
            if (read == -1 || read == 10) {
                break;
            }
            if (read != 13) {
                sb.append((char) read);
            }
        }
        return sb.toString();
    }

    private static void readFully(InputStream inputStream, byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i + i3, i2 - i3);
            if (read < 0) {
                throw new IOException("Unexpected EOF");
            }
            i3 += read;
        }
    }
}
