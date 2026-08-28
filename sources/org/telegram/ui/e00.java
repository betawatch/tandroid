package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e00 extends wf.a {
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

    public static e00 b(int i9, String str, boolean z10) {
        e00 e00Var = new e00(4, false);
        e00Var.k = i9;
        e00Var.d = str;
        e00Var.l = z10;
        return e00Var;
    }

    public static e00 c(int i9, String str, String str2, boolean z10) {
        e00 e00Var = new e00(1, false);
        e00Var.g = z10;
        e00Var.d = str;
        e00Var.i = str2;
        e00Var.j = i9;
        return e00Var;
    }

    public static e00 d(String str) {
        e00 e00Var = new e00(TextUtils.isEmpty(str) ? 3 : 6, false);
        e00Var.d = str;
        return e00Var;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj == null || e00.class != obj.getClass()) {
                return false;
            }
            e00 e00Var = (e00) obj;
            int i9 = this.a;
            if (i9 != e00Var.a) {
                return false;
            }
            if (i9 == 11) {
                if (!TextUtils.equals(this.d, e00Var.d) || !TextUtils.equals(this.e, e00Var.e)) {
                    return false;
                }
            } else {
                if ((i9 == 0 || i9 == 1 || i9 == 3 || i9 == 4) && !TextUtils.equals(this.d, e00Var.d)) {
                    return false;
                }
                int i10 = this.a;
                if (i10 == 0) {
                    if (this.f != e00Var.f) {
                        return false;
                    }
                } else if (i10 == 1) {
                    if (this.h != e00Var.h || !TextUtils.equals(this.i, e00Var.i) || this.j != e00Var.j) {
                        return false;
                    }
                } else if (i10 == 7 && (tL_exportedChatlistInvite = this.m) != (tL_exportedChatlistInvite2 = e00Var.m)) {
                    if (!TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                        return false;
                    }
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.m;
                    boolean z10 = tL_exportedChatlistInvite3.revoked;
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = e00Var.m;
                    if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.m.peers.size() != e00Var.m.peers.size()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
