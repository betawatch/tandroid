package n2;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class j {
    public int a = 0;
    public boolean b;
    public boolean c;
    public boolean d;

    public k a() {
        if (this.b || !(this.c || this.d)) {
            return new k(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }
}
