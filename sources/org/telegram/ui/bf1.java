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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bf1 extends wf.b {
    public final /* synthetic */ df1 d;

    public bf1(df1 df1Var) {
        this.d = df1Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return i9 == 1 || i9 == 2 || i9 == 4;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.d.size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        return ((cf1) this.d.d.get(i9)).a;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        df1 df1Var = this.d;
        ArrayList arrayList = df1Var.d;
        if (((cf1) arrayList.get(i9)).a == 2) {
            org.telegram.ui.Cells.oa oaVar = (org.telegram.ui.Cells.oa) q1Var.a;
            long j10 = df1Var.c;
            TLRPC.TL_forumTopic tL_forumTopic = ((cf1) arrayList.get(i9)).c;
            org.telegram.ui.Components.o9 o9Var = oaVar.b;
            vf.c.p(o9Var, tL_forumTopic, false, false, null);
            if (o9Var != null && o9Var.getImageReceiver() != null && (o9Var.getImageReceiver().getDrawable() instanceof vf.b)) {
                ((vf.b) o9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.c9, false));
            }
            oaVar.c.setText(tL_forumTopic.title);
            oaVar.d.setText(MessagesController.getInstance(UserConfig.selectedAccount).getMutedString(j10, tL_forumTopic.id));
            oaVar.a = i9 == arrayList.size() - 1 || ((cf1) arrayList.get(i9 + 1)).a == 2;
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        View view2 = null;
        if (i9 == 1) {
            org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(viewGroup.getContext());
            p8Var.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
            p8Var.e(org.telegram.ui.ActionBar.f6.v6, org.telegram.ui.ActionBar.f6.u6);
            p8Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
            view = p8Var;
        } else if (i9 == 2) {
            Context context = viewGroup.getContext();
            org.telegram.ui.Cells.oa oaVar = new org.telegram.ui.Cells.oa(context);
            org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
            oaVar.b = o9Var;
            oaVar.addView(o9Var, g7.e6.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            oaVar.c = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
            textView.setTextSize(1, 16.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setMaxLines(1);
            oaVar.addView(textView, g7.e6.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
            TextView textView2 = new TextView(context);
            oaVar.d = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.y6, false));
            textView2.setTextSize(1, 14.0f);
            oaVar.addView(textView2, g7.e6.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
            oaVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
            view = oaVar;
        } else {
            if (i9 != 3) {
                if (i9 == 4) {
                    org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(viewGroup.getContext());
                    p8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                    p8Var2.e(-1, org.telegram.ui.ActionBar.f6.p7);
                    p8Var2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                    view = p8Var2;
                }
                return j3.r0.s(view2, view2, -1, -2);
            }
            view = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (org.telegram.ui.Cells.j2) null);
        }
        view2 = view;
        return j3.r0.s(view2, view2, -1, -2);
    }
}
