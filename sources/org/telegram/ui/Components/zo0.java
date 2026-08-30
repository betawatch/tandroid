package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class zo0 extends org.telegram.ui.ActionBar.p1 {
    public boolean A;
    public wo0 B;
    public i80 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public to0 o;
    public TextView p;
    public boolean q;
    public TLRPC.Peer r;
    public TLRPC.TL_channels_sendAsPeers s;
    public dg.u2 t;
    public View u;
    public sl0 v;
    public f2.i0 w;
    public Boolean x;
    public boolean y;
    public ArrayList z;

    public static void k(ve veVar, List list, Context context, org.telegram.ui.xn xnVar, boolean z4, androidx.car.app.utils.a aVar, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (veVar.y) {
            return;
        }
        if (!tL_sendAsPeer.premium_required || UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
            veVar.y = true;
            sl0 sl0Var = veVar.v;
            yo0 yo0Var = (yo0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) aVar.b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) aVar.d;
            MessagesController messagesController = (MessagesController) aVar.c;
            if (chatActivityEnterView.n0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.P1(true);
            eg egVar = chatActivityEnterView.V2;
            if (egVar == null || !egVar.g1(DialogObject.getPeerDialogId(peer))) {
                messagesController.setDefaultSendAs(chatActivityEnterView.M2, DialogObject.getPeerDialogId(peer));
            }
            int[] iArr = new int[2];
            fv0 fv0Var = yo0Var.a;
            boolean isSelected = fv0Var.isSelected();
            fv0Var.getLocationInWindow(iArr);
            fv0Var.a(true, true);
            fv0 fv0Var2 = new fv0(chatActivityEnterView.getContext());
            long j10 = peer.channel_id;
            if (j10 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
                if (chat != null) {
                    fv0Var2.setAvatar(chat);
                }
            } else {
                long j11 = peer.user_id;
                if (j11 != 0 && (user = messagesController.getUser(Long.valueOf(j11))) != null) {
                    fv0Var2.setAvatar(user);
                }
            }
            for (int i11 = 0; i11 < sl0Var.getChildCount(); i11++) {
                View childAt = sl0Var.getChildAt(i11);
                if ((childAt instanceof yo0) && childAt != yo0Var) {
                    ((yo0) childAt).a.a(false, true);
                }
            }
            AndroidUtilities.runOnUIThread(new org.telegram.ui.ih(chatActivityEnterView, fv0Var2, iArr, yo0Var, 9), isSelected ? 0L : 200L);
            return;
        }
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (veVar.B == null) {
            veVar.B = new wo0(veVar, context);
        }
        i80 i80Var = veVar.C;
        if (i80Var != null) {
            AndroidUtilities.cancelRunOnUIThread(i80Var);
        }
        if (veVar.B.getParent() == null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.height = -1;
            layoutParams.width = -1;
            layoutParams.format = -3;
            layoutParams.type = 99;
            int i12 = Build.VERSION.SDK_INT;
            layoutParams.flags |= TLObject.FLAG_31;
            if (i12 >= 28) {
                layoutParams.layoutInDisplayCutoutMode = 1;
            }
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, veVar.B, layoutParams);
            windowManager.addView(veVar.B, layoutParams);
        }
        if (xnVar != null) {
            wo0 wo0Var = veVar.B;
            org.telegram.ui.vn vnVar = xnVar.ba;
            i80 i80Var2 = new i80(15, veVar, xnVar);
            po0 po0Var = new po0(context, vnVar);
            Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
            p9 p9Var = po0Var.a;
            p9Var.setImageDrawable(drawable);
            p9Var.setColorFilter(new PorterDuffColorFilter(po0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Hi), PorterDuff.Mode.SRC_IN));
            po0Var.b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
            gc gcVar = new gc(context, vnVar, true);
            gcVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
            gcVar.a = i80Var2;
            po0Var.setButton(gcVar);
            ic f10 = ic.f(wo0Var, po0Var, 1500);
            f10.e.addCallback(new xo0(veVar, f10));
            f10.j();
        }
        i80 i80Var3 = new i80(16, veVar, windowManager);
        veVar.C = i80Var3;
        AndroidUtilities.runOnUIThread(i80Var3, 2500L);
    }

    @Override // org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
    public void dismiss() {
        if (this.A) {
            return;
        }
        wo0 wo0Var = this.B;
        if (wo0Var != null && wo0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new dg.y2(28, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.j... jVarArr) {
        to0 to0Var = this.o;
        dg.u2 u2Var = this.t;
        ArrayList arrayList = this.z;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ((o1.j) obj).c();
        }
        arrayList.clear();
        u2Var.setPivotX(AndroidUtilities.dp(8.0f));
        u2Var.setPivotY(u2Var.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
        to0Var.setPivotX(0.0f);
        to0Var.setPivotY(0.0f);
        u2Var.setScaleX(1.0f);
        u2Var.setScaleY(1.0f);
        to0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.j jVar = new o1.j(u2Var, o1.h.o);
        jVar.u = org.telegram.ui.yh.n(0.25f, 750.0f, 1.0f);
        jVar.b(new qo0(this, 0));
        o1.j jVar2 = new o1.j(u2Var, o1.h.p);
        jVar2.u = org.telegram.ui.yh.n(0.25f, 750.0f, 1.0f);
        jVar2.b(new qo0(this, 1));
        o1.c cVar = o1.h.t;
        o1.j jVar3 = new o1.j(u2Var, cVar);
        jVar3.u = org.telegram.ui.yh.n(0.0f, 750.0f, 1.0f);
        o1.j jVar4 = new o1.j(to0Var, cVar);
        jVar4.u = org.telegram.ui.yh.n(0.25f, 750.0f, 1.0f);
        int i11 = 2;
        arrayList3.addAll(Arrays.asList(jVar, jVar2, jVar3, jVar4));
        for (o1.j jVar5 : jVarArr) {
            if (jVar5 != null) {
                arrayList3.add(jVar5);
            }
        }
        this.q = jVarArr.length > 0;
        ((o1.j) arrayList3.get(0)).a(new ya(this, i11));
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            o1.j jVar6 = (o1.j) obj2;
            arrayList.add(jVar6);
            jVar6.a(new ro0(this, jVar6, 0));
            jVar6.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
    public final void showAtLocation(View view, int i10, int i11, int i12) {
        this.E = i11;
        this.F = i12;
        super.showAtLocation(view, i10, i11, i12);
    }
}
