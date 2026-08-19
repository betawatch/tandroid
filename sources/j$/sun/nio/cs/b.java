package j$.sun.nio.cs;

import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

/* loaded from: classes2.dex */
public final class b extends CharsetEncoder {
    public final e a;

    @Override // java.nio.charset.CharsetEncoder
    public final boolean canEncode(char c) {
        return c <= 255;
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean isLegalReplacement(byte[] bArr) {
        return true;
    }

    public b(c cVar) {
        super(cVar, 1.0f, 1.0f);
        e eVar = new e();
        eVar.a = CoderResult.UNDERFLOW;
        this.a = eVar;
    }

    public static int a(char[] cArr, int i, byte[] bArr, int i2, int i3) {
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
    public final CoderResult encodeLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
        CoderResult coderResult;
        CoderResult coderResult2;
        boolean hasArray = charBuffer.hasArray();
        int i = 2;
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
            int i2 = limit2 - position2;
            int i3 = limit - position;
            if (i2 >= i3) {
                i2 = i3;
            }
            try {
                int a = a(array, position, array2, position2, i2);
                int i4 = position + a;
                int i5 = position2 + a;
                if (a != i2) {
                    if (eVar.b(array[i4], array, i4, limit) < 0) {
                        coderResult2 = eVar.a;
                    } else {
                        if (!eVar.b) {
                            i = 1;
                        }
                        coderResult2 = CoderResult.unmappableForLength(i);
                    }
                } else if (i2 < i3) {
                    coderResult2 = CoderResult.OVERFLOW;
                } else {
                    coderResult2 = CoderResult.UNDERFLOW;
                }
                return coderResult2;
            } finally {
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
                    } else if (eVar.a(c, charBuffer) < 0) {
                        coderResult = eVar.a;
                    } else {
                        if (!eVar.b) {
                            i = 1;
                        }
                        coderResult = CoderResult.unmappableForLength(i);
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
