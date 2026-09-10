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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class fp0 extends org.telegram.ui.ActionBar.p1 {
    public boolean A;
    public cp0 B;
    public yo0 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public zo0 o;
    public TextView p;
    public boolean q;
    public TLRPC.Peer r;
    public TLRPC.TL_channels_sendAsPeers s;
    public bi.ld t;
    public View u;
    public vl0 v;
    public s4.c0 w;
    public Boolean x;
    public boolean y;
    public ArrayList z;

    public static void k(ff ffVar, List list, Context context, org.telegram.ui.eo eoVar, boolean z10, androidx.car.app.utils.a aVar, View view, int i10) {
        TLRPC.User user;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i10);
        if (ffVar.y) {
            return;
        }
        if (!tL_sendAsPeer.premium_required || UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
            ffVar.y = true;
            vl0 vl0Var = ffVar.v;
            ep0 ep0Var = (ep0) view;
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
            chatActivityEnterView.P1(true);
            qg qgVar = chatActivityEnterView.Y2;
            if (qgVar == null || !qgVar.e1(DialogObject.getPeerDialogId(peer))) {
                messagesController.setDefaultSendAs(chatActivityEnterView.P2, DialogObject.getPeerDialogId(peer));
            }
            int[] iArr = new int[2];
            pv0 pv0Var = ep0Var.a;
            boolean isSelected = pv0Var.isSelected();
            pv0Var.getLocationInWindow(iArr);
            pv0Var.a(true, true);
            pv0 pv0Var2 = new pv0(chatActivityEnterView.getContext());
            long j3 = peer.channel_id;
            if (j3 != 0) {
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
                if (chat != null) {
                    pv0Var2.setAvatar(chat);
                }
            } else {
                long j10 = peer.user_id;
                if (j10 != 0 && (user = messagesController.getUser(Long.valueOf(j10))) != null) {
                    pv0Var2.setAvatar(user);
                }
            }
            for (int i11 = 0; i11 < vl0Var.getChildCount(); i11++) {
                View childAt = vl0Var.getChildAt(i11);
                if ((childAt instanceof ep0) && childAt != ep0Var) {
                    ((ep0) childAt).a.a(false, true);
                }
            }
            AndroidUtilities.runOnUIThread(new org.telegram.ui.da(chatActivityEnterView, pv0Var2, iArr, ep0Var, 14), isSelected ? 0L : 200L);
            return;
        }
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (ffVar.B == null) {
            ffVar.B = new cp0(ffVar, context);
        }
        yo0 yo0Var = ffVar.C;
        if (yo0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(yo0Var);
        }
        if (ffVar.B.getParent() == null) {
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
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, ffVar.B, layoutParams);
            windowManager.addView(ffVar.B, layoutParams);
        }
        if (eoVar != null) {
            cp0 cp0Var = ffVar.B;
            org.telegram.ui.bo boVar = eoVar.ea;
            yo0 yo0Var2 = new yo0(0, ffVar, eoVar);
            uo0 uo0Var = new uo0(context, boVar);
            Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
            w9 w9Var = uo0Var.a;
            w9Var.setImageDrawable(drawable);
            w9Var.setColorFilter(new PorterDuffColorFilter(uo0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Hi), PorterDuff.Mode.SRC_IN));
            uo0Var.b.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SelectSendAsPeerPremiumHint)));
            nc ncVar = new nc(context, boVar, true);
            ncVar.e(LocaleController.getString(R.string.SelectSendAsPeerPremiumOpen));
            ncVar.a = yo0Var2;
            uo0Var.setButton(ncVar);
            pc f7 = pc.f(cp0Var, uo0Var, 1500);
            f7.e.addCallback(new dp0(ffVar, f7));
            f7.j();
        }
        yo0 yo0Var3 = new yo0(1, ffVar, windowManager);
        ffVar.C = yo0Var3;
        AndroidUtilities.runOnUIThread(yo0Var3, 2500L);
    }

    @Override // org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
    public void dismiss() {
        if (this.A) {
            return;
        }
        cp0 cp0Var = this.B;
        if (cp0Var != null && cp0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new bi.u3(29, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(o1.k... kVarArr) {
        zo0 zo0Var = this.o;
        bi.ld ldVar = this.t;
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
        ldVar.setPivotX(AndroidUtilities.dp(8.0f));
        ldVar.setPivotY(ldVar.getMeasuredHeight() - AndroidUtilities.dp(8.0f));
        zo0Var.setPivotX(0.0f);
        zo0Var.setPivotY(0.0f);
        ldVar.setScaleX(1.0f);
        ldVar.setScaleY(1.0f);
        zo0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        o1.k kVar = new o1.k(ldVar, o1.h.o);
        kVar.u = org.telegram.ui.Cells.r6.l(0.25f, 750.0f, 1.0f);
        kVar.b(new vo0(this, 0));
        o1.k kVar2 = new o1.k(ldVar, o1.h.p);
        kVar2.u = org.telegram.ui.Cells.r6.l(0.25f, 750.0f, 1.0f);
        kVar2.b(new vo0(this, 1));
        o1.c cVar = o1.h.t;
        o1.k kVar3 = new o1.k(ldVar, cVar);
        kVar3.u = org.telegram.ui.Cells.r6.l(0.0f, 750.0f, 1.0f);
        o1.k kVar4 = new o1.k(zo0Var, cVar);
        kVar4.u = org.telegram.ui.Cells.r6.l(0.25f, 750.0f, 1.0f);
        int i11 = 2;
        arrayList3.addAll(Arrays.asList(kVar, kVar2, kVar3, kVar4));
        for (o1.k kVar5 : kVarArr) {
            if (kVar5 != null) {
                arrayList3.add(kVar5);
            }
        }
        this.q = kVarArr.length > 0;
        ((o1.k) arrayList3.get(0)).a(new gb(this, i11));
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            o1.k kVar6 = (o1.k) obj2;
            arrayList.add(kVar6);
            kVar6.a(new wo0(this, kVar6, 0));
            kVar6.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
    public final void showAtLocation(View view, int i10, int i11, int i12) {
        this.E = i11;
        this.F = i12;
        super.showAtLocation(view, i10, i11, i12);
    }
}
