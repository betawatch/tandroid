package aj;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
