package org.scilab.forge.jlatexmath;

/* loaded from: classes3.dex */
public class ScriptsAtom extends Atom {
    private static final SpaceAtom SCRIPT_SPACE = new SpaceAtom(3, 0.5f, 0.0f, 0.0f);
    private int align;
    private final Atom base;
    private final Atom subscript;
    private final Atom superscript;

    public ScriptsAtom(Atom atom, Atom atom2, Atom atom3) {
        this.align = 0;
        this.base = atom;
        this.subscript = atom2;
        this.superscript = atom3;
    }

    public ScriptsAtom(Atom atom, Atom atom2, Atom atom3, boolean z) {
        this(atom, atom2, atom3);
        if (z) {
            return;
        }
        this.align = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0196  */
    /* JADX WARN: Type inference failed for: r4v4, types: [org.scilab.forge.jlatexmath.Box] */
    @Override // org.scilab.forge.jlatexmath.Atom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Box createBox(TeXEnvironment teXEnvironment) {
        float height;
        float depth;
        float subDrop;
        HorizontalBox horizontalBox;
        float f;
        StrutBox strutBox;
        float f2;
        float f3;
        Atom atom;
        float sup2;
        StrutBox strutBox2;
        Atom atom2 = this.base;
        Box strutBox3 = atom2 == null ? new StrutBox(0.0f, 0.0f, 0.0f, 0.0f) : atom2.createBox(teXEnvironment);
        StrutBox strutBox4 = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
        if (this.subscript == null && this.superscript == null) {
            return strutBox3;
        }
        TeXFont teXFont = teXEnvironment.getTeXFont();
        int style = teXEnvironment.getStyle();
        Atom atom3 = this.base;
        int i = atom3.type_limits;
        if (i == 2 || (i == 0 && style == 0)) {
            return new UnderOverAtom(new UnderOverAtom(atom3, this.subscript, 3, 0.3f, true, false), this.superscript, 3, 3.0f, true, true).createBox(teXEnvironment);
        }
        HorizontalBox horizontalBox2 = new HorizontalBox(strutBox3);
        int lastFontId = strutBox3.getLastFontId();
        if (lastFontId == -1) {
            lastFontId = teXFont.getMuFontId();
        }
        TeXEnvironment subStyle = teXEnvironment.subStyle();
        TeXEnvironment supStyle = teXEnvironment.supStyle();
        Atom atom4 = this.base;
        if (atom4 instanceof AccentedAtom) {
            Box createBox = ((AccentedAtom) atom4).base.createBox(teXEnvironment.crampStyle());
            height = createBox.getHeight() - teXFont.getSupDrop(supStyle.getStyle());
            depth = createBox.getDepth();
            subDrop = teXFont.getSubDrop(subStyle.getStyle());
        } else {
            if ((atom4 instanceof SymbolAtom) && atom4.type == 1) {
                Char r2 = teXFont.getChar(((SymbolAtom) atom4).getName(), style);
                if (style < 2 && teXFont.hasNextLarger(r2)) {
                    r2 = teXFont.getNextLarger(r2, style);
                }
                CharBox charBox = new CharBox(r2);
                charBox.setShift(((-(charBox.getHeight() + charBox.getDepth())) / 2.0f) - teXEnvironment.getTeXFont().getAxisHeight(teXEnvironment.getStyle()));
                HorizontalBox horizontalBox3 = new HorizontalBox(charBox);
                float italic = r2.getItalic();
                ?? createBox2 = new SpaceAtom(2).createBox(teXEnvironment);
                if (italic > 1.0E-7f && this.subscript == null) {
                    horizontalBox3.add(new StrutBox(italic, 0.0f, 0.0f, 0.0f));
                }
                float height2 = horizontalBox3.getHeight() - teXFont.getSupDrop(supStyle.getStyle());
                f2 = italic;
                f3 = horizontalBox3.getDepth() + teXFont.getSubDrop(subStyle.getStyle());
                f = height2;
                horizontalBox = horizontalBox3;
                strutBox = createBox2;
            } else if (atom4 instanceof CharSymbol) {
                CharFont charFont = ((CharSymbol) atom4).getCharFont(teXFont);
                float italic2 = (((CharSymbol) this.base).isMarkedAsTextSymbol() && teXFont.hasSpace(charFont.fontId)) ? 0.0f : teXFont.getChar(charFont, style).getItalic();
                if (italic2 > 1.0E-7f && this.subscript == null) {
                    horizontalBox2.add(new StrutBox(italic2, 0.0f, 0.0f, 0.0f));
                    italic2 = 0.0f;
                }
                horizontalBox = horizontalBox2;
                f = 0.0f;
                strutBox = strutBox4;
                f2 = italic2;
                f3 = 0.0f;
            } else {
                height = strutBox3.getHeight() - teXFont.getSupDrop(supStyle.getStyle());
                depth = strutBox3.getDepth();
                subDrop = teXFont.getSubDrop(subStyle.getStyle());
            }
            atom = this.superscript;
            if (atom != null) {
                Box createBox3 = this.subscript.createBox(subStyle);
                createBox3.setShift(Math.max(Math.max(f3, teXFont.getSub1(style)), createBox3.getHeight() - ((Math.abs(teXFont.getXHeight(style, lastFontId)) * 4.0f) / 5.0f)));
                horizontalBox.add(createBox3);
                horizontalBox.add(strutBox);
                return horizontalBox;
            }
            Box createBox4 = atom.createBox(supStyle);
            float width = createBox4.getWidth();
            Atom atom5 = this.subscript;
            if (atom5 != null && this.align == 1) {
                width = Math.max(width, atom5.createBox(subStyle).getWidth());
            }
            HorizontalBox horizontalBox4 = new HorizontalBox(createBox4, width, this.align);
            SpaceAtom spaceAtom = SCRIPT_SPACE;
            horizontalBox4.add(spaceAtom.createBox(teXEnvironment));
            if (style == 0) {
                sup2 = teXFont.getSup1(style);
            } else if (teXEnvironment.crampStyle().getStyle() == style) {
                sup2 = teXFont.getSup3(style);
            } else {
                sup2 = teXFont.getSup2(style);
            }
            float max = Math.max(Math.max(f, sup2), createBox4.getDepth() + (Math.abs(teXFont.getXHeight(style, lastFontId)) / 4.0f));
            Atom atom6 = this.subscript;
            if (atom6 == null) {
                horizontalBox4.setShift(-max);
                horizontalBox.add(horizontalBox4);
                strutBox2 = strutBox;
            } else {
                Box createBox5 = atom6.createBox(subStyle);
                StrutBox strutBox5 = strutBox;
                HorizontalBox horizontalBox5 = new HorizontalBox(createBox5, width, this.align);
                horizontalBox5.add(spaceAtom.createBox(teXEnvironment));
                float max2 = Math.max(f3, teXFont.getSub2(style));
                float defaultRuleThickness = teXFont.getDefaultRuleThickness(style);
                float depth2 = ((max - createBox4.getDepth()) + max2) - createBox5.getHeight();
                float f4 = defaultRuleThickness * 4.0f;
                if (depth2 < f4) {
                    max += f4 - depth2;
                    float abs = ((Math.abs(teXFont.getXHeight(style, lastFontId)) * 4.0f) / 5.0f) - (max - createBox4.getDepth());
                    if (abs > 0.0f) {
                        max += abs;
                        max2 -= abs;
                    }
                }
                VerticalBox verticalBox = new VerticalBox();
                horizontalBox4.setShift(f2);
                verticalBox.add(horizontalBox4);
                verticalBox.add(new StrutBox(0.0f, ((max - createBox4.getDepth()) + max2) - createBox5.getHeight(), 0.0f, 0.0f));
                verticalBox.add(horizontalBox5);
                verticalBox.setHeight(max + createBox4.getHeight());
                verticalBox.setDepth(max2 + createBox5.getDepth());
                horizontalBox.add(verticalBox);
                strutBox2 = strutBox5;
            }
            horizontalBox.add(strutBox2);
            return horizontalBox;
        }
        f3 = depth + subDrop;
        f = height;
        horizontalBox = horizontalBox2;
        strutBox = strutBox4;
        f2 = 0.0f;
        atom = this.superscript;
        if (atom != null) {
        }
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public int getLeftType() {
        return this.base.getLeftType();
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public int getRightType() {
        return this.base.getRightType();
    }
}
