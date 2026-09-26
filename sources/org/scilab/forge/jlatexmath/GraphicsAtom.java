package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
