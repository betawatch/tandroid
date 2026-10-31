package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a00 extends hg.b {
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

    public static a00 b(int i10, String str, boolean z10) {
        a00 a00Var = new a00(4, false);
        a00Var.k = i10;
        a00Var.d = str;
        a00Var.l = z10;
        return a00Var;
    }

    public static a00 c(int i10, String str, String str2, boolean z10) {
        a00 a00Var = new a00(1, false);
        a00Var.g = z10;
        a00Var.d = str;
        a00Var.i = str2;
        a00Var.j = i10;
        return a00Var;
    }

    public static a00 d(String str) {
        a00 a00Var = new a00(TextUtils.isEmpty(str) ? 3 : 6, false);
        a00Var.d = str;
        return a00Var;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj == null || a00.class != obj.getClass()) {
                return false;
            }
            a00 a00Var = (a00) obj;
            int i10 = this.a;
            if (i10 != a00Var.a) {
                return false;
            }
            if (i10 == 11) {
                if (!TextUtils.equals(this.d, a00Var.d) || !TextUtils.equals(this.e, a00Var.e)) {
                    return false;
                }
            } else {
                if ((i10 == 0 || i10 == 1 || i10 == 3 || i10 == 4) && !TextUtils.equals(this.d, a00Var.d)) {
                    return false;
                }
                int i11 = this.a;
                if (i11 == 0) {
                    if (this.f != a00Var.f) {
                        return false;
                    }
                } else if (i11 == 1) {
                    if (this.h != a00Var.h || !TextUtils.equals(this.i, a00Var.i) || this.j != a00Var.j) {
                        return false;
                    }
                } else if (i11 == 7 && (tL_exportedChatlistInvite = this.m) != (tL_exportedChatlistInvite2 = a00Var.m)) {
                    if (!TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                        return false;
                    }
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.m;
                    boolean z10 = tL_exportedChatlistInvite3.revoked;
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = a00Var.m;
                    if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.m.peers.size() != a00Var.m.peers.size()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
