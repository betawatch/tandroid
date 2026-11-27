// default package

import java.util.regex.Pattern;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class al6 extends wp5 {
    public static final Pattern e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override // wp5
    public final yi6 b() {
        String a = a(e);
        if (a == null) {
            return null;
        }
        wu5 wu5Var = new wu5();
        wu5Var.g = bs2.n(1, 1, a);
        return wu5Var;
    }

    @Override // wp5
    public final char c() {
        return '$';
    }
}
