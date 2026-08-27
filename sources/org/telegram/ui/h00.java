package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class h00 extends xf.a {
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

    public static h00 b(int i10, String str, boolean z10) {
        h00 h00Var = new h00(4, false);
        h00Var.k = i10;
        h00Var.d = str;
        h00Var.l = z10;
        return h00Var;
    }

    public static h00 c(int i10, String str, String str2, boolean z10) {
        h00 h00Var = new h00(1, false);
        h00Var.g = z10;
        h00Var.d = str;
        h00Var.i = str2;
        h00Var.j = i10;
        return h00Var;
    }

    public static h00 d(String str) {
        h00 h00Var = new h00(TextUtils.isEmpty(str) ? 3 : 6, false);
        h00Var.d = str;
        return h00Var;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj == null || h00.class != obj.getClass()) {
                return false;
            }
            h00 h00Var = (h00) obj;
            int i10 = this.a;
            if (i10 != h00Var.a) {
                return false;
            }
            if (i10 == 11) {
                if (!TextUtils.equals(this.d, h00Var.d) || !TextUtils.equals(this.e, h00Var.e)) {
                    return false;
                }
            } else {
                if ((i10 == 0 || i10 == 1 || i10 == 3 || i10 == 4) && !TextUtils.equals(this.d, h00Var.d)) {
                    return false;
                }
                int i11 = this.a;
                if (i11 == 0) {
                    if (this.f != h00Var.f) {
                        return false;
                    }
                } else if (i11 == 1) {
                    if (this.h != h00Var.h || !TextUtils.equals(this.i, h00Var.i) || this.j != h00Var.j) {
                        return false;
                    }
                } else if (i11 == 7 && (tL_exportedChatlistInvite = this.m) != (tL_exportedChatlistInvite2 = h00Var.m)) {
                    if (!TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                        return false;
                    }
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.m;
                    boolean z10 = tL_exportedChatlistInvite3.revoked;
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = h00Var.m;
                    if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.m.peers.size() != h00Var.m.peers.size()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
