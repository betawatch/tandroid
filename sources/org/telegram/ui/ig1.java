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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ig1 extends og.b {
    public final /* synthetic */ kg1 d;

    public ig1(kg1 kg1Var) {
        this.d = kg1Var;
    }

    @Override // org.telegram.ui.Components.kl0
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
        return ((jg1) this.d.d.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        kg1 kg1Var = this.d;
        ArrayList arrayList = kg1Var.d;
        if (((jg1) arrayList.get(i10)).a == 2) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) c1Var.a;
            long j3 = kg1Var.c;
            TLRPC.TL_forumTopic tL_forumTopic = ((jg1) arrayList.get(i10)).c;
            org.telegram.ui.Components.u9 u9Var = saVar.b;
            ng.d.p(u9Var, tL_forumTopic, false, false, null);
            if (u9Var != null && u9Var.getImageReceiver() != null && (u9Var.getImageReceiver().getDrawable() instanceof ng.c)) {
                ((ng.c) u9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.c9, false));
            }
            saVar.c.setText(tL_forumTopic.title);
            saVar.d.setText(MessagesController.getInstance(UserConfig.selectedAccount).getMutedString(j3, tL_forumTopic.id));
            saVar.a = i10 == arrayList.size() - 1 || ((jg1) arrayList.get(i10 + 1)).a == 2;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2 = null;
        if (i10 == 1) {
            org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(viewGroup.getContext());
            r8Var.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
            r8Var.e(org.telegram.ui.ActionBar.i6.v6, org.telegram.ui.ActionBar.i6.u6);
            r8Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false));
            view = r8Var;
        } else if (i10 == 2) {
            Context context = viewGroup.getContext();
            org.telegram.ui.Cells.sa saVar = new org.telegram.ui.Cells.sa(context);
            org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
            saVar.b = u9Var;
            saVar.addView(u9Var, w7.x5.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            saVar.c = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false));
            textView.setTextSize(1, 16.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setMaxLines(1);
            saVar.addView(textView, w7.x5.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
            TextView textView2 = new TextView(context);
            saVar.d = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.y6, false));
            textView2.setTextSize(1, 14.0f);
            saVar.addView(textView2, w7.x5.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
            saVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false));
            view = saVar;
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(viewGroup.getContext());
                    r8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                    r8Var2.e(-1, org.telegram.ui.ActionBar.i6.p7);
                    r8Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false));
                    view = r8Var2;
                }
                return com.google.android.gms.internal.vision.e2.k(view2, view2, -1, -2);
            }
            view = new org.telegram.ui.Cells.a7(viewGroup.getContext(), (org.telegram.ui.Cells.q3) null);
        }
        view2 = view;
        return com.google.android.gms.internal.vision.e2.k(view2, view2, -1, -2);
    }
}
