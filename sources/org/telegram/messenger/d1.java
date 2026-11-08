package org.telegram.messenger;

import android.util.Log;
import java.util.Locale;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class d1 {
    public int a;
    public String b;
    public String c;

    public d1(String str, String... strArr) {
        String sb2;
        if (strArr.length == 0) {
            sb2 = "";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('[');
            for (String str2 : strArr) {
                if (sb3.length() > 1) {
                    sb3.append(",");
                }
                sb3.append(str2);
            }
            sb3.append("] ");
            sb2 = sb3.toString();
        }
        this.c = sb2;
        this.b = str;
        int i7 = 2;
        Object[] objArr = {str, 23};
        if (!(str.length() <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        while (i7 <= 7 && !Log.isLoggable(this.b, i7)) {
            i7++;
        }
        this.a = i7;
    }

    public void a(String str, Object... objArr) {
        if (this.a <= 3) {
            Log.d(this.b, b(str, objArr));
        }
    }

    public String b(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.c.concat(str);
    }

    public d1(String str, int i7, String str2) {
        this.b = str;
        this.a = i7;
        this.c = str2;
    }
}
