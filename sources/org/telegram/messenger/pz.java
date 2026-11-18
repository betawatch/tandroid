package org.telegram.messenger;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class pz extends android.support.v4.media.session.s {
    public final /* synthetic */ qz g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz(qz qzVar) {
        super(0);
        this.g = qzVar;
    }

    @Override // android.support.v4.media.session.s
    public final void A(String str, Bundle bundle) {
        t(str);
    }

    @Override // android.support.v4.media.session.s
    public final void G(long j3) {
        fj fjVar = MediaController.B().v0;
        if (fjVar != null) {
            MediaController.B().i0(fjVar, (float) ((j3 / 1000.0d) / fjVar.L0()));
        }
    }

    @Override // android.support.v4.media.session.s
    public final void M(int i7) {
        bz.E(i7 != 1 ? (i7 == 2 || i7 == 3) ? 1 : 0 : 2);
        this.g.f();
        g0.g3(new xr(this, 16));
    }

    @Override // android.support.v4.media.session.s
    public final void P(int i7) {
        boolean z10 = true;
        if (i7 != 1 && i7 != 2) {
            z10 = false;
        }
        if (z10 != bz.N0) {
            MediaController.B().l0(z10 ? 2 : 0);
        }
        this.g.b.x(bz.N0 ? 1 : 0);
        g0.g3(new xr(this, 16));
    }

    @Override // android.support.v4.media.session.s
    public final void S() {
        fj fjVar = MediaController.B().v0;
        if (fjVar == null || !fjVar.I3()) {
            return;
        }
        MediaController.B().U(false);
    }

    @Override // android.support.v4.media.session.s
    public final void V() {
        fj fjVar = MediaController.B().v0;
        if (fjVar == null || !fjVar.I3()) {
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
        qz qzVar = this.g;
        if (equals) {
            bz.E((bz.S0 + 1) % 3);
            qzVar.f();
        } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
            MediaController.B().l0(bz.N0 ? 0 : 2);
            qzVar.b.x(bz.N0 ? 1 : 0);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void k() {
        MediaController.B().R(MediaController.B().v0, true);
    }

    @Override // android.support.v4.media.session.s
    public final void n() {
        fj fjVar = MediaController.B().v0;
        if (fjVar != null) {
            MediaController.B().S(fjVar);
            return;
        }
        qz qzVar = this.g;
        if (qzVar.d != 0) {
            q(a8.p0.r(new StringBuilder(), qzVar.d, "_0"), null);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void q(String str, Bundle bundle) {
        qz qzVar = this.g;
        android.support.v4.media.session.a0 a0Var = qzVar.b;
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
            ArrayList arrayList = (ArrayList) qzVar.j.f(parseLong);
            if (arrayList == null) {
                qzVar.e(new oz(this, str, bundle, 0), parseLong);
                return;
            }
            ArrayList arrayList2 = (ArrayList) qzVar.k.f(parseLong);
            if (parseInt >= 0 && parseInt < arrayList.size()) {
                qzVar.d = parseLong;
                mp.u1(qzVar.c).g7.edit().putLong("auto_lastSelectedDialog", parseLong).apply();
                MediaController.B().o0(arrayList, (fj) arrayList.get(parseInt), 0L, false, null, 0L);
                a0Var.v(arrayList2);
                if (n5.E(parseLong)) {
                    TLRPC.User user = (TLRPC.User) qzVar.h.f(parseLong);
                    ((android.support.v4.media.session.u) a0Var.b).a.setQueueTitle(user != null ? i5.m(0, user.first_name, user.last_name) : "DELETED USER");
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) qzVar.i.f(-parseLong);
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
        qz qzVar = this.g;
        ArrayList arrayList = qzVar.g;
        if (str == null || str.length() == 0) {
            return;
        }
        String lowerCase = str.toLowerCase();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            long longValue = ((Long) arrayList.get(i7)).longValue();
            if (n5.E(longValue)) {
                TLRPC.User user = (TLRPC.User) qzVar.h.f(longValue);
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
                TLRPC.Chat chat = (TLRPC.Chat) qzVar.i.f(-longValue);
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
