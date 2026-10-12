package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class pg1 extends pg.b {
    public final /* synthetic */ rg1 d;

    public pg1(rg1 rg1Var) {
        this.d = rg1Var;
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
        return ((qg1) this.d.d.get(i10)).a;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        rg1 rg1Var = this.d;
        ArrayList arrayList = rg1Var.d;
        if (((qg1) arrayList.get(i10)).a == 2) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) b1Var.a;
            long j10 = rg1Var.c;
            TLRPC.TL_forumTopic tL_forumTopic = ((qg1) arrayList.get(i10)).c;
            org.telegram.ui.Components.z9 z9Var = paVar.b;
            og.d.p(z9Var, tL_forumTopic, false, false, null);
            if (z9Var != null && z9Var.getImageReceiver() != null && (z9Var.getImageReceiver().getDrawable() instanceof og.c)) {
                ((og.c) z9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.c9, false));
            }
            paVar.c.setText(tL_forumTopic.title);
            paVar.d.setText(MessagesController.getInstance(UserConfig.selectedAccount).getMutedString(j10, tL_forumTopic.id));
            paVar.a = i10 == arrayList.size() - 1 || ((qg1) arrayList.get(i10 + 1)).a == 2;
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2 = null;
        if (i10 == 1) {
            org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(viewGroup.getContext());
            r8Var.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
            r8Var.e(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
            r8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
            view = r8Var;
        } else if (i10 == 2) {
            Context context = viewGroup.getContext();
            org.telegram.ui.Cells.pa paVar = new org.telegram.ui.Cells.pa(context);
            org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
            paVar.b = z9Var;
            paVar.addView(z9Var, w7.a6.a(30.0f, 20.0f, 0.0f, 0.0f, 0.0f, 30, 16));
            TextView textView = new TextView(context);
            paVar.c = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
            textView.setTextSize(1, 16.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setMaxLines(1);
            paVar.addView(textView, w7.a6.a(-2.0f, 72.0f, 8.0f, 12.0f, 0.0f, -1, 0));
            TextView textView2 = new TextView(context);
            paVar.d = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.y6, false));
            textView2.setTextSize(1, 14.0f);
            paVar.addView(textView2, w7.a6.a(-2.0f, 72.0f, 32.0f, 12.0f, 0.0f, -1, 0));
            paVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
            view = paVar;
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(viewGroup.getContext());
                    r8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                    r8Var2.e(-1, org.telegram.ui.ActionBar.g6.p7);
                    r8Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                    view = r8Var2;
                }
                return com.google.android.gms.internal.play_billing.k3.l(view2, view2, -1, -2);
            }
            view = new org.telegram.ui.Cells.b7(viewGroup.getContext(), (org.telegram.ui.Cells.d0) null);
        }
        view2 = view;
        return com.google.android.gms.internal.play_billing.k3.l(view2, view2, -1, -2);
    }
}
