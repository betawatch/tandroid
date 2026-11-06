package org.telegram.messenger;

import android.util.Log;
import java.util.Locale;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class d1 {
    public final String a;
    public final String b;
    public final int c;

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
        this.b = sb2;
        this.a = str;
        int i7 = 2;
        Object[] objArr = {str, 23};
        if (!(str.length() <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        while (i7 <= 7 && !Log.isLoggable(this.a, i7)) {
            i7++;
        }
        this.c = i7;
    }

    public void a(String str, Object... objArr) {
        if (this.c <= 3) {
            Log.d(this.a, b(str, objArr));
        }
    }

    public String b(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.b.concat(str);
    }

    public d1(String str, int i7, String str2) {
        this.a = str;
        this.c = i7;
        this.b = str2;
    }
}
