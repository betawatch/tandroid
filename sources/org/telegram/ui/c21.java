package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class c21 extends org.telegram.ui.Components.na {
    public TLRPC.Chat P1;
    public final TLRPC.User Q1;
    public final bg.m0 R1;
    public TLObject S1;
    public final FrameLayout T1;
    public final u11 U1;
    public final w11 V1;
    public final b21 W1;
    public final b21 X1;
    public final b21 Y1;
    public final fi.d Z1;
    public org.telegram.ui.Components.m41 a2;
    public Context b2;

    public c21(Context context, TLRPC.Chat chat, TLRPC.User user, bg.m0 m0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(2, context, g6Var, true);
        this.B1 = org.telegram.messenger.g0.L(12.0f);
        this.P0 = true;
        this.P1 = chat;
        this.Q1 = user;
        this.S1 = user;
        this.R1 = m0Var;
        org.telegram.messenger.p10.i(this.a).f();
        FrameLayout frameLayout = new FrameLayout(context);
        this.T1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(20.0f);
        int i7 = org.telegram.ui.ActionBar.l6.O5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.l6.d0(L, org.telegram.ui.ActionBar.l6.w0(i7, this.I0));
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i7);
        frameLayout2.setBackground(d02);
        org.telegram.ui.ActionBar.s6.j(frameLayout2, d02, M, null, g6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        int i10 = org.telegram.ui.ActionBar.l6.P5;
        org.telegram.ui.ActionBar.s6.s(imageView, i10, g6Var, PorterDuff.Mode.SRC_IN);
        frameLayout2.addView(imageView, c8.ha.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        u11 u11Var = new u11(context);
        this.U1 = u11Var;
        org.telegram.ui.ActionBar.s6.U(u11Var, org.telegram.ui.ActionBar.l6.R5, g6Var);
        org.telegram.ui.ActionBar.s6.D(u11Var, i10, g6Var);
        u11Var.setTextSize(1, 15.0f);
        u11Var.setSingleLine(true);
        u11Var.setBackground(null);
        u11Var.setCursorWidth(1.5f);
        u11Var.setGravity(org.telegram.messenger.qs.x1);
        u11Var.setClipToPadding(true);
        u11Var.setPadding(org.telegram.messenger.g0.L(46.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        u11Var.setTranslationY(-org.telegram.messenger.g0.L(0.66f));
        u11Var.setInputType(u11Var.getInputType() | TLObject.FLAG_19);
        u11Var.setImeOptions(33554435);
        u11Var.setTextIsSelectable(false);
        u11Var.setOnEditorActionListener(new fa(this, 11));
        u11Var.addTextChangedListener(new v11(this));
        u11Var.setHint(org.telegram.messenger.id.M0(2131745757, null));
        frameLayout2.addView(u11Var, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        frameLayout.addView(frameLayout2, c8.ha.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.b;
        int max = Math.max(0, viewGroup.indexOfChild(this.l1));
        float f10 = this.t0 / org.telegram.messenger.g0.p;
        viewGroup.addView(frameLayout, max, c8.ha.d(-1, 64.0f, 55, f10, 0.0f, f10, 0.0f));
        w11 w11Var = new w11(context);
        this.V1 = w11Var;
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        l9Var.setImageDrawable(new org.telegram.ui.Components.ah0(R.raw.utyan_empty, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
        int i11 = 17;
        w11Var.addView(l9Var, c8.ha.e(org.telegram.messenger.qs.O1, org.telegram.messenger.qs.O1, 17));
        b21 b21Var = new b21(this.a, chat.id, new TLRPC.TL_channelParticipantsAdmins());
        b21Var.e.add(new tu0(this, i11));
        this.W1 = b21Var;
        b21 b21Var2 = new b21(this.a, chat.id, new TLRPC.TL_channelParticipantsRecent());
        b21Var2.e.add(new tu0(this, i11));
        this.X1 = b21Var2;
        b21 b21Var3 = new b21(this.a, chat.id, new TLRPC.TL_channelParticipantsSearch());
        b21Var3.e.add(new tu0(this, i11));
        this.Y1 = b21Var3;
        org.telegram.ui.Components.qj0 qj0Var = this.k1;
        int i12 = this.t0;
        qj0Var.setPadding(i12, 0, i12, org.telegram.messenger.g0.L(68.0f));
        this.k1.setClipToPadding(false);
        this.k1.setOnItemClickListener(new zx0(this, 3));
        x11 x11Var = new x11(this);
        x11Var.m = false;
        x11Var.C = false;
        x11Var.o(org.telegram.ui.Components.xq.h);
        x11Var.n(350L);
        this.k1.setItemAnimator(x11Var);
        this.k1.addOnLayoutChangeListener(new y11(this));
        this.k1.j(new z11(this));
        this.b.addView(new a21(this, getContext()), c8.ha.e(-1, 68, 87));
        fi.d dVar = new fi.d(getContext(), g6Var, true);
        dVar.setRoundRadius(24);
        this.Z1 = dVar;
        dVar.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.r7, this.I0));
        f1(false);
        ViewGroup viewGroup2 = this.b;
        float f11 = (this.t0 / org.telegram.messenger.g0.p) + 10.0f;
        viewGroup2.addView(dVar, c8.ha.d(-1, 48.0f, 87, f11, 10.0f, f11, 10.0f));
        dVar.setOnClickListener(new py0(this, 5));
        org.telegram.ui.Components.m41 m41Var = this.a2;
        if (m41Var != null) {
            m41Var.O(false);
        }
        b21Var.b();
        b21Var2.b();
    }

    public static void d1(c21 c21Var) {
        org.telegram.ui.Components.qj0 qj0Var = c21Var.k1;
        float f10 = -org.telegram.messenger.g0.L(64.0f);
        int i7 = 0;
        while (true) {
            if (i7 >= qj0Var.getChildCount()) {
                break;
            }
            View childAt = qj0Var.getChildAt(i7);
            if (childAt.getId() == 3) {
                f10 = childAt.getY();
                break;
            }
            i7++;
        }
        c21Var.T1.setTranslationY(f10);
    }

    @Override // org.telegram.ui.Components.na
    public final org.telegram.ui.Components.pj0 L0(org.telegram.ui.Components.qj0 qj0Var) {
        org.telegram.ui.Components.m41 m41Var = new org.telegram.ui.Components.m41(qj0Var, getContext(), this.a, 0, false, new a5(this, 24), this.I0);
        this.a2 = m41Var;
        return m41Var;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        return org.telegram.messenger.id.M0(2131754210, null);
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        this.W1.a();
        this.X1.a();
        this.Y1.a();
    }

    public final void e1(TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (getContext() != null) {
            this.b2 = getContext();
        }
        if (this.b2 == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !org.telegram.messenger.t3.T(this.P1)) {
            org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
            if (T == null) {
                return;
            }
            org.telegram.messenger.qp.s1(this.a).T(this.b2, this.P1.id, T, new a1.d(this, user, inputCheckPasswordSRP, twoStepVerificationActivity, 20), null);
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (org.telegram.messenger.t3.T(this.P1)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.P1;
            tL_inputChannel.channel_id = chat.id;
            tL_inputChannel.access_hash = chat.access_hash;
        } else {
            tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
        }
        tL_channels_editCreator.password = inputCheckPasswordSRP != null ? inputCheckPasswordSRP : new TLRPC.TL_inputCheckPasswordEmpty();
        tL_channels_editCreator.user_id = org.telegram.messenger.qp.s1(this.a).q1(user);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_editCreator, new bi.r8(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 12));
    }

    public final void f1(boolean z9) {
        int i7 = org.telegram.messenger.t3.V(this.P1) ? 2131749003 : 2131748994;
        float L = org.telegram.messenger.g0.L(32.0f);
        fi.d dVar = this.Z1;
        float max = Math.max(L, ((dVar.getWidth() > 0 ? dVar.getWidth() : org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(20.0f)) - org.telegram.messenger.g0.L(16.0f)) - dVar.getTextPaint().measureText(org.telegram.messenger.id.M0(i7, null)));
        TLObject tLObject = this.S1;
        dVar.i(org.telegram.messenger.id.a0(null, null, i7, TextUtils.ellipsize(tLObject instanceof TLRPC.User ? org.telegram.messenger.t10.k((TLRPC.User) tLObject) : tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : "", dVar.getTextPaint(), max, TextUtils.TruncateAt.MIDDLE)), z9, true);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        try {
            super.s0();
            fi.d dVar = this.Z1;
            if (dVar != null) {
                dVar.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.r7, this.I0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
