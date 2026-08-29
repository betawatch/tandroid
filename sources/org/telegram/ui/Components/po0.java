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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class po0 extends org.telegram.ui.ActionBar.o1 {
    public boolean A;
    public mo0 B;
    public ii0 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public jo0 o;
    public TextView p;
    public boolean q;
    public TLRPC.Peer r;
    public TLRPC.TL_channels_sendAsPeers s;
    public bg.x2 t;
    public View u;
    public jl0 v;
    public f2.j0 w;
    public Boolean x;
    public boolean y;
    public ArrayList z;

    public static void k(ye yeVar, List list, Context context, org.telegram.ui.tn tnVar, boolean z10, androidx.car.app.utils.a aVar, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (yeVar.y) {
            return;
        }
        if (!tL_sendAsPeer.premium_required || UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
            yeVar.y = true;
            jl0 jl0Var = yeVar.v;
            oo0 oo0Var = (oo0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) aVar.b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) aVar.d;
            MessagesController messagesController = (MessagesController) aVar.c;
            if (chatActivityEnterView.m0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.P1(true);
            hg hgVar = chatActivityEnterView.U2;
            if (hgVar == null || !hgVar.f1(DialogObject.getPeerDialogId(peer))) {
                messagesController.setDefaultSendAs(chatActivityEnterView.L2, DialogObject.getPeerDialogId(peer));
            }
            int[] iArr = new int[2];
            xu0 xu0Var = oo0Var.a;
            boolean isSelected = xu0Var.isSelected();
            xu0Var.getLocationInWindow(iArr);
            xu0Var.a(true, true);
            xu0 xu0Var2 = new xu0(chatActivityEnterView.getContext());
            long j10 = peer.channel_id;
            if (j10 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
                if (chat != null) {
                    xu0Var2.setAvatar(chat);
                }
            } else {
                long j11 = peer.user_id;
                if (j11 != 0 && (user = messagesController.getUser(Long.valueOf(j11))) != null) {
                    xu0Var2.setAvatar(user);
                }
            }
            for (int i11 = 0; i11 < jl0Var.getChildCount(); i11++) {
                View childAt = jl0Var.getChildAt(i11);
                if ((childAt instanceof oo0) && childAt != oo0Var) {
                    ((oo0) childAt).a.a(false, true);
                }
            }
            AndroidUtilities.runOnUIThread(new org.telegram.ui.gg(chatActivityEnterView, xu0Var2, iArr, oo0Var, 11), isSelected ? 0L : 200L);
            return;
        }
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (yeVar.B == null) {
            yeVar.B = new mo0(yeVar, context);
        }
        ii0 ii0Var = yeVar.C;
        if (ii0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ii0Var);
        }
        if (yeVar.B.getParent() == null) {
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
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, yeVar.B, layoutParams);
            windowManager.addView(yeVar.B, layoutParams);
        }
        if (tnVar != null) {
            mo0 mo0Var = yeVar.B;
            org.telegram.ui.rn rnVar = tnVar.aa;
            ii0 ii0Var2 = new ii0(6, yeVar, tnVar);
            fo0 fo0Var = new fo0(context, rnVar);
            Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
            t9 t9Var = fo0Var.a;
            t9Var.setImageDrawable(drawable);
            t9Var.setColorFilter(new PorterDuffColorFilter(fo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.Hi), PorterDuff.Mode.SRC_IN));
            fo0Var.b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
            kc kcVar = new kc(context, rnVar, true);
            kcVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
            kcVar.a = ii0Var2;
            fo0Var.setButton(kcVar);
            mc f9 = mc.f(mo0Var, fo0Var, 1500);
            f9.e.addCallback(new no0(yeVar, f9));
            f9.j();
        }
        ii0 ii0Var3 = new ii0(7, yeVar, windowManager);
        yeVar.C = ii0Var3;
        AndroidUtilities.runOnUIThread(ii0Var3, 2500L);
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public void dismiss() {
        if (this.A) {
            return;
        }
        mo0 mo0Var = this.B;
        if (mo0Var != null && mo0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new ok0(2, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.k... kVarArr) {
        jo0 jo0Var = this.o;
        bg.x2 x2Var = this.t;
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
        x2Var.setPivotX(AndroidUtilities.dp(8.0f));
        x2Var.setPivotY(x2Var.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
        jo0Var.setPivotX(0.0f);
        jo0Var.setPivotY(0.0f);
        x2Var.setScaleX(1.0f);
        x2Var.setScaleY(1.0f);
        jo0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.k kVar = new o1.k(x2Var, o1.i.o);
        kVar.u = org.telegram.ui.th.l(0.25f, 750.0f, 1.0f);
        kVar.b(new go0(this, 0));
        o1.k kVar2 = new o1.k(x2Var, o1.i.p);
        kVar2.u = org.telegram.ui.th.l(0.25f, 750.0f, 1.0f);
        kVar2.b(new go0(this, 1));
        o1.d dVar = o1.i.t;
        o1.k kVar3 = new o1.k(x2Var, dVar);
        kVar3.u = org.telegram.ui.th.l(0.0f, 750.0f, 1.0f);
        o1.k kVar4 = new o1.k(jo0Var, dVar);
        kVar4.u = org.telegram.ui.th.l(0.25f, 750.0f, 1.0f);
        int i11 = 2;
        arrayList3.addAll(Arrays.asList(kVar, kVar2, kVar3, kVar4));
        for (o1.k kVar5 : kVarArr) {
            if (kVar5 != null) {
                arrayList3.add(kVar5);
            }
        }
        this.q = kVarArr.length > 0;
        ((o1.k) arrayList3.get(0)).a(new db(this, i11));
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            o1.k kVar6 = (o1.k) obj2;
            arrayList.add(kVar6);
            kVar6.a(new ho0(this, kVar6, 0));
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
