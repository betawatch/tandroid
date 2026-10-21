package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class ja extends org.telegram.ui.Components.im0 {
    public final /* synthetic */ sa c;

    public ja(sa saVar) {
        this.c = saVar;
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 4;
    }

    @Override // s4.g0
    public final int h() {
        sa saVar = this.c;
        org.telegram.ui.Components.jm0 jm0Var = saVar.b;
        ArrayList arrayList = saVar.v;
        if (jm0Var != null) {
            ArrayList arrayList2 = jm0Var.I2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                jm0Var.I2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                saVar.b.I2.add(Long.valueOf(AndroidUtilities.pack(3, arrayList.size() + 3)));
            }
        }
        return (saVar.v.size() > 0 ? saVar.v.size() + 2 : 0) + 3;
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
        sa saVar = this.c;
        long j10 = saVar.x;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.l4) view).setText(LocaleController.getString(i10 == 0 ? j10 != 0 ? R.string.BotSetPublicLinkHeader : R.string.SetUsernameHeader : R.string.UsernamesProfileHeader));
            return;
        }
        if (i11 == 2) {
            ((org.telegram.ui.Cells.d9) view).setText(LocaleController.getString(j10 != 0 ? R.string.BotUsernamesHelp : R.string.UsernamesProfileHelp));
            return;
        }
        if (i11 == 3) {
            saVar.n = true;
            ma maVar = (ma) view;
            saVar.y = maVar;
            maVar.a.setText(saVar.r);
            saVar.n = false;
            return;
        }
        if (i11 != 4) {
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) saVar.v.get(i10 - 4);
        pa paVar = (pa) view;
        if (tL_username.editable) {
            saVar.E = paVar;
        } else if (saVar.E == paVar) {
            saVar.E = null;
        }
        paVar.a(tL_username, i10 < h() - 2, false, saVar.x);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        sa saVar = this.c;
        if (i10 == 0) {
            return new org.telegram.ui.Components.tl0(new org.telegram.ui.Cells.l4(saVar.getParentActivity()));
        }
        if (i10 == 1) {
            ra raVar = new ra(saVar, saVar.getParentActivity());
            raVar.setTag(-33024);
            return new org.telegram.ui.Components.tl0(raVar);
        }
        if (i10 == 2) {
            return new org.telegram.ui.Components.tl0(new org.telegram.ui.Cells.d9(saVar.getParentActivity()));
        }
        if (i10 == 3) {
            return new org.telegram.ui.Components.tl0(new ma(saVar, saVar.getParentActivity()));
        }
        if (i10 != 4) {
            return null;
        }
        return new org.telegram.ui.Components.tl0(new ia(this, saVar.getParentActivity(), saVar.getResourceProvider()));
    }
}
