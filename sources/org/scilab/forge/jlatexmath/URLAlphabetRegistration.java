package org.scilab.forge.jlatexmath;

import java.lang.Character;
import java.net.URL;
import java.net.URLClassLoader;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class URLAlphabetRegistration implements AlphabetRegistration {
    private Character.UnicodeBlock[] blocks;
    private String language;
    private AlphabetRegistration pack = null;
    private URL url;

    private URLAlphabetRegistration(URL url, String str, Character.UnicodeBlock[] unicodeBlockArr) {
        this.url = url;
        this.language = str;
        this.blocks = unicodeBlockArr;
    }

    public static void register(URL url, String str, Character.UnicodeBlock[] unicodeBlockArr) {
        DefaultTeXFont.registerAlphabet(new URLAlphabetRegistration(url, str, unicodeBlockArr));
    }

    @Override // org.scilab.forge.jlatexmath.AlphabetRegistration
    public Object getPackage() {
        URL[] urlArr = {this.url};
        this.language = this.language.toLowerCase();
        StringBuilder sb = new StringBuilder("org.scilab.forge.jlatexmath.");
        sb.append(this.language);
        sb.append(".");
        sb.append(Character.toString(Character.toUpperCase(this.language.charAt(0))));
        String str = this.language;
        sb.append(str.substring(1, str.length()));
        sb.append("Registration");
        try {
            AlphabetRegistration alphabetRegistration = (AlphabetRegistration) Class.forName(sb.toString(), true, new URLClassLoader(urlArr)).newInstance();
            this.pack = alphabetRegistration;
            return alphabetRegistration;
        } catch (ClassNotFoundException unused) {
            throw new AlphabetRegistrationException("Class at " + this.url + " cannot be got.");
        } catch (Exception e6) {
            throw new AlphabetRegistrationException("Problem in loading the class at " + this.url + " :\n" + e6.getMessage());
        }
    }

    @Override // org.scilab.forge.jlatexmath.AlphabetRegistration
    public String getTeXFontFileName() {
        return this.pack.getTeXFontFileName();
    }

    @Override // org.scilab.forge.jlatexmath.AlphabetRegistration
    public Character.UnicodeBlock[] getUnicodeBlock() {
        return this.blocks;
    }
}
