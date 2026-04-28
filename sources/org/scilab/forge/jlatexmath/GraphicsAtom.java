package org.scilab.forge.jlatexmath;

/* loaded from: classes3.dex */
public class GraphicsAtom extends Atom {
    private Atom base;
    private int h;
    private int w;
    private boolean first = true;
    private int interp = -1;

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        return null;
    }

    public void draw() {
    }

    public GraphicsAtom(String str, String str2) {
        draw();
    }
}
