package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ha extends org.telegram.ui.Components.kl0 {
    public final /* synthetic */ qa c;

    public ha(qa qaVar) {
        this.c = qaVar;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 4;
    }

    @Override // s4.h0
    public final int h() {
        qa qaVar = this.c;
        org.telegram.ui.Components.ll0 ll0Var = qaVar.b;
        ArrayList arrayList = qaVar.v;
        if (ll0Var != null) {
            ArrayList arrayList2 = ll0Var.K2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                ll0Var.K2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                qaVar.b.K2.add(Long.valueOf(AndroidUtilities.pack(3, arrayList.size() + 3)));
            }
        }
        return (qaVar.v.size() > 0 ? qaVar.v.size() + 2 : 0) + 3;
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
    public final void v(s4.c1 c1Var, int i10) {
        qa qaVar = this.c;
        long j3 = qaVar.x;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.l4) view).setText(LocaleController.getString(i10 == 0 ? j3 != 0 ? R.string.BotSetPublicLinkHeader : R.string.SetUsernameHeader : R.string.UsernamesProfileHeader));
            return;
        }
        if (i11 == 2) {
            ((org.telegram.ui.Cells.e9) view).setText(LocaleController.getString(j3 != 0 ? R.string.BotUsernamesHelp : R.string.UsernamesProfileHelp));
            return;
        }
        if (i11 == 3) {
            qaVar.n = true;
            ka kaVar = (ka) view;
            qaVar.y = kaVar;
            kaVar.a.setText(qaVar.r);
            qaVar.n = false;
            return;
        }
        if (i11 != 4) {
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) qaVar.v.get(i10 - 4);
        na naVar = (na) view;
        if (tL_username.editable) {
            qaVar.E = naVar;
        } else if (qaVar.E == naVar) {
            qaVar.E = null;
        }
        naVar.a(tL_username, i10 < h() - 2, false, qaVar.x);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        qa qaVar = this.c;
        if (i10 == 0) {
            return new org.telegram.ui.Components.vk0(new org.telegram.ui.Cells.l4(qaVar.getParentActivity()));
        }
        if (i10 == 1) {
            pa paVar = new pa(qaVar, qaVar.getParentActivity());
            paVar.setTag(-33024);
            return new org.telegram.ui.Components.vk0(paVar);
        }
        if (i10 == 2) {
            return new org.telegram.ui.Components.vk0(new org.telegram.ui.Cells.e9(qaVar.getParentActivity()));
        }
        if (i10 == 3) {
            return new org.telegram.ui.Components.vk0(new ka(qaVar, qaVar.getParentActivity()));
        }
        if (i10 != 4) {
            return null;
        }
        return new org.telegram.ui.Components.vk0(new ga(this, qaVar.getParentActivity(), qaVar.getResourceProvider()));
    }
}
