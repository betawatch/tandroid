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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class b21 extends org.telegram.ui.Components.sa {
    public TLRPC.Chat T1;
    public final TLRPC.User U1;
    public final ii V1;
    public TLObject W1;
    public final FrameLayout X1;
    public final t11 Y1;
    public final v11 Z1;
    public final a21 a2;
    public final a21 b2;
    public final a21 c2;
    public final hi.d d2;
    public org.telegram.ui.Components.z41 e2;
    public Context f2;

    public b21(Context context, TLRPC.Chat chat, TLRPC.User user, ii iiVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(2, context, i6Var, true);
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        this.Q0 = true;
        this.T1 = chat;
        this.U1 = user;
        this.W1 = user;
        this.V1 = iiVar;
        org.telegram.messenger.j10.i(this.a).f();
        FrameLayout frameLayout = new FrameLayout(context);
        this.X1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(20.0f);
        int i7 = org.telegram.ui.ActionBar.n6.O5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i7, this.J0));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        frameLayout2.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(frameLayout2, d02, M, null, i6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        int i10 = org.telegram.ui.ActionBar.n6.P5;
        org.telegram.ui.ActionBar.u6.s(imageView, i10, i6Var, PorterDuff.Mode.SRC_IN);
        frameLayout2.addView(imageView, c8.ma.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        t11 t11Var = new t11(context);
        this.Y1 = t11Var;
        org.telegram.ui.ActionBar.u6.U(t11Var, org.telegram.ui.ActionBar.n6.R5, i6Var);
        org.telegram.ui.ActionBar.u6.D(t11Var, i10, i6Var);
        t11Var.setTextSize(1, 15.0f);
        t11Var.setSingleLine(true);
        t11Var.setBackground(null);
        t11Var.setCursorWidth(1.5f);
        t11Var.setGravity(org.telegram.messenger.ks.x1);
        t11Var.setClipToPadding(true);
        t11Var.setPadding(org.telegram.messenger.g0.L(46.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        t11Var.setTranslationY(-org.telegram.messenger.g0.L(0.66f));
        t11Var.setInputType(t11Var.getInputType() | TLObject.FLAG_19);
        t11Var.setImeOptions(33554435);
        t11Var.setTextIsSelectable(false);
        t11Var.setOnEditorActionListener(new fa(this, 11));
        t11Var.addTextChangedListener(new u11(this));
        t11Var.setHint(org.telegram.messenger.gd.M0(2131745562, null));
        frameLayout2.addView(t11Var, c8.ma.e(-1, -1, org.telegram.messenger.ks.E1));
        frameLayout.addView(frameLayout2, c8.ma.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.b;
        int max = Math.max(0, viewGroup.indexOfChild(this.p1));
        float f10 = this.u0 / org.telegram.messenger.g0.p;
        viewGroup.addView(frameLayout, max, c8.ma.d(-1, 64.0f, 55, f10, 0.0f, f10, 0.0f));
        v11 v11Var = new v11(context);
        this.Z1 = v11Var;
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        q9Var.setImageDrawable(new org.telegram.ui.Components.mh0(R.raw.utyan_empty, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
        int i11 = 17;
        v11Var.addView(q9Var, c8.ma.e(org.telegram.messenger.ks.O1, org.telegram.messenger.ks.O1, 17));
        a21 a21Var = new a21(this.a, chat.id, new TLRPC.TL_channelParticipantsAdmins());
        a21Var.e.add(new ru0(this, i11));
        this.a2 = a21Var;
        a21 a21Var2 = new a21(this.a, chat.id, new TLRPC.TL_channelParticipantsRecent());
        a21Var2.e.add(new ru0(this, i11));
        this.b2 = a21Var2;
        a21 a21Var3 = new a21(this.a, chat.id, new TLRPC.TL_channelParticipantsSearch());
        a21Var3.e.add(new ru0(this, i11));
        this.c2 = a21Var3;
        org.telegram.ui.Components.ck0 ck0Var = this.o1;
        int i12 = this.u0;
        ck0Var.setPadding(i12, 0, i12, org.telegram.messenger.g0.L(68.0f));
        this.o1.setClipToPadding(false);
        this.o1.setOnItemClickListener(new zx0(this, 3));
        w11 w11Var = new w11(this);
        w11Var.m = false;
        w11Var.C = false;
        w11Var.o(org.telegram.ui.Components.lr.h);
        w11Var.n(350L);
        this.o1.setItemAnimator(w11Var);
        this.o1.addOnLayoutChangeListener(new x11(this));
        this.o1.j(new y11(this));
        this.b.addView(new z11(this, getContext()), c8.ma.e(-1, 68, 87));
        hi.d dVar = new hi.d(getContext(), i6Var, true);
        dVar.setRoundRadius(24);
        this.d2 = dVar;
        dVar.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.r7, this.J0));
        g1(false);
        ViewGroup viewGroup2 = this.b;
        float f11 = (this.u0 / org.telegram.messenger.g0.p) + 10.0f;
        viewGroup2.addView(dVar, c8.ma.d(-1, 48.0f, 87, f11, 10.0f, f11, 10.0f));
        dVar.setOnClickListener(new oy0(this, 5));
        org.telegram.ui.Components.z41 z41Var = this.e2;
        if (z41Var != null) {
            z41Var.O(false);
        }
        a21Var.b();
        a21Var2.b();
    }

    public static void e1(b21 b21Var) {
        org.telegram.ui.Components.ck0 ck0Var = b21Var.o1;
        float f10 = -org.telegram.messenger.g0.L(64.0f);
        int i7 = 0;
        while (true) {
            if (i7 >= ck0Var.getChildCount()) {
                break;
            }
            View childAt = ck0Var.getChildAt(i7);
            if (childAt.getId() == 3) {
                f10 = childAt.getY();
                break;
            }
            i7++;
        }
        b21Var.X1.setTranslationY(f10);
    }

    @Override // org.telegram.ui.Components.sa
    public final org.telegram.ui.Components.bk0 M0(org.telegram.ui.Components.ck0 ck0Var) {
        org.telegram.ui.Components.z41 z41Var = new org.telegram.ui.Components.z41(ck0Var, getContext(), this.a, 0, false, new a5(this, 24), this.J0);
        this.e2 = z41Var;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return org.telegram.messenger.gd.M0(2131754208, null);
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
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
            org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
            if (T == null) {
                return;
            }
            org.telegram.messenger.mp.u1(this.a).T(this.f2, this.T1.id, T, new a1.d(this, user, inputCheckPasswordSRP, twoStepVerificationActivity, 20), null);
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
        tL_channels_editCreator.user_id = org.telegram.messenger.mp.u1(this.a).s1(user);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_editCreator, new di.m7(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 12));
    }

    public final void g1(boolean z10) {
        int i7 = org.telegram.messenger.v3.V(this.T1) ? 2131748811 : 2131748802;
        float L = org.telegram.messenger.g0.L(32.0f);
        hi.d dVar = this.d2;
        float max = Math.max(L, ((dVar.getWidth() > 0 ? dVar.getWidth() : org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(20.0f)) - org.telegram.messenger.g0.L(16.0f)) - dVar.getTextPaint().measureText(org.telegram.messenger.gd.M0(i7, null)));
        TLObject tLObject = this.W1;
        dVar.i(org.telegram.messenger.gd.a0(null, null, i7, TextUtils.ellipsize(tLObject instanceof TLRPC.User ? org.telegram.messenger.o10.l((TLRPC.User) tLObject) : tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : "", dVar.getTextPaint(), max, TextUtils.TruncateAt.MIDDLE)), z10, true);
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void s0() {
        try {
            super.s0();
            hi.d dVar = this.d2;
            if (dVar != null) {
                dVar.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.r7, this.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
