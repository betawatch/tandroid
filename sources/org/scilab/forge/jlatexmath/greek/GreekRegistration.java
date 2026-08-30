package org.scilab.forge.jlatexmath.greek;

import java.lang.Character;
import org.scilab.forge.jlatexmath.AlphabetRegistration;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class GreekRegistration implements AlphabetRegistration {
    @Override // org.scilab.forge.jlatexmath.AlphabetRegistration
    public String getTeXFontFileName() {
        return "fonts/language_greek.xml";
    }

    @Override // org.scilab.forge.jlatexmath.AlphabetRegistration
    public Character.UnicodeBlock[] getUnicodeBlock() {
        return new Character.UnicodeBlock[]{Character.UnicodeBlock.GREEK, Character.UnicodeBlock.GREEK_EXTENDED};
    }

    @Override // org.scilab.forge.jlatexmath.AlphabetRegistration
    public Object getPackage() {
        return this;
    }
}
