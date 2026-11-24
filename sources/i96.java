// default package

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class i96 {
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

    public static i96 a(String str) {
        i96 i96Var = null;
        if (str != null && str.length() != 0) {
            String[] split = str.split("\\|");
            if (split.length >= 4) {
                i96Var = new i96();
                i96Var.a = split[0];
                i96Var.b = split[1];
                i96Var.c = split[2].toLowerCase();
                i96Var.d = split[3];
                if (split.length >= 5) {
                    i96Var.h = Utilities.z(split[4]).intValue();
                }
                i96Var.e = split.length >= 6 ? split[5] : "";
                i96Var.f = split.length >= 7 ? split[6] : i96Var.c;
                if (split.length >= 8) {
                    i96Var.g = Utilities.z(split[7]).intValue() == 1;
                }
                if (split.length >= 9) {
                    i96Var.i = Utilities.z(split[8]).intValue();
                }
                if (split.length >= 10) {
                    i96Var.k = Utilities.z(split[9]).intValue();
                } else {
                    i96Var.k = ConnectionsManager.DEFAULT_DATACENTER_ID;
                }
                if (!TextUtils.isEmpty(i96Var.e)) {
                    i96Var.e = i96Var.e.replace("-", "_");
                }
            }
        }
        return i96Var;
    }

    public final String b() {
        if (this.d == null || i() || j()) {
            boolean j = j();
            String str = this.c;
            return j ? b00.h("unofficial_", str) : str;
        }
        return "local_" + this.c;
    }

    public final String c() {
        return this.c.replace("_", "-");
    }

    public final File d() {
        if (j()) {
            return new File(a.h(), b00.j(new StringBuilder("unofficial_base_"), this.c, ".xml"));
        }
        return null;
    }

    public final File e() {
        if (i()) {
            return new File(a.h(), b00.j(new StringBuilder("remote_"), this.c, ".xml"));
        }
        if (j()) {
            return new File(a.h(), b00.j(new StringBuilder("unofficial_"), this.c, ".xml"));
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
