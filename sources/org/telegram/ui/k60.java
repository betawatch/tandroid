package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class k60 extends org.telegram.ui.Components.ql0 {
    public ChatObject.Call c;
    public final int d;
    public ArrayList f;
    public x30 h;
    public final e60 n;
    public final ArrayList e = new ArrayList();
    public boolean r = false;

    public k60(ChatObject.Call call, int i10, e60 e60Var) {
        this.c = call;
        this.d = i10;
        this.n = e60Var;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.l lVar, boolean z4) {
        if (z4 && lVar.getRenderer() == null) {
            lVar.setRenderer(org.telegram.ui.Components.voip.t.c(this.f, this.h, null, null, lVar, lVar.getParticipant(), this.c, this.n));
        } else {
            if (z4 || lVar.getRenderer() == null) {
                return;
            }
            lVar.getRenderer().setTabletGridView(null);
            lVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.rl0 rl0Var = this.n.k2;
        int size = this.e.size();
        return size <= 1 ? rl0Var.getMeasuredHeight() : size <= 4 ? rl0Var.getMeasuredHeight() / 2 : (int) (rl0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, x30 x30Var) {
        this.f = arrayList;
        this.h = x30Var;
    }

    public final void H(org.telegram.ui.Components.rl0 rl0Var, boolean z4, boolean z10) {
        this.r = z4;
        if (z10) {
            for (int i10 = 0; i10 < rl0Var.getChildCount(); i10++) {
                View childAt = rl0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) childAt;
                    if (lVar.getParticipant() != null) {
                        E(lVar, z4);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.rl0 rl0Var, boolean z4) {
        if (this.c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        if (!z4) {
            arrayList.clear();
            arrayList.addAll(this.c.visibleVideoParticipants);
            l();
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.c.visibleVideoParticipants);
            f2.q.c(new j60(this, arrayList2), true).b(this);
            AndroidUtilities.updateVisibleRows(rl0Var);
        }
    }

    @Override // f2.o0
    public final int h() {
        return this.e.size();
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) l1Var.a;
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

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.dl0(new i60(this, viewGroup.getContext()));
    }
}
