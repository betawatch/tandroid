package k2;

import i2.o1;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class i extends Exception {
    public final int a;
    public final boolean b;

    public i(int i10, boolean z10) {
        super(o1.k(i10, "AudioOutput write failed: "));
        this.b = z10;
        this.a = i10;
    }
}
