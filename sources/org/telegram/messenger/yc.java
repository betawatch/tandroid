package org.telegram.messenger;

import android.text.TextUtils;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class yc {
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

    public static yc a(String str) {
        yc ycVar = null;
        if (str != null && str.length() != 0) {
            String[] split = str.split("\\|");
            if (split.length >= 4) {
                ycVar = new yc();
                ycVar.a = split[0];
                ycVar.b = split[1];
                ycVar.c = split[2].toLowerCase();
                ycVar.d = split[3];
                if (split.length >= 5) {
                    ycVar.h = Utilities.z(split[4]).intValue();
                }
                ycVar.e = split.length >= 6 ? split[5] : "";
                ycVar.f = split.length >= 7 ? split[6] : ycVar.c;
                if (split.length >= 8) {
                    ycVar.g = Utilities.z(split[7]).intValue() == 1;
                }
                if (split.length >= 9) {
                    ycVar.i = Utilities.z(split[8]).intValue();
                }
                if (split.length >= 10) {
                    ycVar.k = Utilities.z(split[9]).intValue();
                } else {
                    ycVar.k = ConnectionsManager.DEFAULT_DATACENTER_ID;
                }
                if (!TextUtils.isEmpty(ycVar.e)) {
                    ycVar.e = ycVar.e.replace("-", "_");
                }
            }
        }
        return ycVar;
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
            return new File(t0.h(), a1.g.s(new StringBuilder("unofficial_base_"), this.c, ".xml"));
        }
        return null;
    }

    public final File e() {
        if (i()) {
            return new File(t0.h(), a1.g.s(new StringBuilder("remote_"), this.c, ".xml"));
        }
        if (j()) {
            return new File(t0.h(), a1.g.s(new StringBuilder("unofficial_"), this.c, ".xml"));
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
