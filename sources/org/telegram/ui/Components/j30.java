package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class j30 extends pm0 {
    public ChatObject.Call c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.y30 n;
    public final org.telegram.ui.g60 r;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public boolean s = false;

    public j30(ChatObject.Call call, int i10, org.telegram.ui.g60 g60Var) {
        this.c = call;
        this.d = i10;
        this.r = g60Var;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.y30 y30Var) {
        this.h = arrayList;
        this.n = y30Var;
    }

    public final void F(org.telegram.ui.u30 u30Var, boolean z10) {
        this.s = z10;
        for (int i10 = 0; i10 < u30Var.getChildCount(); i10++) {
            View childAt = u30Var.getChildAt(i10);
            if (childAt instanceof i30) {
                i30 i30Var = (i30) childAt;
                if (i30Var.getVideoParticipant() != null) {
                    i30Var.b(z10);
                }
            }
        }
    }

    public final void G(qm0 qm0Var, boolean z10) {
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
        s4.o.c(new g30(this, arrayList4, arrayList3), true).b(this);
        AndroidUtilities.updateVisibleRows(qm0Var);
    }

    @Override // s4.i0
    public final int h() {
        return this.f.size() + this.e.size();
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ChatObject.VideoParticipant videoParticipant;
        i30 i30Var = (i30) d1Var.a;
        ChatObject.VideoParticipant videoParticipant2 = i30Var.f;
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
        i30Var.e(videoParticipant, groupCallParticipant);
        if (videoParticipant2 != null && !videoParticipant2.equals(videoParticipant) && i30Var.K && i30Var.getRenderer() != null) {
            i30Var.b(false);
            if (videoParticipant != null) {
                i30Var.b(true);
                return;
            }
            return;
        }
        if (i30Var.K) {
            if (i30Var.getRenderer() == null && videoParticipant != null && this.s) {
                i30Var.b(true);
            } else {
                if (i30Var.getRenderer() == null || videoParticipant != null) {
                    return;
                }
                i30Var.b(false);
            }
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new am0(new i30(this, viewGroup.getContext()));
    }
}
