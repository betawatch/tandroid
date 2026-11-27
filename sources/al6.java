// default package

import java.util.regex.Pattern;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
