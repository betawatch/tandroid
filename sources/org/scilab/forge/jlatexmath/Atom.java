package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
