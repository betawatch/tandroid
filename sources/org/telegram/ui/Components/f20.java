package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class f20 extends yk0 {
    public ChatObject.Call c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.j30 n;
    public final org.telegram.ui.s50 r;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public boolean s = false;

    public f20(ChatObject.Call call, int i10, org.telegram.ui.s50 s50Var) {
        this.c = call;
        this.d = i10;
        this.r = s50Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return false;
    }

    public final void E(ArrayList arrayList, org.telegram.ui.j30 j30Var) {
        this.h = arrayList;
        this.n = j30Var;
    }

    public final void F(org.telegram.ui.f30 f30Var, boolean z10) {
        this.s = z10;
        for (int i10 = 0; i10 < f30Var.getChildCount(); i10++) {
            View childAt = f30Var.getChildAt(i10);
            if (childAt instanceof e20) {
                e20 e20Var = (e20) childAt;
                if (e20Var.getVideoParticipant() != null) {
                    e20Var.b(z10);
                }
            }
        }
    }

    public final void G(zk0 zk0Var, boolean z10) {
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
        f2.q.c(new d20(this, arrayList4, arrayList3), true).b(this);
        AndroidUtilities.updateVisibleRows(zk0Var);
    }

    @Override // f2.q0
    public final int h() {
        return this.f.size() + this.e.size();
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ChatObject.VideoParticipant videoParticipant;
        e20 e20Var = (e20) o1Var.a;
        ChatObject.VideoParticipant videoParticipant2 = e20Var.f;
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
        e20Var.e(videoParticipant, groupCallParticipant);
        if (videoParticipant2 != null && !videoParticipant2.equals(videoParticipant) && e20Var.G && e20Var.getRenderer() != null) {
            e20Var.b(false);
            if (videoParticipant != null) {
                e20Var.b(true);
                return;
            }
            return;
        }
        if (e20Var.G) {
            if (e20Var.getRenderer() == null && videoParticipant != null && this.s) {
                e20Var.b(true);
            } else {
                if (e20Var.getRenderer() == null || videoParticipant != null) {
                    return;
                }
                e20Var.b(false);
            }
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        return new lk0(new e20(this, viewGroup.getContext()));
    }
}
