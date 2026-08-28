package j4;

import java.io.IOException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g extends IOException {
    public g(int i9) {
        super("Illegal clipping: ".concat(i9 != 0 ? i9 != 1 ? i9 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count"));
    }
}
