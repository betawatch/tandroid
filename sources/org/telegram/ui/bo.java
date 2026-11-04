package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bo extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public LinearLayout E;
    public LinearLayout F;
    public LinearLayout G;
    public org.telegram.ui.Components.m70 H;
    public org.telegram.ui.Cells.l8 I;
    public org.telegram.ui.Cells.y8 J;
    public org.telegram.ui.Cells.x6 K;
    public ao L;
    public boolean M;
    public ArrayList N;
    public ArrayList O;
    public ha P;
    public ArrayList Q;
    public LinearLayout R;
    public org.telegram.ui.Cells.n4 S;
    public org.telegram.ui.Cells.q8 T;
    public org.telegram.ui.Cells.y8 U;
    public xn V;
    public boolean W;
    public boolean X;
    public TLRPC.Chat Y;
    public TLRPC.ChatFull Z;
    public tn a;
    public long a0;
    public bh.g b;
    public boolean b0;
    public EditTextBoldCursor c;
    public boolean c0;
    public org.telegram.ui.Cells.y8 d;
    public boolean d0;
    public org.telegram.ui.Cells.n4 e;
    public boolean e0;
    public org.telegram.ui.Cells.n4 f;
    public org.telegram.ui.Cells.x6 f0;
    public ArrayList g0;
    public vn h;
    public org.telegram.ui.Cells.t4 h0;
    public int i0;
    public String j0;
    public sc k0;
    public boolean l0;
    public TLRPC.TL_chatInviteExported m0;
    public org.telegram.ui.Components.jm0 n;
    public boolean n0;
    public boolean o0;
    public HashMap p0;
    public org.telegram.ui.Components.i50 q0;
    public org.telegram.ui.ActionBar.b5 r;
    public nn r0;
    public LinearLayout s;
    public Boolean s0;
    public boolean t0;
    public org.telegram.ui.Cells.g6 w;
    public org.telegram.ui.Cells.g6 x;
    public LinearLayout y;

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
    }

    public final void b0() {
        boolean z10;
        org.telegram.ui.ActionBar.b5 b5Var = this.r;
        if (!this.W && this.b.length() <= 0) {
            ArrayList arrayList = this.O;
            z10 = false;
            if (arrayList != null) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i3);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            b5Var.a(z10, true);
        }
        z10 = true;
        b5Var.a(z10, true);
    }

    public final boolean c0(String str) {
        if (str == null || str.length() <= 0) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
        }
        sc scVar = this.k0;
        if (scVar != null) {
            org.telegram.messenger.g0.r(scVar);
            this.k0 = null;
            this.j0 = null;
            if (this.i0 != 0) {
                getConnectionsManager().cancelRequest(this.i0, true);
            }
        }
        this.l0 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                this.h.setText(org.telegram.messenger.bd.M0(2131748917, null));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.p7);
                return false;
            }
            for (int i3 = 0; i3 < str.length(); i3++) {
                char charAt = str.charAt(i3);
                if (i3 == 0 && charAt >= '0' && charAt <= '9') {
                    if (this.b0) {
                        this.h.setText(org.telegram.messenger.bd.M0(2131748913, null));
                    } else {
                        this.h.setText(org.telegram.messenger.bd.M0(2131748912, null));
                    }
                    this.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.p7);
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.h.setText(org.telegram.messenger.bd.M0(2131748917, null));
                    this.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.p7);
                    return false;
                }
            }
        }
        if (str == null || str.length() < 4) {
            if (this.b0) {
                this.h.setText(org.telegram.messenger.bd.M0(2131748915, null));
            } else {
                this.h.setText(org.telegram.messenger.bd.M0(2131748914, null));
            }
            this.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.p7);
            return false;
        }
        if (str.length() > 32) {
            this.h.setText(org.telegram.messenger.bd.M0(2131748916, null));
            this.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.p7);
            return false;
        }
        this.h.setText(org.telegram.messenger.bd.M0(2131748930, null));
        this.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.F6);
        this.j0 = str;
        sc scVar2 = new sc(25, this, str);
        this.k0 = scVar2;
        org.telegram.messenger.g0.i3(scVar2, 300L);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        int i3 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new sn(this, context));
        this.r = this.simpleActionBar.n(org.telegram.messenger.bd.M0(2131745956, null));
        this.n = new org.telegram.ui.Components.jm0(context);
        this.a = new tn(this, context, this.n, this.resourceProvider);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(this.a, b8.mf.g());
        this.fragmentView = frameLayout;
        this.a.setFillViewport(true);
        this.a.setDrawBackground(true);
        this.a.setOverScrollMode(0);
        this.a.addView(this.n, new FrameLayout.LayoutParams(-1, -2));
        this.n.setOrientation(1);
        boolean z10 = this.o0;
        if (z10) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131743940, null));
        } else if (this.b0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752297, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131749408, null));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.s = linearLayout;
        linearLayout.setOrientation(1);
        this.n.addView(this.s, b8.mf.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, 23);
        this.f = n4Var;
        n4Var.setHeight(46);
        if (this.b0) {
            this.f.setText(org.telegram.messenger.bd.M0(2131752275, null));
        } else {
            this.f.setText(org.telegram.messenger.bd.M0(2131749399, null));
        }
        this.s.addView(this.f);
        org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(context, false);
        this.x = g6Var;
        if (this.b0) {
            g6Var.b(org.telegram.messenger.bd.M0(2131752329, null), org.telegram.messenger.bd.M0(2131752328, null), false, this.W);
        } else {
            g6Var.b(org.telegram.messenger.bd.M0(2131748649, null), org.telegram.messenger.bd.M0(2131748648, null), false, this.W);
        }
        this.s.addView(this.x, b8.mf.o(-1, -2));
        this.x.setOnClickListener(new qn(this, i3));
        org.telegram.ui.Cells.g6 g6Var2 = new org.telegram.ui.Cells.g6(context, false);
        this.w = g6Var2;
        if (this.b0) {
            g6Var2.b(org.telegram.messenger.bd.M0(2131752318, null), org.telegram.messenger.bd.M0(2131752315, null), false, !this.W);
        } else {
            g6Var2.b(org.telegram.messenger.bd.M0(2131748646, null), org.telegram.messenger.bd.M0(2131748645, null), false, !this.W);
        }
        this.s.addView(this.w, b8.mf.o(-1, -2));
        this.w.setOnClickListener(new qn(this, 2));
        org.telegram.ui.Cells.x6 x6Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
        this.K = x6Var;
        this.n.addView(x6Var, b8.mf.o(-1, -2));
        if (z10) {
            this.x.setVisibility(8);
            this.w.setVisibility(8);
            this.K.setVisibility(8);
            this.f.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.n.addView(this.E, b8.mf.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context, 23);
        this.e = n4Var2;
        this.E.addView(n4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.F = linearLayout3;
        linearLayout3.setOrientation(0);
        this.E.addView(this.F, b8.mf.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().V2 + "/");
        this.c.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.c;
        int i10 = org.telegram.ui.ActionBar.k6.H6;
        org.telegram.ui.ActionBar.r6.E(editTextBoldCursor2, i10, null);
        EditTextBoldCursor editTextBoldCursor3 = this.c;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor3, i11, null);
        this.c.setMaxLines(1);
        this.c.setLines(1);
        this.c.setEnabled(false);
        this.c.setBackground(null);
        this.c.setPadding(0, 0, 0, 0);
        this.c.setSingleLine(true);
        this.c.setInputType(163840);
        this.c.setImeOptions(6);
        this.F.addView(this.c, b8.mf.o(-2, 36));
        bh.g gVar = new bh.g(5, context, this);
        this.b = gVar;
        gVar.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.E(this.b, i10, null);
        org.telegram.ui.ActionBar.r6.V(this.b, i11, null);
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setBackground(null);
        this.b.setPadding(0, 0, 0, 0);
        this.b.setSingleLine(true);
        this.b.setInputType(163872);
        this.b.setImeOptions(6);
        this.b.setHint(org.telegram.messenger.bd.M0(2131752266, null));
        org.telegram.ui.ActionBar.r6.w(this.b, i11, null);
        this.b.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.b.setCursorWidth(1.5f);
        this.F.addView(this.b, b8.mf.o(-1, 36));
        this.b.addTextChangedListener(new n0(this, 4));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.G = linearLayout4;
        linearLayout4.setOrientation(1);
        this.E.addView(this.G, b8.mf.o(-1, -2));
        org.telegram.ui.Components.m70 m70Var = new org.telegram.ui.Components.m70(context, this, null, true, org.telegram.messenger.t3.T(this.Y));
        this.H = m70Var;
        m70Var.setDelegate(new un(this, context));
        this.H.d(0, null, false);
        this.G.addView(this.H);
        vn vnVar = new vn(this, context, this.resourceProvider);
        this.h = vnVar;
        vnVar.setBottomPadding(6);
        this.n.addView(this.h, b8.mf.o(-2, -2));
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
        this.d = y8Var;
        y8Var.setImportantForAccessibility(1);
        this.n.addView(this.d, b8.mf.o(-1, -2));
        org.telegram.ui.Cells.t4 t4Var = new org.telegram.ui.Cells.t4(context);
        this.h0 = t4Var;
        this.n.addView(t4Var, b8.mf.o(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.y = linearLayout5;
        linearLayout5.setOrientation(1);
        this.n.addView(this.y, b8.mf.o(-1, -2));
        org.telegram.ui.Cells.x6 x6Var2 = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
        this.f0 = x6Var2;
        this.n.addView(x6Var2, b8.mf.o(-1, -2));
        org.telegram.ui.Components.jm0 jm0Var = this.n;
        ao aoVar = new ao(this, context);
        this.L = aoVar;
        jm0Var.addView(aoVar, b8.mf.o(-1, -2));
        this.L.setVisibility((this.W || this.O.isEmpty()) ? 8 : 0);
        org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(context);
        this.I = l8Var;
        l8Var.o(R.drawable.msg_link2, org.telegram.messenger.bd.M0(2131748703, null), false);
        this.I.setOnClickListener(new qn(this, 3));
        this.n.addView(this.I, b8.mf.o(-1, -2));
        org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
        this.J = y8Var2;
        this.n.addView(y8Var2, b8.mf.o(-1, -2));
        xn xnVar = new xn(this, context, this.Y, context);
        this.V = xnVar;
        TLRPC.ChatFull chatFull = this.Z;
        xnVar.c((chatFull == null || chatFull.linked_chat_id == 0 || this.b0) ? false : true);
        xn xnVar2 = this.V;
        TLRPC.ChatFull chatFull2 = this.Z;
        org.telegram.ui.Cells.y8 y8Var3 = xnVar2.e;
        boolean V = org.telegram.messenger.t3.V(xnVar2.n);
        boolean t02 = org.telegram.messenger.t3.t0(xnVar2.n);
        if (chatFull2 == null || chatFull2.guard_bot_id == 0) {
            y8Var3.setText(org.telegram.messenger.bd.M0(V ? 2131752302 : t02 ? 2131749411 : 2131749414, null));
        } else {
            y8Var3.setText(org.telegram.messenger.g0.Q2(org.telegram.messenger.bd.a0(null, null, V ? 2131752301 : t02 ? 2131749410 : 2131749413, "@" + org.telegram.messenger.m5.r(org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).a2(Long.valueOf(chatFull2.guard_bot_id)))), org.telegram.ui.ActionBar.k6.Wl, null, new org.telegram.ui.Components.j50(i3, chatFull2, this), false));
        }
        this.n.addView(this.V);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.R = linearLayout6;
        linearLayout6.setOrientation(1);
        this.n.addView(this.R);
        org.telegram.ui.Cells.n4 n4Var3 = new org.telegram.ui.Cells.n4(context, 23);
        this.S = n4Var3;
        n4Var3.setHeight(46);
        this.S.setText(org.telegram.messenger.bd.M0(2131745873, null));
        this.R.addView(this.S, b8.mf.o(-1, -2));
        org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context);
        this.T = q8Var;
        q8Var.f(org.telegram.messenger.bd.M0(2131746072, null), this.c0, false);
        this.T.setOnClickListener(new qn(this, 4));
        this.R.addView(this.T, b8.mf.o(-1, -2));
        this.U = new org.telegram.ui.Cells.y8(12, context, this.resourceProvider);
        if (!this.b0 || org.telegram.messenger.t3.n0(this.Y)) {
            this.U.setText(org.telegram.messenger.bd.M0(2131746070, null));
        } else {
            this.U.setText(org.telegram.messenger.bd.M0(2131746071, null));
        }
        this.R.addView(this.U, b8.mf.o(-1, -2));
        String K = org.telegram.messenger.t3.K(this.Y, true);
        if (!this.W && K != null) {
            this.n0 = true;
            this.b.setText(K);
            this.b.setSelection(K.length());
            this.n0 = false;
        }
        h0();
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().j1(-this.a0);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new gi.b3(5, this, z10)), this.classGuid);
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.a0) {
                this.Z = chatFull;
                this.m0 = chatFull.exported_invite;
                h0();
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.y1) {
            if ((-this.a0) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
                if (q4Var == null || q4Var.getLastFragment() != this) {
                    removeSelfFromStack();
                } else {
                    finishFragment();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e0() {
        boolean z10;
        boolean z11;
        ArrayList<TLRPC.TL_username> arrayList;
        boolean z12;
        final bo boVar = this;
        org.telegram.messenger.g0.i3(boVar.r0, 200L);
        boolean z13 = true;
        if (boVar.getParentActivity() != null) {
            String K = org.telegram.messenger.t3.K(boVar.Y, true);
            if (boVar.W || (((K != null || boVar.b.length() == 0) && (K == null || K.equalsIgnoreCase(boVar.b.getText().toString()))) || boVar.b.length() == 0 || boVar.l0)) {
                if (K == null) {
                    K = "";
                }
                String obj = boVar.W ? "" : boVar.b.getText().toString();
                if (K.equals(obj)) {
                    if (!boVar.W || (arrayList = boVar.Y.usernames) == null || arrayList.isEmpty()) {
                        z10 = true;
                    } else if (boVar.t0) {
                        z10 = false;
                    } else {
                        boVar.t0 = true;
                        boolean z14 = false;
                        for (int i3 = 0; i3 < boVar.Y.usernames.size(); i3++) {
                            TLRPC.TL_username tL_username = boVar.Y.usernames.get(i3);
                            if (tL_username != null && tL_username.active && !tL_username.editable) {
                                z14 = true;
                            }
                        }
                        if (z14) {
                            TLRPC.TL_channels_deactivateAllUsernames tL_channels_deactivateAllUsernames = new TLRPC.TL_channels_deactivateAllUsernames();
                            tL_channels_deactivateAllUsernames.channel = org.telegram.messenger.hp.i1(boVar.Y);
                            boVar.getConnectionsManager().sendRequest(tL_channels_deactivateAllUsernames, new mn(boVar, 2));
                        } else {
                            boVar.t0 = false;
                        }
                        z10 = !z14;
                    }
                    if (z10) {
                        z11 = true;
                        if (z11) {
                            return;
                        }
                        TLRPC.Chat chat = boVar.Y;
                        if (chat.noforwards != boVar.c0) {
                            if (!org.telegram.messenger.t3.T(chat)) {
                                boVar.g0(true);
                                final int i10 = 2;
                                boVar.getMessagesController().T(boVar.getParentActivity(), boVar.a0, boVar, new org.telegram.messenger.lr(boVar) { // from class: org.telegram.ui.on
                                    public final /* synthetic */ bo b;

                                    {
                                        this.b = boVar;
                                    }

                                    @Override // org.telegram.messenger.lr
                                    public final void run(long j10) {
                                        switch (i10) {
                                            case 0:
                                                bo boVar2 = this.b;
                                                if (j10 == 0) {
                                                    boVar2.getClass();
                                                    break;
                                                } else {
                                                    boVar2.a0 = j10;
                                                    boVar2.Y = boVar2.getMessagesController().M0(Long.valueOf(j10));
                                                    boVar2.e0();
                                                    break;
                                                }
                                            case 1:
                                                bo boVar3 = this.b;
                                                if (j10 == 0) {
                                                    boVar3.getClass();
                                                    break;
                                                } else {
                                                    boVar3.a0 = j10;
                                                    boVar3.Y = boVar3.getMessagesController().M0(Long.valueOf(j10));
                                                    boVar3.e0();
                                                    break;
                                                }
                                            default:
                                                if (j10 != 0) {
                                                    bo boVar4 = this.b;
                                                    boVar4.a0 = j10;
                                                    boVar4.Y = boVar4.getMessagesController().M0(Long.valueOf(j10));
                                                    org.telegram.messenger.hp messagesController = boVar4.getMessagesController();
                                                    long j11 = -boVar4.a0;
                                                    TLRPC.Chat chat2 = boVar4.Y;
                                                    boolean z15 = boVar4.c0;
                                                    chat2.noforwards = z15;
                                                    messagesController.d5(j11, 0, z15, null);
                                                    boVar4.e0();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                }, null);
                                z12 = false;
                                if (z12) {
                                    return;
                                }
                                if (boVar.V != null) {
                                    if (boVar.getParentActivity() != null) {
                                        if (!boVar.b0 && !org.telegram.messenger.t3.T(boVar.Y)) {
                                            xn xnVar = boVar.V;
                                            if (xnVar.f || xnVar.h) {
                                                final int i11 = 0;
                                                boVar.getMessagesController().T(boVar.getParentActivity(), boVar.a0, boVar, new org.telegram.messenger.lr(boVar) { // from class: org.telegram.ui.on
                                                    public final /* synthetic */ bo b;

                                                    {
                                                        this.b = boVar;
                                                    }

                                                    @Override // org.telegram.messenger.lr
                                                    public final void run(long j10) {
                                                        switch (i11) {
                                                            case 0:
                                                                bo boVar2 = this.b;
                                                                if (j10 == 0) {
                                                                    boVar2.getClass();
                                                                    break;
                                                                } else {
                                                                    boVar2.a0 = j10;
                                                                    boVar2.Y = boVar2.getMessagesController().M0(Long.valueOf(j10));
                                                                    boVar2.e0();
                                                                    break;
                                                                }
                                                            case 1:
                                                                bo boVar3 = this.b;
                                                                if (j10 == 0) {
                                                                    boVar3.getClass();
                                                                    break;
                                                                } else {
                                                                    boVar3.a0 = j10;
                                                                    boVar3.Y = boVar3.getMessagesController().M0(Long.valueOf(j10));
                                                                    boVar3.e0();
                                                                    break;
                                                                }
                                                            default:
                                                                if (j10 != 0) {
                                                                    bo boVar4 = this.b;
                                                                    boVar4.a0 = j10;
                                                                    boVar4.Y = boVar4.getMessagesController().M0(Long.valueOf(j10));
                                                                    org.telegram.messenger.hp messagesController = boVar4.getMessagesController();
                                                                    long j11 = -boVar4.a0;
                                                                    TLRPC.Chat chat2 = boVar4.Y;
                                                                    boolean z15 = boVar4.c0;
                                                                    chat2.noforwards = z15;
                                                                    messagesController.d5(j11, 0, z15, null);
                                                                    boVar4.e0();
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                }, null);
                                            }
                                        }
                                        if (boVar.Y.join_to_send != boVar.V.f) {
                                            org.telegram.messenger.hp messagesController = boVar.getMessagesController();
                                            long j10 = boVar.a0;
                                            TLRPC.Chat chat2 = boVar.Y;
                                            boolean z15 = boVar.V.f;
                                            chat2.join_to_send = z15;
                                            messagesController.getClass();
                                            TLRPC.TL_channels_toggleJoinToSend tL_channels_toggleJoinToSend = new TLRPC.TL_channels_toggleJoinToSend();
                                            tL_channels_toggleJoinToSend.channel = messagesController.h1(j10);
                                            tL_channels_toggleJoinToSend.enabled = z15;
                                            Object obj2 = null;
                                            messagesController.getConnectionsManager().sendRequest(tL_channels_toggleJoinToSend, new org.telegram.messenger.uh(messagesController, obj2, obj2, 8), 64);
                                        }
                                        if (boVar.Y.join_request != boVar.V.h || boVar.X) {
                                            org.telegram.messenger.hp messagesController2 = boVar.getMessagesController();
                                            long j11 = boVar.a0;
                                            TLRPC.Chat chat3 = boVar.Y;
                                            boolean z16 = boVar.V.h;
                                            chat3.join_request = z16;
                                            messagesController2.c5(j11, 0L, z16, boVar.X, false, null, null);
                                        }
                                    }
                                    z13 = false;
                                }
                                if (z13) {
                                    boVar.finishFragment();
                                    return;
                                }
                                return;
                            }
                            org.telegram.messenger.hp messagesController3 = boVar.getMessagesController();
                            long j12 = -boVar.a0;
                            TLRPC.Chat chat4 = boVar.Y;
                            boolean z17 = boVar.c0;
                            chat4.noforwards = z17;
                            messagesController3.d5(j12, 0, z17, null);
                        }
                        z12 = true;
                        if (z12) {
                        }
                    }
                } else if (org.telegram.messenger.t3.T(boVar.Y)) {
                    org.telegram.messenger.hp messagesController4 = boVar.getMessagesController();
                    long j13 = boVar.a0;
                    nn nnVar = new nn(boVar, 1);
                    nn nnVar2 = new nn(boVar, 2);
                    messagesController4.getClass();
                    TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                    tL_channels_updateUsername.channel = messagesController4.h1(j13);
                    tL_channels_updateUsername.username = obj;
                    boVar = this;
                    messagesController4.getConnectionsManager().sendRequest(tL_channels_updateUsername, new org.telegram.messenger.cm(messagesController4, j13, obj, nnVar, this, tL_channels_updateUsername, nnVar2), 64);
                } else {
                    final int i12 = 1;
                    boVar.getMessagesController().T(boVar.getParentActivity(), boVar.a0, boVar, new org.telegram.messenger.lr(boVar) { // from class: org.telegram.ui.on
                        public final /* synthetic */ bo b;

                        {
                            this.b = boVar;
                        }

                        @Override // org.telegram.messenger.lr
                        public final void run(long j102) {
                            switch (i12) {
                                case 0:
                                    bo boVar2 = this.b;
                                    if (j102 == 0) {
                                        boVar2.getClass();
                                        break;
                                    } else {
                                        boVar2.a0 = j102;
                                        boVar2.Y = boVar2.getMessagesController().M0(Long.valueOf(j102));
                                        boVar2.e0();
                                        break;
                                    }
                                case 1:
                                    bo boVar3 = this.b;
                                    if (j102 == 0) {
                                        boVar3.getClass();
                                        break;
                                    } else {
                                        boVar3.a0 = j102;
                                        boVar3.Y = boVar3.getMessagesController().M0(Long.valueOf(j102));
                                        boVar3.e0();
                                        break;
                                    }
                                default:
                                    if (j102 != 0) {
                                        bo boVar4 = this.b;
                                        boVar4.a0 = j102;
                                        boVar4.Y = boVar4.getMessagesController().M0(Long.valueOf(j102));
                                        org.telegram.messenger.hp messagesController5 = boVar4.getMessagesController();
                                        long j112 = -boVar4.a0;
                                        TLRPC.Chat chat22 = boVar4.Y;
                                        boolean z152 = boVar4.c0;
                                        chat22.noforwards = z152;
                                        messagesController5.d5(j112, 0, z152, null);
                                        boVar4.e0();
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, null);
                }
            } else {
                Vibrator vibrator = (Vibrator) boVar.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                org.telegram.messenger.g0.F3(boVar.h);
                boVar.g0(false);
            }
        }
        z11 = false;
        if (z11) {
        }
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        vg.i0 i0Var = new vg.i0(2, this.currentAccount, getParentActivity(), this, null);
        i0Var.o2 = this.b0;
        i0Var.A2 = new nn(this, 0);
        showDialog(i0Var);
    }

    public final void g0(boolean z10) {
        if (!z10) {
            org.telegram.messenger.g0.r(this.r0);
        }
        org.telegram.ui.ActionBar.b5 b5Var = this.r;
        if (b5Var != null) {
            b5Var.b(z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.km0 getScrollViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i3 = org.telegram.ui.ActionBar.k6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4, new Class[]{org.telegram.ui.Cells.v9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        LinearLayout linearLayout = this.s;
        int i10 = org.telegram.ui.ActionBar.k6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.E, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.T, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.T, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.T, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.y, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h0, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.w, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.x, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.I, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        return arrayList;
    }

    public final void h0() {
        if (this.K == null) {
            return;
        }
        int i3 = 8;
        if (this.W || this.d0 || !getUserConfig().q()) {
            org.telegram.ui.Cells.y8 y8Var = this.d;
            int i10 = org.telegram.ui.ActionBar.k6.B6;
            y8Var.setTag(Integer.valueOf(i10));
            org.telegram.ui.ActionBar.r6.V(this.d.getTextView(), i10, null);
            if (this.o0) {
                this.K.setVisibility(8);
            } else {
                this.K.setVisibility(0);
            }
            this.f0.setVisibility(8);
            this.y.setVisibility(8);
            this.E.setVisibility(0);
            this.h0.setVisibility(8);
            if (this.b0) {
                this.d.setText(org.telegram.messenger.bd.M0(this.W ? 2131752327 : 2131752267, null));
                this.e.setText(this.W ? org.telegram.messenger.bd.M0(2131752403, null) : org.telegram.messenger.bd.M0(2131752385, null));
            } else {
                this.d.setText(org.telegram.messenger.bd.M0(this.W ? 2131748647 : 2131748644, null));
                this.e.setText(this.W ? org.telegram.messenger.bd.M0(2131752403, null) : org.telegram.messenger.bd.M0(2131752385, null));
            }
            this.F.setVisibility(this.W ? 8 : 0);
            this.G.setVisibility(this.W ? 0 : 8);
            this.R.setVisibility(0);
            this.I.setVisibility(0);
            this.J.setVisibility(0);
            this.E.setPadding(0, 0, 0, this.W ? 0 : org.telegram.messenger.g0.L(7.0f));
            org.telegram.ui.Components.m70 m70Var = this.H;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.m0;
            m70Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            this.H.c(this.m0, this.a0);
            vn vnVar = this.h;
            vnVar.setVisibility((this.W || vnVar.a.length() == 0) ? 8 : 0);
            TLRPC.ChatFull N0 = getMessagesController().N0(this.a0);
            this.J.setText(org.telegram.messenger.bd.M0((N0 != null && N0.paid_media_allowed && org.telegram.messenger.t3.V(getMessagesController().M0(Long.valueOf(this.a0)))) ? 2131748701 : 2131748702, null));
        } else {
            this.d.setText(org.telegram.messenger.bd.M0(2131752533, null));
            org.telegram.ui.Cells.y8 y8Var2 = this.d;
            int i11 = org.telegram.ui.ActionBar.k6.p7;
            y8Var2.setTag(Integer.valueOf(i11));
            org.telegram.ui.ActionBar.r6.V(this.d.getTextView(), i11, null);
            this.E.setVisibility(8);
            this.h.setVisibility(8);
            this.K.setVisibility(8);
            this.f0.setVisibility(0);
            if (this.e0) {
                this.h0.setVisibility(0);
                this.y.setVisibility(8);
            } else {
                this.h0.setVisibility(8);
                this.y.setVisibility(0);
            }
        }
        this.w.a(!this.W);
        this.x.a(this.W);
        this.b.clearFocus();
        xn xnVar = this.V;
        if (xnVar != null) {
            xnVar.setVisibility((!this.b0 || this.W) ? 0 : 8);
            xn xnVar2 = this.V;
            TLRPC.ChatFull chatFull = this.Z;
            xnVar2.c((chatFull == null || chatFull.linked_chat_id == 0 || this.b0) ? false : true);
        }
        ao aoVar = this.L;
        if (aoVar != null) {
            if (!this.W && !this.O.isEmpty()) {
                i3 = 0;
            }
            aoVar.setVisibility(i3);
        }
        b0();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onBecomeFullyVisible() {
        bh.g gVar;
        super.onBecomeFullyVisible();
        if (!this.o0 || (gVar = this.b) == null) {
            return;
        }
        gVar.requestFocus();
        org.telegram.messenger.g0.K3(this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004d, code lost:
    
        if (r2 == null) goto L10;
     */
    @Override // org.telegram.ui.ActionBar.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        boolean z10 = this.o0;
        ArrayList arrayList = this.O;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.a0));
        this.Y = M0;
        if (M0 == null) {
            TLRPC.Chat P = getMessagesStorage().P(this.a0);
            this.Y = P;
            if (P != null) {
                getMessagesController().Q3(this.Y, true);
                if (this.Z == null) {
                    TLRPC.ChatFull F0 = getMessagesStorage().F0(this.a0, org.telegram.messenger.t3.T(this.Y), new CountDownLatch(1), false, false, 0);
                    this.Z = F0;
                }
            }
            return false;
        }
        this.W = (z10 || org.telegram.messenger.t3.t0(this.Y)) ? false : true;
        this.b0 = org.telegram.messenger.t3.T(this.Y) && !this.Y.megagroup;
        TLRPC.Chat chat = this.Y;
        this.c0 = chat.noforwards;
        if ((z10 && !org.telegram.messenger.t3.t0(chat)) || (this.W && this.Y.creator)) {
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            getConnectionsManager().sendRequest(tL_channels_checkUsername, new mn(this, 3));
        }
        if (this.W && this.Z != null) {
            getMessagesController().V2(this.classGuid, this.a0, true);
        }
        if (this.Y != null) {
            this.N.clear();
            arrayList.clear();
            for (int i3 = 0; i3 < this.Y.usernames.size(); i3++) {
                if (this.Y.usernames.get(i3).active) {
                    arrayList.add(this.Y.usernames.get(i3));
                }
            }
            for (int i10 = 0; i10 < this.Y.usernames.size(); i10++) {
                if (!this.Y.usernames.get(i10).active) {
                    arrayList.add(this.Y.usernames.get(i10));
                }
            }
        }
        getNotificationCenter().c(this, org.telegram.messenger.hs.T);
        getNotificationCenter().c(this, org.telegram.messenger.hs.y1);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.hs.T);
        getNotificationCenter().n(this, org.telegram.messenger.hs.y1);
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        TLRPC.ChatFull chatFull = this.Z;
        if (chatFull != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
            this.m0 = tL_chatInviteExported;
            this.H.setLink(tL_chatInviteExported == null ? null : tL_chatInviteExported.link);
            this.H.c(this.m0, this.a0);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Cells.t4 t4Var = this.h0;
            if (t4Var != null && t4Var.getChildCount() > 0 && (this.h0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.h0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h6, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            super.onThemeColorsChanged();
            LinearLayout linearLayout = this.y;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = this.y.getChildAt(i3);
                    if (childAt instanceof org.telegram.ui.Cells.n) {
                        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                        nVar.d.q(nVar.f);
                        nVar.a.invalidate();
                    }
                }
            }
            org.telegram.ui.Components.i50 i50Var = this.q0;
            if (i50Var != null) {
                i50Var.updateColors();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
