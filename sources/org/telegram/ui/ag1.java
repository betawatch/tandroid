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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ag1 extends og.b {
    public final /* synthetic */ cg1 d;

    public ag1(cg1 cg1Var) {
        this.d = cg1Var;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 1 || i10 == 2 || i10 == 4;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.d.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((bg1) this.d.d.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        cg1 cg1Var = this.d;
        ArrayList arrayList = cg1Var.d;
        if (((bg1) arrayList.get(i10)).a == 2) {
            org.telegram.ui.Cells.ta taVar = (org.telegram.ui.Cells.ta) c1Var.a;
            long j3 = cg1Var.c;
            TLRPC.TL_forumTopic tL_forumTopic = ((bg1) arrayList.get(i10)).c;
            org.telegram.ui.Components.w9 w9Var = taVar.b;
            ng.d.p(w9Var, tL_forumTopic, false, false, null);
            if (w9Var != null && w9Var.getImageReceiver() != null && (w9Var.getImageReceiver().getDrawable() instanceof ng.c)) {
                ((ng.c) w9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.c9, false));
            }
            taVar.c.setText(tL_forumTopic.title);
            taVar.d.setText(MessagesController.getInstance(UserConfig.selectedAccount).getMutedString(j3, tL_forumTopic.id));
            taVar.a = i10 == arrayList.size() - 1 || ((bg1) arrayList.get(i10 + 1)).a == 2;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2 = null;
        if (i10 == 1) {
            org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(viewGroup.getContext());
            s8Var.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
            s8Var.e(org.telegram.ui.ActionBar.h6.v6, org.telegram.ui.ActionBar.h6.u6);
            s8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
            view = s8Var;
        } else if (i10 == 2) {
            Context context = viewGroup.getContext();
            org.telegram.ui.Cells.ta taVar = new org.telegram.ui.Cells.ta(context);
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
            taVar.b = w9Var;
            taVar.addView(w9Var, w7.x5.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            taVar.c = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
            textView.setTextSize(1, 16.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setMaxLines(1);
            taVar.addView(textView, w7.x5.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
            TextView textView2 = new TextView(context);
            taVar.d = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.y6, false));
            textView2.setTextSize(1, 14.0f);
            taVar.addView(textView2, w7.x5.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
            taVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
            view = taVar;
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(viewGroup.getContext());
                    s8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                    s8Var2.e(-1, org.telegram.ui.ActionBar.h6.p7);
                    s8Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                    view = s8Var2;
                }
                return com.google.android.gms.internal.vision.e2.k(view2, view2, -1, -2);
            }
            view = new org.telegram.ui.Cells.a7(viewGroup.getContext(), (org.telegram.ui.Cells.q3) null);
        }
        view2 = view;
        return com.google.android.gms.internal.vision.e2.k(view2, view2, -1, -2);
    }
}
