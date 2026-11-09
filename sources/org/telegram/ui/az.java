package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class az extends rg.a {
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

    public static az b(int i7, String str, boolean z9) {
        az azVar = new az(4, false);
        azVar.k = i7;
        azVar.d = str;
        azVar.l = z9;
        return azVar;
    }

    public static az c(int i7, String str, String str2, boolean z9) {
        az azVar = new az(1, false);
        azVar.g = z9;
        azVar.d = str;
        azVar.i = str2;
        azVar.j = i7;
        return azVar;
    }

    public static az d(String str) {
        az azVar = new az(TextUtils.isEmpty(str) ? 3 : 6, false);
        azVar.d = str;
        return azVar;
    }

    public final boolean equals(Object obj) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
        if (this != obj) {
            if (obj == null || az.class != obj.getClass()) {
                return false;
            }
            az azVar = (az) obj;
            int i7 = this.a;
            if (i7 != azVar.a) {
                return false;
            }
            if (i7 == 11) {
                if (!TextUtils.equals(this.d, azVar.d) || !TextUtils.equals(this.e, azVar.e)) {
                    return false;
                }
            } else {
                if ((i7 == 0 || i7 == 1 || i7 == 3 || i7 == 4) && !TextUtils.equals(this.d, azVar.d)) {
                    return false;
                }
                int i10 = this.a;
                if (i10 == 0) {
                    if (this.f != azVar.f) {
                        return false;
                    }
                } else if (i10 == 1) {
                    if (this.h != azVar.h || !TextUtils.equals(this.i, azVar.i) || this.j != azVar.j) {
                        return false;
                    }
                } else if (i10 == 7 && (tL_exportedChatlistInvite = this.m) != (tL_exportedChatlistInvite2 = azVar.m)) {
                    if (!TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                        return false;
                    }
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.m;
                    boolean z9 = tL_exportedChatlistInvite3.revoked;
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = azVar.m;
                    if (z9 != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.m.peers.size() != azVar.m.peers.size()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
