package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Color;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class FBoxAtom extends Atom {
    public float INTERSPACE;
    protected final Atom base;
    protected Color bg;
    protected Color line;

    public FBoxAtom(Atom atom) {
        this.INTERSPACE = 0.65f;
        this.bg = null;
        this.line = null;
        if (atom == null) {
            this.base = new RowAtom();
        } else {
            this.base = atom;
            this.type = atom.type;
        }
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        Box createBox = this.base.createBox(teXEnvironment);
        float defaultRuleThickness = teXEnvironment.getTeXFont().getDefaultRuleThickness(teXEnvironment.getStyle());
        float factor = SpaceAtom.getFactor(0, teXEnvironment) * this.INTERSPACE;
        Color color = this.bg;
        if (color == null) {
            return new FramedBox(createBox, defaultRuleThickness, factor);
        }
        teXEnvironment.isColored = true;
        return new FramedBox(createBox, defaultRuleThickness, factor, this.line, color);
    }

    public FBoxAtom(Atom atom, Color color, Color color2) {
        this(atom);
        this.bg = color;
        this.line = color2;
    }
}
