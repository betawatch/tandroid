package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public abstract class Atom implements Cloneable {
    public int type = 0;
    public int type_limits = 1;
    public int alignment = -1;

    public abstract Box createBox(TeXEnvironment teXEnvironment);

    public int getLeftType() {
        return this.type;
    }

    public int getRightType() {
        return this.type;
    }

    public Atom clone() {
        try {
            return (Atom) super.clone();
        } catch (Exception unused) {
            return null;
        }
    }
}
