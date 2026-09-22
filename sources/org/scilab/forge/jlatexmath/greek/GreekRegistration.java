package org.scilab.forge.jlatexmath.greek;

import java.lang.Character;
import org.scilab.forge.jlatexmath.AlphabetRegistration;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
