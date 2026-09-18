package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class q60 extends org.telegram.ui.Components.ll0 {
    public ChatObject.Call c;
    public final int d;
    public ArrayList f;
    public c40 h;
    public final k60 n;
    public final ArrayList e = new ArrayList();
    public boolean r = false;

    public q60(ChatObject.Call call, int i10, k60 k60Var) {
        this.c = call;
        this.d = i10;
        this.n = k60Var;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (z10 && lVar.getRenderer() == null) {
            lVar.setRenderer(org.telegram.ui.Components.voip.u.c(this.f, this.h, null, null, lVar, lVar.getParticipant(), this.c, this.n));
        } else {
            if (z10 || lVar.getRenderer() == null) {
                return;
            }
            lVar.getRenderer().setTabletGridView(null);
            lVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.ml0 ml0Var = this.n.n2;
        int size = this.e.size();
        return size <= 1 ? ml0Var.getMeasuredHeight() : size <= 4 ? ml0Var.getMeasuredHeight() / 2 : (int) (ml0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, c40 c40Var) {
        this.f = arrayList;
        this.h = c40Var;
    }

    public final void H(org.telegram.ui.Components.ml0 ml0Var, boolean z10, boolean z11) {
        this.r = z10;
        if (z11) {
            for (int i10 = 0; i10 < ml0Var.getChildCount(); i10++) {
                View childAt = ml0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) childAt;
                    if (lVar.getParticipant() != null) {
                        E(lVar, z10);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.ml0 ml0Var, boolean z10) {
        if (this.c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        if (!z10) {
            arrayList.clear();
            arrayList.addAll(this.c.visibleVideoParticipants);
            l();
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.c.visibleVideoParticipants);
            s4.o.c(new p60(this, arrayList2), true).b(this);
            AndroidUtilities.updateVisibleRows(ml0Var);
        }
    }

    @Override // s4.h0
    public final int h() {
        return this.e.size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) c1Var.a;
        ChatObject.VideoParticipant participant = lVar.getParticipant();
        ArrayList arrayList = this.e;
        ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
        TLRPC.GroupCallParticipant groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        int size = arrayList.size();
        int i11 = 6;
        if (size > 1 && size != 2 && (size != 3 || i10 == 0 || i10 == 1)) {
            i11 = 3;
        }
        lVar.a = i11;
        lVar.b = this;
        if (lVar.getMeasuredHeight() != F()) {
            lVar.requestLayout();
        }
        AccountInstance.getInstance(this.d);
        MessageObject.getPeerId(this.c.selfPeer);
        lVar.d = videoParticipant;
        if (participant != null && !participant.equals(videoParticipant) && lVar.e && lVar.getRenderer() != null) {
            E(lVar, false);
            E(lVar, true);
        } else if (lVar.getRenderer() != null) {
            lVar.getRenderer().j(true);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.wk0(new o60(this, viewGroup.getContext()));
    }
}
