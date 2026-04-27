package org.scilab.forge.jlatexmath;

/* loaded from: classes3.dex */
public abstract class DelimiterFactory {
    public static Box create(SymbolAtom symbolAtom, TeXEnvironment teXEnvironment, int i) {
        if (i > 4) {
            return symbolAtom.createBox(teXEnvironment);
        }
        TeXFont teXFont = teXEnvironment.getTeXFont();
        int style = teXEnvironment.getStyle();
        Char r2 = teXFont.getChar(symbolAtom.getName(), style);
        int i2 = 1;
        while (i2 <= i && teXFont.hasNextLarger(r2)) {
            r2 = teXFont.getNextLarger(r2, style);
            i2++;
        }
        if (i2 <= i && !teXFont.hasNextLarger(r2)) {
            CharBox charBox = new CharBox(teXFont.getChar('A', "mathnormal", style));
            return create(symbolAtom.getName(), teXEnvironment, i * (charBox.getHeight() + charBox.getDepth()));
        }
        return new CharBox(r2);
    }

    public static Box create(String str, TeXEnvironment teXEnvironment, float f) {
        float f2;
        TeXFont teXFont = teXEnvironment.getTeXFont();
        int style = teXEnvironment.getStyle();
        Char r4 = teXFont.getChar(str, style);
        Metrics metrics = r4.getMetrics();
        float height = metrics.getHeight();
        float depth = metrics.getDepth();
        while (true) {
            f2 = height + depth;
            if (f2 >= f || !teXFont.hasNextLarger(r4)) {
                break;
            }
            r4 = teXFont.getNextLarger(r4, style);
            Metrics metrics2 = r4.getMetrics();
            height = metrics2.getHeight();
            depth = metrics2.getDepth();
        }
        if (f2 >= f) {
            return new CharBox(r4);
        }
        if (teXFont.isExtensionChar(r4)) {
            VerticalBox verticalBox = new VerticalBox();
            Extension extension = teXFont.getExtension(r4, style);
            if (extension.hasTop()) {
                verticalBox.add(new CharBox(extension.getTop()));
            }
            boolean hasMiddle = extension.hasMiddle();
            if (hasMiddle) {
                verticalBox.add(new CharBox(extension.getMiddle()));
            }
            if (extension.hasBottom()) {
                verticalBox.add(new CharBox(extension.getBottom()));
            }
            CharBox charBox = new CharBox(extension.getRepeat());
            while (verticalBox.getHeight() + verticalBox.getDepth() <= f) {
                if (extension.hasTop() && extension.hasBottom()) {
                    verticalBox.add(1, charBox);
                    if (hasMiddle) {
                        verticalBox.add(verticalBox.getSize() - 1, charBox);
                    }
                } else if (extension.hasBottom()) {
                    verticalBox.add(0, charBox);
                } else {
                    verticalBox.add(charBox);
                }
            }
            return verticalBox;
        }
        return new CharBox(r4);
    }
}
