package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class Extension {
    private final Char bottom;
    private final Char middle;
    private final Char repeat;
    private final Char top;

    public Extension(Char r12, Char r22, Char r32, Char r42) {
        this.top = r12;
        this.middle = r22;
        this.repeat = r32;
        this.bottom = r42;
    }

    public Char getBottom() {
        return this.bottom;
    }

    public Char getMiddle() {
        return this.middle;
    }

    public Char getRepeat() {
        return this.repeat;
    }

    public Char getTop() {
        return this.top;
    }

    public boolean hasBottom() {
        return this.bottom != null;
    }

    public boolean hasMiddle() {
        return this.middle != null;
    }

    public boolean hasTop() {
        return this.top != null;
    }
}
