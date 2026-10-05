package org.scilab.forge.jlatexmath;

import java.lang.Character;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public interface AlphabetRegistration {
    public static final Character.UnicodeBlock[] JLM_GREEK = {Character.UnicodeBlock.GREEK, Character.UnicodeBlock.GREEK_EXTENDED};
    public static final Character.UnicodeBlock[] JLM_CYRILLIC = {Character.UnicodeBlock.CYRILLIC};

    Object getPackage();

    String getTeXFontFileName();

    Character.UnicodeBlock[] getUnicodeBlock();
}
