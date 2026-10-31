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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class cp extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public LinearLayout D;
    public LinearLayout E;
    public LinearLayout F;
    public org.telegram.ui.Components.j80 G;
    public org.telegram.ui.Cells.p8 H;
    public org.telegram.ui.Cells.b9 I;
    public org.telegram.ui.Cells.c7 J;
    public bp K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public la O;
    public ArrayList P;
    public LinearLayout Q;
    public org.telegram.ui.Cells.p4 R;
    public org.telegram.ui.Cells.t8 S;
    public org.telegram.ui.Cells.b9 T;
    public yo U;
    public boolean V;
    public boolean W;
    public TLRPC.Chat X;
    public TLRPC.ChatFull Y;
    public long Z;
    public uo a;
    public boolean a0;
    public org.telegram.ui.ActionBar.n0 b;
    public boolean b0;
    public EditTextBoldCursor c;
    public boolean c0;
    public org.telegram.ui.Cells.b9 d;
    public boolean d0;
    public org.telegram.ui.Cells.p4 e;
    public org.telegram.ui.Cells.c7 e0;
    public org.telegram.ui.Cells.p4 f;
    public ArrayList f0;
    public org.telegram.ui.Cells.v4 g0;
    public wo h;
    public int h0;
    public String i0;
    public zg j0;
    public boolean k0;
    public TLRPC.TL_chatInviteExported l0;
    public boolean m0;
    public org.telegram.ui.Components.hn0 n;
    public boolean n0;
    public HashMap o0;
    public org.telegram.ui.Components.c60 p0;
    public ro q0;
    public org.telegram.ui.ActionBar.l5 r;
    public Boolean r0;
    public LinearLayout s;
    public boolean s0;
    public org.telegram.ui.Cells.l6 w;
    public org.telegram.ui.Cells.l6 x;
    public LinearLayout y;

    public final void a0() {
        boolean z10;
        org.telegram.ui.ActionBar.l5 l5Var = this.r;
        if (!this.V && this.b.length() <= 0) {
            ArrayList arrayList = this.N;
            z10 = false;
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            l5Var.a(z10, true);
        }
        z10 = true;
        l5Var.a(z10, true);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
    }

    public final boolean b0(String str) {
        if (str == null || str.length() <= 0) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
        }
        zg zgVar = this.j0;
        if (zgVar != null) {
            org.telegram.messenger.i0.r(zgVar);
            this.j0 = null;
            this.i0 = null;
            if (this.h0 != 0) {
                getConnectionsManager().cancelRequest(this.h0, true);
            }
        }
        this.k0 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                this.h.setText(org.telegram.messenger.cd.L0(2131748919, null));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.t6.p7);
                return false;
            }
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                    if (this.a0) {
                        this.h.setText(org.telegram.messenger.cd.L0(2131748915, null));
                    } else {
                        this.h.setText(org.telegram.messenger.cd.L0(2131748914, null));
                    }
                    this.h.setTextColorByKey(org.telegram.ui.ActionBar.t6.p7);
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.h.setText(org.telegram.messenger.cd.L0(2131748919, null));
                    this.h.setTextColorByKey(org.telegram.ui.ActionBar.t6.p7);
                    return false;
                }
            }
        }
        if (str == null || str.length() < 4) {
            if (this.a0) {
                this.h.setText(org.telegram.messenger.cd.L0(2131748917, null));
            } else {
                this.h.setText(org.telegram.messenger.cd.L0(2131748916, null));
            }
            this.h.setTextColorByKey(org.telegram.ui.ActionBar.t6.p7);
            return false;
        }
        if (str.length() > 32) {
            this.h.setText(org.telegram.messenger.cd.L0(2131748918, null));
            this.h.setTextColorByKey(org.telegram.ui.ActionBar.t6.p7);
            return false;
        }
        this.h.setText(org.telegram.messenger.cd.L0(2131748932, null));
        this.h.setTextColorByKey(org.telegram.ui.ActionBar.t6.F6);
        this.i0 = str;
        zg zgVar2 = new zg(14, this, str);
        this.j0 = zgVar2;
        org.telegram.messenger.i0.h3(zgVar2, 300L);
        return true;
    }

    public final void c0(boolean z10) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().i1(-this.Z);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new org.telegram.messenger.voip.u0(4, this, z10)), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new ag.e(this, 26));
        this.r = this.simpleActionBar.n(org.telegram.messenger.cd.L0(2131745963, null));
        this.n = new org.telegram.ui.Components.hn0(context);
        this.a = new uo(this, context, this.n, this.resourceProvider);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(this.a, w7.b6.g());
        this.fragmentView = frameLayout;
        this.a.setFillViewport(true);
        this.a.setDrawBackground(true);
        this.a.setOverScrollMode(0);
        this.a.addView(this.n, new FrameLayout.LayoutParams(-1, -2));
        this.n.setOrientation(1);
        boolean z10 = this.n0;
        if (z10) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131743955, null));
        } else if (this.a0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752297, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131749409, null));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.s = linearLayout;
        linearLayout.setOrientation(1);
        this.n.addView(this.s, w7.b6.o(-1, -2));
        org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context, 23);
        this.f = p4Var;
        p4Var.setHeight(46);
        if (this.a0) {
            this.f.setText(org.telegram.messenger.cd.L0(2131752275, null));
        } else {
            this.f.setText(org.telegram.messenger.cd.L0(2131749400, null));
        }
        this.s.addView(this.f);
        org.telegram.ui.Cells.l6 l6Var = new org.telegram.ui.Cells.l6(context, false);
        this.x = l6Var;
        if (this.a0) {
            l6Var.b(org.telegram.messenger.cd.L0(2131752329, null), org.telegram.messenger.cd.L0(2131752328, null), false, this.V);
        } else {
            l6Var.b(org.telegram.messenger.cd.L0(2131748656, null), org.telegram.messenger.cd.L0(2131748655, null), false, this.V);
        }
        this.s.addView(this.x, w7.b6.o(-1, -2));
        this.x.setOnClickListener(new to(this, i10));
        org.telegram.ui.Cells.l6 l6Var2 = new org.telegram.ui.Cells.l6(context, false);
        this.w = l6Var2;
        if (this.a0) {
            l6Var2.b(org.telegram.messenger.cd.L0(2131752318, null), org.telegram.messenger.cd.L0(2131752315, null), false, !this.V);
        } else {
            l6Var2.b(org.telegram.messenger.cd.L0(2131748653, null), org.telegram.messenger.cd.L0(2131748652, null), false, !this.V);
        }
        this.s.addView(this.w, w7.b6.o(-1, -2));
        int i11 = 2;
        this.w.setOnClickListener(new to(this, i11));
        org.telegram.ui.Cells.c7 c7Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
        this.J = c7Var;
        this.n.addView(c7Var, w7.b6.o(-1, -2));
        if (z10) {
            this.x.setVisibility(8);
            this.w.setVisibility(8);
            this.J.setVisibility(8);
            this.f.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.D = linearLayout2;
        linearLayout2.setOrientation(1);
        this.n.addView(this.D, w7.b6.o(-1, -2));
        org.telegram.ui.Cells.p4 p4Var2 = new org.telegram.ui.Cells.p4(context, 23);
        this.e = p4Var2;
        this.D.addView(p4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setOrientation(0);
        this.D.addView(this.E, w7.b6.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().U2 + "/");
        this.c.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.c;
        int i12 = org.telegram.ui.ActionBar.t6.H6;
        org.telegram.ui.ActionBar.a7.E(editTextBoldCursor2, i12, null);
        EditTextBoldCursor editTextBoldCursor3 = this.c;
        int i13 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor3, i13, null);
        this.c.setMaxLines(1);
        this.c.setLines(1);
        this.c.setEnabled(false);
        this.c.setBackground(null);
        this.c.setPadding(0, 0, 0, 0);
        this.c.setSingleLine(true);
        this.c.setInputType(163840);
        this.c.setImeOptions(6);
        this.E.addView(this.c, w7.b6.o(-2, 36));
        org.telegram.ui.ActionBar.n0 n0Var = new org.telegram.ui.ActionBar.n0(this, context, i11);
        this.b = n0Var;
        n0Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.a7.E(this.b, i12, null);
        org.telegram.ui.ActionBar.a7.V(this.b, i13, null);
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setBackground(null);
        this.b.setPadding(0, 0, 0, 0);
        this.b.setSingleLine(true);
        this.b.setInputType(163872);
        this.b.setImeOptions(6);
        this.b.setHint(org.telegram.messenger.cd.L0(2131752266, null));
        org.telegram.ui.ActionBar.a7.w(this.b, i13, null);
        this.b.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        this.b.setCursorWidth(1.5f);
        this.E.addView(this.b, w7.b6.o(-1, 36));
        int i14 = 4;
        this.b.addTextChangedListener(new n0(this, i14));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.F = linearLayout4;
        linearLayout4.setOrientation(1);
        this.D.addView(this.F, w7.b6.o(-1, -2));
        org.telegram.ui.Components.j80 j80Var = new org.telegram.ui.Components.j80(context, this, null, true, org.telegram.messenger.w3.T(this.X));
        this.G = j80Var;
        j80Var.setDelegate(new vo(this, context));
        this.G.d(0, null, false);
        this.F.addView(this.G);
        wo woVar = new wo(this, context, this.resourceProvider);
        this.h = woVar;
        woVar.setBottomPadding(6);
        this.n.addView(this.h, w7.b6.o(-2, -2));
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(12, context, this.resourceProvider);
        this.d = b9Var;
        b9Var.setImportantForAccessibility(1);
        this.n.addView(this.d, w7.b6.o(-1, -2));
        org.telegram.ui.Cells.v4 v4Var = new org.telegram.ui.Cells.v4(context);
        this.g0 = v4Var;
        this.n.addView(v4Var, w7.b6.o(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.y = linearLayout5;
        linearLayout5.setOrientation(1);
        this.n.addView(this.y, w7.b6.o(-1, -2));
        org.telegram.ui.Cells.c7 c7Var2 = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
        this.e0 = c7Var2;
        this.n.addView(c7Var2, w7.b6.o(-1, -2));
        org.telegram.ui.Components.hn0 hn0Var = this.n;
        bp bpVar = new bp(this, context);
        this.K = bpVar;
        hn0Var.addView(bpVar, w7.b6.o(-1, -2));
        this.K.setVisibility((this.V || this.N.isEmpty()) ? 8 : 0);
        org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context);
        this.H = p8Var;
        p8Var.o(R.drawable.msg_link2, org.telegram.messenger.cd.L0(2131748710, null), false);
        this.H.setOnClickListener(new to(this, 3));
        this.n.addView(this.H, w7.b6.o(-1, -2));
        org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(12, context, this.resourceProvider);
        this.I = b9Var2;
        this.n.addView(b9Var2, w7.b6.o(-1, -2));
        yo yoVar = new yo(this, context, this.X, context);
        this.U = yoVar;
        TLRPC.ChatFull chatFull = this.Y;
        yoVar.c((chatFull == null || chatFull.linked_chat_id == 0 || this.a0) ? false : true);
        yo yoVar2 = this.U;
        TLRPC.ChatFull chatFull2 = this.Y;
        org.telegram.ui.Cells.b9 b9Var3 = yoVar2.e;
        boolean V = org.telegram.messenger.w3.V(yoVar2.n);
        boolean t02 = org.telegram.messenger.w3.t0(yoVar2.n);
        if (chatFull2 == null || chatFull2.guard_bot_id == 0) {
            b9Var3.setText(org.telegram.messenger.cd.L0(V ? 2131752302 : t02 ? 2131749412 : 2131749415, null));
        } else {
            b9Var3.setText(org.telegram.messenger.i0.P2(org.telegram.messenger.cd.a0(null, null, V ? 2131752301 : t02 ? 2131749411 : 2131749414, "@" + org.telegram.messenger.o5.r(org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).Z1(Long.valueOf(chatFull2.guard_bot_id)))), org.telegram.ui.ActionBar.t6.Wl, null, new org.telegram.ui.Components.at(20, chatFull2, this), false));
        }
        this.n.addView(this.U);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.Q = linearLayout6;
        linearLayout6.setOrientation(1);
        this.n.addView(this.Q);
        org.telegram.ui.Cells.p4 p4Var3 = new org.telegram.ui.Cells.p4(context, 23);
        this.R = p4Var3;
        p4Var3.setHeight(46);
        this.R.setText(org.telegram.messenger.cd.L0(2131745880, null));
        this.Q.addView(this.R, w7.b6.o(-1, -2));
        org.telegram.ui.Cells.t8 t8Var = new org.telegram.ui.Cells.t8(context);
        this.S = t8Var;
        t8Var.f(org.telegram.messenger.cd.L0(2131746079, null), this.b0, false);
        this.S.setOnClickListener(new to(this, i14));
        this.Q.addView(this.S, w7.b6.o(-1, -2));
        this.T = new org.telegram.ui.Cells.b9(12, context, this.resourceProvider);
        if (!this.a0 || org.telegram.messenger.w3.n0(this.X)) {
            this.T.setText(org.telegram.messenger.cd.L0(2131746077, null));
        } else {
            this.T.setText(org.telegram.messenger.cd.L0(2131746078, null));
        }
        this.Q.addView(this.T, w7.b6.o(-1, -2));
        String K = org.telegram.messenger.w3.K(this.X, true);
        if (!this.V && K != null) {
            this.m0 = true;
            this.b.setText(K);
            this.b.setSelection(K.length());
            this.m0 = false;
        }
        g0();
        return this.fragmentView;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d0() {
        boolean z10;
        boolean z11;
        ArrayList<TLRPC.TL_username> arrayList;
        boolean z12;
        final cp cpVar = this;
        org.telegram.messenger.i0.h3(cpVar.q0, 200L);
        boolean z13 = true;
        if (cpVar.getParentActivity() != null) {
            String K = org.telegram.messenger.w3.K(cpVar.X, true);
            if (cpVar.V || (((K != null || cpVar.b.length() == 0) && (K == null || K.equalsIgnoreCase(cpVar.b.getText().toString()))) || cpVar.b.length() == 0 || cpVar.k0)) {
                if (K == null) {
                    K = "";
                }
                String obj = cpVar.V ? "" : cpVar.b.getText().toString();
                if (K.equals(obj)) {
                    if (!cpVar.V || (arrayList = cpVar.X.usernames) == null || arrayList.isEmpty()) {
                        z10 = true;
                    } else if (cpVar.s0) {
                        z10 = false;
                    } else {
                        cpVar.s0 = true;
                        boolean z14 = false;
                        for (int i10 = 0; i10 < cpVar.X.usernames.size(); i10++) {
                            TLRPC.TL_username tL_username = cpVar.X.usernames.get(i10);
                            if (tL_username != null && tL_username.active && !tL_username.editable) {
                                z14 = true;
                            }
                        }
                        if (z14) {
                            TLRPC.TL_channels_deactivateAllUsernames tL_channels_deactivateAllUsernames = new TLRPC.TL_channels_deactivateAllUsernames();
                            tL_channels_deactivateAllUsernames.channel = org.telegram.messenger.vp.h1(cpVar.X);
                            cpVar.getConnectionsManager().sendRequest(tL_channels_deactivateAllUsernames, new po(cpVar, 1));
                        } else {
                            cpVar.s0 = false;
                        }
                        z10 = !z14;
                    }
                    if (z10) {
                        z11 = true;
                        if (z11) {
                            return;
                        }
                        TLRPC.Chat chat = cpVar.X;
                        if (chat.noforwards != cpVar.b0) {
                            if (!org.telegram.messenger.w3.T(chat)) {
                                cpVar.f0(true);
                                final int i11 = 2;
                                cpVar.getMessagesController().T(cpVar.getParentActivity(), cpVar.Z, cpVar, new org.telegram.messenger.cs(cpVar) { // from class: org.telegram.ui.qo
                                    public final /* synthetic */ cp b;

                                    {
                                        this.b = cpVar;
                                    }

                                    @Override // org.telegram.messenger.cs
                                    public final void run(long j10) {
                                        switch (i11) {
                                            case 0:
                                                cp cpVar2 = this.b;
                                                if (j10 == 0) {
                                                    cpVar2.getClass();
                                                    break;
                                                } else {
                                                    cpVar2.Z = j10;
                                                    cpVar2.X = cpVar2.getMessagesController().L0(Long.valueOf(j10));
                                                    cpVar2.d0();
                                                    break;
                                                }
                                            case 1:
                                                cp cpVar3 = this.b;
                                                if (j10 == 0) {
                                                    cpVar3.getClass();
                                                    break;
                                                } else {
                                                    cpVar3.Z = j10;
                                                    cpVar3.X = cpVar3.getMessagesController().L0(Long.valueOf(j10));
                                                    cpVar3.d0();
                                                    break;
                                                }
                                            default:
                                                if (j10 != 0) {
                                                    cp cpVar4 = this.b;
                                                    cpVar4.Z = j10;
                                                    cpVar4.X = cpVar4.getMessagesController().L0(Long.valueOf(j10));
                                                    org.telegram.messenger.vp messagesController = cpVar4.getMessagesController();
                                                    long j11 = -cpVar4.Z;
                                                    TLRPC.Chat chat2 = cpVar4.X;
                                                    boolean z15 = cpVar4.b0;
                                                    chat2.noforwards = z15;
                                                    messagesController.a5(j11, 0, z15, null);
                                                    cpVar4.d0();
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
                                if (cpVar.U != null) {
                                    if (cpVar.getParentActivity() != null) {
                                        if (!cpVar.a0 && !org.telegram.messenger.w3.T(cpVar.X)) {
                                            yo yoVar = cpVar.U;
                                            if (yoVar.f || yoVar.h) {
                                                final int i12 = 0;
                                                cpVar.getMessagesController().T(cpVar.getParentActivity(), cpVar.Z, cpVar, new org.telegram.messenger.cs(cpVar) { // from class: org.telegram.ui.qo
                                                    public final /* synthetic */ cp b;

                                                    {
                                                        this.b = cpVar;
                                                    }

                                                    @Override // org.telegram.messenger.cs
                                                    public final void run(long j10) {
                                                        switch (i12) {
                                                            case 0:
                                                                cp cpVar2 = this.b;
                                                                if (j10 == 0) {
                                                                    cpVar2.getClass();
                                                                    break;
                                                                } else {
                                                                    cpVar2.Z = j10;
                                                                    cpVar2.X = cpVar2.getMessagesController().L0(Long.valueOf(j10));
                                                                    cpVar2.d0();
                                                                    break;
                                                                }
                                                            case 1:
                                                                cp cpVar3 = this.b;
                                                                if (j10 == 0) {
                                                                    cpVar3.getClass();
                                                                    break;
                                                                } else {
                                                                    cpVar3.Z = j10;
                                                                    cpVar3.X = cpVar3.getMessagesController().L0(Long.valueOf(j10));
                                                                    cpVar3.d0();
                                                                    break;
                                                                }
                                                            default:
                                                                if (j10 != 0) {
                                                                    cp cpVar4 = this.b;
                                                                    cpVar4.Z = j10;
                                                                    cpVar4.X = cpVar4.getMessagesController().L0(Long.valueOf(j10));
                                                                    org.telegram.messenger.vp messagesController = cpVar4.getMessagesController();
                                                                    long j11 = -cpVar4.Z;
                                                                    TLRPC.Chat chat2 = cpVar4.X;
                                                                    boolean z15 = cpVar4.b0;
                                                                    chat2.noforwards = z15;
                                                                    messagesController.a5(j11, 0, z15, null);
                                                                    cpVar4.d0();
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                }, null);
                                            }
                                        }
                                        if (cpVar.X.join_to_send != cpVar.U.f) {
                                            org.telegram.messenger.vp messagesController = cpVar.getMessagesController();
                                            long j10 = cpVar.Z;
                                            TLRPC.Chat chat2 = cpVar.X;
                                            boolean z15 = cpVar.U.f;
                                            chat2.join_to_send = z15;
                                            messagesController.getClass();
                                            TLRPC.TL_channels_toggleJoinToSend tL_channels_toggleJoinToSend = new TLRPC.TL_channels_toggleJoinToSend();
                                            tL_channels_toggleJoinToSend.channel = messagesController.g1(j10);
                                            tL_channels_toggleJoinToSend.enabled = z15;
                                            Object obj2 = null;
                                            messagesController.getConnectionsManager().sendRequest(tL_channels_toggleJoinToSend, new org.telegram.messenger.ci(messagesController, obj2, obj2, 8), 64);
                                        }
                                        if (cpVar.X.join_request != cpVar.U.h || cpVar.W) {
                                            org.telegram.messenger.vp messagesController2 = cpVar.getMessagesController();
                                            long j11 = cpVar.Z;
                                            TLRPC.Chat chat3 = cpVar.X;
                                            boolean z16 = cpVar.U.h;
                                            chat3.join_request = z16;
                                            messagesController2.Z4(j11, 0L, z16, cpVar.W, false, null, null);
                                        }
                                    }
                                    z13 = false;
                                }
                                if (z13) {
                                    cpVar.finishFragment();
                                    return;
                                }
                                return;
                            }
                            org.telegram.messenger.vp messagesController3 = cpVar.getMessagesController();
                            long j12 = -cpVar.Z;
                            TLRPC.Chat chat4 = cpVar.X;
                            boolean z17 = cpVar.b0;
                            chat4.noforwards = z17;
                            messagesController3.a5(j12, 0, z17, null);
                        }
                        z12 = true;
                        if (z12) {
                        }
                    }
                } else if (org.telegram.messenger.w3.T(cpVar.X)) {
                    org.telegram.messenger.vp messagesController4 = cpVar.getMessagesController();
                    long j13 = cpVar.Z;
                    ro roVar = new ro(cpVar, 1);
                    ro roVar2 = new ro(cpVar, 2);
                    messagesController4.getClass();
                    TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                    tL_channels_updateUsername.channel = messagesController4.g1(j13);
                    tL_channels_updateUsername.username = obj;
                    cpVar = this;
                    messagesController4.getConnectionsManager().sendRequest(tL_channels_updateUsername, new org.telegram.messenger.nm(messagesController4, j13, obj, roVar, this, tL_channels_updateUsername, roVar2), 64);
                } else {
                    final int i13 = 1;
                    cpVar.getMessagesController().T(cpVar.getParentActivity(), cpVar.Z, cpVar, new org.telegram.messenger.cs(cpVar) { // from class: org.telegram.ui.qo
                        public final /* synthetic */ cp b;

                        {
                            this.b = cpVar;
                        }

                        @Override // org.telegram.messenger.cs
                        public final void run(long j102) {
                            switch (i13) {
                                case 0:
                                    cp cpVar2 = this.b;
                                    if (j102 == 0) {
                                        cpVar2.getClass();
                                        break;
                                    } else {
                                        cpVar2.Z = j102;
                                        cpVar2.X = cpVar2.getMessagesController().L0(Long.valueOf(j102));
                                        cpVar2.d0();
                                        break;
                                    }
                                case 1:
                                    cp cpVar3 = this.b;
                                    if (j102 == 0) {
                                        cpVar3.getClass();
                                        break;
                                    } else {
                                        cpVar3.Z = j102;
                                        cpVar3.X = cpVar3.getMessagesController().L0(Long.valueOf(j102));
                                        cpVar3.d0();
                                        break;
                                    }
                                default:
                                    if (j102 != 0) {
                                        cp cpVar4 = this.b;
                                        cpVar4.Z = j102;
                                        cpVar4.X = cpVar4.getMessagesController().L0(Long.valueOf(j102));
                                        org.telegram.messenger.vp messagesController5 = cpVar4.getMessagesController();
                                        long j112 = -cpVar4.Z;
                                        TLRPC.Chat chat22 = cpVar4.X;
                                        boolean z152 = cpVar4.b0;
                                        chat22.noforwards = z152;
                                        messagesController5.a5(j112, 0, z152, null);
                                        cpVar4.d0();
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, null);
                }
            } else {
                Vibrator vibrator = (Vibrator) cpVar.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                org.telegram.messenger.i0.E3(cpVar.h);
                cpVar.f0(false);
            }
        }
        z11 = false;
        if (z11) {
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.Z) {
                this.Y = chatFull;
                this.l0 = chatFull.exported_invite;
                g0();
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.y1) {
            if ((-this.Z) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
                if (z4Var == null || z4Var.getLastFragment() != this) {
                    removeSelfFromStack();
                } else {
                    finishFragment();
                }
            }
        }
    }

    public final void e0() {
        if (getParentActivity() == null) {
            return;
        }
        kg.q0 q0Var = new kg.q0(2, this.currentAccount, getParentActivity(), this, null);
        q0Var.n2 = this.a0;
        q0Var.z2 = new ro(this, 0);
        showDialog(q0Var);
    }

    public final void f0(boolean z10) {
        if (!z10) {
            org.telegram.messenger.i0.r(this.q0);
        }
        org.telegram.ui.ActionBar.l5 l5Var = this.r;
        if (l5Var != null) {
            l5Var.b(z10);
        }
    }

    public final void g0() {
        if (this.J == null) {
            return;
        }
        int i10 = 8;
        if (this.V || this.c0 || !getUserConfig().q()) {
            org.telegram.ui.Cells.b9 b9Var = this.d;
            int i11 = org.telegram.ui.ActionBar.t6.B6;
            b9Var.setTag(Integer.valueOf(i11));
            org.telegram.ui.ActionBar.a7.V(this.d.getTextView(), i11, null);
            if (this.n0) {
                this.J.setVisibility(8);
            } else {
                this.J.setVisibility(0);
            }
            this.e0.setVisibility(8);
            this.y.setVisibility(8);
            this.D.setVisibility(0);
            this.g0.setVisibility(8);
            if (this.a0) {
                this.d.setText(org.telegram.messenger.cd.L0(this.V ? 2131752327 : 2131752267, null));
                this.e.setText(this.V ? org.telegram.messenger.cd.L0(2131752403, null) : org.telegram.messenger.cd.L0(2131752385, null));
            } else {
                this.d.setText(org.telegram.messenger.cd.L0(this.V ? 2131748654 : 2131748651, null));
                this.e.setText(this.V ? org.telegram.messenger.cd.L0(2131752403, null) : org.telegram.messenger.cd.L0(2131752385, null));
            }
            this.E.setVisibility(this.V ? 8 : 0);
            this.F.setVisibility(this.V ? 0 : 8);
            this.Q.setVisibility(0);
            this.H.setVisibility(0);
            this.I.setVisibility(0);
            this.D.setPadding(0, 0, 0, this.V ? 0 : org.telegram.messenger.i0.L(7.0f));
            org.telegram.ui.Components.j80 j80Var = this.G;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.l0;
            j80Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            this.G.c(this.l0, this.Z);
            wo woVar = this.h;
            woVar.setVisibility((this.V || woVar.a.length() == 0) ? 8 : 0);
            TLRPC.ChatFull M0 = getMessagesController().M0(this.Z);
            this.I.setText(org.telegram.messenger.cd.L0((M0 != null && M0.paid_media_allowed && org.telegram.messenger.w3.V(getMessagesController().L0(Long.valueOf(this.Z)))) ? 2131748708 : 2131748709, null));
        } else {
            this.d.setText(org.telegram.messenger.cd.L0(2131752533, null));
            org.telegram.ui.Cells.b9 b9Var2 = this.d;
            int i12 = org.telegram.ui.ActionBar.t6.p7;
            b9Var2.setTag(Integer.valueOf(i12));
            org.telegram.ui.ActionBar.a7.V(this.d.getTextView(), i12, null);
            this.D.setVisibility(8);
            this.h.setVisibility(8);
            this.J.setVisibility(8);
            this.e0.setVisibility(0);
            if (this.d0) {
                this.g0.setVisibility(0);
                this.y.setVisibility(8);
            } else {
                this.g0.setVisibility(8);
                this.y.setVisibility(0);
            }
        }
        this.w.a(!this.V);
        this.x.a(this.V);
        this.b.clearFocus();
        yo yoVar = this.U;
        if (yoVar != null) {
            yoVar.setVisibility((!this.a0 || this.V) ? 0 : 8);
            yo yoVar2 = this.U;
            TLRPC.ChatFull chatFull = this.Y;
            yoVar2.c((chatFull == null || chatFull.linked_chat_id == 0 || this.a0) ? false : true);
        }
        bp bpVar = this.K;
        if (bpVar != null) {
            if (!this.V && !this.N.isEmpty()) {
                i10 = 0;
            }
            bpVar.setVisibility(i10);
        }
        a0();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.in0 getScrollViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.t6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 4, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        LinearLayout linearLayout = this.s;
        int i11 = org.telegram.ui.ActionBar.t6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.D, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.y, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.g0, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.w, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.x, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.H, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyVisible() {
        org.telegram.ui.ActionBar.n0 n0Var;
        super.onBecomeFullyVisible();
        if (!this.n0 || (n0Var = this.b) == null) {
            return;
        }
        n0Var.requestFocus();
        org.telegram.messenger.i0.J3(this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004d, code lost:
    
        if (r2 == null) goto L10;
     */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        boolean z10 = this.n0;
        ArrayList arrayList = this.N;
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.Z));
        this.X = L0;
        if (L0 == null) {
            TLRPC.Chat P = getMessagesStorage().P(this.Z);
            this.X = P;
            if (P != null) {
                getMessagesController().N3(this.X, true);
                if (this.Y == null) {
                    TLRPC.ChatFull F0 = getMessagesStorage().F0(this.Z, org.telegram.messenger.w3.T(this.X), new CountDownLatch(1), false, false, 0);
                    this.Y = F0;
                }
            }
            return false;
        }
        this.V = (z10 || org.telegram.messenger.w3.t0(this.X)) ? false : true;
        this.a0 = org.telegram.messenger.w3.T(this.X) && !this.X.megagroup;
        TLRPC.Chat chat = this.X;
        this.b0 = chat.noforwards;
        if ((z10 && !org.telegram.messenger.w3.t0(chat)) || (this.V && this.X.creator)) {
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            getConnectionsManager().sendRequest(tL_channels_checkUsername, new po(this, 3));
        }
        if (this.V && this.Y != null) {
            getMessagesController().T2(this.classGuid, this.Z, true);
        }
        if (this.X != null) {
            this.M.clear();
            arrayList.clear();
            for (int i10 = 0; i10 < this.X.usernames.size(); i10++) {
                if (this.X.usernames.get(i10).active) {
                    arrayList.add(this.X.usernames.get(i10));
                }
            }
            for (int i11 = 0; i11 < this.X.usernames.size(); i11++) {
                if (!this.X.usernames.get(i11).active) {
                    arrayList.add(this.X.usernames.get(i11));
                }
            }
        }
        getNotificationCenter().c(this, org.telegram.messenger.zs.T);
        getNotificationCenter().c(this, org.telegram.messenger.zs.y1);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.zs.T);
        getNotificationCenter().n(this, org.telegram.messenger.zs.y1);
        org.telegram.messenger.i0.B2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        TLRPC.ChatFull chatFull = this.Y;
        if (chatFull != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
            this.l0 = tL_chatInviteExported;
            this.G.setLink(tL_chatInviteExported == null ? null : tL_chatInviteExported.link);
            this.G.c(this.l0, this.Z);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Cells.v4 v4Var = this.g0;
            if (v4Var != null && v4Var.getChildCount() > 0 && (this.g0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.g0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h6, false));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            super.onThemeColorsChanged();
            LinearLayout linearLayout = this.y;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = this.y.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.m) {
                        org.telegram.ui.Cells.m mVar = (org.telegram.ui.Cells.m) childAt;
                        mVar.d.q(mVar.f);
                        mVar.a.invalidate();
                    }
                }
            }
            org.telegram.ui.Components.c60 c60Var = this.p0;
            if (c60Var != null) {
                c60Var.updateColors();
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
