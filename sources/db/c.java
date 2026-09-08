package db;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class c {
    public static final c d = new c("", "", false);
    public final String a;
    public final String b;
    public final boolean c;

    static {
        new c("\n", "  ", true);
    }

    public c(String str, String str2, boolean z10) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.a = str;
        this.b = str2;
        this.c = z10;
    }
}
