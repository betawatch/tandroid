// default package

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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class f92 extends d implements gk7 {
    public LinearLayout E;
    public LinearLayout F;
    public LinearLayout G;
    public f36 H;
    public wgb I;
    public mhb J;
    public b9a K;
    public e92 L;
    public boolean M;
    public ArrayList N;
    public ArrayList O;
    public ie1 P;
    public ArrayList Q;
    public LinearLayout R;
    public ld5 S;
    public ahb T;
    public mhb U;
    public b92 V;
    public boolean W;
    public boolean X;
    public TLRPC.Chat Y;
    public TLRPC.ChatFull Z;
    public x82 a;
    public long a0;
    public l7 b;
    public boolean b0;
    public EditTextBoldCursor c;
    public boolean c0;
    public mhb d;
    public boolean d0;
    public ld5 e;
    public boolean e0;
    public ld5 f;
    public b9a f0;
    public ArrayList g0;
    public z82 h;
    public q86 h0;
    public int i0;
    public String j0;
    public kx1 k0;
    public boolean l0;
    public TLRPC.TL_chatInviteExported m0;
    public t1 n;
    public boolean n0;
    public boolean o0;
    public HashMap p0;
    public zq5 q0;
    public sha r;
    public r82 r0;
    public LinearLayout s;
    public Boolean s0;
    public boolean t0;
    public uy8 w;
    public uy8 x;
    public LinearLayout y;

    public final void a0() {
        boolean z;
        sha shaVar = this.r;
        if (!this.W && this.b.length() <= 0) {
            ArrayList arrayList = this.O;
            z = false;
            if (arrayList != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i);
                    if (tL_username == null || !tL_username.active || TextUtils.isEmpty(tL_username.username)) {
                    }
                }
            }
            shaVar.a(z, true);
        }
        z = true;
        shaVar.a(z, true);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.l6));
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.x6));
        hashSet.add(Integer.valueOf(bkb.I6));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.g7));
        hashSet.add(Integer.valueOf(bkb.f7));
        hashSet.add(Integer.valueOf(bkb.a7));
        hashSet.add(Integer.valueOf(bkb.v6));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
    }

    public final void b0(String str) {
        if (str == null || str.length() <= 0) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
        }
        kx1 kx1Var = this.k0;
        if (kx1Var != null) {
            gl.r(kx1Var);
            this.k0 = null;
            this.j0 = null;
            if (this.i0 != 0) {
                getConnectionsManager().cancelRequest(this.i0, true);
            }
        }
        this.l0 = false;
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                this.h.setText(k96.M0(2131748717, null));
                this.h.setTextColorByKey(bkb.o7);
                return;
            }
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (i == 0 && charAt >= '0' && charAt <= '9') {
                    boolean z = this.b0;
                    z82 z82Var = this.h;
                    if (z) {
                        z82Var.setText(k96.M0(2131748713, null));
                    } else {
                        z82Var.setText(k96.M0(2131748712, null));
                    }
                    this.h.setTextColorByKey(bkb.o7);
                    return;
                }
                if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                    this.h.setText(k96.M0(2131748717, null));
                    this.h.setTextColorByKey(bkb.o7);
                    return;
                }
            }
        }
        if (str == null || str.length() < 4) {
            boolean z2 = this.b0;
            z82 z82Var2 = this.h;
            if (z2) {
                z82Var2.setText(k96.M0(2131748715, null));
            } else {
                z82Var2.setText(k96.M0(2131748714, null));
            }
            this.h.setTextColorByKey(bkb.o7);
            return;
        }
        int length = str.length();
        z82 z82Var3 = this.h;
        if (length > 32) {
            z82Var3.setText(k96.M0(2131748716, null));
            this.h.setTextColorByKey(bkb.o7);
            return;
        }
        z82Var3.setText(k96.M0(2131748730, null));
        this.h.setTextColorByKey(bkb.E6);
        this.j0 = str;
        kx1 kx1Var2 = new kx1(this, str, (byte) 27);
        this.k0 = kx1Var2;
        gl.e3(kx1Var2, 300L);
    }

    public final void c0(boolean z) {
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        tL_messages_exportChatInvite.peer = getMessagesController().h1(-this.a0);
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new i81((byte) 3, this, z)), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        byte b = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new w82(this, context));
        this.r = this.simpleActionBar.s(k96.M0(2131745754, null));
        this.n = new t1(context, (byte) 9);
        this.a = new x82(this, context, this.n, this.resourceProvider);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(this.a, nme.g());
        this.fragmentView = frameLayout;
        this.a.setFillViewport(true);
        this.a.setDrawBackground(true);
        this.a.setOverScrollMode(0);
        this.a.addView(this.n, new FrameLayout.LayoutParams(-1, -2));
        this.n.setOrientation(1);
        boolean z = this.o0;
        if (z) {
            this.simpleActionBar.setTitle(k96.M0(2131743691, null));
        } else {
            boolean z2 = this.b0;
            pha phaVar = this.simpleActionBar;
            if (z2) {
                phaVar.setTitle(k96.M0(2131752285, null));
            } else {
                phaVar.setTitle(k96.M0(2131749208, null));
            }
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.s = linearLayout;
        linearLayout.setOrientation(1);
        this.n.addView(this.s, nme.o(-1, -2));
        ld5 ld5Var = new ld5(context, 23);
        this.f = ld5Var;
        ld5Var.setHeight(46);
        boolean z3 = this.b0;
        ld5 ld5Var2 = this.f;
        if (z3) {
            ld5Var2.setText(k96.M0(2131752263, null));
        } else {
            ld5Var2.setText(k96.M0(2131749199, null));
        }
        this.s.addView(this.f);
        uy8 uy8Var = new uy8(context, false);
        this.x = uy8Var;
        if (this.b0) {
            uy8Var.b(k96.M0(2131752317, null), k96.M0(2131752316, null), false, this.W);
        } else {
            uy8Var.b(k96.M0(2131748449, null), k96.M0(2131748448, null), false, this.W);
        }
        this.s.addView(this.x, nme.o(-1, -2));
        this.x.setOnClickListener(new u82(this, b));
        uy8 uy8Var2 = new uy8(context, false);
        this.w = uy8Var2;
        if (this.b0) {
            uy8Var2.b(k96.M0(2131752306, null), k96.M0(2131752303, null), false, !this.W);
        } else {
            uy8Var2.b(k96.M0(2131748446, null), k96.M0(2131748445, null), false, !this.W);
        }
        this.s.addView(this.w, nme.o(-1, -2));
        this.w.setOnClickListener(new u82(this, (byte) 2));
        b9a b9aVar = new b9a(context, (de9) null);
        this.K = b9aVar;
        this.n.addView(b9aVar, nme.o(-1, -2));
        if (z) {
            this.x.setVisibility(8);
            this.w.setVisibility(8);
            this.K.setVisibility(8);
            this.f.setVisibility(8);
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.E = linearLayout2;
        linearLayout2.setOrientation(1);
        this.n.addView(this.E, nme.o(-1, -2));
        ld5 ld5Var3 = new ld5(context, 23);
        this.e = ld5Var3;
        this.E.addView(ld5Var3);
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.F = linearLayout3;
        linearLayout3.setOrientation(0);
        this.E.addView(this.F, nme.k(23.0f, 7.0f, 23.0f, 0.0f, -1, 36));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setText(getMessagesController().N2 + "/");
        this.c.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.c;
        int i = bkb.G6;
        zkb.D(editTextBoldCursor2, i, null);
        EditTextBoldCursor editTextBoldCursor3 = this.c;
        int i2 = bkb.F6;
        zkb.X(editTextBoldCursor3, i2, null);
        this.c.setMaxLines(1);
        this.c.setLines(1);
        this.c.setEnabled(false);
        this.c.setBackground(null);
        this.c.setPadding(0, 0, 0, 0);
        this.c.setSingleLine(true);
        this.c.setInputType(163840);
        this.c.setImeOptions(6);
        this.F.addView(this.c, nme.o(-2, 36));
        l7 l7Var = new l7(b, context, this);
        this.b = l7Var;
        l7Var.setTextSize(1, 18.0f);
        zkb.D(this.b, i, null);
        zkb.X(this.b, i2, null);
        this.b.setMaxLines(1);
        this.b.setLines(1);
        this.b.setBackground(null);
        this.b.setPadding(0, 0, 0, 0);
        this.b.setSingleLine(true);
        this.b.setInputType(163872);
        this.b.setImeOptions(6);
        this.b.setHint(k96.M0(2131752254, null));
        zkb.v(this.b, i2, null);
        this.b.setCursorSize(gl.L(20.0f));
        this.b.setCursorWidth(1.5f);
        this.F.addView(this.b, nme.o(-1, 36));
        this.b.addTextChangedListener(new b7(this, (byte) 11));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.G = linearLayout4;
        linearLayout4.setOrientation(1);
        this.E.addView(this.G, nme.o(-1, -2));
        f36 f36Var = new f36(context, this, null, true, hc2.T(this.Y));
        this.H = f36Var;
        f36Var.setDelegate(new y82(this, context));
        this.H.d(0, null, false);
        this.G.addView(this.H);
        z82 z82Var = new z82(this, context, this.resourceProvider);
        this.h = z82Var;
        z82Var.setBottomPadding(6);
        this.n.addView(this.h, nme.o(-2, -2));
        mhb mhbVar = new mhb(12, this.resourceProvider, context);
        this.d = mhbVar;
        mhbVar.setImportantForAccessibility(1);
        this.n.addView(this.d, nme.o(-1, -2));
        q86 q86Var = new q86(context);
        this.h0 = q86Var;
        this.n.addView(q86Var, nme.o(-1, -2));
        LinearLayout linearLayout5 = new LinearLayout(context);
        this.y = linearLayout5;
        linearLayout5.setOrientation(1);
        this.n.addView(this.y, nme.o(-1, -2));
        b9a b9aVar2 = new b9a(context, (de9) null);
        this.f0 = b9aVar2;
        this.n.addView(b9aVar2, nme.o(-1, -2));
        t1 t1Var = this.n;
        e92 e92Var = new e92(this, context);
        this.L = e92Var;
        t1Var.addView(e92Var, nme.o(-1, -2));
        this.L.setVisibility((this.W || this.O.isEmpty()) ? 8 : 0);
        wgb wgbVar = new wgb(context);
        this.I = wgbVar;
        wgbVar.o(R.drawable.msg_link2, k96.M0(2131748503, null), false);
        this.I.setOnClickListener(new u82(this, (byte) 3));
        this.n.addView(this.I, nme.o(-1, -2));
        mhb mhbVar2 = new mhb(12, this.resourceProvider, context);
        this.J = mhbVar2;
        this.n.addView(mhbVar2, nme.o(-1, -2));
        b92 b92Var = new b92(this, context, this.Y, context);
        this.V = b92Var;
        TLRPC.ChatFull chatFull = this.Z;
        b92Var.c((chatFull == null || chatFull.linked_chat_id == 0 || this.b0) ? false : true);
        b92 b92Var2 = this.V;
        TLRPC.ChatFull chatFull2 = this.Z;
        mhb mhbVar3 = b92Var2.e;
        boolean V = hc2.V(b92Var2.n);
        boolean t0 = hc2.t0(b92Var2.n);
        if (chatFull2 == null || chatFull2.guard_bot_id == 0) {
            mhbVar3.setText(k96.M0(V ? 2131752290 : t0 ? 2131749211 : 2131749214, null));
        } else {
            mhbVar3.setText(gl.N2(k96.a0(null, null, V ? 2131752289 : t0 ? 2131749210 : 2131749213, "@" + cf3.q(na7.q1(y6c.t0).V1(Long.valueOf(chatFull2.guard_bot_id)))), bkb.Yl, null, new hb5(chatFull2, this, (byte) 17), false));
        }
        this.n.addView(this.V);
        LinearLayout linearLayout6 = new LinearLayout(context);
        this.R = linearLayout6;
        linearLayout6.setOrientation(1);
        this.n.addView(this.R);
        ld5 ld5Var4 = new ld5(context, 23);
        this.S = ld5Var4;
        ld5Var4.setHeight(46);
        this.S.setText(k96.M0(2131745671, null));
        this.R.addView(this.S, nme.o(-1, -2));
        ahb ahbVar = new ahb(context);
        this.T = ahbVar;
        ahbVar.f(k96.M0(2131745869, null), this.c0, false);
        this.T.setOnClickListener(new u82(this, (byte) 4));
        this.R.addView(this.T, nme.o(-1, -2));
        this.U = new mhb(12, this.resourceProvider, context);
        if (!this.b0 || hc2.n0(this.Y)) {
            this.U.setText(k96.M0(2131745867, null));
        } else {
            this.U.setText(k96.M0(2131745868, null));
        }
        this.R.addView(this.U, nme.o(-1, -2));
        String K = hc2.K(this.Y, true);
        if (!this.W && K != null) {
            this.n0 = true;
            this.b.setText(K);
            this.b.setSelection(K.length());
            this.n0 = false;
        }
        g0();
        return this.fragmentView;
    }

    public final void d0() {
        boolean z;
        ArrayList<TLRPC.TL_username> arrayList;
        gl.e3(this.r0, 200L);
        if (getParentActivity() != null) {
            final byte b = 1;
            String K = hc2.K(this.Y, true);
            final byte b2 = 0;
            if (!this.W) {
                l7 l7Var = this.b;
                if (K != null ? !K.equalsIgnoreCase(l7Var.getText().toString()) : l7Var.length() != 0) {
                    if (this.b.length() != 0 && !this.l0) {
                        Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(200L);
                        }
                        gl.A3(this.h);
                        f0(false);
                        return;
                    }
                }
            }
            if (K == null) {
                K = "";
            }
            String obj = this.W ? "" : this.b.getText().toString();
            final byte b3 = 2;
            if (!K.equals(obj)) {
                if (!hc2.T(this.Y)) {
                    getMessagesController().P(getParentActivity(), this.a0, this, new vc7(this) { // from class: s82
                        public final /* synthetic */ f92 b;

                        {
                            this.b = this;
                        }

                        @Override // vc7
                        public final void run(long j) {
                            byte b4 = b;
                            f92 f92Var = this.b;
                            switch (b4) {
                                case 0:
                                    if (j != 0) {
                                        f92Var.a0 = j;
                                        f92Var.Y = f92Var.getMessagesController().K0(Long.valueOf(j));
                                        f92Var.d0();
                                        break;
                                    }
                                    break;
                                case 1:
                                    if (j != 0) {
                                        f92Var.a0 = j;
                                        f92Var.Y = f92Var.getMessagesController().K0(Long.valueOf(j));
                                        f92Var.d0();
                                        break;
                                    }
                                    break;
                                default:
                                    if (j != 0) {
                                        f92Var.a0 = j;
                                        f92Var.Y = f92Var.getMessagesController().K0(Long.valueOf(j));
                                        na7 messagesController = f92Var.getMessagesController();
                                        long j2 = -f92Var.a0;
                                        TLRPC.Chat chat = f92Var.Y;
                                        boolean z2 = f92Var.c0;
                                        chat.noforwards = z2;
                                        messagesController.i5(j2, 0, z2, null);
                                        f92Var.d0();
                                        break;
                                    }
                                    break;
                            }
                        }
                    }, null);
                    return;
                }
                na7 messagesController = getMessagesController();
                long j = this.a0;
                r82 r82Var = new r82(this, b);
                r82 r82Var2 = new r82(this, b3);
                messagesController.getClass();
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = messagesController.f1(j);
                tL_channels_updateUsername.username = obj;
                messagesController.getConnectionsManager().sendRequest(tL_channels_updateUsername, new p77(messagesController, j, obj, r82Var, this, tL_channels_updateUsername, r82Var2), 64);
                return;
            }
            if (!this.W || (arrayList = this.Y.usernames) == null || arrayList.isEmpty()) {
                z = true;
            } else if (this.t0) {
                z = false;
            } else {
                this.t0 = true;
                boolean z2 = false;
                for (int i = 0; i < this.Y.usernames.size(); i++) {
                    TLRPC.TL_username tL_username = this.Y.usernames.get(i);
                    if (tL_username != null && tL_username.active && !tL_username.editable) {
                        z2 = true;
                    }
                }
                if (z2) {
                    TLRPC.TL_channels_deactivateAllUsernames tL_channels_deactivateAllUsernames = new TLRPC.TL_channels_deactivateAllUsernames();
                    tL_channels_deactivateAllUsernames.channel = na7.g1(this.Y);
                    getConnectionsManager().sendRequest(tL_channels_deactivateAllUsernames, new q82(this, b3));
                } else {
                    this.t0 = false;
                }
                z = !z2;
            }
            if (z) {
                TLRPC.Chat chat = this.Y;
                if (chat.noforwards != this.c0) {
                    if (!hc2.T(chat)) {
                        f0(true);
                        getMessagesController().P(getParentActivity(), this.a0, this, new vc7(this) { // from class: s82
                            public final /* synthetic */ f92 b;

                            {
                                this.b = this;
                            }

                            @Override // vc7
                            public final void run(long j2) {
                                byte b4 = b3;
                                f92 f92Var = this.b;
                                switch (b4) {
                                    case 0:
                                        if (j2 != 0) {
                                            f92Var.a0 = j2;
                                            f92Var.Y = f92Var.getMessagesController().K0(Long.valueOf(j2));
                                            f92Var.d0();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        if (j2 != 0) {
                                            f92Var.a0 = j2;
                                            f92Var.Y = f92Var.getMessagesController().K0(Long.valueOf(j2));
                                            f92Var.d0();
                                            break;
                                        }
                                        break;
                                    default:
                                        if (j2 != 0) {
                                            f92Var.a0 = j2;
                                            f92Var.Y = f92Var.getMessagesController().K0(Long.valueOf(j2));
                                            na7 messagesController2 = f92Var.getMessagesController();
                                            long j22 = -f92Var.a0;
                                            TLRPC.Chat chat2 = f92Var.Y;
                                            boolean z22 = f92Var.c0;
                                            chat2.noforwards = z22;
                                            messagesController2.i5(j22, 0, z22, null);
                                            f92Var.d0();
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, null);
                        return;
                    }
                    na7 messagesController2 = getMessagesController();
                    long j2 = -this.a0;
                    TLRPC.Chat chat2 = this.Y;
                    boolean z3 = this.c0;
                    chat2.noforwards = z3;
                    messagesController2.i5(j2, 0, z3, null);
                }
                if (this.V != null) {
                    if (getParentActivity() == null) {
                        return;
                    }
                    if (!this.b0 && !hc2.T(this.Y)) {
                        b92 b92Var = this.V;
                        if (b92Var.f || b92Var.h) {
                            getMessagesController().P(getParentActivity(), this.a0, this, new vc7(this) { // from class: s82
                                public final /* synthetic */ f92 b;

                                {
                                    this.b = this;
                                }

                                @Override // vc7
                                public final void run(long j22) {
                                    byte b4 = b2;
                                    f92 f92Var = this.b;
                                    switch (b4) {
                                        case 0:
                                            if (j22 != 0) {
                                                f92Var.a0 = j22;
                                                f92Var.Y = f92Var.getMessagesController().K0(Long.valueOf(j22));
                                                f92Var.d0();
                                                break;
                                            }
                                            break;
                                        case 1:
                                            if (j22 != 0) {
                                                f92Var.a0 = j22;
                                                f92Var.Y = f92Var.getMessagesController().K0(Long.valueOf(j22));
                                                f92Var.d0();
                                                break;
                                            }
                                            break;
                                        default:
                                            if (j22 != 0) {
                                                f92Var.a0 = j22;
                                                f92Var.Y = f92Var.getMessagesController().K0(Long.valueOf(j22));
                                                na7 messagesController22 = f92Var.getMessagesController();
                                                long j222 = -f92Var.a0;
                                                TLRPC.Chat chat22 = f92Var.Y;
                                                boolean z22 = f92Var.c0;
                                                chat22.noforwards = z22;
                                                messagesController22.i5(j222, 0, z22, null);
                                                f92Var.d0();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, null);
                            return;
                        }
                    }
                    if (this.Y.join_to_send != this.V.f) {
                        na7 messagesController3 = getMessagesController();
                        long j3 = this.a0;
                        TLRPC.Chat chat3 = this.Y;
                        boolean z4 = this.V.f;
                        chat3.join_to_send = z4;
                        messagesController3.getClass();
                        TLRPC.TL_channels_toggleJoinToSend tL_channels_toggleJoinToSend = new TLRPC.TL_channels_toggleJoinToSend();
                        tL_channels_toggleJoinToSend.channel = messagesController3.f1(j3);
                        tL_channels_toggleJoinToSend.enabled = z4;
                        Object obj2 = null;
                        messagesController3.getConnectionsManager().sendRequest(tL_channels_toggleJoinToSend, new k45(messagesController3, obj2, obj2, (byte) 22), 64);
                    }
                    if (this.Y.join_request != this.V.h || this.X) {
                        na7 messagesController4 = getMessagesController();
                        long j4 = this.a0;
                        TLRPC.Chat chat4 = this.Y;
                        boolean z5 = this.V.h;
                        chat4.join_request = z5;
                        messagesController4.h5(j4, 0L, z5, this.X, false, null, null);
                    }
                }
                finishFragment();
            }
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.S) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.a0) {
                this.Z = chatFull;
                this.m0 = chatFull.exported_invite;
                g0();
                return;
            }
            return;
        }
        if (i == kk7.x1) {
            if ((-this.a0) == ((Long) objArr[0]).longValue()) {
                ui5 ui5Var = this.parentLayout;
                if (ui5Var == null || ui5Var.getLastFragment() != this) {
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
        h26 h26Var = new h26(2, this.currentAccount, null, getParentActivity(), this);
        h26Var.q2 = this.b0;
        h26Var.C2 = new r82(this, (byte) 0);
        showDialog(h26Var);
    }

    public final void f0(boolean z) {
        if (!z) {
            gl.r(this.r0);
        }
        sha shaVar = this.r;
        if (shaVar != null) {
            shaVar.b(z);
        }
    }

    public final void g0() {
        if (this.K == null) {
            return;
        }
        int i = 8;
        if (this.W || this.d0 || !getUserConfig().p()) {
            mhb mhbVar = this.d;
            int i2 = bkb.A6;
            mhbVar.setTag(Integer.valueOf(i2));
            zkb.X(this.d.getTextView(), i2, null);
            boolean z = this.o0;
            b9a b9aVar = this.K;
            if (z) {
                b9aVar.setVisibility(8);
            } else {
                b9aVar.setVisibility(0);
            }
            this.f0.setVisibility(8);
            this.y.setVisibility(8);
            this.E.setVisibility(0);
            this.h0.setVisibility(8);
            boolean z2 = this.b0;
            mhb mhbVar2 = this.d;
            boolean z3 = this.W;
            if (z2) {
                mhbVar2.setText(k96.M0(z3 ? 2131752315 : 2131752255, null));
                this.e.setText(this.W ? k96.M0(2131752391, null) : k96.M0(2131752373, null));
            } else {
                mhbVar2.setText(k96.M0(z3 ? 2131748447 : 2131748444, null));
                this.e.setText(this.W ? k96.M0(2131752391, null) : k96.M0(2131752373, null));
            }
            this.F.setVisibility(this.W ? 8 : 0);
            this.G.setVisibility(this.W ? 0 : 8);
            this.R.setVisibility(0);
            this.I.setVisibility(0);
            this.J.setVisibility(0);
            this.E.setPadding(0, 0, 0, this.W ? 0 : gl.L(7.0f));
            f36 f36Var = this.H;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.m0;
            f36Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
            this.H.c(this.m0, this.a0);
            z82 z82Var = this.h;
            z82Var.setVisibility((this.W || z82Var.a.length() == 0) ? 8 : 0);
            TLRPC.ChatFull L0 = getMessagesController().L0(this.a0);
            this.J.setText(k96.M0((L0 != null && L0.paid_media_allowed && hc2.V(getMessagesController().K0(Long.valueOf(this.a0)))) ? 2131748501 : 2131748502, null));
        } else {
            this.d.setText(k96.M0(2131752521, null));
            mhb mhbVar3 = this.d;
            int i3 = bkb.o7;
            mhbVar3.setTag(Integer.valueOf(i3));
            zkb.X(this.d.getTextView(), i3, null);
            this.E.setVisibility(8);
            this.h.setVisibility(8);
            this.K.setVisibility(8);
            this.f0.setVisibility(0);
            boolean z4 = this.e0;
            q86 q86Var = this.h0;
            if (z4) {
                q86Var.setVisibility(0);
                this.y.setVisibility(8);
            } else {
                q86Var.setVisibility(8);
                this.y.setVisibility(0);
            }
        }
        this.w.a(!this.W);
        this.x.a(this.W);
        this.b.clearFocus();
        b92 b92Var = this.V;
        if (b92Var != null) {
            b92Var.setVisibility((!this.b0 || this.W) ? 0 : 8);
            b92 b92Var2 = this.V;
            TLRPC.ChatFull chatFull = this.Z;
            b92Var2.c((chatFull == null || chatFull.linked_chat_id == 0 || this.b0) ? false : true);
        }
        e92 e92Var = this.L;
        if (e92Var != null) {
            if (!this.W && !this.O.isEmpty()) {
                i = 0;
            }
            e92Var.setVisibility(i);
        }
        a0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final tu9 getScrollViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i = bkb.h6;
        arrayList.add(new blb((View) null, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb((View) null, 4, new Class[]{uib.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, bkb.o7));
        arrayList.add(new blb((View) null, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        LinearLayout linearLayout = this.s;
        int i2 = bkb.c6;
        arrayList.add(new blb(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(this.E, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(this.T, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.T, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.L6));
        arrayList.add(new blb(this.T, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.M6));
        arrayList.add(new blb(this.y, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(this.h0, 0, new Class[]{q86.class}, new String[]{"progressBar"}, (Drawable[]) null, (alb) null, bkb.g6));
        arrayList.add(new blb(this.w, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.x, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.I, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onBecomeFullyVisible() {
        l7 l7Var;
        super.onBecomeFullyVisible();
        if (!this.o0 || (l7Var = this.b) == null) {
            return;
        }
        l7Var.requestFocus();
        gl.F3(this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004d, code lost:
    
        if (r2 == null) goto L10;
     */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        boolean z = this.o0;
        ArrayList arrayList = this.O;
        TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(this.a0));
        this.Y = K0;
        if (K0 == null) {
            TLRPC.Chat O = getMessagesStorage().O(this.a0);
            this.Y = O;
            if (O != null) {
                getMessagesController().S3(this.Y, true);
                if (this.Z == null) {
                    TLRPC.ChatFull C0 = getMessagesStorage().C0(this.a0, hc2.T(this.Y), new CountDownLatch(1), false, false, 0);
                    this.Z = C0;
                }
            }
            return false;
        }
        this.W = (z || hc2.t0(this.Y)) ? false : true;
        this.b0 = hc2.T(this.Y) && !this.Y.megagroup;
        TLRPC.Chat chat = this.Y;
        this.c0 = chat.noforwards;
        if ((z && !hc2.t0(chat)) || (this.W && this.Y.creator)) {
            TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
            tL_channels_checkUsername.username = "1";
            tL_channels_checkUsername.channel = new TLRPC.TL_inputChannelEmpty();
            getConnectionsManager().sendRequest(tL_channels_checkUsername, new q82(this, (byte) 3));
        }
        if (this.W && this.Z != null) {
            getMessagesController().X2(this.classGuid, this.a0, true);
        }
        if (this.Y != null) {
            this.N.clear();
            arrayList.clear();
            for (int i = 0; i < this.Y.usernames.size(); i++) {
                if (this.Y.usernames.get(i).active) {
                    arrayList.add(this.Y.usernames.get(i));
                }
            }
            for (int i2 = 0; i2 < this.Y.usernames.size(); i2++) {
                if (!this.Y.usernames.get(i2).active) {
                    arrayList.add(this.Y.usernames.get(i2));
                }
            }
        }
        getNotificationCenter().b(this, kk7.S);
        getNotificationCenter().b(this, kk7.x1);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, kk7.S);
        getNotificationCenter().n(this, kk7.x1);
        gl.y2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        gl.W2(getParentActivity(), this.classGuid);
        TLRPC.ChatFull chatFull = this.Z;
        if (chatFull != null) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
            this.m0 = tL_chatInviteExported;
            this.H.setLink(tL_chatInviteExported == null ? null : tL_chatInviteExported.link);
            this.H.c(this.m0, this.a0);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            q86 q86Var = this.h0;
            if (q86Var != null && q86Var.getChildCount() > 0 && (this.h0.getChildAt(0) instanceof RadialProgressView)) {
                ((RadialProgressView) this.h0.getChildAt(0)).setProgressColor(bkb.w0(null, bkb.g6, false));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        try {
            super.onThemeColorsChanged();
            LinearLayout linearLayout = this.y;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.y.getChildAt(i);
                    if (childAt instanceof jb) {
                        jb jbVar = (jb) childAt;
                        jbVar.d.p(jbVar.f);
                        jbVar.a.invalidate();
                    }
                }
            }
            zq5 zq5Var = this.q0;
            if (zq5Var != null) {
                zq5Var.updateColors();
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
