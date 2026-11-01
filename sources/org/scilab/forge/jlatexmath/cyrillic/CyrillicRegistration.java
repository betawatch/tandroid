package org.scilab.forge.jlatexmath.cyrillic;

import java.lang.Character;
import org.scilab.forge.jlatexmath.AlphabetRegistration;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public class CyrillicRegistration implements AlphabetRegistration {
    @Override // org.scilab.forge.jlatexmath.AlphabetRegistration
    public String getTeXFontFileName() {
        return "fonts/language_cyrillic.xml";
    }

    @Override // org.scilab.forge.jlatexmath.AlphabetRegistration
    public Character.UnicodeBlock[] getUnicodeBlock() {
        return new Character.UnicodeBlock[]{Character.UnicodeBlock.CYRILLIC};
    }

    @Override // org.scilab.forge.jlatexmath.AlphabetRegistration
    public Object getPackage() {
        return this;
    }
}
