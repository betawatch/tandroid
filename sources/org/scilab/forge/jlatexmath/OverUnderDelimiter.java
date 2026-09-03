package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class OverUnderDelimiter extends Atom {
    private final Atom base;
    private final SpaceAtom kern;
    private final boolean over;
    private Atom script;
    private final SymbolAtom symbol;

    public OverUnderDelimiter(Atom atom, Atom atom2, SymbolAtom symbolAtom, int i10, float f10, boolean z4) {
        this.type = 7;
        this.base = atom;
        this.script = atom2;
        this.symbol = symbolAtom;
        this.kern = new SpaceAtom(i10, 0.0f, f10, 0.0f);
        this.over = z4;
    }

    private static float getMaxWidth(Box box, Box box2, Box box3) {
        float max = Math.max(box.getWidth(), box2.getDepth() + box2.getHeight());
        return box3 != null ? Math.max(max, box3.getWidth()) : max;
    }

    public void addScript(Atom atom) {
        this.script = atom;
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

    public boolean isOver() {
        return this.over;
    }
}
