package com.google.mlkit.nl.languageid.internal;

import java.util.List;

/* loaded from: classes3.dex */
public interface LanguageIdentifierDelegate {
    List identifyPossibleLanguages(String str, float f);

    void init();

    void release();
}
