package org.telegram.messenger;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class tz extends android.support.v4.media.session.s {
    public final /* synthetic */ uz g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz(uz uzVar) {
        super(0);
        this.g = uzVar;
    }

    @Override // android.support.v4.media.session.s
    public final void A(String str, Bundle bundle) {
        t(str);
    }

    @Override // android.support.v4.media.session.s
    public final void G(long j3) {
        gj gjVar = MediaController.B().v0;
        if (gjVar != null) {
            MediaController.B().i0(gjVar, (float) ((j3 / 1000.0d) / gjVar.L0()));
        }
    }

    @Override // android.support.v4.media.session.s
    public final void M(int i7) {
        gz.E(i7 != 1 ? (i7 == 2 || i7 == 3) ? 1 : 0 : 2);
        this.g.f();
        g0.h3(new as(this, 16));
    }

    @Override // android.support.v4.media.session.s
    public final void P(int i7) {
        boolean z10 = true;
        if (i7 != 1 && i7 != 2) {
            z10 = false;
        }
        if (z10 != gz.N0) {
            MediaController.B().l0(z10 ? 2 : 0);
        }
        this.g.b.w(gz.N0 ? 1 : 0);
        g0.h3(new as(this, 16));
    }

    @Override // android.support.v4.media.session.s
    public final void S() {
        gj gjVar = MediaController.B().v0;
        if (gjVar == null || !gjVar.I3()) {
            return;
        }
        MediaController.B().U(false);
    }

    @Override // android.support.v4.media.session.s
    public final void V() {
        gj gjVar = MediaController.B().v0;
        if (gjVar == null || !gjVar.I3()) {
            return;
        }
        MediaController.B().V();
    }

    @Override // android.support.v4.media.session.s
    public final void Y(long j3) {
        MediaController.B().T((int) j3);
    }

    @Override // android.support.v4.media.session.s
    public final void f(String str) {
        boolean equals = "org.telegram.android.musicplayer.repeat".equals(str);
        uz uzVar = this.g;
        if (equals) {
            gz.E((gz.S0 + 1) % 3);
            uzVar.f();
        } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
            MediaController.B().l0(gz.N0 ? 0 : 2);
            uzVar.b.w(gz.N0 ? 1 : 0);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void k() {
        MediaController.B().R(MediaController.B().v0, true);
    }

    @Override // android.support.v4.media.session.s
    public final void n() {
        gj gjVar = MediaController.B().v0;
        if (gjVar != null) {
            MediaController.B().S(gjVar);
            return;
        }
        uz uzVar = this.g;
        if (uzVar.d != 0) {
            q(a8.p0.r(new StringBuilder(), uzVar.d, "_0"), null);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void q(String str, Bundle bundle) {
        uz uzVar = this.g;
        android.support.v4.media.session.a0 a0Var = uzVar.b;
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
            ArrayList arrayList = (ArrayList) uzVar.j.f(parseLong);
            if (arrayList == null) {
                uzVar.e(new sz(this, str, bundle, 0), parseLong);
                return;
            }
            ArrayList arrayList2 = (ArrayList) uzVar.k.f(parseLong);
            if (parseInt >= 0 && parseInt < arrayList.size()) {
                uzVar.d = parseLong;
                np.s1(uzVar.c).e7.edit().putLong("auto_lastSelectedDialog", parseLong).apply();
                MediaController.B().o0(arrayList, (gj) arrayList.get(parseInt), 0L, false, null, 0L);
                a0Var.u(arrayList2);
                if (m5.E(parseLong)) {
                    TLRPC.User user = (TLRPC.User) uzVar.h.f(parseLong);
                    ((android.support.v4.media.session.u) a0Var.b).a.setQueueTitle(user != null ? g5.m(0, user.first_name, user.last_name) : "DELETED USER");
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) uzVar.i.f(-parseLong);
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
        uz uzVar = this.g;
        ArrayList arrayList = uzVar.g;
        if (str == null || str.length() == 0) {
            return;
        }
        String lowerCase = str.toLowerCase();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            long longValue = ((Long) arrayList.get(i7)).longValue();
            if (m5.E(longValue)) {
                TLRPC.User user = (TLRPC.User) uzVar.h.f(longValue);
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
                TLRPC.Chat chat = (TLRPC.Chat) uzVar.i.f(-longValue);
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
