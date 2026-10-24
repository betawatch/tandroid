package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class cf1 extends pg.b {
    public final /* synthetic */ ef1 d;

    public cf1(ef1 ef1Var) {
        this.d = ef1Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 1 || i10 == 2 || i10 == 4;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.d.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return ((df1) this.d.d.get(i10)).a;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        ef1 ef1Var = this.d;
        ArrayList arrayList = ef1Var.d;
        if (((df1) arrayList.get(i10)).a == 2) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) b1Var.a;
            long j10 = ef1Var.c;
            TLRPC.TL_forumTopic tL_forumTopic = ((df1) arrayList.get(i10)).c;
            org.telegram.ui.Components.w9 w9Var = paVar.b;
            og.d.p(w9Var, tL_forumTopic, false, false, null);
            if (w9Var != null && w9Var.getImageReceiver() != null && (w9Var.getImageReceiver().getDrawable() instanceof og.c)) {
                ((og.c) w9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.c9, false));
            }
            paVar.c.setText(tL_forumTopic.title);
            paVar.d.setText(MessagesController.getInstance(UserConfig.selectedAccount).getMutedString(j10, tL_forumTopic.id));
            paVar.a = i10 == arrayList.size() - 1 || ((df1) arrayList.get(i10 + 1)).a == 2;
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2 = null;
        if (i10 == 1) {
            org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(viewGroup.getContext());
            r8Var.o(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
            r8Var.g(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, r8Var, null);
            view = r8Var;
        } else if (i10 == 2) {
            Context context = viewGroup.getContext();
            org.telegram.ui.Cells.pa paVar = new org.telegram.ui.Cells.pa(context);
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
            paVar.b = w9Var;
            paVar.addView(w9Var, w7.z5.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            paVar.c = textView;
            org.telegram.messenger.v0.q(textView, org.telegram.ui.ActionBar.k6.G6, null, 1, 16.0f);
            textView.setMaxLines(1);
            paVar.addView(textView, w7.z5.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
            TextView textView2 = new TextView(context);
            paVar.d = textView2;
            org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.y6, null);
            textView2.setTextSize(1, 14.0f);
            paVar.addView(textView2, w7.z5.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, paVar, null);
            view = paVar;
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(viewGroup.getContext());
                    r8Var2.k(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                    r8Var2.g(-1, org.telegram.ui.ActionBar.k6.p7);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, r8Var2, null);
                    view = r8Var2;
                }
                return com.google.android.gms.internal.play_billing.k3.l(view2, view2, -1, -2);
            }
            view = new org.telegram.ui.Cells.b7(viewGroup.getContext(), (org.telegram.ui.Cells.b1) null);
        }
        view2 = view;
        return com.google.android.gms.internal.play_billing.k3.l(view2, view2, -1, -2);
    }
}
