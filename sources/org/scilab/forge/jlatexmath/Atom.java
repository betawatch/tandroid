package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
