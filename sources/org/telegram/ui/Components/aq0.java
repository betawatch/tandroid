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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class aq0 extends org.telegram.ui.ActionBar.n1 {
    public boolean A;
    public xp0 B;
    public ci0 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public up0 o;
    public TextView p;
    public boolean q;
    public TLRPC.Peer r;
    public TLRPC.TL_channels_sendAsPeers s;
    public ai.f0 t;
    public View u;
    public qm0 v;
    public s4.d0 w;
    public Boolean x;
    public boolean y;
    public ArrayList z;

    public static void k(hf hfVar, List list, Context context, org.telegram.ui.zn znVar, boolean z10, ai.r5 r5Var, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (hfVar.y) {
            return;
        }
        if (!tL_sendAsPeer.premium_required || UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
            hfVar.y = true;
            qm0 qm0Var = hfVar.v;
            zp0 zp0Var = (zp0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) r5Var.b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) r5Var.c;
            MessagesController messagesController = (MessagesController) r5Var.d;
            if (chatActivityEnterView.q0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.O1(true);
            qg qgVar = chatActivityEnterView.Z2;
            if (qgVar == null || !qgVar.l1(DialogObject.getPeerDialogId(peer))) {
                messagesController.setDefaultSendAs(chatActivityEnterView.Q2, DialogObject.getPeerDialogId(peer));
            }
            int[] iArr = new int[2];
            iw0 iw0Var = zp0Var.a;
            boolean isSelected = iw0Var.isSelected();
            iw0Var.getLocationInWindow(iArr);
            iw0Var.a(true, true);
            iw0 iw0Var2 = new iw0(chatActivityEnterView.getContext());
            long j3 = peer.channel_id;
            if (j3 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
                if (chat != null) {
                    iw0Var2.setAvatar(chat);
                }
            } else {
                long j10 = peer.user_id;
                if (j10 != 0 && (user = messagesController.getUser(Long.valueOf(j10))) != null) {
                    iw0Var2.setAvatar(user);
                }
            }
            for (int i11 = 0; i11 < qm0Var.getChildCount(); i11++) {
                View childAt = qm0Var.getChildAt(i11);
                if ((childAt instanceof zp0) && childAt != zp0Var) {
                    ((zp0) childAt).a.a(false, true);
                }
            }
            AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(chatActivityEnterView, iw0Var2, iArr, zp0Var, 19), isSelected ? 0L : 200L);
            return;
        }
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (hfVar.B == null) {
            hfVar.B = new xp0(hfVar, context);
        }
        ci0 ci0Var = hfVar.C;
        if (ci0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ci0Var);
        }
        if (hfVar.B.getParent() == null) {
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
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, hfVar.B, layoutParams);
            windowManager.addView(hfVar.B, layoutParams);
        }
        if (znVar != null) {
            xp0 xp0Var = hfVar.B;
            org.telegram.ui.xn xnVar = znVar.ea;
            ci0 ci0Var2 = new ci0(9, hfVar, znVar);
            qp0 qp0Var = new qp0(context, xnVar);
            Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
            y9 y9Var = qp0Var.a;
            y9Var.setImageDrawable(drawable);
            y9Var.setColorFilter(new PorterDuffColorFilter(qp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Hi), PorterDuff.Mode.SRC_IN));
            qp0Var.b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
            rc rcVar = new rc(context, xnVar, true);
            rcVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
            rcVar.a = ci0Var2;
            qp0Var.setButton(rcVar);
            tc f7 = tc.f(xp0Var, qp0Var, 1500);
            f7.e.addCallback(new yp0(hfVar, f7));
            f7.j();
        }
        ci0 ci0Var3 = new ci0(10, hfVar, windowManager);
        hfVar.C = ci0Var3;
        AndroidUtilities.runOnUIThread(ci0Var3, 2500L);
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public void dismiss() {
        if (this.A) {
            return;
        }
        xp0 xp0Var = this.B;
        if (xp0Var != null && xp0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new ul0(1, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.k... kVarArr) {
        up0 up0Var = this.o;
        ai.f0 f0Var = this.t;
        ArrayList arrayList = this.z;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ((o1.k) obj).c();
        }
        arrayList.clear();
        f0Var.setPivotX(AndroidUtilities.dp(8.0f));
        f0Var.setPivotY(f0Var.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
        up0Var.setPivotX(0.0f);
        up0Var.setPivotY(0.0f);
        f0Var.setScaleX(1.0f);
        f0Var.setScaleY(1.0f);
        up0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.k kVar = new o1.k(f0Var, o1.h.o);
        kVar.u = org.telegram.ui.Cells.c1.j(0.25f, 750.0f, 1.0f);
        kVar.b(new rp0(this, 0));
        o1.k kVar2 = new o1.k(f0Var, o1.h.p);
        kVar2.u = org.telegram.ui.Cells.c1.j(0.25f, 750.0f, 1.0f);
        kVar2.b(new rp0(this, 1));
        o1.c cVar = o1.h.t;
        o1.k kVar3 = new o1.k(f0Var, cVar);
        kVar3.u = org.telegram.ui.Cells.c1.j(0.0f, 750.0f, 1.0f);
        o1.k kVar4 = new o1.k(up0Var, cVar);
        kVar4.u = org.telegram.ui.Cells.c1.j(0.25f, 750.0f, 1.0f);
        int i11 = 3;
        arrayList3.addAll(Arrays.asList(kVar, kVar2, kVar3, kVar4));
        for (o1.k kVar5 : kVarArr) {
            if (kVar5 != null) {
                arrayList3.add(kVar5);
            }
        }
        this.q = kVarArr.length > 0;
        ((o1.k) arrayList3.get(0)).a(new kb(this, i11));
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            o1.k kVar6 = (o1.k) obj2;
            arrayList.add(kVar6);
            kVar6.a(new sp0(this, kVar6, 0));
            kVar6.h();
        }
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void showAtLocation(View view, int i10, int i11, int i12) {
        this.E = i11;
        this.F = i12;
        super.showAtLocation(view, i10, i11, i12);
    }
}
