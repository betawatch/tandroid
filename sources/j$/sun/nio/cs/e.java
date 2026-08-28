package j$.sun.nio.cs;

import java.nio.CharBuffer;
import java.nio.charset.CoderResult;

/* loaded from: classes2.dex */
public final class e {
    public CoderResult a;
    public boolean b;

    public final int a(char c10, CharBuffer charBuffer) {
        if (Character.isHighSurrogate(c10)) {
            if (!charBuffer.hasRemaining()) {
                this.a = CoderResult.UNDERFLOW;
                return -1;
            }
            char c11 = charBuffer.get();
            if (Character.isLowSurrogate(c11)) {
                int codePoint = Character.toCodePoint(c10, c11);
                this.b = true;
                this.a = null;
                return codePoint;
            }
            this.a = CoderResult.malformedForLength(1);
            return -1;
        }
        if (Character.isLowSurrogate(c10)) {
            this.a = CoderResult.malformedForLength(1);
            return -1;
        }
        this.b = false;
        this.a = null;
        return c10;
    }

    public final int b(char c10, char[] cArr, int i9, int i10) {
        if (!Character.isHighSurrogate(c10)) {
            if (Character.isLowSurrogate(c10)) {
                this.a = CoderResult.malformedForLength(1);
                return -1;
            }
            this.b = false;
            this.a = null;
            return c10;
        }
        if (i10 - i9 < 2) {
            this.a = CoderResult.UNDERFLOW;
            return -1;
        }
        char c11 = cArr[i9 + 1];
        if (Character.isLowSurrogate(c11)) {
            int codePoint = Character.toCodePoint(c10, c11);
            this.b = true;
            this.a = null;
            return codePoint;
        }
        this.a = CoderResult.malformedForLength(1);
        return -1;
    }
}
