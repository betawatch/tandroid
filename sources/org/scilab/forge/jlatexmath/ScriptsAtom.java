package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class ScriptsAtom extends Atom {
    private static final int MAX_WRAP_DEPTH = 64;
    private static final SpaceAtom SCRIPT_SPACE = new SpaceAtom(3, 0.5f, 0.0f, 0.0f);
    private static int boxWrapDepth;
    private int align;
    private final Atom base;
    private final Atom subscript;
    private final Atom superscript;
    private final int wrapDepth;

    public ScriptsAtom(Atom atom, Atom atom2, Atom atom3) {
        this.align = 0;
        this.base = atom;
        this.subscript = atom2;
        this.superscript = atom3;
        int i = atom instanceof ScriptsAtom ? 1 + ((ScriptsAtom) atom).wrapDepth : 1;
        this.wrapDepth = i;
        if (i > 64) {
            throw new DepthLimitExceededException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0174 A[Catch: all -> 0x02cd, TRY_LEAVE, TryCatch #1 {all -> 0x02cd, blocks: (B:5:0x000f, B:7:0x0014, B:8:0x001e, B:10:0x0027, B:15:0x0031, B:20:0x0044, B:22:0x0050, B:23:0x0054, B:25:0x0062, B:26:0x0167, B:27:0x016c, B:29:0x0174, B:33:0x01a5, B:35:0x01b3, B:37:0x01b9, B:38:0x01c8, B:59:0x0089, B:61:0x0090, B:63:0x0094, B:65:0x00a0, B:67:0x00a6, B:68:0x00aa, B:70:0x00e2, B:72:0x00e6, B:73:0x00ee, B:74:0x0111, B:76:0x0115, B:78:0x0125, B:83:0x013b, B:85:0x013f, B:87:0x012f, B:88:0x014e, B:96:0x001a), top: B:4:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a5 A[Catch: all -> 0x02cd, TRY_ENTER, TryCatch #1 {all -> 0x02cd, blocks: (B:5:0x000f, B:7:0x0014, B:8:0x001e, B:10:0x0027, B:15:0x0031, B:20:0x0044, B:22:0x0050, B:23:0x0054, B:25:0x0062, B:26:0x0167, B:27:0x016c, B:29:0x0174, B:33:0x01a5, B:35:0x01b3, B:37:0x01b9, B:38:0x01c8, B:59:0x0089, B:61:0x0090, B:63:0x0094, B:65:0x00a0, B:67:0x00a6, B:68:0x00aa, B:70:0x00e2, B:72:0x00e6, B:73:0x00ee, B:74:0x0111, B:76:0x0115, B:78:0x0125, B:83:0x013b, B:85:0x013f, B:87:0x012f, B:88:0x014e, B:96:0x001a), top: B:4:0x000f }] */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.scilab.forge.jlatexmath.Box] */
    @Override // org.scilab.forge.jlatexmath.Atom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Box createBox(TeXEnvironment teXEnvironment) {
        float height;
        float depth;
        float subDrop;
        float f;
        HorizontalBox horizontalBox;
        StrutBox strutBox;
        float f2;
        float f3;
        Atom atom;
        float f4;
        int i;
        int i2 = boxWrapDepth;
        int i3 = i2 + 1;
        boxWrapDepth = i3;
        if (i3 > 64) {
            boxWrapDepth = i2;
            throw new DepthLimitExceededException();
        }
        try {
            Atom atom2 = this.base;
            Box strutBox2 = atom2 == null ? new StrutBox(0.0f, 0.0f, 0.0f, 0.0f) : atom2.createBox(teXEnvironment);
            StrutBox strutBox3 = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
            if (this.subscript == null && this.superscript == null) {
                boxWrapDepth--;
                return strutBox2;
            }
            TeXFont teXFont = teXEnvironment.getTeXFont();
            int style = teXEnvironment.getStyle();
            Atom atom3 = this.base;
            int i4 = atom3.type_limits;
            try {
                if (i4 == 2 || (i4 == 0 && style == 0)) {
                    boxWrapDepth--;
                    return new UnderOverAtom(new UnderOverAtom(atom3, this.subscript, 3, 0.3f, true, false), this.superscript, 3, 3.0f, true, true).createBox(teXEnvironment);
                }
                HorizontalBox horizontalBox2 = new HorizontalBox(strutBox2);
                int lastFontId = strutBox2.getLastFontId();
                if (lastFontId == -1) {
                    lastFontId = teXFont.getMuFontId();
                }
                TeXEnvironment subStyle = teXEnvironment.subStyle();
                TeXEnvironment supStyle = teXEnvironment.supStyle();
                Atom atom4 = this.base;
                if (!(atom4 instanceof AccentedAtom)) {
                    if ((atom4 instanceof SymbolAtom) && atom4.type == 1) {
                        Char r3 = teXFont.getChar(((SymbolAtom) atom4).getName(), style);
                        if (style < 2 && teXFont.hasNextLarger(r3)) {
                            r3 = teXFont.getNextLarger(r3, style);
                        }
                        CharBox charBox = new CharBox(r3);
                        charBox.setShift(((-(charBox.getHeight() + charBox.getDepth())) / 2.0f) - teXEnvironment.getTeXFont().getAxisHeight(teXEnvironment.getStyle()));
                        HorizontalBox horizontalBox3 = new HorizontalBox(charBox);
                        float italic = r3.getItalic();
                        ?? createBox = new SpaceAtom(2).createBox(teXEnvironment);
                        if (italic > 1.0E-7f && this.subscript == null) {
                            horizontalBox3.add(new StrutBox(italic, 0.0f, 0.0f, 0.0f));
                        }
                        float height2 = horizontalBox3.getHeight() - teXFont.getSupDrop(supStyle.getStyle());
                        f2 = italic;
                        f3 = horizontalBox3.getDepth() + teXFont.getSubDrop(subStyle.getStyle());
                        f = height2;
                        horizontalBox = horizontalBox3;
                        strutBox = createBox;
                    } else if (atom4 instanceof CharSymbol) {
                        CharFont charFont = ((CharSymbol) atom4).getCharFont(teXFont);
                        float italic2 = (((CharSymbol) this.base).isMarkedAsTextSymbol() && teXFont.hasSpace(charFont.fontId)) ? 0.0f : teXFont.getChar(charFont, style).getItalic();
                        if (italic2 > 1.0E-7f && this.subscript == null) {
                            horizontalBox2.add(new StrutBox(italic2, 0.0f, 0.0f, 0.0f));
                            italic2 = 0.0f;
                        }
                        f = 0.0f;
                        horizontalBox = horizontalBox2;
                        strutBox = strutBox3;
                        f2 = italic2;
                        f3 = 0.0f;
                    } else {
                        height = strutBox2.getHeight() - teXFont.getSupDrop(supStyle.getStyle());
                        depth = strutBox2.getDepth();
                        subDrop = teXFont.getSubDrop(subStyle.getStyle());
                    }
                    atom = this.superscript;
                    if (atom != null) {
                        Box createBox2 = this.subscript.createBox(subStyle);
                        createBox2.setShift(Math.max(Math.max(f3, teXFont.getSub1(style)), createBox2.getHeight() - ((Math.abs(teXFont.getXHeight(style, lastFontId)) * 4.0f) / 5.0f)));
                        horizontalBox.add(createBox2);
                        horizontalBox.add(strutBox);
                        i = boxWrapDepth - 1;
                    } else {
                        Box createBox3 = atom.createBox(supStyle);
                        float width = createBox3.getWidth();
                        Atom atom5 = this.subscript;
                        if (atom5 != null) {
                            f4 = 0.0f;
                            if (this.align == 1) {
                                width = Math.max(width, atom5.createBox(subStyle).getWidth());
                            }
                        } else {
                            f4 = 0.0f;
                        }
                        HorizontalBox horizontalBox4 = new HorizontalBox(createBox3, width, this.align);
                        SpaceAtom spaceAtom = SCRIPT_SPACE;
                        horizontalBox4.add(spaceAtom.createBox(teXEnvironment));
                        float max = Math.max(Math.max(f, style == 0 ? teXFont.getSup1(style) : teXEnvironment.crampStyle().getStyle() == style ? teXFont.getSup3(style) : teXFont.getSup2(style)), (Math.abs(teXFont.getXHeight(style, lastFontId)) / 4.0f) + createBox3.getDepth());
                        Atom atom6 = this.subscript;
                        if (atom6 == null) {
                            horizontalBox4.setShift(-max);
                            horizontalBox.add(horizontalBox4);
                        } else {
                            Box createBox4 = atom6.createBox(subStyle);
                            HorizontalBox horizontalBox5 = new HorizontalBox(createBox4, width, this.align);
                            horizontalBox5.add(spaceAtom.createBox(teXEnvironment));
                            float max2 = Math.max(f3, teXFont.getSub2(style));
                            float defaultRuleThickness = teXFont.getDefaultRuleThickness(style);
                            float depth2 = ((max - createBox3.getDepth()) + max2) - createBox4.getHeight();
                            float f5 = defaultRuleThickness * 4.0f;
                            if (depth2 < f5) {
                                max += f5 - depth2;
                                float abs = ((Math.abs(teXFont.getXHeight(style, lastFontId)) * 4.0f) / 5.0f) - (max - createBox3.getDepth());
                                if (abs > f4) {
                                    max += abs;
                                    max2 -= abs;
                                }
                            }
                            VerticalBox verticalBox = new VerticalBox();
                            horizontalBox4.setShift(f2);
                            verticalBox.add(horizontalBox4);
                            float f6 = f4;
                            verticalBox.add(new StrutBox(f6, ((max - createBox3.getDepth()) + max2) - createBox4.getHeight(), f6, f6));
                            verticalBox.add(horizontalBox5);
                            verticalBox.setHeight(max + createBox3.getHeight());
                            verticalBox.setDepth(max2 + createBox4.getDepth());
                            horizontalBox.add(verticalBox);
                        }
                        horizontalBox.add(strutBox);
                        i = boxWrapDepth - 1;
                    }
                    boxWrapDepth = i;
                    return horizontalBox;
                }
                Box createBox5 = ((AccentedAtom) atom4).base.createBox(teXEnvironment.crampStyle());
                height = createBox5.getHeight() - teXFont.getSupDrop(supStyle.getStyle());
                depth = createBox5.getDepth();
                subDrop = teXFont.getSubDrop(subStyle.getStyle());
                f3 = depth + subDrop;
                f = height;
                horizontalBox = horizontalBox2;
                strutBox = strutBox3;
                f2 = 0.0f;
                atom = this.superscript;
                if (atom != null) {
                }
                boxWrapDepth = i;
                return horizontalBox;
            } catch (Throwable th) {
                th = th;
                boxWrapDepth--;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
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

    public ScriptsAtom(Atom atom, Atom atom2, Atom atom3, boolean z) {
        this(atom, atom2, atom3);
        if (z) {
            return;
        }
        this.align = 1;
    }
}
