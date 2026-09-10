package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class hg1 extends s4.v {
    public boolean d;
    public final /* synthetic */ ig1 e;

    public hg1(ig1 ig1Var) {
        this.e = ig1Var;
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
            ig1 ig1Var = this.e;
            if (b10 < ig1Var.b.size() && ((zf1) ig1Var.b.get(b10)).c != null && ChatObject.canManageTopics(ig1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((zf1) ig1Var.b.get(b10)).c;
                if (ig1Var.a0.isEmpty()) {
                    View view = c1Var.a;
                    if ((view instanceof fg1) && tL_forumTopic.id == 1) {
                        this.d = true;
                        ((fg1) view).setSliding(true);
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
        ig1 ig1Var = this.e;
        ArrayList arrayList = ig1Var.b;
        if (c1Var.f != c1Var2.f || (b10 = c1Var2.b()) < 0 || b10 >= arrayList.size() || ((zf1) arrayList.get(b10)).c == null || !((zf1) arrayList.get(b10)).c.pinned) {
            return false;
        }
        xf1 xf1Var = ig1Var.r;
        int b11 = c1Var.b();
        int b12 = c1Var2.b();
        ig1 ig1Var2 = xf1Var.d;
        ArrayList arrayList2 = ig1Var2.b;
        arrayList2.add(b12, (zf1) arrayList2.remove(b11));
        s4.m0 itemAnimator = ig1Var2.N.getItemAnimator();
        vf1 vf1Var = ig1Var2.I0;
        if (itemAnimator != vf1Var) {
            ig1Var2.N.setItemAnimator(vf1Var);
        }
        xf1Var.p(b11, b12);
        return true;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        ig1 ig1Var = this.e;
        if (i10 != 0) {
            ig1Var.N.I0(false);
            c1Var.a.setPressed(true);
            return;
        }
        ArrayList arrayList = ig1Var.b;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.TL_forumTopic tL_forumTopic = ((zf1) arrayList.get(i11)).c;
            if (tL_forumTopic != null && tL_forumTopic.pinned) {
                arrayList2.add(Integer.valueOf(tL_forumTopic.id));
            }
        }
        ig1Var.getMessagesController().getTopicsController().reorderPinnedTopics(ig1Var.a, arrayList2);
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
        if (c1Var != null) {
            fg1 fg1Var = (fg1) c1Var.a;
            TLRPC.TL_forumTopic tL_forumTopic = fg1Var.N;
            ig1 ig1Var = this.e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = ig1Var.getMessagesController().getTopicsController();
                long j3 = ig1Var.a;
                TLRPC.TL_forumTopic tL_forumTopic2 = fg1Var.N;
                topicsController.toggleShowTopic(j3, tL_forumTopic2.id, tL_forumTopic2.hidden);
            }
            ig1Var.b1 = fg1Var;
            tf1 tf1Var = ig1Var.N;
            boolean z10 = !fg1Var.N.hidden;
            int i10 = gg1.h3;
            tf1Var.y1(z10, fg1Var);
            ig1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = fg1Var.Y4;
            if (tL_forumTopic3 != null) {
                fg1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
