package k2;

import i2.o1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class z extends Exception {
    public final int a;
    public final boolean b;
    public final b2.w c;

    public z(int i10, b2.w wVar, boolean z10) {
        super(o1.k(i10, "AudioTrack write failed: "));
        this.b = z10;
        this.a = i10;
        this.c = wVar;
    }
}
