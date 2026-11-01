package org.telegram.messenger;

import android.util.Log;
import java.util.Locale;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class g1 {
    public final String a;
    public final String b;
    public final int c;

    public g1(String str, String... strArr) {
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
        int i10 = 2;
        Object[] objArr = {str, 23};
        if (!(str.length() <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        while (i10 <= 7 && !Log.isLoggable(this.a, i10)) {
            i10++;
        }
        this.c = i10;
    }

    public void a(String str, Object... objArr) {
        if (this.c <= 3) {
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(this.a, this.b.concat(str));
        }
    }

    public g1(String str, int i10, String str2) {
        this.a = str;
        this.c = i10;
        this.b = str2;
    }
}
