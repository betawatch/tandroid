package g2;

import java.io.IOException;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public class j extends IOException {
    public final int a;

    public j(int i10) {
        this.a = i10;
    }

    public j(Exception exc, int i10) {
        super(exc);
        this.a = i10;
    }

    public j(String str, int i10) {
        super(str);
        this.a = i10;
    }

    public j(String str, Exception exc, int i10) {
        super(str, exc);
        this.a = i10;
    }
}
