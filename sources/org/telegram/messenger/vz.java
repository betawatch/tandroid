package org.telegram.messenger;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class vz extends android.support.v4.media.session.s {
    public final /* synthetic */ wz g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz(wz wzVar) {
        super(0);
        this.g = wzVar;
    }

    @Override // android.support.v4.media.session.s
    public final void A(String str, Bundle bundle) {
        t(str);
    }

    @Override // android.support.v4.media.session.s
    public final void G(long j3) {
        ij ijVar = MediaController.B().u0;
        if (ijVar != null) {
            MediaController.B().i0(ijVar, (float) ((j3 / 1000.0d) / ijVar.L0()));
        }
    }

    @Override // android.support.v4.media.session.s
    public final void M(int i7) {
        iz.E(i7 != 1 ? (i7 == 2 || i7 == 3) ? 1 : 0 : 2);
        this.g.f();
        g0.h3(new ds(this, 16));
    }

    @Override // android.support.v4.media.session.s
    public final void P(int i7) {
        boolean z9 = true;
        if (i7 != 1 && i7 != 2) {
            z9 = false;
        }
        if (z9 != iz.N0) {
            MediaController.B().l0(z9 ? 2 : 0);
        }
        this.g.b.x(iz.N0 ? 1 : 0);
        g0.h3(new ds(this, 16));
    }

    @Override // android.support.v4.media.session.s
    public final void S() {
        ij ijVar = MediaController.B().u0;
        if (ijVar == null || !ijVar.J3()) {
            return;
        }
        MediaController.B().U(false);
    }

    @Override // android.support.v4.media.session.s
    public final void V() {
        ij ijVar = MediaController.B().u0;
        if (ijVar == null || !ijVar.J3()) {
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
        wz wzVar = this.g;
        if (equals) {
            iz.E((iz.S0 + 1) % 3);
            wzVar.f();
        } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
            MediaController.B().l0(iz.N0 ? 0 : 2);
            wzVar.b.x(iz.N0 ? 1 : 0);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void k() {
        MediaController.B().R(MediaController.B().u0, true);
    }

    @Override // android.support.v4.media.session.s
    public final void n() {
        ij ijVar = MediaController.B().u0;
        if (ijVar != null) {
            MediaController.B().S(ijVar);
            return;
        }
        wz wzVar = this.g;
        if (wzVar.d != 0) {
            q(a8.p0.r(new StringBuilder(), wzVar.d, "_0"), null);
        }
    }

    @Override // android.support.v4.media.session.s
    public final void q(String str, Bundle bundle) {
        wz wzVar = this.g;
        android.support.v4.media.session.a0 a0Var = wzVar.b;
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
            ArrayList arrayList = (ArrayList) wzVar.j.f(parseLong);
            if (arrayList == null) {
                wzVar.e(new uz(this, str, bundle, 0), parseLong);
                return;
            }
            ArrayList arrayList2 = (ArrayList) wzVar.k.f(parseLong);
            if (parseInt >= 0 && parseInt < arrayList.size()) {
                wzVar.d = parseLong;
                qp.s1(wzVar.c).d7.edit().putLong("auto_lastSelectedDialog", parseLong).apply();
                MediaController.B().o0(arrayList, (ij) arrayList.get(parseInt), 0L, false, null, 0L);
                a0Var.v(arrayList2);
                if (m5.E(parseLong)) {
                    TLRPC.User user = (TLRPC.User) wzVar.h.f(parseLong);
                    ((android.support.v4.media.session.u) a0Var.b).a.setQueueTitle(user != null ? g5.m(0, user.first_name, user.last_name) : "DELETED USER");
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) wzVar.i.f(-parseLong);
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
        wz wzVar = this.g;
        ArrayList arrayList = wzVar.g;
        if (str == null || str.length() == 0) {
            return;
        }
        String lowerCase = str.toLowerCase();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            long longValue = ((Long) arrayList.get(i7)).longValue();
            if (m5.E(longValue)) {
                TLRPC.User user = (TLRPC.User) wzVar.h.f(longValue);
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
                TLRPC.Chat chat = (TLRPC.Chat) wzVar.i.f(-longValue);
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
