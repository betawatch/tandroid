package org.telegram.messenger;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g00 extends android.support.v4.media.session.s {
    public final /* synthetic */ h00 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g00(h00 h00Var) {
        super(0);
        this.g = h00Var;
    }

    @Override // android.support.v4.media.session.s
    public final void A(String str, Bundle bundle) {
        t(str);
    }

    @Override // android.support.v4.media.session.s
    public final void G(long j10) {
        jj jjVar = MediaController.B().u0;
        if (jjVar != null) {
            MediaController.B().i0(jjVar, (float) ((j10 / 1000.0d) / jjVar.L0()));
        }
    }

    @Override // android.support.v4.media.session.s
    public final void M(int i10) {
        tz.E(i10 != 1 ? (i10 == 2 || i10 == 3) ? 1 : 0 : 2);
        this.g.f();
        i0.g3(new ms(this, 17));
    }

    @Override // android.support.v4.media.session.s
    public final void P(int i10) {
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            z10 = false;
        }
        if (z10 != tz.N0) {
            MediaController.B().l0(z10 ? 2 : 0);
        }
        this.g.b.F(tz.N0 ? 1 : 0);
        i0.g3(new ms(this, 17));
    }

    @Override // android.support.v4.media.session.s
    public final void S() {
        jj jjVar = MediaController.B().u0;
        if (jjVar == null || !jjVar.I3()) {
            return;
        }
        MediaController.B().U(false);
    }

    @Override // android.support.v4.media.session.s
    public final void V() {
        jj jjVar = MediaController.B().u0;
        if (jjVar == null || !jjVar.I3()) {
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
        h00 h00Var = this.g;
        if (equals) {
            tz.E((tz.S0 + 1) % 3);
            h00Var.f();
        } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
            MediaController.B().l0(tz.N0 ? 0 : 2);
            h00Var.b.F(tz.N0 ? 1 : 0);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void k() {
        MediaController.B().R(MediaController.B().u0, true);
    }

    @Override // android.support.v4.media.session.s
    public final void n() {
        jj jjVar = MediaController.B().u0;
        if (jjVar != null) {
            MediaController.B().S(jjVar);
            return;
        }
        h00 h00Var = this.g;
        if (h00Var.d != 0) {
            q(a1.g.q(new StringBuilder(), h00Var.d, "_0"), null);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void q(String str, Bundle bundle) {
        h00 h00Var = this.g;
        android.support.v4.media.session.a0 a0Var = h00Var.b;
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
            ArrayList arrayList = (ArrayList) h00Var.j.f(parseLong);
            if (arrayList == null) {
                h00Var.e(new e00(this, str, bundle), parseLong);
                return;
            }
            ArrayList arrayList2 = (ArrayList) h00Var.k.f(parseLong);
            if (parseInt >= 0 && parseInt < arrayList.size()) {
                h00Var.d = parseLong;
                vp.r1(h00Var.c).e7.edit().putLong("auto_lastSelectedDialog", parseLong).apply();
                MediaController.B().o0(arrayList, (jj) arrayList.get(parseInt), 0L, false, null);
                a0Var.D(arrayList2);
                if (o5.E(parseLong)) {
                    TLRPC.User user = (TLRPC.User) h00Var.h.f(parseLong);
                    ((android.support.v4.media.session.u) a0Var.b).a.setQueueTitle(user != null ? i5.m(0, user.first_name, user.last_name) : "DELETED USER");
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) h00Var.i.f(-parseLong);
                    ((android.support.v4.media.session.u) a0Var.b).a.setQueueTitle(chat != null ? chat.title : "DELETED CHAT");
                }
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void t(String str) {
        String str2;
        h00 h00Var = this.g;
        ArrayList arrayList = h00Var.g;
        if (str == null || str.length() == 0) {
            return;
        }
        String lowerCase = str.toLowerCase();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long longValue = ((Long) arrayList.get(i10)).longValue();
            if (o5.E(longValue)) {
                TLRPC.User user = (TLRPC.User) h00Var.h.f(longValue);
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
                TLRPC.Chat chat = (TLRPC.Chat) h00Var.i.f(-longValue);
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
