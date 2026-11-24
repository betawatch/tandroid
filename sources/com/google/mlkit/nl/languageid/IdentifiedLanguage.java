package com.google.mlkit.nl.languageid;

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class IdentifiedLanguage {
    public final String a;
    public final float b;

    public IdentifiedLanguage(String str, float f) {
        this.a = str;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentifiedLanguage)) {
            return false;
        }
        IdentifiedLanguage identifiedLanguage = (IdentifiedLanguage) obj;
        if (Float.compare(identifiedLanguage.b, this.b) != 0) {
            return false;
        }
        Object obj2 = identifiedLanguage.a;
        String str = this.a;
        if (str != obj2) {
            return str != null && str.equals(obj2);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }

    public final String toString() {
        uqd uqdVar = new uqd("IdentifiedLanguage");
        byte b = 28;
        boolean z = false;
        wm9 wm9Var = new wm9(b, z);
        ((wm9) uqdVar.d).d = wm9Var;
        uqdVar.d = wm9Var;
        wm9Var.c = this.a;
        wm9Var.b = "languageTag";
        String valueOf = String.valueOf(this.b);
        vid vidVar = new vid(b, z);
        ((wm9) uqdVar.d).d = vidVar;
        uqdVar.d = vidVar;
        vidVar.c = valueOf;
        vidVar.b = "confidence";
        return uqdVar.toString();
    }
}
