package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class da extends org.telegram.ui.Components.sj0 {
    public final /* synthetic */ ka c;

    public da(ka kaVar) {
        this.c = kaVar;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return d1Var.f == 4;
    }

    @Override // u4.h0
    public final int b() {
        ka kaVar = this.c;
        org.telegram.ui.Components.tj0 tj0Var = kaVar.b;
        ArrayList arrayList = kaVar.w;
        if (tj0Var != null) {
            ArrayList arrayList2 = tj0Var.L2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                tj0Var.L2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                kaVar.b.L2.add(Long.valueOf(org.telegram.messenger.g0.w2(3, arrayList.size() + 3)));
            }
        }
        return (kaVar.w.size() > 0 ? kaVar.w.size() + 2 : 0) + 3;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 == 0) {
            return 0;
        }
        if (i3 == 1) {
            return 3;
        }
        if (i3 == 2) {
            return 1;
        }
        if (i3 == 3) {
            return 0;
        }
        return i3 != b() - 1 ? 4 : 2;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        ka kaVar = this.c;
        long j10 = kaVar.y;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 0) {
            ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.bd.M0(i3 == 0 ? j10 != 0 ? 2131752985 : 2131745508 : 2131743652, null));
            return;
        }
        if (i10 == 2) {
            ((org.telegram.ui.Cells.y8) view).setText(org.telegram.messenger.bd.M0(j10 != 0 ? 2131752937 : 2131743651, null));
            return;
        }
        if (i10 == 3) {
            kaVar.n = true;
            fa faVar = (fa) view;
            kaVar.E = faVar;
            faVar.a.setText(kaVar.r);
            kaVar.n = false;
            return;
        }
        if (i10 != 4) {
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) kaVar.w.get(i3 - 4);
        ha haVar = (ha) view;
        if (tL_username.editable) {
            kaVar.F = haVar;
        } else if (kaVar.F == haVar) {
            kaVar.F = null;
        }
        haVar.a(tL_username, i3 < b() - 2, false, kaVar.y);
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        ka kaVar = this.c;
        if (i3 == 0) {
            return new org.telegram.ui.Components.bj0(new org.telegram.ui.Cells.n4(kaVar.getParentActivity()));
        }
        if (i3 == 1) {
            ja jaVar = new ja(kaVar, kaVar.getParentActivity());
            jaVar.setTag(-33024);
            return new org.telegram.ui.Components.bj0(jaVar);
        }
        if (i3 == 2) {
            return new org.telegram.ui.Components.bj0(new org.telegram.ui.Cells.y8(kaVar.getParentActivity()));
        }
        if (i3 == 3) {
            return new org.telegram.ui.Components.bj0(new fa(kaVar, kaVar.getParentActivity()));
        }
        if (i3 != 4) {
            return null;
        }
        return new org.telegram.ui.Components.bj0(new ca(this, kaVar.getParentActivity(), kaVar.getResourceProvider()));
    }
}
