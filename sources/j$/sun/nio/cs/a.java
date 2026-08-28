package j$.sun.nio.cs;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

/* loaded from: classes2.dex */
public final class a extends CharsetDecoder {
    public a(c cVar) {
        super(cVar, 1.0f, 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.nio.CharBuffer] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // java.nio.charset.CharsetDecoder
    public final CoderResult decodeLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        CoderResult coderResult;
        CoderResult coderResult2;
        if (byteBuffer.hasArray() && charBuffer.hasArray()) {
            byte[] array = byteBuffer.array();
            int position = byteBuffer.position() + byteBuffer.arrayOffset();
            int limit = byteBuffer.limit() + byteBuffer.arrayOffset();
            if (position > limit) {
                position = limit;
            }
            char[] array2 = charBuffer.array();
            int position2 = charBuffer.position() + charBuffer.arrayOffset();
            int limit2 = charBuffer.limit() + charBuffer.arrayOffset();
            if (position2 > limit2) {
                position2 = limit2;
            }
            while (true) {
                if (position < limit) {
                    try {
                        byte b10 = array[position];
                        if (position2 >= limit2) {
                            coderResult2 = CoderResult.OVERFLOW;
                            break;
                        }
                        int i9 = position2 + 1;
                        try {
                            array2[position2] = (char) (b10 & 255);
                            position++;
                            position2 = i9;
                        } catch (Throwable th) {
                            th = th;
                            position2 = i9;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    coderResult2 = CoderResult.UNDERFLOW;
                    break;
                }
            }
            position -= byteBuffer.arrayOffset();
            position2 -= charBuffer.arrayOffset();
            byteBuffer = (CharBuffer) charBuffer.position(position2);
            return coderResult2;
        }
        int position3 = byteBuffer.position();
        while (true) {
            try {
                if (byteBuffer.hasRemaining()) {
                    byte b11 = byteBuffer.get();
                    if (!charBuffer.hasRemaining()) {
                        coderResult = CoderResult.OVERFLOW;
                        break;
                    }
                    charBuffer.put((char) (b11 & 255));
                    position3++;
                } else {
                    coderResult = CoderResult.UNDERFLOW;
                    break;
                }
            } finally {
            }
        }
        return coderResult;
    }
}
