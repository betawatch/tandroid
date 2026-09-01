package org.scilab.forge.jlatexmath;

import java.lang.Character;
import java.util.Map;
import org.scilab.forge.jlatexmath.TeXFormula;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class LaTeXAtom extends Atom {
    @Override // org.scilab.forge.jlatexmath.Atom
    public Box createBox(TeXEnvironment teXEnvironment) {
        TeXEnvironment copy = teXEnvironment.copy(teXEnvironment.getTeXFont().copy());
        copy.getTeXFont().setRoman(true);
        float scaleFactor = copy.getTeXFont().getScaleFactor();
        Map<Character.UnicodeBlock, TeXFormula.FontInfos> map = TeXFormula.externalFontMap;
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.BASIC_LATIN;
        TeXFormula.FontInfos fontInfos = map.get(unicodeBlock);
        if (fontInfos != null) {
            TeXFormula.externalFontMap.put(unicodeBlock, null);
        }
        RowAtom rowAtom = (RowAtom) ((RomanAtom) new TeXFormula("\\mathrm{XETL}").root).base;
        if (fontInfos != null) {
            TeXFormula.externalFontMap.put(unicodeBlock, fontInfos);
        }
        HorizontalBox horizontalBox = new HorizontalBox(rowAtom.getLastAtom().createBox(copy));
        horizontalBox.add(new SpaceAtom(0, (-0.35f) * scaleFactor, 0.0f, 0.0f).createBox(copy));
        float width = new SpaceAtom(1, 0.45f * scaleFactor, 0.0f, 0.0f).createBox(copy).getWidth();
        float width2 = new SpaceAtom(1, 0.5f * scaleFactor, 0.0f, 0.0f).createBox(copy).getWidth();
        CharBox charBox = new CharBox(copy.getTeXFont().getChar('A', "mathnormal", copy.supStyle().getStyle()));
        charBox.setShift(-width);
        horizontalBox.add(charBox);
        float f10 = scaleFactor * (-0.15f);
        horizontalBox.add(new SpaceAtom(0, f10, 0.0f, 0.0f).createBox(copy));
        horizontalBox.add(rowAtom.getLastAtom().createBox(copy));
        horizontalBox.add(new SpaceAtom(0, f10, 0.0f, 0.0f).createBox(copy));
        Box createBox = rowAtom.getLastAtom().createBox(copy);
        createBox.setShift(width2);
        horizontalBox.add(createBox);
        horizontalBox.add(new SpaceAtom(0, f10, 0.0f, 0.0f).createBox(copy));
        horizontalBox.add(rowAtom.getLastAtom().createBox(copy));
        return horizontalBox;
    }
}
