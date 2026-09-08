package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class Metrics {
    private final float d;
    private final float h;
    private final float i;
    private final float s;
    private final float w;

    public Metrics(float f7, float f10, float f11, float f12, float f13, float f14) {
        this.w = f7 * f13;
        this.h = f10 * f13;
        this.d = f11 * f13;
        this.i = f12 * f13;
        this.s = f14;
    }

    public float getDepth() {
        return this.d;
    }

    public float getHeight() {
        return this.h;
    }

    public float getItalic() {
        return this.i;
    }

    public float getSize() {
        return this.s;
    }

    public float getWidth() {
        return this.w;
    }
}
