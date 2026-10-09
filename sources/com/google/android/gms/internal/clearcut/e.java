package com.google.android.gms.internal.clearcut;

import android.util.Log;

/* loaded from: classes.dex */
public final class e extends d {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(h hVar, String str, Object obj, int i10) {
        super(hVar, str, obj);
        this.i = i10;
    }

    @Override // com.google.android.gms.internal.clearcut.d
    public final /* synthetic */ Object d(String str) {
        switch (this.i) {
            case 0:
                if (e2.c.matcher(str).matches()) {
                    return Boolean.TRUE;
                }
                if (e2.d.matcher(str).matches()) {
                    return Boolean.FALSE;
                }
                String str2 = this.b;
                StringBuilder sb2 = new StringBuilder(str.length() + String.valueOf(str2).length() + 28);
                sb2.append("Invalid boolean value for ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(str);
                Log.e("PhenotypeFlag", sb2.toString());
                return null;
            default:
                return str;
        }
    }
}
