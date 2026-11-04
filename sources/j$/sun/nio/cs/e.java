package j$.sun.nio.cs;

import java.nio.CharBuffer;
import java.nio.charset.CoderResult;

/* loaded from: classes2.dex */
public final class e {
    public CoderResult a;
    public boolean b;

    public final int a(char c2, CharBuffer charBuffer) {
        if (Character.isHighSurrogate(c2)) {
            if (!charBuffer.hasRemaining()) {
                this.a = CoderResult.UNDERFLOW;
                return -1;
            }
            char c10 = charBuffer.get();
            if (Character.isLowSurrogate(c10)) {
                int codePoint = Character.toCodePoint(c2, c10);
                this.b = true;
                this.a = null;
                return codePoint;
            }
            this.a = CoderResult.malformedForLength(1);
            return -1;
        }
        if (Character.isLowSurrogate(c2)) {
            this.a = CoderResult.malformedForLength(1);
            return -1;
        }
        this.b = false;
        this.a = null;
        return c2;
    }

    public final int b(char c2, char[] cArr, int i3, int i10) {
        if (!Character.isHighSurrogate(c2)) {
            if (Character.isLowSurrogate(c2)) {
                this.a = CoderResult.malformedForLength(1);
                return -1;
            }
            this.b = false;
            this.a = null;
            return c2;
        }
        if (i10 - i3 < 2) {
            this.a = CoderResult.UNDERFLOW;
            return -1;
        }
        char c10 = cArr[i3 + 1];
        if (Character.isLowSurrogate(c10)) {
            int codePoint = Character.toCodePoint(c2, c10);
            this.b = true;
            this.a = null;
            return codePoint;
        }
        this.a = CoderResult.malformedForLength(1);
        return -1;
    }
}
