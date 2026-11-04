package org.telegram.messenger;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class nz extends android.support.v4.media.session.s {
    public final /* synthetic */ oz g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz(oz ozVar) {
        super(0);
        this.g = ozVar;
    }

    @Override // android.support.v4.media.session.s
    public final void A(String str, Bundle bundle) {
        t(str);
    }

    @Override // android.support.v4.media.session.s
    public final void G(long j10) {
        zi ziVar = MediaController.B().v0;
        if (ziVar != null) {
            MediaController.B().i0(ziVar, (float) ((j10 / 1000.0d) / ziVar.L0()));
        }
    }

    @Override // android.support.v4.media.session.s
    public final void M(int i3) {
        az.E(i3 != 1 ? (i3 == 2 || i3 == 3) ? 1 : 0 : 2);
        this.g.f();
        g0.h3(new vs(this, 16));
    }

    @Override // android.support.v4.media.session.s
    public final void P(int i3) {
        boolean z10 = true;
        if (i3 != 1 && i3 != 2) {
            z10 = false;
        }
        if (z10 != az.N0) {
            MediaController.B().l0(z10 ? 2 : 0);
        }
        this.g.b.w(az.N0 ? 1 : 0);
        g0.h3(new vs(this, 16));
    }

    @Override // android.support.v4.media.session.s
    public final void S() {
        zi ziVar = MediaController.B().v0;
        if (ziVar == null || !ziVar.J3()) {
            return;
        }
        MediaController.B().U(false);
    }

    @Override // android.support.v4.media.session.s
    public final void V() {
        zi ziVar = MediaController.B().v0;
        if (ziVar == null || !ziVar.J3()) {
            return;
        }
        MediaController.B().V();
    }

    @Override // android.support.v4.media.session.s
    public final void Y(long j10) {
        MediaController.B().T((int) j10);
    }

    @Override // android.support.v4.media.session.s
    public final void f(String str) {
        boolean equals = "org.telegram.android.musicplayer.repeat".equals(str);
        oz ozVar = this.g;
        if (equals) {
            az.E((az.S0 + 1) % 3);
            ozVar.f();
        } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
            MediaController.B().l0(az.N0 ? 0 : 2);
            ozVar.b.w(az.N0 ? 1 : 0);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void k() {
        MediaController.B().R(MediaController.B().v0, true);
    }

    @Override // android.support.v4.media.session.s
    public final void n() {
        zi ziVar = MediaController.B().v0;
        if (ziVar != null) {
            MediaController.B().S(ziVar);
            return;
        }
        oz ozVar = this.g;
        if (ozVar.d != 0) {
            q(a1.g.r(new StringBuilder(), ozVar.d, "_0"), null);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void q(String str, Bundle bundle) {
        oz ozVar = this.g;
        android.support.v4.media.session.a0 a0Var = ozVar.b;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String[] split = str.split("_");
        if (split.length != 2) {
            return;
        }
        try {
            long parseLong = Long.parseLong(split[0]);
            int parseInt = Integer.parseInt(split[1]);
            ArrayList arrayList = (ArrayList) ozVar.j.f(parseLong);
            if (arrayList == null) {
                ozVar.e(new mz(this, str, bundle, 0), parseLong);
                return;
            }
            ArrayList arrayList2 = (ArrayList) ozVar.k.f(parseLong);
            if (parseInt >= 0 && parseInt < arrayList.size()) {
                ozVar.d = parseLong;
                hp.s1(ozVar.c).d7.edit().putLong("auto_lastSelectedDialog", parseLong).apply();
                MediaController.B().o0(arrayList, (zi) arrayList.get(parseInt), 0L, false, null, 0L);
                a0Var.u(arrayList2);
                if (m5.E(parseLong)) {
                    TLRPC.User user = (TLRPC.User) ozVar.h.f(parseLong);
                    ((android.support.v4.media.session.u) a0Var.b).a.setQueueTitle(user != null ? g5.m(0, user.first_name, user.last_name) : "DELETED USER");
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) ozVar.i.f(-parseLong);
                    ((android.support.v4.media.session.u) a0Var.b).a.setQueueTitle(chat != null ? chat.title : "DELETED CHAT");
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void t(String str) {
        String str2;
        oz ozVar = this.g;
        ArrayList arrayList = ozVar.g;
        if (str == null || str.length() == 0) {
            return;
        }
        String lowerCase = str.toLowerCase();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            long longValue = ((Long) arrayList.get(i3)).longValue();
            if (m5.E(longValue)) {
                TLRPC.User user = (TLRPC.User) ozVar.h.f(longValue);
                if (user != null) {
                    String str3 = user.first_name;
                    String lowerCase2 = str3 != null ? str3.toLowerCase() : null;
                    String str4 = user.last_name;
                    String lowerCase3 = str4 != null ? str4.toLowerCase() : null;
                    if ((lowerCase2 != null && lowerCase2.contains(lowerCase)) || (lowerCase3 != null && lowerCase3.contains(lowerCase))) {
                        q(longValue + "_0", null);
                        return;
                    }
                } else {
                    continue;
                }
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) ozVar.i.f(-longValue);
                if (chat != null && (str2 = chat.title) != null && str2.toLowerCase().contains(lowerCase)) {
                    q(longValue + "_0", null);
                    return;
                }
            }
        }
    }

    @Override // android.support.v4.media.session.s
    public final void x(String str, Bundle bundle) {
        q(str, bundle);
    }
}
