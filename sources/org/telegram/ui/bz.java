package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class bz extends rg.a {
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

    public static bz b(int i7, String str, boolean z9) {
        bz bzVar = new bz(4, false);
        bzVar.k = i7;
        bzVar.d = str;
        bzVar.l = z9;
        return bzVar;
    }

    public static bz c(int i7, String str, String str2, boolean z9) {
        bz bzVar = new bz(1, false);
        bzVar.g = z9;
        bzVar.d = str;
        bzVar.i = str2;
        bzVar.j = i7;
        return bzVar;
    }

    public static bz d(String str) {
        bz bzVar = new bz(TextUtils.isEmpty(str) ? 3 : 6, false);
        bzVar.d = str;
        return bzVar;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj == null || bz.class != obj.getClass()) {
                return false;
            }
            bz bzVar = (bz) obj;
            int i7 = this.a;
            if (i7 != bzVar.a) {
                return false;
            }
            if (i7 == 11) {
                if (!TextUtils.equals(this.d, bzVar.d) || !TextUtils.equals(this.e, bzVar.e)) {
                    return false;
                }
            } else {
                if ((i7 == 0 || i7 == 1 || i7 == 3 || i7 == 4) && !TextUtils.equals(this.d, bzVar.d)) {
                    return false;
                }
                int i10 = this.a;
                if (i10 == 0) {
                    if (this.f != bzVar.f) {
                        return false;
                    }
                } else if (i10 == 1) {
                    if (this.h != bzVar.h || !TextUtils.equals(this.i, bzVar.i) || this.j != bzVar.j) {
                        return false;
                    }
                } else if (i10 == 7 && (tL_exportedChatlistInvite = this.m) != (tL_exportedChatlistInvite2 = bzVar.m)) {
                    if (!TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                        return false;
                    }
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.m;
                    boolean z9 = tL_exportedChatlistInvite3.revoked;
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = bzVar.m;
                    if (z9 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.m.peers.size() != bzVar.m.peers.size()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
