// default package

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ggb extends yu6 {
    public final /* synthetic */ hgb g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggb(hgb hgbVar) {
        super((byte) 1);
        this.g = hgbVar;
    }

    @Override // yu6
    public final void A(String str, Bundle bundle) {
        t(str);
    }

    @Override // yu6
    public final void G(long j) {
        k27 k27Var = MediaController.w().v0;
        if (k27Var != null) {
            MediaController.w().h0(k27Var, (float) ((j / 1000.0d) / k27Var.L0()));
        }
    }

    @Override // yu6
    public final void M(int i) {
        gba.D(i != 1 ? (i == 2 || i == 3) ? 1 : 0 : 2);
        this.g.f();
        gl.c3(new kya(this, (byte) 27));
    }

    @Override // yu6
    public final void P(int i) {
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        if (z != gba.J0) {
            MediaController.w().k0(z ? 2 : 0);
        }
        this.g.b.q0(gba.J0 ? 1 : 0);
        gl.c3(new kya(this, (byte) 27));
    }

    @Override // yu6
    public final void S() {
        k27 k27Var = MediaController.w().v0;
        if (k27Var == null || !k27Var.I3()) {
            return;
        }
        MediaController.w().T(false);
    }

    @Override // yu6
    public final void V() {
        k27 k27Var = MediaController.w().v0;
        if (k27Var == null || !k27Var.I3()) {
            return;
        }
        MediaController.w().U();
    }

    @Override // yu6
    public final void Y(long j) {
        MediaController.w().S((int) j);
    }

    @Override // yu6
    public final void f(String str) {
        boolean equals = "org.telegram.android.musicplayer.repeat".equals(str);
        hgb hgbVar = this.g;
        if (equals) {
            gba.D((gba.O0 + 1) % 3);
            hgbVar.f();
        } else if ("org.telegram.android.musicplayer.shuffle".equals(str)) {
            MediaController.w().k0(gba.J0 ? 0 : 2);
            hgbVar.b.q0(gba.J0 ? 1 : 0);
        }
    }

    @Override // yu6
    public final void k() {
        MediaController.w().Q(MediaController.w().v0, true);
    }

    @Override // yu6
    public final void n() {
        k27 k27Var = MediaController.w().v0;
        if (k27Var != null) {
            MediaController.w().R(k27Var);
            return;
        }
        hgb hgbVar = this.g;
        if (hgbVar.d != 0) {
            q(ls6.p(new StringBuilder(), hgbVar.d, "_0"), null);
        }
    }

    @Override // yu6
    public final void q(String str, Bundle bundle) {
        hgb hgbVar = this.g;
        mv6 mv6Var = hgbVar.b;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String[] split = str.split("_");
        if (split.length == 2) {
            try {
                long parseLong = Long.parseLong(split[0]);
                int parseInt = Integer.parseInt(split[1]);
                ArrayList arrayList = (ArrayList) hgbVar.j.f(parseLong);
                if (arrayList == null) {
                    hgbVar.e(new r1b(this, str, bundle, (byte) 10), parseLong);
                    return;
                }
                ArrayList arrayList2 = (ArrayList) hgbVar.k.f(parseLong);
                if (parseInt < 0 || parseInt >= arrayList.size()) {
                    return;
                }
                hgbVar.d = parseLong;
                na7.q1(hgbVar.c).W3.edit().putLong("auto_lastSelectedDialog", parseLong).apply();
                MediaController.w().n0(arrayList, (k27) arrayList.get(parseInt), 0L, false, null, 0L);
                mv6Var.o0(arrayList2);
                if (cf3.D(parseLong)) {
                    TLRPC.User user = (TLRPC.User) hgbVar.h.f(parseLong);
                    ((zu6) mv6Var.b).a.setQueueTitle(user != null ? qu2.m(0, user.first_name, user.last_name) : "DELETED USER");
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) hgbVar.i.f(-parseLong);
                    ((zu6) mv6Var.b).a.setQueueTitle(chat != null ? chat.title : "DELETED CHAT");
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    @Override // yu6
    public final void t(String str) {
        String str2;
        hgb hgbVar = this.g;
        ArrayList arrayList = hgbVar.g;
        if (str == null || str.length() == 0) {
            return;
        }
        String lowerCase = str.toLowerCase();
        for (int i = 0; i < arrayList.size(); i++) {
            long longValue = ((Long) arrayList.get(i)).longValue();
            if (cf3.D(longValue)) {
                TLRPC.User user = (TLRPC.User) hgbVar.h.f(longValue);
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
                TLRPC.Chat chat = (TLRPC.Chat) hgbVar.i.f(-longValue);
                if (chat != null && (str2 = chat.title) != null && str2.toLowerCase().contains(lowerCase)) {
                    q(longValue + "_0", null);
                    return;
                }
            }
        }
    }

    @Override // yu6
    public final void x(String str, Bundle bundle) {
        q(str, bundle);
    }
}
