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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class c21 extends org.telegram.ui.Components.sa {
    public TLRPC.Chat T1;
    public final TLRPC.User U1;
    public final ii V1;
    public TLObject W1;
    public final FrameLayout X1;
    public final u11 Y1;
    public final w11 Z1;
    public final b21 a2;
    public final b21 b2;
    public final b21 c2;
    public final hi.e d2;
    public org.telegram.ui.Components.c51 e2;
    public Context f2;

    public c21(Context context, TLRPC.Chat chat, TLRPC.User user, ii iiVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(2, context, h6Var, true);
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        this.Q0 = true;
        this.T1 = chat;
        this.U1 = user;
        this.W1 = user;
        this.V1 = iiVar;
        org.telegram.messenger.k10.i(this.a).f();
        FrameLayout frameLayout = new FrameLayout(context);
        this.X1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(20.0f);
        int i7 = org.telegram.ui.ActionBar.m6.O5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i7, this.J0));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        frameLayout2.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(frameLayout2, d02, M, null, h6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        int i10 = org.telegram.ui.ActionBar.m6.P5;
        org.telegram.ui.ActionBar.t6.s(imageView, i10, h6Var, PorterDuff.Mode.SRC_IN);
        frameLayout2.addView(imageView, c8.ma.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        u11 u11Var = new u11(context);
        this.Y1 = u11Var;
        org.telegram.ui.ActionBar.t6.U(u11Var, org.telegram.ui.ActionBar.m6.R5, h6Var);
        org.telegram.ui.ActionBar.t6.D(u11Var, i10, h6Var);
        u11Var.setTextSize(1, 15.0f);
        u11Var.setSingleLine(true);
        u11Var.setBackground(null);
        u11Var.setCursorWidth(1.5f);
        u11Var.setGravity(org.telegram.messenger.ls.x1);
        u11Var.setClipToPadding(true);
        u11Var.setPadding(org.telegram.messenger.g0.L(46.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        u11Var.setTranslationY(-org.telegram.messenger.g0.L(0.66f));
        u11Var.setInputType(u11Var.getInputType() | TLObject.FLAG_19);
        u11Var.setImeOptions(33554435);
        u11Var.setTextIsSelectable(false);
        u11Var.setOnEditorActionListener(new fa(this, 11));
        u11Var.addTextChangedListener(new v11(this));
        u11Var.setHint(org.telegram.messenger.hd.N0(2131745561, null));
        frameLayout2.addView(u11Var, c8.ma.e(-1, -1, org.telegram.messenger.ls.E1));
        frameLayout.addView(frameLayout2, c8.ma.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.b;
        int max = Math.max(0, viewGroup.indexOfChild(this.p1));
        float f10 = this.u0 / org.telegram.messenger.g0.p;
        viewGroup.addView(frameLayout, max, c8.ma.d(-1, 64.0f, 55, f10, 0.0f, f10, 0.0f));
        w11 w11Var = new w11(context);
        this.Z1 = w11Var;
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        q9Var.setImageDrawable(new org.telegram.ui.Components.oh0(R.raw.utyan_empty, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
        int i11 = 17;
        w11Var.addView(q9Var, c8.ma.e(org.telegram.messenger.ls.O1, org.telegram.messenger.ls.O1, 17));
        b21 b21Var = new b21(this.a, chat.id, new TLRPC.TL_channelParticipantsAdmins());
        b21Var.e.add(new ru0(this, i11));
        this.a2 = b21Var;
        b21 b21Var2 = new b21(this.a, chat.id, new TLRPC.TL_channelParticipantsRecent());
        b21Var2.e.add(new ru0(this, i11));
        this.b2 = b21Var2;
        b21 b21Var3 = new b21(this.a, chat.id, new TLRPC.TL_channelParticipantsSearch());
        b21Var3.e.add(new ru0(this, i11));
        this.c2 = b21Var3;
        org.telegram.ui.Components.ek0 ek0Var = this.o1;
        int i12 = this.u0;
        ek0Var.setPadding(i12, 0, i12, org.telegram.messenger.g0.L(68.0f));
        this.o1.setClipToPadding(false);
        this.o1.setOnItemClickListener(new zx0(this, 3));
        x11 x11Var = new x11(this);
        x11Var.m = false;
        x11Var.C = false;
        x11Var.o(org.telegram.ui.Components.nr.h);
        x11Var.n(350L);
        this.o1.setItemAnimator(x11Var);
        this.o1.addOnLayoutChangeListener(new y11(this));
        this.o1.j(new z11(this));
        this.b.addView(new a21(this, getContext()), c8.ma.e(-1, 68, 87));
        hi.e eVar = new hi.e(getContext(), h6Var, true);
        eVar.setRoundRadius(24);
        this.d2 = eVar;
        eVar.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.r7, this.J0));
        g1(false);
        ViewGroup viewGroup2 = this.b;
        float f11 = (this.u0 / org.telegram.messenger.g0.p) + 10.0f;
        viewGroup2.addView(eVar, c8.ma.d(-1, 48.0f, 87, f11, 10.0f, f11, 10.0f));
        eVar.setOnClickListener(new oy0(this, 5));
        org.telegram.ui.Components.c51 c51Var = this.e2;
        if (c51Var != null) {
            c51Var.O(false);
        }
        b21Var.b();
        b21Var2.b();
    }

    public static void e1(c21 c21Var) {
        org.telegram.ui.Components.ek0 ek0Var = c21Var.o1;
        float f10 = -org.telegram.messenger.g0.L(64.0f);
        int i7 = 0;
        while (true) {
            if (i7 >= ek0Var.getChildCount()) {
                break;
            }
            View childAt = ek0Var.getChildAt(i7);
            if (childAt.getId() == 3) {
                f10 = childAt.getY();
                break;
            }
            i7++;
        }
        c21Var.X1.setTranslationY(f10);
    }

    @Override // org.telegram.ui.Components.sa
    public final org.telegram.ui.Components.dk0 M0(org.telegram.ui.Components.ek0 ek0Var) {
        org.telegram.ui.Components.c51 c51Var = new org.telegram.ui.Components.c51(ek0Var, getContext(), this.a, 0, false, new a5(this, 24), this.J0);
        this.e2 = c51Var;
        return c51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return org.telegram.messenger.hd.N0(2131754207, null);
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        super.dismiss();
        this.a2.a();
        this.b2.a();
        this.c2.a();
    }

    public final void f1(TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (getContext() != null) {
            this.f2 = getContext();
        }
        if (this.f2 == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !org.telegram.messenger.v3.T(this.T1)) {
            org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
            if (T == null) {
                return;
            }
            org.telegram.messenger.np.u1(this.a).T(this.f2, this.T1.id, T, new a1.d(this, user, inputCheckPasswordSRP, twoStepVerificationActivity, 20), null);
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (org.telegram.messenger.v3.T(this.T1)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.T1;
            tL_inputChannel.channel_id = chat.id;
            tL_inputChannel.access_hash = chat.access_hash;
        } else {
            tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
        }
        tL_channels_editCreator.password = inputCheckPasswordSRP != null ? inputCheckPasswordSRP : new TLRPC.TL_inputCheckPasswordEmpty();
        tL_channels_editCreator.user_id = org.telegram.messenger.np.u1(this.a).s1(user);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_editCreator, new di.m7(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 12));
    }

    public final void g1(boolean z10) {
        int i7 = org.telegram.messenger.v3.V(this.T1) ? 2131748810 : 2131748801;
        float L = org.telegram.messenger.g0.L(32.0f);
        hi.e eVar = this.d2;
        float max = Math.max(L, ((eVar.getWidth() > 0 ? eVar.getWidth() : org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(20.0f)) - org.telegram.messenger.g0.L(16.0f)) - eVar.getTextPaint().measureText(org.telegram.messenger.hd.N0(i7, null)));
        TLObject tLObject = this.W1;
        eVar.i(org.telegram.messenger.hd.a0(null, null, i7, TextUtils.ellipsize(tLObject instanceof TLRPC.User ? org.telegram.messenger.p10.l((TLRPC.User) tLObject) : tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : "", eVar.getTextPaint(), max, TextUtils.TruncateAt.MIDDLE)), z10, true);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        try {
            super.s0();
            hi.e eVar = this.d2;
            if (eVar != null) {
                eVar.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.r7, this.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
