// default package

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gd4 extends ja {
    public View.OnClickListener c;
    public String d;
    public String e;
    public boolean f;
    public boolean g;
    public long h;
    public String i;
    public short j;
    public int k;
    public boolean l;
    public TL_chatlists.TL_exportedChatlistInvite m;

    public static gd4 b(int i, String str, boolean z) {
        gd4 gd4Var = new gd4(4, false);
        gd4Var.k = i;
        gd4Var.d = str;
        gd4Var.l = z;
        return gd4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static gd4 c(int i, String str, String str2, boolean z) {
        gd4 gd4Var = new gd4(1, false);
        gd4Var.g = z;
        gd4Var.d = str;
        gd4Var.i = str2;
        gd4Var.j = i;
        return gd4Var;
    }

    public static gd4 d(String str) {
        gd4 gd4Var = new gd4(TextUtils.isEmpty(str) ? 3 : 6, false);
        gd4Var.d = str;
        return gd4Var;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj == null || gd4.class != obj.getClass()) {
                return false;
            }
            gd4 gd4Var = (gd4) obj;
            int i = this.a;
            if (i != gd4Var.a) {
                return false;
            }
            if (i == 11) {
                if (!TextUtils.equals(this.d, gd4Var.d) || !TextUtils.equals(this.e, gd4Var.e)) {
                    return false;
                }
            } else {
                if ((i == 0 || i == 1 || i == 3 || i == 4) && !TextUtils.equals(this.d, gd4Var.d)) {
                    return false;
                }
                int i2 = this.a;
                if (i2 == 0) {
                    if (this.f != gd4Var.f) {
                        return false;
                    }
                } else if (i2 == 1) {
                    if (this.h != gd4Var.h || !TextUtils.equals(this.i, gd4Var.i) || this.j != gd4Var.j) {
                        return false;
                    }
                } else if (i2 == 7 && (tL_exportedChatlistInvite = this.m) != (tL_exportedChatlistInvite2 = gd4Var.m)) {
                    if (!TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                        return false;
                    }
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.m;
                    boolean z = tL_exportedChatlistInvite3.revoked;
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = gd4Var.m;
                    if (z != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.m.peers.size() != gd4Var.m.peers.size()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
