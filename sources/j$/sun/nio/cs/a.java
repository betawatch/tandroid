package j$.sun.nio.cs;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public final class a extends CharsetDecoder {
    public a(c cVar) {
        super(cVar, 1.0f, 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.nio.CharBuffer] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.nio.ByteBuffer] */
    @Override // java.nio.charset.CharsetDecoder
    public final CoderResult decodeLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        CoderResult coderResult;
        CoderResult coderResult2;
        if (!byteBuffer.hasArray() || !charBuffer.hasArray()) {
            int position = byteBuffer.position();
            while (true) {
                try {
                    if (!byteBuffer.hasRemaining()) {
                        coderResult = CoderResult.UNDERFLOW;
                        break;
                    }
                    byte b = byteBuffer.get();
                    if (!charBuffer.hasRemaining()) {
                        coderResult = CoderResult.OVERFLOW;
                        break;
                    }
                    charBuffer.put((char) (b & 255));
                    position++;
                } finally {
                }
            }
            return coderResult;
        }
        byte[] array = byteBuffer.array();
        int position2 = byteBuffer.position() + byteBuffer.arrayOffset();
        int limit = byteBuffer.limit() + byteBuffer.arrayOffset();
        if (position2 > limit) {
            position2 = limit;
        }
        char[] array2 = charBuffer.array();
        int position3 = charBuffer.position() + charBuffer.arrayOffset();
        int limit2 = charBuffer.limit() + charBuffer.arrayOffset();
        if (position3 > limit2) {
            position3 = limit2;
        }
        while (true) {
            if (position2 >= limit) {
                coderResult2 = CoderResult.UNDERFLOW;
                break;
            }
            try {
                byte b2 = array[position2];
                if (position3 >= limit2) {
                    coderResult2 = CoderResult.OVERFLOW;
                    break;
                }
                int i = position3 + 1;
                try {
                    array2[position3] = (char) (b2 & 255);
                    position2++;
                    position3 = i;
                } catch (Throwable th) {
                    th = th;
                    position3 = i;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        position2 -= byteBuffer.arrayOffset();
        position3 -= charBuffer.arrayOffset();
        byteBuffer = (CharBuffer) charBuffer.position(position3);
        return coderResult2;
    }
}
