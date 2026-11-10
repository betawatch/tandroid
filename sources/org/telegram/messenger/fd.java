package org.telegram.messenger;

import android.text.TextUtils;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class fd {
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

    public static fd a(String str) {
        fd fdVar = null;
        if (str != null && str.length() != 0) {
            String[] split = str.split("\\|");
            if (split.length >= 4) {
                fdVar = new fd();
                fdVar.a = split[0];
                fdVar.b = split[1];
                fdVar.c = split[2].toLowerCase();
                fdVar.d = split[3];
                if (split.length >= 5) {
                    fdVar.h = Utilities.z(split[4]).intValue();
                }
                fdVar.e = split.length >= 6 ? split[5] : "";
                fdVar.f = split.length >= 7 ? split[6] : fdVar.c;
                if (split.length >= 8) {
                    fdVar.g = Utilities.z(split[7]).intValue() == 1;
                }
                if (split.length >= 9) {
                    fdVar.i = Utilities.z(split[8]).intValue();
                }
                if (split.length >= 10) {
                    fdVar.k = Utilities.z(split[9]).intValue();
                } else {
                    fdVar.k = ConnectionsManager.DEFAULT_DATACENTER_ID;
                }
                if (!TextUtils.isEmpty(fdVar.e)) {
                    fdVar.e = fdVar.e.replace("-", "_");
                }
            }
        }
        return fdVar;
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
