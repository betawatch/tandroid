package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
