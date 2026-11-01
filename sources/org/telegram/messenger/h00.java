package org.telegram.messenger;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class h00 extends android.support.v4.media.session.s {
    public final /* synthetic */ i00 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h00(i00 i00Var) {
        super(0);
        this.g = i00Var;
    }

    @Override // android.support.v4.media.session.s
    public final void A(String str, Bundle bundle) {
        t(str);
    }

    @Override // android.support.v4.media.session.s
    public final void G(long j10) {
        kj kjVar = MediaController.B().u0;
        if (kjVar != null) {
            MediaController.B().i0(kjVar, (float) ((j10 / 1000.0d) / kjVar.L0()));
        }
    }

    @Override // android.support.v4.media.session.s
    public final void M(int i10) {
        uz.E(i10 != 1 ? (i10 == 2 || i10 == 3) ? 1 : 0 : 2);
        this.g.f();
        i0.g3(new ns(this, 17));
    }

    @Override // android.support.v4.media.session.s
    public final void P(int i10) {
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            z10 = false;
        }
        if (z10 != uz.N0) {
            MediaController.B().l0(z10 ? 2 : 0);
        }
        this.g.b.F(uz.N0 ? 1 : 0);
        i0.g3(new ns(this, 17));
    }

    @Override // android.support.v4.media.session.s
    public final void S() {
        kj kjVar = MediaController.B().u0;
        if (kjVar == null || !kjVar.I3()) {
            return;
        }
        MediaController.B().U(false);
    }

    @Override // android.support.v4.media.session.s
    public final void V() {
        kj kjVar = MediaController.B().u0;
        if (kjVar == null || !kjVar.I3()) {
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
        i00 i00Var = this.g;
        if (equals) {
            uz.E((uz.S0 + 1) % 3);
            i00Var.f();
        } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
            MediaController.B().l0(uz.N0 ? 0 : 2);
            i00Var.b.F(uz.N0 ? 1 : 0);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void k() {
        MediaController.B().R(MediaController.B().u0, true);
    }

    @Override // android.support.v4.media.session.s
    public final void n() {
        kj kjVar = MediaController.B().u0;
        if (kjVar != null) {
            MediaController.B().S(kjVar);
            return;
        }
        i00 i00Var = this.g;
        if (i00Var.d != 0) {
            q(a1.g.q(new StringBuilder(), i00Var.d, "_0"), null);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void q(String str, Bundle bundle) {
        i00 i00Var = this.g;
        android.support.v4.media.session.a0 a0Var = i00Var.b;
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
            ArrayList arrayList = (ArrayList) i00Var.j.f(parseLong);
            if (arrayList == null) {
                i00Var.e(new f00(this, str, bundle), parseLong);
                return;
            }
            ArrayList arrayList2 = (ArrayList) i00Var.k.f(parseLong);
            if (parseInt >= 0 && parseInt < arrayList.size()) {
                i00Var.d = parseLong;
                wp.r1(i00Var.c).e7.edit().putLong("auto_lastSelectedDialog", parseLong).apply();
                MediaController.B().o0(arrayList, (kj) arrayList.get(parseInt), 0L, false, null);
                a0Var.D(arrayList2);
                if (o5.E(parseLong)) {
                    TLRPC.User user = (TLRPC.User) i00Var.h.f(parseLong);
                    ((android.support.v4.media.session.u) a0Var.b).a.setQueueTitle(user != null ? i5.m(0, user.first_name, user.last_name) : "DELETED USER");
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) i00Var.i.f(-parseLong);
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
        i00 i00Var = this.g;
        ArrayList arrayList = i00Var.g;
        if (str == null || str.length() == 0) {
            return;
        }
        String lowerCase = str.toLowerCase();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long longValue = ((Long) arrayList.get(i10)).longValue();
            if (o5.E(longValue)) {
                TLRPC.User user = (TLRPC.User) i00Var.h.f(longValue);
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
                TLRPC.Chat chat = (TLRPC.Chat) i00Var.i.f(-longValue);
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
