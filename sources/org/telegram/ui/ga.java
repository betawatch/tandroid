package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ga extends org.telegram.ui.Components.sk0 {
    public final /* synthetic */ oa c;

    public ga(oa oaVar) {
        this.c = oaVar;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 4;
    }

    @Override // s4.g0
    public final int b() {
        oa oaVar = this.c;
        org.telegram.ui.Components.tk0 tk0Var = oaVar.b;
        ArrayList arrayList = oaVar.w;
        if (tk0Var != null) {
            ArrayList arrayList2 = tk0Var.K2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                tk0Var.K2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                oaVar.b.K2.add(Long.valueOf(org.telegram.messenger.i0.w2(3, arrayList.size() + 3)));
            }
        }
        return (oaVar.w.size() > 0 ? oaVar.w.size() + 2 : 0) + 3;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 0;
        }
        return i10 != b() - 1 ? 4 : 2;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        oa oaVar = this.c;
        long j10 = oaVar.y;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.p4) view).setText(org.telegram.messenger.cd.L0(i10 == 0 ? j10 != 0 ? 2131752985 : 2131745515 : 2131743668, null));
            return;
        }
        if (i11 == 2) {
            ((org.telegram.ui.Cells.b9) view).setText(org.telegram.messenger.cd.L0(j10 != 0 ? 2131752937 : 2131743667, null));
            return;
        }
        if (i11 == 3) {
            oaVar.n = true;
            ia iaVar = (ia) view;
            oaVar.D = iaVar;
            iaVar.a.setText(oaVar.r);
            oaVar.n = false;
            return;
        }
        if (i11 != 4) {
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) oaVar.w.get(i10 - 4);
        la laVar = (la) view;
        if (tL_username.editable) {
            oaVar.E = laVar;
        } else if (oaVar.E == laVar) {
            oaVar.E = null;
        }
        laVar.a(tL_username, i10 < b() - 2, false, oaVar.y);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        oa oaVar = this.c;
        if (i10 == 0) {
            return new org.telegram.ui.Components.ck0(new org.telegram.ui.Cells.p4(oaVar.getParentActivity()));
        }
        if (i10 == 1) {
            na naVar = new na(oaVar, oaVar.getParentActivity());
            naVar.setTag(-33024);
            return new org.telegram.ui.Components.ck0(naVar);
        }
        if (i10 == 2) {
            return new org.telegram.ui.Components.ck0(new org.telegram.ui.Cells.b9(oaVar.getParentActivity()));
        }
        if (i10 == 3) {
            return new org.telegram.ui.Components.ck0(new ia(oaVar, oaVar.getParentActivity()));
        }
        if (i10 != 4) {
            return null;
        }
        return new org.telegram.ui.Components.ck0(new fa(this, oaVar.getParentActivity(), oaVar.getResourceProvider()));
    }
}
