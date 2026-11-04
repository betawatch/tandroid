package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l91 extends u4.v {
    public boolean d;
    public final /* synthetic */ m91 e;

    public l91(m91 m91Var) {
        this.e = m91Var;
    }

    @Override // u4.v
    public final void a(RecyclerView recyclerView, u4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.a.setPressed(false);
    }

    @Override // u4.v
    public final int e(RecyclerView recyclerView, u4.d1 d1Var) {
        m91 m91Var = this.e;
        ArrayList arrayList = m91Var.b;
        int l10 = u4.v.l(0, 0);
        int b10 = d1Var.b();
        if (b10 >= 0 && b10 < arrayList.size() && ((e91) arrayList.get(b10)).c != null && org.telegram.messenger.t3.y(15, m91Var.g())) {
            TLRPC.TL_forumTopic tL_forumTopic = ((e91) arrayList.get(b10)).c;
            if (m91Var.b0.isEmpty()) {
                View view = d1Var.a;
                if ((view instanceof j91) && tL_forumTopic.id == 1) {
                    this.d = true;
                    ((j91) view).setSliding(true);
                    return u4.v.l(0, 4);
                }
            }
            if (tL_forumTopic.pinned) {
                return u4.v.l(3, 0);
            }
        }
        return l10;
    }

    @Override // u4.v
    public final boolean k() {
        return !this.e.b0.isEmpty();
    }

    @Override // u4.v
    public final boolean n(RecyclerView recyclerView, u4.d1 d1Var, u4.d1 d1Var2) {
        int b10;
        m91 m91Var = this.e;
        ArrayList arrayList = m91Var.b;
        if (d1Var.f != d1Var2.f || (b10 = d1Var2.b()) < 0 || b10 >= arrayList.size() || ((e91) arrayList.get(b10)).c == null || !((e91) arrayList.get(b10)).c.pinned) {
            return false;
        }
        d91 d91Var = m91Var.r;
        int b11 = d1Var.b();
        int b12 = d1Var2.b();
        m91 m91Var2 = d91Var.d;
        ArrayList arrayList2 = m91Var2.b;
        arrayList2.add(b12, (e91) arrayList2.remove(b11));
        u4.m0 itemAnimator = m91Var2.O.getItemAnimator();
        b91 b91Var = m91Var2.J0;
        if (itemAnimator != b91Var) {
            m91Var2.O.setItemAnimator(b91Var);
        }
        d91Var.j(b11, b12);
        return true;
    }

    @Override // u4.v
    public final void p(u4.d1 d1Var, int i3) {
        m91 m91Var = this.e;
        if (i3 != 0) {
            m91Var.O.I0(false);
            d1Var.a.setPressed(true);
            return;
        }
        ArrayList arrayList = m91Var.b;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.TL_forumTopic tL_forumTopic = ((e91) arrayList.get(i10)).c;
            if (tL_forumTopic != null && tL_forumTopic.pinned) {
                arrayList2.add(Integer.valueOf(tL_forumTopic.id));
            }
        }
        m91Var.getMessagesController().q7.w(arrayList2, m91Var.a);
    }

    @Override // u4.v
    public final void q(u4.d1 d1Var) {
        if (d1Var != null) {
            j91 j91Var = (j91) d1Var.a;
            TLRPC.TL_forumTopic tL_forumTopic = j91Var.O;
            m91 m91Var = this.e;
            if (tL_forumTopic != null) {
                org.telegram.messenger.c00 c00Var = m91Var.getMessagesController().q7;
                long j10 = m91Var.a;
                TLRPC.TL_forumTopic tL_forumTopic2 = j91Var.O;
                c00Var.A(tL_forumTopic2.id, j10, tL_forumTopic2.hidden);
            }
            m91Var.d1 = j91Var;
            z81 z81Var = m91Var.O;
            boolean z10 = !j91Var.O.hidden;
            int i3 = k91.o3;
            z81Var.B1(z10, j91Var);
            m91Var.Z0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = j91Var.d5;
            if (tL_forumTopic3 != null) {
                j91Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
