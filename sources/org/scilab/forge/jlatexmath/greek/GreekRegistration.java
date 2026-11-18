package org.scilab.forge.jlatexmath.greek;

import java.lang.Character;
import org.scilab.forge.jlatexmath.AlphabetRegistration;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
