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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class df1 extends zf.b {
    public final /* synthetic */ ff1 d;

    public df1(ff1 ff1Var) {
        this.d = ff1Var;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f;
        return i10 == 1 || i10 == 2 || i10 == 4;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.d.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        return ((ef1) this.d.d.get(i10)).a;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        ff1 ff1Var = this.d;
        ArrayList arrayList = ff1Var.d;
        if (((ef1) arrayList.get(i10)).a == 2) {
            org.telegram.ui.Cells.la laVar = (org.telegram.ui.Cells.la) n1Var.a;
            long j10 = ff1Var.c;
            TLRPC.TL_forumTopic tL_forumTopic = ((ef1) arrayList.get(i10)).c;
            org.telegram.ui.Components.t9 t9Var = laVar.b;
            yf.d.p(t9Var, tL_forumTopic, false, false, null);
            if (t9Var != null && t9Var.getImageReceiver() != null && (t9Var.getImageReceiver().getDrawable() instanceof yf.c)) {
                ((yf.c) t9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.c9, false));
            }
            laVar.c.setText(tL_forumTopic.title);
            laVar.d.setText(MessagesController.getInstance(UserConfig.selectedAccount).getMutedString(j10, tL_forumTopic.id));
            laVar.a = i10 == arrayList.size() - 1 || ((ef1) arrayList.get(i10 + 1)).a == 2;
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2 = null;
        if (i10 == 1) {
            org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(viewGroup.getContext());
            m8Var.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
            m8Var.e(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
            m8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
            view = m8Var;
        } else if (i10 == 2) {
            Context context = viewGroup.getContext();
            org.telegram.ui.Cells.la laVar = new org.telegram.ui.Cells.la(context);
            org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
            laVar.b = t9Var;
            laVar.addView(t9Var, i7.f6.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            laVar.c = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
            textView.setTextSize(1, 16.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setMaxLines(1);
            laVar.addView(textView, i7.f6.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
            TextView textView2 = new TextView(context);
            laVar.d = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.y6, false));
            textView2.setTextSize(1, 14.0f);
            laVar.addView(textView2, i7.f6.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
            laVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
            view = laVar;
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(viewGroup.getContext());
                    m8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                    m8Var2.e(-1, org.telegram.ui.ActionBar.g6.p7);
                    m8Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                    view = m8Var2;
                }
                return th.m(view2, view2, -1, -2);
            }
            view = new org.telegram.ui.Cells.x6(viewGroup.getContext(), (b) null);
        }
        view2 = view;
        return th.m(view2, view2, -1, -2);
    }
}
