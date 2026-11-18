package c8;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class dd {
    public static boolean a(int i7, int i10) {
        return (i7 & i10) != 0;
    }

    public static int b(int i7, int i10, boolean z10) {
        return z10 ? i7 | i10 : i7 & (~i10);
    }
}
