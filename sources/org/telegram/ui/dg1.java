package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class dg1 extends s4.v {
    public boolean d;
    public final /* synthetic */ eg1 e;

    public dg1(eg1 eg1Var) {
        this.e = eg1Var;
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
            eg1 eg1Var = this.e;
            if (b10 < eg1Var.b.size() && ((vf1) eg1Var.b.get(b10)).c != null && ChatObject.canManageTopics(eg1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((vf1) eg1Var.b.get(b10)).c;
                if (eg1Var.a0.isEmpty()) {
                    View view = c1Var.a;
                    if ((view instanceof bg1) && tL_forumTopic.id == 1) {
                        this.d = true;
                        ((bg1) view).setSliding(true);
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
        eg1 eg1Var = this.e;
        ArrayList arrayList = eg1Var.b;
        if (c1Var.f != c1Var2.f || (b10 = c1Var2.b()) < 0 || b10 >= arrayList.size() || ((vf1) arrayList.get(b10)).c == null || !((vf1) arrayList.get(b10)).c.pinned) {
            return false;
        }
        tf1 tf1Var = eg1Var.r;
        int b11 = c1Var.b();
        int b12 = c1Var2.b();
        eg1 eg1Var2 = tf1Var.d;
        ArrayList arrayList2 = eg1Var2.b;
        arrayList2.add(b12, (vf1) arrayList2.remove(b11));
        s4.m0 itemAnimator = eg1Var2.N.getItemAnimator();
        rf1 rf1Var = eg1Var2.I0;
        if (itemAnimator != rf1Var) {
            eg1Var2.N.setItemAnimator(rf1Var);
        }
        tf1Var.p(b11, b12);
        return true;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        eg1 eg1Var = this.e;
        if (i10 != 0) {
            eg1Var.N.I0(false);
            c1Var.a.setPressed(true);
            return;
        }
        ArrayList arrayList = eg1Var.b;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.TL_forumTopic tL_forumTopic = ((vf1) arrayList.get(i11)).c;
            if (tL_forumTopic != null && tL_forumTopic.pinned) {
                arrayList2.add(Integer.valueOf(tL_forumTopic.id));
            }
        }
        eg1Var.getMessagesController().getTopicsController().reorderPinnedTopics(eg1Var.a, arrayList2);
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
        if (c1Var != null) {
            bg1 bg1Var = (bg1) c1Var.a;
            TLRPC.TL_forumTopic tL_forumTopic = bg1Var.N;
            eg1 eg1Var = this.e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = eg1Var.getMessagesController().getTopicsController();
                long j3 = eg1Var.a;
                TLRPC.TL_forumTopic tL_forumTopic2 = bg1Var.N;
                topicsController.toggleShowTopic(j3, tL_forumTopic2.id, tL_forumTopic2.hidden);
            }
            eg1Var.b1 = bg1Var;
            pf1 pf1Var = eg1Var.N;
            boolean z10 = !bg1Var.N.hidden;
            int i10 = cg1.h3;
            pf1Var.y1(z10, bg1Var);
            eg1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = bg1Var.Y4;
            if (tL_forumTopic3 != null) {
                bg1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
