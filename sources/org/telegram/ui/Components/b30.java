package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class b30 extends ul0 {
    public ChatObject.Call c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.b40 n;
    public final org.telegram.ui.j60 r;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public boolean s = false;

    public b30(ChatObject.Call call, int i10, org.telegram.ui.j60 j60Var) {
        this.c = call;
        this.d = i10;
        this.r = j60Var;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.b40 b40Var) {
        this.h = arrayList;
        this.n = b40Var;
    }

    public final void F(org.telegram.ui.x30 x30Var, boolean z10) {
        this.s = z10;
        for (int i10 = 0; i10 < x30Var.getChildCount(); i10++) {
            View childAt = x30Var.getChildAt(i10);
            if (childAt instanceof a30) {
                a30 a30Var = (a30) childAt;
                if (a30Var.getVideoParticipant() != null) {
                    a30Var.b(z10);
                }
            }
        }
    }

    public final void G(vl0 vl0Var, boolean z10) {
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
        s4.o.c(new y20(this, arrayList4, arrayList3), true).b(this);
        AndroidUtilities.updateVisibleRows(vl0Var);
    }

    @Override // s4.h0
    public final int h() {
        return this.f.size() + this.e.size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ChatObject.VideoParticipant videoParticipant;
        a30 a30Var = (a30) c1Var.a;
        ChatObject.VideoParticipant videoParticipant2 = a30Var.f;
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
        a30Var.e(videoParticipant, groupCallParticipant);
        if (videoParticipant2 != null && !videoParticipant2.equals(videoParticipant) && a30Var.K && a30Var.getRenderer() != null) {
            a30Var.b(false);
            if (videoParticipant != null) {
                a30Var.b(true);
                return;
            }
            return;
        }
        if (a30Var.K) {
            if (a30Var.getRenderer() == null && videoParticipant != null && this.s) {
                a30Var.b(true);
            } else {
                if (a30Var.getRenderer() == null || videoParticipant != null) {
                    return;
                }
                a30Var.b(false);
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new fl0(new a30(this, viewGroup.getContext()));
    }
}
