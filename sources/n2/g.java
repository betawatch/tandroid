package n2;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class g extends Exception {
    public final int a;
    public final boolean b;

    public g(int i7, boolean z10) {
        super(i5.c.i(i7, "AudioOutput write failed: "));
        this.b = z10;
        this.a = i7;
    }
}
