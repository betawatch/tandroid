package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class aa1 extends rg.b {
    public final /* synthetic */ ca1 d;

    public aa1(ca1 ca1Var) {
        this.d = ca1Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 1 || i7 == 2 || i7 == 4;
    }

    @Override // v4.i0
    public final int b() {
        return this.d.d.size();
    }

    @Override // v4.i0
    public final int d(int i7) {
        return ((ba1) this.d.d.get(i7)).a;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        String N0;
        ca1 ca1Var = this.d;
        ArrayList arrayList = ca1Var.d;
        if (((ba1) arrayList.get(i7)).a == 2) {
            org.telegram.ui.Cells.la laVar = (org.telegram.ui.Cells.la) f1Var.a;
            long j3 = ca1Var.c;
            TLRPC.TL_forumTopic tL_forumTopic = ((ba1) arrayList.get(i7)).c;
            org.telegram.ui.Components.p9 p9Var = laVar.b;
            qg.c.q(p9Var, tL_forumTopic, false, false, null);
            if (p9Var != null && p9Var.getImageReceiver() != null && (p9Var.getImageReceiver().t() instanceof qg.b)) {
                ((qg.b) p9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.c9, false));
            }
            laVar.c.setText(tL_forumTopic.title);
            TextView textView = laVar.d;
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.t0);
            long j10 = tL_forumTopic.id;
            if (u12.getMessagesController().u2(j3, j10, null)) {
                int i10 = u12.g7.getInt("notifyuntil_" + org.telegram.messenger.xs.v(j3, j10, false), 0);
                N0 = i10 >= u12.getConnectionsManager().getCurrentTime() ? org.telegram.messenger.gd.a0("NotificationsMutedForHint", null, 2131747706, org.telegram.messenger.gd.c0(i10)) : org.telegram.messenger.gd.N0(2131747707, null);
            } else {
                N0 = org.telegram.messenger.gd.N0(2131747662, null);
            }
            textView.setText(N0);
            laVar.a = i7 == arrayList.size() - 1 || ((ba1) arrayList.get(i7 + 1)).a == 2;
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2 = null;
        if (i7 == 1) {
            org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(viewGroup.getContext());
            m8Var.o(R.drawable.msg_contact_add, org.telegram.messenger.gd.N0(2131747729, null), true);
            m8Var.g(org.telegram.ui.ActionBar.n6.v6, org.telegram.ui.ActionBar.n6.u6);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, m8Var, null);
            view = m8Var;
        } else if (i7 == 2) {
            Context context = viewGroup.getContext();
            org.telegram.ui.Cells.la laVar = new org.telegram.ui.Cells.la(context);
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
            laVar.b = p9Var;
            laVar.addView(p9Var, c8.na.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            laVar.c = textView;
            org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.G6, null, 1, 16.0f);
            textView.setMaxLines(1);
            laVar.addView(textView, c8.na.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
            TextView textView2 = new TextView(context);
            laVar.d = textView2;
            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.y6, null);
            textView2.setTextSize(1, 14.0f);
            laVar.addView(textView2, c8.na.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, laVar, null);
            view = laVar;
        } else {
            if (i7 != 3) {
                if (i7 == 4) {
                    org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(viewGroup.getContext());
                    m8Var2.k(org.telegram.messenger.gd.N0(2131747721, null), false);
                    m8Var2.g(-1, org.telegram.ui.ActionBar.n6.p7);
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, m8Var2, null);
                    view = m8Var2;
                }
                return i5.c.q(view2, view2, -1, -2);
            }
            view = new org.telegram.ui.Cells.y6(viewGroup.getContext(), (org.telegram.ui.Cells.c0) null);
        }
        view2 = view;
        return i5.c.q(view2, view2, -1, -2);
    }
}
