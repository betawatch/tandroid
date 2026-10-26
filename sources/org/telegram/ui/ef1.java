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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ef1 extends qg.b {
    public final /* synthetic */ gf1 d;

    public ef1(gf1 gf1Var) {
        this.d = gf1Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        return i10 == 1 || i10 == 2 || i10 == 4;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.d.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((ff1) this.d.d.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        gf1 gf1Var = this.d;
        ArrayList arrayList = gf1Var.d;
        if (((ff1) arrayList.get(i10)).a == 2) {
            org.telegram.ui.Cells.ta taVar = (org.telegram.ui.Cells.ta) e1Var.a;
            long j10 = gf1Var.c;
            TLRPC.TL_forumTopic tL_forumTopic = ((ff1) arrayList.get(i10)).c;
            org.telegram.ui.Components.y9 y9Var = taVar.b;
            pg.d.p(y9Var, tL_forumTopic, false, false, null);
            if (y9Var != null && y9Var.getImageReceiver() != null && (y9Var.getImageReceiver().getDrawable() instanceof pg.c)) {
                ((pg.c) y9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.c9, false));
            }
            taVar.c.setText(tL_forumTopic.title);
            taVar.d.setText(MessagesController.getInstance(UserConfig.selectedAccount).getMutedString(j10, tL_forumTopic.id));
            taVar.a = i10 == arrayList.size() - 1 || ((ff1) arrayList.get(i10 + 1)).a == 2;
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2 = null;
        if (i10 == 1) {
            org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(viewGroup.getContext());
            v8Var.o(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
            v8Var.g(org.telegram.ui.ActionBar.y6.v6, org.telegram.ui.ActionBar.y6.u6);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, v8Var, null);
            view = v8Var;
        } else if (i10 == 2) {
            Context context = viewGroup.getContext();
            org.telegram.ui.Cells.ta taVar = new org.telegram.ui.Cells.ta(context);
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
            taVar.b = y9Var;
            taVar.addView(y9Var, org.telegram.ui.Components.gb1.h(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            taVar.c = textView;
            org.telegram.messenger.t.r(textView, org.telegram.ui.ActionBar.y6.G6, null, 1, 16.0f);
            textView.setMaxLines(1);
            taVar.addView(textView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
            TextView textView2 = new TextView(context);
            taVar.d = textView2;
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.y6, null);
            textView2.setTextSize(1, 14.0f);
            taVar.addView(textView2, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, taVar, null);
            view = taVar;
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    org.telegram.ui.Cells.v8 v8Var2 = new org.telegram.ui.Cells.v8(viewGroup.getContext());
                    v8Var2.k(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                    v8Var2.g(-1, org.telegram.ui.ActionBar.y6.p7);
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, v8Var2, null);
                    view = v8Var2;
                }
                return ic.a.n(view2, view2, -1, -2);
            }
            view = new org.telegram.ui.Cells.f7(viewGroup.getContext(), (d3) null);
        }
        view2 = view;
        return ic.a.n(view2, view2, -1, -2);
    }
}
