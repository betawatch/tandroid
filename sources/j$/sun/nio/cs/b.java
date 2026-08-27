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
    public final boolean canEncode(char c10) {
        return c10 <= 255;
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

    public static int a(char[] cArr, int i10, byte[] bArr, int i11, int i12) {
        int i13 = 0;
        if (i12 <= 0) {
            return 0;
        }
        Objects.requireNonNull(cArr);
        Objects.requireNonNull(bArr);
        if (i10 < 0 || i10 >= cArr.length) {
            throw new ArrayIndexOutOfBoundsException(i10);
        }
        if (i11 < 0 || i11 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i11);
        }
        int i14 = (i10 + i12) - 1;
        if (i14 < 0 || i14 >= cArr.length) {
            throw new ArrayIndexOutOfBoundsException(i14);
        }
        int i15 = (i11 + i12) - 1;
        if (i15 < 0 || i15 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i15);
        }
        while (i13 < i12) {
            int i16 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 > 255) {
                break;
            }
            bArr[i11] = (byte) c10;
            i13++;
            i10 = i16;
            i11++;
        }
        return i13;
    }

    @Override // java.nio.charset.CharsetEncoder
    public final CoderResult encodeLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
        CoderResult coderResult;
        CoderResult coderResult2;
        int i10 = 2;
        if (!charBuffer.hasArray() || !byteBuffer.hasArray()) {
            int position = charBuffer.position();
            while (true) {
                try {
                    if (!charBuffer.hasRemaining()) {
                        coderResult = CoderResult.UNDERFLOW;
                        break;
                    }
                    char c10 = charBuffer.get();
                    if (c10 <= 255) {
                        if (!byteBuffer.hasRemaining()) {
                            coderResult = CoderResult.OVERFLOW;
                            break;
                        }
                        byteBuffer.put((byte) c10);
                        position++;
                    } else if (this.a.a(c10, charBuffer) < 0) {
                        coderResult = this.a.a;
                    } else {
                        if (!this.a.b) {
                            i10 = 1;
                        }
                        coderResult = CoderResult.unmappableForLength(i10);
                    }
                } finally {
                }
            }
            return coderResult;
        }
        char[] array = charBuffer.array();
        int arrayOffset = charBuffer.arrayOffset();
        int position2 = charBuffer.position() + arrayOffset;
        int limit = charBuffer.limit() + arrayOffset;
        if (position2 > limit) {
            position2 = limit;
        }
        byte[] array2 = byteBuffer.array();
        int arrayOffset2 = byteBuffer.arrayOffset();
        int position3 = byteBuffer.position() + arrayOffset2;
        int limit2 = byteBuffer.limit() + arrayOffset2;
        if (position3 > limit2) {
            position3 = limit2;
        }
        int i11 = limit2 - position3;
        int i12 = limit - position2;
        if (i11 >= i12) {
            i11 = i12;
        }
        try {
            int a2 = a(array, position2, array2, position3, i11);
            int i13 = position2 + a2;
            int i14 = position3 + a2;
            if (a2 == i11) {
                coderResult2 = i11 < i12 ? CoderResult.OVERFLOW : CoderResult.UNDERFLOW;
            } else if (this.a.b(array[i13], array, i13, limit) < 0) {
                coderResult2 = this.a.a;
            } else {
                if (!this.a.b) {
                    i10 = 1;
                }
                coderResult2 = CoderResult.unmappableForLength(i10);
            }
            return coderResult2;
        } catch (Throwable th) {
            throw th;
        }
    }
}
