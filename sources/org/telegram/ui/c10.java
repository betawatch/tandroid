package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class c10 extends pg.a {
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

    public static c10 b(int i10, String str, boolean z10) {
        c10 c10Var = new c10(4, false);
        c10Var.k = i10;
        c10Var.d = str;
        c10Var.l = z10;
        return c10Var;
    }

    public static c10 c(int i10, String str, String str2, boolean z10) {
        c10 c10Var = new c10(1, false);
        c10Var.g = z10;
        c10Var.d = str;
        c10Var.i = str2;
        c10Var.j = i10;
        return c10Var;
    }

    public static c10 d(String str) {
        c10 c10Var = new c10(TextUtils.isEmpty(str) ? 3 : 6, false);
        c10Var.d = str;
        return c10Var;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj == null || c10.class != obj.getClass()) {
                return false;
            }
            c10 c10Var = (c10) obj;
            int i10 = this.a;
            if (i10 != c10Var.a) {
                return false;
            }
            if (i10 == 11) {
                if (!TextUtils.equals(this.d, c10Var.d) || !TextUtils.equals(this.e, c10Var.e)) {
                    return false;
                }
            } else {
                if ((i10 == 0 || i10 == 1 || i10 == 3 || i10 == 4) && !TextUtils.equals(this.d, c10Var.d)) {
                    return false;
                }
                int i11 = this.a;
                if (i11 == 0) {
                    if (this.f != c10Var.f) {
                        return false;
                    }
                } else if (i11 == 1) {
                    if (this.h != c10Var.h || !TextUtils.equals(this.i, c10Var.i) || this.j != c10Var.j) {
                        return false;
                    }
                } else if (i11 == 7 && (tL_exportedChatlistInvite = this.m) != (tL_exportedChatlistInvite2 = c10Var.m)) {
                    if (!TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                        return false;
                    }
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.m;
                    boolean z10 = tL_exportedChatlistInvite3.revoked;
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = c10Var.m;
                    if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.m.peers.size() != c10Var.m.peers.size()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
