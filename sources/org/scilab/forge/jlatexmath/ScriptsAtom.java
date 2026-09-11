package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
        int i10 = atom instanceof ScriptsAtom ? 1 + ((ScriptsAtom) atom).wrapDepth : 1;
        this.wrapDepth = i10;
        if (i10 > 64) {
            throw new DepthLimitExceededException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0180 A[Catch: all -> 0x001a, TRY_LEAVE, TryCatch #0 {all -> 0x001a, blocks: (B:5:0x000f, B:7:0x0014, B:8:0x0023, B:10:0x002c, B:15:0x0036, B:20:0x004d, B:22:0x0059, B:23:0x005d, B:25:0x006b, B:26:0x0090, B:27:0x0178, B:29:0x0180, B:33:0x01b1, B:35:0x01bf, B:37:0x01c5, B:38:0x01d4, B:60:0x0097, B:62:0x009e, B:64:0x00a2, B:66:0x00ae, B:68:0x00b4, B:69:0x00b8, B:71:0x00f0, B:73:0x00f4, B:74:0x00fc, B:75:0x011f, B:77:0x0123, B:79:0x0133, B:85:0x014a, B:87:0x014e, B:89:0x013e, B:90:0x015d, B:99:0x001f), top: B:4:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b1 A[Catch: all -> 0x001a, TRY_ENTER, TryCatch #0 {all -> 0x001a, blocks: (B:5:0x000f, B:7:0x0014, B:8:0x0023, B:10:0x002c, B:15:0x0036, B:20:0x004d, B:22:0x0059, B:23:0x005d, B:25:0x006b, B:26:0x0090, B:27:0x0178, B:29:0x0180, B:33:0x01b1, B:35:0x01bf, B:37:0x01c5, B:38:0x01d4, B:60:0x0097, B:62:0x009e, B:64:0x00a2, B:66:0x00ae, B:68:0x00b4, B:69:0x00b8, B:71:0x00f0, B:73:0x00f4, B:74:0x00fc, B:75:0x011f, B:77:0x0123, B:79:0x0133, B:85:0x014a, B:87:0x014e, B:89:0x013e, B:90:0x015d, B:99:0x001f), top: B:4:0x000f }] */
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
        float f7;
        StrutBox strutBox;
        float f10;
        float f11;
        Atom atom;
        float f12;
        float f13;
        int i10;
        int i11 = boxWrapDepth;
        int i12 = i11 + 1;
        boxWrapDepth = i12;
        if (i12 > 64) {
            boxWrapDepth = i11;
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
            int i13 = atom3.type_limits;
            try {
                if (i13 == 2 || (i13 == 0 && style == 0)) {
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
                        Char r32 = teXFont.getChar(((SymbolAtom) atom4).getName(), style);
                        if (style < 2 && teXFont.hasNextLarger(r32)) {
                            r32 = teXFont.getNextLarger(r32, style);
                        }
                        CharBox charBox = new CharBox(r32);
                        charBox.setShift(((-(charBox.getHeight() + charBox.getDepth())) / 2.0f) - teXEnvironment.getTeXFont().getAxisHeight(teXEnvironment.getStyle()));
                        HorizontalBox horizontalBox3 = new HorizontalBox(charBox);
                        float italic2 = r32.getItalic();
                        ?? createBox = new SpaceAtom(2).createBox(teXEnvironment);
                        if (italic2 > 1.0E-7f && this.subscript == null) {
                            horizontalBox3.add(new StrutBox(italic2, 0.0f, 0.0f, 0.0f));
                        }
                        float height2 = horizontalBox3.getHeight() - teXFont.getSupDrop(supStyle.getStyle());
                        f10 = italic2;
                        f11 = horizontalBox3.getDepth() + teXFont.getSubDrop(subStyle.getStyle());
                        f7 = height2;
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
                            f7 = 0.0f;
                            strutBox = strutBox3;
                            f10 = italic;
                            f11 = 0.0f;
                        }
                        italic = teXFont.getChar(charFont, style).getItalic();
                        if (italic > 1.0E-7f) {
                            horizontalBox2.add(new StrutBox(italic, 0.0f, 0.0f, 0.0f));
                            italic = 0.0f;
                        }
                        horizontalBox = horizontalBox2;
                        f7 = 0.0f;
                        strutBox = strutBox3;
                        f10 = italic;
                        f11 = 0.0f;
                    } else {
                        height = strutBox2.getHeight() - teXFont.getSupDrop(supStyle.getStyle());
                        depth = strutBox2.getDepth();
                        subDrop = teXFont.getSubDrop(subStyle.getStyle());
                    }
                    atom = this.superscript;
                    if (atom != null) {
                        Box createBox2 = this.subscript.createBox(subStyle);
                        createBox2.setShift(Math.max(Math.max(f11, teXFont.getSub1(style)), createBox2.getHeight() - ((Math.abs(teXFont.getXHeight(style, lastFontId)) * 4.0f) / 5.0f)));
                        horizontalBox.add(createBox2);
                        horizontalBox.add(strutBox);
                        i10 = boxWrapDepth - 1;
                    } else {
                        Box createBox3 = atom.createBox(supStyle);
                        float width = createBox3.getWidth();
                        Atom atom5 = this.subscript;
                        if (atom5 != null) {
                            f12 = 0.0f;
                            if (this.align == 1) {
                                width = Math.max(width, atom5.createBox(subStyle).getWidth());
                            }
                        } else {
                            f12 = 0.0f;
                        }
                        HorizontalBox horizontalBox4 = new HorizontalBox(createBox3, width, this.align);
                        SpaceAtom spaceAtom = SCRIPT_SPACE;
                        horizontalBox4.add(spaceAtom.createBox(teXEnvironment));
                        float max = Math.max(Math.max(f7, style == 0 ? teXFont.getSup1(style) : teXEnvironment.crampStyle().getStyle() == style ? teXFont.getSup3(style) : teXFont.getSup2(style)), (Math.abs(teXFont.getXHeight(style, lastFontId)) / 4.0f) + createBox3.getDepth());
                        Atom atom6 = this.subscript;
                        if (atom6 == null) {
                            horizontalBox4.setShift(-max);
                            horizontalBox.add(horizontalBox4);
                        } else {
                            Box createBox4 = atom6.createBox(subStyle);
                            HorizontalBox horizontalBox5 = new HorizontalBox(createBox4, width, this.align);
                            horizontalBox5.add(spaceAtom.createBox(teXEnvironment));
                            float max2 = Math.max(f11, teXFont.getSub2(style));
                            float defaultRuleThickness = teXFont.getDefaultRuleThickness(style);
                            float depth2 = ((max - createBox3.getDepth()) + max2) - createBox4.getHeight();
                            float f14 = defaultRuleThickness * 4.0f;
                            if (depth2 < f14) {
                                f13 = (f14 - depth2) + max;
                                float abs = ((Math.abs(teXFont.getXHeight(style, lastFontId)) * 4.0f) / 5.0f) - (f13 - createBox3.getDepth());
                                if (abs > f12) {
                                    f13 += abs;
                                    max2 -= abs;
                                }
                            } else {
                                f13 = max;
                            }
                            VerticalBox verticalBox = new VerticalBox();
                            horizontalBox4.setShift(f10);
                            verticalBox.add(horizontalBox4);
                            verticalBox.add(new StrutBox(0.0f, ((f13 - createBox3.getDepth()) + max2) - createBox4.getHeight(), 0.0f, 0.0f));
                            verticalBox.add(horizontalBox5);
                            verticalBox.setHeight(f13 + createBox3.getHeight());
                            verticalBox.setDepth(max2 + createBox4.getDepth());
                            horizontalBox.add(verticalBox);
                        }
                        horizontalBox.add(strutBox);
                        i10 = boxWrapDepth - 1;
                    }
                    boxWrapDepth = i10;
                    return horizontalBox;
                }
                Box createBox5 = ((AccentedAtom) atom4).base.createBox(teXEnvironment.crampStyle());
                height = createBox5.getHeight() - teXFont.getSupDrop(supStyle.getStyle());
                depth = createBox5.getDepth();
                subDrop = teXFont.getSubDrop(subStyle.getStyle());
                f11 = depth + subDrop;
                f7 = height;
                horizontalBox = horizontalBox2;
                strutBox = strutBox3;
                f10 = 0.0f;
                atom = this.superscript;
                if (atom != null) {
                }
                boxWrapDepth = i10;
                return horizontalBox;
            } catch (Throwable th2) {
                th = th2;
                boxWrapDepth--;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
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

    public ScriptsAtom(Atom atom, Atom atom2, Atom atom3, boolean z10) {
        this(atom, atom2, atom3);
        if (z10) {
            return;
        }
        this.align = 1;
    }
}
