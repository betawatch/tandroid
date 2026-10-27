package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ka extends org.telegram.ui.Components.mm0 {
    public final /* synthetic */ ta c;

    public ka(ta taVar) {
        this.c = taVar;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.f == 4;
    }

    @Override // s4.h0
    public final int h() {
        ta taVar = this.c;
        org.telegram.ui.Components.nm0 nm0Var = taVar.b;
        ArrayList arrayList = taVar.v;
        if (nm0Var != null) {
            ArrayList arrayList2 = nm0Var.K2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                nm0Var.K2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                taVar.b.K2.add(Long.valueOf(AndroidUtilities.pack(3, arrayList.size() + 3)));
            }
        }
        return (taVar.v.size() > 0 ? taVar.v.size() + 2 : 0) + 3;
    }

    @Override // s4.h0
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

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        ta taVar = this.c;
        long j10 = taVar.x;
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.q4) view).setText(LocaleController.getString(i10 == 0 ? j10 != 0 ? R.string.BotSetPublicLinkHeader : R.string.SetUsernameHeader : R.string.UsernamesProfileHeader));
            return;
        }
        if (i11 == 2) {
            ((org.telegram.ui.Cells.i9) view).setText(LocaleController.getString(j10 != 0 ? R.string.BotUsernamesHelp : R.string.UsernamesProfileHelp));
            return;
        }
        if (i11 == 3) {
            taVar.n = true;
            na naVar = (na) view;
            taVar.y = naVar;
            naVar.a.setText(taVar.r);
            taVar.n = false;
            return;
        }
        if (i11 != 4) {
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) taVar.v.get(i10 - 4);
        qa qaVar = (qa) view;
        if (tL_username.editable) {
            taVar.E = qaVar;
        } else if (taVar.E == qaVar) {
            taVar.E = null;
        }
        qaVar.a(tL_username, i10 < h() - 2, false, taVar.x);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        ta taVar = this.c;
        if (i10 == 0) {
            return new org.telegram.ui.Components.wl0(new org.telegram.ui.Cells.q4(taVar.getParentActivity()));
        }
        if (i10 == 1) {
            sa saVar = new sa(taVar, taVar.getParentActivity());
            saVar.setTag(-33024);
            return new org.telegram.ui.Components.wl0(saVar);
        }
        if (i10 == 2) {
            return new org.telegram.ui.Components.wl0(new org.telegram.ui.Cells.i9(taVar.getParentActivity()));
        }
        if (i10 == 3) {
            return new org.telegram.ui.Components.wl0(new na(taVar, taVar.getParentActivity()));
        }
        if (i10 != 4) {
            return null;
        }
        return new org.telegram.ui.Components.wl0(new ja(this, taVar.getParentActivity(), taVar.getResourceProvider()));
    }
}
