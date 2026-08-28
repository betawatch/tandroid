package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class GraphicsAtom extends Atom {
    private Atom base;
    private int h;
    private int w;
    private boolean first = true;
    private int interp = -1;

    public GraphicsAtom(String str, String str2) {
        draw();
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        return null;
    }

    public void draw() {
    }
}
