package org.scilab.forge.jlatexmath;

import java.lang.Character;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public interface AlphabetRegistration {
    public static final Character.UnicodeBlock[] JLM_GREEK = {Character.UnicodeBlock.GREEK, Character.UnicodeBlock.GREEK_EXTENDED};
    public static final Character.UnicodeBlock[] JLM_CYRILLIC = {Character.UnicodeBlock.CYRILLIC};

    Object getPackage();

    String getTeXFontFileName();

    Character.UnicodeBlock[] getUnicodeBlock();
}
