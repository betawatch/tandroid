// default package

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gf4 extends ja {
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

    public static gf4 b(int i, String str, boolean z) {
        gf4 gf4Var = new gf4(4, false);
        gf4Var.k = i;
        gf4Var.d = str;
        gf4Var.l = z;
        return gf4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static gf4 c(int i, String str, String str2, boolean z) {
        gf4 gf4Var = new gf4(1, false);
        gf4Var.g = z;
        gf4Var.d = str;
        gf4Var.i = str2;
        gf4Var.j = i;
        return gf4Var;
    }

    public static gf4 d(String str) {
        gf4 gf4Var = new gf4(TextUtils.isEmpty(str) ? 3 : 6, false);
        gf4Var.d = str;
        return gf4Var;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj == null || gf4.class != obj.getClass()) {
                return false;
            }
            gf4 gf4Var = (gf4) obj;
            int i = this.a;
            if (i != gf4Var.a) {
                return false;
            }
            if (i == 11) {
                if (!TextUtils.equals(this.d, gf4Var.d) || !TextUtils.equals(this.e, gf4Var.e)) {
                    return false;
                }
            } else {
                if ((i == 0 || i == 1 || i == 3 || i == 4) && !TextUtils.equals(this.d, gf4Var.d)) {
                    return false;
                }
                int i2 = this.a;
                if (i2 == 0) {
                    if (this.f != gf4Var.f) {
                        return false;
                    }
                } else if (i2 == 1) {
                    if (this.h != gf4Var.h || !TextUtils.equals(this.i, gf4Var.i) || this.j != gf4Var.j) {
                        return false;
                    }
                } else if (i2 == 7 && (tL_exportedChatlistInvite = this.m) != (tL_exportedChatlistInvite2 = gf4Var.m)) {
                    if (!TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                        return false;
                    }
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.m;
                    boolean z = tL_exportedChatlistInvite3.revoked;
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = gf4Var.m;
                    if (z != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.m.peers.size() != gf4Var.m.peers.size()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
