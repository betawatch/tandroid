package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class b10 extends pg.a {
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

    public static b10 b(int i10, String str, boolean z10) {
        b10 b10Var = new b10(4, false);
        b10Var.k = i10;
        b10Var.d = str;
        b10Var.l = z10;
        return b10Var;
    }

    public static b10 c(int i10, String str, String str2, boolean z10) {
        b10 b10Var = new b10(1, false);
        b10Var.g = z10;
        b10Var.d = str;
        b10Var.i = str2;
        b10Var.j = i10;
        return b10Var;
    }

    public static b10 d(String str) {
        b10 b10Var = new b10(TextUtils.isEmpty(str) ? 3 : 6, false);
        b10Var.d = str;
        return b10Var;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj == null || b10.class != obj.getClass()) {
                return false;
            }
            b10 b10Var = (b10) obj;
            int i10 = this.a;
            if (i10 != b10Var.a) {
                return false;
            }
            if (i10 == 11) {
                if (!TextUtils.equals(this.d, b10Var.d) || !TextUtils.equals(this.e, b10Var.e)) {
                    return false;
                }
            } else {
                if ((i10 == 0 || i10 == 1 || i10 == 3 || i10 == 4) && !TextUtils.equals(this.d, b10Var.d)) {
                    return false;
                }
                int i11 = this.a;
                if (i11 == 0) {
                    if (this.f != b10Var.f) {
                        return false;
                    }
                } else if (i11 == 1) {
                    if (this.h != b10Var.h || !TextUtils.equals(this.i, b10Var.i) || this.j != b10Var.j) {
                        return false;
                    }
                } else if (i11 == 7 && (tL_exportedChatlistInvite = this.m) != (tL_exportedChatlistInvite2 = b10Var.m)) {
                    if (!TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                        return false;
                    }
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.m;
                    boolean z10 = tL_exportedChatlistInvite3.revoked;
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = b10Var.m;
                    if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.m.peers.size() != b10Var.m.peers.size()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
