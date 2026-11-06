package org.telegram.messenger;

import android.text.TextUtils;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class ed {
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

    public static ed a(String str) {
        ed edVar = null;
        if (str != null && str.length() != 0) {
            String[] split = str.split("\\|");
            if (split.length >= 4) {
                edVar = new ed();
                edVar.a = split[0];
                edVar.b = split[1];
                edVar.c = split[2].toLowerCase();
                edVar.d = split[3];
                if (split.length >= 5) {
                    edVar.h = Utilities.z(split[4]).intValue();
                }
                edVar.e = split.length >= 6 ? split[5] : "";
                edVar.f = split.length >= 7 ? split[6] : edVar.c;
                if (split.length >= 8) {
                    edVar.g = Utilities.z(split[7]).intValue() == 1;
                }
                if (split.length >= 9) {
                    edVar.i = Utilities.z(split[8]).intValue();
                }
                if (split.length >= 10) {
                    edVar.k = Utilities.z(split[9]).intValue();
                } else {
                    edVar.k = ConnectionsManager.DEFAULT_DATACENTER_ID;
                }
                if (!TextUtils.isEmpty(edVar.e)) {
                    edVar.e = edVar.e.replace("-", "_");
                }
            }
        }
        return edVar;
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
            return new File(t0.h(), a8.p0.s(new StringBuilder("unofficial_base_"), this.c, ".xml"));
        }
        return null;
    }

    public final File e() {
        if (i()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("remote_"), this.c, ".xml"));
        }
        if (j()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("unofficial_"), this.c, ".xml"));
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
