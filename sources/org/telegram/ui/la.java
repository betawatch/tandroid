package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class la extends org.telegram.ui.Components.hm0 {
    public final /* synthetic */ ua c;

    public la(ua uaVar) {
        this.c = uaVar;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 4;
    }

    @Override // s4.g0
    public final int h() {
        ua uaVar = this.c;
        org.telegram.ui.Components.im0 im0Var = uaVar.b;
        ArrayList arrayList = uaVar.v;
        if (im0Var != null) {
            ArrayList arrayList2 = im0Var.I2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                im0Var.I2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                uaVar.b.I2.add(Long.valueOf(AndroidUtilities.pack(3, arrayList.size() + 3)));
            }
        }
        return (uaVar.v.size() > 0 ? uaVar.v.size() + 2 : 0) + 3;
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
        ua uaVar = this.c;
        long j10 = uaVar.x;
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
            uaVar.n = true;
            oa oaVar = (oa) view;
            uaVar.y = oaVar;
            oaVar.a.setText(uaVar.r);
            uaVar.n = false;
            return;
        }
        if (i11 != 4) {
            return;
        }
        TLRPC.TL_username tL_username = (TLRPC.TL_username) uaVar.v.get(i10 - 4);
        ra raVar = (ra) view;
        if (tL_username.editable) {
            uaVar.E = raVar;
        } else if (uaVar.E == raVar) {
            uaVar.E = null;
        }
        raVar.a(tL_username, i10 < h() - 2, false, uaVar.x);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        ua uaVar = this.c;
        if (i10 == 0) {
            return new org.telegram.ui.Components.sl0(new org.telegram.ui.Cells.l4(uaVar.getParentActivity()));
        }
        if (i10 == 1) {
            ta taVar = new ta(uaVar, uaVar.getParentActivity());
            taVar.setTag(-33024);
            return new org.telegram.ui.Components.sl0(taVar);
        }
        if (i10 == 2) {
            return new org.telegram.ui.Components.sl0(new org.telegram.ui.Cells.d9(uaVar.getParentActivity()));
        }
        if (i10 == 3) {
            return new org.telegram.ui.Components.sl0(new oa(uaVar, uaVar.getParentActivity()));
        }
        if (i10 != 4) {
            return null;
        }
        return new org.telegram.ui.Components.sl0(new ka(this, uaVar.getParentActivity(), uaVar.getResourceProvider()));
    }
}
