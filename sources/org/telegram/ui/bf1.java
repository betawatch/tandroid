package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class bf1 extends s4.w {
    public boolean d;
    public final /* synthetic */ cf1 e;

    public bf1(cf1 cf1Var) {
        this.e = cf1Var;
    }

    @Override // s4.w
    public final void a(RecyclerView recyclerView, s4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        e1Var.a.setPressed(false);
    }

    @Override // s4.w
    public final int e(RecyclerView recyclerView, s4.e1 e1Var) {
        int l4 = s4.w.l(0, 0);
        int b10 = e1Var.b();
        if (b10 >= 0) {
            cf1 cf1Var = this.e;
            if (b10 < cf1Var.b.size() && ((te1) cf1Var.b.get(b10)).c != null && ChatObject.canManageTopics(cf1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((te1) cf1Var.b.get(b10)).c;
                if (cf1Var.a0.isEmpty()) {
                    View view = e1Var.a;
                    if ((view instanceof ze1) && tL_forumTopic.id == 1) {
                        this.d = true;
                        ((ze1) view).setSliding(true);
                        return s4.w.l(0, 4);
                    }
                }
                return !tL_forumTopic.pinned ? l4 : s4.w.l(3, 0);
            }
        }
        return l4;
    }

    @Override // s4.w
    public final boolean k() {
        return !this.e.a0.isEmpty();
    }

    @Override // s4.w
    public final boolean n(RecyclerView recyclerView, s4.e1 e1Var, s4.e1 e1Var2) {
        int b10;
        cf1 cf1Var = this.e;
        ArrayList arrayList = cf1Var.b;
        if (e1Var.f != e1Var2.f || (b10 = e1Var2.b()) < 0 || b10 >= arrayList.size() || ((te1) arrayList.get(b10)).c == null || !((te1) arrayList.get(b10)).c.pinned) {
            return false;
        }
        re1 re1Var = cf1Var.r;
        int b11 = e1Var.b();
        int b12 = e1Var2.b();
        cf1 cf1Var2 = re1Var.d;
        ArrayList arrayList2 = cf1Var2.b;
        arrayList2.add(b12, (te1) arrayList2.remove(b11));
        s4.m0 itemAnimator = cf1Var2.N.getItemAnimator();
        pe1 pe1Var = cf1Var2.I0;
        if (itemAnimator != pe1Var) {
            cf1Var2.N.setItemAnimator(pe1Var);
        }
        re1Var.p(b11, b12);
        return true;
    }

    @Override // s4.w
    public final void p(s4.e1 e1Var, int i10) {
        cf1 cf1Var = this.e;
        if (i10 != 0) {
            cf1Var.N.I0(false);
            e1Var.a.setPressed(true);
            return;
        }
        ArrayList arrayList = cf1Var.b;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.TL_forumTopic tL_forumTopic = ((te1) arrayList.get(i11)).c;
            if (tL_forumTopic != null && tL_forumTopic.pinned) {
                arrayList2.add(Integer.valueOf(tL_forumTopic.id));
            }
        }
        cf1Var.getMessagesController().getTopicsController().reorderPinnedTopics(cf1Var.a, arrayList2);
    }

    @Override // s4.w
    public final void q(s4.e1 e1Var) {
        if (e1Var != null) {
            ze1 ze1Var = (ze1) e1Var.a;
            TLRPC.TL_forumTopic tL_forumTopic = ze1Var.N;
            cf1 cf1Var = this.e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = cf1Var.getMessagesController().getTopicsController();
                long j10 = cf1Var.a;
                TLRPC.TL_forumTopic tL_forumTopic2 = ze1Var.N;
                topicsController.toggleShowTopic(j10, tL_forumTopic2.id, tL_forumTopic2.hidden);
            }
            cf1Var.c1 = ze1Var;
            ne1 ne1Var = cf1Var.N;
            boolean z10 = !ze1Var.N.hidden;
            int i10 = af1.o3;
            ne1Var.F1(z10, ze1Var);
            cf1Var.V0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = ze1Var.c5;
            if (tL_forumTopic3 != null) {
                ze1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
