package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ca1 extends rg.b {
    public final /* synthetic */ ea1 d;

    public ca1(ea1 ea1Var) {
        this.d = ea1Var;
    }

    @Override // org.telegram.ui.Components.bk0
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
        return ((da1) this.d.d.get(i7)).a;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        String M0;
        ea1 ea1Var = this.d;
        ArrayList arrayList = ea1Var.d;
        if (((da1) arrayList.get(i7)).a == 2) {
            org.telegram.ui.Cells.ka kaVar = (org.telegram.ui.Cells.ka) f1Var.a;
            long j3 = ea1Var.c;
            TLRPC.TL_forumTopic tL_forumTopic = ((da1) arrayList.get(i7)).c;
            org.telegram.ui.Components.q9 q9Var = kaVar.b;
            qg.c.q(q9Var, tL_forumTopic, false, false, null);
            if (q9Var != null && q9Var.getImageReceiver() != null && (q9Var.getImageReceiver().t() instanceof qg.b)) {
                ((qg.b) q9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.c9, false));
            }
            kaVar.c.setText(tL_forumTopic.title);
            TextView textView = kaVar.d;
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0);
            long j10 = tL_forumTopic.id;
            if (u12.getMessagesController().u2(j3, j10, null)) {
                int i10 = u12.g7.getInt("notifyuntil_" + org.telegram.messenger.xs.v(j3, j10, false), 0);
                M0 = i10 >= u12.getConnectionsManager().getCurrentTime() ? org.telegram.messenger.gd.a0("NotificationsMutedForHint", null, 2131747707, org.telegram.messenger.gd.c0(i10)) : org.telegram.messenger.gd.M0(2131747708, null);
            } else {
                M0 = org.telegram.messenger.gd.M0(2131747663, null);
            }
            textView.setText(M0);
            kaVar.a = i7 == arrayList.size() - 1 || ((da1) arrayList.get(i7 + 1)).a == 2;
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2 = null;
        if (i7 == 1) {
            org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(viewGroup.getContext());
            n8Var.o(R.drawable.msg_contact_add, org.telegram.messenger.gd.M0(2131747730, null), true);
            n8Var.g(org.telegram.ui.ActionBar.n6.v6, org.telegram.ui.ActionBar.n6.u6);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, n8Var, null);
            view = n8Var;
        } else if (i7 == 2) {
            Context context = viewGroup.getContext();
            org.telegram.ui.Cells.ka kaVar = new org.telegram.ui.Cells.ka(context);
            org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
            kaVar.b = q9Var;
            kaVar.addView(q9Var, c8.ma.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            kaVar.c = textView;
            org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.G6, null, 1, 16.0f);
            textView.setMaxLines(1);
            kaVar.addView(textView, c8.ma.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
            TextView textView2 = new TextView(context);
            kaVar.d = textView2;
            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.y6, null);
            textView2.setTextSize(1, 14.0f);
            kaVar.addView(textView2, c8.ma.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, kaVar, null);
            view = kaVar;
        } else {
            if (i7 != 3) {
                if (i7 == 4) {
                    org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(viewGroup.getContext());
                    n8Var2.k(org.telegram.messenger.gd.M0(2131747722, null), false);
                    n8Var2.g(-1, org.telegram.ui.ActionBar.n6.p7);
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, n8Var2, null);
                    view = n8Var2;
                }
                return i5.c.q(view2, view2, -1, -2);
            }
            view = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (org.telegram.ui.Cells.c0) null);
        }
        view2 = view;
        return i5.c.q(view2, view2, -1, -2);
    }
}
