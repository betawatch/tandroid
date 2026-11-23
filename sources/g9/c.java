package g9;

import java.util.Arrays;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public class c extends i {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public c(i iVar) {
        iVar.getClass();
        this.b = iVar;
    }

    @Override // g9.l
    public final boolean apply(Object obj) {
        switch (this.a) {
        }
        return c(((Character) obj).charValue());
    }

    @Override // g9.i
    public final boolean c(char c10) {
        switch (this.a) {
            case 0:
                return Arrays.binarySearch((char[]) this.b, c10) >= 0;
            default:
                return !((i) this.b).c(c10);
        }
    }

    @Override // g9.i
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
