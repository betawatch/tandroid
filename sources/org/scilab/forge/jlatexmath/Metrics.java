package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class Metrics {
    private final float d;
    private final float h;
    private final float i;
    private final float s;
    private final float w;

    public Metrics(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.w = f10 * f14;
        this.h = f11 * f14;
        this.d = f12 * f14;
        this.i = f13 * f14;
        this.s = f15;
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
