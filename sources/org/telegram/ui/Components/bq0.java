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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class bq0 extends org.telegram.ui.ActionBar.o1 {
    public boolean A;
    public yp0 B;
    public t90 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public vp0 o;
    public TextView p;
    public boolean q;
    public TLRPC.Peer r;
    public TLRPC.TL_channels_sendAsPeers s;
    public bh.r t;
    public View u;
    public mm0 v;
    public s4.c0 w;
    public Boolean x;
    public boolean y;
    public ArrayList z;

    public static void k(ef efVar, List list, Context context, org.telegram.ui.un unVar, boolean z10, androidx.car.app.utils.a aVar, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (efVar.y) {
            return;
        }
        if (!tL_sendAsPeer.premium_required || UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
            efVar.y = true;
            mm0 mm0Var = efVar.v;
            aq0 aq0Var = (aq0) view;
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
            mw0 mw0Var = aq0Var.a;
            boolean isSelected = mw0Var.isSelected();
            mw0Var.getLocationInWindow(iArr);
            mw0Var.a(true, true);
            mw0 mw0Var2 = new mw0(chatActivityEnterView.getContext());
            long j10 = peer.channel_id;
            if (j10 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
                if (chat != null) {
                    mw0Var2.setAvatar(chat);
                }
            } else {
                long j11 = peer.user_id;
                if (j11 != 0 && (user = messagesController.getUser(Long.valueOf(j11))) != null) {
                    mw0Var2.setAvatar(user);
                }
            }
            for (int i11 = 0; i11 < mm0Var.getChildCount(); i11++) {
                View childAt = mm0Var.getChildAt(i11);
                if ((childAt instanceof aq0) && childAt != aq0Var) {
                    ((aq0) childAt).a.a(false, true);
                }
            }
            AndroidUtilities.runOnUIThread(new m4.v0(chatActivityEnterView, mw0Var2, iArr, aq0Var, 25), isSelected ? 0L : 200L);
            return;
        }
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (efVar.B == null) {
            efVar.B = new yp0(efVar, context);
        }
        t90 t90Var = efVar.C;
        if (t90Var != null) {
            AndroidUtilities.cancelRunOnUIThread(t90Var);
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
        if (unVar != null) {
            yp0 yp0Var = efVar.B;
            org.telegram.ui.sn snVar = unVar.qa;
            t90 t90Var2 = new t90(13, efVar, unVar);
            rp0 rp0Var = new rp0(context, snVar);
            Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
            y9 y9Var = rp0Var.a;
            y9Var.setImageDrawable(drawable);
            int themedColor = rp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.Hi);
            rp0Var.c = themedColor;
            y9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
            rp0Var.b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
            oc ocVar = new oc(context, snVar, true);
            ocVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
            ocVar.b = t90Var2;
            rp0Var.setButton(ocVar);
            qc f7 = qc.f(yp0Var, rp0Var, 1500);
            f7.e.addCallback(new zp0(efVar, f7));
            f7.j();
        }
        t90 t90Var3 = new t90(14, efVar, windowManager);
        efVar.C = t90Var3;
        AndroidUtilities.runOnUIThread(t90Var3, 2500L);
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public void dismiss() {
        if (this.A) {
            return;
        }
        yp0 yp0Var = this.B;
        if (yp0Var != null && yp0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new ll0(3, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.j... jVarArr) {
        vp0 vp0Var = this.o;
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
        vp0Var.setPivotX(0.0f);
        vp0Var.setPivotY(0.0f);
        rVar.setScaleX(1.0f);
        rVar.setScaleY(1.0f);
        vp0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.j jVar = new o1.j(rVar, o1.h.o);
        jVar.u = org.telegram.ui.d3.l(0.25f, 750.0f, 1.0f);
        jVar.b(new sp0(this, 0));
        o1.j jVar2 = new o1.j(rVar, o1.h.p);
        jVar2.u = org.telegram.ui.d3.l(0.25f, 750.0f, 1.0f);
        jVar2.b(new sp0(this, 1));
        o1.c cVar = o1.h.t;
        o1.j jVar3 = new o1.j(rVar, cVar);
        jVar3.u = org.telegram.ui.d3.l(0.0f, 750.0f, 1.0f);
        o1.j jVar4 = new o1.j(vp0Var, cVar);
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
            jVar6.a(new tp0(this, jVar6, 0));
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
