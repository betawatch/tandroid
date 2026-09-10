package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ia extends org.telegram.ui.Components.ul0 {
    public final /* synthetic */ ra c;

    public ia(ra raVar) {
        this.c = raVar;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 4;
    }

    @Override // s4.h0
    public final int h() {
        ra raVar = this.c;
        org.telegram.ui.Components.vl0 vl0Var = raVar.b;
        ArrayList arrayList = raVar.v;
        if (vl0Var != null) {
            ArrayList arrayList2 = vl0Var.K2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                vl0Var.K2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                raVar.b.K2.add(Long.valueOf(AndroidUtilities.pack(3, arrayList.size() + 3)));
            }
        }
        return (raVar.v.size() > 0 ? raVar.v.size() + 2 : 0) + 3;
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
        ra raVar = this.c;
        long j3 = raVar.x;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(i10 == 0 ? j3 != 0 ? R.string.BotSetPublicLinkHeader : R.string.SetUsernameHeader : R.string.UsernamesProfileHeader));
            return;
        }
        if (i11 == 2) {
            ((org.telegram.ui.Cells.f9) view).setText(LocaleController.getString(j3 != 0 ? R.string.BotUsernamesHelp : R.string.UsernamesProfileHelp));
            return;
        }
        if (i11 == 3) {
            raVar.n = true;
            la laVar = (la) view;
            raVar.y = laVar;
            laVar.a.setText(raVar.r);
            raVar.n = false;
            return;
        }
        if (i11 != 4) {
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) raVar.v.get(i10 - 4);
        oa oaVar = (oa) view;
        if (tL_username.editable) {
            raVar.E = oaVar;
        } else if (raVar.E == oaVar) {
            raVar.E = null;
        }
        oaVar.a(tL_username, i10 < h() - 2, false, raVar.x);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ra raVar = this.c;
        if (i10 == 0) {
            return new org.telegram.ui.Components.fl0(new org.telegram.ui.Cells.m4(raVar.getParentActivity()));
        }
        if (i10 == 1) {
            qa qaVar = new qa(raVar, raVar.getParentActivity());
            qaVar.setTag(-33024);
            return new org.telegram.ui.Components.fl0(qaVar);
        }
        if (i10 == 2) {
            return new org.telegram.ui.Components.fl0(new org.telegram.ui.Cells.f9(raVar.getParentActivity()));
        }
        if (i10 == 3) {
            return new org.telegram.ui.Components.fl0(new la(raVar, raVar.getParentActivity()));
        }
        if (i10 != 4) {
            return null;
        }
        return new org.telegram.ui.Components.fl0(new ha(this, raVar.getParentActivity(), raVar.getResourceProvider()));
    }
}
