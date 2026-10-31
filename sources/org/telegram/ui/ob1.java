package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ob1 extends s4.u {
    public boolean d;
    public final /* synthetic */ pb1 e;

    public ob1(pb1 pb1Var) {
        this.e = pb1Var;
    }

    @Override // s4.u
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.a.setPressed(false);
    }

    @Override // s4.u
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        pb1 pb1Var = this.e;
        ArrayList arrayList = pb1Var.b;
        int l4 = s4.u.l(0, 0);
        int b10 = c1Var.b();
        if (b10 >= 0 && b10 < arrayList.size() && ((hb1) arrayList.get(b10)).c != null && org.telegram.messenger.w3.y(15, pb1Var.g())) {
            TLRPC.TL_forumTopic tL_forumTopic = ((hb1) arrayList.get(b10)).c;
            if (pb1Var.a0.isEmpty()) {
                View view = c1Var.a;
                if ((view instanceof mb1) && tL_forumTopic.id == 1) {
                    this.d = true;
                    ((mb1) view).setSliding(true);
                    return s4.u.l(0, 4);
                }
            }
            if (tL_forumTopic.pinned) {
                return s4.u.l(3, 0);
            }
        }
        return l4;
    }

    @Override // s4.u
    public final boolean k() {
        return !this.e.a0.isEmpty();
    }

    @Override // s4.u
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int b10;
        pb1 pb1Var = this.e;
        ArrayList arrayList = pb1Var.b;
        if (c1Var.f != c1Var2.f || (b10 = c1Var2.b()) < 0 || b10 >= arrayList.size() || ((hb1) arrayList.get(b10)).c == null || !((hb1) arrayList.get(b10)).c.pinned) {
            return false;
        }
        gb1 gb1Var = pb1Var.r;
        int b11 = c1Var.b();
        int b12 = c1Var2.b();
        pb1 pb1Var2 = gb1Var.d;
        ArrayList arrayList2 = pb1Var2.b;
        arrayList2.add(b12, (hb1) arrayList2.remove(b11));
        s4.l0 itemAnimator = pb1Var2.N.getItemAnimator();
        eb1 eb1Var = pb1Var2.I0;
        if (itemAnimator != eb1Var) {
            pb1Var2.N.setItemAnimator(eb1Var);
        }
        gb1Var.j(b11, b12);
        return true;
    }

    @Override // s4.u
    public final void p(s4.c1 c1Var, int i10) {
        pb1 pb1Var = this.e;
        if (i10 != 0) {
            pb1Var.N.I0(false);
            c1Var.a.setPressed(true);
            return;
        }
        ArrayList arrayList = pb1Var.b;
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.TL_forumTopic tL_forumTopic = ((hb1) arrayList.get(i11)).c;
            if (tL_forumTopic != null && tL_forumTopic.pinned) {
                arrayList2.add(Integer.valueOf(tL_forumTopic.id));
            }
        }
        pb1Var.getMessagesController().r7.w(arrayList2, pb1Var.a);
    }

    @Override // s4.u
    public final void q(s4.c1 c1Var) {
        if (c1Var != null) {
            mb1 mb1Var = (mb1) c1Var.a;
            TLRPC.TL_forumTopic tL_forumTopic = mb1Var.N;
            pb1 pb1Var = this.e;
            if (tL_forumTopic != null) {
                org.telegram.messenger.x00 x00Var = pb1Var.getMessagesController().r7;
                long j10 = pb1Var.a;
                TLRPC.TL_forumTopic tL_forumTopic2 = mb1Var.N;
                x00Var.A(tL_forumTopic2.id, j10, tL_forumTopic2.hidden);
            }
            pb1Var.c1 = mb1Var;
            cb1 cb1Var = pb1Var.N;
            boolean z10 = !mb1Var.N.hidden;
            int i10 = nb1.n3;
            cb1Var.B1(z10, mb1Var);
            pb1Var.Y0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = mb1Var.c5;
            if (tL_forumTopic3 != null) {
                mb1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
