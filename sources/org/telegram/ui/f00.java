package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class f00 extends qg.a {
    public View.OnClickListener c;
    public CharSequence d;
    public String e;
    public boolean f;
    public boolean g;
    public long h;
    public String i;
    public int j;
    public int k;
    public boolean l;
    public TL_chatlists.TL_exportedChatlistInvite m;

    public static f00 b(int i10, String str, boolean z10) {
        f00 f00Var = new f00(4, false);
        f00Var.k = i10;
        f00Var.d = str;
        f00Var.l = z10;
        return f00Var;
    }

    public static f00 c(int i10, String str, String str2, boolean z10) {
        f00 f00Var = new f00(1, false);
        f00Var.g = z10;
        f00Var.d = str;
        f00Var.i = str2;
        f00Var.j = i10;
        return f00Var;
    }

    public static f00 d(String str) {
        f00 f00Var = new f00(TextUtils.isEmpty(str) ? 3 : 6, false);
        f00Var.d = str;
        return f00Var;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj == null || f00.class != obj.getClass()) {
                return false;
            }
            f00 f00Var = (f00) obj;
            int i10 = this.a;
            if (i10 != f00Var.a) {
                return false;
            }
            if (i10 == 11) {
                if (!TextUtils.equals(this.d, f00Var.d) || !TextUtils.equals(this.e, f00Var.e)) {
                    return false;
                }
            } else {
                if ((i10 == 0 || i10 == 1 || i10 == 3 || i10 == 4) && !TextUtils.equals(this.d, f00Var.d)) {
                    return false;
                }
                int i11 = this.a;
                if (i11 == 0) {
                    if (this.f != f00Var.f) {
                        return false;
                    }
                } else if (i11 == 1) {
                    if (this.h != f00Var.h || !TextUtils.equals(this.i, f00Var.i) || this.j != f00Var.j) {
                        return false;
                    }
                } else if (i11 == 7 && (tL_exportedChatlistInvite = this.m) != (tL_exportedChatlistInvite2 = f00Var.m)) {
                    if (!TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                        return false;
                    }
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.m;
                    boolean z10 = tL_exportedChatlistInvite3.revoked;
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = f00Var.m;
                    if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.m.peers.size() != f00Var.m.peers.size()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
