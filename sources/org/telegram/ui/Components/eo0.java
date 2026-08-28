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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class eo0 extends org.telegram.ui.ActionBar.o1 {
    public boolean A;
    public bo0 B;
    public jg0 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public yn0 o;
    public TextView p;
    public boolean q;
    public TLRPC.Peer r;
    public TLRPC.TL_channels_sendAsPeers s;
    public fh.d2 t;
    public View u;
    public wk0 v;
    public f2.m0 w;
    public Boolean x;
    public boolean y;
    public ArrayList z;

    public static void k(ve veVar, List list, Context context, org.telegram.ui.qn qnVar, boolean z10, androidx.car.app.utils.a aVar, View view, int i9) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i9);
        if (veVar.y) {
            return;
        }
        if (!tL_sendAsPeer.premium_required || UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
            veVar.y = true;
            wk0 wk0Var = veVar.v;
            do0 do0Var = (do0) view;
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
            eg egVar = chatActivityEnterView.U2;
            if (egVar == null || !egVar.T0(DialogObject.getPeerDialogId(peer))) {
                messagesController.setDefaultSendAs(chatActivityEnterView.L2, DialogObject.getPeerDialogId(peer));
            }
            int[] iArr = new int[2];
            mu0 mu0Var = do0Var.a;
            boolean isSelected = mu0Var.isSelected();
            mu0Var.getLocationInWindow(iArr);
            mu0Var.a(true, true);
            mu0 mu0Var2 = new mu0(chatActivityEnterView.getContext());
            long j10 = peer.channel_id;
            if (j10 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
                if (chat != null) {
                    mu0Var2.setAvatar(chat);
                }
            } else {
                long j11 = peer.user_id;
                if (j11 != 0 && (user = messagesController.getUser(Long.valueOf(j11))) != null) {
                    mu0Var2.setAvatar(user);
                }
            }
            for (int i10 = 0; i10 < wk0Var.getChildCount(); i10++) {
                View childAt = wk0Var.getChildAt(i10);
                if ((childAt instanceof do0) && childAt != do0Var) {
                    ((do0) childAt).a.a(false, true);
                }
            }
            AndroidUtilities.runOnUIThread(new org.telegram.ui.k6(chatActivityEnterView, mu0Var2, iArr, do0Var, 17), isSelected ? 0L : 200L);
            return;
        }
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (veVar.B == null) {
            veVar.B = new bo0(veVar, context);
        }
        jg0 jg0Var = veVar.C;
        if (jg0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(jg0Var);
        }
        if (veVar.B.getParent() == null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.height = -1;
            layoutParams.width = -1;
            layoutParams.format = -3;
            layoutParams.type = 99;
            int i11 = Build.VERSION.SDK_INT;
            layoutParams.flags |= TLObject.FLAG_31;
            if (i11 >= 28) {
                layoutParams.layoutInDisplayCutoutMode = 1;
            }
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, veVar.B, layoutParams);
            windowManager.addView(veVar.B, layoutParams);
        }
        if (qnVar != null) {
            bo0 bo0Var = veVar.B;
            org.telegram.ui.on onVar = qnVar.aa;
            jg0 jg0Var2 = new jg0(9, veVar, qnVar);
            un0 un0Var = new un0(context, onVar);
            Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
            o9 o9Var = un0Var.a;
            o9Var.setImageDrawable(drawable);
            o9Var.setColorFilter(new PorterDuffColorFilter(un0Var.getThemedColor(org.telegram.ui.ActionBar.f6.Hi), PorterDuff.Mode.SRC_IN));
            un0Var.b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
            ec ecVar = new ec(context, onVar, true);
            ecVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
            ecVar.a = jg0Var2;
            un0Var.setButton(ecVar);
            gc f10 = gc.f(bo0Var, un0Var, 1500);
            f10.e.addCallback(new co0(veVar, f10));
            f10.j();
        }
        jg0 jg0Var3 = new jg0(10, veVar, windowManager);
        veVar.C = jg0Var3;
        AndroidUtilities.runOnUIThread(jg0Var3, 2500L);
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public void dismiss() {
        if (this.A) {
            return;
        }
        bo0 bo0Var = this.B;
        if (bo0Var != null && bo0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new fg.j(29, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.j... jVarArr) {
        yn0 yn0Var = this.o;
        fh.d2 d2Var = this.t;
        ArrayList arrayList = this.z;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList2.get(i9);
            i9++;
            ((o1.j) obj).c();
        }
        arrayList.clear();
        d2Var.setPivotX(AndroidUtilities.dp(8.0f));
        d2Var.setPivotY(d2Var.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
        yn0Var.setPivotX(0.0f);
        yn0Var.setPivotY(0.0f);
        d2Var.setScaleX(1.0f);
        d2Var.setScaleY(1.0f);
        yn0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.j jVar = new o1.j(d2Var, o1.h.o);
        jVar.u = org.telegram.ui.Cells.j2.i(0.25f, 750.0f, 1.0f);
        jVar.b(new vn0(this, 0));
        o1.j jVar2 = new o1.j(d2Var, o1.h.p);
        jVar2.u = org.telegram.ui.Cells.j2.i(0.25f, 750.0f, 1.0f);
        jVar2.b(new vn0(this, 1));
        o1.c cVar = o1.h.t;
        o1.j jVar3 = new o1.j(d2Var, cVar);
        jVar3.u = org.telegram.ui.Cells.j2.i(0.0f, 750.0f, 1.0f);
        o1.j jVar4 = new o1.j(yn0Var, cVar);
        jVar4.u = org.telegram.ui.Cells.j2.i(0.25f, 750.0f, 1.0f);
        int i10 = 2;
        arrayList3.addAll(Arrays.asList(jVar, jVar2, jVar3, jVar4));
        for (o1.j jVar5 : jVarArr) {
            if (jVar5 != null) {
                arrayList3.add(jVar5);
            }
        }
        this.q = jVarArr.length > 0;
        ((o1.j) arrayList3.get(0)).a(new ya(this, i10));
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            o1.j jVar6 = (o1.j) obj2;
            arrayList.add(jVar6);
            jVar6.a(new wn0(this, jVar6, 0));
            jVar6.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void showAtLocation(View view, int i9, int i10, int i11) {
        this.E = i10;
        this.F = i11;
        super.showAtLocation(view, i9, i10, i11);
    }
}
