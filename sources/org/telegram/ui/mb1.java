package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class mb1 extends s4.u {
    public boolean d;
    public final /* synthetic */ nb1 e;

    public mb1(nb1 nb1Var) {
        this.e = nb1Var;
    }

    @Override // s4.u
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.a.setPressed(false);
    }

    @Override // s4.u
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        nb1 nb1Var = this.e;
        ArrayList arrayList = nb1Var.b;
        int l4 = s4.u.l(0, 0);
        int b10 = c1Var.b();
        if (b10 >= 0 && b10 < arrayList.size() && ((fb1) arrayList.get(b10)).c != null && org.telegram.messenger.w3.y(15, nb1Var.g())) {
            TLRPC.TL_forumTopic tL_forumTopic = ((fb1) arrayList.get(b10)).c;
            if (nb1Var.a0.isEmpty()) {
                View view = c1Var.a;
                if ((view instanceof kb1) && tL_forumTopic.id == 1) {
                    this.d = true;
                    ((kb1) view).setSliding(true);
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
        nb1 nb1Var = this.e;
        ArrayList arrayList = nb1Var.b;
        if (c1Var.f != c1Var2.f || (b10 = c1Var2.b()) < 0 || b10 >= arrayList.size() || ((fb1) arrayList.get(b10)).c == null || !((fb1) arrayList.get(b10)).c.pinned) {
            return false;
        }
        eb1 eb1Var = nb1Var.r;
        int b11 = c1Var.b();
        int b12 = c1Var2.b();
        nb1 nb1Var2 = eb1Var.d;
        ArrayList arrayList2 = nb1Var2.b;
        arrayList2.add(b12, (fb1) arrayList2.remove(b11));
        s4.l0 itemAnimator = nb1Var2.N.getItemAnimator();
        cb1 cb1Var = nb1Var2.I0;
        if (itemAnimator != cb1Var) {
            nb1Var2.N.setItemAnimator(cb1Var);
        }
        eb1Var.j(b11, b12);
        return true;
    }

    @Override // s4.u
    public final void p(s4.c1 c1Var, int i10) {
        nb1 nb1Var = this.e;
        if (i10 != 0) {
            nb1Var.N.I0(false);
            c1Var.a.setPressed(true);
            return;
        }
        ArrayList arrayList = nb1Var.b;
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.TL_forumTopic tL_forumTopic = ((fb1) arrayList.get(i11)).c;
            if (tL_forumTopic != null && tL_forumTopic.pinned) {
                arrayList2.add(Integer.valueOf(tL_forumTopic.id));
            }
        }
        nb1Var.getMessagesController().r7.w(arrayList2, nb1Var.a);
    }

    @Override // s4.u
    public final void q(s4.c1 c1Var) {
        if (c1Var != null) {
            kb1 kb1Var = (kb1) c1Var.a;
            TLRPC.TL_forumTopic tL_forumTopic = kb1Var.N;
            nb1 nb1Var = this.e;
            if (tL_forumTopic != null) {
                org.telegram.messenger.y00 y00Var = nb1Var.getMessagesController().r7;
                long j10 = nb1Var.a;
                TLRPC.TL_forumTopic tL_forumTopic2 = kb1Var.N;
                y00Var.A(tL_forumTopic2.id, j10, tL_forumTopic2.hidden);
            }
            nb1Var.c1 = kb1Var;
            ab1 ab1Var = nb1Var.N;
            boolean z10 = !kb1Var.N.hidden;
            int i10 = lb1.n3;
            ab1Var.B1(z10, kb1Var);
            nb1Var.Z0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = kb1Var.c5;
            if (tL_forumTopic3 != null) {
                kb1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
