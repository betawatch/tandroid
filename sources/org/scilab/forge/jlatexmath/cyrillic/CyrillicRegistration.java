package org.scilab.forge.jlatexmath.cyrillic;

import java.lang.Character;
import org.scilab.forge.jlatexmath.AlphabetRegistration;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
