package org.scilab.forge.jlatexmath;

import java.lang.Character;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public interface AlphabetRegistration {
    public static final Character.UnicodeBlock[] JLM_GREEK = {Character.UnicodeBlock.GREEK, Character.UnicodeBlock.GREEK_EXTENDED};
    public static final Character.UnicodeBlock[] JLM_CYRILLIC = {Character.UnicodeBlock.CYRILLIC};

    Object getPackage();

    String getTeXFontFileName();

    Character.UnicodeBlock[] getUnicodeBlock();
}
