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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public abstract class pp0 extends org.telegram.ui.ActionBar.n1 {
    public boolean A;
    public mp0 B;
    public vo0 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public jp0 o;
    public TextView p;
    public boolean q;
    public TLRPC.Peer r;
    public TLRPC.TL_channels_sendAsPeers s;
    public ai.f0 t;
    public View u;
    public zl0 v;
    public s4.c0 w;
    public Boolean x;
    public boolean y;
    public ArrayList z;

    public static void k(gf gfVar, List list, Context context, org.telegram.ui.yn ynVar, boolean z10, ai.q5 q5Var, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (gfVar.y) {
            return;
        }
        if (!tL_sendAsPeer.premium_required || UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
            gfVar.y = true;
            zl0 zl0Var = gfVar.v;
            op0 op0Var = (op0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) q5Var.b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) q5Var.c;
            MessagesController messagesController = (MessagesController) q5Var.d;
            if (chatActivityEnterView.q0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.P1(true);
            pg pgVar = chatActivityEnterView.Z2;
            if (pgVar == null || !pgVar.f1(DialogObject.getPeerDialogId(peer))) {
                messagesController.setDefaultSendAs(chatActivityEnterView.Q2, DialogObject.getPeerDialogId(peer));
            }
            int[] iArr = new int[2];
            cw0 cw0Var = op0Var.a;
            boolean isSelected = cw0Var.isSelected();
            cw0Var.getLocationInWindow(iArr);
            cw0Var.a(true, true);
            cw0 cw0Var2 = new cw0(chatActivityEnterView.getContext());
            long j3 = peer.channel_id;
            if (j3 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
                if (chat != null) {
                    cw0Var2.setAvatar(chat);
                }
            } else {
                long j10 = peer.user_id;
                if (j10 != 0 && (user = messagesController.getUser(Long.valueOf(j10))) != null) {
                    cw0Var2.setAvatar(user);
                }
            }
            for (int i11 = 0; i11 < zl0Var.getChildCount(); i11++) {
                View childAt = zl0Var.getChildAt(i11);
                if ((childAt instanceof op0) && childAt != op0Var) {
                    ((op0) childAt).a.a(false, true);
                }
            }
            AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5(chatActivityEnterView, cw0Var2, iArr, op0Var, 18), isSelected ? 0L : 200L);
            return;
        }
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (gfVar.B == null) {
            gfVar.B = new mp0(gfVar, context);
        }
        vo0 vo0Var = gfVar.C;
        if (vo0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(vo0Var);
        }
        if (gfVar.B.getParent() == null) {
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
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, gfVar.B, layoutParams);
            windowManager.addView(gfVar.B, layoutParams);
        }
        if (ynVar != null) {
            mp0 mp0Var = gfVar.B;
            org.telegram.ui.wn wnVar = ynVar.ca;
            vo0 vo0Var2 = new vo0(1, gfVar, ynVar);
            fp0 fp0Var = new fp0(context, wnVar);
            Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
            w9 w9Var = fp0Var.a;
            w9Var.setImageDrawable(drawable);
            w9Var.setColorFilter(new PorterDuffColorFilter(fp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Hi), PorterDuff.Mode.SRC_IN));
            fp0Var.b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
            pc pcVar = new pc(context, wnVar, true);
            pcVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
            pcVar.a = vo0Var2;
            fp0Var.setButton(pcVar);
            rc f7 = rc.f(mp0Var, fp0Var, 1500);
            f7.e.addCallback(new np0(gfVar, f7));
            f7.j();
        }
        vo0 vo0Var3 = new vo0(2, gfVar, windowManager);
        gfVar.C = vo0Var3;
        AndroidUtilities.runOnUIThread(vo0Var3, 2500L);
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public void dismiss() {
        if (this.A) {
            return;
        }
        mp0 mp0Var = this.B;
        if (mp0Var != null && mp0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new cl0(1, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.k... kVarArr) {
        jp0 jp0Var = this.o;
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
        jp0Var.setPivotX(0.0f);
        jp0Var.setPivotY(0.0f);
        f0Var.setScaleX(1.0f);
        f0Var.setScaleY(1.0f);
        jp0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.k kVar = new o1.k(f0Var, o1.h.o);
        kVar.u = org.telegram.ui.Cells.c1.l(0.25f, 750.0f, 1.0f);
        kVar.b(new gp0(this, 0));
        o1.k kVar2 = new o1.k(f0Var, o1.h.p);
        kVar2.u = org.telegram.ui.Cells.c1.l(0.25f, 750.0f, 1.0f);
        kVar2.b(new gp0(this, 1));
        o1.c cVar = o1.h.t;
        o1.k kVar3 = new o1.k(f0Var, cVar);
        kVar3.u = org.telegram.ui.Cells.c1.l(0.0f, 750.0f, 1.0f);
        o1.k kVar4 = new o1.k(jp0Var, cVar);
        kVar4.u = org.telegram.ui.Cells.c1.l(0.25f, 750.0f, 1.0f);
        int i11 = 2;
        arrayList3.addAll(Arrays.asList(kVar, kVar2, kVar3, kVar4));
        for (o1.k kVar5 : kVarArr) {
            if (kVar5 != null) {
                arrayList3.add(kVar5);
            }
        }
        this.q = kVarArr.length > 0;
        ((o1.k) arrayList3.get(0)).a(new ib(this, i11));
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            o1.k kVar6 = (o1.k) obj2;
            arrayList.add(kVar6);
            kVar6.a(new hp0(this, kVar6, 0));
            kVar6.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void showAtLocation(View view, int i10, int i11, int i12) {
        this.E = i11;
        this.F = i12;
        super.showAtLocation(view, i10, i11, i12);
    }
}
