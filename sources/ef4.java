// default package

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ef4 extends ka {
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

    public static ef4 b(int i, String str, boolean z) {
        ef4 ef4Var = new ef4(4, false);
        ef4Var.k = i;
        ef4Var.d = str;
        ef4Var.l = z;
        return ef4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ef4 c(int i, String str, String str2, boolean z) {
        ef4 ef4Var = new ef4(1, false);
        ef4Var.g = z;
        ef4Var.d = str;
        ef4Var.i = str2;
        ef4Var.j = i;
        return ef4Var;
    }

    public static ef4 d(String str) {
        ef4 ef4Var = new ef4(TextUtils.isEmpty(str) ? 3 : 6, false);
        ef4Var.d = str;
        return ef4Var;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj == null || ef4.class != obj.getClass()) {
                return false;
            }
            ef4 ef4Var = (ef4) obj;
            int i = this.a;
            if (i != ef4Var.a) {
                return false;
            }
            if (i == 11) {
                if (!TextUtils.equals(this.d, ef4Var.d) || !TextUtils.equals(this.e, ef4Var.e)) {
                    return false;
                }
            } else {
                if ((i == 0 || i == 1 || i == 3 || i == 4) && !TextUtils.equals(this.d, ef4Var.d)) {
                    return false;
                }
                int i2 = this.a;
                if (i2 == 0) {
                    if (this.f != ef4Var.f) {
                        return false;
                    }
                } else if (i2 == 1) {
                    if (this.h != ef4Var.h || !TextUtils.equals(this.i, ef4Var.i) || this.j != ef4Var.j) {
                        return false;
                    }
                } else if (i2 == 7 && (tL_exportedChatlistInvite = this.m) != (tL_exportedChatlistInvite2 = ef4Var.m)) {
                    if (!TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                        return false;
                    }
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.m;
                    boolean z = tL_exportedChatlistInvite3.revoked;
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = ef4Var.m;
                    if (z != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.m.peers.size() != ef4Var.m.peers.size()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
