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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class go extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public LinearLayout D;
    public LinearLayout E;
    public LinearLayout F;
    public org.telegram.ui.Components.q70 G;
    public org.telegram.ui.Cells.m8 H;
    public org.telegram.ui.Cells.z8 I;
    public org.telegram.ui.Cells.y6 J;
    public fo K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public ia O;
    public ArrayList P;
    public LinearLayout Q;
    public org.telegram.ui.Cells.n4 R;
    public org.telegram.ui.Cells.r8 S;
    public org.telegram.ui.Cells.z8 T;
    public bo U;
    public boolean V;
    public boolean W;
    public TLRPC.Chat X;
    public TLRPC.ChatFull Y;
    public long Z;
    public xn a;
    public boolean a0;
    public ah.i b;
    public boolean b0;
    public EditTextBoldCursor c;
    public boolean c0;
    public org.telegram.ui.Cells.z8 d;
    public boolean d0;
    public org.telegram.ui.Cells.n4 e;
    public org.telegram.ui.Cells.y6 e0;
    public org.telegram.ui.Cells.n4 f;
    public ArrayList f0;
    public org.telegram.ui.Cells.t4 g0;
    public zn h;
    public int h0;
    public String i0;
    public qf j0;
    public boolean k0;
    public TLRPC.TL_chatInviteExported l0;
    public boolean m0;
    public org.telegram.ui.Components.gm0 n;
    public boolean n0;
    public HashMap o0;
    public org.telegram.ui.Components.m50 p0;
    public rn q0;
    public org.telegram.ui.ActionBar.b5 r;
    public Boolean r0;
    public LinearLayout s;
    public boolean s0;
    public org.telegram.ui.Cells.h6 w;
    public org.telegram.ui.Cells.h6 x;
    public LinearLayout y;

    @Override // org.telegram.ui.ActionBar.f2
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
        boolean z9;
        org.telegram.ui.ActionBar.b5 b5Var = this.r;
        if (!this.V && this.b.length() <= 0) {
            ArrayList arrayList = this.N;
            z9 = false;
            if (arrayList != null) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i7);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            b5Var.a(z9, true);
        }
        z9 = true;
        b5Var.a(z9, true);
    }

    public final boolean c0(String str) {
        if (str == null || str.length() <= 0) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
        }
        qf qfVar = this.j0;
        if (qfVar != null) {
            org.telegram.messenger.g0.r(qfVar);
            this.j0 = null;
            this.i0 = null;
            if (this.h0 != 0) {
                getConnectionsManager().cancelRequest(this.h0, true);
            }
        }
        this.k0 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                this.h.setText(org.telegram.messenger.hd.M0(2131748908, null));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.p7);
                return false;
            }
            for (int i7 = 0; i7 < str.length(); i7++) {
                char charAt = str.charAt(i7);
                if (i7 == 0 && charAt >= '0' && charAt <= '9') {
                    if (this.a0) {
                        this.h.setText(org.telegram.messenger.hd.M0(2131748904, null));
                    } else {
                        this.h.setText(org.telegram.messenger.hd.M0(2131748903, null));
                    }
                    this.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.p7);
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.h.setText(org.telegram.messenger.hd.M0(2131748908, null));
                    this.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.p7);
                    return false;
                }
            }
        }
        if (str == null || str.length() < 4) {
            if (this.a0) {
                this.h.setText(org.telegram.messenger.hd.M0(2131748906, null));
            } else {
                this.h.setText(org.telegram.messenger.hd.M0(2131748905, null));
            }
            this.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.p7);
            return false;
        }
        if (str.length() > 32) {
            this.h.setText(org.telegram.messenger.hd.M0(2131748907, null));
            this.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.p7);
            return false;
        }
        this.h.setText(org.telegram.messenger.hd.M0(2131748921, null));
        this.h.setTextColorByKey(org.telegram.ui.ActionBar.k6.F6);
        this.i0 = str;
        qf qfVar2 = new qf(20, this, str);
        this.j0 = qfVar2;
        org.telegram.messenger.g0.i3(qfVar2, 300L);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new wn(this, context));
        this.r = this.simpleActionBar.n(org.telegram.messenger.hd.M0(2131745947, null));
        this.n = new org.telegram.ui.Components.gm0(context);
        this.a = new xn(this, context, this.n, this.resourceProvider);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(this.a, c8.ha.g());
        this.fragmentView = frameLayout;
        this.a.setFillViewport(true);
        this.a.setDrawBackground(true);
        this.a.setOverScrollMode(0);
        this.a.addView(this.n, new FrameLayout.LayoutParams(-1, -2));
        this.n.setOrientation(1);
        boolean z9 = this.n0;
        if (z9) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131743931, null));
        } else if (this.a0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131752297, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131749399, null));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.s = linearLayout;
        linearLayout.setOrientation(1);
        this.n.addView(this.s, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, 23);
        this.f = n4Var;
        n4Var.setHeight(46);
        if (this.a0) {
            this.f.setText(org.telegram.messenger.hd.M0(2131752275, null));
        } else {
            this.f.setText(org.telegram.messenger.hd.M0(2131749390, null));
        }
        this.s.addView(this.f);
        org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, false);
        this.x = h6Var;
        if (this.a0) {
            h6Var.b(org.telegram.messenger.hd.M0(2131752329, null), org.telegram.messenger.hd.M0(2131752328, null), false, this.V);
        } else {
            h6Var.b(org.telegram.messenger.hd.M0(2131748640, null), org.telegram.messenger.hd.M0(2131748639, null), false, this.V);
        }
        this.s.addView(this.x, c8.ha.o(-1, -2));
        this.x.setOnClickListener(new un(this, i7));
        org.telegram.ui.Cells.h6 h6Var2 = new org.telegram.ui.Cells.h6(context, false);
        this.w = h6Var2;
        if (this.a0) {
            h6Var2.b(org.telegram.messenger.hd.M0(2131752318, null), org.telegram.messenger.hd.M0(2131752315, null), false, !this.V);
        } else {
            h6Var2.b(org.telegram.messenger.hd.M0(2131748637, null), org.telegram.messenger.hd.M0(2131748636, null), false, !this.V);
        }
        this.s.addView(this.w, c8.ha.o(-1, -2));
        this.w.setOnClickListener(new un(this, 2));
        org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
        this.J = y6Var;
        this.n.addView(y6Var, c8.ha.o(-1, -2));
        if (z9) {
            this.x.setVisibility(8);
            this.w.setVisibility(8);
            this.J.setVisibility(8);
            this.f.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.D = linearLayout2;
        linearLayout2.setOrientation(1);
        this.n.addView(this.D, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(context, 23);
        this.e = n4Var2;
        this.D.addView(n4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setOrientation(0);
        this.D.addView(this.E, c8.ha.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().U2 + "/");
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
        this.E.addView(this.c, c8.ha.o(-2, 36));
        ah.i iVar = new ah.i(5, context, this);
        this.b = iVar;
        iVar.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.E(this.b, i10, null);
        org.telegram.ui.ActionBar.r6.V(this.b, i11, null);
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setBackground(null);
        this.b.setPadding(0, 0, 0, 0);
        this.b.setSingleLine(true);
        this.b.setInputType(163872);
        this.b.setImeOptions(6);
        this.b.setHint(org.telegram.messenger.hd.M0(2131752266, null));
        org.telegram.ui.ActionBar.r6.w(this.b, i11, null);
        this.b.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.b.setCursorWidth(1.5f);
        this.E.addView(this.b, c8.ha.o(-1, 36));
        this.b.addTextChangedListener(new m0(this, 4));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.F = linearLayout4;
        linearLayout4.setOrientation(1);
        this.D.addView(this.F, c8.ha.o(-1, -2));
        org.telegram.ui.Components.q70 q70Var = new org.telegram.ui.Components.q70(context, this, null, true, org.telegram.messenger.t3.T(this.X));
        this.G = q70Var;
        q70Var.setDelegate(new yn(this, context));
        this.G.d(0, null, false);
        this.F.addView(this.G);
        zn znVar = new zn(this, context, this.resourceProvider);
        this.h = znVar;
        znVar.setBottomPadding(6);
        this.n.addView(this.h, c8.ha.o(-2, -2));
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        this.d = z8Var;
        z8Var.setImportantForAccessibility(1);
        this.n.addView(this.d, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.t4 t4Var = new org.telegram.ui.Cells.t4(context);
        this.g0 = t4Var;
        this.n.addView(t4Var, c8.ha.o(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.y = linearLayout5;
        linearLayout5.setOrientation(1);
        this.n.addView(this.y, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.y6 y6Var2 = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
        this.e0 = y6Var2;
        this.n.addView(y6Var2, c8.ha.o(-1, -2));
        org.telegram.ui.Components.gm0 gm0Var = this.n;
        fo foVar = new fo(this, context);
        this.K = foVar;
        gm0Var.addView(foVar, c8.ha.o(-1, -2));
        this.K.setVisibility((this.V || this.N.isEmpty()) ? 8 : 0);
        org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(context);
        this.H = m8Var;
        m8Var.o(R.drawable.msg_link2, org.telegram.messenger.hd.M0(2131748694, null), false);
        this.H.setOnClickListener(new un(this, 3));
        this.n.addView(this.H, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        this.I = z8Var2;
        this.n.addView(z8Var2, c8.ha.o(-1, -2));
        bo boVar = new bo(this, context, this.X, context);
        this.U = boVar;
        TLRPC.ChatFull chatFull = this.Y;
        boVar.c((chatFull == null || chatFull.linked_chat_id == 0 || this.a0) ? false : true);
        bo boVar2 = this.U;
        TLRPC.ChatFull chatFull2 = this.Y;
        org.telegram.ui.Cells.z8 z8Var3 = boVar2.e;
        boolean V = org.telegram.messenger.t3.V(boVar2.n);
        boolean t02 = org.telegram.messenger.t3.t0(boVar2.n);
        if (chatFull2 == null || chatFull2.guard_bot_id == 0) {
            z8Var3.setText(org.telegram.messenger.hd.M0(V ? 2131752302 : t02 ? 2131749402 : 2131749405, null));
        } else {
            z8Var3.setText(org.telegram.messenger.g0.Q2(org.telegram.messenger.hd.a0(null, null, V ? 2131752301 : t02 ? 2131749401 : 2131749404, "@" + org.telegram.messenger.m5.r(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).a2(Long.valueOf(chatFull2.guard_bot_id)))), org.telegram.ui.ActionBar.k6.Wl, null, new org.telegram.ui.Components.fq(26, chatFull2, this), false));
        }
        this.n.addView(this.U);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.Q = linearLayout6;
        linearLayout6.setOrientation(1);
        this.n.addView(this.Q);
        org.telegram.ui.Cells.n4 n4Var3 = new org.telegram.ui.Cells.n4(context, 23);
        this.R = n4Var3;
        n4Var3.setHeight(46);
        this.R.setText(org.telegram.messenger.hd.M0(2131745864, null));
        this.Q.addView(this.R, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
        this.S = r8Var;
        r8Var.f(org.telegram.messenger.hd.M0(2131746063, null), this.b0, false);
        this.S.setOnClickListener(new un(this, 4));
        this.Q.addView(this.S, c8.ha.o(-1, -2));
        this.T = new org.telegram.ui.Cells.z8(12, context, this.resourceProvider);
        if (!this.a0 || org.telegram.messenger.t3.n0(this.X)) {
            this.T.setText(org.telegram.messenger.hd.M0(2131746061, null));
        } else {
            this.T.setText(org.telegram.messenger.hd.M0(2131746062, null));
        }
        this.Q.addView(this.T, c8.ha.o(-1, -2));
        String K = org.telegram.messenger.t3.K(this.X, true);
        if (!this.V && K != null) {
            this.m0 = true;
            this.b.setText(K);
            this.b.setSelection(K.length());
            this.m0 = false;
        }
        h0();
        return this.fragmentView;
    }

    public final void d0(boolean z9) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().j1(-this.Z);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new fi.d3(5, this, z9)), this.classGuid);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.Z) {
                this.Y = chatFull;
                this.l0 = chatFull.exported_invite;
                h0();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.y1) {
            if ((-this.Z) == ((Long) objArr[0]).longValue()) {
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
        boolean z9;
        boolean z10;
        ArrayList<TLRPC.TL_username> arrayList;
        boolean z11;
        final go goVar = this;
        org.telegram.messenger.g0.i3(goVar.q0, 200L);
        boolean z12 = true;
        if (goVar.getParentActivity() != null) {
            String K = org.telegram.messenger.t3.K(goVar.X, true);
            if (goVar.V || (((K != null || goVar.b.length() == 0) && (K == null || K.equalsIgnoreCase(goVar.b.getText().toString()))) || goVar.b.length() == 0 || goVar.k0)) {
                if (K == null) {
                    K = "";
                }
                String obj = goVar.V ? "" : goVar.b.getText().toString();
                if (K.equals(obj)) {
                    if (!goVar.V || (arrayList = goVar.X.usernames) == null || arrayList.isEmpty()) {
                        z9 = true;
                    } else if (goVar.s0) {
                        z9 = false;
                    } else {
                        goVar.s0 = true;
                        boolean z13 = false;
                        for (int i7 = 0; i7 < goVar.X.usernames.size(); i7++) {
                            TLRPC.TL_username tL_username = goVar.X.usernames.get(i7);
                            if (tL_username != null && tL_username.active && !tL_username.editable) {
                                z13 = true;
                            }
                        }
                        if (z13) {
                            TLRPC.TL_channels_deactivateAllUsernames tL_channels_deactivateAllUsernames = new TLRPC.TL_channels_deactivateAllUsernames();
                            tL_channels_deactivateAllUsernames.channel = org.telegram.messenger.qp.i1(goVar.X);
                            goVar.getConnectionsManager().sendRequest(tL_channels_deactivateAllUsernames, new qn(goVar, 2));
                        } else {
                            goVar.s0 = false;
                        }
                        z9 = !z13;
                    }
                    if (z9) {
                        z10 = true;
                        if (z10) {
                            return;
                        }
                        TLRPC.Chat chat = goVar.X;
                        if (chat.noforwards != goVar.b0) {
                            if (!org.telegram.messenger.t3.T(chat)) {
                                goVar.g0(true);
                                final int i10 = 2;
                                goVar.getMessagesController().T(goVar.getParentActivity(), goVar.Z, goVar, new org.telegram.messenger.tr(goVar) { // from class: org.telegram.ui.sn
                                    public final /* synthetic */ go b;

                                    {
                                        this.b = goVar;
                                    }

                                    @Override // org.telegram.messenger.tr
                                    public final void run(long j3) {
                                        switch (i10) {
                                            case 0:
                                                go goVar2 = this.b;
                                                if (j3 == 0) {
                                                    goVar2.getClass();
                                                    break;
                                                } else {
                                                    goVar2.Z = j3;
                                                    goVar2.X = goVar2.getMessagesController().M0(Long.valueOf(j3));
                                                    goVar2.e0();
                                                    break;
                                                }
                                            case 1:
                                                go goVar3 = this.b;
                                                if (j3 == 0) {
                                                    goVar3.getClass();
                                                    break;
                                                } else {
                                                    goVar3.Z = j3;
                                                    goVar3.X = goVar3.getMessagesController().M0(Long.valueOf(j3));
                                                    goVar3.e0();
                                                    break;
                                                }
                                            default:
                                                if (j3 != 0) {
                                                    go goVar4 = this.b;
                                                    goVar4.Z = j3;
                                                    goVar4.X = goVar4.getMessagesController().M0(Long.valueOf(j3));
                                                    org.telegram.messenger.qp messagesController = goVar4.getMessagesController();
                                                    long j10 = -goVar4.Z;
                                                    TLRPC.Chat chat2 = goVar4.X;
                                                    boolean z14 = goVar4.b0;
                                                    chat2.noforwards = z14;
                                                    messagesController.d5(j10, 0, z14, null);
                                                    goVar4.e0();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                }, null);
                                z11 = false;
                                if (z11) {
                                    return;
                                }
                                if (goVar.U != null) {
                                    if (goVar.getParentActivity() != null) {
                                        if (!goVar.a0 && !org.telegram.messenger.t3.T(goVar.X)) {
                                            bo boVar = goVar.U;
                                            if (boVar.f || boVar.h) {
                                                final int i11 = 0;
                                                goVar.getMessagesController().T(goVar.getParentActivity(), goVar.Z, goVar, new org.telegram.messenger.tr(goVar) { // from class: org.telegram.ui.sn
                                                    public final /* synthetic */ go b;

                                                    {
                                                        this.b = goVar;
                                                    }

                                                    @Override // org.telegram.messenger.tr
                                                    public final void run(long j3) {
                                                        switch (i11) {
                                                            case 0:
                                                                go goVar2 = this.b;
                                                                if (j3 == 0) {
                                                                    goVar2.getClass();
                                                                    break;
                                                                } else {
                                                                    goVar2.Z = j3;
                                                                    goVar2.X = goVar2.getMessagesController().M0(Long.valueOf(j3));
                                                                    goVar2.e0();
                                                                    break;
                                                                }
                                                            case 1:
                                                                go goVar3 = this.b;
                                                                if (j3 == 0) {
                                                                    goVar3.getClass();
                                                                    break;
                                                                } else {
                                                                    goVar3.Z = j3;
                                                                    goVar3.X = goVar3.getMessagesController().M0(Long.valueOf(j3));
                                                                    goVar3.e0();
                                                                    break;
                                                                }
                                                            default:
                                                                if (j3 != 0) {
                                                                    go goVar4 = this.b;
                                                                    goVar4.Z = j3;
                                                                    goVar4.X = goVar4.getMessagesController().M0(Long.valueOf(j3));
                                                                    org.telegram.messenger.qp messagesController = goVar4.getMessagesController();
                                                                    long j10 = -goVar4.Z;
                                                                    TLRPC.Chat chat2 = goVar4.X;
                                                                    boolean z14 = goVar4.b0;
                                                                    chat2.noforwards = z14;
                                                                    messagesController.d5(j10, 0, z14, null);
                                                                    goVar4.e0();
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                }, null);
                                            }
                                        }
                                        if (goVar.X.join_to_send != goVar.U.f) {
                                            org.telegram.messenger.qp messagesController = goVar.getMessagesController();
                                            long j3 = goVar.Z;
                                            TLRPC.Chat chat2 = goVar.X;
                                            boolean z14 = goVar.U.f;
                                            chat2.join_to_send = z14;
                                            messagesController.getClass();
                                            TLRPC.TL_channels_toggleJoinToSend tL_channels_toggleJoinToSend = new TLRPC.TL_channels_toggleJoinToSend();
                                            tL_channels_toggleJoinToSend.channel = messagesController.h1(j3);
                                            tL_channels_toggleJoinToSend.enabled = z14;
                                            Object obj2 = null;
                                            messagesController.getConnectionsManager().sendRequest(tL_channels_toggleJoinToSend, new org.telegram.messenger.di(messagesController, obj2, obj2, 8), 64);
                                        }
                                        if (goVar.X.join_request != goVar.U.h || goVar.W) {
                                            org.telegram.messenger.qp messagesController2 = goVar.getMessagesController();
                                            long j10 = goVar.Z;
                                            TLRPC.Chat chat3 = goVar.X;
                                            boolean z15 = goVar.U.h;
                                            chat3.join_request = z15;
                                            messagesController2.c5(j10, 0L, z15, goVar.W, false, null, null);
                                        }
                                    }
                                    z12 = false;
                                }
                                if (z12) {
                                    goVar.finishFragment();
                                    return;
                                }
                                return;
                            }
                            org.telegram.messenger.qp messagesController3 = goVar.getMessagesController();
                            long j11 = -goVar.Z;
                            TLRPC.Chat chat4 = goVar.X;
                            boolean z16 = goVar.b0;
                            chat4.noforwards = z16;
                            messagesController3.d5(j11, 0, z16, null);
                        }
                        z11 = true;
                        if (z11) {
                        }
                    }
                } else if (org.telegram.messenger.t3.T(goVar.X)) {
                    org.telegram.messenger.qp messagesController4 = goVar.getMessagesController();
                    long j12 = goVar.Z;
                    rn rnVar = new rn(goVar, 1);
                    rn rnVar2 = new rn(goVar, 2);
                    messagesController4.getClass();
                    TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                    tL_channels_updateUsername.channel = messagesController4.h1(j12);
                    tL_channels_updateUsername.username = obj;
                    goVar = this;
                    messagesController4.getConnectionsManager().sendRequest(tL_channels_updateUsername, new org.telegram.messenger.mm(messagesController4, j12, obj, rnVar, this, tL_channels_updateUsername, rnVar2), 64);
                } else {
                    final int i12 = 1;
                    goVar.getMessagesController().T(goVar.getParentActivity(), goVar.Z, goVar, new org.telegram.messenger.tr(goVar) { // from class: org.telegram.ui.sn
                        public final /* synthetic */ go b;

                        {
                            this.b = goVar;
                        }

                        @Override // org.telegram.messenger.tr
                        public final void run(long j32) {
                            switch (i12) {
                                case 0:
                                    go goVar2 = this.b;
                                    if (j32 == 0) {
                                        goVar2.getClass();
                                        break;
                                    } else {
                                        goVar2.Z = j32;
                                        goVar2.X = goVar2.getMessagesController().M0(Long.valueOf(j32));
                                        goVar2.e0();
                                        break;
                                    }
                                case 1:
                                    go goVar3 = this.b;
                                    if (j32 == 0) {
                                        goVar3.getClass();
                                        break;
                                    } else {
                                        goVar3.Z = j32;
                                        goVar3.X = goVar3.getMessagesController().M0(Long.valueOf(j32));
                                        goVar3.e0();
                                        break;
                                    }
                                default:
                                    if (j32 != 0) {
                                        go goVar4 = this.b;
                                        goVar4.Z = j32;
                                        goVar4.X = goVar4.getMessagesController().M0(Long.valueOf(j32));
                                        org.telegram.messenger.qp messagesController5 = goVar4.getMessagesController();
                                        long j102 = -goVar4.Z;
                                        TLRPC.Chat chat22 = goVar4.X;
                                        boolean z142 = goVar4.b0;
                                        chat22.noforwards = z142;
                                        messagesController5.d5(j102, 0, z142, null);
                                        goVar4.e0();
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, null);
                }
            } else {
                Vibrator vibrator = (Vibrator) goVar.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                org.telegram.messenger.g0.F3(goVar.h);
                goVar.g0(false);
            }
        }
        z10 = false;
        if (z10) {
        }
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        ug.i0 i0Var = new ug.i0(2, this.currentAccount, getParentActivity(), this, null);
        i0Var.n2 = this.a0;
        i0Var.z2 = new rn(this, 0);
        showDialog(i0Var);
    }

    public final void g0(boolean z9) {
        if (!z9) {
            org.telegram.messenger.g0.r(this.q0);
        }
        org.telegram.ui.ActionBar.b5 b5Var = this.r;
        if (b5Var != null) {
            b5Var.b(z9);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.hm0 getScrollViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i7 = org.telegram.ui.ActionBar.k6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4, new Class[]{org.telegram.ui.Cells.w9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        LinearLayout linearLayout = this.s;
        int i10 = org.telegram.ui.ActionBar.k6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.D, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.S, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.S, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.S, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.y, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.g0, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.w, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.x, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.H, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        return arrayList;
    }

    public final void h0() {
        if (this.J == null) {
            return;
        }
        int i7 = 8;
        if (this.V || this.c0 || !getUserConfig().q()) {
            org.telegram.ui.Cells.z8 z8Var = this.d;
            int i10 = org.telegram.ui.ActionBar.k6.B6;
            z8Var.setTag(Integer.valueOf(i10));
            org.telegram.ui.ActionBar.r6.V(this.d.getTextView(), i10, null);
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
                this.d.setText(org.telegram.messenger.hd.M0(this.V ? 2131752327 : 2131752267, null));
                this.e.setText(this.V ? org.telegram.messenger.hd.M0(2131752403, null) : org.telegram.messenger.hd.M0(2131752385, null));
            } else {
                this.d.setText(org.telegram.messenger.hd.M0(this.V ? 2131748638 : 2131748635, null));
                this.e.setText(this.V ? org.telegram.messenger.hd.M0(2131752403, null) : org.telegram.messenger.hd.M0(2131752385, null));
            }
            this.E.setVisibility(this.V ? 8 : 0);
            this.F.setVisibility(this.V ? 0 : 8);
            this.Q.setVisibility(0);
            this.H.setVisibility(0);
            this.I.setVisibility(0);
            this.D.setPadding(0, 0, 0, this.V ? 0 : org.telegram.messenger.g0.L(7.0f));
            org.telegram.ui.Components.q70 q70Var = this.G;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.l0;
            q70Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            this.G.c(this.l0, this.Z);
            zn znVar = this.h;
            znVar.setVisibility((this.V || znVar.a.length() == 0) ? 8 : 0);
            TLRPC.ChatFull N0 = getMessagesController().N0(this.Z);
            this.I.setText(org.telegram.messenger.hd.M0((N0 != null && N0.paid_media_allowed && org.telegram.messenger.t3.V(getMessagesController().M0(Long.valueOf(this.Z)))) ? 2131748692 : 2131748693, null));
        } else {
            this.d.setText(org.telegram.messenger.hd.M0(2131752533, null));
            org.telegram.ui.Cells.z8 z8Var2 = this.d;
            int i11 = org.telegram.ui.ActionBar.k6.p7;
            z8Var2.setTag(Integer.valueOf(i11));
            org.telegram.ui.ActionBar.r6.V(this.d.getTextView(), i11, null);
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
        bo boVar = this.U;
        if (boVar != null) {
            boVar.setVisibility((!this.a0 || this.V) ? 0 : 8);
            bo boVar2 = this.U;
            TLRPC.ChatFull chatFull = this.Y;
            boVar2.c((chatFull == null || chatFull.linked_chat_id == 0 || this.a0) ? false : true);
        }
        fo foVar = this.K;
        if (foVar != null) {
            if (!this.V && !this.N.isEmpty()) {
                i7 = 0;
            }
            foVar.setVisibility(i7);
        }
        b0();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyVisible() {
        ah.i iVar;
        super.onBecomeFullyVisible();
        if (!this.n0 || (iVar = this.b) == null) {
            return;
        }
        iVar.requestFocus();
        org.telegram.messenger.g0.K3(this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004d, code lost:
    
        if (r2 == null) goto L10;
     */
    @Override // org.telegram.ui.ActionBar.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        boolean z9 = this.n0;
        ArrayList arrayList = this.N;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.Z));
        this.X = M0;
        if (M0 == null) {
            TLRPC.Chat P = getMessagesStorage().P(this.Z);
            this.X = P;
            if (P != null) {
                getMessagesController().Q3(this.X, true);
                if (this.Y == null) {
                    TLRPC.ChatFull F0 = getMessagesStorage().F0(this.Z, org.telegram.messenger.t3.T(this.X), new CountDownLatch(1), false, false, 0);
                    this.Y = F0;
                }
            }
            return false;
        }
        this.V = (z9 || org.telegram.messenger.t3.t0(this.X)) ? false : true;
        this.a0 = org.telegram.messenger.t3.T(this.X) && !this.X.megagroup;
        TLRPC.Chat chat = this.X;
        this.b0 = chat.noforwards;
        if ((z9 && !org.telegram.messenger.t3.t0(chat)) || (this.V && this.X.creator)) {
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            getConnectionsManager().sendRequest(tL_channels_checkUsername, new qn(this, 3));
        }
        if (this.V && this.Y != null) {
            getMessagesController().V2(this.classGuid, this.Z, true);
        }
        if (this.X != null) {
            this.M.clear();
            arrayList.clear();
            for (int i7 = 0; i7 < this.X.usernames.size(); i7++) {
                if (this.X.usernames.get(i7).active) {
                    arrayList.add(this.X.usernames.get(i7));
                }
            }
            for (int i10 = 0; i10 < this.X.usernames.size(); i10++) {
                if (!this.X.usernames.get(i10).active) {
                    arrayList.add(this.X.usernames.get(i10));
                }
            }
        }
        getNotificationCenter().c(this, org.telegram.messenger.qs.T);
        getNotificationCenter().c(this, org.telegram.messenger.qs.y1);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.qs.T);
        getNotificationCenter().n(this, org.telegram.messenger.qs.y1);
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        TLRPC.ChatFull chatFull = this.Y;
        if (chatFull != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
            this.l0 = tL_chatInviteExported;
            this.G.setLink(tL_chatInviteExported == null ? null : tL_chatInviteExported.link);
            this.G.c(this.l0, this.Z);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Cells.t4 t4Var = this.g0;
            if (t4Var != null && t4Var.getChildCount() > 0 && (this.g0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.g0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h6, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            super.onThemeColorsChanged();
            LinearLayout linearLayout = this.y;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = this.y.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Cells.n) {
                        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                        nVar.d.q(nVar.f);
                        nVar.a.invalidate();
                    }
                }
            }
            org.telegram.ui.Components.m50 m50Var = this.p0;
            if (m50Var != null) {
                m50Var.updateColors();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
