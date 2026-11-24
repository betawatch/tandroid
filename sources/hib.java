// default package

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hib extends yw6 {
    public final /* synthetic */ iib g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hib(iib iibVar) {
        super((byte) 1);
        this.g = iibVar;
    }

    @Override // yw6
    public final void A(String str, Bundle bundle) {
        t(str);
    }

    @Override // yw6
    public final void G(long j) {
        k47 k47Var = MediaController.w().v0;
        if (k47Var != null) {
            MediaController.w().h0(k47Var, (float) ((j / 1000.0d) / k47Var.L0()));
        }
    }

    @Override // yw6
    public final void M(int i) {
        gda.D(i != 1 ? (i == 2 || i == 3) ? 1 : 0 : 2);
        this.g.f();
        gm.c3(new zcb(this, (byte) 5));
    }

    @Override // yw6
    public final void P(int i) {
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        if (z != gda.J0) {
            MediaController.w().k0(z ? 2 : 0);
        }
        this.g.b.u0(gda.J0 ? 1 : 0);
        gm.c3(new zcb(this, (byte) 5));
    }

    @Override // yw6
    public final void S() {
        k47 k47Var = MediaController.w().v0;
        if (k47Var == null || !k47Var.I3()) {
            return;
        }
        MediaController.w().T(false);
    }

    @Override // yw6
    public final void V() {
        k47 k47Var = MediaController.w().v0;
        if (k47Var == null || !k47Var.I3()) {
            return;
        }
        MediaController.w().U();
    }

    @Override // yw6
    public final void Y(long j) {
        MediaController.w().S((int) j);
    }

    @Override // yw6
    public final void f(String str) {
        boolean equals = "org.telegram.android.musicplayer.repeat".equals(str);
        iib iibVar = this.g;
        if (equals) {
            gda.D((gda.O0 + 1) % 3);
            iibVar.f();
        } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
            MediaController.w().k0(gda.J0 ? 0 : 2);
            iibVar.b.u0(gda.J0 ? 1 : 0);
        }
    }

    @Override // yw6
    public final void k() {
        MediaController.w().Q(MediaController.w().v0, true);
    }

    @Override // yw6
    public final void n() {
        k47 k47Var = MediaController.w().v0;
        if (k47Var != null) {
            MediaController.w().R(k47Var);
            return;
        }
        iib iibVar = this.g;
        if (iibVar.d != 0) {
            q(kt6.q(new StringBuilder(), iibVar.d, "_0"), null);
        }
    }

    @Override // yw6
    public final void q(String str, Bundle bundle) {
        iib iibVar = this.g;
        mx6 mx6Var = iibVar.b;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String[] split = str.split("_");
        if (split.length == 2) {
            try {
                long parseLong = Long.parseLong(split[0]);
                int parseInt = Integer.parseInt(split[1]);
                ArrayList arrayList = (ArrayList) iibVar.j.f(parseLong);
                if (arrayList == null) {
                    iibVar.e(new j2b(this, str, bundle, (byte) 13), parseLong);
                    return;
                }
                ArrayList arrayList2 = (ArrayList) iibVar.k.f(parseLong);
                if (parseInt < 0 || parseInt >= arrayList.size()) {
                    return;
                }
                iibVar.d = parseLong;
                oc7.r1(iibVar.c).W3.edit().putLong("auto_lastSelectedDialog", parseLong).apply();
                MediaController.w().n0(arrayList, (k47) arrayList.get(parseInt), 0L, false, null, 0L);
                mx6Var.s0(arrayList2);
                if (pg3.D(parseLong)) {
                    TLRPC.User user = (TLRPC.User) iibVar.h.f(parseLong);
                    ((zw6) mx6Var.b).a.setQueueTitle(user != null ? bw2.m(0, user.first_name, user.last_name) : "DELETED USER");
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) iibVar.i.f(-parseLong);
                    ((zw6) mx6Var.b).a.setQueueTitle(chat != null ? chat.title : "DELETED CHAT");
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    @Override // yw6
    public final void t(String str) {
        String str2;
        iib iibVar = this.g;
        ArrayList arrayList = iibVar.g;
        if (str == null || str.length() == 0) {
            return;
        }
        String lowerCase = str.toLowerCase();
        for (int i = 0; i < arrayList.size(); i++) {
            long longValue = ((Long) arrayList.get(i)).longValue();
            if (pg3.D(longValue)) {
                TLRPC.User user = (TLRPC.User) iibVar.h.f(longValue);
                if (user == null) {
                    continue;
                } else {
                    String str3 = user.first_name;
                    String lowerCase2 = str3 != null ? str3.toLowerCase() : null;
                    String str4 = user.last_name;
                    String lowerCase3 = str4 != null ? str4.toLowerCase() : null;
                    if ((lowerCase2 != null && lowerCase2.contains(lowerCase)) || (lowerCase3 != null && lowerCase3.contains(lowerCase))) {
                        q(longValue + "_0", null);
                        return;
                    }
                }
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) iibVar.i.f(-longValue);
                if (chat != null && (str2 = chat.title) != null && str2.toLowerCase().contains(lowerCase)) {
                    q(longValue + "_0", null);
                    return;
                }
            }
        }
    }

    @Override // yw6
    public final void x(String str, Bundle bundle) {
        q(str, bundle);
    }
}
