package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class eg1 extends s4.v {
    public boolean d;
    public final /* synthetic */ fg1 e;

    public eg1(fg1 fg1Var) {
        this.e = fg1Var;
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
            fg1 fg1Var = this.e;
            if (b10 < fg1Var.b.size() && ((wf1) fg1Var.b.get(b10)).c != null && ChatObject.canManageTopics(fg1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((wf1) fg1Var.b.get(b10)).c;
                if (fg1Var.a0.isEmpty()) {
                    View view = c1Var.a;
                    if ((view instanceof cg1) && tL_forumTopic.id == 1) {
                        this.d = true;
                        ((cg1) view).setSliding(true);
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
        fg1 fg1Var = this.e;
        ArrayList arrayList = fg1Var.b;
        if (c1Var.f != c1Var2.f || (b10 = c1Var2.b()) < 0 || b10 >= arrayList.size() || ((wf1) arrayList.get(b10)).c == null || !((wf1) arrayList.get(b10)).c.pinned) {
            return false;
        }
        uf1 uf1Var = fg1Var.r;
        int b11 = c1Var.b();
        int b12 = c1Var2.b();
        fg1 fg1Var2 = uf1Var.d;
        ArrayList arrayList2 = fg1Var2.b;
        arrayList2.add(b12, (wf1) arrayList2.remove(b11));
        s4.m0 itemAnimator = fg1Var2.N.getItemAnimator();
        sf1 sf1Var = fg1Var2.I0;
        if (itemAnimator != sf1Var) {
            fg1Var2.N.setItemAnimator(sf1Var);
        }
        uf1Var.p(b11, b12);
        return true;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        fg1 fg1Var = this.e;
        if (i10 != 0) {
            fg1Var.N.J0(false);
            c1Var.a.setPressed(true);
            return;
        }
        ArrayList arrayList = fg1Var.b;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.TL_forumTopic tL_forumTopic = ((wf1) arrayList.get(i11)).c;
            if (tL_forumTopic != null && tL_forumTopic.pinned) {
                arrayList2.add(Integer.valueOf(tL_forumTopic.id));
            }
        }
        fg1Var.getMessagesController().getTopicsController().reorderPinnedTopics(fg1Var.a, arrayList2);
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
        if (c1Var != null) {
            cg1 cg1Var = (cg1) c1Var.a;
            TLRPC.TL_forumTopic tL_forumTopic = cg1Var.N;
            fg1 fg1Var = this.e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = fg1Var.getMessagesController().getTopicsController();
                long j3 = fg1Var.a;
                TLRPC.TL_forumTopic tL_forumTopic2 = cg1Var.N;
                topicsController.toggleShowTopic(j3, tL_forumTopic2.id, tL_forumTopic2.hidden);
            }
            fg1Var.b1 = cg1Var;
            qf1 qf1Var = fg1Var.N;
            boolean z10 = !cg1Var.N.hidden;
            int i10 = dg1.h3;
            qf1Var.A1(z10, cg1Var);
            fg1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = cg1Var.Y4;
            if (tL_forumTopic3 != null) {
                cg1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
