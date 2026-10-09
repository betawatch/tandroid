package com.google.android.gms.internal.clearcut;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public final class f extends d {
    public final Object i;
    public String j;
    public t1 k;

    public f(h hVar, String str, t1 t1Var) {
        super(hVar, str, t1Var);
        this.i = new Object();
    }

    @Override // com.google.android.gms.internal.clearcut.d
    public final Object d(String str) {
        t1 t1Var;
        try {
            synchronized (this.i) {
                try {
                    if (!str.equals(this.j)) {
                        t1 g10 = t1.g(Base64.decode(str, 3));
                        this.j = str;
                        this.k = g10;
                    }
                    t1Var = this.k;
                } finally {
                }
            }
            return t1Var;
        } catch (IOException | IllegalArgumentException unused) {
            String str2 = this.b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + 27);
            sb2.append("Invalid byte[] value for ");
            sb2.append(str2);
            sb2.append(": ");
            sb2.append(str);
            Log.e("PhenotypeFlag", sb2.toString());
            return null;
        }
    }
}
