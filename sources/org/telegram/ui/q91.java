package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q91 extends sg.b {
    public final /* synthetic */ s91 d;

    public q91(s91 s91Var) {
        this.d = s91Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        return i3 == 1 || i3 == 2 || i3 == 4;
    }

    @Override // u4.h0
    public final int b() {
        return this.d.d.size();
    }

    @Override // u4.h0
    public final int d(int i3) {
        return ((r91) this.d.d.get(i3)).a;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        String M0;
        s91 s91Var = this.d;
        ArrayList arrayList = s91Var.d;
        if (((r91) arrayList.get(i3)).a == 2) {
            org.telegram.ui.Cells.ia iaVar = (org.telegram.ui.Cells.ia) d1Var.a;
            long j10 = s91Var.c;
            TLRPC.TL_forumTopic tL_forumTopic = ((r91) arrayList.get(i3)).c;
            org.telegram.ui.Components.k9 k9Var = iaVar.b;
            rg.c.p(k9Var, tL_forumTopic, false, false, null);
            if (k9Var != null && k9Var.getImageReceiver() != null && (k9Var.getImageReceiver().t() instanceof rg.b)) {
                ((rg.b) k9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.c9, false));
            }
            iaVar.c.setText(tL_forumTopic.title);
            TextView textView = iaVar.d;
            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0);
            long j11 = tL_forumTopic.id;
            if (s12.getMessagesController().r2(j10, j11, null)) {
                int i10 = s12.d7.getInt("notifyuntil_" + org.telegram.messenger.us.v(j10, j11, false), 0);
                M0 = i10 >= s12.getConnectionsManager().getCurrentTime() ? org.telegram.messenger.bd.a0("NotificationsMutedForHint", null, 2131747908, org.telegram.messenger.bd.c0(i10)) : org.telegram.messenger.bd.M0(2131747909, null);
            } else {
                M0 = org.telegram.messenger.bd.M0(2131747864, null);
            }
            textView.setText(M0);
            iaVar.a = i3 == arrayList.size() - 1 || ((r91) arrayList.get(i3 + 1)).a == 2;
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        View view2 = null;
        if (i3 == 1) {
            org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(viewGroup.getContext());
            l8Var.o(R.drawable.msg_contact_add, org.telegram.messenger.bd.M0(2131747931, null), true);
            l8Var.g(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l8Var, null);
            view = l8Var;
        } else if (i3 == 2) {
            Context context = viewGroup.getContext();
            org.telegram.ui.Cells.ia iaVar = new org.telegram.ui.Cells.ia(context);
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
            iaVar.b = k9Var;
            iaVar.addView(k9Var, b8.mf.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            iaVar.c = textView;
            org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.G6, null, 1, 16.0f);
            textView.setMaxLines(1);
            iaVar.addView(textView, b8.mf.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
            TextView textView2 = new TextView(context);
            iaVar.d = textView2;
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.y6, null);
            textView2.setTextSize(1, 14.0f);
            iaVar.addView(textView2, b8.mf.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, iaVar, null);
            view = iaVar;
        } else {
            if (i3 != 3) {
                if (i3 == 4) {
                    org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(viewGroup.getContext());
                    l8Var2.k(org.telegram.messenger.bd.M0(2131747923, null), false);
                    l8Var2.g(-1, org.telegram.ui.ActionBar.k6.p7);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l8Var2, null);
                    view = l8Var2;
                }
                return k2.p1.p(view2, view2, -1, -2);
            }
            view = new org.telegram.ui.Cells.x6(viewGroup.getContext(), (org.telegram.ui.Cells.f1) null);
        }
        view2 = view;
        return k2.p1.p(view2, view2, -1, -2);
    }
}
