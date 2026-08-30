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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class of1 extends bg.c {
    public final /* synthetic */ qf1 d;

    public of1(qf1 qf1Var) {
        this.d = qf1Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return i10 == 1 || i10 == 2 || i10 == 4;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.d.size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        return ((pf1) this.d.d.get(i10)).a;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        qf1 qf1Var = this.d;
        ArrayList arrayList = qf1Var.d;
        if (((pf1) arrayList.get(i10)).a == 2) {
            org.telegram.ui.Cells.na naVar = (org.telegram.ui.Cells.na) l1Var.a;
            long j10 = qf1Var.c;
            TLRPC.TL_forumTopic tL_forumTopic = ((pf1) arrayList.get(i10)).c;
            org.telegram.ui.Components.p9 p9Var = naVar.b;
            ag.f.p(p9Var, tL_forumTopic, false, false, null);
            if (p9Var != null && p9Var.getImageReceiver() != null && (p9Var.getImageReceiver().getDrawable() instanceof ag.e)) {
                ((ag.e) p9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.c9, false));
            }
            naVar.c.setText(tL_forumTopic.title);
            naVar.d.setText(MessagesController.getInstance(UserConfig.selectedAccount).getMutedString(j10, tL_forumTopic.id));
            naVar.a = i10 == arrayList.size() - 1 || ((pf1) arrayList.get(i10 + 1)).a == 2;
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2 = null;
        if (i10 == 1) {
            org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(viewGroup.getContext());
            o8Var.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
            o8Var.e(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
            o8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            view = o8Var;
        } else if (i10 == 2) {
            Context context = viewGroup.getContext();
            org.telegram.ui.Cells.na naVar = new org.telegram.ui.Cells.na(context);
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
            naVar.b = p9Var;
            naVar.addView(p9Var, k7.b6.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            naVar.c = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
            textView.setTextSize(1, 16.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setMaxLines(1);
            naVar.addView(textView, k7.b6.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
            TextView textView2 = new TextView(context);
            naVar.d = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y6, false));
            textView2.setTextSize(1, 14.0f);
            naVar.addView(textView2, k7.b6.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
            naVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            view = naVar;
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    org.telegram.ui.Cells.o8 o8Var2 = new org.telegram.ui.Cells.o8(viewGroup.getContext());
                    o8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                    o8Var2.e(-1, org.telegram.ui.ActionBar.j6.p7);
                    o8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                    view = o8Var2;
                }
                return yh.o(view2, view2, -1, -2);
            }
            view = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (b) null);
        }
        view2 = view;
        return yh.o(view2, view2, -1, -2);
    }
}
