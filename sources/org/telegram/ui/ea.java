package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ea extends org.telegram.ui.Components.oj0 {
    public final /* synthetic */ la c;

    public ea(la laVar) {
        this.c = laVar;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.f == 4;
    }

    @Override // v4.g0
    public final int b() {
        la laVar = this.c;
        org.telegram.ui.Components.pj0 pj0Var = laVar.b;
        ArrayList arrayList = laVar.w;
        if (pj0Var != null) {
            ArrayList arrayList2 = pj0Var.K2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                pj0Var.K2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                laVar.b.K2.add(Long.valueOf(org.telegram.messenger.g0.w2(3, arrayList.size() + 3)));
            }
        }
        return (laVar.w.size() > 0 ? laVar.w.size() + 2 : 0) + 3;
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (i7 == 1) {
            return 3;
        }
        if (i7 == 2) {
            return 1;
        }
        if (i7 == 3) {
            return 0;
        }
        return i7 != b() - 1 ? 4 : 2;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        la laVar = this.c;
        long j3 = laVar.y;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 == 0) {
            ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.id.M0(i7 == 0 ? j3 != 0 ? 2131752985 : 2131745501 : 2131743645, null));
            return;
        }
        if (i10 == 2) {
            ((org.telegram.ui.Cells.z8) view).setText(org.telegram.messenger.id.M0(j3 != 0 ? 2131752937 : 2131743644, null));
            return;
        }
        if (i10 == 3) {
            laVar.n = true;
            ga gaVar = (ga) view;
            laVar.D = gaVar;
            gaVar.a.setText(laVar.r);
            laVar.n = false;
            return;
        }
        if (i10 != 4) {
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) laVar.w.get(i7 - 4);
        ia iaVar = (ia) view;
        if (tL_username.editable) {
            laVar.E = iaVar;
        } else if (laVar.E == iaVar) {
            laVar.E = null;
        }
        iaVar.a(tL_username, i7 < b() - 2, false, laVar.y);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        la laVar = this.c;
        if (i7 == 0) {
            return new org.telegram.ui.Components.xi0(new org.telegram.ui.Cells.n4(laVar.getParentActivity()));
        }
        if (i7 == 1) {
            ka kaVar = new ka(laVar, laVar.getParentActivity());
            kaVar.setTag(-33024);
            return new org.telegram.ui.Components.xi0(kaVar);
        }
        if (i7 == 2) {
            return new org.telegram.ui.Components.xi0(new org.telegram.ui.Cells.z8(laVar.getParentActivity()));
        }
        if (i7 == 3) {
            return new org.telegram.ui.Components.xi0(new ga(laVar, laVar.getParentActivity()));
        }
        if (i7 != 4) {
            return null;
        }
        return new org.telegram.ui.Components.xi0(new da(this, laVar.getParentActivity(), laVar.getResourceProvider()));
    }
}
