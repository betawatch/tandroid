package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o20 extends il0 {
    public ChatObject.Call c;
    public final int d;
    public ArrayList h;
    public org.telegram.ui.j30 n;
    public final org.telegram.ui.r50 r;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public boolean s = false;

    public o20(ChatObject.Call call, int i10, org.telegram.ui.r50 r50Var) {
        this.c = call;
        this.d = i10;
        this.r = r50Var;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
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
            if (childAt instanceof n20) {
                n20 n20Var = (n20) childAt;
                if (n20Var.getVideoParticipant() != null) {
                    n20Var.b(z10);
                }
            }
        }
    }

    public final void G(jl0 jl0Var, boolean z10) {
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
        f2.q.c(new l20(this, arrayList4, arrayList3), true).b(this);
        AndroidUtilities.updateVisibleRows(jl0Var);
    }

    @Override // f2.p0
    public final int h() {
        return this.f.size() + this.e.size();
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        ChatObject.VideoParticipant videoParticipant;
        n20 n20Var = (n20) n1Var.a;
        ChatObject.VideoParticipant videoParticipant2 = n20Var.f;
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
        n20Var.e(videoParticipant, groupCallParticipant);
        if (videoParticipant2 != null && !videoParticipant2.equals(videoParticipant) && n20Var.G && n20Var.getRenderer() != null) {
            n20Var.b(false);
            if (videoParticipant != null) {
                n20Var.b(true);
                return;
            }
            return;
        }
        if (n20Var.G) {
            if (n20Var.getRenderer() == null && videoParticipant != null && this.s) {
                n20Var.b(true);
            } else {
                if (n20Var.getRenderer() == null || videoParticipant != null) {
                    return;
                }
                n20Var.b(false);
            }
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        return new vk0(new n20(this, viewGroup.getContext()));
    }
}
