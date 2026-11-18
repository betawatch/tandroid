package org.telegram.messenger;

import android.text.TextUtils;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class cd {
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

    public static cd a(String str) {
        cd cdVar = null;
        if (str != null && str.length() != 0) {
            String[] split = str.split("\\|");
            if (split.length >= 4) {
                cdVar = new cd();
                cdVar.a = split[0];
                cdVar.b = split[1];
                cdVar.c = split[2].toLowerCase();
                cdVar.d = split[3];
                if (split.length >= 5) {
                    cdVar.h = Utilities.z(split[4]).intValue();
                }
                cdVar.e = split.length >= 6 ? split[5] : "";
                cdVar.f = split.length >= 7 ? split[6] : cdVar.c;
                if (split.length >= 8) {
                    cdVar.g = Utilities.z(split[7]).intValue() == 1;
                }
                if (split.length >= 9) {
                    cdVar.i = Utilities.z(split[8]).intValue();
                }
                if (split.length >= 10) {
                    cdVar.k = Utilities.z(split[9]).intValue();
                } else {
                    cdVar.k = ConnectionsManager.DEFAULT_DATACENTER_ID;
                }
                if (!TextUtils.isEmpty(cdVar.e)) {
                    cdVar.e = cdVar.e.replace("-", "_");
                }
            }
        }
        return cdVar;
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
