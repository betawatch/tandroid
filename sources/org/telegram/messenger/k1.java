package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class k1 {
    public static k1 m;
    public String a;
    public int b;
    public String c;
    public String d;
    public long e;
    public String f;
    public boolean h;
    public boolean j;
    public float k;
    public HttpGetFileTask l;
    public boolean g = true;
    public final h1 i = new h1(this, 0);

    public k1() {
        SharedPreferences sharedPreferences = w0.b.getSharedPreferences("beta", 0);
        this.a = sharedPreferences.getString("version", null);
        this.b = sharedPreferences.getInt("versionCode", 0);
        this.c = sharedPreferences.getString("changelog", null);
        this.d = sharedPreferences.getString("path", null);
        this.e = sharedPreferences.getLong("lastCheck", 0L);
        if (d() >= this.b || !(TextUtils.isEmpty(this.d) || new File(this.d).exists())) {
            this.a = null;
            this.b = 0;
            this.d = null;
            this.c = null;
            this.e = 0L;
            f();
        }
    }

    public static String c() {
        try {
            return w0.b.getPackageManager().getPackageInfo(w0.b.getPackageName(), 0).versionName;
        } catch (Exception e) {
            f8.g(e, true);
            return "";
        }
    }

    public static int d() {
        try {
            return w0.b.getPackageManager().getPackageInfo(w0.b.getPackageName(), 0).versionCode;
        } catch (Exception e) {
            f8.g(e, true);
            return 0;
        }
    }

    public static k1 e() {
        if (m == null) {
            m = new k1();
        }
        return m;
    }

    public final void a(Runnable runnable, boolean z10) {
        long j10;
        if (this.h) {
            return;
        }
        if (this.g) {
            z10 = true;
        }
        if (!z10) {
            long currentTimeMillis = System.currentTimeMillis() - this.e;
            if (w0.x) {
                j10 = 86400000;
            } else {
                boolean z11 = v2.a;
                j10 = 1200000;
            }
            if (currentTimeMillis < j10) {
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
        }
        this.h = true;
        this.g = false;
        new org.telegram.ui.web.c1(new j1(0, this, runnable)).execute("https://telegram.org/dl/android/apk-public-beta.json");
    }

    public final void b(boolean z10) {
        if (this.j || !TextUtils.isEmpty(this.d)) {
            return;
        }
        this.j = true;
        this.k = 0.0f;
        zs.e().k(zs.R4, new Object[0]);
        if (TextUtils.isEmpty(this.f)) {
            if (z10) {
                this.j = false;
                return;
            } else {
                a(new h1(this, 1), true);
                return;
            }
        }
        final int i10 = 0;
        final int i11 = 1;
        HttpGetFileTask overrideExtension = new HttpGetFileTask(new q20(this) { // from class: org.telegram.messenger.i1
            public final /* synthetic */ k1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.q20
            public final void a(Object obj) {
                switch (i10) {
                    case 0:
                        i0.g3(new e4(13, this.b, (File) obj));
                        break;
                    default:
                        this.b.k = ((Float) obj).floatValue();
                        zs.e().k(zs.R4, new Object[0]);
                        break;
                }
            }
        }, new q20(this) { // from class: org.telegram.messenger.i1
            public final /* synthetic */ k1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.q20
            public final void a(Object obj) {
                switch (i11) {
                    case 0:
                        i0.g3(new e4(13, this.b, (File) obj));
                        break;
                    default:
                        this.b.k = ((Float) obj).floatValue();
                        zs.e().k(zs.R4, new Object[0]);
                        break;
                }
            }
        }).setOverrideExtension("apk");
        this.l = overrideExtension;
        overrideExtension.execute(this.f);
    }

    public final void f() {
        SharedPreferences.Editor edit = w0.b.getSharedPreferences("beta", 0).edit();
        if (TextUtils.isEmpty(this.a)) {
            edit.remove("version");
        } else {
            edit.putString("version", this.a);
        }
        if (TextUtils.isEmpty(this.c)) {
            edit.remove("changelog");
        } else {
            edit.putString("changelog", this.c);
        }
        int i10 = this.b;
        if (i10 == 0) {
            edit.remove("versionCode");
        } else {
            edit.putInt("versionCode", i10);
        }
        if (TextUtils.isEmpty(this.d)) {
            edit.remove("path");
        } else {
            edit.putString("path", this.d);
        }
        long j10 = this.e;
        if (j10 == 0) {
            edit.remove("lastCheck");
        } else {
            edit.putLong("lastCheck", j10);
        }
        edit.apply();
    }
}
