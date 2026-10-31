package org.telegram.messenger;

import android.text.TextUtils;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class zc {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public int k;

    public static zc a(String str) {
        zc zcVar = null;
        if (str != null && str.length() != 0) {
            String[] split = str.split("\\|");
            if (split.length >= 4) {
                zcVar = new zc();
                zcVar.a = split[0];
                zcVar.b = split[1];
                zcVar.c = split[2].toLowerCase();
                zcVar.d = split[3];
                if (split.length >= 5) {
                    zcVar.h = Utilities.z(split[4]).intValue();
                }
                zcVar.e = split.length >= 6 ? split[5] : "";
                zcVar.f = split.length >= 7 ? split[6] : zcVar.c;
                if (split.length >= 8) {
                    zcVar.g = Utilities.z(split[7]).intValue() == 1;
                }
                if (split.length >= 9) {
                    zcVar.i = Utilities.z(split[8]).intValue();
                }
                if (split.length >= 10) {
                    zcVar.k = Utilities.z(split[9]).intValue();
                } else {
                    zcVar.k = ConnectionsManager.DEFAULT_DATACENTER_ID;
                }
                if (!TextUtils.isEmpty(zcVar.e)) {
                    zcVar.e = zcVar.e.replace("-", "_");
                }
            }
        }
        return zcVar;
    }

    public final String b() {
        if (this.d != null && !i() && !j()) {
            return "local_" + this.c;
        }
        if (!j()) {
            return this.c;
        }
        return "unofficial_" + this.c;
    }

    public final String c() {
        return this.c.replace("_", "-");
    }

    public final File d() {
        if (j()) {
            return new File(w0.h(), a1.g.r(new StringBuilder("unofficial_base_"), this.c, ".xml"));
        }
        return null;
    }

    public final File e() {
        if (i()) {
            return new File(w0.h(), a1.g.r(new StringBuilder("remote_"), this.c, ".xml"));
        }
        if (j()) {
            return new File(w0.h(), a1.g.r(new StringBuilder("unofficial_"), this.c, ".xml"));
        }
        if (TextUtils.isEmpty(this.d)) {
            return null;
        }
        return new File(this.d);
    }

    public final String f() {
        String str = this.e;
        if (str == null) {
            str = "";
        }
        TextUtils.isEmpty(this.f);
        return this.a + "|" + this.b + "|" + this.c + "|" + this.d + "|" + this.h + "|" + str + "|" + this.f + "|" + (this.g ? 1 : 0) + "|" + this.i + "|" + this.k;
    }

    public final boolean g() {
        return (!j() || TextUtils.isEmpty(this.e) || this.e.equals(this.c)) ? false : true;
    }

    public final boolean h() {
        return (TextUtils.isEmpty(this.d) || i() || j()) ? false : true;
    }

    public final boolean i() {
        return "remote".equals(this.d);
    }

    public final boolean j() {
        return "unofficial".equals(this.d);
    }
}
