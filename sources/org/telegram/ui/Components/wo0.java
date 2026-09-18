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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class wo0 extends org.telegram.ui.ActionBar.o1 {
    public boolean A;
    public to0 B;
    public ny C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public qo0 o;
    public TextView p;
    public boolean q;
    public TLRPC.Peer r;
    public TLRPC.TL_channels_sendAsPeers s;
    public ai.f0 t;
    public View u;
    public ml0 v;
    public s4.c0 w;
    public Boolean x;
    public boolean y;
    public ArrayList z;

    public static void k(cf cfVar, List list, Context context, org.telegram.ui.bo boVar, boolean z10, ai.r5 r5Var, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (cfVar.y) {
            return;
        }
        if (!tL_sendAsPeer.premium_required || UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
            cfVar.y = true;
            ml0 ml0Var = cfVar.v;
            vo0 vo0Var = (vo0) view;
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
            chatActivityEnterView.Q1(true);
            mg mgVar = chatActivityEnterView.Y2;
            if (mgVar == null || !mgVar.f1(DialogObject.getPeerDialogId(peer))) {
                messagesController.setDefaultSendAs(chatActivityEnterView.P2, DialogObject.getPeerDialogId(peer));
            }
            int[] iArr = new int[2];
            gv0 gv0Var = vo0Var.a;
            boolean isSelected = gv0Var.isSelected();
            gv0Var.getLocationInWindow(iArr);
            gv0Var.a(true, true);
            gv0 gv0Var2 = new gv0(chatActivityEnterView.getContext());
            long j3 = peer.channel_id;
            if (j3 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
                if (chat != null) {
                    gv0Var2.setAvatar(chat);
                }
            } else {
                long j10 = peer.user_id;
                if (j10 != 0 && (user = messagesController.getUser(Long.valueOf(j10))) != null) {
                    gv0Var2.setAvatar(user);
                }
            }
            for (int i11 = 0; i11 < ml0Var.getChildCount(); i11++) {
                View childAt = ml0Var.getChildAt(i11);
                if ((childAt instanceof vo0) && childAt != vo0Var) {
                    ((vo0) childAt).a.a(false, true);
                }
            }
            AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.o5(chatActivityEnterView, gv0Var2, iArr, vo0Var, 18), isSelected ? 0L : 200L);
            return;
        }
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (cfVar.B == null) {
            cfVar.B = new to0(cfVar, context);
        }
        ny nyVar = cfVar.C;
        if (nyVar != null) {
            AndroidUtilities.cancelRunOnUIThread(nyVar);
        }
        if (cfVar.B.getParent() == null) {
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
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, cfVar.B, layoutParams);
            windowManager.addView(cfVar.B, layoutParams);
        }
        if (boVar != null) {
            to0 to0Var = cfVar.B;
            org.telegram.ui.zn znVar = boVar.ea;
            ny nyVar2 = new ny(27, cfVar, boVar);
            mo0 mo0Var = new mo0(context, znVar);
            Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
            u9 u9Var = mo0Var.a;
            u9Var.setImageDrawable(drawable);
            u9Var.setColorFilter(new PorterDuffColorFilter(mo0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Hi), PorterDuff.Mode.SRC_IN));
            mo0Var.b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
            mc mcVar = new mc(context, znVar, true);
            mcVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
            mcVar.a = nyVar2;
            mo0Var.setButton(mcVar);
            oc f7 = oc.f(to0Var, mo0Var, 1500);
            f7.e.addCallback(new uo0(cfVar, f7));
            f7.j();
        }
        ny nyVar3 = new ny(28, cfVar, windowManager);
        cfVar.C = nyVar3;
        AndroidUtilities.runOnUIThread(nyVar3, 2500L);
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public void dismiss() {
        if (this.A) {
            return;
        }
        to0 to0Var = this.B;
        if (to0Var != null && to0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new qk0(1, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.k... kVarArr) {
        qo0 qo0Var = this.o;
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
        qo0Var.setPivotX(0.0f);
        qo0Var.setPivotY(0.0f);
        f0Var.setScaleX(1.0f);
        f0Var.setScaleY(1.0f);
        qo0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.k kVar = new o1.k(f0Var, o1.h.o);
        kVar.u = org.telegram.ui.Cells.p6.l(0.25f, 750.0f, 1.0f);
        kVar.b(new no0(this, 0));
        o1.k kVar2 = new o1.k(f0Var, o1.h.p);
        kVar2.u = org.telegram.ui.Cells.p6.l(0.25f, 750.0f, 1.0f);
        kVar2.b(new no0(this, 1));
        o1.c cVar = o1.h.t;
        o1.k kVar3 = new o1.k(f0Var, cVar);
        kVar3.u = org.telegram.ui.Cells.p6.l(0.0f, 750.0f, 1.0f);
        o1.k kVar4 = new o1.k(qo0Var, cVar);
        kVar4.u = org.telegram.ui.Cells.p6.l(0.25f, 750.0f, 1.0f);
        int i11 = 2;
        arrayList3.addAll(Arrays.asList(kVar, kVar2, kVar3, kVar4));
        for (o1.k kVar5 : kVarArr) {
            if (kVar5 != null) {
                arrayList3.add(kVar5);
            }
        }
        this.q = kVarArr.length > 0;
        ((o1.k) arrayList3.get(0)).a(new fb(this, i11));
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            o1.k kVar6 = (o1.k) obj2;
            arrayList.add(kVar6);
            kVar6.a(new oo0(this, kVar6, 0));
            kVar6.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void showAtLocation(View view, int i10, int i11, int i12) {
        this.E = i11;
        this.F = i12;
        super.showAtLocation(view, i10, i11, i12);
    }
}
