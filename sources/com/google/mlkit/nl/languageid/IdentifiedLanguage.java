package com.google.mlkit.nl.languageid;

import a5.m;
import f7.t0;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class IdentifiedLanguage {
    public final String a;
    public final float b;

    public IdentifiedLanguage(String str, float f10) {
        this.a = str;
        this.b = f10;
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
        m mVar = new m("IdentifiedLanguage", 14);
        m mVar2 = new m(13, false);
        ((m) mVar.d).d = mVar2;
        mVar.d = mVar2;
        mVar2.c = this.a;
        mVar2.b = "languageTag";
        String valueOf = String.valueOf(this.b);
        t0 t0Var = new t0(13, false);
        ((m) mVar.d).d = t0Var;
        mVar.d = t0Var;
        t0Var.c = valueOf;
        t0Var.b = "confidence";
        return mVar.toString();
    }
}
