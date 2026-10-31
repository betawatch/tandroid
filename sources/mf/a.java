package mf;

import android.content.SharedPreferences;
import android.os.SystemClock;
import org.telegram.messenger.w0;
import w7.u;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a {
    public final SharedPreferences a;
    public long b;
    public long c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = w0.b.getSharedPreferences("pip_duration_".concat(str), 0);
        this.a = sharedPreferences;
        this.b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        if (this.c == 0) {
            return;
        }
        this.b = (((SystemClock.uptimeMillis() - this.c) * (10 - r4)) / 10) + ((this.b * u.b(this.d, 0, 9)) / 10);
        this.c = 0L;
        this.d++;
        this.a.edit().putLong("estimated", this.b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.b > 0) {
            return u.a((SystemClock.uptimeMillis() - this.c) / this.b, 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
