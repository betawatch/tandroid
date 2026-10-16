package org.scilab.forge.jlatexmath;

import java.lang.Character;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public interface AlphabetRegistration {
    public static final Character.UnicodeBlock[] JLM_GREEK = {Character.UnicodeBlock.GREEK, Character.UnicodeBlock.GREEK_EXTENDED};
    public static final Character.UnicodeBlock[] JLM_CYRILLIC = {Character.UnicodeBlock.CYRILLIC};

    Object getPackage();

    String getTeXFontFileName();

    Character.UnicodeBlock[] getUnicodeBlock();
}
