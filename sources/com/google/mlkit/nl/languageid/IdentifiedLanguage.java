package com.google.mlkit.nl.languageid;

import java.util.Arrays;
import org.telegram.ui.Components.i61;
import y7.r0;
import y7.s2;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        s2 s2Var = new s2("IdentifiedLanguage");
        i61 i61Var = new i61(29, false);
        ((i61) s2Var.d).d = i61Var;
        s2Var.d = i61Var;
        i61Var.c = this.a;
        i61Var.b = "languageTag";
        String valueOf = String.valueOf(this.b);
        r0 r0Var = new r0(29, false);
        ((i61) s2Var.d).d = r0Var;
        s2Var.d = r0Var;
        r0Var.c = valueOf;
        r0Var.b = "confidence";
        return s2Var.toString();
    }
}
