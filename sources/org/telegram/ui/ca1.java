package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ca1 extends rg.b {
    public final /* synthetic */ ea1 d;

    public ca1(ea1 ea1Var) {
        this.d = ea1Var;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 1 || i7 == 2 || i7 == 4;
    }

    @Override // v4.g0
    public final int b() {
        return this.d.d.size();
    }

    @Override // v4.g0
    public final int d(int i7) {
        return ((da1) this.d.d.get(i7)).a;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        String M0;
        ea1 ea1Var = this.d;
        ArrayList arrayList = ea1Var.d;
        if (((da1) arrayList.get(i7)).a == 2) {
            org.telegram.ui.Cells.ia iaVar = (org.telegram.ui.Cells.ia) d1Var.a;
            long j3 = ea1Var.c;
            TLRPC.TL_forumTopic tL_forumTopic = ((da1) arrayList.get(i7)).c;
            org.telegram.ui.Components.l9 l9Var = iaVar.b;
            qg.d.p(l9Var, tL_forumTopic, false, false, null);
            if (l9Var != null && l9Var.getImageReceiver() != null && (l9Var.getImageReceiver().t() instanceof qg.c)) {
                ((qg.c) l9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.c9, false));
            }
            iaVar.c.setText(tL_forumTopic.title);
            TextView textView = iaVar.d;
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0);
            long j10 = tL_forumTopic.id;
            if (s12.getMessagesController().r2(j3, j10, null)) {
                int i10 = s12.d7.getInt("notifyuntil_" + org.telegram.messenger.dt.v(j3, j10, false), 0);
                M0 = i10 >= s12.getConnectionsManager().getCurrentTime() ? org.telegram.messenger.id.a0("NotificationsMutedForHint", null, 2131747900, org.telegram.messenger.id.c0(i10)) : org.telegram.messenger.id.M0(2131747901, null);
            } else {
                M0 = org.telegram.messenger.id.M0(2131747856, null);
            }
            textView.setText(M0);
            iaVar.a = i7 == arrayList.size() - 1 || ((da1) arrayList.get(i7 + 1)).a == 2;
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2 = null;
        if (i7 == 1) {
            org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(viewGroup.getContext());
            m8Var.o(R.drawable.msg_contact_add, org.telegram.messenger.id.M0(2131747923, null), true);
            m8Var.g(org.telegram.ui.ActionBar.l6.v6, org.telegram.ui.ActionBar.l6.u6);
            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.d6, m8Var, null);
            view = m8Var;
        } else if (i7 == 2) {
            Context context = viewGroup.getContext();
            org.telegram.ui.Cells.ia iaVar = new org.telegram.ui.Cells.ia(context);
            org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
            iaVar.b = l9Var;
            iaVar.addView(l9Var, c8.ha.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            iaVar.c = textView;
            org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.l6.G6, null, 1, 16.0f);
            textView.setMaxLines(1);
            iaVar.addView(textView, c8.ha.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
            TextView textView2 = new TextView(context);
            iaVar.d = textView2;
            org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.y6, null);
            textView2.setTextSize(1, 14.0f);
            iaVar.addView(textView2, c8.ha.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.d6, iaVar, null);
            view = iaVar;
        } else {
            if (i7 != 3) {
                if (i7 == 4) {
                    org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(viewGroup.getContext());
                    m8Var2.k(org.telegram.messenger.id.M0(2131747915, null), false);
                    m8Var2.g(-1, org.telegram.ui.ActionBar.l6.p7);
                    org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.d6, m8Var2, null);
                    view = m8Var2;
                }
                return jg.g.r(view2, view2, -1, -2);
            }
            view = new org.telegram.ui.Cells.y6(viewGroup.getContext(), (org.telegram.ui.Cells.f1) null);
        }
        view2 = view;
        return jg.g.r(view2, view2, -1, -2);
    }
}
