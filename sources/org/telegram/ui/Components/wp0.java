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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public abstract class wp0 extends org.telegram.ui.ActionBar.m1 {
    public boolean A;
    public tp0 B;
    public f60 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public qp0 o;
    public TextView p;
    public boolean q;
    public TLRPC.Peer r;
    public TLRPC.TL_channels_sendAsPeers s;
    public ah.x t;
    public View u;
    public mm0 v;
    public s4.b0 w;
    public Boolean x;
    public boolean y;
    public ArrayList z;

    public static void k(gf gfVar, List list, Context context, org.telegram.ui.fo foVar, boolean z10, androidx.car.app.utils.a aVar, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (gfVar.y) {
            return;
        }
        if (!tL_sendAsPeer.premium_required || UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
            gfVar.y = true;
            mm0 mm0Var = gfVar.v;
            vp0 vp0Var = (vp0) view;
            TLRPC.Peer peer = tL_sendAsPeer.peer;
            ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) aVar.b;
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) aVar.d;
            MessagesController messagesController = (MessagesController) aVar.c;
            if (chatActivityEnterView.q0 == null) {
                return;
            }
            if (chatFull != null) {
                chatFull.default_send_as = peer;
            }
            chatActivityEnterView.O1(true);
            pg pgVar = chatActivityEnterView.Z2;
            if (pgVar == null || !pgVar.b1(DialogObject.getPeerDialogId(peer))) {
                messagesController.setDefaultSendAs(chatActivityEnterView.Q2, DialogObject.getPeerDialogId(peer));
            }
            int[] iArr = new int[2];
            ew0 ew0Var = vp0Var.a;
            boolean isSelected = ew0Var.isSelected();
            ew0Var.getLocationInWindow(iArr);
            ew0Var.a(true, true);
            ew0 ew0Var2 = new ew0(chatActivityEnterView.getContext());
            long j10 = peer.channel_id;
            if (j10 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
                if (chat != null) {
                    ew0Var2.setAvatar(chat);
                }
            } else {
                long j11 = peer.user_id;
                if (j11 != 0 && (user = messagesController.getUser(Long.valueOf(j11))) != null) {
                    ew0Var2.setAvatar(user);
                }
            }
            for (int i11 = 0; i11 < mm0Var.getChildCount(); i11++) {
                View childAt = mm0Var.getChildAt(i11);
                if ((childAt instanceof vp0) && childAt != vp0Var) {
                    ((vp0) childAt).a.a(false, true);
                }
            }
            AndroidUtilities.runOnUIThread(new org.telegram.ui.p6(chatActivityEnterView, ew0Var2, iArr, vp0Var, 17), isSelected ? 0L : 200L);
            return;
        }
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (gfVar.B == null) {
            gfVar.B = new tp0(gfVar, context);
        }
        f60 f60Var = gfVar.C;
        if (f60Var != null) {
            AndroidUtilities.cancelRunOnUIThread(f60Var);
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
        if (foVar != null) {
            tp0 tp0Var = gfVar.B;
            org.telegram.ui.co coVar = foVar.ea;
            f60 f60Var2 = new f60(20, gfVar, foVar);
            mp0 mp0Var = new mp0(context, coVar);
            Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
            z9 z9Var = mp0Var.a;
            z9Var.setImageDrawable(drawable);
            z9Var.setColorFilter(new PorterDuffColorFilter(mp0Var.getThemedColor(org.telegram.ui.ActionBar.g6.Hi), PorterDuff.Mode.SRC_IN));
            mp0Var.b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
            qc qcVar = new qc(context, coVar, true);
            qcVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
            qcVar.a = f60Var2;
            mp0Var.setButton(qcVar);
            sc f7 = sc.f(tp0Var, mp0Var, 1500);
            f7.e.addCallback(new up0(gfVar, f7));
            f7.j();
        }
        f60 f60Var3 = new f60(21, gfVar, windowManager);
        gfVar.C = f60Var3;
        AndroidUtilities.runOnUIThread(f60Var3, 2500L);
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public void dismiss() {
        if (this.A) {
            return;
        }
        tp0 tp0Var = this.B;
        if (tp0Var != null && tp0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new ql0(1, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.k... kVarArr) {
        qp0 qp0Var = this.o;
        ah.x xVar = this.t;
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
        xVar.setPivotX(AndroidUtilities.dp(8.0f));
        xVar.setPivotY(xVar.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
        qp0Var.setPivotX(0.0f);
        qp0Var.setPivotY(0.0f);
        xVar.setScaleX(1.0f);
        xVar.setScaleY(1.0f);
        qp0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.k kVar = new o1.k(xVar, o1.h.o);
        kVar.u = org.telegram.ui.Cells.d0.k(0.25f, 750.0f, 1.0f);
        kVar.b(new np0(this, 0));
        o1.k kVar2 = new o1.k(xVar, o1.h.p);
        kVar2.u = org.telegram.ui.Cells.d0.k(0.25f, 750.0f, 1.0f);
        kVar2.b(new np0(this, 1));
        o1.c cVar = o1.h.t;
        o1.k kVar3 = new o1.k(xVar, cVar);
        kVar3.u = org.telegram.ui.Cells.d0.k(0.0f, 750.0f, 1.0f);
        o1.k kVar4 = new o1.k(qp0Var, cVar);
        kVar4.u = org.telegram.ui.Cells.d0.k(0.25f, 750.0f, 1.0f);
        int i11 = 3;
        arrayList3.addAll(Arrays.asList(kVar, kVar2, kVar3, kVar4));
        for (o1.k kVar5 : kVarArr) {
            if (kVar5 != null) {
                arrayList3.add(kVar5);
            }
        }
        this.q = kVarArr.length > 0;
        ((o1.k) arrayList3.get(0)).a(new jb(this, i11));
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            o1.k kVar6 = (o1.k) obj2;
            arrayList.add(kVar6);
            kVar6.a(new op0(this, kVar6, 0));
            kVar6.h();
        }
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void showAtLocation(View view, int i10, int i11, int i12) {
        this.E = i11;
        this.F = i12;
        super.showAtLocation(view, i10, i11, i12);
    }
}
