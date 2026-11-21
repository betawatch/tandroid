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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class jo extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public LinearLayout E;
    public LinearLayout F;
    public LinearLayout G;
    public org.telegram.ui.Components.g80 H;
    public org.telegram.ui.Cells.n8 I;
    public org.telegram.ui.Cells.a9 J;
    public org.telegram.ui.Cells.z6 K;
    public io L;
    public boolean M;
    public ArrayList N;
    public ArrayList O;
    public ia P;
    public ArrayList Q;
    public LinearLayout R;
    public org.telegram.ui.Cells.o4 S;
    public org.telegram.ui.Cells.s8 T;
    public org.telegram.ui.Cells.a9 U;
    public fo V;
    public boolean W;
    public boolean X;
    public TLRPC.Chat Y;
    public TLRPC.ChatFull Z;
    public ao a;
    public long a0;
    public ah.i b;
    public boolean b0;
    public EditTextBoldCursor c;
    public boolean c0;
    public org.telegram.ui.Cells.a9 d;
    public boolean d0;
    public org.telegram.ui.Cells.o4 e;
    public boolean e0;
    public org.telegram.ui.Cells.o4 f;
    public org.telegram.ui.Cells.z6 f0;
    public ArrayList g0;
    public co h;
    public org.telegram.ui.Cells.u4 h0;
    public int i0;
    public String j0;
    public eh k0;
    public boolean l0;
    public TLRPC.TL_chatInviteExported m0;
    public org.telegram.ui.Components.vm0 n;
    public boolean n0;
    public boolean o0;
    public HashMap p0;
    public org.telegram.ui.Components.a60 q0;
    public org.telegram.ui.ActionBar.c5 r;
    public tn r0;
    public LinearLayout s;
    public Boolean s0;
    public boolean t0;
    public org.telegram.ui.Cells.i6 w;
    public org.telegram.ui.Cells.i6 x;
    public LinearLayout y;

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
    }

    public final void b0() {
        boolean z10;
        org.telegram.ui.ActionBar.c5 c5Var = this.r;
        if (!this.W && this.b.length() <= 0) {
            ArrayList arrayList = this.O;
            z10 = false;
            if (arrayList != null) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i7);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            c5Var.a(z10, true);
        }
        z10 = true;
        c5Var.a(z10, true);
    }

    public final boolean c0(String str) {
        if (str == null || str.length() <= 0) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
        }
        eh ehVar = this.k0;
        if (ehVar != null) {
            org.telegram.messenger.g0.r(ehVar);
            this.k0 = null;
            this.j0 = null;
            if (this.i0 != 0) {
                getConnectionsManager().cancelRequest(this.i0, true);
            }
        }
        this.l0 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                this.h.setText(org.telegram.messenger.gd.N0(2131748716, null));
                this.h.setTextColorByKey(org.telegram.ui.ActionBar.m6.p7);
                return false;
            }
            for (int i7 = 0; i7 < str.length(); i7++) {
                char charAt = str.charAt(i7);
                if (i7 == 0 && charAt >= '0' && charAt <= '9') {
                    if (this.b0) {
                        this.h.setText(org.telegram.messenger.gd.N0(2131748712, null));
                    } else {
                        this.h.setText(org.telegram.messenger.gd.N0(2131748711, null));
                    }
                    this.h.setTextColorByKey(org.telegram.ui.ActionBar.m6.p7);
                    return false;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.h.setText(org.telegram.messenger.gd.N0(2131748716, null));
                    this.h.setTextColorByKey(org.telegram.ui.ActionBar.m6.p7);
                    return false;
                }
            }
        }
        if (str == null || str.length() < 4) {
            if (this.b0) {
                this.h.setText(org.telegram.messenger.gd.N0(2131748714, null));
            } else {
                this.h.setText(org.telegram.messenger.gd.N0(2131748713, null));
            }
            this.h.setTextColorByKey(org.telegram.ui.ActionBar.m6.p7);
            return false;
        }
        if (str.length() > 32) {
            this.h.setText(org.telegram.messenger.gd.N0(2131748715, null));
            this.h.setTextColorByKey(org.telegram.ui.ActionBar.m6.p7);
            return false;
        }
        this.h.setText(org.telegram.messenger.gd.N0(2131748729, null));
        this.h.setTextColorByKey(org.telegram.ui.ActionBar.m6.F6);
        this.j0 = str;
        eh ehVar2 = new eh(7, this, str);
        this.k0 = ehVar2;
        org.telegram.messenger.g0.h3(ehVar2, 300L);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new zn(this, context));
        this.r = this.simpleActionBar.s(org.telegram.messenger.gd.N0(2131745750, null));
        this.n = new org.telegram.ui.Components.vm0(context);
        this.a = new ao(this, context, this.n, this.resourceProvider);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(this.a, c8.ma.g());
        this.fragmentView = frameLayout;
        this.a.setFillViewport(true);
        this.a.setDrawBackground(true);
        this.a.setOverScrollMode(0);
        this.a.addView(this.n, new FrameLayout.LayoutParams(-1, -2));
        this.n.setOrientation(1);
        boolean z10 = this.o0;
        if (z10) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131743687, null));
        } else if (this.b0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131752285, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131749207, null));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.s = linearLayout;
        linearLayout.setOrientation(1);
        this.n.addView(this.s, c8.ma.o(-1, -2));
        org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context, 23);
        this.f = o4Var;
        o4Var.setHeight(46);
        if (this.b0) {
            this.f.setText(org.telegram.messenger.gd.N0(2131752263, null));
        } else {
            this.f.setText(org.telegram.messenger.gd.N0(2131749198, null));
        }
        this.s.addView(this.f);
        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, false);
        this.x = i6Var;
        if (this.b0) {
            i6Var.b(org.telegram.messenger.gd.N0(2131752317, null), org.telegram.messenger.gd.N0(2131752316, null), false, this.W);
        } else {
            i6Var.b(org.telegram.messenger.gd.N0(2131748448, null), org.telegram.messenger.gd.N0(2131748447, null), false, this.W);
        }
        this.s.addView(this.x, c8.ma.o(-1, -2));
        this.x.setOnClickListener(new xn(this, i7));
        org.telegram.ui.Cells.i6 i6Var2 = new org.telegram.ui.Cells.i6(context, false);
        this.w = i6Var2;
        if (this.b0) {
            i6Var2.b(org.telegram.messenger.gd.N0(2131752306, null), org.telegram.messenger.gd.N0(2131752303, null), false, !this.W);
        } else {
            i6Var2.b(org.telegram.messenger.gd.N0(2131748445, null), org.telegram.messenger.gd.N0(2131748444, null), false, !this.W);
        }
        this.s.addView(this.w, c8.ma.o(-1, -2));
        this.w.setOnClickListener(new xn(this, 2));
        org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
        this.K = z6Var;
        this.n.addView(z6Var, c8.ma.o(-1, -2));
        if (z10) {
            this.x.setVisibility(8);
            this.w.setVisibility(8);
            this.K.setVisibility(8);
            this.f.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.n.addView(this.E, c8.ma.o(-1, -2));
        org.telegram.ui.Cells.o4 o4Var2 = new org.telegram.ui.Cells.o4(context, 23);
        this.e = o4Var2;
        this.E.addView(o4Var2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.F = linearLayout3;
        linearLayout3.setOrientation(0);
        this.E.addView(this.F, c8.ma.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().X2 + "/");
        this.c.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.c;
        int i10 = org.telegram.ui.ActionBar.m6.H6;
        org.telegram.ui.ActionBar.t6.D(editTextBoldCursor2, i10, null);
        EditTextBoldCursor editTextBoldCursor3 = this.c;
        int i11 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(editTextBoldCursor3, i11, null);
        this.c.setMaxLines(1);
        this.c.setLines(1);
        this.c.setEnabled(false);
        this.c.setBackground(null);
        this.c.setPadding(0, 0, 0, 0);
        this.c.setSingleLine(true);
        this.c.setInputType(163840);
        this.c.setImeOptions(6);
        this.F.addView(this.c, c8.ma.o(-2, 36));
        ah.i iVar = new ah.i(5, context, this);
        this.b = iVar;
        iVar.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.t6.D(this.b, i10, null);
        org.telegram.ui.ActionBar.t6.U(this.b, i11, null);
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setBackground(null);
        this.b.setPadding(0, 0, 0, 0);
        this.b.setSingleLine(true);
        this.b.setInputType(163872);
        this.b.setImeOptions(6);
        this.b.setHint(org.telegram.messenger.gd.N0(2131752254, null));
        org.telegram.ui.ActionBar.t6.v(this.b, i11, null);
        this.b.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.b.setCursorWidth(1.5f);
        this.F.addView(this.b, c8.ma.o(-1, 36));
        this.b.addTextChangedListener(new m0(this, 4));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.G = linearLayout4;
        linearLayout4.setOrientation(1);
        this.E.addView(this.G, c8.ma.o(-1, -2));
        org.telegram.ui.Components.g80 g80Var = new org.telegram.ui.Components.g80(context, this, null, true, org.telegram.messenger.v3.T(this.Y));
        this.H = g80Var;
        g80Var.setDelegate(new bo(this, context));
        this.H.d(0, null, false);
        this.G.addView(this.H);
        co coVar = new co(this, context, this.resourceProvider);
        this.h = coVar;
        coVar.setBottomPadding(6);
        this.n.addView(this.h, c8.ma.o(-2, -2));
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(12, context, this.resourceProvider);
        this.d = a9Var;
        a9Var.setImportantForAccessibility(1);
        this.n.addView(this.d, c8.ma.o(-1, -2));
        org.telegram.ui.Cells.u4 u4Var = new org.telegram.ui.Cells.u4(context);
        this.h0 = u4Var;
        this.n.addView(u4Var, c8.ma.o(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.y = linearLayout5;
        linearLayout5.setOrientation(1);
        this.n.addView(this.y, c8.ma.o(-1, -2));
        org.telegram.ui.Cells.z6 z6Var2 = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
        this.f0 = z6Var2;
        this.n.addView(z6Var2, c8.ma.o(-1, -2));
        org.telegram.ui.Components.vm0 vm0Var = this.n;
        io ioVar = new io(this, context);
        this.L = ioVar;
        vm0Var.addView(ioVar, c8.ma.o(-1, -2));
        this.L.setVisibility((this.W || this.O.isEmpty()) ? 8 : 0);
        org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(context);
        this.I = n8Var;
        n8Var.o(R.drawable.msg_link2, org.telegram.messenger.gd.N0(2131748502, null), false);
        this.I.setOnClickListener(new xn(this, 3));
        this.n.addView(this.I, c8.ma.o(-1, -2));
        org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(12, context, this.resourceProvider);
        this.J = a9Var2;
        this.n.addView(a9Var2, c8.ma.o(-1, -2));
        fo foVar = new fo(this, context, this.Y, context);
        this.V = foVar;
        TLRPC.ChatFull chatFull = this.Z;
        foVar.c((chatFull == null || chatFull.linked_chat_id == 0 || this.b0) ? false : true);
        fo foVar2 = this.V;
        TLRPC.ChatFull chatFull2 = this.Z;
        org.telegram.ui.Cells.a9 a9Var3 = foVar2.e;
        boolean V = org.telegram.messenger.v3.V(foVar2.n);
        boolean t02 = org.telegram.messenger.v3.t0(foVar2.n);
        if (chatFull2 == null || chatFull2.guard_bot_id == 0) {
            a9Var3.setText(org.telegram.messenger.gd.N0(V ? 2131752290 : t02 ? 2131749210 : 2131749213, null));
        } else {
            a9Var3.setText(org.telegram.messenger.g0.Q2(org.telegram.messenger.gd.a0(null, null, V ? 2131752289 : t02 ? 2131749209 : 2131749212, "@" + org.telegram.messenger.n5.r(org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).c2(Long.valueOf(chatFull2.guard_bot_id)))), org.telegram.ui.ActionBar.m6.Zl, null, new org.telegram.ui.Components.ou(18, chatFull2, this), false));
        }
        this.n.addView(this.V);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.R = linearLayout6;
        linearLayout6.setOrientation(1);
        this.n.addView(this.R);
        org.telegram.ui.Cells.o4 o4Var3 = new org.telegram.ui.Cells.o4(context, 23);
        this.S = o4Var3;
        o4Var3.setHeight(46);
        this.S.setText(org.telegram.messenger.gd.N0(2131745667, null));
        this.R.addView(this.S, c8.ma.o(-1, -2));
        org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context);
        this.T = s8Var;
        s8Var.f(org.telegram.messenger.gd.N0(2131745866, null), this.c0, false);
        this.T.setOnClickListener(new xn(this, 4));
        this.R.addView(this.T, c8.ma.o(-1, -2));
        this.U = new org.telegram.ui.Cells.a9(12, context, this.resourceProvider);
        if (!this.b0 || org.telegram.messenger.v3.n0(this.Y)) {
            this.U.setText(org.telegram.messenger.gd.N0(2131745864, null));
        } else {
            this.U.setText(org.telegram.messenger.gd.N0(2131745865, null));
        }
        this.R.addView(this.U, c8.ma.o(-1, -2));
        String K = org.telegram.messenger.v3.K(this.Y, true);
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
        tL_messages_exportChatInvite.peer = getMessagesController().l1(-this.a0);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new hi.b3(5, this, z10)), this.classGuid);
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.a0) {
                this.Z = chatFull;
                this.m0 = chatFull.exported_invite;
                h0();
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.y1) {
            if ((-this.a0) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
                if (r4Var == null || r4Var.getLastFragment() != this) {
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
        final jo joVar = this;
        org.telegram.messenger.g0.h3(joVar.r0, 200L);
        boolean z13 = true;
        if (joVar.getParentActivity() != null) {
            String K = org.telegram.messenger.v3.K(joVar.Y, true);
            if (joVar.W || (((K != null || joVar.b.length() == 0) && (K == null || K.equalsIgnoreCase(joVar.b.getText().toString()))) || joVar.b.length() == 0 || joVar.l0)) {
                if (K == null) {
                    K = "";
                }
                String obj = joVar.W ? "" : joVar.b.getText().toString();
                if (K.equals(obj)) {
                    if (!joVar.W || (arrayList = joVar.Y.usernames) == null || arrayList.isEmpty()) {
                        z10 = true;
                    } else if (joVar.t0) {
                        z10 = false;
                    } else {
                        joVar.t0 = true;
                        boolean z14 = false;
                        for (int i7 = 0; i7 < joVar.Y.usernames.size(); i7++) {
                            TLRPC.TL_username tL_username = joVar.Y.usernames.get(i7);
                            if (tL_username != null && tL_username.active && !tL_username.editable) {
                                z14 = true;
                            }
                        }
                        if (z14) {
                            TLRPC.TL_channels_deactivateAllUsernames tL_channels_deactivateAllUsernames = new TLRPC.TL_channels_deactivateAllUsernames();
                            tL_channels_deactivateAllUsernames.channel = org.telegram.messenger.mp.k1(joVar.Y);
                            joVar.getConnectionsManager().sendRequest(tL_channels_deactivateAllUsernames, new sn(joVar, 2));
                        } else {
                            joVar.t0 = false;
                        }
                        z10 = !z14;
                    }
                    if (z10) {
                        z11 = true;
                        if (z11) {
                            return;
                        }
                        TLRPC.Chat chat = joVar.Y;
                        if (chat.noforwards != joVar.c0) {
                            if (!org.telegram.messenger.v3.T(chat)) {
                                joVar.g0(true);
                                final int i10 = 2;
                                joVar.getMessagesController().T(joVar.getParentActivity(), joVar.a0, joVar, new org.telegram.messenger.or(joVar) { // from class: org.telegram.ui.un
                                    public final /* synthetic */ jo b;

                                    {
                                        this.b = joVar;
                                    }

                                    @Override // org.telegram.messenger.or
                                    public final void run(long j3) {
                                        switch (i10) {
                                            case 0:
                                                jo joVar2 = this.b;
                                                if (j3 == 0) {
                                                    joVar2.getClass();
                                                    break;
                                                } else {
                                                    joVar2.a0 = j3;
                                                    joVar2.Y = joVar2.getMessagesController().O0(Long.valueOf(j3));
                                                    joVar2.e0();
                                                    break;
                                                }
                                            case 1:
                                                jo joVar3 = this.b;
                                                if (j3 == 0) {
                                                    joVar3.getClass();
                                                    break;
                                                } else {
                                                    joVar3.a0 = j3;
                                                    joVar3.Y = joVar3.getMessagesController().O0(Long.valueOf(j3));
                                                    joVar3.e0();
                                                    break;
                                                }
                                            default:
                                                if (j3 != 0) {
                                                    jo joVar4 = this.b;
                                                    joVar4.a0 = j3;
                                                    joVar4.Y = joVar4.getMessagesController().O0(Long.valueOf(j3));
                                                    org.telegram.messenger.mp messagesController = joVar4.getMessagesController();
                                                    long j10 = -joVar4.a0;
                                                    TLRPC.Chat chat2 = joVar4.Y;
                                                    boolean z15 = joVar4.c0;
                                                    chat2.noforwards = z15;
                                                    messagesController.p5(j10, 0, z15, null);
                                                    joVar4.e0();
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
                                if (joVar.V != null) {
                                    if (joVar.getParentActivity() != null) {
                                        if (!joVar.b0 && !org.telegram.messenger.v3.T(joVar.Y)) {
                                            fo foVar = joVar.V;
                                            if (foVar.f || foVar.h) {
                                                final int i11 = 0;
                                                joVar.getMessagesController().T(joVar.getParentActivity(), joVar.a0, joVar, new org.telegram.messenger.or(joVar) { // from class: org.telegram.ui.un
                                                    public final /* synthetic */ jo b;

                                                    {
                                                        this.b = joVar;
                                                    }

                                                    @Override // org.telegram.messenger.or
                                                    public final void run(long j3) {
                                                        switch (i11) {
                                                            case 0:
                                                                jo joVar2 = this.b;
                                                                if (j3 == 0) {
                                                                    joVar2.getClass();
                                                                    break;
                                                                } else {
                                                                    joVar2.a0 = j3;
                                                                    joVar2.Y = joVar2.getMessagesController().O0(Long.valueOf(j3));
                                                                    joVar2.e0();
                                                                    break;
                                                                }
                                                            case 1:
                                                                jo joVar3 = this.b;
                                                                if (j3 == 0) {
                                                                    joVar3.getClass();
                                                                    break;
                                                                } else {
                                                                    joVar3.a0 = j3;
                                                                    joVar3.Y = joVar3.getMessagesController().O0(Long.valueOf(j3));
                                                                    joVar3.e0();
                                                                    break;
                                                                }
                                                            default:
                                                                if (j3 != 0) {
                                                                    jo joVar4 = this.b;
                                                                    joVar4.a0 = j3;
                                                                    joVar4.Y = joVar4.getMessagesController().O0(Long.valueOf(j3));
                                                                    org.telegram.messenger.mp messagesController = joVar4.getMessagesController();
                                                                    long j10 = -joVar4.a0;
                                                                    TLRPC.Chat chat2 = joVar4.Y;
                                                                    boolean z15 = joVar4.c0;
                                                                    chat2.noforwards = z15;
                                                                    messagesController.p5(j10, 0, z15, null);
                                                                    joVar4.e0();
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                }, null);
                                            }
                                        }
                                        if (joVar.Y.join_to_send != joVar.V.f) {
                                            org.telegram.messenger.mp messagesController = joVar.getMessagesController();
                                            long j3 = joVar.a0;
                                            TLRPC.Chat chat2 = joVar.Y;
                                            boolean z15 = joVar.V.f;
                                            chat2.join_to_send = z15;
                                            messagesController.getClass();
                                            TLRPC.TL_channels_toggleJoinToSend tL_channels_toggleJoinToSend = new TLRPC.TL_channels_toggleJoinToSend();
                                            tL_channels_toggleJoinToSend.channel = messagesController.j1(j3);
                                            tL_channels_toggleJoinToSend.enabled = z15;
                                            Object obj2 = null;
                                            messagesController.getConnectionsManager().sendRequest(tL_channels_toggleJoinToSend, new org.telegram.messenger.ci(messagesController, obj2, obj2, 8), 64);
                                        }
                                        if (joVar.Y.join_request != joVar.V.h || joVar.X) {
                                            org.telegram.messenger.mp messagesController2 = joVar.getMessagesController();
                                            long j10 = joVar.a0;
                                            TLRPC.Chat chat3 = joVar.Y;
                                            boolean z16 = joVar.V.h;
                                            chat3.join_request = z16;
                                            messagesController2.o5(j10, 0L, z16, joVar.X, false, null, null);
                                        }
                                    }
                                    z13 = false;
                                }
                                if (z13) {
                                    joVar.finishFragment();
                                    return;
                                }
                                return;
                            }
                            org.telegram.messenger.mp messagesController3 = joVar.getMessagesController();
                            long j11 = -joVar.a0;
                            TLRPC.Chat chat4 = joVar.Y;
                            boolean z17 = joVar.c0;
                            chat4.noforwards = z17;
                            messagesController3.p5(j11, 0, z17, null);
                        }
                        z12 = true;
                        if (z12) {
                        }
                    }
                } else if (org.telegram.messenger.v3.T(joVar.Y)) {
                    org.telegram.messenger.mp messagesController4 = joVar.getMessagesController();
                    long j12 = joVar.a0;
                    tn tnVar = new tn(joVar, 1);
                    tn tnVar2 = new tn(joVar, 2);
                    messagesController4.getClass();
                    TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                    tL_channels_updateUsername.channel = messagesController4.j1(j12);
                    tL_channels_updateUsername.username = obj;
                    joVar = this;
                    messagesController4.getConnectionsManager().sendRequest(tL_channels_updateUsername, new org.telegram.messenger.dm(messagesController4, j12, obj, tnVar, this, tL_channels_updateUsername, tnVar2), 64);
                } else {
                    final int i12 = 1;
                    joVar.getMessagesController().T(joVar.getParentActivity(), joVar.a0, joVar, new org.telegram.messenger.or(joVar) { // from class: org.telegram.ui.un
                        public final /* synthetic */ jo b;

                        {
                            this.b = joVar;
                        }

                        @Override // org.telegram.messenger.or
                        public final void run(long j32) {
                            switch (i12) {
                                case 0:
                                    jo joVar2 = this.b;
                                    if (j32 == 0) {
                                        joVar2.getClass();
                                        break;
                                    } else {
                                        joVar2.a0 = j32;
                                        joVar2.Y = joVar2.getMessagesController().O0(Long.valueOf(j32));
                                        joVar2.e0();
                                        break;
                                    }
                                case 1:
                                    jo joVar3 = this.b;
                                    if (j32 == 0) {
                                        joVar3.getClass();
                                        break;
                                    } else {
                                        joVar3.a0 = j32;
                                        joVar3.Y = joVar3.getMessagesController().O0(Long.valueOf(j32));
                                        joVar3.e0();
                                        break;
                                    }
                                default:
                                    if (j32 != 0) {
                                        jo joVar4 = this.b;
                                        joVar4.a0 = j32;
                                        joVar4.Y = joVar4.getMessagesController().O0(Long.valueOf(j32));
                                        org.telegram.messenger.mp messagesController5 = joVar4.getMessagesController();
                                        long j102 = -joVar4.a0;
                                        TLRPC.Chat chat22 = joVar4.Y;
                                        boolean z152 = joVar4.c0;
                                        chat22.noforwards = z152;
                                        messagesController5.p5(j102, 0, z152, null);
                                        joVar4.e0();
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, null);
                }
            } else {
                Vibrator vibrator = (Vibrator) joVar.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                org.telegram.messenger.g0.D3(joVar.h);
                joVar.g0(false);
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
        ug.k0 k0Var = new ug.k0(2, this.currentAccount, getParentActivity(), this, null);
        k0Var.r2 = this.b0;
        k0Var.D2 = new tn(this, 0);
        showDialog(k0Var);
    }

    public final void g0(boolean z10) {
        if (!z10) {
            org.telegram.messenger.g0.r(this.r0);
        }
        org.telegram.ui.ActionBar.c5 c5Var = this.r;
        if (c5Var != null) {
            c5Var.b(z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.Components.wm0 getScrollViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i7 = org.telegram.ui.ActionBar.m6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 4, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        LinearLayout linearLayout = this.s;
        int i10 = org.telegram.ui.ActionBar.m6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.E, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.T, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.T, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.T, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.y, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h0, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.w, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.x, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.I, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        return arrayList;
    }

    public final void h0() {
        if (this.K == null) {
            return;
        }
        int i7 = 8;
        if (this.W || this.d0 || !getUserConfig().q()) {
            org.telegram.ui.Cells.a9 a9Var = this.d;
            int i10 = org.telegram.ui.ActionBar.m6.B6;
            a9Var.setTag(Integer.valueOf(i10));
            org.telegram.ui.ActionBar.t6.U(this.d.getTextView(), i10, null);
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
                this.d.setText(org.telegram.messenger.gd.N0(this.W ? 2131752315 : 2131752255, null));
                this.e.setText(this.W ? org.telegram.messenger.gd.N0(2131752391, null) : org.telegram.messenger.gd.N0(2131752373, null));
            } else {
                this.d.setText(org.telegram.messenger.gd.N0(this.W ? 2131748446 : 2131748443, null));
                this.e.setText(this.W ? org.telegram.messenger.gd.N0(2131752391, null) : org.telegram.messenger.gd.N0(2131752373, null));
            }
            this.F.setVisibility(this.W ? 8 : 0);
            this.G.setVisibility(this.W ? 0 : 8);
            this.R.setVisibility(0);
            this.I.setVisibility(0);
            this.J.setVisibility(0);
            this.E.setPadding(0, 0, 0, this.W ? 0 : org.telegram.messenger.g0.L(7.0f));
            org.telegram.ui.Components.g80 g80Var = this.H;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.m0;
            g80Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            this.H.c(this.m0, this.a0);
            co coVar = this.h;
            coVar.setVisibility((this.W || coVar.a.length() == 0) ? 8 : 0);
            TLRPC.ChatFull P0 = getMessagesController().P0(this.a0);
            this.J.setText(org.telegram.messenger.gd.N0((P0 != null && P0.paid_media_allowed && org.telegram.messenger.v3.V(getMessagesController().O0(Long.valueOf(this.a0)))) ? 2131748500 : 2131748501, null));
        } else {
            this.d.setText(org.telegram.messenger.gd.N0(2131752521, null));
            org.telegram.ui.Cells.a9 a9Var2 = this.d;
            int i11 = org.telegram.ui.ActionBar.m6.p7;
            a9Var2.setTag(Integer.valueOf(i11));
            org.telegram.ui.ActionBar.t6.U(this.d.getTextView(), i11, null);
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
        fo foVar = this.V;
        if (foVar != null) {
            foVar.setVisibility((!this.b0 || this.W) ? 0 : 8);
            fo foVar2 = this.V;
            TLRPC.ChatFull chatFull = this.Z;
            foVar2.c((chatFull == null || chatFull.linked_chat_id == 0 || this.b0) ? false : true);
        }
        io ioVar = this.L;
        if (ioVar != null) {
            if (!this.W && !this.O.isEmpty()) {
                i7 = 0;
            }
            ioVar.setVisibility(i7);
        }
        b0();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onBecomeFullyVisible() {
        ah.i iVar;
        super.onBecomeFullyVisible();
        if (!this.o0 || (iVar = this.b) == null) {
            return;
        }
        iVar.requestFocus();
        org.telegram.messenger.g0.I3(this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004d, code lost:
    
        if (r2 == null) goto L10;
     */
    @Override // org.telegram.ui.ActionBar.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        boolean z10 = this.o0;
        ArrayList arrayList = this.O;
        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.a0));
        this.Y = O0;
        if (O0 == null) {
            TLRPC.Chat P = getMessagesStorage().P(this.a0);
            this.Y = P;
            if (P != null) {
                getMessagesController().X3(this.Y, true);
                if (this.Z == null) {
                    TLRPC.ChatFull F0 = getMessagesStorage().F0(this.a0, org.telegram.messenger.v3.T(this.Y), new CountDownLatch(1), false, false, 0);
                    this.Z = F0;
                }
            }
            return false;
        }
        this.W = (z10 || org.telegram.messenger.v3.t0(this.Y)) ? false : true;
        this.b0 = org.telegram.messenger.v3.T(this.Y) && !this.Y.megagroup;
        TLRPC.Chat chat = this.Y;
        this.c0 = chat.noforwards;
        if ((z10 && !org.telegram.messenger.v3.t0(chat)) || (this.W && this.Y.creator)) {
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            getConnectionsManager().sendRequest(tL_channels_checkUsername, new sn(this, 3));
        }
        if (this.W && this.Z != null) {
            getMessagesController().b3(this.classGuid, this.a0, true);
        }
        if (this.Y != null) {
            this.N.clear();
            arrayList.clear();
            for (int i7 = 0; i7 < this.Y.usernames.size(); i7++) {
                if (this.Y.usernames.get(i7).active) {
                    arrayList.add(this.Y.usernames.get(i7));
                }
            }
            for (int i10 = 0; i10 < this.Y.usernames.size(); i10++) {
                if (!this.Y.usernames.get(i10).active) {
                    arrayList.add(this.Y.usernames.get(i10));
                }
            }
        }
        getNotificationCenter().c(this, org.telegram.messenger.ks.T);
        getNotificationCenter().c(this, org.telegram.messenger.ks.y1);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ks.T);
        getNotificationCenter().n(this, org.telegram.messenger.ks.y1);
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        TLRPC.ChatFull chatFull = this.Z;
        if (chatFull != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
            this.m0 = tL_chatInviteExported;
            this.H.setLink(tL_chatInviteExported == null ? null : tL_chatInviteExported.link);
            this.H.c(this.m0, this.a0);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Cells.u4 u4Var = this.h0;
            if (u4Var != null && u4Var.getChildCount() > 0 && (this.h0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.h0.getChildAt(0)).setProgressColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h6, false));
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
            org.telegram.ui.Components.a60 a60Var = this.q0;
            if (a60Var != null) {
                a60Var.updateColors();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
