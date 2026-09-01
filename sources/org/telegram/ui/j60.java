package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class j60 extends org.telegram.ui.Components.sl0 {
    public ChatObject.Call c;
    public final int d;
    public ArrayList f;
    public w30 h;
    public final d60 n;
    public final ArrayList e = new ArrayList();
    public boolean r = false;

    public j60(ChatObject.Call call, int i10, d60 d60Var) {
        this.c = call;
        this.d = i10;
        this.n = d60Var;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.l lVar, boolean z4) {
        if (z4 && lVar.getRenderer() == null) {
            lVar.setRenderer(org.telegram.ui.Components.voip.u.c(this.f, this.h, null, null, lVar, lVar.getParticipant(), this.c, this.n));
        } else {
            if (z4 || lVar.getRenderer() == null) {
                return;
            }
            lVar.getRenderer().setTabletGridView(null);
            lVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.tl0 tl0Var = this.n.k2;
        int size = this.e.size();
        return size <= 1 ? tl0Var.getMeasuredHeight() : size <= 4 ? tl0Var.getMeasuredHeight() / 2 : (int) (tl0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, w30 w30Var) {
        this.f = arrayList;
        this.h = w30Var;
    }

    public final void H(org.telegram.ui.Components.tl0 tl0Var, boolean z4, boolean z10) {
        this.r = z4;
        if (z10) {
            for (int i10 = 0; i10 < tl0Var.getChildCount(); i10++) {
                View childAt = tl0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) childAt;
                    if (lVar.getParticipant() != null) {
                        E(lVar, z4);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.tl0 tl0Var, boolean z4) {
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
            f2.q.c(new i60(this, arrayList2), true).b(this);
            AndroidUtilities.updateVisibleRows(tl0Var);
        }
    }

    @Override // f2.p0
    public final int h() {
        return this.e.size();
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) m1Var.a;
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

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.fl0(new h60(this, viewGroup.getContext()));
    }
}
