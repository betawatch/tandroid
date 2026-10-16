package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class jg1 extends s4.v {
    public boolean d;
    public final /* synthetic */ kg1 e;

    public jg1(kg1 kg1Var) {
        this.e = kg1Var;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.a.setPressed(false);
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        int l4 = s4.v.l(0, 0);
        int b10 = b1Var.b();
        if (b10 >= 0) {
            kg1 kg1Var = this.e;
            if (b10 < kg1Var.b.size() && ((bg1) kg1Var.b.get(b10)).c != null && ChatObject.canManageTopics(kg1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((bg1) kg1Var.b.get(b10)).c;
                if (kg1Var.a0.isEmpty()) {
                    View view = b1Var.a;
                    if ((view instanceof hg1) && tL_forumTopic.id == 1) {
                        this.d = true;
                        ((hg1) view).setSliding(true);
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
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        int b10;
        kg1 kg1Var = this.e;
        ArrayList arrayList = kg1Var.b;
        if (b1Var.f != b1Var2.f || (b10 = b1Var2.b()) < 0 || b10 >= arrayList.size() || ((bg1) arrayList.get(b10)).c == null || !((bg1) arrayList.get(b10)).c.pinned) {
            return false;
        }
        zf1 zf1Var = kg1Var.r;
        int b11 = b1Var.b();
        int b12 = b1Var2.b();
        kg1 kg1Var2 = zf1Var.d;
        ArrayList arrayList2 = kg1Var2.b;
        arrayList2.add(b12, (bg1) arrayList2.remove(b11));
        s4.l0 itemAnimator = kg1Var2.N.getItemAnimator();
        xf1 xf1Var = kg1Var2.I0;
        if (itemAnimator != xf1Var) {
            kg1Var2.N.setItemAnimator(xf1Var);
        }
        zf1Var.p(b11, b12);
        return true;
    }

    @Override // s4.v
    public final void p(s4.b1 b1Var, int i10) {
        kg1 kg1Var = this.e;
        if (i10 != 0) {
            kg1Var.N.I0(false);
            b1Var.a.setPressed(true);
            return;
        }
        ArrayList arrayList = kg1Var.b;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.TL_forumTopic tL_forumTopic = ((bg1) arrayList.get(i11)).c;
            if (tL_forumTopic != null && tL_forumTopic.pinned) {
                arrayList2.add(Integer.valueOf(tL_forumTopic.id));
            }
        }
        kg1Var.getMessagesController().getTopicsController().reorderPinnedTopics(kg1Var.a, arrayList2);
    }

    @Override // s4.v
    public final void q(s4.b1 b1Var) {
        if (b1Var != null) {
            hg1 hg1Var = (hg1) b1Var.a;
            TLRPC.TL_forumTopic tL_forumTopic = hg1Var.N;
            kg1 kg1Var = this.e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = kg1Var.getMessagesController().getTopicsController();
                long j10 = kg1Var.a;
                TLRPC.TL_forumTopic tL_forumTopic2 = hg1Var.N;
                topicsController.toggleShowTopic(j10, tL_forumTopic2.id, tL_forumTopic2.hidden);
            }
            kg1Var.b1 = hg1Var;
            vf1 vf1Var = kg1Var.N;
            boolean z10 = !hg1Var.N.hidden;
            int i10 = ig1.f3;
            vf1Var.A1(z10, hg1Var);
            kg1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = hg1Var.c5;
            if (tL_forumTopic3 != null) {
                hg1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
