package d9;

import java.util.Arrays;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public class c extends i {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public c(i iVar) {
        iVar.getClass();
        this.b = iVar;
    }

    @Override // d9.m
    public final boolean apply(Object obj) {
        switch (this.a) {
        }
        return c(((Character) obj).charValue());
    }

    @Override // d9.i
    public final boolean c(char c10) {
        switch (this.a) {
            case 0:
                return Arrays.binarySearch((char[]) this.b, c10) >= 0;
            default:
                return !((i) this.b).c(c10);
        }
    }

    @Override // d9.i
    public i d() {
        switch (this.a) {
            case 1:
                return (i) this.b;
            default:
                return super.d();
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("CharMatcher.anyOf(\"");
                for (char c10 : (char[]) this.b) {
                    sb2.append(i.a(c10));
                }
                sb2.append("\")");
                return sb2.toString();
            default:
                return ((i) this.b) + ".negate()";
        }
    }

    public c(String str) {
        char[] charArray = str.toString().toCharArray();
        this.b = charArray;
        Arrays.sort(charArray);
    }
}
