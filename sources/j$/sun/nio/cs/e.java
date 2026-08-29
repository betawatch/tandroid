package j$.sun.nio.cs;

import java.nio.CharBuffer;
import java.nio.charset.CoderResult;

/* loaded from: classes2.dex */
public final class e {
    public CoderResult a;
    public boolean b;

    public final int a(char c3, CharBuffer charBuffer) {
        if (Character.isHighSurrogate(c3)) {
            if (!charBuffer.hasRemaining()) {
                this.a = CoderResult.UNDERFLOW;
                return -1;
            }
            char c6 = charBuffer.get();
            if (Character.isLowSurrogate(c6)) {
                int codePoint = Character.toCodePoint(c3, c6);
                this.b = true;
                this.a = null;
                return codePoint;
            }
            this.a = CoderResult.malformedForLength(1);
            return -1;
        }
        if (Character.isLowSurrogate(c3)) {
            this.a = CoderResult.malformedForLength(1);
            return -1;
        }
        this.b = false;
        this.a = null;
        return c3;
    }

    public final int b(char c3, char[] cArr, int i10, int i11) {
        if (!Character.isHighSurrogate(c3)) {
            if (Character.isLowSurrogate(c3)) {
                this.a = CoderResult.malformedForLength(1);
                return -1;
            }
            this.b = false;
            this.a = null;
            return c3;
        }
        if (i11 - i10 < 2) {
            this.a = CoderResult.UNDERFLOW;
            return -1;
        }
        char c6 = cArr[i10 + 1];
        if (Character.isLowSurrogate(c6)) {
            int codePoint = Character.toCodePoint(c3, c6);
            this.b = true;
            this.a = null;
            return codePoint;
        }
        this.a = CoderResult.malformedForLength(1);
        return -1;
    }
}
