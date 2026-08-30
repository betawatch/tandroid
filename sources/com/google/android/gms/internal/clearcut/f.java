package com.google.android.gms.internal.clearcut;

import android.util.Log;

/* loaded from: classes.dex */
public final class f extends d {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(i iVar, String str, Object obj, int i10) {
        super(iVar, str, obj);
        this.i = i10;
    }

    @Override // com.google.android.gms.internal.clearcut.d
    public final /* synthetic */ Object d(String str) {
        switch (this.i) {
            case 0:
                if (f2.c.matcher(str).matches()) {
                    return Boolean.TRUE;
                }
                if (f2.d.matcher(str).matches()) {
                    return Boolean.FALSE;
                }
                String str2 = this.b;
                StringBuilder sb = new StringBuilder(str.length() + String.valueOf(str2).length() + 28);
                sb.append("Invalid boolean value for ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str);
                Log.e("PhenotypeFlag", sb.toString());
                return null;
            default:
                return str;
        }
    }
}
