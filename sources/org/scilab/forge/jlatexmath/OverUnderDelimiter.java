package org.scilab.forge.jlatexmath;

/* loaded from: classes3.dex */
public class OverUnderDelimiter extends Atom {
    private final Atom base;
    private final SpaceAtom kern;
    private final boolean over;
    private Atom script;
    private final SymbolAtom symbol;

    public OverUnderDelimiter(Atom atom, Atom atom2, SymbolAtom symbolAtom, int i, float f, boolean z) {
        this.type = 7;
        this.base = atom;
        this.script = atom2;
        this.symbol = symbolAtom;
        this.kern = new SpaceAtom(i, 0.0f, f, 0.0f);
        this.over = z;
    }

    public void addScript(Atom atom) {
        this.script = atom;
    }

    public boolean isOver() {
        return this.over;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box box;
        Atom atom = this.base;
        Box strutBox = atom == null ? new StrutBox(0.0f, 0.0f, 0.0f, 0.0f) : atom.createBox(teXEnvironment);
        Box create = DelimiterFactory.create(this.symbol.getName(), teXEnvironment, strutBox.getWidth());
        Atom atom2 = this.script;
        if (atom2 != null) {
            box = atom2.createBox(this.over ? teXEnvironment.supStyle() : teXEnvironment.subStyle());
        } else {
            box = null;
        }
        float maxWidth = getMaxWidth(strutBox, create, box);
        return new OverUnderBox(maxWidth - strutBox.getWidth() > 1.0E-7f ? new HorizontalBox(strutBox, maxWidth, 2) : strutBox, new VerticalBox(create, maxWidth, 2), (box == null || maxWidth - box.getWidth() <= 1.0E-7f) ? box : new HorizontalBox(box, maxWidth, 2), this.kern.createBox(teXEnvironment).getHeight(), this.over);
    }

    private static float getMaxWidth(Box box, Box box2, Box box3) {
        float max = Math.max(box.getWidth(), box2.getHeight() + box2.getDepth());
        return box3 != null ? Math.max(max, box3.getWidth()) : max;
    }
}
