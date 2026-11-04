package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h1 {
    public static h1 m;
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
    public final e1 i = new e1(this, 0);

    public h1() {
        SharedPreferences sharedPreferences = t0.b.getSharedPreferences("beta", 0);
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
            return t0.b.getPackageManager().getPackageInfo(t0.b.getPackageName(), 0).versionName;
        } catch (Exception e10) {
            a8.g(e10, true);
            return "";
        }
    }

    public static int d() {
        try {
            return t0.b.getPackageManager().getPackageInfo(t0.b.getPackageName(), 0).versionCode;
        } catch (Exception e10) {
            a8.g(e10, true);
            return 0;
        }
    }

    public static h1 e() {
        if (m == null) {
            m = new h1();
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
            if (t0.x) {
                j10 = 86400000;
            } else {
                boolean z11 = r2.a;
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
        new org.telegram.ui.web.z0(new g1(0, this, runnable)).execute("https://telegram.org/dl/android/apk-public-beta.json");
    }

    public final void b(boolean z10) {
        if (this.j || !TextUtils.isEmpty(this.d)) {
            return;
        }
        this.j = true;
        this.k = 0.0f;
        hs.e().k(hs.R4, new Object[0]);
        if (TextUtils.isEmpty(this.f)) {
            if (z10) {
                this.j = false;
                return;
            } else {
                a(new e1(this, 1), true);
                return;
            }
        }
        final int i3 = 0;
        final int i10 = 1;
        HttpGetFileTask overrideExtension = new HttpGetFileTask(new u10(this) { // from class: org.telegram.messenger.f1
            public final /* synthetic */ h1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.u10
            public final void a(Object obj) {
                switch (i3) {
                    case 0:
                        g0.h3(new b4(15, this.b, (File) obj));
                        break;
                    default:
                        this.b.k = ((Float) obj).floatValue();
                        hs.e().k(hs.R4, new Object[0]);
                        break;
                }
            }
        }, new u10(this) { // from class: org.telegram.messenger.f1
            public final /* synthetic */ h1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.messenger.u10
            public final void a(Object obj) {
                switch (i10) {
                    case 0:
                        g0.h3(new b4(15, this.b, (File) obj));
                        break;
                    default:
                        this.b.k = ((Float) obj).floatValue();
                        hs.e().k(hs.R4, new Object[0]);
                        break;
                }
            }
        }).setOverrideExtension("apk");
        this.l = overrideExtension;
        overrideExtension.execute(this.f);
    }

    public final void f() {
        SharedPreferences.Editor edit = t0.b.getSharedPreferences("beta", 0).edit();
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
        int i3 = this.b;
        if (i3 == 0) {
            edit.remove("versionCode");
        } else {
            edit.putInt("versionCode", i3);
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
