package org.scilab.forge.jlatexmath;

import java.lang.Character;
import org.scilab.forge.jlatexmath.cyrillic.CyrillicRegistration;
import org.scilab.forge.jlatexmath.greek.GreekRegistration;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
