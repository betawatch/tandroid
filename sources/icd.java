// default package

import android.util.Log;

/* loaded from: classes.dex */
public final class icd extends zad {
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ icd(ko9 ko9Var, String str, Object obj, byte b) {
        super(ko9Var, str, obj);
        this.i = b;
    }

    @Override // zad
    public final /* synthetic */ Object d(String str) {
        switch (this.i) {
            case 0:
                if (gmf.c.matcher(str).matches()) {
                    return Boolean.TRUE;
                }
                if (gmf.d.matcher(str).matches()) {
                    return Boolean.FALSE;
                }
                String str2 = this.b;
                StringBuilder sb = new StringBuilder(str.length() + str2.length() + 28);
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
