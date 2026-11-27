// default package

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ckb extends dx6 {
    public final /* synthetic */ dkb g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckb(dkb dkbVar) {
        super((byte) 1);
        this.g = dkbVar;
    }

    @Override // dx6
    public final void A(String str, Bundle bundle) {
        t(str);
    }

    @Override // dx6
    public final void G(long j) {
        r47 r47Var = MediaController.z().v0;
        if (r47Var != null) {
            MediaController.z().k0(r47Var, (float) ((j / 1000.0d) / r47Var.L0()));
        }
    }

    @Override // dx6
    public final void M(int i) {
        xea.D(i != 1 ? (i == 2 || i == 3) ? 1 : 0 : 2);
        this.g.f();
        hl.c3(new s8b(this, (byte) 14));
    }

    @Override // dx6
    public final void P(int i) {
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        if (z != xea.J0) {
            MediaController.z().n0(z ? 2 : 0);
        }
        this.g.b.v0(xea.J0 ? 1 : 0);
        hl.c3(new s8b(this, (byte) 14));
    }

    @Override // dx6
    public final void S() {
        r47 r47Var = MediaController.z().v0;
        if (r47Var == null || !r47Var.I3()) {
            return;
        }
        MediaController.z().X(false);
    }

    @Override // dx6
    public final void V() {
        r47 r47Var = MediaController.z().v0;
        if (r47Var == null || !r47Var.I3()) {
            return;
        }
        MediaController.z().Y();
    }

    @Override // dx6
    public final void Y(long j) {
        MediaController.z().W((int) j);
    }

    @Override // dx6
    public final void f(String str) {
        boolean equals = "org.telegram.android.musicplayer.repeat".equals(str);
        dkb dkbVar = this.g;
        if (equals) {
            xea.D((xea.O0 + 1) % 3);
            dkbVar.f();
        } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
            MediaController.z().n0(xea.J0 ? 0 : 2);
            dkbVar.b.v0(xea.J0 ? 1 : 0);
        }
    }

    @Override // dx6
    public final void k() {
        MediaController.z().U(MediaController.z().v0, true);
    }

    @Override // dx6
    public final void n() {
        r47 r47Var = MediaController.z().v0;
        if (r47Var != null) {
            MediaController.z().V(r47Var);
            return;
        }
        dkb dkbVar = this.g;
        if (dkbVar.d != 0) {
            q(qu6.p(new StringBuilder(), dkbVar.d, "_0"), null);
        }
    }

    @Override // dx6
    public final void q(String str, Bundle bundle) {
        dkb dkbVar = this.g;
        rx6 rx6Var = dkbVar.b;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String[] split = str.split("_");
        if (split.length == 2) {
            try {
                long parseLong = Long.parseLong(split[0]);
                int parseInt = Integer.parseInt(split[1]);
                ArrayList arrayList = (ArrayList) dkbVar.j.f(parseLong);
                if (arrayList == null) {
                    dkbVar.e(new pwa(this, str, bundle, (byte) 19), parseLong);
                    return;
                }
                ArrayList arrayList2 = (ArrayList) dkbVar.k.f(parseLong);
                if (parseInt < 0 || parseInt >= arrayList.size()) {
                    return;
                }
                dkbVar.d = parseLong;
                uc7.s1(dkbVar.c).X3.edit().putLong("auto_lastSelectedDialog", parseLong).apply();
                MediaController.z().q0(arrayList, (r47) arrayList.get(parseInt), 0L, false, null, 0L);
                rx6Var.t0(arrayList2);
                if (wf3.D(parseLong)) {
                    TLRPC.User user = (TLRPC.User) dkbVar.h.f(parseLong);
                    ((ex6) rx6Var.b).a.setQueueTitle(user != null ? lv2.m(0, user.first_name, user.last_name) : "DELETED USER");
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) dkbVar.i.f(-parseLong);
                    ((ex6) rx6Var.b).a.setQueueTitle(chat != null ? chat.title : "DELETED CHAT");
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    @Override // dx6
    public final void t(String str) {
        String str2;
        dkb dkbVar = this.g;
        ArrayList arrayList = dkbVar.g;
        if (str == null || str.length() == 0) {
            return;
        }
        String lowerCase = str.toLowerCase();
        for (int i = 0; i < arrayList.size(); i++) {
            long longValue = ((Long) arrayList.get(i)).longValue();
            if (wf3.D(longValue)) {
                TLRPC.User user = (TLRPC.User) dkbVar.h.f(longValue);
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
                TLRPC.Chat chat = (TLRPC.Chat) dkbVar.i.f(-longValue);
                if (chat != null && (str2 = chat.title) != null && str2.toLowerCase().contains(lowerCase)) {
                    q(longValue + "_0", null);
                    return;
                }
            }
        }
    }

    @Override // dx6
    public final void x(String str, Bundle bundle) {
        q(str, bundle);
    }
}
