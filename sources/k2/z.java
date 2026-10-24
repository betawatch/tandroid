package k2;

import i2.o1;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
