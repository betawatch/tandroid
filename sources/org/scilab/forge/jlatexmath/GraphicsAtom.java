package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
