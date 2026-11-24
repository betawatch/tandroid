// default package

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hb6 {
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

    public static hb6 a(String str) {
        hb6 hb6Var = null;
        if (str != null && str.length() != 0) {
            String[] split = str.split("\\|");
            if (split.length >= 4) {
                hb6Var = new hb6();
                hb6Var.a = split[0];
                hb6Var.b = split[1];
                hb6Var.c = split[2].toLowerCase();
                hb6Var.d = split[3];
                if (split.length >= 5) {
                    hb6Var.h = Utilities.z(split[4]).intValue();
                }
                hb6Var.e = split.length >= 6 ? split[5] : "";
                hb6Var.f = split.length >= 7 ? split[6] : hb6Var.c;
                if (split.length >= 8) {
                    hb6Var.g = Utilities.z(split[7]).intValue() == 1;
                }
                if (split.length >= 9) {
                    hb6Var.i = Utilities.z(split[8]).intValue();
                }
                if (split.length >= 10) {
                    hb6Var.k = Utilities.z(split[9]).intValue();
                } else {
                    hb6Var.k = ConnectionsManager.DEFAULT_DATACENTER_ID;
                }
                if (!TextUtils.isEmpty(hb6Var.e)) {
                    hb6Var.e = hb6Var.e.replace("-", "_");
                }
            }
        }
        return hb6Var;
    }

    public final String b() {
        if (this.d == null || i() || j()) {
            boolean j = j();
            String str = this.c;
            return j ? b10.h("unofficial_", str) : str;
        }
        return "local_" + this.c;
    }

    public final String c() {
        return this.c.replace("_", "-");
    }

    public final File d() {
        if (j()) {
            return new File(a.h(), b10.j(new StringBuilder("unofficial_base_"), this.c, ".xml"));
        }
        return null;
    }

    public final File e() {
        if (i()) {
            return new File(a.h(), b10.j(new StringBuilder("remote_"), this.c, ".xml"));
        }
        if (j()) {
            return new File(a.h(), b10.j(new StringBuilder("unofficial_"), this.c, ".xml"));
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
