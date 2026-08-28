package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class da extends org.telegram.ui.Components.vk0 {
    public final /* synthetic */ ma c;

    public da(ma maVar) {
        this.c = maVar;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f == 4;
    }

    @Override // f2.r0
    public final int h() {
        ma maVar = this.c;
        org.telegram.ui.Components.wk0 wk0Var = maVar.b;
        ArrayList arrayList = maVar.v;
        if (wk0Var != null) {
            ArrayList arrayList2 = wk0Var.G2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                wk0Var.G2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                maVar.b.G2.add(Long.valueOf(AndroidUtilities.pack(3, arrayList.size() + 3)));
            }
        }
        return (maVar.v.size() > 0 ? maVar.v.size() + 2 : 0) + 3;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 == 0) {
            return 0;
        }
        if (i9 == 1) {
            return 3;
        }
        if (i9 == 2) {
            return 1;
        }
        if (i9 == 3) {
            return 0;
        }
        return i9 != h() - 1 ? 4 : 2;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        ma maVar = this.c;
        long j10 = maVar.x;
        int i10 = q1Var.f;
        View view = q1Var.a;
        if (i10 == 0) {
            ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(i9 == 0 ? j10 != 0 ? R.string.BotSetPublicLinkHeader : R.string.SetUsernameHeader : R.string.UsernamesProfileHeader));
            return;
        }
        if (i10 == 2) {
            ((org.telegram.ui.Cells.b9) view).setText(LocaleController.getString(j10 != 0 ? R.string.BotUsernamesHelp : R.string.UsernamesProfileHelp));
            return;
        }
        if (i10 == 3) {
            maVar.n = true;
            ga gaVar = (ga) view;
            maVar.y = gaVar;
            gaVar.a.setText(maVar.r);
            maVar.n = false;
            return;
        }
        if (i10 != 4) {
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) maVar.v.get(i9 - 4);
        ja jaVar = (ja) view;
        if (tL_username.editable) {
            maVar.A = jaVar;
        } else if (maVar.A == jaVar) {
            maVar.A = null;
        }
        jaVar.a(tL_username, i9 < h() - 2, false, maVar.x);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        ma maVar = this.c;
        if (i9 == 0) {
            return new org.telegram.ui.Components.ik0(new org.telegram.ui.Cells.m4(maVar.getParentActivity()));
        }
        if (i9 == 1) {
            la laVar = new la(maVar, maVar.getParentActivity());
            laVar.setTag(-33024);
            return new org.telegram.ui.Components.ik0(laVar);
        }
        if (i9 == 2) {
            return new org.telegram.ui.Components.ik0(new org.telegram.ui.Cells.b9(maVar.getParentActivity()));
        }
        if (i9 == 3) {
            return new org.telegram.ui.Components.ik0(new ga(maVar, maVar.getParentActivity()));
        }
        if (i9 != 4) {
            return null;
        }
        return new org.telegram.ui.Components.ik0(new ca(this, maVar.getParentActivity(), maVar.getResourceProvider()));
    }
}
