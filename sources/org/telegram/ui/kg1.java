package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class kg1 extends s4.v {
    public boolean d;
    public final /* synthetic */ lg1 e;

    public kg1(lg1 lg1Var) {
        this.e = lg1Var;
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
            lg1 lg1Var = this.e;
            if (b10 < lg1Var.b.size() && ((cg1) lg1Var.b.get(b10)).c != null && ChatObject.canManageTopics(lg1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((cg1) lg1Var.b.get(b10)).c;
                if (lg1Var.a0.isEmpty()) {
                    View view = b1Var.a;
                    if ((view instanceof ig1) && tL_forumTopic.id == 1) {
                        this.d = true;
                        ((ig1) view).setSliding(true);
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
        lg1 lg1Var = this.e;
        ArrayList arrayList = lg1Var.b;
        if (b1Var.f != b1Var2.f || (b10 = b1Var2.b()) < 0 || b10 >= arrayList.size() || ((cg1) arrayList.get(b10)).c == null || !((cg1) arrayList.get(b10)).c.pinned) {
            return false;
        }
        ag1 ag1Var = lg1Var.r;
        int b11 = b1Var.b();
        int b12 = b1Var2.b();
        lg1 lg1Var2 = ag1Var.d;
        ArrayList arrayList2 = lg1Var2.b;
        arrayList2.add(b12, (cg1) arrayList2.remove(b11));
        s4.l0 itemAnimator = lg1Var2.N.getItemAnimator();
        yf1 yf1Var = lg1Var2.I0;
        if (itemAnimator != yf1Var) {
            lg1Var2.N.setItemAnimator(yf1Var);
        }
        ag1Var.p(b11, b12);
        return true;
    }

    @Override // s4.v
    public final void p(s4.b1 b1Var, int i10) {
        lg1 lg1Var = this.e;
        if (i10 != 0) {
            lg1Var.N.I0(false);
            b1Var.a.setPressed(true);
            return;
        }
        ArrayList arrayList = lg1Var.b;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.TL_forumTopic tL_forumTopic = ((cg1) arrayList.get(i11)).c;
            if (tL_forumTopic != null && tL_forumTopic.pinned) {
                arrayList2.add(Integer.valueOf(tL_forumTopic.id));
            }
        }
        lg1Var.getMessagesController().getTopicsController().reorderPinnedTopics(lg1Var.a, arrayList2);
    }

    @Override // s4.v
    public final void q(s4.b1 b1Var) {
        if (b1Var != null) {
            ig1 ig1Var = (ig1) b1Var.a;
            TLRPC.TL_forumTopic tL_forumTopic = ig1Var.N;
            lg1 lg1Var = this.e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = lg1Var.getMessagesController().getTopicsController();
                long j10 = lg1Var.a;
                TLRPC.TL_forumTopic tL_forumTopic2 = ig1Var.N;
                topicsController.toggleShowTopic(j10, tL_forumTopic2.id, tL_forumTopic2.hidden);
            }
            lg1Var.b1 = ig1Var;
            wf1 wf1Var = lg1Var.N;
            boolean z10 = !ig1Var.N.hidden;
            int i10 = jg1.f3;
            wf1Var.A1(z10, ig1Var);
            lg1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = ig1Var.c5;
            if (tL_forumTopic3 != null) {
                ig1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
