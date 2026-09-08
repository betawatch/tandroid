package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class s20 extends kl0 {
    public ChatObject.Call c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.a40 n;
    public final org.telegram.ui.j60 r;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public boolean s = false;

    public s20(ChatObject.Call call, int i10, org.telegram.ui.j60 j60Var) {
        this.c = call;
        this.d = i10;
        this.r = j60Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.a40 a40Var) {
        this.h = arrayList;
        this.n = a40Var;
    }

    public final void F(org.telegram.ui.w30 w30Var, boolean z10) {
        this.s = z10;
        for (int i10 = 0; i10 < w30Var.getChildCount(); i10++) {
            View childAt = w30Var.getChildAt(i10);
            if (childAt instanceof r20) {
                r20 r20Var = (r20) childAt;
                if (r20Var.getVideoParticipant() != null) {
                    r20Var.b(z10);
                }
            }
        }
    }

    public final void G(ll0 ll0Var, boolean z10) {
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
        s4.o.c(new p20(this, arrayList4, arrayList3), true).b(this);
        AndroidUtilities.updateVisibleRows(ll0Var);
    }

    @Override // s4.h0
    public final int h() {
        return this.f.size() + this.e.size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ChatObject.VideoParticipant videoParticipant;
        r20 r20Var = (r20) c1Var.a;
        ChatObject.VideoParticipant videoParticipant2 = r20Var.f;
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
        r20Var.e(videoParticipant, groupCallParticipant);
        if (videoParticipant2 != null && !videoParticipant2.equals(videoParticipant) && r20Var.K && r20Var.getRenderer() != null) {
            r20Var.b(false);
            if (videoParticipant != null) {
                r20Var.b(true);
                return;
            }
            return;
        }
        if (r20Var.K) {
            if (r20Var.getRenderer() == null && videoParticipant != null && this.s) {
                r20Var.b(true);
            } else {
                if (r20Var.getRenderer() == null || videoParticipant != null) {
                    return;
                }
                r20Var.b(false);
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new vk0(new r20(this, viewGroup.getContext()));
    }
}
