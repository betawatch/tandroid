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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class cn0 extends org.telegram.ui.ActionBar.g1 {
    public boolean A;
    public zm0 B;
    public w80 C;
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public wm0 o;
    public TextView p;
    public boolean q;
    public TLRPC.Peer r;
    public TLRPC.TL_channels_sendAsPeers s;
    public bi.e5 t;
    public View u;
    public qj0 v;
    public v4.b0 w;
    public Boolean x;
    public boolean y;
    public ArrayList z;

    public static void k(ne neVar, List list, Context context, org.telegram.ui.cn cnVar, a3.h hVar, View view, int i7) {
        TLRPC.User a22;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) list.get(i7);
        if (neVar.y) {
            return;
        }
        if (tL_sendAsPeer.premium_required && !org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q()) {
            try {
                view.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (neVar.B == null) {
                neVar.B = new zm0(neVar, context);
            }
            w80 w80Var = neVar.C;
            if (w80Var != null) {
                org.telegram.messenger.g0.r(w80Var);
            }
            if (neVar.B.getParent() == null) {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.height = -1;
                layoutParams.width = -1;
                layoutParams.format = -3;
                layoutParams.type = 99;
                int i10 = Build.VERSION.SDK_INT;
                layoutParams.flags |= TLObject.FLAG_31;
                if (i10 >= 28) {
                    layoutParams.layoutInDisplayCutoutMode = 1;
                }
                org.telegram.messenger.g0.y3(windowManager, neVar.B, layoutParams);
                windowManager.addView(neVar.B, layoutParams);
            }
            if (cnVar != null) {
                zm0 zm0Var = neVar.B;
                org.telegram.ui.an anVar = cnVar.za;
                w80 w80Var2 = new w80(10, neVar, cnVar);
                sm0 sm0Var = new sm0(context, anVar);
                Drawable drawable = context.getDrawable(R.drawable.msg_premium_prolfilestar);
                l9 l9Var = sm0Var.a;
                l9Var.setImageDrawable(drawable);
                int themedColor = sm0Var.getThemedColor(org.telegram.ui.ActionBar.l6.vj);
                sm0Var.c = themedColor;
                l9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                sm0Var.b.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131745655, null)));
                ac acVar = new ac(context, anVar, true);
                acVar.e(org.telegram.messenger.id.M0(2131745654, null));
                acVar.b = w80Var2;
                sm0Var.setButton(acVar);
                cc f10 = cc.f(zm0Var, sm0Var, 1500);
                f10.e.addCallback(new an0(neVar, f10));
                f10.j();
            }
            w80 w80Var3 = new w80(11, neVar, windowManager);
            neVar.C = w80Var3;
            org.telegram.messenger.g0.i3(w80Var3, 2500L);
            return;
        }
        neVar.y = true;
        qj0 qj0Var = neVar.v;
        bn0 bn0Var = (bn0) view;
        TLRPC.Peer peer = tL_sendAsPeer.peer;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) hVar.c;
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) hVar.b;
        org.telegram.messenger.qp qpVar = (org.telegram.messenger.qp) hVar.d;
        if (chatActivityEnterView.q0 == null) {
            return;
        }
        if (chatFull != null) {
            chatFull.default_send_as = peer;
        }
        chatActivityEnterView.R1(true);
        wf wfVar = chatActivityEnterView.Z2;
        if (wfVar == null || !wfVar.V0(org.telegram.messenger.m5.o(peer))) {
            long j3 = chatActivityEnterView.Q2;
            long o4 = org.telegram.messenger.m5.o(peer);
            TLRPC.ChatFull N0 = qpVar.N0(-j3);
            if (N0 != null) {
                N0.default_send_as = qpVar.z1(o4);
                qpVar.getMessagesStorage().N1(N0, false);
                qpVar.getNotificationCenter().k(org.telegram.messenger.qs.G, Long.valueOf(j3), N0.default_send_as);
            }
            TLRPC.TL_messages_saveDefaultSendAs tL_messages_saveDefaultSendAs = new TLRPC.TL_messages_saveDefaultSendAs();
            tL_messages_saveDefaultSendAs.peer = qpVar.j1(j3);
            tL_messages_saveDefaultSendAs.send_as = qpVar.j1(o4);
            qpVar.getConnectionsManager().sendRequest(tL_messages_saveDefaultSendAs, new org.telegram.messenger.pj(qpVar, j3, 17), 64);
        }
        int[] iArr = new int[2];
        kt0 kt0Var = bn0Var.a;
        boolean isSelected = kt0Var.isSelected();
        kt0Var.getLocationInWindow(iArr);
        kt0Var.a(true, true);
        kt0 kt0Var2 = new kt0(chatActivityEnterView.getContext());
        long j10 = peer.channel_id;
        if (j10 != 0) {
            TLRPC.Chat M0 = qpVar.M0(Long.valueOf(j10));
            if (M0 != null) {
                kt0Var2.setAvatar(M0);
            }
        } else {
            long j11 = peer.user_id;
            if (j11 != 0 && (a22 = qpVar.a2(Long.valueOf(j11))) != null) {
                kt0Var2.setAvatar(a22);
            }
        }
        for (int i11 = 0; i11 < qj0Var.getChildCount(); i11++) {
            View childAt = qj0Var.getChildAt(i11);
            if ((childAt instanceof bn0) && childAt != bn0Var) {
                ((bn0) childAt).a.a(false, true);
            }
        }
        org.telegram.messenger.g0.i3(new org.telegram.ui.m6(chatActivityEnterView, kt0Var2, iArr, bn0Var, 17), isSelected ? 0L : 200L);
    }

    @Override // org.telegram.ui.ActionBar.g1, android.widget.PopupWindow
    public void dismiss() {
        if (this.A) {
            return;
        }
        zm0 zm0Var = this.B;
        if (zm0Var != null && zm0Var.getAlpha() == 1.0f) {
            this.B.animate().alpha(0.0f).setDuration(150L).setListener(new w50(4, this, (WindowManager) this.B.getContext().getSystemService("window")));
        }
        this.A = true;
        d(true);
    }

    public final void l(r1.g... gVarArr) {
        wm0 wm0Var = this.o;
        bi.e5 e5Var = this.t;
        ArrayList arrayList = this.z;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            ((r1.g) obj).d();
        }
        arrayList.clear();
        e5Var.setPivotX(org.telegram.messenger.g0.L(8.0f));
        e5Var.setPivotY(e5Var.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f));
        wm0Var.setPivotX(0.0f);
        wm0Var.setPivotY(0.0f);
        e5Var.setScaleX(1.0f);
        e5Var.setScaleY(1.0f);
        wm0Var.setAlpha(1.0f);
        ArrayList arrayList3 = new ArrayList();
        r1.g gVar = new r1.g(e5Var, r1.g.q);
        gVar.m = org.telegram.ui.Cells.f1.o(0.25f, 750.0f, 1.0f);
        gVar.b(new tm0(this, 0));
        r1.g gVar2 = new r1.g(e5Var, r1.g.r);
        gVar2.m = org.telegram.ui.Cells.f1.o(0.25f, 750.0f, 1.0f);
        gVar2.b(new tm0(this, 1));
        r1.b bVar = r1.g.v;
        r1.g gVar3 = new r1.g(e5Var, bVar);
        gVar3.m = org.telegram.ui.Cells.f1.o(0.0f, 750.0f, 1.0f);
        r1.g gVar4 = new r1.g(wm0Var, bVar);
        gVar4.m = org.telegram.ui.Cells.f1.o(0.25f, 750.0f, 1.0f);
        int i10 = 3;
        arrayList3.addAll(Arrays.asList(gVar, gVar2, gVar3, gVar4));
        for (r1.g gVar5 : gVarArr) {
            if (gVar5 != null) {
                arrayList3.add(gVar5);
            }
        }
        this.q = gVarArr.length > 0;
        ((r1.g) arrayList3.get(0)).a(new ta(this, i10));
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            r1.g gVar6 = (r1.g) obj2;
            arrayList.add(gVar6);
            gVar6.a(new um0(this, gVar6, 0));
            gVar6.h();
        }
    }

    @Override // org.telegram.ui.ActionBar.g1, android.widget.PopupWindow
    public final void showAtLocation(View view, int i7, int i10, int i11) {
        this.E = i10;
        this.F = i11;
        super.showAtLocation(view, i7, i10, i11);
    }
}
