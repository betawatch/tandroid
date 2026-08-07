package org.scilab.forge.jlatexmath;

import ru.noties.jlatexmath.awt.Color;

/* loaded from: classes3.dex */
public class TeXEnvironment {
    private static final int MAX_DEPTH = 64;
    private Color background;
    private Color color;
    private int depth;
    private float interline;
    private int interlineUnit;
    public boolean isColored;
    private int lastFontId;
    private float scaleFactor;
    private boolean smallCap;
    private int style;
    private String textStyle;
    private float textwidth;
    private TeXFont tf;

    public TeXEnvironment(int i, TeXFont teXFont) {
        this(i, teXFont, (Color) null, (Color) null);
    }

    public TeXEnvironment(int i, TeXFont teXFont, int i2, float f) {
        this(i, teXFont, (Color) null, (Color) null);
        this.textwidth = f * SpaceAtom.getFactor(i2, this);
    }

    private TeXEnvironment(int i, TeXFont teXFont, Color color, Color color2) {
        this.lastFontId = -1;
        this.textwidth = Float.POSITIVE_INFINITY;
        this.scaleFactor = 1.0f;
        this.isColored = false;
        this.style = i;
        this.tf = teXFont;
        this.background = color;
        this.color = color2;
        setInterline(1, 1.0f);
    }

    private TeXEnvironment(int i, float f, TeXFont teXFont, Color color, Color color2, String str, boolean z) {
        this(i, f, teXFont, color, color2, str, z, 0);
    }

    private TeXEnvironment(int i, float f, TeXFont teXFont, Color color, Color color2, String str, boolean z, int i2) {
        this.lastFontId = -1;
        this.textwidth = Float.POSITIVE_INFINITY;
        this.isColored = false;
        this.style = i;
        this.scaleFactor = f;
        this.tf = teXFont;
        this.textStyle = str;
        this.smallCap = z;
        this.depth = i2;
        this.background = color;
        this.color = color2;
        setInterline(1, 1.0f);
    }

    public void setInterline(int i, float f) {
        this.interline = f;
        this.interlineUnit = i;
    }

    public float getInterline() {
        return this.interline * SpaceAtom.getFactor(this.interlineUnit, this);
    }

    public void setTextwidth(int i, float f) {
        this.textwidth = f * SpaceAtom.getFactor(i, this);
    }

    public float getTextwidth() {
        return this.textwidth;
    }

    public void setScaleFactor(float f) {
        this.scaleFactor = f;
    }

    public float getScaleFactor() {
        return this.scaleFactor;
    }

    protected TeXEnvironment copy() {
        int i = this.depth;
        if (i > 64) {
            throw new DepthLimitExceededException();
        }
        return new TeXEnvironment(this.style, this.scaleFactor, this.tf, this.background, this.color, this.textStyle, this.smallCap, i + 1);
    }

    protected TeXEnvironment copy(TeXFont teXFont) {
        int i = this.depth;
        if (i > 64) {
            throw new DepthLimitExceededException();
        }
        TeXEnvironment teXEnvironment = new TeXEnvironment(this.style, this.scaleFactor, teXFont, this.background, this.color, this.textStyle, this.smallCap, i + 1);
        teXEnvironment.textwidth = this.textwidth;
        teXEnvironment.interline = this.interline;
        teXEnvironment.interlineUnit = this.interlineUnit;
        return teXEnvironment;
    }

    public TeXEnvironment crampStyle() {
        TeXEnvironment copy = copy();
        int i = this.style;
        if (i % 2 != 1) {
            i++;
        }
        copy.style = i;
        return copy;
    }

    public TeXEnvironment denomStyle() {
        TeXEnvironment copy = copy();
        int i = this.style;
        copy.style = (((i / 2) * 2) + 3) - ((i / 6) * 2);
        return copy;
    }

    public Color getBackground() {
        return this.background;
    }

    public Color getColor() {
        return this.color;
    }

    public float getSize() {
        return this.tf.getSize();
    }

    public int getStyle() {
        return this.style;
    }

    public void setStyle(int i) {
        this.style = i;
    }

    public String getTextStyle() {
        return this.textStyle;
    }

    public void setTextStyle(String str) {
        this.textStyle = str;
    }

    public boolean getSmallCap() {
        return this.smallCap;
    }

    public void setSmallCap(boolean z) {
        this.smallCap = z;
    }

    public TeXFont getTeXFont() {
        return this.tf;
    }

    public TeXEnvironment numStyle() {
        TeXEnvironment copy = copy();
        int i = this.style;
        copy.style = (i + 2) - ((i / 6) * 2);
        return copy;
    }

    public void reset() {
        this.color = null;
        this.background = null;
    }

    public TeXEnvironment rootStyle() {
        TeXEnvironment copy = copy();
        copy.style = 6;
        return copy;
    }

    public void setBackground(Color color) {
        this.background = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TeXEnvironment subStyle() {
        TeXEnvironment copy = copy();
        copy.style = ((this.style / 4) * 2) + 5;
        return copy;
    }

    public TeXEnvironment supStyle() {
        TeXEnvironment copy = copy();
        int i = this.style;
        copy.style = ((i / 4) * 2) + 4 + (i % 2);
        return copy;
    }

    public float getSpace() {
        return this.tf.getSpace(this.style) * this.tf.getScaleFactor();
    }

    public void setLastFontId(int i) {
        this.lastFontId = i;
    }

    public int getLastFontId() {
        int i = this.lastFontId;
        return i == -1 ? this.tf.getMuFontId() : i;
    }
}
