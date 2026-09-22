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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class jg1 extends og.b {
    public final /* synthetic */ lg1 d;

    public jg1(lg1 lg1Var) {
        this.d = lg1Var;
    }

    @Override // org.telegram.ui.Components.xl0
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
        return ((kg1) this.d.d.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        lg1 lg1Var = this.d;
        ArrayList arrayList = lg1Var.d;
        if (((kg1) arrayList.get(i10)).a == 2) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) c1Var.a;
            long j3 = lg1Var.c;
            TLRPC.TL_forumTopic tL_forumTopic = ((kg1) arrayList.get(i10)).c;
            org.telegram.ui.Components.v9 v9Var = saVar.b;
            ng.d.p(v9Var, tL_forumTopic, false, false, null);
            if (v9Var != null && v9Var.getImageReceiver() != null && (v9Var.getImageReceiver().getDrawable() instanceof ng.c)) {
                ((ng.c) v9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.c9, false));
            }
            saVar.c.setText(tL_forumTopic.title);
            saVar.d.setText(MessagesController.getInstance(UserConfig.selectedAccount).getMutedString(j3, tL_forumTopic.id));
            saVar.a = i10 == arrayList.size() - 1 || ((kg1) arrayList.get(i10 + 1)).a == 2;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2 = null;
        if (i10 == 1) {
            org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(viewGroup.getContext());
            s8Var.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
            s8Var.e(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
            s8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            view = s8Var;
        } else if (i10 == 2) {
            Context context = viewGroup.getContext();
            org.telegram.ui.Cells.sa saVar = new org.telegram.ui.Cells.sa(context);
            org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(context);
            saVar.b = v9Var;
            saVar.addView(v9Var, w7.y5.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            saVar.c = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
            textView.setTextSize(1, 16.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setMaxLines(1);
            saVar.addView(textView, w7.y5.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
            TextView textView2 = new TextView(context);
            saVar.d = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y6, false));
            textView2.setTextSize(1, 14.0f);
            saVar.addView(textView2, w7.y5.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
            saVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            view = saVar;
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(viewGroup.getContext());
                    s8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                    s8Var2.e(-1, org.telegram.ui.ActionBar.j6.p7);
                    s8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                    view = s8Var2;
                }
                return com.google.android.gms.internal.vision.e2.k(view2, view2, -1, -2);
            }
            view = new org.telegram.ui.Cells.c7(viewGroup.getContext(), (org.telegram.ui.Cells.c1) null);
        }
        view2 = view;
        return com.google.android.gms.internal.vision.e2.k(view2, view2, -1, -2);
    }
}
