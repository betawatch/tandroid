package j$.sun.nio.cs;

import java.nio.CharBuffer;
import java.nio.charset.CoderResult;

/* loaded from: classes2.dex */
public final class e {
    public CoderResult a;
    public boolean b;

    public final int a(char c, CharBuffer charBuffer) {
        if (Character.isHighSurrogate(c)) {
            if (!charBuffer.hasRemaining()) {
                this.a = CoderResult.UNDERFLOW;
                return -1;
            }
            char c2 = charBuffer.get();
            if (Character.isLowSurrogate(c2)) {
                int codePoint = Character.toCodePoint(c, c2);
                this.b = true;
                this.a = null;
                return codePoint;
            }
            this.a = CoderResult.malformedForLength(1);
            return -1;
        }
        if (Character.isLowSurrogate(c)) {
            this.a = CoderResult.malformedForLength(1);
            return -1;
        }
        this.b = false;
        this.a = null;
        return c;
    }

    public final int b(char c, char[] cArr, int i, int i2) {
        if (!Character.isHighSurrogate(c)) {
            if (Character.isLowSurrogate(c)) {
                this.a = CoderResult.malformedForLength(1);
                return -1;
            }
            this.b = false;
            this.a = null;
            return c;
        }
        if (i2 - i < 2) {
            this.a = CoderResult.UNDERFLOW;
            return -1;
        }
        char c2 = cArr[i + 1];
        if (Character.isLowSurrogate(c2)) {
            int codePoint = Character.toCodePoint(c, c2);
            this.b = true;
            this.a = null;
            return codePoint;
        }
        this.a = CoderResult.malformedForLength(1);
        return -1;
    }
}
