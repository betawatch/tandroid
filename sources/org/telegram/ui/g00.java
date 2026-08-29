package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class g00 extends zf.a {
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

    public static g00 b(int i10, String str, boolean z10) {
        g00 g00Var = new g00(4, false);
        g00Var.k = i10;
        g00Var.d = str;
        g00Var.l = z10;
        return g00Var;
    }

    public static g00 c(int i10, String str, String str2, boolean z10) {
        g00 g00Var = new g00(1, false);
        g00Var.g = z10;
        g00Var.d = str;
        g00Var.i = str2;
        g00Var.j = i10;
        return g00Var;
    }

    public static g00 d(String str) {
        g00 g00Var = new g00(TextUtils.isEmpty(str) ? 3 : 6, false);
        g00Var.d = str;
        return g00Var;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj == null || g00.class != obj.getClass()) {
                return false;
            }
            g00 g00Var = (g00) obj;
            int i10 = this.a;
            if (i10 != g00Var.a) {
                return false;
            }
            if (i10 == 11) {
                if (!TextUtils.equals(this.d, g00Var.d) || !TextUtils.equals(this.e, g00Var.e)) {
                    return false;
                }
            } else {
                if ((i10 == 0 || i10 == 1 || i10 == 3 || i10 == 4) && !TextUtils.equals(this.d, g00Var.d)) {
                    return false;
                }
                int i11 = this.a;
                if (i11 == 0) {
                    if (this.f != g00Var.f) {
                        return false;
                    }
                } else if (i11 == 1) {
                    if (this.h != g00Var.h || !TextUtils.equals(this.i, g00Var.i) || this.j != g00Var.j) {
                        return false;
                    }
                } else if (i11 == 7 && (tL_exportedChatlistInvite = this.m) != (tL_exportedChatlistInvite2 = g00Var.m)) {
                    if (!TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                        return false;
                    }
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.m;
                    boolean z10 = tL_exportedChatlistInvite3.revoked;
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = g00Var.m;
                    if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.m.peers.size() != g00Var.m.peers.size()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
