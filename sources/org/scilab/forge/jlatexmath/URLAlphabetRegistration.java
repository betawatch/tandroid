package org.scilab.forge.jlatexmath;

import java.lang.Character;
import java.net.URL;
import java.net.URLClassLoader;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        StringBuilder sb2 = new StringBuilder("org.scilab.forge.jlatexmath.");
        sb2.append(this.language);
        sb2.append(".");
        sb2.append(Character.toString(Character.toUpperCase(this.language.charAt(0))));
        String str = this.language;
        sb2.append(str.substring(1, str.length()));
        sb2.append("Registration");
        try {
            AlphabetRegistration alphabetRegistration = (AlphabetRegistration) Class.forName(sb2.toString(), true, new URLClassLoader(urlArr)).newInstance();
            this.pack = alphabetRegistration;
            return alphabetRegistration;
        } catch (ClassNotFoundException unused) {
            throw new AlphabetRegistrationException("Class at " + this.url + " cannot be got.");
        } catch (Exception e7) {
            throw new AlphabetRegistrationException("Problem in loading the class at " + this.url + " :\n" + e7.getMessage());
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
