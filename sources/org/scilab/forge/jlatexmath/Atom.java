package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
