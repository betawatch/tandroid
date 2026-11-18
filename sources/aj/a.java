package aj;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class a {
    public final String a;
    public volatile boolean b;
    public volatile boolean c;
    public volatile boolean d;

    public a(String str) {
        this.a = str;
    }

    public final void a() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (!this.b) {
                SharedPreferences sharedPreferences = d.a;
                this.c = sharedPreferences.contains(this.a);
                this.d = sharedPreferences.getBoolean(this.a, true);
                this.b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.c = true;
        this.b = true;
        d.a.edit().putBoolean(this.a, z10).apply();
    }
}
