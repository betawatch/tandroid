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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public abstract class vo0 extends org.telegram.ui.ActionBar.n1 {
    public boolean A;
    public so0 B;
    public ny C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public po0 o;
    public TextView p;
    public boolean q;
    public TLRPC.Peer r;
    public TLRPC.TL_channels_sendAsPeers s;
    public ai.f0 t;
    public View u;
    public ll0 v;
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
            ll0 ll0Var = cfVar.v;
            uo0 uo0Var = (uo0) view;
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
            fv0 fv0Var = uo0Var.a;
            boolean isSelected = fv0Var.isSelected();
            fv0Var.getLocationInWindow(iArr);
            fv0Var.a(true, true);
            fv0 fv0Var2 = new fv0(chatActivityEnterView.getContext());
            long j3 = peer.channel_id;
            if (j3 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
                if (chat != null) {
                    fv0Var2.setAvatar(chat);
                }
            } else {
                long j10 = peer.user_id;
                if (j10 != 0 && (user = messagesController.getUser(Long.valueOf(j10))) != null) {
                    fv0Var2.setAvatar(user);
                }
            }
            for (int i11 = 0; i11 < ll0Var.getChildCount(); i11++) {
                View childAt = ll0Var.getChildAt(i11);
                if ((childAt instanceof uo0) && childAt != uo0Var) {
                    ((uo0) childAt).a.a(false, true);
                }
            }
            AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(chatActivityEnterView, fv0Var2, iArr, uo0Var, 18), isSelected ? 0L : 200L);
            return;
        }
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (cfVar.B == null) {
            cfVar.B = new so0(cfVar, context);
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
            so0 so0Var = cfVar.B;
            org.telegram.ui.zn znVar = boVar.ea;
            ny nyVar2 = new ny(27, cfVar, boVar);
            lo0 lo0Var = new lo0(context, znVar);
            Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
            u9 u9Var = lo0Var.a;
            u9Var.setImageDrawable(drawable);
            u9Var.setColorFilter(new PorterDuffColorFilter(lo0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Hi), PorterDuff.Mode.SRC_IN));
            lo0Var.b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
            mc mcVar = new mc(context, znVar, true);
            mcVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
            mcVar.a = nyVar2;
            lo0Var.setButton(mcVar);
            oc f7 = oc.f(so0Var, lo0Var, 1500);
            f7.e.addCallback(new to0(cfVar, f7));
            f7.j();
        }
        ny nyVar3 = new ny(28, cfVar, windowManager);
        cfVar.C = nyVar3;
        AndroidUtilities.runOnUIThread(nyVar3, 2500L);
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public void dismiss() {
        if (this.A) {
            return;
        }
        so0 so0Var = this.B;
        if (so0Var != null && so0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new pk0(1, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.k... kVarArr) {
        po0 po0Var = this.o;
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
        po0Var.setPivotX(0.0f);
        po0Var.setPivotY(0.0f);
        f0Var.setScaleX(1.0f);
        f0Var.setScaleY(1.0f);
        po0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.k kVar = new o1.k(f0Var, o1.h.o);
        kVar.u = org.telegram.ui.Cells.q3.l(0.25f, 750.0f, 1.0f);
        kVar.b(new mo0(this, 0));
        o1.k kVar2 = new o1.k(f0Var, o1.h.p);
        kVar2.u = org.telegram.ui.Cells.q3.l(0.25f, 750.0f, 1.0f);
        kVar2.b(new mo0(this, 1));
        o1.c cVar = o1.h.t;
        o1.k kVar3 = new o1.k(f0Var, cVar);
        kVar3.u = org.telegram.ui.Cells.q3.l(0.0f, 750.0f, 1.0f);
        o1.k kVar4 = new o1.k(po0Var, cVar);
        kVar4.u = org.telegram.ui.Cells.q3.l(0.25f, 750.0f, 1.0f);
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
            kVar6.a(new no0(this, kVar6, 0));
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
