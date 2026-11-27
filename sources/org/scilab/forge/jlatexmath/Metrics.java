package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class Metrics {
    private final float d;
    private final float h;
    private final float i;
    private final float s;
    private final float w;

    public Metrics(float f, float f2, float f3, float f4, float f5, float f6) {
        this.w = f * f5;
        this.h = f2 * f5;
        this.d = f3 * f5;
        this.i = f4 * f5;
        this.s = f6;
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
