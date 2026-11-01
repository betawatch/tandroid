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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class q31 extends org.telegram.ui.Components.ha {
    public TLRPC.Chat P1;
    public final TLRPC.User Q1;
    public final ag.d3 R1;
    public TLObject S1;
    public final FrameLayout T1;
    public final i31 U1;
    public final k31 V1;
    public final p31 W1;
    public final p31 X1;
    public final p31 Y1;
    public final vh.d Z1;
    public org.telegram.ui.Components.q51 a2;
    public Context b2;

    public q31(Context context, TLRPC.Chat chat, TLRPC.User user, ag.d3 d3Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(2, context, p6Var, true);
        this.B1 = org.telegram.messenger.i0.L(12.0f);
        this.P0 = true;
        this.P1 = chat;
        this.Q1 = user;
        this.S1 = user;
        this.R1 = d3Var;
        org.telegram.messenger.e20.i(this.a).f();
        FrameLayout frameLayout = new FrameLayout(context);
        this.T1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        int L = org.telegram.messenger.i0.L(20.0f);
        int i10 = org.telegram.ui.ActionBar.t6.O5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i10, this.I0));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        frameLayout2.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(frameLayout2, d02, N, null, p6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        int i11 = org.telegram.ui.ActionBar.t6.P5;
        org.telegram.ui.ActionBar.a7.t(imageView, i11, p6Var, PorterDuff.Mode.SRC_IN);
        frameLayout2.addView(imageView, w7.b6.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        i31 i31Var = new i31(context);
        this.U1 = i31Var;
        org.telegram.ui.ActionBar.a7.V(i31Var, org.telegram.ui.ActionBar.t6.R5, p6Var);
        org.telegram.ui.ActionBar.a7.E(i31Var, i11, p6Var);
        i31Var.setTextSize(1, 15.0f);
        i31Var.setSingleLine(true);
        i31Var.setBackground(null);
        i31Var.setCursorWidth(1.5f);
        i31Var.setGravity(org.telegram.messenger.at.x1);
        i31Var.setClipToPadding(true);
        i31Var.setPadding(org.telegram.messenger.i0.L(46.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        i31Var.setTranslationY(-org.telegram.messenger.i0.L(0.66f));
        i31Var.setInputType(i31Var.getInputType() | TLObject.FLAG_19);
        i31Var.setImeOptions(33554435);
        i31Var.setTextIsSelectable(false);
        i31Var.setOnEditorActionListener(new ha(this, 11));
        i31Var.addTextChangedListener(new j31(this));
        i31Var.setHint(org.telegram.messenger.dd.L0(2131745774, null));
        frameLayout2.addView(i31Var, w7.b6.e(-1, -1, org.telegram.messenger.at.E1));
        frameLayout.addView(frameLayout2, w7.b6.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.b;
        int max = Math.max(0, viewGroup.indexOfChild(this.l1));
        float f7 = this.t0 / org.telegram.messenger.i0.p;
        viewGroup.addView(frameLayout, max, w7.b6.d(-1, 64.0f, 55, f7, 0.0f, f7, 0.0f));
        k31 k31Var = new k31(context);
        this.V1 = k31Var;
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        g9Var.setImageDrawable(new org.telegram.ui.Components.ci0(R.raw.utyan_empty, org.telegram.messenger.i0.L(130.0f), org.telegram.messenger.i0.L(130.0f)));
        k31Var.addView(g9Var, w7.b6.e(org.telegram.messenger.at.O1, org.telegram.messenger.at.O1, 17));
        p31 p31Var = new p31(this.a, chat.id, new TLRPC.TL_channelParticipantsAdmins());
        int i12 = 19;
        p31Var.e.add(new vv0(this, i12));
        this.W1 = p31Var;
        p31 p31Var2 = new p31(this.a, chat.id, new TLRPC.TL_channelParticipantsRecent());
        p31Var2.e.add(new vv0(this, i12));
        this.X1 = p31Var2;
        p31 p31Var3 = new p31(this.a, chat.id, new TLRPC.TL_channelParticipantsSearch());
        p31Var3.e.add(new vv0(this, i12));
        this.Y1 = p31Var3;
        org.telegram.ui.Components.uk0 uk0Var = this.k1;
        int i13 = this.t0;
        uk0Var.setPadding(i13, 0, i13, org.telegram.messenger.i0.L(68.0f));
        this.k1.setClipToPadding(false);
        this.k1.setOnItemClickListener(new jz0(this, 3));
        l31 l31Var = new l31(this);
        l31Var.m = false;
        l31Var.C = false;
        l31Var.o(org.telegram.ui.Components.gr.h);
        l31Var.n(350L);
        this.k1.setItemAnimator(l31Var);
        this.k1.addOnLayoutChangeListener(new m31(this));
        this.k1.j(new n31(this));
        this.b.addView(new o31(this, getContext()), w7.b6.e(-1, 68, 87));
        vh.d dVar = new vh.d(getContext(), p6Var, true);
        dVar.setRoundRadius(24);
        this.Z1 = dVar;
        dVar.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.r7, this.I0));
        f1(false);
        ViewGroup viewGroup2 = this.b;
        float f10 = (this.t0 / org.telegram.messenger.i0.p) + 10.0f;
        viewGroup2.addView(dVar, w7.b6.d(-1, 48.0f, 87, f10, 10.0f, f10, 10.0f));
        dVar.setOnClickListener(new zz0(this, 5));
        org.telegram.ui.Components.q51 q51Var = this.a2;
        if (q51Var != null) {
            q51Var.O(false);
        }
        p31Var.b();
        p31Var2.b();
    }

    public static void d1(q31 q31Var) {
        org.telegram.ui.Components.uk0 uk0Var = q31Var.k1;
        float f7 = -org.telegram.messenger.i0.L(64.0f);
        int i10 = 0;
        while (true) {
            if (i10 >= uk0Var.getChildCount()) {
                break;
            }
            View childAt = uk0Var.getChildAt(i10);
            if (childAt.getId() == 3) {
                f7 = childAt.getY();
                break;
            }
            i10++;
        }
        q31Var.T1.setTranslationY(f7);
    }

    @Override // org.telegram.ui.Components.ha
    public final org.telegram.ui.Components.tk0 L0(org.telegram.ui.Components.uk0 uk0Var) {
        org.telegram.ui.Components.q51 q51Var = new org.telegram.ui.Components.q51(uk0Var, getContext(), this.a, 0, false, new z4(this, 23), this.I0);
        this.a2 = q51Var;
        return q51Var;
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        return org.telegram.messenger.dd.L0(2131754210, null);
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
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
        if (inputCheckPasswordSRP != null && !org.telegram.messenger.w3.T(this.P1)) {
            org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
            if (T == null) {
                return;
            }
            org.telegram.messenger.wp.r1(this.a).T(this.b2, this.P1.id, T, new a1.d(this, user, inputCheckPasswordSRP, twoStepVerificationActivity, 16), null);
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (org.telegram.messenger.w3.T(this.P1)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.P1;
            tL_inputChannel.channel_id = chat.id;
            tL_inputChannel.access_hash = chat.access_hash;
        } else {
            tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
        }
        tL_channels_editCreator.password = inputCheckPasswordSRP != null ? inputCheckPasswordSRP : new TLRPC.TL_inputCheckPasswordEmpty();
        tL_channels_editCreator.user_id = org.telegram.messenger.wp.r1(this.a).p1(user);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_editCreator, new mg.z(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 12));
    }

    public final void f1(boolean z10) {
        int i10 = org.telegram.messenger.w3.V(this.P1) ? 2131749013 : 2131749004;
        float L = org.telegram.messenger.i0.L(32.0f);
        vh.d dVar = this.Z1;
        float max = Math.max(L, ((dVar.getWidth() > 0 ? dVar.getWidth() : org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(20.0f)) - org.telegram.messenger.i0.L(16.0f)) - dVar.getTextPaint().measureText(org.telegram.messenger.dd.L0(i10, null)));
        TLObject tLObject = this.S1;
        dVar.i(org.telegram.messenger.dd.a0(null, null, i10, TextUtils.ellipsize(tLObject instanceof TLRPC.User ? org.telegram.messenger.i20.k((TLRPC.User) tLObject) : tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : "", dVar.getTextPaint(), max, TextUtils.TruncateAt.MIDDLE)), z10, true);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        try {
            super.s0();
            vh.d dVar = this.Z1;
            if (dVar != null) {
                dVar.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.r7, this.I0));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
