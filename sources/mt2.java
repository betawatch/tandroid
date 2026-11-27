// default package

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class mt2 implements ys3, zcd {
    public final /* synthetic */ byte a;
    public String b;

    public /* synthetic */ mt2(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    public static mt2 c(ey7 ey7Var) {
        String str;
        ey7Var.O(2);
        int A = ey7Var.A();
        int i = A >> 1;
        byte b = 1;
        int A2 = ((A & 1) << 5) | ((ey7Var.A() >> 3) & 31);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(i < 10 ? ".0" : ".");
        sb.append(i);
        sb.append(A2 < 10 ? ".0" : ".");
        sb.append(A2);
        return new mt2(sb.toString(), b);
    }

    @Override // ys3
    public final int a(int i) {
        return -1;
    }

    @Override // ys3
    public final boolean b(int i) {
        return false;
    }

    @Override // ys3
    public final char charAt(int i) {
        return this.b.charAt(i);
    }

    @Override // ys3
    public final int length() {
        return this.b.length();
    }

    @Override // ys3
    public final CharSequence subSequence(int i, int i2) {
        return this.b.subSequence(i, i2);
    }

    public final String toString() {
        switch (this.a) {
            case 2:
                return this.b;
            default:
                return super.toString();
        }
    }

    @Override // zcd
    public final Object zzp() {
        Object obj;
        boolean z;
        String str = this.b;
        ContentResolver contentResolver = zad.g.getContentResolver();
        Uri uri = gmf.a;
        synchronized (gmf.class) {
            gmf.c(contentResolver);
            obj = gmf.k;
        }
        HashMap hashMap = gmf.g;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) gmf.a(hashMap, str, bool);
        if (bool2 != null) {
            z = bool2.booleanValue();
        } else {
            String b = gmf.b(contentResolver, str);
            boolean z2 = false;
            if (b != null && !b.equals("")) {
                if (gmf.c.matcher(b).matches()) {
                    bool = Boolean.TRUE;
                    z2 = true;
                } else if (!gmf.d.matcher(b).matches()) {
                    Log.w("Gservices", c00.j("attempt to read gservices key ", str, " (value \"", b, "\") as boolean"));
                }
                gmf.e(obj, hashMap, str, bool);
                z = z2;
            }
            bool = bool2;
            gmf.e(obj, hashMap, str, bool);
            z = z2;
        }
        return Boolean.valueOf(z);
    }

    public /* synthetic */ mt2(byte b) {
        this.a = b;
    }
}
