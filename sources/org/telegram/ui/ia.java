package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ia extends org.telegram.ui.Components.ql0 {
    public final /* synthetic */ ra c;

    public ia(ra raVar) {
        this.c = raVar;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return l1Var.f == 4;
    }

    @Override // f2.o0
    public final int h() {
        ra raVar = this.c;
        org.telegram.ui.Components.rl0 rl0Var = raVar.b;
        ArrayList arrayList = raVar.v;
        if (rl0Var != null) {
            ArrayList arrayList2 = rl0Var.H2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                rl0Var.H2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                raVar.b.H2.add(Long.valueOf(AndroidUtilities.pack(3, arrayList.size() + 3)));
            }
        }
        return (raVar.v.size() > 0 ? raVar.v.size() + 2 : 0) + 3;
    }

    @Override // f2.o0
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

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        ra raVar = this.c;
        long j10 = raVar.x;
        int i11 = l1Var.f;
        View view = l1Var.a;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.l4) view).setText(LocaleController.getString(i10 == 0 ? j10 != 0 ? R.string.BotSetPublicLinkHeader : R.string.SetUsernameHeader : R.string.UsernamesProfileHeader));
            return;
        }
        if (i11 == 2) {
            ((org.telegram.ui.Cells.z8) view).setText(LocaleController.getString(j10 != 0 ? R.string.BotUsernamesHelp : R.string.UsernamesProfileHelp));
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
            raVar.B = oaVar;
        } else if (raVar.B == oaVar) {
            raVar.B = null;
        }
        oaVar.a(tL_username, i10 < h() - 2, false, raVar.x);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        ra raVar = this.c;
        if (i10 == 0) {
            return new org.telegram.ui.Components.dl0(new org.telegram.ui.Cells.l4(raVar.getParentActivity()));
        }
        if (i10 == 1) {
            qa qaVar = new qa(raVar, raVar.getParentActivity());
            qaVar.setTag(-33024);
            return new org.telegram.ui.Components.dl0(qaVar);
        }
        if (i10 == 2) {
            return new org.telegram.ui.Components.dl0(new org.telegram.ui.Cells.z8(raVar.getParentActivity()));
        }
        if (i10 == 3) {
            return new org.telegram.ui.Components.dl0(new la(raVar, raVar.getParentActivity()));
        }
        if (i10 != 4) {
            return null;
        }
        return new org.telegram.ui.Components.dl0(new ha(this, raVar.getParentActivity(), raVar.getResourceProvider()));
    }
}
