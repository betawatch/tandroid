package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class v20 extends xl0 {
    public ChatObject.Call c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.v30 n;
    public final org.telegram.ui.d60 r;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public boolean s = false;

    public v20(ChatObject.Call call, int i10, org.telegram.ui.d60 d60Var) {
        this.c = call;
        this.d = i10;
        this.r = d60Var;
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.v30 v30Var) {
        this.h = arrayList;
        this.n = v30Var;
    }

    public final void F(org.telegram.ui.r30 r30Var, boolean z10) {
        this.s = z10;
        for (int i10 = 0; i10 < r30Var.getChildCount(); i10++) {
            View childAt = r30Var.getChildAt(i10);
            if (childAt instanceof u20) {
                u20 u20Var = (u20) childAt;
                if (u20Var.getVideoParticipant() != null) {
                    u20Var.b(z10);
                }
            }
        }
    }

    public final void G(yl0 yl0Var, boolean z10) {
        if (this.c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.f;
        if (!z10) {
            arrayList2.clear();
            ChatObject.Call call = this.c;
            if (!call.call.rtmp_stream) {
                arrayList2.addAll(call.visibleParticipants);
            }
            arrayList.clear();
            ChatObject.Call call2 = this.c;
            if (!call2.call.rtmp_stream) {
                arrayList.addAll(call2.visibleVideoParticipants);
            }
            l();
            return;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        ArrayList arrayList4 = new ArrayList(arrayList);
        arrayList2.clear();
        ChatObject.Call call3 = this.c;
        if (!call3.call.rtmp_stream) {
            arrayList2.addAll(call3.visibleParticipants);
        }
        arrayList.clear();
        ChatObject.Call call4 = this.c;
        if (!call4.call.rtmp_stream) {
            arrayList.addAll(call4.visibleVideoParticipants);
        }
        s4.o.c(new s20(this, arrayList4, arrayList3), true).b(this);
        AndroidUtilities.updateVisibleRows(yl0Var);
    }

    @Override // s4.h0
    public final int h() {
        return this.f.size() + this.e.size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ChatObject.VideoParticipant videoParticipant;
        u20 u20Var = (u20) c1Var.a;
        ChatObject.VideoParticipant videoParticipant2 = u20Var.f;
        ArrayList arrayList = this.e;
        if (i10 < arrayList.size()) {
            videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
            groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f;
            if (size >= arrayList2.size()) {
                return;
            }
            groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList2.get(i10 - arrayList.size());
            videoParticipant = null;
        }
        u20Var.e(videoParticipant, groupCallParticipant);
        if (videoParticipant2 != null && !videoParticipant2.equals(videoParticipant) && u20Var.K && u20Var.getRenderer() != null) {
            u20Var.b(false);
            if (videoParticipant != null) {
                u20Var.b(true);
                return;
            }
            return;
        }
        if (u20Var.K) {
            if (u20Var.getRenderer() == null && videoParticipant != null && this.s) {
                u20Var.b(true);
            } else {
                if (u20Var.getRenderer() == null || videoParticipant != null) {
                    return;
                }
                u20Var.b(false);
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new il0(new u20(this, viewGroup.getContext()));
    }
}
