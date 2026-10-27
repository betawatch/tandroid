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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class cq0 extends org.telegram.ui.ActionBar.o1 {
    public boolean A;
    public zp0 B;
    public u90 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public wp0 o;
    public TextView p;
    public boolean q;
    public TLRPC.Peer r;
    public TLRPC.TL_channels_sendAsPeers s;
    public bh.r t;
    public View u;
    public nm0 v;
    public s4.c0 w;
    public Boolean x;
    public boolean y;
    public ArrayList z;

    public static void k(ef efVar, List list, Context context, org.telegram.ui.wn wnVar, boolean z10, androidx.car.app.utils.a aVar, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (efVar.y) {
            return;
        }
        if (!tL_sendAsPeer.premium_required || UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
            efVar.y = true;
            nm0 nm0Var = efVar.v;
            bq0 bq0Var = (bq0) view;
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
            chatActivityEnterView.M1(true);
            og ogVar = chatActivityEnterView.Z2;
            if (ogVar == null || !ogVar.R0(DialogObject.getPeerDialogId(peer))) {
                messagesController.setDefaultSendAs(chatActivityEnterView.Q2, DialogObject.getPeerDialogId(peer));
            }
            int[] iArr = new int[2];
            nw0 nw0Var = bq0Var.a;
            boolean isSelected = nw0Var.isSelected();
            nw0Var.getLocationInWindow(iArr);
            nw0Var.a(true, true);
            nw0 nw0Var2 = new nw0(chatActivityEnterView.getContext());
            long j10 = peer.channel_id;
            if (j10 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
                if (chat != null) {
                    nw0Var2.setAvatar(chat);
                }
            } else {
                long j11 = peer.user_id;
                if (j11 != 0 && (user = messagesController.getUser(Long.valueOf(j11))) != null) {
                    nw0Var2.setAvatar(user);
                }
            }
            for (int i11 = 0; i11 < nm0Var.getChildCount(); i11++) {
                View childAt = nm0Var.getChildAt(i11);
                if ((childAt instanceof bq0) && childAt != bq0Var) {
                    ((bq0) childAt).a.a(false, true);
                }
            }
            AndroidUtilities.runOnUIThread(new m4.v0(chatActivityEnterView, nw0Var2, iArr, bq0Var, 25), isSelected ? 0L : 200L);
            return;
        }
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (efVar.B == null) {
            efVar.B = new zp0(efVar, context);
        }
        u90 u90Var = efVar.C;
        if (u90Var != null) {
            AndroidUtilities.cancelRunOnUIThread(u90Var);
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
        if (wnVar != null) {
            zp0 zp0Var = efVar.B;
            org.telegram.ui.un unVar = wnVar.ua;
            u90 u90Var2 = new u90(13, efVar, wnVar);
            sp0 sp0Var = new sp0(context, unVar);
            Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
            y9 y9Var = sp0Var.a;
            y9Var.setImageDrawable(drawable);
            int themedColor = sp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.Hi);
            sp0Var.c = themedColor;
            y9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
            sp0Var.b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
            oc ocVar = new oc(context, unVar, true);
            ocVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
            ocVar.b = u90Var2;
            sp0Var.setButton(ocVar);
            qc f7 = qc.f(zp0Var, sp0Var, 1500);
            f7.e.addCallback(new aq0(efVar, f7));
            f7.j();
        }
        u90 u90Var3 = new u90(14, efVar, windowManager);
        efVar.C = u90Var3;
        AndroidUtilities.runOnUIThread(u90Var3, 2500L);
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public void dismiss() {
        if (this.A) {
            return;
        }
        zp0 zp0Var = this.B;
        if (zp0Var != null && zp0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new ml0(3, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.j... jVarArr) {
        wp0 wp0Var = this.o;
        bh.r rVar = this.t;
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
        rVar.setPivotX(AndroidUtilities.dp(8.0f));
        rVar.setPivotY(rVar.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
        wp0Var.setPivotX(0.0f);
        wp0Var.setPivotY(0.0f);
        rVar.setScaleX(1.0f);
        rVar.setScaleY(1.0f);
        wp0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.j jVar = new o1.j(rVar, o1.h.o);
        jVar.u = org.telegram.ui.d3.l(0.25f, 750.0f, 1.0f);
        jVar.b(new tp0(this, 0));
        o1.j jVar2 = new o1.j(rVar, o1.h.p);
        jVar2.u = org.telegram.ui.d3.l(0.25f, 750.0f, 1.0f);
        jVar2.b(new tp0(this, 1));
        o1.c cVar = o1.h.t;
        o1.j jVar3 = new o1.j(rVar, cVar);
        jVar3.u = org.telegram.ui.d3.l(0.0f, 750.0f, 1.0f);
        o1.j jVar4 = new o1.j(wp0Var, cVar);
        jVar4.u = org.telegram.ui.d3.l(0.25f, 750.0f, 1.0f);
        int i11 = 3;
        arrayList3.addAll(Arrays.asList(jVar, jVar2, jVar3, jVar4));
        for (o1.j jVar5 : jVarArr) {
            if (jVar5 != null) {
                arrayList3.add(jVar5);
            }
        }
        this.q = jVarArr.length > 0;
        ((o1.j) arrayList3.get(0)).a(new hb(this, i11));
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            o1.j jVar6 = (o1.j) obj2;
            arrayList.add(jVar6);
            jVar6.a(new up0(this, jVar6, 0));
            jVar6.h();
        }
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void showAtLocation(View view, int i10, int i11, int i12) {
        this.E = i11;
        this.F = i12;
        super.showAtLocation(view, i10, i11, i12);
    }
}
