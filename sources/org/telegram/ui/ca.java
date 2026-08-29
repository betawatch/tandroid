package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ca extends org.telegram.ui.Components.il0 {
    public final /* synthetic */ la c;

    public ca(la laVar) {
        this.c = laVar;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return n1Var.f == 4;
    }

    @Override // f2.p0
    public final int h() {
        la laVar = this.c;
        org.telegram.ui.Components.jl0 jl0Var = laVar.b;
        ArrayList arrayList = laVar.v;
        if (jl0Var != null) {
            ArrayList arrayList2 = jl0Var.G2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                jl0Var.G2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                laVar.b.G2.add(Long.valueOf(AndroidUtilities.pack(3, arrayList.size() + 3)));
            }
        }
        return (laVar.v.size() > 0 ? laVar.v.size() + 2 : 0) + 3;
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
    public final void v(f2.n1 n1Var, int i10) {
        la laVar = this.c;
        long j10 = laVar.x;
        int i11 = n1Var.f;
        View view = n1Var.a;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.k4) view).setText(LocaleController.getString(i10 == 0 ? j10 != 0 ? R.string.BotSetPublicLinkHeader : R.string.SetUsernameHeader : R.string.UsernamesProfileHeader));
            return;
        }
        if (i11 == 2) {
            ((org.telegram.ui.Cells.y8) view).setText(LocaleController.getString(j10 != 0 ? R.string.BotUsernamesHelp : R.string.UsernamesProfileHelp));
            return;
        }
        if (i11 == 3) {
            laVar.n = true;
            fa faVar = (fa) view;
            laVar.y = faVar;
            faVar.a.setText(laVar.r);
            laVar.n = false;
            return;
        }
        if (i11 != 4) {
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) laVar.v.get(i10 - 4);
        ia iaVar = (ia) view;
        if (tL_username.editable) {
            laVar.A = iaVar;
        } else if (laVar.A == iaVar) {
            laVar.A = null;
        }
        iaVar.a(tL_username, i10 < h() - 2, false, laVar.x);
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        la laVar = this.c;
        if (i10 == 0) {
            return new org.telegram.ui.Components.vk0(new org.telegram.ui.Cells.k4(laVar.getParentActivity()));
        }
        if (i10 == 1) {
            ka kaVar = new ka(laVar, laVar.getParentActivity());
            kaVar.setTag(-33024);
            return new org.telegram.ui.Components.vk0(kaVar);
        }
        if (i10 == 2) {
            return new org.telegram.ui.Components.vk0(new org.telegram.ui.Cells.y8(laVar.getParentActivity()));
        }
        if (i10 == 3) {
            return new org.telegram.ui.Components.vk0(new fa(laVar, laVar.getParentActivity()));
        }
        if (i10 != 4) {
            return null;
        }
        return new org.telegram.ui.Components.vk0(new ba(this, laVar.getParentActivity(), laVar.getResourceProvider()));
    }
}
