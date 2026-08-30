package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class jf1 extends f2.b0 {
    public boolean d;
    public final /* synthetic */ kf1 e;

    public jf1(kf1 kf1Var) {
        this.e = kf1Var;
    }

    @Override // f2.b0
    public final void a(RecyclerView recyclerView, f2.l1 l1Var) {
        super.a(recyclerView, l1Var);
        l1Var.a.setPressed(false);
    }

    @Override // f2.b0
    public final int e(RecyclerView recyclerView, f2.l1 l1Var) {
        int l10 = f2.b0.l(0, 0);
        int b10 = l1Var.b();
        if (b10 >= 0) {
            kf1 kf1Var = this.e;
            if (b10 < kf1Var.b.size() && ((bf1) kf1Var.b.get(b10)).c != null && ChatObject.canManageTopics(kf1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((bf1) kf1Var.b.get(b10)).c;
                if (kf1Var.X.isEmpty()) {
                    View view = l1Var.a;
                    if ((view instanceof hf1) && tL_forumTopic.id == 1) {
                        this.d = true;
                        ((hf1) view).setSliding(true);
                        return f2.b0.l(0, 4);
                    }
                }
                return !tL_forumTopic.pinned ? l10 : f2.b0.l(3, 0);
            }
        }
        return l10;
    }

    @Override // f2.b0
    public final boolean k() {
        return !this.e.X.isEmpty();
    }

    @Override // f2.b0
    public final boolean n(RecyclerView recyclerView, f2.l1 l1Var, f2.l1 l1Var2) {
        int b10;
        kf1 kf1Var = this.e;
        ArrayList arrayList = kf1Var.b;
        if (l1Var.f != l1Var2.f || (b10 = l1Var2.b()) < 0 || b10 >= arrayList.size() || ((bf1) arrayList.get(b10)).c == null || !((bf1) arrayList.get(b10)).c.pinned) {
            return false;
        }
        ze1 ze1Var = kf1Var.r;
        int b11 = l1Var.b();
        int b12 = l1Var2.b();
        kf1 kf1Var2 = ze1Var.d;
        ArrayList arrayList2 = kf1Var2.b;
        arrayList2.add(b12, (bf1) arrayList2.remove(b11));
        f2.t0 itemAnimator = kf1Var2.K.getItemAnimator();
        xe1 xe1Var = kf1Var2.F0;
        if (itemAnimator != xe1Var) {
            kf1Var2.K.setItemAnimator(xe1Var);
        }
        ze1Var.p(b11, b12);
        return true;
    }

    @Override // f2.b0
    public final void p(f2.l1 l1Var, int i10) {
        kf1 kf1Var = this.e;
        if (i10 != 0) {
            kf1Var.K.I0(false);
            l1Var.a.setPressed(true);
            return;
        }
        ArrayList arrayList = kf1Var.b;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.TL_forumTopic tL_forumTopic = ((bf1) arrayList.get(i11)).c;
            if (tL_forumTopic != null && tL_forumTopic.pinned) {
                arrayList2.add(Integer.valueOf(tL_forumTopic.id));
            }
        }
        kf1Var.getMessagesController().getTopicsController().reorderPinnedTopics(kf1Var.a, arrayList2);
    }

    @Override // f2.b0
    public final void q(f2.l1 l1Var) {
        if (l1Var != null) {
            hf1 hf1Var = (hf1) l1Var.a;
            TLRPC.TL_forumTopic tL_forumTopic = hf1Var.K;
            kf1 kf1Var = this.e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = kf1Var.getMessagesController().getTopicsController();
                long j10 = kf1Var.a;
                TLRPC.TL_forumTopic tL_forumTopic2 = hf1Var.K;
                topicsController.toggleShowTopic(j10, tL_forumTopic2.id, tL_forumTopic2.hidden);
            }
            kf1Var.Y0 = hf1Var;
            ve1 ve1Var = kf1Var.K;
            boolean z4 = !hf1Var.K.hidden;
            int i10 = if1.e3;
            ve1Var.z1(z4, hf1Var);
            kf1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = hf1Var.V4;
            if (tL_forumTopic3 != null) {
                hf1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
