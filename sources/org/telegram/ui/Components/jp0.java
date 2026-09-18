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

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public abstract class jp0 extends org.telegram.ui.ActionBar.n1 {
    public boolean A;
    public gp0 B;
    public po0 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public dp0 o;
    public TextView p;
    public boolean q;
    public TLRPC.Peer r;
    public TLRPC.TL_channels_sendAsPeers s;
    public ai.f0 t;
    public View u;
    public wl0 v;
    public s4.c0 w;
    public Boolean x;
    public boolean y;
    public ArrayList z;

    public static void k(ef efVar, List list, Context context, org.telegram.ui.zn znVar, boolean z10, ai.r5 r5Var, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (efVar.y) {
            return;
        }
        if (!tL_sendAsPeer.premium_required || UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
            efVar.y = true;
            wl0 wl0Var = efVar.v;
            ip0 ip0Var = (ip0) view;
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
            chatActivityEnterView.P1(true);
            ng ngVar = chatActivityEnterView.Y2;
            if (ngVar == null || !ngVar.f1(DialogObject.getPeerDialogId(peer))) {
                messagesController.setDefaultSendAs(chatActivityEnterView.P2, DialogObject.getPeerDialogId(peer));
            }
            int[] iArr = new int[2];
            rv0 rv0Var = ip0Var.a;
            boolean isSelected = rv0Var.isSelected();
            rv0Var.getLocationInWindow(iArr);
            rv0Var.a(true, true);
            rv0 rv0Var2 = new rv0(chatActivityEnterView.getContext());
            long j3 = peer.channel_id;
            if (j3 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
                if (chat != null) {
                    rv0Var2.setAvatar(chat);
                }
            } else {
                long j10 = peer.user_id;
                if (j10 != 0 && (user = messagesController.getUser(Long.valueOf(j10))) != null) {
                    rv0Var2.setAvatar(user);
                }
            }
            for (int i11 = 0; i11 < wl0Var.getChildCount(); i11++) {
                View childAt = wl0Var.getChildAt(i11);
                if ((childAt instanceof ip0) && childAt != ip0Var) {
                    ((ip0) childAt).a.a(false, true);
                }
            }
            AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(chatActivityEnterView, rv0Var2, iArr, ip0Var, 18), isSelected ? 0L : 200L);
            return;
        }
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (efVar.B == null) {
            efVar.B = new gp0(efVar, context);
        }
        po0 po0Var = efVar.C;
        if (po0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(po0Var);
        }
        if (efVar.B.getParent() == null) {
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
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, efVar.B, layoutParams);
            windowManager.addView(efVar.B, layoutParams);
        }
        if (znVar != null) {
            gp0 gp0Var = efVar.B;
            org.telegram.ui.xn xnVar = znVar.ea;
            po0 po0Var2 = new po0(1, efVar, znVar);
            zo0 zo0Var = new zo0(context, xnVar);
            Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
            w9 w9Var = zo0Var.a;
            w9Var.setImageDrawable(drawable);
            w9Var.setColorFilter(new PorterDuffColorFilter(zo0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Hi), PorterDuff.Mode.SRC_IN));
            zo0Var.b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
            oc ocVar = new oc(context, xnVar, true);
            ocVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
            ocVar.a = po0Var2;
            zo0Var.setButton(ocVar);
            qc f7 = qc.f(gp0Var, zo0Var, 1500);
            f7.e.addCallback(new hp0(efVar, f7));
            f7.j();
        }
        po0 po0Var3 = new po0(2, efVar, windowManager);
        efVar.C = po0Var3;
        AndroidUtilities.runOnUIThread(po0Var3, 2500L);
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public void dismiss() {
        if (this.A) {
            return;
        }
        gp0 gp0Var = this.B;
        if (gp0Var != null && gp0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new al0(1, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.k... kVarArr) {
        dp0 dp0Var = this.o;
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
        dp0Var.setPivotX(0.0f);
        dp0Var.setPivotY(0.0f);
        f0Var.setScaleX(1.0f);
        f0Var.setScaleY(1.0f);
        dp0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.k kVar = new o1.k(f0Var, o1.h.o);
        kVar.u = org.telegram.ui.Cells.c1.j(0.25f, 750.0f, 1.0f);
        kVar.b(new ap0(this, 0));
        o1.k kVar2 = new o1.k(f0Var, o1.h.p);
        kVar2.u = org.telegram.ui.Cells.c1.j(0.25f, 750.0f, 1.0f);
        kVar2.b(new ap0(this, 1));
        o1.c cVar = o1.h.t;
        o1.k kVar3 = new o1.k(f0Var, cVar);
        kVar3.u = org.telegram.ui.Cells.c1.j(0.0f, 750.0f, 1.0f);
        o1.k kVar4 = new o1.k(dp0Var, cVar);
        kVar4.u = org.telegram.ui.Cells.c1.j(0.25f, 750.0f, 1.0f);
        int i11 = 2;
        arrayList3.addAll(Arrays.asList(kVar, kVar2, kVar3, kVar4));
        for (o1.k kVar5 : kVarArr) {
            if (kVar5 != null) {
                arrayList3.add(kVar5);
            }
        }
        this.q = kVarArr.length > 0;
        ((o1.k) arrayList3.get(0)).a(new hb(this, i11));
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            o1.k kVar6 = (o1.k) obj2;
            arrayList.add(kVar6);
            kVar6.a(new bp0(this, kVar6, 0));
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
