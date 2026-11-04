package org.telegram.messenger;

import android.util.Log;
import java.util.Locale;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        int i3 = 2;
        Object[] objArr = {str, 23};
        if (!(str.length() <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        while (i3 <= 7 && !Log.isLoggable(this.a, i3)) {
            i3++;
        }
        this.c = i3;
    }

    public void a(String str, Object... objArr) {
        if (this.c <= 3) {
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(this.a, this.b.concat(str));
        }
    }

    public d1(String str, int i3, String str2) {
        this.a = str;
        this.c = i3;
        this.b = str2;
    }
}
