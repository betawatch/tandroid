package org.scilab.forge.jlatexmath;

import java.lang.Character;
import org.scilab.forge.jlatexmath.cyrillic.CyrillicRegistration;
import org.scilab.forge.jlatexmath.greek.GreekRegistration;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public class WebStartAlphabetRegistration implements AlphabetRegistration {
    private Character.UnicodeBlock[] blocks;
    private AlphabetRegistration reg;

    private WebStartAlphabetRegistration(Character.UnicodeBlock[] unicodeBlockArr) {
        this.blocks = unicodeBlockArr;
    }

    public static void register(Character.UnicodeBlock[] unicodeBlockArr) {
        DefaultTeXFont.registerAlphabet(new WebStartAlphabetRegistration(unicodeBlockArr));
    }

    @Override // org.scilab.forge.jlatexmath.AlphabetRegistration
    public Object getPackage() {
        Character.UnicodeBlock[] unicodeBlockArr = this.blocks;
        if (unicodeBlockArr == AlphabetRegistration.JLM_GREEK) {
            this.reg = new GreekRegistration();
        } else {
            if (unicodeBlockArr != AlphabetRegistration.JLM_CYRILLIC) {
                throw new AlphabetRegistrationException("Invalid Unicode Block");
            }
            this.reg = new CyrillicRegistration();
        }
        return this.reg;
    }

    @Override // org.scilab.forge.jlatexmath.AlphabetRegistration
    public String getTeXFontFileName() {
        return this.reg.getTeXFontFileName();
    }

    @Override // org.scilab.forge.jlatexmath.AlphabetRegistration
    public Character.UnicodeBlock[] getUnicodeBlock() {
        return this.blocks;
    }
}
