package h6;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class b {
    public final String a;
    public final boolean b;
    public final String c;

    public b(String str, String str2) {
        o6.l.g(str, "The log tag cannot be null or empty.");
        this.a = str;
        this.b = str.length() <= 23;
        this.c = TextUtils.isEmpty(str2) ? null : a1.g.p("[", str2, "] ");
    }

    public final void a(Exception exc, String str, Object... objArr) {
        if (Build.TYPE.equals("user") || !this.b) {
            return;
        }
        String str2 = this.a;
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, d(str, objArr), exc);
        }
    }

    public final void b(String str, Object... objArr) {
        if (Build.TYPE.equals("user") || !this.b) {
            return;
        }
        String str2 = this.a;
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, d(str, objArr));
        }
    }

    public final void c(Object... objArr) {
        Log.e(this.a, d("Bundle is null", objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        String str2 = this.c;
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return String.valueOf(str2).concat(String.valueOf(str));
    }
}
