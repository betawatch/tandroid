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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class a21 extends org.telegram.ui.Components.na {
    public TLRPC.Chat P1;
    public final TLRPC.User Q1;
    public final bg.m0 R1;
    public TLObject S1;
    public final FrameLayout T1;
    public final s11 U1;
    public final u11 V1;
    public final z11 W1;
    public final z11 X1;
    public final z11 Y1;
    public final fi.d Z1;
    public org.telegram.ui.Components.l41 a2;
    public Context b2;

    public a21(Context context, TLRPC.Chat chat, TLRPC.User user, bg.m0 m0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(2, context, f6Var, true);
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
        int i7 = org.telegram.ui.ActionBar.k6.O5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i7, this.I0));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        frameLayout2.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, d02, N, null, f6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        int i10 = org.telegram.ui.ActionBar.k6.P5;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, f6Var, PorterDuff.Mode.SRC_IN);
        frameLayout2.addView(imageView, c8.ha.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        s11 s11Var = new s11(context);
        this.U1 = s11Var;
        org.telegram.ui.ActionBar.r6.V(s11Var, org.telegram.ui.ActionBar.k6.R5, f6Var);
        org.telegram.ui.ActionBar.r6.E(s11Var, i10, f6Var);
        s11Var.setTextSize(1, 15.0f);
        s11Var.setSingleLine(true);
        s11Var.setBackground(null);
        s11Var.setCursorWidth(1.5f);
        s11Var.setGravity(org.telegram.messenger.qs.x1);
        s11Var.setClipToPadding(true);
        s11Var.setPadding(org.telegram.messenger.g0.L(46.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        s11Var.setTranslationY(-org.telegram.messenger.g0.L(0.66f));
        s11Var.setInputType(s11Var.getInputType() | TLObject.FLAG_19);
        s11Var.setImeOptions(33554435);
        s11Var.setTextIsSelectable(false);
        s11Var.setOnEditorActionListener(new fa(this, 11));
        s11Var.addTextChangedListener(new t11(this));
        s11Var.setHint(org.telegram.messenger.hd.M0(2131745758, null));
        frameLayout2.addView(s11Var, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        frameLayout.addView(frameLayout2, c8.ha.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.b;
        int max = Math.max(0, viewGroup.indexOfChild(this.l1));
        float f10 = this.t0 / org.telegram.messenger.g0.p;
        viewGroup.addView(frameLayout, max, c8.ha.d(-1, 64.0f, 55, f10, 0.0f, f10, 0.0f));
        u11 u11Var = new u11(context);
        this.V1 = u11Var;
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        l9Var.setImageDrawable(new org.telegram.ui.Components.zg0(R.raw.utyan_empty, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
        int i11 = 17;
        u11Var.addView(l9Var, c8.ha.e(org.telegram.messenger.qs.O1, org.telegram.messenger.qs.O1, 17));
        z11 z11Var = new z11(this.a, chat.id, new TLRPC.TL_channelParticipantsAdmins());
        z11Var.e.add(new ru0(this, i11));
        this.W1 = z11Var;
        z11 z11Var2 = new z11(this.a, chat.id, new TLRPC.TL_channelParticipantsRecent());
        z11Var2.e.add(new ru0(this, i11));
        this.X1 = z11Var2;
        z11 z11Var3 = new z11(this.a, chat.id, new TLRPC.TL_channelParticipantsSearch());
        z11Var3.e.add(new ru0(this, i11));
        this.Y1 = z11Var3;
        org.telegram.ui.Components.pj0 pj0Var = this.k1;
        int i12 = this.t0;
        pj0Var.setPadding(i12, 0, i12, org.telegram.messenger.g0.L(68.0f));
        this.k1.setClipToPadding(false);
        this.k1.setOnItemClickListener(new vx0(this, 3));
        v11 v11Var = new v11(this);
        v11Var.m = false;
        v11Var.C = false;
        v11Var.o(org.telegram.ui.Components.xq.h);
        v11Var.n(350L);
        this.k1.setItemAnimator(v11Var);
        this.k1.addOnLayoutChangeListener(new w11(this));
        this.k1.j(new x11(this));
        this.b.addView(new y11(this, getContext()), c8.ha.e(-1, 68, 87));
        fi.d dVar = new fi.d(getContext(), f6Var, true);
        dVar.setRoundRadius(24);
        this.Z1 = dVar;
        dVar.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.r7, this.I0));
        f1(false);
        ViewGroup viewGroup2 = this.b;
        float f11 = (this.t0 / org.telegram.messenger.g0.p) + 10.0f;
        viewGroup2.addView(dVar, c8.ha.d(-1, 48.0f, 87, f11, 10.0f, f11, 10.0f));
        dVar.setOnClickListener(new my0(this, 5));
        org.telegram.ui.Components.l41 l41Var = this.a2;
        if (l41Var != null) {
            l41Var.O(false);
        }
        z11Var.b();
        z11Var2.b();
    }

    public static void d1(a21 a21Var) {
        org.telegram.ui.Components.pj0 pj0Var = a21Var.k1;
        float f10 = -org.telegram.messenger.g0.L(64.0f);
        int i7 = 0;
        while (true) {
            if (i7 >= pj0Var.getChildCount()) {
                break;
            }
            View childAt = pj0Var.getChildAt(i7);
            if (childAt.getId() == 3) {
                f10 = childAt.getY();
                break;
            }
            i7++;
        }
        a21Var.T1.setTranslationY(f10);
    }

    @Override // org.telegram.ui.Components.na
    public final org.telegram.ui.Components.oj0 L0(org.telegram.ui.Components.pj0 pj0Var) {
        org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(pj0Var, getContext(), this.a, 0, false, new a5(this, 24), this.I0);
        this.a2 = l41Var;
        return l41Var;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        return org.telegram.messenger.hd.M0(2131754210, null);
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
        int i7 = org.telegram.messenger.t3.V(this.P1) ? 2131749002 : 2131748993;
        float L = org.telegram.messenger.g0.L(32.0f);
        fi.d dVar = this.Z1;
        float max = Math.max(L, ((dVar.getWidth() > 0 ? dVar.getWidth() : org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(20.0f)) - org.telegram.messenger.g0.L(16.0f)) - dVar.getTextPaint().measureText(org.telegram.messenger.hd.M0(i7, null)));
        TLObject tLObject = this.S1;
        dVar.i(org.telegram.messenger.hd.a0(null, null, i7, TextUtils.ellipsize(tLObject instanceof TLRPC.User ? org.telegram.messenger.t10.k((TLRPC.User) tLObject) : tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : "", dVar.getTextPaint(), max, TextUtils.TruncateAt.MIDDLE)), z9, true);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        try {
            super.s0();
            fi.d dVar = this.Z1;
            if (dVar != null) {
                dVar.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.r7, this.I0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
