package f9;

import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class c extends i {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public c(i iVar) {
        iVar.getClass();
        this.b = iVar;
    }

    @Override // f9.l
    public final boolean apply(Object obj) {
        switch (this.a) {
        }
        return c(((Character) obj).charValue());
    }

    @Override // f9.i
    public final boolean c(char c2) {
        switch (this.a) {
            case 0:
                return Arrays.binarySearch((char[]) this.b, c2) >= 0;
            default:
                return !((i) this.b).c(c2);
        }
    }

    @Override // f9.i
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
                for (char c2 : (char[]) this.b) {
                    sb2.append(i.a(c2));
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
