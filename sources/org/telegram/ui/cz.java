package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class cz extends rg.a {
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

    public static cz b(int i7, String str, boolean z10) {
        cz czVar = new cz(4, false);
        czVar.k = i7;
        czVar.d = str;
        czVar.l = z10;
        return czVar;
    }

    public static cz c(int i7, String str, String str2, boolean z10) {
        cz czVar = new cz(1, false);
        czVar.g = z10;
        czVar.d = str;
        czVar.i = str2;
        czVar.j = i7;
        return czVar;
    }

    public static cz d(String str) {
        cz czVar = new cz(TextUtils.isEmpty(str) ? 3 : 6, false);
        czVar.d = str;
        return czVar;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj == null || cz.class != obj.getClass()) {
                return false;
            }
            cz czVar = (cz) obj;
            int i7 = this.a;
            if (i7 != czVar.a) {
                return false;
            }
            if (i7 == 11) {
                if (!TextUtils.equals(this.d, czVar.d) || !TextUtils.equals(this.e, czVar.e)) {
                    return false;
                }
            } else {
                if ((i7 == 0 || i7 == 1 || i7 == 3 || i7 == 4) && !TextUtils.equals(this.d, czVar.d)) {
                    return false;
                }
                int i10 = this.a;
                if (i10 == 0) {
                    if (this.f != czVar.f) {
                        return false;
                    }
                } else if (i10 == 1) {
                    if (this.h != czVar.h || !TextUtils.equals(this.i, czVar.i) || this.j != czVar.j) {
                        return false;
                    }
                } else if (i10 == 7 && (tL_exportedChatlistInvite = this.m) != (tL_exportedChatlistInvite2 = czVar.m)) {
                    if (!TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                        return false;
                    }
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.m;
                    boolean z10 = tL_exportedChatlistInvite3.revoked;
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = czVar.m;
                    if (z10 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.m.peers.size() != czVar.m.peers.size()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
