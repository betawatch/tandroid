package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ga extends org.telegram.ui.Components.sl0 {
    public final /* synthetic */ pa c;

    public ga(pa paVar) {
        this.c = paVar;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        return m1Var.f == 4;
    }

    @Override // f2.p0
    public final int h() {
        pa paVar = this.c;
        org.telegram.ui.Components.tl0 tl0Var = paVar.b;
        ArrayList arrayList = paVar.v;
        if (tl0Var != null) {
            ArrayList arrayList2 = tl0Var.H2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                tl0Var.H2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                paVar.b.H2.add(Long.valueOf(AndroidUtilities.pack(3, arrayList.size() + 3)));
            }
        }
        return (paVar.v.size() > 0 ? paVar.v.size() + 2 : 0) + 3;
    }

    @Override // f2.p0
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

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        pa paVar = this.c;
        long j10 = paVar.x;
        int i11 = m1Var.f;
        View view = m1Var.a;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(i10 == 0 ? j10 != 0 ? R.string.BotSetPublicLinkHeader : R.string.SetUsernameHeader : R.string.UsernamesProfileHeader));
            return;
        }
        if (i11 == 2) {
            ((org.telegram.ui.Cells.a9) view).setText(LocaleController.getString(j10 != 0 ? R.string.BotUsernamesHelp : R.string.UsernamesProfileHelp));
            return;
        }
        if (i11 == 3) {
            paVar.n = true;
            ja jaVar = (ja) view;
            paVar.y = jaVar;
            jaVar.a.setText(paVar.r);
            paVar.n = false;
            return;
        }
        if (i11 != 4) {
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) paVar.v.get(i10 - 4);
        ma maVar = (ma) view;
        if (tL_username.editable) {
            paVar.B = maVar;
        } else if (paVar.B == maVar) {
            paVar.B = null;
        }
        maVar.a(tL_username, i10 < h() - 2, false, paVar.x);
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        pa paVar = this.c;
        if (i10 == 0) {
            return new org.telegram.ui.Components.fl0(new org.telegram.ui.Cells.m4(paVar.getParentActivity()));
        }
        if (i10 == 1) {
            oa oaVar = new oa(paVar, paVar.getParentActivity());
            oaVar.setTag(-33024);
            return new org.telegram.ui.Components.fl0(oaVar);
        }
        if (i10 == 2) {
            return new org.telegram.ui.Components.fl0(new org.telegram.ui.Cells.a9(paVar.getParentActivity()));
        }
        if (i10 == 3) {
            return new org.telegram.ui.Components.fl0(new ja(paVar, paVar.getParentActivity()));
        }
        if (i10 != 4) {
            return null;
        }
        return new org.telegram.ui.Components.fl0(new fa(this, paVar.getParentActivity(), paVar.getResourceProvider()));
    }
}
