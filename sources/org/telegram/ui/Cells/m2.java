package org.telegram.ui.Cells;

import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.zx;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class m2 extends th.t5 {
    public final /* synthetic */ v2 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(v2 v2Var) {
        super(null, false);
        this.S = v2Var;
    }

    @Override // th.t5
    public final boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return (((chat == null || chat.linked_community_id == 0) && (user == null || user.linked_community_id == 0)) || this.S.O0) ? false : true;
    }

    @Override // th.t5
    public final boolean d(long j10) {
        v2 v2Var = this.S;
        int i10 = v2Var.F0;
        zx zxVar = v2Var.D4;
        if (zxVar == null || v2Var.O0) {
            return false;
        }
        if (j10 > 0) {
            TLRPC.User Z1 = wp.r1(i10).Z1(Long.valueOf(j10));
            if (Z1 == null || Z1.linked_community_id == 0) {
                return false;
            }
            zxVar.showDialog(new yh.z(zxVar, Z1.linked_community_id));
            return true;
        }
        TLRPC.Chat L0 = wp.r1(i10).L0(Long.valueOf(-j10));
        if (L0 == null || L0.linked_community_id == 0) {
            return false;
        }
        zxVar.showDialog(new yh.z(zxVar, L0.linked_community_id));
        return true;
    }

    @Override // th.t5
    public final void e() {
        v2 v2Var = this.S;
        r2 r2Var = v2Var.d0;
        if (r2Var == null) {
            return;
        }
        r2Var.x(v2Var);
    }

    @Override // th.t5
    public final void f(long j10) {
        v2 v2Var = this.S;
        r2 r2Var = v2Var.d0;
        if (r2Var == null) {
            return;
        }
        if (v2Var.J0 != 0) {
            r2Var.q();
        } else {
            r2Var.u(v2Var);
        }
    }
}
