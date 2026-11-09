package c8;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public abstract class zc {
    public static boolean a(int i7, int i10) {
        return (i7 & i10) != 0;
    }

    public static int b(int i7, int i10, boolean z9) {
        return z9 ? i7 | i10 : i7 & (~i10);
    }
}
