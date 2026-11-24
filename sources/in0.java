// default package

import android.content.SharedPreferences;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class in0 {
    public final String a;
    public volatile boolean b;
    public volatile boolean c;
    public volatile boolean d;

    public in0(String str) {
        this.a = str;
    }

    public final void a() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (!this.b) {
                SharedPreferences sharedPreferences = jaa.a;
                this.c = sharedPreferences.contains(this.a);
                this.d = sharedPreferences.getBoolean(this.a, true);
                this.b = true;
            }
        }
    }
}
