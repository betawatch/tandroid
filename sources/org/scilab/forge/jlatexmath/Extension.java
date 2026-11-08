package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
