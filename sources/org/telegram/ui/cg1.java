package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class cg1 extends s4.v {
    public boolean d;
    public final /* synthetic */ dg1 e;

    public cg1(dg1 dg1Var) {
        this.e = dg1Var;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.a.setPressed(false);
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        int l4 = s4.v.l(0, 0);
        int b10 = c1Var.b();
        if (b10 >= 0) {
            dg1 dg1Var = this.e;
            if (b10 < dg1Var.b.size() && ((uf1) dg1Var.b.get(b10)).c != null && ChatObject.canManageTopics(dg1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((uf1) dg1Var.b.get(b10)).c;
                if (dg1Var.a0.isEmpty()) {
                    View view = c1Var.a;
                    if ((view instanceof ag1) && tL_forumTopic.id == 1) {
                        this.d = true;
                        ((ag1) view).setSliding(true);
                        return s4.v.l(0, 4);
                    }
                }
                return !tL_forumTopic.pinned ? l4 : s4.v.l(3, 0);
            }
        }
        return l4;
    }

    @Override // s4.v
    public final boolean k() {
        return !this.e.a0.isEmpty();
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int b10;
        dg1 dg1Var = this.e;
        ArrayList arrayList = dg1Var.b;
        if (c1Var.f != c1Var2.f || (b10 = c1Var2.b()) < 0 || b10 >= arrayList.size() || ((uf1) arrayList.get(b10)).c == null || !((uf1) arrayList.get(b10)).c.pinned) {
            return false;
        }
        sf1 sf1Var = dg1Var.r;
        int b11 = c1Var.b();
        int b12 = c1Var2.b();
        dg1 dg1Var2 = sf1Var.d;
        ArrayList arrayList2 = dg1Var2.b;
        arrayList2.add(b12, (uf1) arrayList2.remove(b11));
        s4.m0 itemAnimator = dg1Var2.N.getItemAnimator();
        qf1 qf1Var = dg1Var2.I0;
        if (itemAnimator != qf1Var) {
            dg1Var2.N.setItemAnimator(qf1Var);
        }
        sf1Var.p(b11, b12);
        return true;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        dg1 dg1Var = this.e;
        if (i10 != 0) {
            dg1Var.N.J0(false);
            c1Var.a.setPressed(true);
            return;
        }
        ArrayList arrayList = dg1Var.b;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.TL_forumTopic tL_forumTopic = ((uf1) arrayList.get(i11)).c;
            if (tL_forumTopic != null && tL_forumTopic.pinned) {
                arrayList2.add(Integer.valueOf(tL_forumTopic.id));
            }
        }
        dg1Var.getMessagesController().getTopicsController().reorderPinnedTopics(dg1Var.a, arrayList2);
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
        if (c1Var != null) {
            ag1 ag1Var = (ag1) c1Var.a;
            TLRPC.TL_forumTopic tL_forumTopic = ag1Var.N;
            dg1 dg1Var = this.e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = dg1Var.getMessagesController().getTopicsController();
                long j3 = dg1Var.a;
                TLRPC.TL_forumTopic tL_forumTopic2 = ag1Var.N;
                topicsController.toggleShowTopic(j3, tL_forumTopic2.id, tL_forumTopic2.hidden);
            }
            dg1Var.b1 = ag1Var;
            of1 of1Var = dg1Var.N;
            boolean z10 = !ag1Var.N.hidden;
            int i10 = bg1.h3;
            of1Var.A1(z10, ag1Var);
            dg1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = ag1Var.Y4;
            if (tL_forumTopic3 != null) {
                ag1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
