package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class c30 extends mm0 {
    public ChatObject.Call c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.o30 n;
    public final org.telegram.ui.x50 r;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public boolean s = false;

    public c30(ChatObject.Call call, int i10, org.telegram.ui.x50 x50Var) {
        this.c = call;
        this.d = i10;
        this.r = x50Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.o30 o30Var) {
        this.h = arrayList;
        this.n = o30Var;
    }

    public final void F(org.telegram.ui.k30 k30Var, boolean z10) {
        this.s = z10;
        for (int i10 = 0; i10 < k30Var.getChildCount(); i10++) {
            View childAt = k30Var.getChildAt(i10);
            if (childAt instanceof b30) {
                b30 b30Var = (b30) childAt;
                if (b30Var.getVideoParticipant() != null) {
                    b30Var.b(z10);
                }
            }
        }
    }

    public final void G(nm0 nm0Var, boolean z10) {
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
        s4.p.c(new a30(this, arrayList4, arrayList3), true).c(this);
        AndroidUtilities.updateVisibleRows(nm0Var);
    }

    @Override // s4.h0
    public final int h() {
        return this.f.size() + this.e.size();
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ChatObject.VideoParticipant videoParticipant;
        b30 b30Var = (b30) e1Var.a;
        ChatObject.VideoParticipant videoParticipant2 = b30Var.f;
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
        b30Var.e(videoParticipant, groupCallParticipant);
        if (videoParticipant2 != null && !videoParticipant2.equals(videoParticipant) && b30Var.K && b30Var.getRenderer() != null) {
            b30Var.b(false);
            if (videoParticipant != null) {
                b30Var.b(true);
                return;
            }
            return;
        }
        if (b30Var.K) {
            if (b30Var.getRenderer() == null && videoParticipant != null && this.s) {
                b30Var.b(true);
            } else {
                if (b30Var.getRenderer() == null || videoParticipant != null) {
                    return;
                }
                b30Var.b(false);
            }
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        return new wl0(new b30(this, viewGroup.getContext()));
    }
}
