package org.telegram.messenger;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class qz extends android.support.v4.media.session.s {
    public final /* synthetic */ rz g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz(rz rzVar) {
        super(0);
        this.g = rzVar;
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
        cz.E(i7 != 1 ? (i7 == 2 || i7 == 3) ? 1 : 0 : 2);
        this.g.f();
        g0.g3(new yr(this, 16));
    }

    @Override // android.support.v4.media.session.s
    public final void P(int i7) {
        boolean z10 = true;
        if (i7 != 1 && i7 != 2) {
            z10 = false;
        }
        if (z10 != cz.N0) {
            MediaController.B().l0(z10 ? 2 : 0);
        }
        this.g.b.x(cz.N0 ? 1 : 0);
        g0.g3(new yr(this, 16));
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
        rz rzVar = this.g;
        if (equals) {
            cz.E((cz.S0 + 1) % 3);
            rzVar.f();
        } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
            MediaController.B().l0(cz.N0 ? 0 : 2);
            rzVar.b.x(cz.N0 ? 1 : 0);
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
        rz rzVar = this.g;
        if (rzVar.d != 0) {
            q(a8.p0.r(new StringBuilder(), rzVar.d, "_0"), null);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void q(String str, Bundle bundle) {
        rz rzVar = this.g;
        android.support.v4.media.session.a0 a0Var = rzVar.b;
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
            ArrayList arrayList = (ArrayList) rzVar.j.f(parseLong);
            if (arrayList == null) {
                rzVar.e(new pz(this, str, bundle, 0), parseLong);
                return;
            }
            ArrayList arrayList2 = (ArrayList) rzVar.k.f(parseLong);
            if (parseInt >= 0 && parseInt < arrayList.size()) {
                rzVar.d = parseLong;
                np.u1(rzVar.c).g7.edit().putLong("auto_lastSelectedDialog", parseLong).apply();
                MediaController.B().o0(arrayList, (gj) arrayList.get(parseInt), 0L, false, null, 0L);
                a0Var.v(arrayList2);
                if (n5.E(parseLong)) {
                    TLRPC.User user = (TLRPC.User) rzVar.h.f(parseLong);
                    ((android.support.v4.media.session.u) a0Var.b).a.setQueueTitle(user != null ? i5.m(0, user.first_name, user.last_name) : "DELETED USER");
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) rzVar.i.f(-parseLong);
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
        rz rzVar = this.g;
        ArrayList arrayList = rzVar.g;
        if (str == null || str.length() == 0) {
            return;
        }
        String lowerCase = str.toLowerCase();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            long longValue = ((Long) arrayList.get(i7)).longValue();
            if (n5.E(longValue)) {
                TLRPC.User user = (TLRPC.User) rzVar.h.f(longValue);
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
                TLRPC.Chat chat = (TLRPC.Chat) rzVar.i.f(-longValue);
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
