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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class af1 extends xf.b {
    public final /* synthetic */ cf1 d;

    public af1(cf1 cf1Var) {
        this.d = cf1Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f;
        return i10 == 1 || i10 == 2 || i10 == 4;
    }

    @Override // f2.q0
    public final int h() {
        return this.d.d.size();
    }

    @Override // f2.q0
    public final int j(int i10) {
        return ((bf1) this.d.d.get(i10)).a;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        cf1 cf1Var = this.d;
        ArrayList arrayList = cf1Var.d;
        if (((bf1) arrayList.get(i10)).a == 2) {
            org.telegram.ui.Cells.ka kaVar = (org.telegram.ui.Cells.ka) o1Var.a;
            long j10 = cf1Var.c;
            TLRPC.TL_forumTopic tL_forumTopic = ((bf1) arrayList.get(i10)).c;
            org.telegram.ui.Components.n9 n9Var = kaVar.b;
            wf.c.p(n9Var, tL_forumTopic, false, false, null);
            if (n9Var != null && n9Var.getImageReceiver() != null && (n9Var.getImageReceiver().getDrawable() instanceof wf.b)) {
                ((wf.b) n9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.c9, false));
            }
            kaVar.c.setText(tL_forumTopic.title);
            kaVar.d.setText(MessagesController.getInstance(UserConfig.selectedAccount).getMutedString(j10, tL_forumTopic.id));
            kaVar.a = i10 == arrayList.size() - 1 || ((bf1) arrayList.get(i10 + 1)).a == 2;
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2 = null;
        if (i10 == 1) {
            org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(viewGroup.getContext());
            l8Var.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
            l8Var.e(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
            l8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
            view = l8Var;
        } else if (i10 == 2) {
            Context context = viewGroup.getContext();
            org.telegram.ui.Cells.ka kaVar = new org.telegram.ui.Cells.ka(context);
            org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
            kaVar.b = n9Var;
            kaVar.addView(n9Var, h7.z5.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            kaVar.c = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
            textView.setTextSize(1, 16.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setMaxLines(1);
            kaVar.addView(textView, h7.z5.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
            TextView textView2 = new TextView(context);
            kaVar.d = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.y6, false));
            textView2.setTextSize(1, 14.0f);
            kaVar.addView(textView2, h7.z5.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
            kaVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
            view = kaVar;
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(viewGroup.getContext());
                    l8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                    l8Var2.e(-1, org.telegram.ui.ActionBar.g6.p7);
                    l8Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                    view = l8Var2;
                }
                return org.telegram.ui.Cells.pa.l(view2, view2, -1, -2);
            }
            view = new org.telegram.ui.Cells.w6(viewGroup.getContext(), (org.telegram.messenger.rl) null);
        }
        view2 = view;
        return org.telegram.ui.Cells.pa.l(view2, view2, -1, -2);
    }
}
