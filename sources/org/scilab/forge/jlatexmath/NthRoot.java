package org.scilab.forge.jlatexmath;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class NthRoot extends Atom {
    private static final float FACTOR = 0.55f;
    private static final String sqrtSymbol = "sqrt";
    private final Atom base;
    private final Atom root;

    public NthRoot(Atom atom, Atom atom2) {
        this.base = atom == null ? new EmptyAtom() : atom;
        this.root = atom2 == null ? new EmptyAtom() : atom2;
    }

    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        TeXFont teXFont = teXEnvironment.getTeXFont();
        int style = teXEnvironment.getStyle();
        float defaultRuleThickness = teXFont.getDefaultRuleThickness(style);
        float abs = (Math.abs(style < 2 ? teXFont.getXHeight(style, teXFont.getChar(sqrtSymbol, style).getFontCode()) : defaultRuleThickness) / 4.0f) + defaultRuleThickness;
        HorizontalBox horizontalBox = new HorizontalBox(this.base.createBox(teXEnvironment.crampStyle()));
        horizontalBox.add(new SpaceAtom(5, 1.0f, 0.0f, 0.0f).createBox(teXEnvironment.crampStyle()));
        float depth = horizontalBox.getDepth() + horizontalBox.getHeight() + abs;
        Box create = DelimiterFactory.create(sqrtSymbol, teXEnvironment, depth + defaultRuleThickness);
        float depth2 = ((create.getDepth() - depth) / 2.0f) + abs;
        create.setShift(-(horizontalBox.getHeight() + depth2));
        OverBar overBar = new OverBar(horizontalBox, depth2, create.getHeight());
        overBar.setShift(-(horizontalBox.getHeight() + depth2 + defaultRuleThickness));
        HorizontalBox horizontalBox2 = new HorizontalBox(create);
        horizontalBox2.add(overBar);
        Atom atom = this.root;
        if (atom == null) {
            return horizontalBox2;
        }
        Box createBox = atom.createBox(teXEnvironment.rootStyle());
        createBox.setShift((horizontalBox2.getDepth() - createBox.getDepth()) - ((horizontalBox2.getDepth() + horizontalBox2.getHeight()) * FACTOR));
        Box createBox2 = new SpaceAtom(5, -10.0f, 0.0f, 0.0f).createBox(teXEnvironment);
        HorizontalBox horizontalBox3 = new HorizontalBox();
        float width = createBox2.getWidth() + createBox.getWidth();
        if (width < 0.0f) {
            horizontalBox3.add(new StrutBox(-width, 0.0f, 0.0f, 0.0f));
        }
        horizontalBox3.add(createBox);
        horizontalBox3.add(createBox2);
        horizontalBox3.add(horizontalBox2);
        return horizontalBox3;
    }
}
