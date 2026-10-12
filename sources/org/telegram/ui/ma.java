package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ma extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ va c;

    public ma(va vaVar) {
        this.c = vaVar;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 4;
    }

    @Override // s4.g0
    public final int h() {
        va vaVar = this.c;
        org.telegram.ui.Components.mm0 mm0Var = vaVar.b;
        ArrayList arrayList = vaVar.v;
        if (mm0Var != null) {
            ArrayList arrayList2 = mm0Var.I2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                mm0Var.I2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                vaVar.b.I2.add(Long.valueOf(AndroidUtilities.pack(3, arrayList.size() + 3)));
            }
        }
        return (vaVar.v.size() > 0 ? vaVar.v.size() + 2 : 0) + 3;
    }

    @Override // s4.g0
    public final int j(int i10) {
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
        return i10 != h() - 1 ? 4 : 2;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        va vaVar = this.c;
        long j10 = vaVar.x;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(i10 == 0 ? j10 != 0 ? R.string.BotSetPublicLinkHeader : R.string.SetUsernameHeader : R.string.UsernamesProfileHeader));
            return;
        }
        if (i11 == 2) {
            ((org.telegram.ui.Cells.e9) view).setText(LocaleController.getString(j10 != 0 ? R.string.BotUsernamesHelp : R.string.UsernamesProfileHelp));
            return;
        }
        if (i11 == 3) {
            vaVar.n = true;
            pa paVar = (pa) view;
            vaVar.y = paVar;
            paVar.a.setText(vaVar.r);
            vaVar.n = false;
            return;
        }
        if (i11 != 4) {
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) vaVar.v.get(i10 - 4);
        sa saVar = (sa) view;
        if (tL_username.editable) {
            vaVar.E = saVar;
        } else if (vaVar.E == saVar) {
            vaVar.E = null;
        }
        saVar.a(tL_username, i10 < h() - 2, false, vaVar.x);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        va vaVar = this.c;
        if (i10 == 0) {
            return new org.telegram.ui.Components.wl0(new org.telegram.ui.Cells.m4(vaVar.getParentActivity()));
        }
        if (i10 == 1) {
            ua uaVar = new ua(vaVar, vaVar.getParentActivity());
            uaVar.setTag(-33024);
            return new org.telegram.ui.Components.wl0(uaVar);
        }
        if (i10 == 2) {
            return new org.telegram.ui.Components.wl0(new org.telegram.ui.Cells.e9(vaVar.getParentActivity()));
        }
        if (i10 == 3) {
            return new org.telegram.ui.Components.wl0(new pa(vaVar, vaVar.getParentActivity()));
        }
        if (i10 != 4) {
            return null;
        }
        return new org.telegram.ui.Components.wl0(new la(this, vaVar.getParentActivity(), vaVar.getResourceProvider()));
    }
}
