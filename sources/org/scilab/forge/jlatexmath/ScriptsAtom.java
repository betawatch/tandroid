package org.scilab.forge.jlatexmath;

/* loaded from: classes3.dex */
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

    public ScriptsAtom(Atom atom, Atom atom2, Atom atom3, boolean z) {
        this(atom, atom2, atom3);
        if (z) {
            return;
        }
        this.align = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017c A[Catch: all -> 0x001a, TRY_LEAVE, TryCatch #0 {all -> 0x001a, blocks: (B:5:0x000f, B:7:0x0014, B:8:0x0021, B:10:0x002a, B:15:0x0034, B:20:0x0049, B:22:0x0055, B:23:0x0059, B:25:0x0067, B:26:0x008c, B:27:0x0174, B:29:0x017c, B:33:0x01ad, B:35:0x01b9, B:37:0x01bd, B:38:0x01c9, B:40:0x01db, B:41:0x01f3, B:43:0x020f, B:44:0x02a0, B:46:0x0219, B:48:0x024b, B:50:0x0266, B:51:0x0268, B:52:0x01e0, B:54:0x01ea, B:55:0x01ef, B:56:0x0093, B:58:0x009a, B:60:0x009e, B:62:0x00aa, B:64:0x00b0, B:65:0x00b4, B:67:0x00ec, B:69:0x00f0, B:70:0x00f8, B:71:0x011b, B:73:0x011f, B:75:0x012f, B:81:0x0146, B:83:0x014a, B:85:0x013a, B:86:0x0159, B:87:0x02a8, B:90:0x001d), top: B:4:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ad A[Catch: all -> 0x001a, TRY_ENTER, TryCatch #0 {all -> 0x001a, blocks: (B:5:0x000f, B:7:0x0014, B:8:0x0021, B:10:0x002a, B:15:0x0034, B:20:0x0049, B:22:0x0055, B:23:0x0059, B:25:0x0067, B:26:0x008c, B:27:0x0174, B:29:0x017c, B:33:0x01ad, B:35:0x01b9, B:37:0x01bd, B:38:0x01c9, B:40:0x01db, B:41:0x01f3, B:43:0x020f, B:44:0x02a0, B:46:0x0219, B:48:0x024b, B:50:0x0266, B:51:0x0268, B:52:0x01e0, B:54:0x01ea, B:55:0x01ef, B:56:0x0093, B:58:0x009a, B:60:0x009e, B:62:0x00aa, B:64:0x00b0, B:65:0x00b4, B:67:0x00ec, B:69:0x00f0, B:70:0x00f8, B:71:0x011b, B:73:0x011f, B:75:0x012f, B:81:0x0146, B:83:0x014a, B:85:0x013a, B:86:0x0159, B:87:0x02a8, B:90:0x001d), top: B:4:0x000f }] */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.scilab.forge.jlatexmath.Box] */
    @Override // org.scilab.forge.jlatexmath.Atom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Box createBox(TeXEnvironment teXEnvironment) {
        float height;
        float depth;
        float subDrop;
        float italic;
        HorizontalBox horizontalBox;
        float f;
        StrutBox strutBox;
        float f2;
        float f3;
        Atom atom;
        StrutBox strutBox2;
        int i;
        int i2 = boxWrapDepth;
        int i3 = i2 + 1;
        boxWrapDepth = i3;
        if (i3 > 64) {
            boxWrapDepth = i2;
            throw new DepthLimitExceededException();
        }
        int i4 = 1;
        try {
            Atom atom2 = this.base;
            Box strutBox3 = atom2 == null ? new StrutBox(0.0f, 0.0f, 0.0f, 0.0f) : atom2.createBox(teXEnvironment);
            StrutBox strutBox4 = new StrutBox(0.0f, 0.0f, 0.0f, 0.0f);
            if (this.subscript == null && this.superscript == null) {
                boxWrapDepth--;
                return strutBox3;
            }
            TeXFont teXFont = teXEnvironment.getTeXFont();
            int style = teXEnvironment.getStyle();
            Atom atom3 = this.base;
            int i5 = atom3.type_limits;
            if (i5 != 2 && (i5 != 0 || style != 0)) {
                HorizontalBox horizontalBox2 = new HorizontalBox(strutBox3);
                int lastFontId = strutBox3.getLastFontId();
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
                        float italic2 = r3.getItalic();
                        ?? createBox = new SpaceAtom(2).createBox(teXEnvironment);
                        if (italic2 > 1.0E-7f && this.subscript == null) {
                            horizontalBox3.add(new StrutBox(italic2, 0.0f, 0.0f, 0.0f));
                        }
                        float height2 = horizontalBox3.getHeight() - teXFont.getSupDrop(supStyle.getStyle());
                        f2 = italic2;
                        f3 = horizontalBox3.getDepth() + teXFont.getSubDrop(subStyle.getStyle());
                        f = height2;
                        horizontalBox = horizontalBox3;
                        strutBox = createBox;
                    } else if (atom4 instanceof CharSymbol) {
                        CharFont charFont = ((CharSymbol) atom4).getCharFont(teXFont);
                        if (((CharSymbol) this.base).isMarkedAsTextSymbol() && teXFont.hasSpace(charFont.fontId)) {
                            italic = 0.0f;
                            if (italic > 1.0E-7f && this.subscript == null) {
                                horizontalBox2.add(new StrutBox(italic, 0.0f, 0.0f, 0.0f));
                                italic = 0.0f;
                            }
                            horizontalBox = horizontalBox2;
                            f = 0.0f;
                            strutBox = strutBox4;
                            f2 = italic;
                            f3 = 0.0f;
                        }
                        italic = teXFont.getChar(charFont, style).getItalic();
                        if (italic > 1.0E-7f) {
                            horizontalBox2.add(new StrutBox(italic, 0.0f, 0.0f, 0.0f));
                            italic = 0.0f;
                        }
                        horizontalBox = horizontalBox2;
                        f = 0.0f;
                        strutBox = strutBox4;
                        f2 = italic;
                        f3 = 0.0f;
                    } else {
                        height = strutBox3.getHeight() - teXFont.getSupDrop(supStyle.getStyle());
                        depth = strutBox3.getDepth();
                        subDrop = teXFont.getSubDrop(subStyle.getStyle());
                    }
                    atom = this.superscript;
                    if (atom != null) {
                        Box createBox2 = this.subscript.createBox(subStyle);
                        createBox2.setShift(Math.max(Math.max(f3, teXFont.getSub1(style)), createBox2.getHeight() - ((Math.abs(teXFont.getXHeight(style, lastFontId)) * 4.0f) / 5.0f)));
                        horizontalBox.add(createBox2);
                        horizontalBox.add(strutBox);
                        i = boxWrapDepth;
                    } else {
                        Box createBox3 = atom.createBox(supStyle);
                        float width = createBox3.getWidth();
                        Atom atom5 = this.subscript;
                        if (atom5 != null && this.align == 1) {
                            width = Math.max(width, atom5.createBox(subStyle).getWidth());
                        }
                        HorizontalBox horizontalBox4 = new HorizontalBox(createBox3, width, this.align);
                        SpaceAtom spaceAtom = SCRIPT_SPACE;
                        horizontalBox4.add(spaceAtom.createBox(teXEnvironment));
                        float max = Math.max(Math.max(f, style == 0 ? teXFont.getSup1(style) : teXEnvironment.crampStyle().getStyle() == style ? teXFont.getSup3(style) : teXFont.getSup2(style)), createBox3.getDepth() + (Math.abs(teXFont.getXHeight(style, lastFontId)) / 4.0f));
                        Atom atom6 = this.subscript;
                        if (atom6 == null) {
                            horizontalBox4.setShift(-max);
                            horizontalBox.add(horizontalBox4);
                            strutBox2 = strutBox;
                        } else {
                            Box createBox4 = atom6.createBox(subStyle);
                            StrutBox strutBox5 = strutBox;
                            HorizontalBox horizontalBox5 = new HorizontalBox(createBox4, width, this.align);
                            horizontalBox5.add(spaceAtom.createBox(teXEnvironment));
                            float max2 = Math.max(f3, teXFont.getSub2(style));
                            float defaultRuleThickness = teXFont.getDefaultRuleThickness(style);
                            float depth2 = ((max - createBox3.getDepth()) + max2) - createBox4.getHeight();
                            float f4 = defaultRuleThickness * 4.0f;
                            if (depth2 < f4) {
                                max += f4 - depth2;
                                float abs = ((Math.abs(teXFont.getXHeight(style, lastFontId)) * 4.0f) / 5.0f) - (max - createBox3.getDepth());
                                if (abs > 0.0f) {
                                    max += abs;
                                    max2 -= abs;
                                }
                            }
                            VerticalBox verticalBox = new VerticalBox();
                            horizontalBox4.setShift(f2);
                            verticalBox.add(horizontalBox4);
                            verticalBox.add(new StrutBox(0.0f, ((max - createBox3.getDepth()) + max2) - createBox4.getHeight(), 0.0f, 0.0f));
                            verticalBox.add(horizontalBox5);
                            verticalBox.setHeight(max + createBox3.getHeight());
                            verticalBox.setDepth(max2 + createBox4.getDepth());
                            horizontalBox.add(verticalBox);
                            strutBox2 = strutBox5;
                        }
                        horizontalBox.add(strutBox2);
                        i = boxWrapDepth;
                        i4 = 1;
                    }
                    boxWrapDepth = i - i4;
                    return horizontalBox;
                }
                Box createBox5 = ((AccentedAtom) atom4).base.createBox(teXEnvironment.crampStyle());
                height = createBox5.getHeight() - teXFont.getSupDrop(supStyle.getStyle());
                depth = createBox5.getDepth();
                subDrop = teXFont.getSubDrop(subStyle.getStyle());
                f3 = depth + subDrop;
                f = height;
                horizontalBox = horizontalBox2;
                strutBox = strutBox4;
                f2 = 0.0f;
                atom = this.superscript;
                if (atom != null) {
                }
                boxWrapDepth = i - i4;
                return horizontalBox;
            }
            Box createBox6 = new UnderOverAtom(new UnderOverAtom(atom3, this.subscript, 3, 0.3f, true, false), this.superscript, 3, 3.0f, true, true).createBox(teXEnvironment);
            boxWrapDepth--;
            return createBox6;
        } catch (Throwable th) {
            boxWrapDepth--;
            throw th;
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
