package j$.sun.nio.cs;

import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

/* loaded from: classes2.dex */
final class b extends CharsetEncoder {
    private final e a;

    @Override // java.nio.charset.CharsetEncoder
    public final boolean canEncode(char c) {
        return c <= 255;
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean isLegalReplacement(byte[] bArr) {
        return true;
    }

    b(c cVar) {
        super(cVar, 1.0f, 1.0f);
        this.a = new e();
    }

    private static int a(char[] cArr, int i, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        if (i3 <= 0) {
            return 0;
        }
        Objects.requireNonNull(cArr);
        Objects.requireNonNull(bArr);
        if (i < 0 || i >= cArr.length) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        if (i2 < 0 || i2 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i2);
        }
        int i5 = (i + i3) - 1;
        if (i5 < 0 || i5 >= cArr.length) {
            throw new ArrayIndexOutOfBoundsException(i5);
        }
        int i6 = (i2 + i3) - 1;
        if (i6 < 0 || i6 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i6);
        }
        while (i4 < i3) {
            int i7 = i + 1;
            char c = cArr[i];
            if (c > 255) {
                break;
            }
            bArr[i2] = (byte) c;
            i4++;
            i = i7;
            i2++;
        }
        return i4;
    }

    @Override // java.nio.charset.CharsetEncoder
    protected final CoderResult encodeLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
        CoderResult coderResult;
        CoderResult coderResult2;
        boolean hasArray = charBuffer.hasArray();
        e eVar = this.a;
        if (hasArray && byteBuffer.hasArray()) {
            char[] array = charBuffer.array();
            int arrayOffset = charBuffer.arrayOffset();
            int position = charBuffer.position() + arrayOffset;
            int limit = charBuffer.limit() + arrayOffset;
            if (position > limit) {
                position = limit;
            }
            byte[] array2 = byteBuffer.array();
            int arrayOffset2 = byteBuffer.arrayOffset();
            int position2 = byteBuffer.position() + arrayOffset2;
            int limit2 = byteBuffer.limit() + arrayOffset2;
            if (position2 > limit2) {
                position2 = limit2;
            }
            int i = limit2 - position2;
            int i2 = limit - position;
            if (i >= i2) {
                i = i2;
            }
            try {
                int a = a(array, position, array2, position2, i);
                int i3 = position + a;
                int i4 = position2 + a;
                if (a != i) {
                    if (eVar.c(array[i3], array, i3, limit) < 0) {
                        coderResult2 = eVar.a();
                    } else {
                        coderResult2 = eVar.d();
                    }
                } else if (i < i2) {
                    coderResult2 = CoderResult.OVERFLOW;
                } else {
                    coderResult2 = CoderResult.UNDERFLOW;
                }
                return coderResult2;
            } catch (Throwable th) {
                throw th;
            }
        }
        int position3 = charBuffer.position();
        while (true) {
            try {
                if (charBuffer.hasRemaining()) {
                    char c = charBuffer.get();
                    if (c <= 255) {
                        if (!byteBuffer.hasRemaining()) {
                            coderResult = CoderResult.OVERFLOW;
                            break;
                        }
                        byteBuffer.put((byte) c);
                        position3++;
                    } else if (eVar.b(c, charBuffer) < 0) {
                        coderResult = eVar.a();
                    } else {
                        coderResult = eVar.d();
                    }
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
